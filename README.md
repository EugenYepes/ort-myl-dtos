# DTOs - MyLApp

Este repositorio contiene exclusivamente los **DTOs (Data Transfer Objects)** utilizados para la comunicación entre el backend y el cliente Android de la aplicación **MyLApp**.


## Estructura del proyecto

El repositorio está organizado por dominios funcionales. Cada archivo o paquete contiene DTOs específicos para un recurso o entidad del sistema, por ejemplo:

- `UserDTO.kt`
- `PlayerDTO.kt`
- `StoreDTO.kt`
- `CardDTO.kt`
- `DeckDTO.kt`
- etc.

## Uso

Estos DTOs son consumidos tanto por el backend como por el cliente Android para asegurar una estructura de datos coherente y evitar duplicación de modelos.

- En el **backend**, se utilizan para definir las respuestas y solicitudes de los endpoints.
- En el **cliente Android**, se utilizan para deserializar las respuestas del backend y estructurar las solicitudes.

## Requisitos

- Kotlin
- Compatibilidad con librerías de serialización como Gson

## Notas

- Este repositorio no incluye lógica de negocio ni servicios.
- Está diseñado para ser importado como módulo o dependencia en proyectos que lo requieran.

---

> Para cualquier modificación en la estructura de los DTOs, asegurarse de coordinar con ambos equipos (backend y Android) para evitar errores de compatibilidad.
