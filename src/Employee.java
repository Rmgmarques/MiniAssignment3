import java.util.ArrayList;
import java.util.Iterator;

public class Employee extends UniversityMember {

    private int acctNo;
    public ArrayList<Support> supports;

    public Employee(String firstName, String lastName, int ssNo, int acctNo) {
        super(firstName, lastName, ssNo);
        this.acctNo = acctNo;
    }

    public int getAcctNo(){
        return acctNo;
    }

    public void addSupport( Support support){ supports.add(support); }

    public void remSupport( Support support){ supports.remove(support); }

    public Iterator<Support> getSupports(){ return supports.iterator(); }
}
