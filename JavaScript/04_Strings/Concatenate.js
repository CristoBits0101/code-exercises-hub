// Declaración.
const saludo = 'Hola';
const nombre = 'Cristo';

// Concatenar datos mediante el método concat.
saludo.concat(nombre);

// Concatenar datos Separando los valores por una coma.
saludo.concat("", nombre);

// Concatenar datos separando los valores por un más.
console.log(saludo + " " + nombre);

// Concatenar datos mediante variables dentro de comillas invertidas.
console.log(`${saludo} ${nombre}`);

// id="${'valor' + index}"

// id="${valor = 'valor' + index}"

// id="valor ${+ index}"

// id="valor ${index}"

// id="valor"+${index}

// id="'valor${index}'"

// id="'+valor${index}+'"