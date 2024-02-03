package com.example.ugelformbackend

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.springframework.context.annotation.Configuration
import jakarta.annotation.PostConstruct


@Configuration
class FirebaseConfig {

    @PostConstruct
    fun initializeFirebase() {
        if (FirebaseApp.getApps().isEmpty()) {
            val serviceAccountStream = javaClass.getResourceAsStream("/firebase-config.json")
                ?: throw IllegalArgumentException("Firebase service account JSON not found")

            val options = FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccountStream))
                .setDatabaseUrl("https://ugel-register-default-rtdb.europe-west1.firebasedatabase.app")
                .build()

            FirebaseApp.initializeApp(options)
        }
    }
}




