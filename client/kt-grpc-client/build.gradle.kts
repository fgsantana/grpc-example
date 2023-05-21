//import com.google.protobuf.gradle.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.7.10"
//    id("com.google.protobuf") version "0.9.2"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    mavenCentral()

}


group = "com.fgsantana"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_17


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation ("javax.annotation:javax.annotation-api:1.3.2")
    implementation("com.google.protobuf:protobuf-java-util:3.21.12")
    implementation("com.google.protobuf:protobuf-kotlin:3.21.12")
    implementation("io.grpc:protoc-gen-grpc-kotlin:1.3.0")
    implementation("io.grpc:protoc-gen-grpc-java:1.3.0")
    implementation("io.grpc:grpc-netty:1.47.0")
    implementation("io.grpc:grpc-protobuf:1.53.0")
    implementation ("io.grpc:grpc-stub:1.52.1")
    implementation("io.grpc:grpc-kotlin-stub:1.3.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
}


//protobuf {
//
//    protoc {
//        artifact = "com.google.protobuf:protoc:3.12.2"
//    }
//
//    plugins {
//        id("grpc") {
//            artifact = "io.grpc:protoc-gen-grpc-java:1.3.0"
//        }
//        id("grpckt") {
//            artifact = "io.grpc:protoc-gen-grpc-kotlin:1.3.0:jdk8@jar"
//        }
//
//    }
//    generateProtoTasks {
//        all().forEach {
//            if (it.name.startsWith("generateTestProto")) {
//                it.dependsOn("jar")
//            }
//
//            it.plugins {
//                id("grpc") {
//                id("grpckt")
//                }
//
//            }
//        }
//    }
//}


//sourceSets{
//    main{
//        proto{
//            srcDir("proto")
//        }
//    }
//}


tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}



tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("kt-grpc-client")
        mergeServiceFiles()
        manifest {
            attributes(mapOf("Main-Class" to "MainKt"))
        }
    }
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}


