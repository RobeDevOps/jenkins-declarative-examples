pipeline {
    agent any
    stages{
        stage('Build') {
            steps {
                parallel(
                ubuntu: {
                    echo "Comiling ubuntu"
                    sleep 10
                }
                windows: {
                    echo "Comiling windows"
                    sleep 20
                },
                extraOS: {
                    echo "Comiling extraOS "
                    sleep 5
                }
                )
            }
        }
    }
}
