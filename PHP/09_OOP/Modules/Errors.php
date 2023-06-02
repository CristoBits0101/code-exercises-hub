<?php

    include       "Requerido.php";
    include_once  "Requerido.php";

    require       "Requerido.php";
    require_once  "Requerido.php";

    // ERROR! => La variable no esta definida en el archivo importado.
    $b = "otra variable del principal";
    
    echo "En el script principal";

?>