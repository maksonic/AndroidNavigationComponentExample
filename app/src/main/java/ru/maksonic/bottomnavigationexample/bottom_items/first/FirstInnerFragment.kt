package ru.maksonic.bottomnavigationexample.bottom_items.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import ru.maksonic.bottomnavigationexample.BaseFragment
import ru.maksonic.bottomnavigationexample.MainActivity
import ru.maksonic.bottomnavigationexample.R
import ru.maksonic.bottomnavigationexample.databinding.FragmentFirstBinding
import ru.maksonic.bottomnavigationexample.databinding.FragmentInnerFirstBinding

/**
 * @Author maksonic on 25.12.2022
 */
class FirstInnerFragment: BaseFragment<FragmentInnerFirstBinding>() {
    override val inflateLayout: (LayoutInflater, ViewGroup?, Boolean) -> FragmentInnerFirstBinding
        get() = FragmentInnerFirstBinding::inflate

    private var _navController: NavController? = null
    private val navController: NavController
        get() = requireNotNull(_navController)

    override fun screenCreated(savedInstanceState: Bundle?) {
        binding.btnBack.setOnClickListener { navigateBack() }
        binding.btnBackToStart.setOnClickListener { navigateToStart() }
    }

    private fun navigateToStart() {
        val action = R.id.action_mainFragment_to_startFragment
        _navController = Navigation.findNavController(requireActivity(), R.id.globalNavContainer)
        navController.navigate(action)
    }

    private fun navigateBack() {
        findNavController().popBackStack()
    }
}