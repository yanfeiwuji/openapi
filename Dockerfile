FROM registry.cn-beijing.aliyuncs.com/yfwj/graalvm-ce-native-image-hw:21.1.0
WORKDIR build
COPY ./ ./
RUN ls
RUN ./gradlew build -Dquarkus.package.type=native
RUN ls
