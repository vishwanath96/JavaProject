
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class ChessProject extends JFrame implements MouseListener,MouseMotionListener {
  JLayeredPane pane;
  JPanel board;
  JLabel piece;
  int x,y,s,rows;
 
  public ChessProject(){
  Dimension bSize =new Dimension(615, 615);
 
  pane = new JLayeredPane();
  getContentPane().add(pane);
  pane.setPreferredSize(bSize);
  pane.addMouseListener(this);
  pane.addMouseMotionListener(this);
 
  board = new JPanel();
  pane.add(board, JLayeredPane.DEFAULT_LAYER);
  board.setLayout( new GridLayout(8, 8) );
  board.setPreferredSize(bSize);
  board.setBounds(0,0,bSize.width,bSize.height);
 
  for (s=0;s<64;s++) {
  JPanel square = new JPanel( new BorderLayout() );
  board.add( square );
  rows=(s/8)%2;
  if(rows==0)
  square.setBackground(s%2==0 ? Color.black : Color.white );
  else
  square.setBackground(s%2==0 ? Color.white : Color.black );
  }
 
  //Black Pieces
  JLabel piece = new JLabel( new ImageIcon("/Users/Vishu/Desktop/chesscoins/brook.png") );
  JPanel panel = (JPanel)board.getComponent(0);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bknight.png"));
  panel = (JPanel)board.getComponent(1);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bbishop.png"));
  panel = (JPanel)board.getComponent(2);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bqueen.png"));
  panel = (JPanel)board.getComponent(4);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bking.png"));
  panel = (JPanel)board.getComponent(3);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bbishop.png"));
  panel = (JPanel)board.getComponent(5);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bknight.png"));
  panel = (JPanel)board.getComponent(6);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/brook.png"));
  panel = (JPanel)board.getComponent(7);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bpawn.png"));
  panel = (JPanel)board.getComponent(8);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bpawn.png"));
  panel = (JPanel)board.getComponent(9);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bpawn.png"));
  panel = (JPanel)board.getComponent(10);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bpawn.png"));
  panel = (JPanel)board.getComponent(11);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bpawn.png"));
  panel = (JPanel)board.getComponent(12);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bpawn.png"));
  panel = (JPanel)board.getComponent(13);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bpawn.png"));
  panel = (JPanel)board.getComponent(14);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/bpawn.png"));
  panel = (JPanel)board.getComponent(15);
  panel.add(piece);

  //White Pieces
  
  piece = new JLabel( new ImageIcon("/Users/Vishu/Desktop/chesscoins/wrook.png") );
  panel = (JPanel)board.getComponent(56);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wknight.png"));
  panel = (JPanel)board.getComponent(57);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wbishop.png"));
  panel = (JPanel)board.getComponent(58);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wqueen.png"));
  panel = (JPanel)board.getComponent(60);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wking.png"));
  panel = (JPanel)board.getComponent(59);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wbishop.png"));
  panel = (JPanel)board.getComponent(61);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wknight.png"));
  panel = (JPanel)board.getComponent(62);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wrook.png"));
  panel = (JPanel)board.getComponent(63);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wpawn.png"));
  panel = (JPanel)board.getComponent(48);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wpawn.png"));
  panel = (JPanel)board.getComponent(49);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wpawn.png"));
  panel = (JPanel)board.getComponent(50);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wpawn.png"));
  panel = (JPanel)board.getComponent(51);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wpawn.png"));
  panel = (JPanel)board.getComponent(52);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wpawn.png"));
  panel = (JPanel)board.getComponent(53);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wpawn.png"));
  panel = (JPanel)board.getComponent(54);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("/Users/Vishu/Desktop/chesscoins/wpawn.png"));
  panel = (JPanel)board.getComponent(55);
  panel.add(piece);
  }

  public void mousePressed(MouseEvent e){
  piece = null;
  Component com =  board.findComponentAt(e.getX(), e.getY());
 
  if (com instanceof JPanel) 
  return;
 
  Point pLocation = com.getParent().getLocation();
  x = pLocation.x - e.getX();
  y = pLocation.y - e.getY();
  piece = (JLabel)com;
  piece.setLocation(e.getX() + x, e.getY() + y);
  piece.setSize(piece.getWidth(), piece.getHeight());
  pane.add(piece, JLayeredPane.DRAG_LAYER);
  }
   
  public void mouseDragged(MouseEvent me) {
  if (piece==null) return;
 piece.setLocation(me.getX() + x, me.getY() + y);
 }
  
  public void mouseReleased(MouseEvent e) {
  if(piece==null) return;
 
  piece.setVisible(false);
  Component com = board.findComponentAt(e.getX(),e.getY());
 
  if (com instanceof JLabel){
  Container parent = com.getParent();
  parent.remove(0);
  parent.add(piece);
  }
  else {
  Container parent = (Container)com;
  parent.add(piece);
  }
 
  piece.setVisible(true);
  }
  
  
  
  public void mouseClicked(MouseEvent e) { 
  }
  public void mouseMoved(MouseEvent e) {
  }
  public void mouseEntered(MouseEvent e) { 
  }
  public void mouseExited(MouseEvent e) {
  }
}