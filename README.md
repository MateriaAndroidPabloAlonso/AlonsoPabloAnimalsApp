# Alonso Pablo Animals App

Es una app de Android que permite explorar animales y sus entornos a través de una interfaz visualmente atractiva y fácil de usar. Los usuarios pueden ver una lista de animales, conocer sus detalles, explorar los ambientes donde viven y ver información relacionada con ellos
La app utiliza Retrofit para hacer peticiones a una API y mostrar datos sobre animales y sus entornos


## Funcionalidades

 - Lista de animales: visualiza todos los animales disponibles en la base de datos
 - Detalle del animal: al seleccionar un animal, se puede ver informacion detallada, incluyendo su nombre, descripción y una galería de imágenes
 - Lista de ambientes: visualiza todos los ambientes disponibles
 - Detalle del ambiente: al seleccionar un ambiente, se pueden ver los animales que habitan alli, junto con una descripción del ambiente y una imagen representativa

## Requisitos

Android Studio 4.2 o superior
SDK de Android versión 30 o superior
Conexión a internet para cargar los datos desde la API

## Tecnologías utilizadas

- Kotlin: lenguaje de programación principal
- Jetpack Compose: framework para construir la UI de la app
- Retrofit: librería para cargar peticiones HTTP y consumir la API
- Coil: Librería para cargar imágenes de forma eficiente
- Material3: Componentes de UI basados en las directrices de Material Design
- Navigation: para gestionar la navegación entre pantallas dentro de la aplicación

## Como correr el proyecto

1. Clona este repositorio en tu máquina
2. Abre el proyecto en android Studio
3. Configura el entorno:
	- Aseguráte de tener android studio actualizado
	- Revisa que el SDK esté correctamente configurado
	- Si es necesario, instala las dependencia adicionales o actualiza las bibliotes
4. Ejecuta el proyecto: Conecta un dispositivo android o usa un emulador, haz clic en el botón run en android studio
5. La aplicacion debería lanzarse en tu dispositivo / emulador, y podrás ver las pantallas de lista de animales y ambientes, así como sus detalles 
