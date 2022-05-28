package com.ktl1.viewmodelapplication

import androidx.lifecycle.ViewModel

class ViewModelMainActivity : ViewModel(){
     var count = 0

    fun increment() : Int{
        return count++
    }
}