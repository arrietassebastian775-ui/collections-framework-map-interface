package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {

		/*
		 * ¿Que es un Map Interface o un mapa simplemente?
		 * 
		 * Es una coleccion aunque no hereda de la interfaz collections, pero se puede
		 * tratar como tal utilizanado las collections viws (Vistas de colecciones), que
		 * veremos en breve.
		 * 
		 * Concretamente un mapa, es una coleccion, tambien denominado un objeto que
		 * relaciona claves con valores, lo que antiguamente se llamaba una estructura
		 * hash (clave (key) y valor (value)), donde las claves no pueden repetirse.
		 * 
		 * Los metodos de ordenamiento y de busqueda que son aplicables a las interfaces
		 * que heredan de collection no son aplicables a la interface map, por ejemplo
		 * el metodo sort no se lo puede aplicar a un mapa.
		 * 
		 * En resumen una interface map, mapea (relaciona) claves con valor en un
		 * contenedor, que se puede crear de varias formas y recorrer de varias formas
		 * tambien.
		 */

		/*
		 * A modo de ejemplo, vamos a crear una collecion (Map interface) que almacene
		 * frecuencia de repeticion/ocurrencia de un array de palabras que se reciben
		 * como parametro en el metodo main, cuando se lanza la aplicacion
		 */

		/*
		 * Primero comprobar si estamos recibiendo el array de nombres en la
		 * variableargs, cuando se lanza la aplicacion
		 */

		List<String> listadoDeArgumentos = Arrays.asList(args);

		listadoDeArgumentos.forEach(System.out::println);

		// Creacion del mapa a partir del listado de argumentos

		Map<String, Long> m = null;

		/*
		 * Variante #1 de creacion del mapa a partir de recorrer el listado de
		 * argumentos utilizando operaciones de agregado (tuberias, metodos de la clase
		 * stream, lambda, metodos por referencia, en fin, programacion funcional)
		 */

		m = listadoDeArgumentos.stream()
		.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));

		System.out.println("Mapa resultante: " + m);
		
		/* Variante #2 (RECOMENDADA) */
		
		var m2 =listadoDeArgumentos.stream()
				.collect(Collectors.groupingBy(nombre -> nombre,
				Collectors.counting()));
		
		System.out.println(m2);
		
		// Creacion de listado de empleados
		
		List<Empleado> empleados = new ArrayList<>();
		
		Empleado emp1 = Empleado.builder()
				.nombre("Jorge Francisco")
				.PrimerApellido("Alborch")
				.SegundoApellido("Villar")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1974, Month.JUNE, 23))
				.dpto(Dpto.INFORMATICA)
				.salario(new BigDecimal(3500.50))
				.fechaAlta(LocalDate.of(1990, Month.SEPTEMBER, 22))
				.build();
		
		Empleado emp2 = Empleado.builder()
				.nombre("Andres")
				.PrimerApellido("Alonso")
				.SegundoApellido("Pelaez")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1983, Month.SEPTEMBER, 23))
				.dpto(Dpto.INFORMATICA)
				.salario(new BigDecimal(3400.50))
				.fechaAlta(LocalDate.of(1995, Month.SEPTEMBER, 22))
				.build();
		
		Empleado emp3 = Empleado.builder()
				.nombre("Jeronimo")
				.PrimerApellido("Arenal")
				.SegundoApellido("Gomez")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1965, Month.OCTOBER, 20))
				.dpto(Dpto.CONTABILIDAD)
				.salario(new BigDecimal(3600.50))
				.fechaAlta(LocalDate.of(1977, Month.JANUARY, 4))
				.build();
		
		Empleado emp4 = Empleado.builder()
				.nombre("Carolina")
				.PrimerApellido("Garzon")
				.SegundoApellido("Becerra")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(2001, Month.JUNE, 7))
				.dpto(Dpto.INFORMATICA)
				.salario(new BigDecimal(3700.50))
				.fechaAlta(LocalDate.of(2020, Month.SEPTEMBER, 10))
				.build();
		
		Empleado emp5 = Empleado.builder()
				.nombre("Mariana")
				.PrimerApellido("Garzon")
				.SegundoApellido("Villar")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(2000, Month.AUGUST, 4))
				.dpto(Dpto.FINANZAS)
				.salario(new BigDecimal(3300.50))
				.fechaAlta(LocalDate.of(2022, Month.SEPTEMBER, 25))
				.build();
		
		Empleado emp6 = Empleado.builder()
				.nombre("Francisca")
				.PrimerApellido("Alvarez")
				.SegundoApellido("Gonzales")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(1995, Month.DECEMBER, 10))
				.dpto(Dpto.RRHH)
				.salario(new BigDecimal(2500.50))
				.fechaAlta(LocalDate.of(2010, Month.SEPTEMBER, 5))
				.build();
		
		Empleado emp7 = Empleado.builder()
				.nombre("Maricarmen")
				.PrimerApellido("Becerra")
				.SegundoApellido("Martinez")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(2003, Month.FEBRUARY, 14))
				.dpto(Dpto.FINANZAS)
				.salario(new BigDecimal(2600.50))
				.fechaAlta(LocalDate.of(2021, Month.SEPTEMBER, 8))
				.build();
		
		Empleado emp8 = Empleado.builder()
				.nombre("Eva")
				.PrimerApellido("Cornide")
				.SegundoApellido("Machado")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(1990, Month.MAY, 18))
				.dpto(Dpto.INFORMATICA)
				.salario(new BigDecimal(3500.50))
				.fechaAlta(LocalDate.of(2015, Month.SEPTEMBER, 22))
				.build();
		
		Empleado emp9 = Empleado.builder()
				.nombre("Alberto")
				.PrimerApellido("Gonzales")
				.SegundoApellido("Sanchez")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1990, Month.FEBRUARY, 14))
				.dpto(Dpto.FINANZAS)
				.salario(new BigDecimal(2600.50))
				.fechaAlta(LocalDate.of(2000, Month.SEPTEMBER, 8))
				.build();
		
		Empleado emp10 = Empleado.builder()
				.nombre("Javier")
				.PrimerApellido("Gonzales")
				.SegundoApellido("Sanchez")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1995, Month.MAY, 20))
				.dpto(Dpto.RRHH)
				.salario(new BigDecimal(3500.50))
				.fechaAlta(LocalDate.of(1990, Month.SEPTEMBER, 22))
				.build();
		
		empleados = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);
		
		//Crear una coleccion que agrupe empleados por genero
		Map<Genero, List<Empleado>> empleadosPorGenero = empleados.stream()
				.collect(Collectors.groupingBy(empleado -> empleado.getGenero(),
						Collectors.toList()));
		
		System.out.println("Empleados por genero: " + empleadosPorGenero);
		
		
		
	}
}
