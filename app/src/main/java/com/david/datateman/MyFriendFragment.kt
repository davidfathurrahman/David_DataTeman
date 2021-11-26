package com.david.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendFragment : Fragment() {
    lateinit var listTeman: ArrayList<MyFriends>

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(
            MyFriends(
                "David Fathurrahman", "Laki Laki", "david@stimata,ac.id",
                "085816943202", "Yogyakarta"
            )
        )
        listTeman.add(
            MyFriends(
            "Dina Nuraska", "Perempuan", "dina@stimata.ac.id",
            "0828384627879", "Madiun"
        ))
        listTeman.add(
            MyFriends(
            "Egif", "Perempuan", "egif@stimta.ac.id",
            "0812345678", "Blitar"
        ))
        listTeman.add(
            MyFriends(
            "Malinda", "Perempuan", "malinda@stimta.ac.id",
            "0812345678", "Lamongan"
        ))
        listTeman.add(
            MyFriends(
            "Rosid", "Laki Laki", "rosid@stimata.ac.id",
            "08112345678", "Madiun"
        ))
        listTeman.add(
            MyFriends(
                "Sista", "Perempuan", "sista@stimata.ac.id",
                "0831234455678","Malang"
            )
        )
        listTeman.add(
            MyFriends(
                "Dewngga", "Laki Laki", "dewangga@stmata.ac.id",
                "083456789023", "Malang"
            )
        )

    }

    private fun tampiTeman() {
        rv_listMyfriends.layoutManager = LinearLayoutManager(activity)
        rv_listMyfriends.adapter = MyFriendsAdapter(requireActivity(), listTeman)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView() {
        simulasiDataTeman()
        tampiTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}