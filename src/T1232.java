//check-if-it-is-a-straight-line 缀点成线
//求直线的表达式带入即可，需要考虑斜率无穷大情况
class T1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int x1 = coordinates[1][0];
        int y0 = coordinates[0][1];
        int y1 = coordinates[1][1];
        if(x0 == x1)
            for (int i = 2; i < coordinates.length; i++) {
                if(coordinates[i][0] != x0)
                    return false;
            }
        else {
            double k = ((y1 - y0) * 1.0 / (x1 - x0));
            double b = y1 - k * x1;
            for (int i = 2; i < coordinates.length; i++) {
                if (Math.abs((k * coordinates[i][0] + b) - (coordinates[i][1])) > 10e-6)
                    return false;
            }
        }
        return true;
    }
}