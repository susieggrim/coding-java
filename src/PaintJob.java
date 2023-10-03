public class PaintJob {

    public static void main(String[] args) {
        System.out.println("number of buckets: " + getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("bucket count: " + getBucketCount(7.25, 4.3, 2.35));
        System.out.println("buckets: " + getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double availablePaintArea = areaPerBucket * extraBuckets;
        if (area > availablePaintArea) {
            double pendingArea = area - availablePaintArea;
            int numberOfBuckets = 0;

            while (numberOfBuckets * areaPerBucket < pendingArea) {
                numberOfBuckets += 1;
            }
            return numberOfBuckets;
        }
        return 0;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        int numberOfBuckets = 0;

        while (areaPerBucket * numberOfBuckets < area) {
            numberOfBuckets += 1;
        }
        return numberOfBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int numberOfBuckets = 0;

        while (areaPerBucket * numberOfBuckets < area) {
            numberOfBuckets += 1;
        }
        return numberOfBuckets;
    }



}
