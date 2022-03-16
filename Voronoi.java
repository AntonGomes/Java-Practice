import java.awt.Color;

public class Voronoi {

    public static double pointDist(Point2D point1, Point2D point2) {
        double d = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2.0) + Math.pow(point1.getY() - point2.getY(), 2.0));
        return d;
    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
        double closest = 228.0;
        int index = 0;
        for (int i = 0; i < sites.length; i++) {
            if (pointDist(point, sites[i]) < closest) {
                closest = pointDist(point, sites[i]);
                index = i;
            }
        }
        return index;
    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
        int[][] map = new int[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Point2D point =  new Point2D(x,y);
                map[x][y] = findClosestPoint(point, sites);
            }
        }
        return map;
    }

    public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
        int width = indexMap.length;
        int height = indexMap[0].length;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int i = indexMap[x][y];
                StdDraw.setPenColor(colors[i]);
                StdDraw.point(x,y);
            }
        }
        StdDraw.setPenColor(Color.BLACK);
        for (int i = 0; i<sites.length;i++) {
            StdDraw.filledCircle(sites[i].getX(), sites[i].getY(), 3.0);
        }
    }

    public static void main(String[] args) {
        int width = 400;
        int height = 400;

        int nSites = 5;
        Point2D[] sites = new Point2D[nSites];
        sites[0] = new Point2D(50, 50);
        sites[1] = new Point2D(100, 50);
        sites[2] = new Point2D(50, 100);
        sites[3] = new Point2D(125, 50);
        sites[4] = new Point2D(100, 175);

        Color[] colors = new Color[nSites];
        colors[0] = Color.BLUE;
        colors[1] = Color.GREEN;
        colors[2] = Color.YELLOW;
        colors[3] = Color.ORANGE;
        colors[4] = Color.MAGENTA;

        int[][] indexmap = buildVoronoiMap(sites, width, height);
        plotVoronoiMap(sites, colors, indexmap);


    }

}
