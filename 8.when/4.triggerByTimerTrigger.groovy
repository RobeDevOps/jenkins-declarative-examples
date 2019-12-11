pipeline {
    agent none
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Schedule Deploy') {
            when {
                triggeredBy "TimerTrigger"
            }
            steps {
                echo 'Deploying...'
            }
        }
    }
}