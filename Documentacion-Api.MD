# Instalacion y uso 
## Order Controller
### GET /api/ordenes/

Endpoint: getAllOrders

Este endpoint devuelve todas las órdenes existentes en la base de datos.

Ejemplo de respuesta exitosa (200 OK):

    [
      {
        "id": 1,
        "user": {
          "id": 1,
          "name": "John Doe"
        }
      },
      {
        "id": 2,
        "user": {
          "id": 2,
          "name": "Jane Smith"
        }
      }
    ]

### GET /api/ordenes/{id}

Endpoint: getOrderById

Este endpoint devuelve una orden específica según el ID proporcionado en el parámetro de la ruta.

Ejemplo de respuesta exitosa (200 OK):

    {
      "id": 1,
      "user": {
        "id": 1,
        "name": "John Doe"
      }
    }

## Product Controller

### GET /api/productos/

Endpoint: getAllProducts

Este endpoint devuelve todos los productos disponibles en la base de datos.

Ejemplo de respuesta exitosa (200 OK):

    [
      {
        "id": 1,
        "name": "Product 1",
        "price": 10.99
      },
      {
        "id": 2,
        "name": "Product 2",
        "price": 19.99
      }
    ]

### POST /api/productos/

Endpoint: createProduct

Este endpoint crea un nuevo producto en la base de datos. Se requiere proporcionar los datos del producto en el cuerpo de la solicitud.

Ejemplo de solicitud:

    {
      "name": "New Product",
      "price": 15.99
    }

Ejemplo de respuesta exitosa (201 Created):

    {
      "id": 3,
      "name": "New Product",
      "price": 15.99
    }

### GET /api/productos/{prodID}

Endpoint: getProduct

Este endpoint devuelve la información de un producto específico según el ID proporcionado en el parámetro de la ruta.

Ejemplo de respuesta exitosa (200 OK):

    {
      "id": 1,
      "name": "Product 1",
      "price": 10.99
    }

## User Controller

### GET /api/usuarios/

Endpoint: getAllUsers

Este endpoint devuelve todos los usuarios registrados en la base de datos.

Ejemplo de respuesta exitosa (200 OK):

    [
      {
        "id": 1,
        "name": "John Doe"
      },
      {
        "id": 2,
        "name": "Jane Smith"
      }
    ]

### POST /api/usuarios/

Endpoint: addUsuario

Este endpoint crea un nuevo usuario en la base de datos. Se requiere proporcionar los datos del usuario en el cuerpo de la solicitud.

Ejemplo de solicitud:

    {
      "name": "New User"
    }

Ejemplo de respuesta exitosa (201 Created):

    {
      "id": 3,
      "name": "New User"
    }

### GET /api/usuarios/{prodID}

Endpoint: getUser

Este endpoint devuelve la información de un usuario específico según el ID proporcionado en el parámetro de la ruta.

Ejemplo de respuesta exitosa (200 OK):

    {
      "id": 1,
      "name": "John Doe"
    }

### PUT /api/usuarios/{userId}

Endpoint: updateUsuario

Este endpoint actualiza la información de un usuario específico según el ID proporcionado en el parámetro de la ruta. Se requiere proporcionar los nuevos datos del usuario en el cuerpo de la solicitud.

Ejemplo de solicitud:

    {
      "name": "Updated User"
    }

Ejemplo de respuesta exitosa (200 OK):

    {
      "id": 1,
      "name": "Updated User"
    }

### DELETE /api/usuarios/{userID}

Endpoint: deleteUsuario

Este endpoint elimina un usuario específico según el ID proporcionado en el parámetro de la ruta.

Ejemplo de respuesta exitosa (204 No Content): No hay cuerpo de respuesta.