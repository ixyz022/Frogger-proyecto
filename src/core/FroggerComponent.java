package src.core;

import src.froggerLevel.FroggerLevel;
import src.froggerLevel.LevelConfig;
import src.froggerLevel.levels.Level1;
import src.froggerLevel.levels.Level2;
import src.support.FroggerState;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class FroggerComponent extends JComponent implements KeyListener, Runnable {
    private FroggerLevelEngine engine;
    private boolean upPressed, downPressed, leftPressed, rightPressed;
    private List<FroggerLevel> levels;
    private int level = 0;

    public FroggerComponent() {
        super();
        levels = LevelConfig.getLevels();
        engine = new FroggerLevelEngine(levels.get(level));
        setPreferredSize(new Dimension(FroggerLevelEngine.WIDTH, FroggerLevelEngine.HEIGHT));

        addKeyListener(this);
        Thread run = new Thread(this);
        run.start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(20);
            } catch (Exception ex) {
            }
            requestFocus();
            update();
            repaint();
        }
    }

    public void paint(Graphics g) {
        synchronized (g) {
            engine.draw(g);
        }
    }

    public void update() {
        if (upPressed)
            engine.moveUp();
        if (downPressed)
            engine.moveDown();
        if (leftPressed)
            engine.moveLeft();
        if (rightPressed)
            engine.moveRight();

        engine.update();

        if (engine.getState() == FroggerState.WON) {
            level++;
            if (level >= levels.size()) {
                JOptionPane.showMessageDialog(this, "You have beaten this game.");
                System.exit(0);
            }
            engine = new FroggerLevelEngine(levels.get(level));
        }
    }

    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_DOWN)
            downPressed = true;
        else if (ke.getKeyCode() == KeyEvent.VK_UP)
            upPressed = true;
        else if (ke.getKeyCode() == KeyEvent.VK_LEFT)
            leftPressed = true;
        else if (ke.getKeyCode() == KeyEvent.VK_RIGHT)
            rightPressed = true;
        else if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
            if (engine.getState() == FroggerState.HIT)
                engine = new FroggerLevelEngine(levels.get(level));
        }
    }

    public void keyReleased(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_DOWN)
            downPressed = false;
        else if (ke.getKeyCode() == KeyEvent.VK_UP)
            upPressed = false;
        else if (ke.getKeyCode() == KeyEvent.VK_LEFT)
            leftPressed = false;
        else if (ke.getKeyCode() == KeyEvent.VK_RIGHT)
            rightPressed = false;
    }

    public void keyTyped(KeyEvent ke) {
    }
}