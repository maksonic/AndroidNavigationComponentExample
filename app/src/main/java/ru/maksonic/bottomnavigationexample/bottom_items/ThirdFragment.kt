package ru.maksonic.bottomnavigationexample.bottom_items

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import ru.maksonic.bottomnavigationexample.BaseFragment
import ru.maksonic.bottomnavigationexample.databinding.FragmentThirdBinding

/**
 * @Author maksonic on 25.12.2022
 */
class ThirdFragment : BaseFragment<FragmentThirdBinding>() {
    override val inflateLayout: (LayoutInflater, ViewGroup?, Boolean) -> FragmentThirdBinding
        get() = FragmentThirdBinding::inflate

    override fun screenCreated(savedInstanceState: Bundle?) {
    }
}