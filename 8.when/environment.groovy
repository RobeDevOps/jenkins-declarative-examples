pipeline {
    agent any
    environment {
        DEPLOY_TO = "production"
    }
    stages {
        stage('Example') {
            when { environment name: 'DEPLOY_TO', value: 'production' }
            steps {
                sh 'printenv'
            }
        }
    }
}