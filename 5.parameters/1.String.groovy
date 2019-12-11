pipeline {
    agent any
    parameters {
        string(name: 'TARGET_ENV', defaultValue: 'DEV', description: 'Default target environment')
    }
    stages {
        stage('Deploy') {
            steps {
                echo "Deploying to ${params.TARGET_ENV}"
            }
        }
    }
}