pipeline {
    agent any
    environment { 
        TARGET = 'DEV'
    }
    stages {
        stage('Example') {
            environment {
                TARGET = 'EXAMPLE'
            }
            steps {
                sh 'printenv'
            }
        }
    }
}