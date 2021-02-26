<html>
    <body>
        <h3>Details-Submission-Form</h3>
        <hr>
        <form action="TaxCalculator" method="get">
            <pre>
            Income  <input type="text" name="t1"/>
            Source  Salary      <input type="radio" name="r1" value="salary" /> 
                    Business    <input type="radio" name="r1" value="business" checked="checked"/>    
            Age     <input type="text" name="t2"/>
            Assets  <select name="ast" multiple="multiple">
                        <option>car</option>
                        <option>flat</option>
                        <option>plot</option>
                        <option>gold</option>
                        <option>diamonds</option>
                    </select>
            NRI?    <input type="checkbox" name="c1" value="yes"/>
            Fdbk    <textarea rows="5" cols="60" name="fb"></textarea>
                    <input type="submit" value="Find-Tax"/>
                    <input type="reset"/>
                    <input type="button" value="Demo"/>
            </pre>
        </form>
        <hr>
        <a href="index.html">Home</a>
    </body>
</html>
