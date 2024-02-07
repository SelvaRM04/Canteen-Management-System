/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canteenmanagementsystem;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

/**
 *
 * @author Selva
 */
public class changeTheme extends DefaultMetalTheme {
    @Override
    public ColorUIResource getWindowTitleInactiveBackground() {
      return new ColorUIResource(java.awt.Color.blue);
    }
  
    @Override
    public ColorUIResource getWindowTitleBackground() {
      return new ColorUIResource(java.awt.Color.black);
    }
  
    @Override
    public ColorUIResource getPrimaryControlHighlight() {
      return new ColorUIResource(java.awt.Color.green);
    }
  
    @Override
    public ColorUIResource getPrimaryControlDarkShadow() {
      return new ColorUIResource(java.awt.Color.green);
    }
  
    @Override
    public ColorUIResource getPrimaryControl() {
      return new ColorUIResource(java.awt.Color.green);
    }
  
    @Override
    public ColorUIResource getControlHighlight() {
      return new ColorUIResource(java.awt.Color.green);
    }
  
    @Override
    public ColorUIResource getControlDarkShadow() {
      return new ColorUIResource(java.awt.Color.green);
    }
  
    @Override
    public ColorUIResource getControl() {
      return new ColorUIResource(java.awt.Color.green);
    }
}
