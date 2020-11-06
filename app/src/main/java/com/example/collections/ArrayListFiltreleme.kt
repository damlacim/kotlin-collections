package com.example.collections

fun main(){

    val o1 = Ogrenci(1,"Çağla","11D")
    val o2 = Ogrenci(2,"Yaren","11B")
    val o3 = Ogrenci(3,"Buse","11C")

    val ogrenciler = ArrayList<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)

    val sonucListe = ogrenciler.filter { (it.ad).contains("a") }

    for(o in sonucListe){
        println("************")
        println("Öğrenci no: ${o.no}")
        println("Öğrenci adı: ${o.ad}")
        println("Öğrecinin sınıfı: ${o.sinif}")
    }




}