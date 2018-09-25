/**
 * Created by Administrator on 2018/9/24.
 */
public class PoxyUtil {


    public static void main(String[] args){



        sportActive sa= new sportActive();
        JumpAthlete ja = new JumpAthlete();
        sa.setFactory(ja);
        Athlete a1 =(Athlete) sa.getProxyInstance();
        a1.doSport();


        RunAthlete ra = new RunAthlete();
        sa.setFactory(ra);
        Athlete a2 =(Athlete) sa.getProxyInstance();
        a2.doSport();

    }


}
