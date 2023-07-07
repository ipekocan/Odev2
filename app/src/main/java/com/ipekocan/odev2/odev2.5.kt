package com.ipekocan.odev2

data class Workers(val name: String, var salary: Double)

fun main() {

    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    for (isci in workers){
        val zam = isci.salary*0.35
        isci.salary += zam
    }

    println("Zamlı Maaşları")
    for(calisan in workers){
        println("${calisan.name} : ${calisan.salary}")
    }

    // Listeyi karıştır ve küçükten büyüğe sırala
    workers.shuffle()
    println("***Maaşa göre Sıralanmış Hali***")
    val kucuktenBuyuge = workers.sortedBy{ it.salary}

    for (isci in kucuktenBuyuge){
        println("${isci.name} : ${isci.salary}")
    }
    val azMaas = workers.minByOrNull { it.salary }
    val cokMaas = workers.maxByOrNull { it.salary }

    if (azMaas != null && cokMaas != null) {
        val minIndex = workers.indexOf(azMaas)
        val maxIndex = workers.indexOf(cokMaas)

        println("""
            
            Maaşı En Yüksek :  ${cokMaas.name}
            Maaşı En Az  :  ${azMaas.name}
            
        """.trimIndent())

    }
    // Maaş ortalamasının hesaplanması ve Yazdırılması

    var totalSalary = 0.0
    for (worker in workers) {
        totalSalary += worker.salary
    }

    val averageSalary = totalSalary / workers.size

    println("Maaş Ortalaması: $averageSalary")




}