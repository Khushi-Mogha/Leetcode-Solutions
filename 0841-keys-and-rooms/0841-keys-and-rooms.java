class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int i,j=0;
       boolean visited[]=new boolean[rooms.size()];
        visited[0]=true;
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(0);
        while(!q.isEmpty()){
            int index=q.peek();
            q.remove();
            visited[index]=true;
            for(j=0;j<rooms.get(index).size();j++)
            if(visited[rooms.get(index).get(j)]!=true)
            q.add(rooms.get(index).get(j));
        }
        for(boolean k:visited)
        if(k==false)
        return false;
       
        return true;
    }
}