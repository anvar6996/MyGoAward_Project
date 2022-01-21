package uz.gita.mygoaward_project.presenter.pages

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.mygoaward_project.R
import uz.gita.mygoaward_project.databinding.PageDownloadsBinding

@AndroidEntryPoint
class DownloadPage : Fragment(R.layout.page_downloads) {
    private val bind by viewBinding(PageDownloadsBinding::bind)
}