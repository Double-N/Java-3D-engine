package pkg3dgameattempt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */

import java.util.Random;

public class Screen extends Render
{
    private Render test;
    private Render3D render;
    public Screen(int width, int height)
    {
        super(width, height);
        Random random = new Random();
        render = new Render3D(width, height); 
        test = new Render(256, 256);
        for(int i = 0; i < 256 * 256; i++)
        {
            test.pixels[i] = random.nextInt() * (random.nextInt(5)/4);
        }
    }
    
    public void render(Game game)
    {
        for(int i = 0; i < width * height; i++)
            pixels[i] = 0;
        for(int i = 0; i< 50; i++)
        {
            int anim = (int)(Math.sin((game.time + i * 2) % 1000.0 / 100) * 100);   
            int anim2 = (int)(Math.cos((game.time + i * 2) % 1000.0 / 100) * 100);
        }
        
        render.floor(game);
        draw(render, 0, 0);
    }
    
}
