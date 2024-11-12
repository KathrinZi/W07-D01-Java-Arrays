import java.util.Random;
import java.util.Arrays;

public class ArrayExercises {

 // Main-Method
public static void main(String[] args) {

 // Exercise 1 test
 int[] initializedArray = createArray();
 System.out.println("Initialized Array: " + Arrays.toString(initializedArray));

 // Exercise 2 test
 int[] randomArray = generateRandomArray(5);
 System.out.println("Random Array: " + Arrays.toString(randomArray));

 // Exercise 3 test
 int[] arrayForLargestSmallest = {10, 15, 3, 66, 4, 9, 1, 100, 2};
 int[] largestAndSmallest = findLargestAndSmallest(arrayForLargestSmallest);
 System.out.println("Largest: " + largestAndSmallest[0] + ", Smallest: " + largestAndSmallest[1]);

 // Exercise 4 test
 int sum = sumArr(randomArray);
 System.out.println("Sum of Random Array Elements: " + sum);

 // Exercise 5 test
 int[] oddEvenCount = countOddAndEven(arrayForLargestSmallest);
 System.out.println("Odd count: " + oddEvenCount[0] + ", Even count: " + oddEvenCount[1]);

 // Exercise 6 test
 int index = findIndex(66, arrayForLargestSmallest);
 System.out.println("Index of 66: " + index);

 // BONUS Exercise test (Array Rotation)
 int[] rotatedArray = rotateArray(new int[]{1, 2, 3, 4, 5});
 System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));

 // BONUS 2 Exercise test (Binary Search)
 int binarySearchIndex = binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 7);
 System.out.println("Binary Search Index of 7: " + binarySearchIndex);
 }

// Exercise 1: Create and Initialize an Array
 public static int[] createArray() {
 return new int[]{10, 20, 30, 40, 50};
 }

 // Exercise 2: Create a Randomized Array
 public static int[] generateRandomArray(int length) {
 int[] randomArray = new int[length];
 Random random = new Random();
 for (int i = 0; i < length; i++) {
 randomArray[i] = random.nextInt(100);
 }
 return randomArray;
 }

    // Exercise 3: Find Largest and Smallest Numbers in an Array
 public static int[] findLargestAndSmallest(int[] array) {
 int largest = array[0];
 int smallest = array[0];
 for (int num : array) {
if (num > largest) largest = num;
 if (num < smallest) smallest = num;
 }
 return new int[]{largest, smallest};
 }

    // Exercise 4: Sum of Array Elements
 public static int sumArr(int[] array) {
int sum = 0;
 for (int num : array) {
 sum += num;
 }
 return sum;
 }

// Exercise 5: Count Odd and Even Numbers
 public static int[] countOddAndEven(int[] array) {
 int oddCount = 0;
 int evenCount = 0;
 for (int num : array) {
 if (num % 2 == 0) evenCount++;
 else oddCount++;
 }
 return new int[]{oddCount, evenCount};
 }

 // Exercise 6: Find Index of a Number in an Array
public static int findIndex(int target, int[] array) {
for (int i = 0; i < array.length; i++) {
 if (array[i] == target) {
 return i;
 }
 }
 return -1;
 }

 // BONUS Exercise: Rotate Array Elements
 public static int[] rotateArray(int[] array) {
 if (array.length == 0) return array;
 int last = array[array.length - 1];
 for (int i = array.length - 1; i > 0; i--) {
 array[i] = array[i - 1];
 }
 array[0] = last;
 return array;
 }

 // BONUS 2 Exercise: Binary Search
public static int binarySearch(int[] sortedArray, int target) {
 return Arrays.binarySearch(sortedArray, target);
 }
}
