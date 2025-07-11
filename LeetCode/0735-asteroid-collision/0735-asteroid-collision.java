class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> sc=new Stack<>();
        for(int Asteroids:asteroids){
            boolean alive=true;
            while(!sc.isEmpty()&& Asteroids <0&&sc.peek()>0){
                if(sc.peek()<-Asteroids){
                    sc.pop();
                    continue;
                }
                else if(sc.peek()==-Asteroids){
                    sc.pop();

                }
                alive=false;
                break;
            }
            if(alive){
                sc.push(Asteroids);
            }
        }
        int[] result=new int[sc.size()];
        for(int i=sc.size()-1;i>=0;--i){
            result[i]=sc.pop();
        }
        return result;
    }
}