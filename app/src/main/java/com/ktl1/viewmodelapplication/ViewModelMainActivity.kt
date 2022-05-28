package com.ktl1.viewmodelapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelMainActivity : ViewModel(){
    /*    var count : Int = 0
*/
//     var count = 0
//
//    fun increment() : Int{
//        return count++
//    }

    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }
    fun increment(){
        count.value = (count.value)?.plus(1)
    }
}