def buildStage(String name, String image) {
    echo "Creating image ${image} in stage ${name}"
    docker.build(image)
    }
}