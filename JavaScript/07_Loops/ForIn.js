// Variable de soporte.
let objeto_a_iterar = [{name1:'Cristo', name2:'Rubén', apellido1:'Pérez', apellido2:'Suárez'}]
let array_a_iterar = ['Hola', 1, null, NaN, undefined, 0, '3 como carácter']

/**
 *  - Muestra la posición del elemento que esta recorriendo o la clave del objeto.
 *  - El posición del objeto se almacena en la variable que hemos declarado propiedadDelObjeto.  
 */
for (propiedadDelObjeto in objeto_a_iterar) 
{
    console.log('Soy el for in');
    console.log(propiedadDelObjeto);
}