pipeline {
    agent any
    parameters {
        choice(name: 'BROWSER', choices: ['Chrome', 'Firefox', 'Edge'], description: 'Pick a browser')
    }
    stages {
        stage('Test') {
            steps {
                echo "Choice was ${params.BROWSER}"
            }
        }
    }
}