<?php

    // La variable es parte de la ruta "src='./img/$_dado1.svg'".

    // La variable no es parte de la ruta echo '<img src=img/' . $_dado1 . '.svg'>;
    // Al src le falta las comillas "" y simples no se ponen.

    // Concatenar valores.
    $nombre = "cristo rubén";
    $nombre .= " pérez suárez";

    // Concatenar variables con textos.
    $_mundo = "Mundo";

    echo "Hola $_mundo";               // Dentro de textos.

    echo "" . $_mundo;                 // Fuera de textos.

    echo "<h2>Hola<h2><br>" . $_mundo; // Con elementos HTML.

?>