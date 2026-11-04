package com.devtodev.core.utils;

import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class h {
    private static boolean a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private static boolean b() {
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10]).exists()) {
                    return true;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    private static boolean c() {
        return new b().a(b.a.check_su_binary) != null;
    }

    public static boolean d() {
        return a() || b() || c();
    }
}
