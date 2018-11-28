
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.*;
 
public class Chess extends JFrame {
  JLayeredPane pane;
  JPanel board;
 
  public Chess(){
  Dimension bSize = new Dimension(600, 600);
 
  //  Use a Layered Pane for this this application
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
 
}}