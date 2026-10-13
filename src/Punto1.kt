//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Punto 1: Variables y Tipos de Datos

    // Declaración de datos del paciente canino con tipos explícitos
    val nombre: String = "Max"
    var edad: Int = 2
    var peso: Float = 12.5f
    val sexo: Char = 'M'
    var estadoVacunacion: Boolean = true

    // la mascota cumplió un año y aumentó de peso
    edad += 1
    peso += 1.3f

    // Imprimir en consola el resumen del paciente en una sola línea ($)
    println("Paciente: $nombre | Edad: $edad años | Peso: ${peso}kg | Sexo: $sexo | Vacunado: $estadoVacunacion")
}