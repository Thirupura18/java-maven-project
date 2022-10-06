pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        build(quietPeriod: 5, job: 'clean install')
      }
    }

  }
}