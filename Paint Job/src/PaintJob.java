public class PaintJob {
    public static void main(String[] args){
        int check = getBucketCount(6.26,2.2);
        System.out.println(check);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double area = width * height;
            double extraCoverage = area - (extraBuckets * areaPerBucket);
            double buckets = extraCoverage / areaPerBucket;
            double conversion = Math.ceil(buckets);
            int finalBuckets = (int) conversion;
            return finalBuckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 )
            return -1;
        else {
            double area = width * height;
            double buckets = area / areaPerBucket;
            double conversion = Math.ceil(buckets);
            int finalBuckets = (int) conversion;
            return finalBuckets;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            double buckets = area / areaPerBucket;
            double conversion = Math.ceil(buckets);
            int finalBuckets = (int) conversion;
            return finalBuckets;
        }
    }
}
