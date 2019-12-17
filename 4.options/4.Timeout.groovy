pipeline {
    agent any
    options {
        // unit options
        // https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/TimeUnit.html
        timeout(time: 5, unit: 'SECONDS') 
    }
    stages {
        stage('Build') {
            steps {
                echo 'Build...'
                sleep 7
            }
        }
    }
}