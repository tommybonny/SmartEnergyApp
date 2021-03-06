package ch.ethz.smartenergy;

import android.graphics.Color;

public class Constants {

    // Scanning Logic
    public static final String DataBroadcastActionName = "DATA";
    public static final String WindowBroadcastActionName = "WINDOW";
    public static final String WindowBroadcastExtraName = "WindowData";
    public static final String WifiScanExtraName = "WifiScan";
    public static final String BluetoothScanExtraName = "BluetoothScan";
    public static final String LocationScanExtraName = "LocationScan";
    public static final String AccReadingExtraName = "AccelerometerReading";
    public static final String GyroReadingExtraName = "GyroscopeReading";
    public static final String MagnReadingExtraName = "MagneticFieldReading";

    // General Logic
    static final double MaxAvgSpeedStill = 2.0f;
    static final double TopAvgSpeedAllowed = 2.8f;
    static final double MaxSpeedStill = 3.5;
    static final double StopSpeed = 0.0f;
    static final double BONUS_PREVIOUS = 0.02;
    static final double BONUS_TRAIN_NO_GPS = 0.45;
    static final String[] ListModes = {"Foot", "Train", "Bus", "Car", "Tram", "Bicycle", "E-Bike", "Motorcycle", "Still"};

    // Emission Logic
    static final double[] CO2PerMode = {20.0, 31.375, 72.116, 120.0, 22.45, 10.0, 3.3, 72.0, 0.0};
    static final double[] WattPerMode = {59.2, 272.0, 273.0, 400.0, 70.0, 32.2, 8.75, 270.0, 0.0};
    static final double co2MultiplierDefaultCar = 1.55;
    static final double co2MultiplierSmallCar = 1;
    static final double co2MultiplierBigCar = 1.98;
    static final double co2MultiplierElectricCar = 0.59;

    static final double co2MultiplierMeatDietWalking = 12.5;
    static final double co2MultiplierMeatDietBicylce = 12.5;
    static final double co2MultiplierVeganDietWalking = 1.0;
    static final double co2MultiplierVeganDietBicycle = 1.0;
    static final double co2MultiplierAverageDietWalking = 5;
    static final double co2MultiplierAverageDietBicycle = 5;
    static final double co2MultiplierNoDietWalking = 0.0;
    static final double co2MultiplierNoDietBicycle = 0.0;

    static final double energyMultiplierDefaultCar = 1.55;
    static final double energyMultiplierSmallCar = 1;
    static final double energyMultiplierBigCar = 1.98;
    static final double energyMultiplierElectricCar = 0.47;


    // UI
    static final String[] listModesVerbose = {"on foot", "in a train", "on a bus", "in a car", "in a tram", "on a bicycle", "on a e-bike", "riding a bike", "not doing much"};
    static final String TAG_FRAGMENT_HOME = "fragment_home";
    static final String TAG_FRAGMENT_STATS = "fragment_stats";
    static final String TAG_FRAGMENT_SETTINGS = "fragment_settings";
    static final String TAG_FRAGMENT_ONBOARDING = "fragment_onboarding";
    static final String[] TIMEFRAME_OPTIONS = {"Past Week", "This Month", "This Year"};
    static final String[] MENU_OPTIONS = {"Time per Mode", "CO₂ per Mode", "Distance per Mode", "Energy per Mode"};
    static final CharSequence[] PIE_GRAPH_DESCRIPTION = {"Minutes Per Mode For Today",
            "CO₂ (g) Per Mode For Today", "Distance (km) Per Mode For Today", "Energy (Wh) Per Mode For Today"};
    static final String[] GRAPH_DESCRIPTION = {"Minutes Per Transportation Mode for", "CO₂ (g) Per Transportation Mode for", "Distance (km) per Transportation Mode for", "Energy (Wh) per Transportation Mode for"};
    static final int[] MATERIAL_COLORS = {
            rgb("#2ecc71"), rgb("#f1c40f"), rgb("#e74c3c"), rgb("#3498db"),
            rgb("#795548"), rgb("#607D8B"), rgb("#E040FB"), rgb("#00BFA5"),
            rgb("#D81B60")
    };
    static final String PLANT_BASESD = "Plant Based";
    static final String MEAT_BASED = "Meat Based";
    static final String AVERAGE_DIET = "Average";
    static final String IGNORE_DIET = "Ignore Diet";

    static final String DEFAULT_CAR = "Average Car";
    static final String SMALL_CAR = "Small Car";
    static final String BIG_CAR = "Sport Car";
    static final String ELECTRIC_CAR = "Electric Car";


    private static int rgb(String hex) {
        int color = (int) Long.parseLong(hex.replace("#", ""), 16);
        int r = (color >> 16) & 0xFF;
        int g = (color >> 8) & 0xFF;
        int b = (color >> 0) & 0xFF;
        return Color.rgb(r, g, b);
    }
}
