pipeline {
    agent any
    environment { 
        SECRET_TOKEN = credentials('my-secret-text-token') 
    }
    stages {
        stage('Authentication') {
            steps {
                // the token is access as environment variable
                echo "${SECRET_TOKEN}"
            }
        }
    }
}