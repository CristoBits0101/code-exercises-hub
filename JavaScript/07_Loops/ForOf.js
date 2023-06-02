// Variable de soporte.
let objeto_a_iterar = [{name1:'Cristo', name2:'Rubén', apellido1:'Pérez', apellido2:'Suárez'}]
let array_a_iterar = ['Hola', 1, null, NaN, undefined, 0, '3 como carácter']

/**
 *  - Muestra el valor que tienen los elementos en las posiciones.
 *  - El valor del array se va almacenando en la variable que hemos declarado propiedadDelObjeto.
 */
for (let propiedadDelObjeto of objeto_a_iterar) {
    console.log('Soy el for of');
    console.log(propiedadDelObjeto);
}