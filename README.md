**Rest API With Spring Boot and MongoDB**

**Technology Stack**
* Maven, Spring Boot, Spring Web;
* Spring Data MongoDB, lombok;
* MongoDB embedded database;
* Spring Security (as basic authentication).

**Run:-** Application.java spring boot
```
Get : localhost:8082/database/currencies
Auth      : Basic Auth
User Name : user
Password  : user
``` 
Result :-
```
[
    {
        "currencyName": "BTC",
        "updatedDate": "20180507",
        "quotes": [
            {
                "time": "0915",
                "price": "34.98"
            },
            {
                "time": "1045",
                "price": "36.13"
            },
            {
                "time": "1230",
                "price": "37.01"
            },
            {
                "time": "1400",
                "price": "35.98"
            },
            {
                "time": "1530",
                "price": "33.56"
            }
        ]
    },
    {
        "currencyName": "ETC",
        "updatedDate": "20180507",
        "quotes": [
            {
                "time": "0900",
                "price": "1.45"
            },
            {
                "time": "1030",
                "price": "1.87"
            },
            {
                "time": "1245",
                "price": "1.55"
            },
            {
                "time": "1515",
                "price": "2.01"
            },
            {
                "time": "1700",
                "price": "2.15"
            }
        ]
    },
    {
        "currencyName": "LTC",
        "updatedDate": "20180507",
        "quotes": [
            {
                "time": "0930",
                "price": "14.32"
            },
            {
                "time": "1115",
                "price": "14.87"
            },
            {
                "time": "1245",
                "price": "15.03"
            },
            {
                "time": "1400",
                "price": "14.76"
            },
            {
                "time": "1700",
                "price": "14.15"
            }
        ]
    }
]
```
```
Post:- localhost:8082/database/currencies
Headers : Auth         :`Basic Auth
          Content-Type : application/json
          User Name    : user
          Password     : user
	  
Payload:- 
{
	"currencyName" : "LTC", 
	"updatedDate" : "20180507", 
	"quotes": [
	{"time":"0915", "price":"34.98"}, 
	{"time":"1045", "price":"36.13"}, 
	{"time":"1230", "price":"37.01"}, 
	{"time":"1400", "price":"35.98"}, 
	{"time":"1530", "price":"33.56"}
	]
}
```
