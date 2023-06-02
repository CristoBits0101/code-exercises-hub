// Incremento automático -> pruebas -> nombres -> id -> etc...
function* generateID() 
{
    let id = 0;

    // El bucle nunca se detiene.
    while (true) 
    {
        id++
        if (id === 10) 
        {
            return
        }
        
        // El bucle no se vuelve a ejecutar hasta que se llama a la función.
        yield i
    }
}

// Guarda la funcion en una const.
const gen = generateID();
 
/**
 *  - Llamar a la función.
 *  - El siguiente es para obtener un valor.
 *  - El valor es solo para ver el retorno del valor y no los estados. 
 */
console.log(gen.next().value());