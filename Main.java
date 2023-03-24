public class Main {
    public static void main(String[] args) {
        
    }
    static int[] UnShift(int[] arr) {
        int[] arr0 = new int[arr.length - 1];
        for (int i = 0; i < arr0.length; i++) {
            arr0[i] = arr[i + 1];
        }
        return arr0;
    }


    static int[] deleteIndex(int[] arr, int x) {
        int[] arr0 = new int[arr.length - 1];
        for (int i = 0, z = 0; i < arr.length; i++) {
            if (i != x) {
                arr0[z] = arr[i];
                z++;
            }
        }
        return arr0;
    }


    static int[] swap(int[] arr, int z, int x) {
        int[] arr0 = new int[arr.length + 1];
        for (int i = 0, w = 0; i < arr0.length; i++) {
            if (i != z) {
                arr0[i] = arr[w];
                w++;
            } else {
                arr0[z] = x;
            }
        }
        return arr0;
    }

    static int countSmallLetter(char[] chArray) {
        char[] chArray0 = new char[chArray.length];
        int x = 0;
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == 'a' && chArray0[0] == 0) {
                chArray0[0] = chArray[i];
                x++;
            } else if (chArray[i] == 'b' && chArray0[1] == 0) {
                x++;
                chArray0[1] = chArray[i];
            } else if (chArray[i] == 'c' && chArray0[2] == 0) {
                x++;
                chArray0[2] = chArray[i];
            } else if (chArray[i] == 'd' && chArray0[3] == 0) {
                x++;
                chArray0[3] = chArray[i];
            } else if (chArray[i] == 'e' && chArray0[4] == 0) {
                x++;
                chArray0[4] = chArray[i];
            } else if (chArray[i] == 'f' && chArray0[5] == 0) {
                x++;
                chArray0[5] = chArray[i];
            }
        }
        return x * 2;
    }

    static int countSymbolASCIIMathematical(char[] chArray) {
        int x = 0;
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] > 64 && chArray[i] < 91) {
                x++;
            }
        }
        return x;
    }

    static int[] symbolASCIIMathematical(char[] chArray) {
        int[] arr = new int[countSymbolASCIIMathematical(chArray)];
        int v = 0;
        for (int i = 0; i < chArray.length; i++) {
            for (int r = i + 1; r < chArray.length; r++) {
                if (chArray[r] == '+' && (chArray[i] > 64 && chArray[i] < 91)) {
                    arr[v] = chArray[i] + (chArray[i] + 32);
                    v++;
                    r = chArray.length;
                } else if (chArray[r] == '-' && (chArray[i] > 64 && chArray[i] < 91)) {
                    arr[v] = chArray[i] - (chArray[i] + 32);
                    v++;
                    r = chArray.length;
                } else if (chArray[r] == '/' && (chArray[i] > 64 && chArray[i] < 91)) {
                    arr[v] = chArray[i] / (chArray[i] + 32);
                    v++;
                    r = chArray.length;
                } else if (chArray[r] == '*' && (chArray[i] > 64 && chArray[i] < 91)) {
                    arr[v] = chArray[i] * (chArray[i] + 32);
                    v++;
                    r = chArray.length;
                } else if (chArray[i] < 65 && chArray[i] > 92) {
                    r = chArray.length;
                }
            }
        }
        return arr;
    }

    static int[] mathematicalOperation(char[] chArray) {
        int[] arr = new int[countMathematicalOperation(chArray)];
        for (int i = 0, v = 0; i < chArray.length; i++) {
            if ((chArray[i] == '+' || chArray[i] == '-' || chArray[i] == '*' || chArray[i] == '/')
                    && chArray[i - 2] > 47 && chArray[i - 2] < 58 && chArray[i - 1] > 47 && chArray[i - 1] < 58) {
                if (chArray[i] == '+') {
                    int z = chArray[i - 2] - '0';
                    int w = chArray[i - 1] - '0';
                    int r = z + w;
                    arr[v] = r;
                } else if (chArray[i] == '-') {
                    int z = chArray[i - 2] - '0';
                    int w = chArray[i - 1] - '0';
                    int r = z - w;
                    arr[v] = r;
                } else if (chArray[i] == '/') {
                    int z = chArray[i - 2] - '0';
                    int w = chArray[i - 1] - '0';
                    int r = z / w;
                    arr[v] = r;
                } else {
                    int z = chArray[i - 2] - '0';
                    int w = chArray[i - 1] - '0';
                    int r = z * w;
                    arr[v] = r;
                }
                v++;
            }
        }
        return arr;
    }

    static int countMathematicalOperation(char[] chArray) {
        int x = 0;
        for (int i = 0; i < chArray.length; i++) {
            if ((chArray[i] == '+' || chArray[i] == '-' || chArray[i] == '*' || chArray[i] == '/')
                    && chArray[i - 2] > 47 && chArray[i - 2] < 58 && chArray[i - 1] > 47 && chArray[i - 1] < 58) {
                x++;
            }
        }
        return x;
    }

    static char[] smallBigLetter(char[] chArray) {
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] > 96 && chArray[i] < 123) {
                chArray[i] = chArray[i] -= 32;
            }
        }
        return chArray;
    }


    static int countAction(int[] arr, int[] arr0) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int z = 0; z < arr0.length; z++) {
                int w = arr0[z] - arr[i];
                if (w == 0) {
                    x += 1;
                }
            }
        }
        return x;
    }

    static char[] countSameNum(int[] arr, int[] arr0) {
        char[] chArray = new char[countAction(arr, arr0)];
        char r = 49;
        for (int i = 0, v = 0; i < arr.length; i++) {
            for (int z = 0; z < arr0.length; z++) {
                int w = arr0[z] - arr[i];
                if (w == 0) {
                    chArray[v] = r;
                    r += 1;
                    v += 1;
                }
            }
        }
        return chArray;
    }

    static int[] XMum(int x) {
        int[] arr = new int[countXNum(x)];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = x % 10;
            x = x / 10;
        }
        return arr;
    }

    static int countXNum(int x) {
        int z = 0;
        for (int i = x; i > 0; ) {
            i = i / 10;
            z++;
        }
        return z;
    }

    static boolean checkSameNum(int[] arr, int z) {
        for (int i = 0; i < arr.length; i++) {
            if (z == arr[i]) {
                return true;
            }
        }
        return false;
    }

    static int[] add(int[] arr, int z) {
        int[] arr0 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr0[i] = arr[i];
        }
        arr0[arr0.length - 1] = z;
        return arr0;
    }


    static int countOdd(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                x += 1;
            }
        }
        return x;
    }

    static int[] newArrayCountOdd(int[] arr) {
        int[] arr0 = new int[countOdd(arr)];
        for (int z = 0, i = 0; i < arr0.length; i++) {
            if (arr[i] % 2 != 0) {
                arr0[z] = arr[i];
                z++;
            }
        }
        return arr0;
    }

    static int countPrime(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int z = 2; z < arr[i]; z++) {
                if (arr[i] % z == 0) {
                    z = arr[i];
                } else if (z == arr[i] - 1) {
                    x += 1;
                }
            }
        }
        return x;
    }

    static int countEven(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                x += 1;
            }
        }
        return x;
    }

    static int[] newArrayCountEven(int[] arr) {
        int[] arr0 = new int[countEven(arr)];
        for (int z = 0, i = 0; i < arr0.length; i++) {
            if (arr[i] % 2 == 0) {
                arr0[z] = arr[i];
                z++;
            }
        }
        return arr0;
    }

    static int[] newArrayCountPrime(int[] arr) {
        int[] arr0 = new int[countPrime(arr)];
        for (int w = 0, i = 0; i < arr0.length; i++) {
            for (int z = 2; z < arr[i]; z++) {
                if (arr[i] % z == 0) {
                    z = arr[i];
                } else if (z == arr[i] - 1) {
                    arr0[w] = arr[i];
                    w++;
                }
            }
        }
        return arr0;
    }

    static int numMaxSumEvenOdd(int[] arr) {
        int x = 0;
        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                x += arr[i];
            } else {
                z += arr[i];
            }
        }
        if (x > z) {
            return x;
        }
        return z;
    }

    static int[] shiftNum(int[] arr, int x) {
        int[] arr0 = new int[arr.length + 1];
        arr0[0] = x;
        for (int i = 0; i < arr.length; i++) {
            arr0[i + 1] = arr[i];
        }
        return arr0;
    }

    static boolean checkSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean checkSameNumArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int z = i + 1; z < arr.length; z++) {
                if (arr[i] == arr[z]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean primeNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = 0;
            for (int z = 2; z < arr[i]; z++) {
                if (arr[i] % z == 0) {
                    z = arr[i];
                } else if (z >= arr[i] - 1) {
                    x = arr[i];
                    return true;
                }
            }
        }
        return false;
    }

    static int[] shiftInt(int[] arr) {
        int[] arr0 = new int[arr.length - 1];
        for (int i = 0, z = 1; i < arr0.length; i++, z++) {
            arr0[i] = arr[z];
        }
        return arr0;
    }

    static int[] pop(int[] arr) {
        int[] arr0 = new int[arr.length - 1];
        for (int i = 0; i < arr0.length; i++) {
            arr0[i] = arr[i];
        }
        return arr0;
    }

    static int[] reverseArray(int[] arr) {
        for (int i = 0, z = arr.length - 1; i < arr.length / 2; i++, z--) {
            int x = arr[i];
            arr[i] = arr[z];
            arr[z] = x;
        }
        return arr;
    }

    static int minEvenNum(int[] arr) {
        int z = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0 && arr[i] < z) {
                z = arr[i];
            }
        }
        return z;
    }

    static int maxOddNum(int[] arr) {
        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > z) {
                z = arr[i];
            }
        }
        return z;
    }

    static int[] minAndMuxNum(int[] arr) {
        int[] arr0 = new int[2];
        int z = 1;
        int x = 0;
        for (int i = 1; i < arr.length; i++) {
            if (z <= arr[i]) {
                z = arr[i];
            }
            if (x >= arr[i]) {
                x = arr[i];
            }
        }
        arr0[0] = z;
        arr0[1] = x;
        return arr0;
    }

    static int[] sortArray(int[] arr) {
        int[] arr0 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            for (int z = i; z < arr.length; z++) {
                if (x >= arr[z]) {
                    x = arr[z];
                    arr[z] = arr[i];
                    arr[i] = x;
                }
            }
            arr0[i] = x;
        }
        return (arr0);
    }

    static void arrayPrimeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = 0;
            for (int z = 2; z < arr[i]; z++) {
                if (arr[i] % z == 0) {
                    z = arr[i];
                } else if (z >= arr[i] - 1) {
                    x = arr[i];
                    System.out.println(x);
                }
            }
        }
    }

    static int[] sortTwoArrayBubbleSortNewArray(int[] arr, int[] arr0) {
        int[] arr1 = new int[arr.length + arr0.length];
        for (int z = 0, x = 0, i = 0; z < arr.length; i++) {
            if (arr[z] >= arr0[x]) {
                arr1[i] = arr0[x];
                x++;
            } else {
                arr1[i] = arr[z];
                z++;
            }
            if (x >= arr.length) {
                arr1[arr1.length - 1] = arr[arr.length - 1];
                z++;
            } else if (z >= arr.length) {
                arr1[arr1.length - 1] = arr0[arr0.length - 1];
                x++;
            }
        }
        return arr1;
    }

    static void checkChArray(char[] charra) {
        for (int i = 0; i < charra.length; i++) {
            System.out.print(charra[i] + " ");
        }
    }

    static void checkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] bubbleSort(int[] arr) {
        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            z = arr[i];
            for (int v = i; v < arr.length; v++) {
                if (arr[v] <= z) {
                    z = arr[v];
                    arr[v] = arr[i];
                    arr[i] = z;
                }
            }
        }
        return arr;
    }

    static int numMax(int[] arr) {
        int z = 0;
        for (int i = 1; i < arr.length; i++) {
            if (z <= arr[i]) {
                z = arr[i];
            }
        }
        return z;
    }

    static void oddNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    static void evenNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    static int sumArray(int[] arr) {
        int v = 0;
        for (int i = 0; i < arr.length; i++) {
            v += arr[i];
        }
        return v;
    }

    static int numMin(int[] arr) {
        int z = 1;
        for (int i = 1; i < arr.length; i++) {
            if (z >= arr[i]) {
                z = arr[i];
            }
        }
        return z;
    }

    static void lookNumMax(int[] arr) {
        for (int i = 0, z = arr.length / 2; i < arr.length / 2; i++, z++) {
            if (arr[i] > arr[arr.length / 2 - 1]) {
                System.out.println(arr[i]);
            }
            if (arr[z] > arr[arr.length - 1]) {
                System.out.println(arr[z]);
            }
        }
    }

    static void countNum(int[] arr) {
        int z = 13;
        int v = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == z) {
                System.out.println(i);
                v++;
            }
        }
        System.out.println(v);
    }

    static void lookAdjacentNumMax(int[] arr) {
        for (int i = 0, z = 1; i < arr.length - 1; i++, z++) {
            if (arr[i] > arr[z]) {
                System.out.println(arr[i]);
            } else if (arr[z] > arr[i]) {
                System.out.println(arr[z]);
            }
        }
    }
}
