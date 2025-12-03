def call(Map config = [:]) {
    echo "===== SHARED LIB: DEPLOY ====="

    sh """
        docker build -t ${config.imageName ?: 'generic-app'} .
    """
}
