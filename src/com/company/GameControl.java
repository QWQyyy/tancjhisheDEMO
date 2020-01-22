package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

    /*
    控制器，上下左右，暂停退出的按键事件响应
    */
public class GameControl implements KeyListener {

    private Snake snake;

    public GameControl(Snake snake){
        this.snake=snake;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        /*
        只重写不实现
         */
    }

    @Override
    public void keyPressed(KeyEvent e) {
         /*
        只重写不实现
         */
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                snake.setDirection(0);
                break;
            case KeyEvent.VK_RIGHT:
                snake.setDirection(1);
                break;
            case KeyEvent.VK_DOWN:
                snake.setDirection(2);
                break;
            case KeyEvent.VK_LEFT:
                snake.setDirection(3);
                break;
            case KeyEvent.VK_ENTER:

                if(SnakeGameView.gameState==true){
                    SnakeGameView.gameState=false;
                }else{
                    SnakeGameView.gameState=true;
                }
                break;
            case KeyEvent.VK_ESCAPE:
                System.exit(0);
                break;
        }
    }

}
