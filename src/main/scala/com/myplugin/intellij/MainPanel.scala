package com.myplugin.intellij

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.{ToolWindow, ToolWindowFactory}
import com.myplugin.intellij.service.{InputService, OptionService}
import javax.swing.{BoxLayout, JPanel, JTabbedPane}


class MainPanel extends ToolWindowFactory {


  private val options = List("Hello", "World", "Foo", "Bar")


  override def createToolWindowContent(project: Project, toolWindow: ToolWindow): Unit = {

    val mainPanel = new JPanel
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS))

    val jtabbedPane = new JTabbedPane()
    val jpanel1 = new OptionService(options)
    val jpanel2 = new InputService()

    jtabbedPane.addTab("Test Drop Down", jpanel1)
    jtabbedPane.addTab("Test Input", jpanel2)

    mainPanel.add(jtabbedPane)

    toolWindow.getComponent.add(mainPanel)


  }


}
