def buildStage(String name, String image) {
    return {
        stage(name) {
            steps {
                echo "Creating image ${image} in stage ${name}"
                docker.build(image)
            }
        }
    }
}