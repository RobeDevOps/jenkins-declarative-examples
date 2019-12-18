pipeline {
    agent any
    parameters {
        string(name: 'TARGET_ENV', defaultValue: 'PROD', description: 'Environment')
    }
    stages {
        stage('BUILD') {
            steps {
                echo "Compiling ... "
                sleep 5
            }
        }
        stage('DEPLOY'){
            steps{
                script{
                    build job: 'ReleaseJob', 
                    parameters: [
                        [ $class: 'StringParameterValue', name: 'FROM_BUILD', value: "${BUILD_NUMBER}" ]                        
                    ]
                }
            }
        }
    }
}