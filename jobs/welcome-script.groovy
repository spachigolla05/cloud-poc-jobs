job('welcome-script') {
    steps {
        shell('echo Welcome to groovy scripting!!!')
    }
    logRotator {
        numToKeep(7)
    }
}