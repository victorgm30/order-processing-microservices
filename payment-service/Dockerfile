# Uses official Java image
FROM eclipse-temurin:17-jdk-alpine

# Directory inside the container
WORKDIR /app

# Copy of project
COPY . .

# Compile the project
RUN ./mvnw clean package -DskipTests

# Expose the application port
EXPOSE 8081

# Execute jar
CMD ["java", "-jar", "target/payment-service-0.0.1-SNAPSHOT.jar"]