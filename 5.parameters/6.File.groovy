pipeline {
    agent any
    parameters {
        file(name: 'config.txt', description: 'File Configuration')
    }
    stages {
        stage('Load Config') {
            steps {
                echo "Loading file: ${params.file}"
            }
        }
    }
}