pipeline {
    agent any
    options { disableConcurrentBuilds() }
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sleep 10
            }
        }
    }
}