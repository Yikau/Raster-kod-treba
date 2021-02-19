public class weeeeeeee {

    public boolean vyplnen(Souradnice coordinate) {
        int[][] bodytrojuhelniku = new int[3][2];
        int i = 0;
        for (Coordinate vypsatcopor : getSelectedPoints()) {
            bodytroj[i][0] = vypsatcopor.getX();
            bodytroj[i][1] = vypsatcopor.getY();
            i++;
        }

        return (
                (double) (coordinate.getX() - bodytrojuhelniku[1][0]) * (bodytrojuhelniku[2][1] - bodytrojuhelniku[1][1]) - (coordinate.getY() - bodytrojuhelniku[1][1]) * (bodytrojuhelniku[2][0] - bodytrojuhelniku[1][0]) < 0
                &&
                (double) (coordinate.getX() - bodytrojuhelniku[2][0]) * (bodytrojuhelniku[0][1] - bodytrojuhelniku[2][1]) - (coordinate.getY() - bodytrojuhelniku[2][1]) * (bodytrojuhelniku[0][0] - bodytrojuhelniku[2][0]) < 0
                &&
                (double) (coordinate.getX() - bodytrojuhelniku[0][0]) * (bodytrojuhelniku[1][1] - bodytrojuhelniku[0][1]) - (coordinate.getY() - bodytrojuhelniku[0][1]) * (bodytrojuhelniku[1][0] - bodytrojuhelniku[0][0]) < 0
        );
    }
}
