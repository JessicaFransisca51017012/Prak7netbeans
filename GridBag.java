/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridbag;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class GridBag extends JFrame {
public static void main(String[] args) {
       GridBag a = new GridBag();
    }
  public GridBag(){
      GridBagLayout grid = new GridBagLayout();
      GridBagConstraints gbc = new  GridBagConstraints();
      setLayout(grid);
      setTitle("GridBag Layout Example");
      GridBagLayout layout = new GridBagLayout();
    this.setLayout(layout);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 0;
    this.add(new Button ("Button One"), gbc);
    gbc.gridx = 1;
    gbc.gridy = 0;
    this.add(new Button("Button two"), gbc);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipady = 20;
    gbc.gridx = 0;
    gbc.gridy = 1;
    this.add(new Button ("Button Three"), gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    this.add(new Button ("Button Four"), gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridwidth = 2;
    this.add(new Button("Button Five"), gbc);
        setSize(300, 300);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
  }  
}
