package com.example.kadesubmission2.screen.prevmatch

import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.kadesubmission2.Load
import com.example.kadesubmission2.MatchService
import com.example.kadesubmission2.NavigatorViewModel
import com.example.kadesubmission2.model.*

import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.security.acl.LastOwnerException

class PrevMatchViewModel : NavigatorViewModel(){


    private val service = MatchService.create()

    private val _prevMatchLoad = MutableLiveData<Load<ResponseLastModel>> ()
    val prevMatchLoad = _prevMatchLoad as LiveData<Load<ResponseLastModel>>

    init {
        _prevMatchLoad.value = Load.Uninitialized
    }

    fun getPrevMatch(id :Int) = viewModelScope.launch {
        _prevMatchLoad.value = Load.Loading
        try {
            val response = service.getNext(id)
            _prevMatchLoad.value = Load.Success(response)
        }catch (e : HttpException) {
            _prevMatchLoad.value = Load.Fail(e)
        }
    }

}