package ru.maksonic.bottomnavigationexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import ru.maksonic.bottomnavigationexample.databinding.FragmentMainBinding

/**
 * @Author maksonic on 25.12.2022
 */
class MainFragment : BaseFragment<FragmentMainBinding>() {
    override val inflateLayout: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMainBinding
        get() = FragmentMainBinding::inflate


    private var _navController: NavController? = null
    private val navController: NavController
        get() = requireNotNull(_navController)

    override fun screenCreated(savedInstanceState: Bundle?) {
        initNavController()
        initBottomNavigation()
        initToolbar()
    }

    private fun initNavController() {
        val host =
            childFragmentManager.findFragmentById(R.id.mainGraphContainer) as NavHostFragment
        _navController = host.navController
    }

    private fun initBottomNavigation() {
        NavigationUI.setupWithNavController(binding.bottomNavBar, navController)
    }

    private fun initToolbar() {
        binding.mainToolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
        binding.mainToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.settings -> {
                    findNavController().navigate(R.id.action_mainFragment_to_settingsFragment)
                    true
                }
                else -> false
            }
        }
    }
}