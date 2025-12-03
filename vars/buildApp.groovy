def call(Map config = [:]) {
    echo "===== SHARED LIB: BUILD ====="

    if (config.appType == 'python') {
        sh """
            python3 -m pip install --upgrade pip
            pip install -r requirements.txt
        """
    } else {
        echo "Skipping build: unknown app type"
    }
}