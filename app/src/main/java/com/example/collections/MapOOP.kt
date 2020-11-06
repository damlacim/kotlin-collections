package com.example.collections

fun main(){
    val o1 = Ogrenci(1,"ahmet","11F")
    val o2 = Ogrenci(2,"çağla","11A")
    val o3 = Ogrenci(3,"efe","9A")

    val ogrenciler = HashMap<Int,Ogrenci>()
    ogrenciler.put(o1.no,o1)
    ogrenciler.put(o2.no,o2)
    ogrenciler.put(o3.no,o3)

    for( (ogrenciNo,nesne) in ogrenciler){
        println("*********")
        println("öğrenci no: ${ogrenciNo}")
        println("öğrenci ad: ${nesne.ad}")
        println("öğrenci sınıf: ${nesne.sinif}")
    }




}