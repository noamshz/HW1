public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int[] distances = new int[m.length];
    for (int k = 0; k < m.length; k++){
    distances[k] = -1;
    }
    distances[i] = 0;
    int currentStep = 0;
    boolean madeProgress = true;
    while (madeProgress){
        madeProgress = false;
    for (int k = 0; k < m.length; k++){
        if (distances[k] == currentStep){
            for (int l = 0; l < m.length; l++){
                if (m[k][l] == 1 && distances[l] == -1){
                    distances[l] = currentStep + 1;
                    madeProgress = true;
                        distances[l] = currentStep + 1;
                        madeProgress = true;
                    }
                }
            }
        }

        currentStep++;
    }

    if (distances[j] != -1) {
        return distances[j];
    }
    
    return -1;
}


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}