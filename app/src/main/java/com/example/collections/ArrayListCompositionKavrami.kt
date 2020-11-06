package com.example.collections

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val scan = Scanner(System.`in`)
    val personelKaydi = ArrayList<Personel>()

    while(true){

        println("Personelin adını girin")
        val ad = scan.next()
        println("Personelin soyadını girin")
        val soyad = scan.next()
        println("Personelin hangi ilde yaşadığını girin")
        val il = scan.next()
        println("Personelin hangi ilçede yaşadığını girin")
        val ilce = scan.next()

        val adres = Adres(il, ilce)
        val personel = Personel(ad,soyad,adres)
        personelKaydi.add(personel)

        println("Çıkış yapmak için (1) - Devam etmek için diğer sayılar")
        val cikis = scan.nextInt()
        if(cikis == 1){
            for(p in personelKaydi){

                println("Personelin adı: ${p.ad}")
                println("Personelin soyadı: ${p.soyad}")
                println("Personelin adresi: ${p.adres.il},${p.adres.ilce}")

            }
            println("Çıkış yapıldı")
            break
        }
    }




}