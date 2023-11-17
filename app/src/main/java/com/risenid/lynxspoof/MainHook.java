/*
 * WearableSpoof
 * Copyright (C) 2023 Simon1511
 * LynxSpoof
 * Copyright (C) 2023 RisenID
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.risenid.lynxspoof;

import android.os.Build;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {        
        XposedBridge.log("LynxSpoof: Hooking into: " + lpparam.packageName);

        // ro.product.manufacturer
        XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "Google");

        // ro.product.brand
        XposedHelpers.setStaticObjectField(Build.class, "BRAND", "Google");

        // ro.product.device
        XposedHelpers.setStaticObjectField(Build.class, "DEVICE", "lynx");

        // ro.build.tags
        XposedHelpers.setStaticObjectField(Build.class, "TAGS", "release-keys");

        // ro.build.type
        XposedHelpers.setStaticObjectField(Build.class, "TYPE", "user");

        // ro.product.product
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", "lynx");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "name", "lynx_beta");

        // ro.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.MODEL", "Pixel 7a");

        // ro.product.name
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.MODEL", "Pixel 7a");

        // ro.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.MODEL", "Pixel 7a");

        // ro.odm.name
        XposedHelpers.setStaticObjectField(Build.class, "ODM.MODEL", "Pixel 7a");

        // ro.system.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.MODEL", "Pixel 7a");

        // ro.product.flavor
        XposedHelpers.setStaticObjectField(Build.class, "FLAVOUR", "lynx_beta-user");

        // ro.soc.model
        XposedHelpers.setStaticObjectField(Build.class, "SOC.MODEL", "GS201");

        // ro.product.board
        XposedHelpers.setStaticObjectField(Build.class, "BOARD", "lynx");

        // ro.build.fingerprint
        XposedHelpers.setStaticObjectField(Build.class, "FINGERPRINT",
                "google/lynx_beta/lynx:14/AP11.231020.016.A1/11113945:user/release-keys");
    }
}