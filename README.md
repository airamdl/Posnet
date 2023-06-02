# Posnet

Posnet es un proyecto que nos da el funcionamiento de dicho aparato y todas las clases envueltas en el mismo, como generar tickets, cobrar facturas por cuotas, etc.

## Descripción

Las tarjetas de crédito guardan el nombre de la entidad financiera a la que pertenecen (únicamente Birza o CasterMard), el nombre de la entidad bancaria, el número de tarjeta, el saldo disponible y los datos del titular (DNI, nombre, apellido, teléfono y mail). Cada vez que se cree una nueva tarjeta, deberán indicarse todos estos datos.
A la hora de abonar, el POSNET recibiría la tarjeta con la que desea hacerse el pago, junto con el monto que se desea abonar y la cantidad de cuotas (de 1 a 6).
Si el pago es en 1 cuota, no se genera ningún recargo, de lo contrario, el monto se incrementará en un 3% por cada cuota superior a 1. (Ejemplo: Pagar en 4 cuotas representará un 9% de incremento).
El POSNET debe chequear que la tarjeta tenga saldo suficiente para poder efectuar el pago junto con el recargo, si hubiese. En caso de éxito, debe generar y retornar (no mostrar) un ticket donde consten los siguientes datos:
▪ Nombre y apellido del cliente.
▪ Monto total a pagar.
▪ Monto de cada cuota.
Si la operación no tuvo éxito, se retornará null.


## Instalacion

https://github.com/airamdl/Posnet/



## Uso

Ticket tickedGenerado = postnet.efectuarPago(tarjetaCredito, montoAAbonar[ double cantidad], cantCuotas[int 1-6])

## Imagenes proyecto

![](https://i.imgur.com/7BPTuVJ.png)

## Javadoc

[C:/Users/1daw/Desktop/javadoc/package-summary.html](https://github.com/airamdl/Posnet/blob/master/javadoc/index.html)


## Contributing

Se aceptan pull requests. Para realizar cambios mayores, por favor abra un issue primero para discutir lo que le gustaría cambiar.

Asegúrate de actualizar las pruebas según corresponda.

## License
MIT

## Autor
Airam de león Perera
https://github.com/airamdl/

