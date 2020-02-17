package com.example.kadesubmission2.screen.prevmatch


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kadesubmission2.Load
import com.example.kadesubmission2.R

import com.example.kadesubmission2.adapter.PrevMatchAdapter
import com.example.kadesubmission2.model.RequestLastModel
import kotlinx.android.synthetic.main.fragment_prev_match.*


class PrevMatch : Fragment() {

    private val viewModel: PrevMatchViewModel by lazy {
        ViewModelProviders.of(this).get(PrevMatchViewModel::class.java)

    }

    companion object {
        fun newInstance(): PrevMatch {
            val fragment = PrevMatch()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(com.example.kadesubmission2.R.layout.fragment_prev_match,
            container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val id = resources.getString(R.string.idd)

        viewModel.getPrevMatch(4328)


        viewModel.prevMatchLoad.observe(this, Observer {
            if (it is Load.Success) {
                rv_prevMatch.apply {
                    adapter = PrevMatchAdapter(context, it.data.item)
                    layoutManager = LinearLayoutManager(context)
                }
            }
        })
//        for (i in id.indices)
//            itemsId.add(ItemId(id[i]))


//        val intent = Intent(context, PrevMatchViewModel::class.java)
//        intent.putExtra("id", itemsId)
//        startActivity(intent)
//
//        val bundle = Bundle()
//        bundle.putString("id", id.toString())
//        val fragobj = PrevMatchViewModel()
//        fragobj.id(bundle)
        


    }


}
