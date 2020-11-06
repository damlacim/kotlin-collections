package com.example.collections

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    println("*** Öğrenci Karnesi ***")
    val scan = Scanner(System.`in`)
    val dersNotlari = ArrayList<DersNotlar>()


    while(true){

        println("Dersin adını giriniz")
        val ders = scan.next()
        println("Dersin notunu giriniz")
        val not = scan.nextInt()

        val yeniNot = DersNotlar(ders,not)
        dersNotlari.add(yeniNot)


        println("Sistemden çıkmak için (1) - Devam etmek için başka bir sayı giriniz.")
        val cikis = scan.nextInt()

        if(cikis == 1){

            println("**********")
            var toplam = 0

            for(dn in dersNotlari){

                println("${dn.ders} : ${dn.not}")
                toplam = toplam + dn.not
            }
            val ortalama = toplam / dersNotlari.size
            println("Ortalama: $ortalama")
            if(ortalama>=50){
                println("Öğrenci sınıfı geçmiştir.")
            }
            else{
                println("Öğrenci sınıfta kalmıştır.")
            }
            println("Çıkış yapıldı.")
            break

        }
    }
}