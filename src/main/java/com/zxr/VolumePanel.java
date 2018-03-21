package com.zxr;

import javax.swing.*;

/**
 * 音量控制器主面板
 * @author zhang
 */
public class VolumePanel {


    private Boolean panelVisible = Boolean.TRUE;

    /**
     * 生成面板
     */
    public void generatePanel() {

        JFrame jFrame = new JFrame(VolumeConstant.APP_NAME);
        jFrame.setSize(VolumeConstant.APP_WIDTH, VolumeConstant.APP_HEIGHT);
        jFrame.setVisible(panelVisible);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public Boolean getPanelVisible() {
        return panelVisible;
    }

    public void setPanelVisible(Boolean panelVisible) {
        this.panelVisible = panelVisible;
    }
}
