# kafka-integration-test

Reproduces an issue I'm experience with Kafka Integration Tests.

Run the test with:
```shell
./gradlew quarkusIntTest -Dquarkus.container-image.build=true --rerun-tasks
```

You can update the version of the Quarkus in `gradle.properties`.

Last working version: `2.4.5`
First failing version: `2.5.0`
