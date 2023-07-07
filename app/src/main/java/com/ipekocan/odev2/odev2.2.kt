package com.ipekocan.odev2

import java.util.Scanner

fun main (){

    val girdi = Scanner(System.`in`)
    val names = arrayListOf("Sinem", "Ali","Hümeyra","Cem","Gizem")

    names.sort()
    println(names)

    println("Bir isim giriniz:")

    val isim = girdi.next()

    if (isim!= null && names.contains(isim)){
        println("Aradığınız isim listede var.")
        println("İsmin büyük harfler ile ve tersten yazılışı:")
        println(isim?.reversed()?.uppercase())

    }
    else{
        println("Aradığınız isim listede yok.")
    }
}