FROM ghcr.io/graalvm/graalvm-ce:21.1.0 as builder
RUN gu install native-image
RUN echo $JAVA_HOME
WORKDIR /app
COPY . .
ENV JAVA_OPTS="-Xmx4g"
RUN ls
RUN ./gradlew build -Dquarkus.package.type=native
RUN ls


FROM registry.access.redhat.com/ubi8/ubi-minimal:8.3
WORKDIR /work/
RUN chown 1001 /work \
    && chmod "g+rwX" /work \
    && chown 1001:root /work
COPY --from=builder --chown=1001:root /app/builda/*-runner /work/application

EXPOSE 8080
USER 1001

CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]
