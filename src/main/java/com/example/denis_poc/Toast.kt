package com.example.denis_poc

import android.content.Context
import android.widget.Toast

class Toast {
    fun testeToast(context: Context){
        Toast.makeText(context, "testes banana", Toast.LENGTH_LONG).show()
    }
}