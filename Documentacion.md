## Proxy
Ofrece una interfaz equivalente al de la clase SujetoReal, y redirige </br>
las llamadas de los métodos al objeto real. Puede realizar un pre-procesamiento y un </br>
post- procesamiento sobre los servicios ofrecidos por la clase real.</br>

Ahora explicaremos lo que es el ejercicio de la practica.

Primero empezamos con la interface del ejercicio ya que es primordial para este patron,</br>la interfaz lo que hace en general es crear las funciones de tipo string subir, bajar y listado </br> para que puedan ser implementada por una clase


![imagen](image/uno.png)

La clase Proxy lo que hace es implementar todo de la intefaz cuenta donde le</br> damos todas las funcionalidades a cada función, en pocas palabras</br>darnos las instrucciones u órdenes de que hacer es decir lo que se va realizar

![imagen](image/dos.png)

La clase ServidorFichero esta al igual que la de proxy implementa la interfaz servicio,</br> donde la intanciamos las funciones para poder subir un fichero y para bajarlo ademas </br>de hacer una función para listar todos los archivos al momento de mostrarlo.

![imagen](image/tres.png)

En la clase Fichero en esta lo primero que hacemos es crear las variables que utilizaremos </br>toda de tipo privado, despues creamos lo que es un contador esta servira para</br>en numerar los archivos cuando hayan muchos, despues un constructor para poder crearle</br> el nombre cuando lo ejecutemos, poasteriormente hacemos los metodos que son</br>los eobtenedores y establecedores para cada uno.


![imagen](image/cuatro.png)

La clase fecha en esta lo primero que hacemos es declarar las variables que utilizaremos </br>luego crearemos lo que es un constructor lleno, este nos servira para dar</br> la fecha en entero,despues otro de tipo string usando la herramienta de Stringtokenizer</br> que sirve para dividir las cade en tokens es decir en pequeño fragmento, luego le decimos</br>que los divida con "/" luego declaramos las 3 variables que utilizamos y la igualamos</br>y por ultimo la convertimos a entero, despues creamos una funcion fecha esta </br> servira para que nos de la fecha en tiempo real y por ultimo creamos todos los </br>obtenedores y establecedores.


![imagen](image/cinco.png)
![imagen](image/seis.png)

Por ultimo en el main creamos con ciclos while y do while lo que es un  menu para seleccionar la</br>opcion que deseamos al momento de ejecución, despues lo que es las condiciones para poder subir,</br> bajar o listar los archivos en caso de seleccionar cualquiera de las opciones mpues hacemos llamado</br> del servidor que ya esta instanciado como proxy mas la opcion que necesitamos si es subir la llamamos</br> y le pasamos el nombre,para las otras opciones es de la misma manera y por ultimo validacion</br> para lo que seria mandar mensaje de error por si el usuario eligio la una opción que no existe.

![imagen](image/siete.png)
![imagen](image/ocho.png)

Aqui podemos ver como funciona al momento de ser ejecutado:

![imagen](image/nueve.png)
![imagen](image/diez.png)
![imagen](image/once.png)