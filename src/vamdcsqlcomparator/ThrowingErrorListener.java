/**
 * Created by Levan Loria on 15/09/16.
 */

package vamdcsqlcomparator;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * This class changes the default behavior of syntax error handling.
 */
public class ThrowingErrorListener extends BaseErrorListener{

	/**
	 * Instance of ThrowingErrorListener class.
	 */
    public static final ThrowingErrorListener instance = new ThrowingErrorListener();

    
    /**
     * Redefines syntaxError function and throws ParseCancellationException instead of getting error message.
     * @throws ParseCancellationException Cancellation of parsing, after syntax error occurred.
     */
    @Override
    public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) throws ParseCancellationException {
        throw new ParseCancellationException("line" + line + ":" + charPositionInLine + " " + msg);
    }

 
}
