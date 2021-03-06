import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerExtractionTest {

    protected PlayerExtraction solution;

    @Before
    public void setUp() {
        solution = new PlayerExtraction();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] photo = new String[]{"33JUBU33", "3U3O4433", "O33P44NB", "PO3NSDP3", "VNDSD333", "OIVNFD33"};
        int k = 3;
        int threshold = 16;

        String[] expected = new String[]{"4 5", "13 9", "14 2"};
        String[] actual = solution.extractPlayers(photo, k, threshold);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] photo = new String[]{"6VS", "D66"};
        int k = 6;
        int threshold = 1;

        String[] expected = new String[]{"1 1", "4 3"};
        String[] actual = solution.extractPlayers(photo, k, threshold);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] photo = new String[]{"44444H44S4", "K444K4L444", "4LJ44T44XH", "444O4VIF44", "44C4D4U444", "4V4Y4KB4M4", "G4W4HP4O4W", "4444ZDQ4S4", "4BR4Y4A444", "4G4V4T4444"};
        int k = 4;
        int threshold = 16;

        String[] expected = new String[]{"3 8", "4 16", "5 4", "16 3", "16 17", "17 9"};
        String[] actual = solution.extractPlayers(photo, k, threshold);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] photo = new String[]{"8D88888J8L8E888", "88NKMG8N8E8JI88", "888NS8EU88HN8EO", "LUQ888A8TH8OIH8", "888QJ88R8SG88TY", "88ZQV88B88OUZ8O", "FQ88WF8Q8GG88B8", "8S888HGSB8FT8S8", "8MX88D88888T8K8", "8S8A88MGVDG8XK8", "M88S8B8I8M88J8N", "8W88X88ZT8KA8I8", "88SQGB8I8J88W88", "U88H8NI8CZB88B8", "8PK8H8T8888TQR8"};
        int k = 8;
        int threshold = 9;

        String[] expected = new String[]{"1 17", "3 3", "3 10", "3 25", "5 21", "8 17", "9 2", "10 9", "12 23", "17 16", "18 3", "18 11", "18 28", "22 20", "23 26", "24 15", "27 2", "28 26", "29 16"};
        String[] actual = solution.extractPlayers(photo, k, threshold);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] photo = new String[]{"11111", "1AAA1", "1A1A1", "1AAA1", "11111"};
        int k = 1;
        int threshold = 3;

        String[] expected = new String[]{"5 5", "5 5"};
        String[] actual = solution.extractPlayers(photo, k, threshold);

        Assert.assertArrayEquals(expected, actual);
    }

}
