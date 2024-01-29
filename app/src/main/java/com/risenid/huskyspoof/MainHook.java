/*
 * WearableSpoof
 * Copyright (C) 2023 Simon1511
 * HuskySpoof
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

package com.risenid.huskyspoof;

import android.os.Build;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {        
        XposedBridge.log("HuskySpoof: Hooking into: " + lpparam.packageName);

        // ro.product.manufacturer
        XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "Google");

        // ro.product.brand
        XposedHelpers.setStaticObjectField(Build.class, "BRAND", "Google");

        // ro.product.device
        XposedHelpers.setStaticObjectField(Build.class, "DEVICE", "husky");

        // ro.build.tags
        XposedHelpers.setStaticObjectField(Build.class, "TAGS", "release-keys");

        // ro.build.type
        XposedHelpers.setStaticObjectField(Build.class, "TYPE", "user");

        // ro.product.product
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", "husky");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "name", "husky");

        // ro.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.MODEL", "Pixel 8 Pro");

        // ro.product.name
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.MODEL", "Pixel 8 Pro");

        // ro.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.MODEL", "Pixel 8 Pro");

        // ro.odm.name
        XposedHelpers.setStaticObjectField(Build.class, "ODM.MODEL", "Pixel 8 Pro");

        // ro.system.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.MODEL", "Pixel 8 Pro");

        // ro.product.flavor
        XposedHelpers.setStaticObjectField(Build.class, "FLAVOUR", "husky-user");

        // ro.soc.model
        XposedHelpers.setStaticObjectField(Build.class, "SOC.MODEL", "Tensor G3");

        // ro.product.board
        XposedHelpers.setStaticObjectField(Build.class, "BOARD", "husky");

        // ro.build.id
        XposedHelpers.setStaticObjectField(Build.class, "ID", "UQ1A.240105.004");

        // ro.build.fingerprint
        XposedHelpers.setStaticObjectField(Build.class, "FINGERPRINT",
                "google/husky/husky:14/UQ1A.240105.004/11206848:user/release-keys");
    }
}