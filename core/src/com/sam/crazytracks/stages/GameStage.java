package com.sam.crazytracks.stages;


import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.sam.crazytracks.utils.WorldUtils;

public class GameStage extends Stage {

    World world;

    public GameStage() {
        world = WorldUtils.createWorld(world);
    }

    @Override
    public void act() {
        super.act();
    }

    @Override
    public void draw() {
        super.draw();
    }
}
