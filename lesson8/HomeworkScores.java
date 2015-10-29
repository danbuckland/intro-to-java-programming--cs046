// BlueJ project: lesson8/collecting2

// TODO: Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private double lowestScore;
    private double sumScores;
    private int numberOfScores;
    private static final int MAX_SIZE = 1000;
    
    public HomeworkScores()
    {
        lowestScore = 9999.9;
        numberOfScores = 0;
    }

   /**
    *  Adds a score.
    *  @param score the score to add
    */
    public void addScore(double score)
    {
        if (score < lowestScore) {
            lowestScore = score;
        }
        sumScores += score;
        numberOfScores++;
    }

   /**
    *  Calculates the sum of all the scores entered, dropping the lowest
    *  score if there is more than one.
    *  @return the sum of all the scores in scores.
    */
    public double getTotalExcludingLowest()
    {
        if (numberOfScores <= 1) {
            return sumScores;
        } else {
            return sumScores - getLowest();
        }
    }

   /**
    *  Calculates the lowest score.
    *  @return the lowest score or 0 if there are no scores 
    */
    private double getLowest()
    {
        if (numberOfScores == 0) {
            return 0;
        } else {
            return lowestScore;
        }
    }       
}

