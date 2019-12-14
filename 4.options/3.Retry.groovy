pipeline {
    agent any
    // On failure, retry the entire Pipeline the specified number of times. 
    // For example: options { retry(3) }
    options { retry(3) }
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'sleep 5'
                sh 'exit 1'
            }
        }
    }
}