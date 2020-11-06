package com.example.collections

fun main(){

    val k1 = Kisiler(1,"Zeynep")
    val k2 = Kisiler(2,"Beyda")
    val k3 = Kisiler(3,"Nurdan")

    val kisilerArrayList = ArrayList<Kisiler>()

    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    for(k in kisilerArrayList){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("sayısal küçükten büyüğe")

    val siralamaArrayList1 = kisilerArrayList.sortedWith(compareBy{it.kisiNo})
    for(k in siralamaArrayList1){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("***********")

    val siralamaArrayList2 = kisilerArrayList.sortedWith(compareByDescending { it.kisiNo })
    for(k in siralamaArrayList2){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("harfsel büyükten küçüğe sıralama")

    val siralamaArrayList3 = kisilerArrayList.sortedWith(compareByDescending { it.kisiAd })
    for(k in siralamaArrayList3){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

}