package ru.maksonic.bottomnavigationexample.bottom_items

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import ru.maksonic.bottomnavigationexample.BaseFragment
import ru.maksonic.bottomnavigationexample.databinding.FragmentSecondBinding

/**
 * @Author maksonic on 25.12.2022
 */
class SecondFragment : BaseFragment<FragmentSecondBinding>() {
    override val inflateLayout: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSecondBinding
        get() = FragmentSecondBinding::inflate

    override fun screenCreated(savedInstanceState: Bundle?) {
    }
}