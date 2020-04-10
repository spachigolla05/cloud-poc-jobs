job('hello_world') {
    steps {
        shell('echo Hello World!')
    }

    logRotator {
        numToKeep(7)
    }
}