package com.aang23.undergroundbiomes.enums;

/**
 * @author LouisDB
 */
public enum UBStoneStyle {
    STONE, GRAVEL, COBBLE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}