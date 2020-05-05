public class Solution_level2b {

    public static int[] solution(int h, int[] q) {
        int[] p = new int[q.length];

        for (int i = 0; i < q.length; i++) {
            p[i] = get_parent_index(h, q[i]);
        }
        return p;
    }

    public static int get_parent_index(int h, int idx) {
        int max_idx = (int) (Math.pow(2, h) - 1);
        if (max_idx < idx) return -1;
        else {
            int node_offset = 0;
            boolean continue_flag = true;
            int subtree_size = max_idx;
            int result = -1;

            while (continue_flag) {
                if (subtree_size == 0) continue_flag = false;

                subtree_size = Math.floorDiv(subtree_size, 2);
                int left_node = node_offset + subtree_size;
                int right_node = left_node + subtree_size;
                int my_node = right_node + 1;

                if ((left_node == idx) || (right_node == idx)) {
                    result = my_node;
                    continue_flag = false;
                }
                if (idx > left_node) node_offset = left_node;
            }

            return result;
        }

    }
}
