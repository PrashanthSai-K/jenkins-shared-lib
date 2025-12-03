def call(Map config = [:]) {
    echo "===== SHARED LIB: DEPLOY ====="

    sh """
        docker build -t ${config.imageName ?: 'generic-app'} .
        docker run -d -p 5000:5000 --name ${config.containerName ?: 'app-container'} ${config.imageName ?: 'generic-app'}
    """
}
