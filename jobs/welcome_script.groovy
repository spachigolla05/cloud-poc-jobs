job('welcome_script') {
    steps {
        shell('echo Welcome to groovy scripting!!!')
    }
    logRotator {
        numToKeep(7)
    }
}