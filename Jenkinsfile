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
	    stage('functional test')
	    {
		    step
		    {
			    blazeMeterTest credentialsId: '123', getJtl: true, getJunit: true, testId: '7421600.functionalApi', workspaceId: '390025'
		    }
	    }
    }
}

