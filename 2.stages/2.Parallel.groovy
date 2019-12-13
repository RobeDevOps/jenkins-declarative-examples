pipeline {
    agent any
    stages{
        stage('Build') {
            steps {
                parallel(
                ubuntu: {
                    echo "Comiling ubuntu"
                }
                windows: {
                    echo "Compiling windows"
                },
                macOs: {
                    echo "Compiling MacOS"
                }
                )
            }
        }
    }
}
