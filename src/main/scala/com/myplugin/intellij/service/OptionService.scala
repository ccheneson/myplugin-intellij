package com.myplugin.intellij.service

import java.awt.event.ActionEvent

import com.myplugin.intellij.ui.LabelDropDownButtonPanel

class OptionService(options: List[String]) extends LabelDropDownButtonPanel("Option", options, "Show") {
  button.addActionListener {
    _: ActionEvent => {
      console.clear()
      console.log(options(dropDownList.getSelectedIndex))
    }
  }

}
