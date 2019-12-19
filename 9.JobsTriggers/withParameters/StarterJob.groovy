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
                    def releaseJob = build job: 'ReleaseJob', propagate: false 
                    parameters: [
                        [ $class: 'StringParameterValue', name: 'FROM_BUILD', value: "${BUILD_NUMBER}" ],
                        [ $class: 'BooleanParameterValue', name: 'IS_READY', value: true ]                        
                    ]

                    if(releaseJob.result != "SUCCESS"){
                        echo "Release status: ${releaseJob.result}"
                    }
                }
            }
        }
    }
}