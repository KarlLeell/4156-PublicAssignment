package models;

public class Move {

  private Player player;

  private int moveX;

  private int moveY;
  
  /** Complete constructor.
   * @param p player object of the player who moves
   * @param x row location
   * @param y col location
   */
  public Move(Player p, int x, int y) {
    this.player = p;
    this.moveX = x;
    this.moveY = y;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }

  public int getMoveX() {
    return moveX;
  }

  public void setMoveX(int moveX) {
    this.moveX = moveX;
  }

  public int getMoveY() {
    return moveY;
  }

  public void setMoveY(int moveY) {
    this.moveY = moveY;
  }

}
