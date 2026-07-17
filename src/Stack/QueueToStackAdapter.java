package Stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapter {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;
    public QueueToStackAdapter(){
        mainQ = new ArrayDeque<>();
        helperQ = new ArrayDeque<>();
    }

    int pop(){
        if (mainQ.isEmpty()){
            return -1;
        }else{
            return mainQ.remove();
        }
    }
    int top(){
        if (mainQ.isEmpty()){
            return -1;
        }else{
            return mainQ.peek();
        }
    }

    void push(int val){
        while(!mainQ.isEmpty()){
            helperQ.add(mainQ.remove());
        }

        mainQ.add(val);

        while(!helperQ.isEmpty()){
            mainQ.add(helperQ.remove());
        }
    }
    static void main() {
        QueueToStackAdapter st = new QueueToStackAdapter();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top());    // 30

        System.out.println(st.pop());    // 30

        System.out.println(st.top());    // 20

        System.out.println(st.pop());    // 20
        System.out.println(st.pop());    // 10


    }
}
