class Solution {
    public int calPoints(String[] ops) {
        List<Integer> record = new ArrayList<>();
       
        for (String op : ops) {
            if (op.equals("C")) {
                record.remove(record.size() - 1);
            }
            else if (op.equals("D")) {
                record.add(record.get(record.size() - 1) * 2);
            }
            else if (op.equals("+")) {
                int size = record.size();
                record.add(record.get(size - 1) + record.get(size - 2));
            }
            else {
                record.add(Integer.parseInt(op));
            }
        }
       
        int sum = 0;
        for (int score : record) {
            sum += score;
        }
       
        return sum;
    }
}
