package uz.gita.mygoaward_project.presenter.pages

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.mygoaward_project.R
import uz.gita.mygoaward_project.databinding.PageDownloadsBinding
import uz.gita.mygoaward_project.databinding.PageFavouritesBinding

@AndroidEntryPoint
class FavouritePage : Fragment(R.layout.page_favourites) {
    private val bind by viewBinding(PageFavouritesBinding::bind)
}