fun main() {
    // Punto 4: Manejo de Nulos (Null Safety)

    // Simulación de dos registros de pacientes en la clínica
    val contactoPaciente1: String? = "3001234567" // Paciente con teléfono registrado
    val contactoPaciente2: String? = null         // Paciente sin teléfono registrado

    println("--- REGISTRO DE CONTACTOS DE EMERGENCIA ---")

    // --- Caso 1: Paciente con contacto registrado ---
    println("\n> Evaluando Paciente 1:")
    val longitud1: Int? = contactoPaciente1?.length // Llamada segura
    val contactoFinal1: String = contactoPaciente1 ?: "Sin contacto registrado" // Operador Elvis

    println("Número ingresado: $contactoPaciente1")
    println("Cantidad de dígitos (?.length): $longitud1")
    println("Resultado final (?:): $contactoFinal1")


    // --- Caso 2: Paciente sin contacto registrado (null) ---
    println("\n> Evaluando Paciente 2:")
    val longitud2: Int? = contactoPaciente2?.length // Llamada segura (retorna null)
    val contactoFinal2: String = contactoPaciente2 ?: "Sin contacto registrado" // Operador Elvis

    println("Número ingresado: $contactoPaciente2")
    println("Cantidad de dígitos (?.length): $longitud2")
    println("Resultado final (?:): $contactoFinal2")
}