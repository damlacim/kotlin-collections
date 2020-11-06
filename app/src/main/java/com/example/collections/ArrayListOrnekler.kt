package com.example.collections

//şimdi burada yarınlar yokmuşcasına arraylist tanımlamayı öğreniyoruz
//çünkü neden olmasın

fun main(){
    val liste = ArrayList<String>()

    val liste2 : ArrayList<Int> = ArrayList<Int>()

    val meyveler = ArrayList<String>()

    meyveler.add("Muz")
    meyveler.add("Çilek")
    meyveler.add("Kivi")
    meyveler.add("Ananas")
    meyveler.add("Üzüm")

    println(meyveler.toString())

    val str = meyveler.get(2) //2. indeksteki meyveyi yazdırdı
    println(str)

    val str1 = meyveler[4] //4. indeksteki meyve
    println(str1)

    //Kivinin yerine mandalina yazmak istiyorum...
    meyveler[2] = "Mandalina"
    println(meyveler.toString())

    meyveler.add(3,"Greyfurt")
    println(meyveler.toString())

}