fun main() {
    // Punto 5: Expresiones Lambda y Funciones de Orden Superior


    // Clases/Pares para asociar cada servicio con su precio base
    val servicios: Map<String, Double> = mapOf(
        "Consulta General" to 45000.0,
        "Baño Canino" to 25000.0,
        "Desparasitación" to 18000.0
    )

    // Expresión lambda que calcula únicamente el valor del recargo (10%)
    val calcularRecargo: (Double) -> Double = { precio -> precio * 0.10 }

    println("--- RESUMEN DE TARIFAS (HORARIO NORMAL VS. NOCTURNO) ---")

    servicios.forEach { (nombreServicio, precioBase) ->
        val recargoNocturno = calcularRecargo(precioBase)
        val precioTotalNocturno = precioBase + recargoNocturno

        println("""
            Servicio: $nombreServicio
            - Precio Normal: $$precioBase
            - Recargo Nocturno (10%): $$recargoNocturno
            - Total Horario Nocturno: $$precioTotalNocturno
            --------------------------------------------------
        """.trimIndent())
    }
}