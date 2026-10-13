fun main() {
    // Punto 2: Estructuras de Control (when e if)

    val edadMascota: Int = 4
    val esUrgencia: Boolean = false

    // Clasificación del grupo de la mascota según la edad usando 'when'
    val categoria: String = when (edadMascota) {
        in 0..2 -> "Cachorro"
        in 3..7 -> "Adulto"
        in 8..Int.MAX_VALUE -> "Mayor"
        else -> "Edad no válida"
    }

    // Condicional 'if' con operador lógico || (OR) para evaluar la prioridad
    if (esUrgencia || categoria == "Mayor") {
        println("Categoría: $categoria | Estado: Prioridad Alta")
    } else {
        println("Categoría: $categoria | Estado: Atención Regular")
    }
}