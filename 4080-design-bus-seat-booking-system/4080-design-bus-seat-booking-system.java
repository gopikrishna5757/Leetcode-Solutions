class BusBooking {
    int n;
    int[][] a;
     int count;
    int totaltime;

    public BusBooking(int n) {
        a = new int[n + 1][4];
        this.n = n;
        totaltime = 0;
        this.count=count;
    }

    public void toggle(String seat) {
        int n = seat.length();
        int col = 0;
        if (seat.substring(0, 1).equals("B")) {
            col = 1;
        } else if (seat.substring(0, 1).equals("C")) {
            col = 2;
        } else if (seat.substring(0, 1).equals("D")) {
            col = 3;
        }
        int row = Integer.parseInt(seat.substring(1, n));
        if (a[row][col] != 0) {
            totaltime -= a[row][col];
            a[row][col] = 0;
            count--;

        } else {
            count++;
            if (col == 1 || col == 2) {
                a[row][col] = 1;
                totaltime += 1;
            } else if (col == 0) {
                if (a[row][1] != 0) {
                    a[row][col] = 3;
                    totaltime += 3;
                } else {
                    a[row][col] = 1;
                    totaltime += 1;
                }
            } else {
                if (a[row][2] != 0) {
                    a[row][col] = 3;
                    totaltime += 3;
                } else {
                    a[row][col] = 1;
                    totaltime += 1;
                }
            }
        }

    }

    public int getTotalTime() {

        return totaltime;

    }

    public int getMinTime() {
        return count;

    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */