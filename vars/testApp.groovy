def call(Map config = [:]) {
    echo "===== SHARED LIB: TEST ====="

    if (config.appType == 'python') {
        sh """
            pip install pytest
            pytest -q
        """
    } else {
        echo "Skipping tests: unknown app type"
    }
}
