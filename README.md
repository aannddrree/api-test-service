# API JAVA SprintBoot + MongoDB in Container (DOCKER)

Para subir a aplicação é necessário:

1) Construir a imagem (Build):
   
```
docker-compose build
```

2) Verificar a imagem criada:

```
docker image list
```

![image](https://github.com/aannddrree/api-test-service/assets/8753843/50348dd3-b4ba-47d6-9623-2251d597082c)

3) Executar/Subir o container:

```
docker-compose up -d
```

4) Validar os containers ativos:

```
docker ps   
```

![image](https://github.com/aannddrree/api-test-service/assets/8753843/c4a76a4d-89b0-424b-9ea9-af841637c7fe)

## Arquitetura:

![image](https://github.com/aannddrree/api-test-service/assets/8753843/f1b2224d-a03b-43dd-81bc-f68b6b4e79c8)
Fonte:https://salithachathuranga94.medium.com/deploy-rest-api-using-spring-boot-mongodb-and-docker-e7ab620b24d6


## Testando a aplicação:

Acessar: 
* http://localhost:8080/swagger-ui.html#/

![image](https://github.com/aannddrree/api-test-service/assets/8753843/77ed7112-87bb-4635-a637-561b3bc69934)
