pipeline {
    agent any
    parameters {
        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
    }
    stages {
        stage('Test') {
            steps {
                echo "Password is ${params.PASSWORD}"
            }
        }
    }
}