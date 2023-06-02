// Fecha y hora actual.
const ahora = new Date();
const ahora2 = new Date();

// Usando los milisegundos desde 1970.
const diezMiliSeconds = new Date(10);

// Desde x Dias.
const initialDate1 = new Date("february 11 2021");
const initialDate2 = new Date(2022, 8, 72022, 8, 7);

// Obtener datos de fecha individualmente, no puede pasar parámetros.
const tiempo = null;
tiempo = ahora.getDay();
tiempo = ahora.getMonth();
tiempo = ahora.getFullYear();
tiempo = ahora.getDate();
tiempo = ahora.getHours();
tiempo = ahora.getMinutes();
tiempo = ahora.getSeconds();

// Comparar fechas haciendo conversión a milisegundos que es obligatorio.
console.log(ahora.getTime() === ahora2.getTime());

// Fecha por país por ejemplo inglaterra.
console.log(ahora.toLocaleDateString("en-GB"));