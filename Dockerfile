FROM java:8
COPY demo-prod.jar /apps/spring_app/
WORKDIR /apps/spring_app
EXPOSE 8080
CMD ["java", "-jar", "stbe0616-1.war"]