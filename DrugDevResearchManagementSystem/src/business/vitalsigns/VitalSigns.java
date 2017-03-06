/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.vitalsigns;

/**
 *
 * @author Harsh
 */
public class VitalSigns {
    private int lowBP;
    private int highBP;
    private int heartRate;
    private int breathRate;
    private float LDLC;
    private float HDLC;

    public int getLowBP() {
        return lowBP;
    }

    public void setLowBP(int lowBP) {
        this.lowBP = lowBP;
    }

    public int getHighBP() {
        return highBP;
    }

    public void setHighBP(int highBP) {
        this.highBP = highBP;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBreathRate() {
        return breathRate;
    }

    public void setBreathRate(int breathRate) {
        this.breathRate = breathRate;
    }

    public float getLDLC() {
        return LDLC;
    }

    public void setLDLC(float LDLC) {
        this.LDLC = LDLC;
    }

    public float getHDLC() {
        return HDLC;
    }

    public void setHDLC(float HDLC) {
        this.HDLC = HDLC;
    }
    
    
    
    
}
