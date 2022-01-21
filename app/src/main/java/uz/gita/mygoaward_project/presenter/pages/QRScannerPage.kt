package uz.gita.mygoaward_project.presenter.pages

import android.Manifest
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.budiyev.android.codescanner.AutoFocusMode
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.DecodeCallback
import com.budiyev.android.codescanner.ErrorCallback
import com.budiyev.android.codescanner.ScanMode
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.mygoaward_project.R
import uz.gita.mygoaward_project.databinding.PageQrScannerBinding
import uz.gita.mygoaward_project.utils.checkPermissions

@AndroidEntryPoint
class QRScannerPage : Fragment(R.layout.page_qr_scanner) {
    private val bind by viewBinding(PageQrScannerBinding::bind)
    private lateinit var codeScanner: CodeScanner

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().checkPermissions(
            arrayOf(
                Manifest.permission.CAMERA,
            )
        ) {
            startScann()
        }
    }

    private fun startScann() {
        codeScanner = CodeScanner(requireContext(), bind.codeScannerView)
        codeScanner.formats = CodeScanner.ALL_FORMATS
        codeScanner.camera = CodeScanner.CAMERA_BACK
        codeScanner.autoFocusMode = AutoFocusMode.SAFE
        codeScanner.scanMode = ScanMode.SINGLE
        codeScanner.isAutoFocusEnabled = true
        codeScanner.isFlashEnabled = true
        val code: String? = null
        codeScanner.decodeCallback = DecodeCallback {
            requireActivity().runOnUiThread {
                Toast.makeText(requireContext(), it.text, Toast.LENGTH_LONG).show()
            }
        }
        codeScanner.errorCallback = ErrorCallback {
            requireActivity().runOnUiThread {
                Toast.makeText(requireContext(), "Camera intit error $it", Toast.LENGTH_LONG).show()
            }
        }
        bind.codeScannerView.setOnClickListener {
            codeScanner.startPreview()
        }
    }

    override fun onResume() {
        super.onResume()
        if (::codeScanner.isInitialized) {
            codeScanner.startPreview()
        }
    }

    override fun onPause() {
        super.onPause()
        if (::codeScanner.isInitialized) {
            codeScanner.releaseResources()
        }
    }
}