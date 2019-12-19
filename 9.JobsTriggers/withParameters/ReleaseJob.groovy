pipeline {
    agent any
    parameters {
        string(name: 'FROM_BUILD', defaultValue: '', description: 'Build source')
        booleanParam(name: 'IS_READY', defaultValue: false, description: 'Is Ready for prod?')
    }
    stages {
        stage('Deploy') {
            steps {
                echo "Deploying from source ${params.FROM_BUILD}"
                sh "exit 1"
            }
        }
    }
}