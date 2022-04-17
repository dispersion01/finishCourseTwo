import com.any.finishcoursetwo.model.Question;

import java.util.Set;

public class ConstantsTest {
    public static final String FIRST_QUESTION = "When ... ?";
    public static final String FIRST_ANSWER = "Today";
    public static final String SECOND_QUESTION = "Where ... ?";
    public static final String SECOND_ANSWER = "Here";
    public static final String THIRD_QUESTION = "Why ... ?";
    public static final String THIRD_ANSWER = "Because";
    public static final String FOURTH_QUESTION = "What ... ?";
    public static final String FOURTH_ANSWER = "There";
    public static final String FIFTH_QUESTION = "Who ... ?";
    public static final String FIFTH_ANSWER = "You";
    public static final String SIXTH_QUESTION = "Which ... ?";
    public static final String SIXTH_ANSWER = "That";
    public static final Question QUESTION1 = new Question(FIRST_QUESTION, FIRST_ANSWER);
    public static final Question QUESTION2 = new Question(SECOND_QUESTION, SECOND_ANSWER);
    public static final Question QUESTION3 = new Question(THIRD_QUESTION, THIRD_ANSWER);
    public static final Question QUESTION4 = new Question(FOURTH_QUESTION, FOURTH_ANSWER);
    public static final Question QUESTION5 = new Question(FIFTH_QUESTION, FIFTH_ANSWER);
    public static final Question QUESTION6 = new Question(SIXTH_QUESTION, SIXTH_ANSWER);
    public static final Set<Question> QUESTIONS = Set.of(QUESTION1, QUESTION2, QUESTION3, QUESTION4, QUESTION5, QUESTION6);



}
