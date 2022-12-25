package ru.maksonic.bottomnavigationexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.maksonic.bottomnavigationexample.databinding.FragmentStartBinding

/**
 * @Author maksonic on 25.12.2022
 */
class StartFragment : BaseFragment<FragmentStartBinding>() {
    override val inflateLayout: (LayoutInflater, ViewGroup?, Boolean) -> FragmentStartBinding
        get() = FragmentStartBinding::inflate

    override fun screenCreated(savedInstanceState: Bundle?) {
        binding.btnNext.setOnClickListener { navigateToBottomNavScreen() }
    }

    private fun navigateToBottomNavScreen() {
        val action = R.id.action_startFragment_to_mainFragment
        findNavController().navigate(action)
    }
}