package Algorithms.Greedy;

import com.sun.org.apache.xml.internal.utils.StringBufferPool;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;

/**
 * Jim and the Orders
 *
 * In Jim's Burger, n hungry burger fans are ordering burgers.
 * The ith order is placed by the ith fan at ti time and it takes di time to process.
 * What is the order in which the fans will get their burgers?
 *
 * Input Format
 * On the first line you will get n, the number of orders.
 * Then n lines will follow. On the (i+1)th line, you will get ti and di separated by a single space.
 *
 * Output Format
 * Print the order ( as single space separated integers ) in which the burger fans get their burgers.
 * If two fans get the burger at the same time, then print the smallest numbered order first.
 * (remember, the fans are numbered 1 to ).
 *
 * Constraints
 *
 * Sample Input #00
 * 3
 * 1 3
 * 2 3
 * 3 3
 *
 * Sample Output #00
 * 1 2 3
 *
 * Sample Input #01
 * 5
 * 8 1
 * 4 2
 * 5 6
 * 3 1
 * 4 3
 *
 * Sample Output #01
 * 4 2 5 1 3
 */
class Order implements Comparable<Order>{
    int arrive_time;
    int process_time;
    int id;

    Order(int arr, int pro, int id) {
        arrive_time = arr;
        process_time = pro;
        this.id = id;
    }

    @Override
    public int compareTo(Order o) {
        int deltaFinish = arrive_time + process_time - o.arrive_time - o.process_time;
        if(deltaFinish == 0) {
                return id - o.id;
        }
        else
            return deltaFinish;
    }
}

public class JimAndTheOrders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Order> res = new ArrayList<>();

        for(int i=1;i<=n;i++) {
            Order newOrder = new Order(sc.nextInt(), sc.nextInt(), i);
            res.add(newOrder);
        }

        Collections.sort(res);

        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<res.size();i++) {
            sb.append(res.get(i).id +" ");
        }

        sb.trimToSize();
        System.out.println(sb.subSequence(0, sb.length()-1).toString());
    }
}
