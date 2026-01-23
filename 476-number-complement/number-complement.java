class Solution {
    public int findComplement(int num) {
        long digits = (long) (Math.log(num) / Math.log(2)) + 1;
        long tmp = (long) Math.pow(2, digits) - 1;
        return (int) tmp - num;
    }
}