job('hello-world') {
    steps {
        shell('echo Hello World!')
    }

    logRotator {
        numToKeep(7)
    }
}