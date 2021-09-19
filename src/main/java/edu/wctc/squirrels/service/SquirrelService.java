package edu.wctc.squirrels.service;

import edu.wctc.squirrels.entity.Squirrel;

import java.util.List;

public interface SquirrelService {
    Squirrel getSquirrel(int squirrelId);

    List<Squirrel> getSquirrelList();

    public void deleteSquirrel(int squirrelID);
}
