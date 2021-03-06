package com.myplugin.intellij.ui

import java.awt.{BorderLayout, Dimension, FlowLayout}

import javax.swing._


class LabelDropDownButtonPanel(labelTxt: String, dropDownChoices: List[String], buttonTxt: String) extends JPanel {

  val label = new JLabel(labelTxt)

  val dropDownList = new JComboBox[String](dropDownChoices.toArray)
  dropDownList.setPreferredSize(new Dimension(400, 30))

  val button = new JButton(buttonTxt)

  setLayout(new BorderLayout())


  private val inputPanel = new JPanel()
  inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT))
  inputPanel.add(label)
  inputPanel.add(dropDownList)
  inputPanel.add(button)


  val console = new MessageConsole

  add(inputPanel, BorderLayout.NORTH)
  add(console)


}
