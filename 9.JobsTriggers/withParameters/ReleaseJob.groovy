pipeline {
    agent any
    parameters {
        string(name: 'FROM_BUILD', defaultValue: '', description: 'Build source')
    }
    stages {
        stage('Deploy') {
            steps {
                echo "Deploying from source ${params.FROM_BUILD}"
            }
        }
    }
}