import com.any.finishcoursetwo.exception.TooLargeAmountQuestionException;
import com.any.finishcoursetwo.service.QuestionService;
import com.any.finishcoursetwo.serviceimpl.ExaminerServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private QuestionService questionService;

    @InjectMocks
    private ExaminerServiceImpl out;

    @Test
    public void shouldCheckAmountQuestionException() {
        when(questionService.getAll()).thenReturn(ConstantsTest.QUESTIONS);
        assertThrows(TooLargeAmountQuestionException.class, () -> out.getQuestions(6));
    }
}
