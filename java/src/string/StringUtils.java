package string;

/**
 * @author Sun
 */
public class StringUtils {
    public static String join(final Object[] array, String separator, final int startIndex, final int endIndex) {
        if (array == null) {
            return null;
        }
        if (separator == null) {
            return null;
        }

        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            // return EMPTY;
        }

        final StringBuilder buf = new StringBuilder(noOfItems * 16);
        for (int i = startIndex; i < endIndex; i++) {
            if (i > startIndex) {
                buf.append(separator);
            }
            if (array[i] != null) {
                buf.append(array[i]);
            }
        }
        return buf.toString();
    }
}