package uz.gita.mygoaward_project.presenter.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.gita.mygoaward_project.presenter.pages.*

class MainPageAdapters(
    fm: FragmentManager, lifecycle: Lifecycle,
) : FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                val mainPage = MainPage()
                mainPage
            }
            1 -> {
                val favouritePage = FavouritePage()
                favouritePage
            }
            2 -> {
                val qrPage = QRScannerPage()
                qrPage
            }
            3 -> {
                val historyPage = DownloadPage()
                historyPage
            }
            else -> {
                val profilePage = ProfilePage()
                profilePage
            }
        }
    }

}