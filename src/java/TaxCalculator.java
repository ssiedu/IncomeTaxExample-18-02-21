
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TaxCalculator extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //read-the-request
            String s1=request.getParameter("t1");   //value of income
            String s2=request.getParameter("t2");   //value of age
            
        //process-the-request
            int income=Integer.parseInt(s1);
            int age=Integer.parseInt(s2);
            int tax=0, rebate=0, nettax=0;
            if(income>=500000){
                tax=income*20/100;
            }else{
                tax=income*10/100;
            }
            
            if(age>=60){
                rebate=tax*10/100;
            }
            nettax=tax-rebate;
        
        //provide-the-response
        
            PrintWriter out=response.getWriter();
        
            out.print("Thanks For Visiting Us. ");
            out.println("Your Income : "+income);
            out.println("Your Tax    : "+tax);
            out.println("Your Rebate : "+rebate);
            out.println("Your Nettax : "+nettax);
            out.println("Pay your taxes on time ...!!");
            
            out.close();
        
    }
  
}