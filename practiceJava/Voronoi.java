import java.awt.Color;

public class Voronoi {

    public static double pointDist(Point2D point1, Point2D point2) {
        double dist = Math.sqrt(Math.pow(Point2D.getx(point1) - Point2D.getx(point2), 2.0) + Math.pow(Point2D.gety(point1) - Point2D.gety(point2), 2.0));
    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
        double closest = sites[0];
        int index = 0;
        for (int i = 0; i < sites.length; i++) {
            if (pointDist(point, sites[i]) < closest) {
                closest = pointDist(point, sites);
                index = i;
            }
        }
        return index;
    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
        int[][] map = new int[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                point =  new Point2D(x,y);
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
                int i = index map[x][y];
                StdDraw.point(i,j);
                
            }
        }
    }

    public static void main(String[] args) {
        int width = 200;
        int height = 200;

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
