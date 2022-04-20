import com.any.finishcoursetwo.exception.QuestionExistsException;
import com.any.finishcoursetwo.model.Question;
import com.any.finishcoursetwo.serviceimpl.JavaQuestionServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class JavaQuestionServiceImplTest {

    private final JavaQuestionServiceImpl out = new JavaQuestionServiceImpl();
    @Test
    public void shouldCheckExceptionForAdd() {
        Question actual = out.add(ConstantsTest.FIRST_QUESTION, ConstantsTest.FIRST_ANSWER);
        assertEquals(ConstantsTest.QUESTION1, actual);
        assertThrows(QuestionExistsException.class, () -> out.add(ConstantsTest.FIRST_QUESTION, ConstantsTest.FIRST_ANSWER));
         }

    @Test
    public void shouldCheckExceptionForRemove() {
        out.add(ConstantsTest.FIRST_QUESTION, ConstantsTest.FIRST_ANSWER);
        out.remove(ConstantsTest.FIRST_QUESTION, ConstantsTest.FIRST_ANSWER);
        assertThrows(QuestionExistsException.class, () -> out.remove(ConstantsTest.FIRST_QUESTION, ConstantsTest.FIRST_ANSWER));

    }

}