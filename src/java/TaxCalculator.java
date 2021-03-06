
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
            String s[]=request.getParameterValues("ast");
            String s3=request.getParameter("c1");
            String s4=request.getParameter("r1");
            String s5=request.getParameter("fb");
            
        //process-the-request
            int profTax=0;
            if(s4.equals("salary")){
                profTax=5000;
            }else{
                profTax=2000;
            }
            int nriTax=0;
            if(s3!=null){
                nriTax=5000;
            }
            int assetTax=0;
            if(s!=null){
                assetTax=s.length*1000;
            }
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
            response.setContentType("text/html");
            //response.setContentType("application/msword");
            PrintWriter out=response.getWriter();
            out.println("<html>");
            out.println("<body bgcolor=pink>");
            out.println("<h3>Thanks For Visiting Us. </h3>");
            out.println("<hr>");
            out.println("<table border=1>");
            out.println("<tr>");
            out.println("<td>Income</td>");
            out.println("<td>"+income+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Tax</td>");
            out.println("<td>"+tax+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Rebate</td>");
            out.println("<td>"+rebate+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>NetTax</td>");
            out.println("<td>"+nettax+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>AssetTax</td>");
            out.println("<td>"+assetTax+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>NRITax</td>");
            out.println("<td>"+nriTax+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Prof-Tax</td>");
            out.println("<td>"+profTax+"</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<h5>Assets </h5>");
            for(String tmp:s){
                out.println(tmp);
            }
            out.println("Your Feedback : "+s5);
            out.println("<hr>");
            out.println("<marquee><h4>Pay your taxes on time ...!!</h4></marquee>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        
    }
  
}