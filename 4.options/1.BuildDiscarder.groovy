pipeline {
    agent any
    options { buildDiscarder(logRotator(numToKeepStr: '5')) }
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sleep 2
            }
        }
    }
}