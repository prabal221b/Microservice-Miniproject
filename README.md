# Microservice Mini Project

## Project Description
This project is a microservice-based application built using Spring Boot using maven with Spring Data JPA, Spring Web and MySQL Driver.

## Setup Instructions
follow these steps:

1. **Pre-Requisite**
   - Have Java and an IDE(Eclipse, IntelliJ etc) installed

2. **Clone the Repository:**
   git clone https://github.com/prabal221b/Microservice-Miniproject.git

3. **Run the SpringBootApp:**
   Run MicroserviceMiniProjectApplication.java by typing "java MicroserviceMiniProjectApplication.java" in the terminal.

## API Endpoints
Currently, there is a placeholder for API endpoints. You can add your specific endpoints here in the following format:

- **Endpoint 1**
  - **URL:** [/api/items](http://localhost:8080/items)
  - **Method:** GET
  - **Request Parameters:** N/A
  - **Response:** All the data in the JSON form.
  - **Example:** API : http://localhost:8080/items Request Parameter: None
  - **Example:** Response:
```json
[
    {
        "id": 6,
        "itemName": "Tea",
        "itemPrice": 200
    },
    {
        "id": 8,
        "itemName": "Ice",
        "itemPrice": 100
    },
    {
        "id": 9,
        "itemName": "Coffee",
        "itemPrice": 170
    }
]
{   
    "itemName":"Chips",
    "itemPrice":20
}
```

- **Endpoint 2**
  - **URL:** [/api/items](http://localhost:8080/items)
  - **Method:** POST
  - **Request Parameters:** Data in JSON format
  - **Response:** Data in JSON
  - **Example:** API : http://localhost:8080/items
  - Request Parameter:
```json
{   
    "itemName":"Chips",
    "itemPrice":20
}
```
  - **Example:** Response:
```json
{
    "id": 14,
    "itemName": "Chips",
    "itemPrice": 20
}
```

- **Endpoint 3**
  - **URL:** [/api/items/id](http://localhost:8080/items/5)
  - **Method:** GET
  - **Request Parameters:** N/A
  - **Response:** Get specific by id in the JSON form.
  - **Example:** Request Parameter:
  - **Example:** API : http://localhost:8080/items/8
  - Request Parameter: N/A
  - **Example:** Response:
```json
{
    "id": 8,
    "itemName": "Ice",
    "itemPrice": 100
}
```

- **Endpoint 4**
  - **URL:** [/api/items](http://localhost:8080/items)
  - **Method:** PUT
  - **Request Parameters:** Data with updated value in JSON format
  - **Response:** Updated data in JSON format
  - **Example:** API : http://localhost:8080/items
  - Request Parameter:
```json
{   
    "id":14,
    "itemName":"Chips",
    "itemPrice":30
}
```
  - **Example:** Response:
```json
{
    "id": 14,
    "itemName": "Chips",
    "itemPrice": 30
}
```

- **Endpoint 5**
  - **URL:** [/api/items/id](http://localhost:8080/items/5)
  - **Method:** DELETE
  - **Request Parameters:** N/A
  - **Response:** String "Item Deleted!" or "Item not found"
  - **Example:** API : http://localhost:8080/items/14
  - Request Parameter: N/A
  - **Example:** Response: Item Deleted!
 
