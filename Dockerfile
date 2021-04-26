FROM registry.cn-beijing.aliyuncs.com/yfwj/graalvm-ce-native-image-hw:21.1.0 as builder
WORKDIR /app
COPY . .
RUN gradlew build -Dquarkus.package.type=native

FROM registry.access.redhat.com/ubi8/ubi-minimal:8.3
WORKDIR /work/
RUN chown 1001 /work \
    && chmod "g+rwX" /work \
    && chown 1001:root /work
COPY --from=builder --chown=1001:root /app/build/*-runner /work/application

EXPOSE 8080
USER 1001

CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]
