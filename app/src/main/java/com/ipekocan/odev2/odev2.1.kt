package com.ipekocan.odev2

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    // 5 isim içeren bir arraylist

    val isimler = ArrayList<String>()

    isimler.add("ipek")
    isimler.add("irem")
    isimler.add("fatma")
    isimler.add("ayşe")
    isimler.add("ada")

    //Kullanıcıdan aralara virgül koyarak 3 isim girilmesini iste

    println("Aralarında virgül koyarak 3 isim giriniz : ")

    val isimler1 = girdi.next()

    val names = isimler1.split(",").map {it.trim()
    }
    names.toList()
// Boş olup olmadığını kontrol et
    if(names.isEmpty()){
        println("Hatalı giriş")
    }
    else {
        isimler.addAll(names)
        println("Son İsim Listesi : $isimler")
    }







}