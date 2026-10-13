fun main() {
 // Punto 3: Colecciones y Ciclos (Listas, for y rangos)


    // Lista inmutable con 4 mascotas usando listOf()
    val pacientesEsperando: List<String> = listOf("Toby", "Luna", "Max", "Kira")

    println("--- Lista de Espera de Pacientes ---")
    // Recorrido de la lista asignando número de turno consecutivo
    for ((index, mascota) in pacientesEsperando.withIndex()) {
        println("Turno #${index + 1}: $mascota")
    }

    println("\n--- Cuenta Regresiva para Apertura de la Clínica ---")
    // Rango numérico regresivo del 5 al 1 con downTo
    for (minuto in 5 downTo 1) {
        println("Faltan $minuto minuto(s) para abrir...")
    }
}