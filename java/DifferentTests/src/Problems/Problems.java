package Problems;

public class Problems {
    public static void main(String[] args) {
        int time=1;
        boolean flag = false;
        int[][] a = {{2,1,0,2,1}, {0,0,1,2,1}, {1,0,0,2,1}};
        int r=3,c=5;
        while(true) {
            boolean modified=false;
            for(int i=0;i<r;i++) {
                for(int j=0;j<c;j++) {
                    if (a[i][j] == (2 +time-1)) {
                        if ((j+1 < c) && (a[i][j+1] == 1)) {
                            modified = true;
                            a[i][j+1] = a[i][j] + 1;
                        }
                        if ((j-1 >= 0) && a[i][j-1] == 1) {
                            modified = true;
                            a[i][j-1] = a[i][j] + 1;
                        }
                        if ((i+1 <r) && a[i+1][j] == 1) {
                            modified = true;
                            a[i+1][j] = a[i][j] + 1;
                        }
                        if((i-1 >=0 ) && a[i-1][j] == 1) {
                            modified = true;
                            a[i-1][j] = a[i][j] + 1;
                        }
                    }
                }
            }
            for(int i=0;i<r;i++) {
                for(int j=0;j<c;j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            if(modified == true) {
                time++;
                modified =false;
                continue;
            } else {
                for(int i=0;i<r;i++) {
                    for(int j=0;j<c;j++) {
                        if (a[i][j] == 1) {
                            flag = true;
                        }
                    }
                }
            }
            if(flag == true) {
                System.out.println("-1");
                break;
            } else {
                System.out.println(time-1);
                break;
            }
        }
    }
}
