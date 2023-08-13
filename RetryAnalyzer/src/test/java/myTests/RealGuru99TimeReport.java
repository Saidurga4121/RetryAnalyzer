//package myTests;
//
//
//import java.util.Random;
//
//import org.testng.ITestContext;
//
//import org.testng.ITestListener;
//
//import org.testng.ITestResult;
//
//public class RealGuru99TimeReport implements ITestListener{
//
//    @Override
//    public void onStart(ITestContext arg0) 
//    {
//         System.out.println("Start Of Execution(TEST)->"+arg0.getName());
//    }
//    @Override
//    public void onTestStart(ITestResult arg0) 
//    {
//        System.out.println("Test Started->"+arg0.getName());
//    }
//    @Override
//    public void onTestSuccess(ITestResult arg0) 
//    {
//        System.out.println("Test Pass->"+arg0.getName());
//    }
//    @Override
//    public void onTestFailure(ITestResult arg0)
//    {
//    	String file="";
//    	try {
//			BaseClass.takeSnapShot(BaseClass.getDriver(), file);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	if(this.failTable==null)
//    	{
//    		
//    	}
//        System.out.println("Test Failed->"+arg0.getName());
//    }
//   
//    public void onTestfailure (ITestResult result) 
//    {
//    		// log("ontestfallure("+result+")");
//    		String file =System.getProperty("user.dir")+"\\"+"screenshot"+(new Random().nextInt())+ ".png";
//    		try 
//    		{ 
//    			BaseClass.takeSnapShot(BaseClass.getDriver(),file);
//    		}
//    		catch (Exception e) 
//    		{
//    		// TO00 Auto-generated catch block 
//    		e.printStackTrace();
//    		}
//    		if (this.failTable == null) 
//    		{
//    			this.failTable = new PdfPTable(new float [] {.3f, .3f, -1f, +3f}); 
//    			this.fallTable.setTotalwidth(20f);
//    			Paragraph p= new Paragraph("FAILED TESTS", new Font(Font.TIMES_ROMAN, Font.DEFAULTSIZE,Font.BOLD));
//    			p.setAlignment(Element.ALIGN_CENTER);
//    			PdfPCell cell = new PdfPcell(p);
//    			cell.setColspan(4);
//    			cell.setBackgroundColor (Color . RED);
//    			//
//    			Throwable throwable = result.getThrowable();
//    			if (throwable != null) 
//    			{
//    				this.throwableMap.put (new Integer(throwable.hashCode()), throwable);
//    				this.nbExceptions++;
//    				//
//    				Chunk indb = new Chunk("[SCREEN SHOT]", new Font (Font.TIMES_ROMAN, Font.DEFAULTSIZE, Font.UNDERLINE))
//    				indb.setAction(new PdfAction("file:///"+file));
//    				Paragraph excep = new Paragraph(throwable.tostring()).
//    			    excep. add (imdb);
//    			}
//    		}
//    }
//	@Override
//    public void onTestSkipped(ITestResult arg0) 
//    {
//        System.out.println("Test Skipped->"+arg0.getName());
//    }
//    @Override
//    public void onFinish(ITestContext arg0) 
//    {
//    	System.out.println("END Of Execution(TEST)->"+arg0.getName());
//    }
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
//    {
//
//    }
//
//    
//
//}
