package com.createsapp.uberclonejava;

import com.createsapp.uberclonejava.Model.DriverInfoModel;

public class Common {
    public static final String DRIVER_INFO_REFERENCE = "DriverInfo";
    public static final String DRIVERS_LOCATION_REFERENCE = "DriversLocation";

    public static DriverInfoModel currentUser;

    public static String buildwelcomeMessage() {
        if (Common.currentUser != null) {
            return new StringBuilder("Welcome ")
                    .append(Common.currentUser.getFirstName())
                    .append("")
                    .append(Common.currentUser.getLastName()).toString();
        } else
            return "";
    }
}
