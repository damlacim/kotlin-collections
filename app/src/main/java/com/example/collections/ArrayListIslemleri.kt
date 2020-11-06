package com.example.collections

fun main(){

    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler.isEmpty()) //false

    println(meyveler.count()) //count ve size aynı işlemi yapar
    println(meyveler.size)


    println(meyveler.first()) //ilk elemanı yazdırır
    println(meyveler.last())//son elemanı yazdırır

    println(meyveler.contains("Vişne"))

    println(meyveler.max())
    println(meyveler.min())

    meyveler.sort()
    println(meyveler.toString())

    meyveler.reverse()
    println(meyveler.toString())

    meyveler.removeAt(3) //silme işlemi yapar
    println(meyveler.toString())

    meyveler.clear() //bütün array listi siler
    println(meyveler.toString())





}