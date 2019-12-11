pipeline {
    agent any
    parameters {
        booleanParam(name: 'RUN_TESTS', defaultValue: false, description: 'Enable test execution?')
    }
    stages {
        stage('Deploy') {
            steps {
                sh """
                if [ "${params.RUN_TESTS}" = true ] ; then
                    echo "Running test suite"
                fi
                """
            }
        }
    }
}