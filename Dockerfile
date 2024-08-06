# Use a base image with JDK
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /usr/app

# Copy the JAR file from the host into the container
COPY target/dockub.jar /usr/app/

# Expose the port the app runs on
EXPOSE 8040

# Run the JAR file
ENTRYPOINT ["java", "-jar", "dockub.jar"]



