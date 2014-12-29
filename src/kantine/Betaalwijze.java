/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantine;

/**
 * Abstract class Betaalwijze - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Betaalwijze
{
    protected double saldo;
    
    /**
     * Methode om krediet te initialiseren
     * @param krediet
     */
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    /**
     * Methode om betaling af te handelen
     * @param tebetalen
     * @return Boolean om te kijken of er voldoende saldo is
     */
    public abstract boolean betaal(double tebetalen);
}