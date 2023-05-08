import java.util.Stack;

public class LargestRectangleInHistogramSecond{
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,3,2};
        int[] area = new int[heights.length];
        area = findArea(heights);
        int ans = findMax(area);
        System.out.println(ans);
    }

    public static int findMax(int[] area){
        int max = area[0];
        for(int i=1; i<area.length; i++){
            max = Math.max(max, area[i]);
        }
        return max;
    }

    public static int[] findArea(int[] heights){
        int[] area = new int[heights.length];
        int[] ns = new int[heights.length];
        int[] ps = new int[heights.length];

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Find previous smaller elements
        for(int i=0; i<heights.length; i++){
            while(!stack1.isEmpty() && heights[stack1.peek()] >= heights[i]){
                stack1.pop();
            }
            if(stack1.isEmpty()){
                ps[i] = -1;
            }else{
                ps[i] = stack1.peek();
            }
            stack1.push(i);
        }

        // Find next smaller elements
        for(int i=heights.length-1; i>=0; i--){
            while(!stack2.isEmpty() && heights[stack2.peek()] >= heights[i]){
                stack2.pop();
            }
            if(stack2.isEmpty()){
                ns[i] = heights.length;
            }else{
                ns[i] = stack2.peek();
            }
            stack2.push(i);
        }

        // Calculate area for each element
        for(int i=0; i<heights.length; i++){
            area[i] = (ns[i] - ps[i] - 1)* heights[i];
        }

        return area;
    }
}