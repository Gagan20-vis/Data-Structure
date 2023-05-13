//import java.util.*;
//public class N_Queens {
//    public List<List<String>> queen(int n){
//        char[][] board = new char[n][n];
//        List<List<String>> ans = new ArrayList<>();
//        for(int i = 0;i<n;i++) Arrays.fill(board[i],'.');
//        solve(0,board,ans);
//        return ans;
//    }
//    private boolean solve(int ind,char[][] board,List<List<String>> ans){
//        if(ind==board.length){
//            List<String> temp = new ArrayList<>();
//            for (char[] chars : board) temp.add(new String(chars));
//            ans.add(temp);
//            return true;
//        }
//        for(int i =0;i<board.length;i++){
//            for(int j = 0;j<board[0].length;i++){
//                if(board[i][j]=='.'){
//                    if(isSafe(board,i,j)){
//                        board[i][j] = 'Q';
//
//                    }
//                }
//            }
//        }
//    }
//    private boolean isSafe(char[][] board,int row,int col){
//        for(int i = 0;i<row;i++)
//            if(board[i][col]=='Q') return false;
//        for(int i = row-1,j=col-1;i>=0 && j>=0;i--,j--)
//            if(board[i][j]=='Q') return false;
//        for(int i = row-1,j=col+1;i>=0 && j<board.length;i--,j++)
//            if(board[i][j]=='Q') return false;
//        return true;
//    }
//}
