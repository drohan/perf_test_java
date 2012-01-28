
import com.objy.db.app.ooObj;


// Class HelloObject represents the HelloWorld object
public class myObject extends ooObj
{
  /** String to contain the message */
  private String mHelloMsg;
  private double[] mArray;
  

  // constructor
  public myObject()
  {
	  mArray = new double[896];
  }

  // sets the helloMsg value to the provided value
  void setHelloMsg(String value)
  {
	markModified();
    mHelloMsg = value;
  }

  // returns the current helloMsg value
  String getHelloMsg()
  {
	fetch();
    return mHelloMsg;
  }
}
;
