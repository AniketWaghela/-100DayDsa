class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> set = new HashSet<>();

        for(int[] i: obstacles) set.add(Arrays.toString(i));
        
        int dx=0,dy=1,x=0,y=0,dist=0;

        for(int co: commands){
            if( co == -1 ){
                int temp =dx;
                dx = dy;
                dy = -temp;
            }
            else if( co == -2 ){
                int temp =dy;
                dy = dx;
                dx = -temp;
            }
            else{
                for(int i=0;i<co;i++){
                    if( set.contains(Arrays.toString(new int[]{x+dx,y+dy})) ) break;
                    x=x+dx;
                    y=y+dy;
                }
                dist = Math.max(dist, x*x + y*y );
            }
        }
        return dist;
    }
}