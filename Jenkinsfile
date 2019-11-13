@Library('jenkins-shared-library')_
pipeline {
    agent any
    tools {
        maven "Maven"   
    }   
  
    stages {
        stage('Compile-Build-Test ') {
            steps {
	    	slackNotify 'Building Started'
                build 'BUILD'
            }
        }
