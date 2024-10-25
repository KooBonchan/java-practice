package ExceptionHandling;

public class RangeException extends RuntimeException {
  public RangeException(String message) {
    super(message);
  }
  public RangeException(int n) {
    super("Out of range : value" + n);
  }
}

class ResultRangeException extends RangeException{
  public ResultRangeException(String message) {
    super(message);
  }

  public ResultRangeException(int n) {
    super(n);
  }
}
class ParameterRangeException extends RangeException{
  public ParameterRangeException(String message) {
    super(message);
  }

  public ParameterRangeException(int n) {
    super(n);
  }
}