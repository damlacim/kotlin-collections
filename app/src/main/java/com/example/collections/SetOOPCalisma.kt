package com.example.collections

fun main(){

val o1 = Ogrenci(1,"damla","12A")
    val o2 = Ogrenci(2,"çağla","11B")
    val o3 = Ogrenci(3,"yaren","10C")
    val o4 = Ogrenci(1,"ece","12E")

    val ogrenciler = HashSet<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)

    for(o in ogrenciler){
        println("********")

        println("öğrencinin numarası: ${o.no}")
        println("öğrencinin adı: ${o.ad}")
        println("öğrencinin sınıfı: ${o.sinif}")


    }

}