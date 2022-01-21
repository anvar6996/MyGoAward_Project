package uz.gita.mygoaward_project.presenter.pages

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.mygoaward_project.R
import uz.gita.mygoaward_project.databinding.PageProfileBinding

@AndroidEntryPoint
class ProfilePage : Fragment(R.layout.page_profile) {
    private val bind by viewBinding(PageProfileBinding::bind)
}