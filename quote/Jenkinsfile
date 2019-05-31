pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				input('Should We Continue?')
			}
		}
		stage('Test') {
			parallel {
				stage('Unit Test') {
					steps {
						echo 'Running Unit Test...'
					}
				}
				stage('Integration Test') {
					agent {
						docker {
							reuseNode false
							image 'ubuntu'
						}
					}
					steps {
						echo 'Running the integration test'
					}
				}
			}
		}
		stage('Deploy') {
			steps {
				echo 'Deploying..'
			}
		}
	}	
}
