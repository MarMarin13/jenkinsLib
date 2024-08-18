def call(String name = 'human') {
  echo "Hello, ${name}. AAAAAAA"
}

def build_stage(String name, String image) {
  echo "Creating image ${image} in stage ${name}"
}