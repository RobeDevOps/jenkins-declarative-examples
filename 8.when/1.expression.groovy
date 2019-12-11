pipeline {
    agent any
    parameters {
        booleanParam(name: 'RUN_TESTS', defaultValue: false, description: 'Enable test execution?')
    }
    stages {
        stage('Build'){
            echo 'Building...'
        }
        stage('Run Test') {
            when { expression { return params.RUN_TESTS } }
            steps {
                echo 'Testing...'
            }
        }
    }
}