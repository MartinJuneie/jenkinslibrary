def call(Map config = [:]) {
    pipeline {
        agent any
        parameters {
            string(
                name: 'BRANCH_TO_BUILD',
                defaultValue: 'main',
                description: 'Enter the branch to build'
            )
        }
        stages {
            stage('Read and Print temp.txt') {
                steps {
                    script {
                        // Read the contents of temp.txt and print to console
                        def fileContent = readFile 'temp.txt'
                        echo "Contents of temp.txt:\n${fileContent}"
                    }
                }
            }
        }
    }
}
