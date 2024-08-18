def buildStage(String name, String image) {
    script {
    echo "Creating image ${image} in stage ${name}"
    docker.build(image)
    }
}