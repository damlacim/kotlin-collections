package com.example.collections

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val girdi = Scanner(System.`in`)
    val isimler = ArrayList<String>()

    isimler.add("ahmet")
    isimler.add("mehmet")
    isimler.add("zeynep")
    isimler.add("çağla")
    isimler.add("beyda")
    isimler.add("nurdan")
    isimler.add("buse")
    isimler.add("yaren")

    println("aratmak için isim giriniz:")
    val isim = girdi.next()

    for(i in isimler){
        if(i == isim){
            println("isim listede var")
            break
        }

    }



}