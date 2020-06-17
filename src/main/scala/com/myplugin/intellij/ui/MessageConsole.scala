package com.myplugin.intellij.ui

import java.awt.{Color, Dimension, Insets}

import com.intellij.util.ui.UIUtil
import javax.swing.{JScrollPane, JTextArea}

class MessageConsole extends JTextArea {
  setEditable(false)
  setBackground(Color.black)
  setForeground(Color.white)
  setFont(UIUtil.getFontWithFallback(this.getFont().deriveFont(14f)))

  val displayScrollPane = new JScrollPane(this)
  displayScrollPane.setPreferredSize(new Dimension(200, 75))


  def clearConsole = setText("")


  def log(message: String) = append(s"$message\n")

  def clear() = setText("")
}
