package myTests;

import java.util.Collection;

import java.util.Date;

import java.util.List;

import java.util.Map;

import java.util.Set;

import org.testng.IReporter;

import org.testng.IResultMap;

import org.testng.ISuite;

import org.testng.ISuiteResult;

import org.testng.ITestContext;

import org.testng.ITestNGMethod;

import org.testng.xml.XmlSuite;

public class Guru99Reporter implements IReporter
{
    @Override
    public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,String outputDirectory) 
    {
        for (ISuite iSuite : arg1) 
        {
            Map<String,ISuiteResult> results =    iSuite.getResults();
            Set<String> keys = results.keySet();
            for (String key : keys) 
            {
            	ITestContext context = results.get(key).getTestContext();

                System.out.println("Suite Name->"+context.getName()

                    + "::Report output Ditectory->"+context.getOutputDirectory()

                     +"::Suite Name->"+ context.getSuite().getName()

                     +"::Start Date Time for execution->"+context.getStartDate()

                     +"::End Date Time for execution->"+context.getEndDate());

                //Get Map for only failed test cases

                IResultMap resultMap = context.getFailedTests();

                //Get method detail of failed test cases

                Collection<ITestNGMethod> failedMethods = resultMap.getAllMethods();

                //Loop one by one in all failed methods

                System.out.println("--------FAILED TEST CASE---------");

                for (ITestNGMethod iTestNGMethod : failedMethods) 
                {

	                //Print failed test cases detail
	
	                System.out.println("TESTCASE NAME->"+iTestNGMethod.getMethodName()

                        +"\nDescription->"+iTestNGMethod.getDescription()

                        +"\nPriority->"+iTestNGMethod.getPriority()

                        +"\n:Date->"+new Date(iTestNGMethod.getDate()));
            }

        }

        }

        

    }

}