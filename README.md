# HNG PUBLIC API README

A simple Spring Boot API that returns developer information in JSON format.

### Features

+ Returns email
+ Provides dynamically generated UTC timestamp
+ Includes the GitHub repository URL
  
### Technologies Used

+ Java
+ Maven 
+ Spring Boot
+ Railway (for deployment)



  
## Setup Instruction

To clone this repository

```bash
https://github.com/van2jazz/hng.git/
```

Build and run the Application:

```bash
mvn spring-boot:run
```

Access the API Locally at:

```bash
http://localhost:8080/api
```
## API Documentation

### Endpoint URL
```bash
GET /api
```

### Response Format(200 OK)

    {
      "email": "van2jazz@gmail.com",
      "current_datetime": "2025-01-30T22:29:19Z",
      "github_url": "https://github.com/van2jazz/hng"
    }


## Deployment

This API is deployed on Railway. You can access it at:

[https://hng-production-1736.up.railway.app/api](https://hng-production-1736.up.railway.app/api)


## Related Links
[Hire Java developers](https://hng.tech/hire/java-developers)
