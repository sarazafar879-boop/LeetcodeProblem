class Solution {
    public boolean isafe(char [][]board,int x,int y)
    {
                int r,c;
        //in a col
        r=x-1;
        c=y;
        while(r>=0)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
            r--;
        }
        //leftdiagonal
        r=x;
        c=y;
        while(r>=0&&c>=0)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
            r--;
            c--;
        }
        //rightdiagonal
        r=x;
        c=y;
        while(r>=0&&c<board.length)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    public void solve(char[][] board ,int x,int n,List<List<String>> ans)
    {
        if(x==n)
        {
            List<String> temp=new ArrayList<>();
             for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }
        for(int y=0;y<n;y++)
        {
            if(isafe(board,x,y))
            {
                board[x][y]='Q';
                solve(board,x+1,n,ans);
                board[x][y]='.';
            }

        }
    }
    public List<List<String>> solveNQueens(int n) {
        char [][] board =new char[n][n];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        solve(board,0,n,ans);
        return ans;
        
    }  
        
}
