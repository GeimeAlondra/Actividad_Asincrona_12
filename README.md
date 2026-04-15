# Actividad_Asincrona_12

# Departamentos SV
> [!WARNING]
> Asegurese de que exista el archivo **local.properties** en la raíz del proyecto, en su defecto, deberá crearlo manualmente y agregarle la ruta del **SDK**

## Requisitos Previos
Requisitos necesarios para ejecutar el proyecto:

- [Android Studio](https://developer.android.com/studio)
- [Java JDK 11 o superior](https://www.oracle.com/java/technologies/downloads/)
- [Git](https://git-scm.com/)

## Guía de Instalación y Ejecución

Sigue estos pasos para ejecutar la aplicación en una máquina local

### Clonar el repositorio

Abrir la terminal

```bash
#  Navegar a la carpeta donde se clonará el proyecto
cd /ruta_a_la_carpeta

# Clonar el repositorio
git clone https://github.com/GeimeAlondra/Actividad_Asincrona_12.git
```

### Verificar que se haga referencia al SDK
- Ir a la raíz del proyecto (Carpeta: **Actividad_Asincrona_12**)
- Confirmar la existencia del archivo **local.properties**.
- Abrirlo y confirmar la ruta al SDK

- #### En caso de no existir
    - Crear el archivo con el nombre exacto: **local.properties**
    - Buscar la ruta del SDK, generalmenten en **usuario/Android/SDK**
    - Ingresar a la carpeta SDK y copiar la direccion
    - Abrir el archivo local.properties colocar la direccion del SDK de la siguiente manera:

```properties
sdk.dir=/ruta_del_SDK
```
- Guardar y listo

### Automatización del Build
Hay que presionar en gradle antes de probarlo la emulación

### Pruebas
EL proyecto ya está listo para realizar pruebas de emulación