package ru.maksonic.bottomnavigationexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.maksonic.bottomnavigationexample.databinding.FragmentSettingsBinding

/**
 * @Author maksonic on 25.12.2022
 */
class SettingsFragment : BaseFragment<FragmentSettingsBinding>() {
    override val inflateLayout: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSettingsBinding
        get() = FragmentSettingsBinding::inflate

    override fun screenCreated(savedInstanceState: Bundle?) {
        binding.btnBack.setOnClickListener { backToFirstFragment() }
    }

    private fun backToFirstFragment() {
        val action = R.id.action_settingsFragment_to_startFragment
        findNavController().navigate(action)

    }
}