Algoritmo Ejercicio10
	Definir suma Como Entero
	Definir multiplosDe6 Como Entero
	Definir suma1al10 Como Entero
	Repetir
		Escribir 'Ingrese el numero a sumar a ' suma
		Leer numeroAsumar
		suma = suma + numeroAsumar
		Si numeroAsumar mod 6 = 0 Entonces
			multiplosDe6 = multiplosDe6 + 1
		Fin Si
		Si numeroAsumar >= 1 & numeroAsumar <= 10 Entonces
			suma1al10 = suma1al10 + numeroAsumar
		FinSi
	Hasta Que suma > 1000
	Escribir 'El numero total de multimplos de 6 es ' multiplosDe6
	Escribir 'El las suma de numeros que se encuentran entre 1 y 10 es ' suma1al10
FinAlgoritmo
