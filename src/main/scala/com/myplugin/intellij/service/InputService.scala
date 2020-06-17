package com.myplugin.intellij.service

import java.awt.event.ActionEvent

import com.myplugin.intellij.ui.LabelInputButtonPanel

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


class InputService extends LabelInputButtonPanel("Enter word", "Show") {
  button.addActionListener {
    _: ActionEvent => {
      console.clear()
      displayWithDelay()
    }
  }


  def displayWithDelay() = Future {
    for (i <- 3 to 1 by -1) {
      console.log(s"In $i ...")
      Thread.sleep(1000L)
      console.clear()
    }
    console.log(input.getText)
  }


}
