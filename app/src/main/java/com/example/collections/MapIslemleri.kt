package com.example.collections

fun main(){

    val sayilar = mapOf(1 to "bir",2 to "iki")

    val oranlar = mutableMapOf<Double,String>(1.5 to "oran1",3.4 to "oran2")

    val iller = HashMap<Int,String>()

    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    iller.put(59,"Tekirdağ")
    iller.put(35,"İzmir")
    iller.put(14,"Bolu")

    println(iller.toString())

    println(iller.get(34))
    println(iller.size)
    println(iller.containsKey(16))
    println(iller.containsValue("istanbul"))

    for((anahtar,deger) in iller){

        println("$anahtar : $deger")
    }




}