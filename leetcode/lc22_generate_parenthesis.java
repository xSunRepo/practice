class Solution {
    
    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();
        char[] parenthesis = new char[2*n];
        backtrack(res, parenthesis, n, 0, 0);
        return res;
    }

    private void backtrack(List<String> outputs, char[] parenthesis, int n, int opens, int closes) {
        if(opens == n && closes == n) {
            outputs.add(new String(parenthesis));
            return;
        }

        int i = opens+closes;
        if(opens < n) {
            parenthesis[i] = '(';
            backtrack(outputs, parenthesis, n, opens+1, closes);
        }
        if(closes < opens) {
            parenthesis[i] = ')';
            backtrack(outputs, parenthesis, n, opens, closes+1);
        }
    }
    
}