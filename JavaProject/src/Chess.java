
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.*;
 
public class Chess extends JFrame {
  JLayeredPane pane;
  JPanel board;
  JLabel piece;
 
  public Chess(){
  Dimension bSize = new Dimension(600, 600);
 
 pane = new JLayeredPane();
  getContentPane().add(pane);
  pane.setPreferredSize(bSize);

 
  board = new JPanel();
  pane.add(board, JLayeredPane.DEFAULT_LAYER);
  board.setLayout( new GridLayout(8, 8) );
  board.setPreferredSize( bSize );
  board.setBounds(0, 0, bSize.width, bSize.height);
 
  for (int i = 0; i < 64; i++) {
  JPanel square = new JPanel( new BorderLayout() );
  board.add( square );
 
  int row = (i / 8) % 2;
  if (row == 0)
  square.setBackground( i % 2 == 0 ? Color.black : Color.white );
  else
  square.setBackground( i % 2 == 0 ? Color.white : Color.black );
  }
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
 
}}