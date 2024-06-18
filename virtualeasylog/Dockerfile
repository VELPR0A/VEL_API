# Use a imagem base do OpenJDK
FROM openjdk:latest

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo JAR gerado para o diretório de trabalho no contêiner
COPY ./target/virtualeasylog-0.0.1-SNAPSHOT.jar /app/

# Comando para executar a aplicação quando o contêiner for iniciado
CMD ["java", "-jar", "virtualeasylog-0.0.1-SNAPSHOT.jar"]

