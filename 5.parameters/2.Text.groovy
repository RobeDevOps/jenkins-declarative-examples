pipeline {
    agent any
    parameters {
        text(name: 'RELEASE_DESC', 
            defaultValue: '', 
            description: 'Long description for all new features in this release')
    }
    stages {
        stage('Deploy') {
            steps {
                echo "Details: ${params.RELEASE_DESC}"
            }
        }
    }
}