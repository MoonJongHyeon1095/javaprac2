package w3d5;

public class StudentScore {

    // static
    private static int serialIndex;
    private static int[] allScores;

    private int myIndex;
    private int score;

    public static int[] getAllScores() {
        return allScores;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        // TODO: 구현 부분
        this.score = score;
        allScores[myIndex] = score;
    }

    public StudentScore(int score) {
        // TODO: 구현 부분
        this.score = score;
        myIndex = serialIndex++;

        if (allScores == null) {
            allScores = new int[]{score};
        } else {
            int[] newScores = new int[allScores.length + 1];
            System.arraycopy(allScores, 0, newScores, 0, allScores.length);
            newScores[newScores.length - 1] = score;
            allScores = newScores;
        }
    }

    private static void addAllScore(int score) {
        // TODO: 구현 부분
        if (allScores == null) {
            allScores = new int[]{score};
        } else {
            int[] newScores = new int[allScores.length + 1];
            System.arraycopy(allScores, 0, newScores, 0, allScores.length);
            newScores[newScores.length - 1] = score;
            allScores = newScores;
        }
    }
}