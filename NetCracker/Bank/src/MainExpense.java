/**
 * Created by likvidator on 23.03.15.
 */
public class MainExpense {
    private double expense;
    MainExpense(double expense){
        this.expense=expense;
    }

    public double check(){
        return this.expense;
    }

    public boolean put(double sum){
        this.expense+=sum;
        return true;
    }
    public boolean take(double sum){
        if(this.expense>=sum){
            this.expense-=sum;
            return true;
        }
        return false;
    }
}
