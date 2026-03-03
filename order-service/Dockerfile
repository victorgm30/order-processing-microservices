# Uses official Java image
FROM eclipse-temurin:17-jdk-alpine

# Directory inside the container
WORKDIR /app

# Copy of project
COPY . .

# Compile the project
RUN ./mvnw clean package -DskipTests

# Expose the application port
EXPOSE 8080

# Execute jar
CMD ["java", "-jar", "target/order-processing-0.0.1-SNAPSHOT.jar"]