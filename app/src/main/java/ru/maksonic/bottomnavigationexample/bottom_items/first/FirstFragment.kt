package ru.maksonic.bottomnavigationexample.bottom_items.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import ru.maksonic.bottomnavigationexample.BaseFragment
import ru.maksonic.bottomnavigationexample.R
import ru.maksonic.bottomnavigationexample.databinding.FragmentFirstBinding

/**
 * @Author maksonic on 25.12.2022
 */
class FirstFragment : BaseFragment<FragmentFirstBinding>() {
    override val inflateLayout: (LayoutInflater, ViewGroup?, Boolean) -> FragmentFirstBinding
        get() = FragmentFirstBinding::inflate

    override fun screenCreated(savedInstanceState: Bundle?) {
        binding.btnInner.setOnClickListener { navigateToInner() }
    }

    private fun navigateToInner() {
        val action = R.id.action_firstFragment_to_firstInnerFragment
        findNavController().navigate(action)
    }
}