package com.example.collections

fun main(){

    val meyveler = setOf<String>("Çilek","Muz","Kivi","Armut","Karpuz")

    val iller = mutableSetOf<String>("İstanbul","Tekirdağ","İzmir")

    val sayilar = HashSet<Int>()
    sayilar.add(1)
    sayilar.add(3)
    sayilar.add(5)
    sayilar.add(7)

    println(sayilar.toString())

    println(sayilar.elementAt(2))
    println(sayilar.size)
    println(sayilar.count())
    println(sayilar.isEmpty())
    println(sayilar.contains(25))

    for( (i,s) in sayilar.withIndex()){
        println("$i. -> $s")
    }



}