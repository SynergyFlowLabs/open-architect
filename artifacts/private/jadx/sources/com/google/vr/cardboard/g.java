package com.google.vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes5.dex */
public class g {
    public static float a(com.google.vr.sdk.proto.nano.b.a aVar) {
        if (aVar == null || !aVar.u()) {
            return 0.003f;
        }
        return aVar.r();
    }

    public static int b(Context context, Display display, b bVar) {
        int iC;
        int iD;
        b.a aVarB = bVar.b(display);
        if (aVarB == null) {
            return 0;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            iC = aVarB.e();
            iD = aVarB.b();
        } else {
            iC = aVarB.c();
            iD = aVarB.d();
        }
        return iC + iD;
    }

    public static Display c(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static DisplayMetrics d(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        if (i10 < i11) {
            displayMetrics.widthPixels = i11;
            displayMetrics.heightPixels = i10;
        }
        float f10 = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = f10;
        return displayMetrics;
    }

    public static DisplayMetrics e(Display display, com.google.vr.sdk.proto.nano.b.a aVar) {
        DisplayMetrics displayMetricsD = d(display);
        if (aVar != null) {
            if (aVar.v()) {
                displayMetricsD.xdpi = aVar.s();
            }
            if (aVar.w()) {
                displayMetricsD.ydpi = aVar.t();
            }
        }
        return displayMetricsD;
    }

    public static String f(Context context) {
        Resources resources = context.getResources();
        try {
            return resources.getString(resources.getIdentifier("display_manager_hdmi_display_name", androidx.constraintlayout.core.motion.utils.v.b.f43988e, "android"));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static float g(float f10) {
        return 0.0254f / f10;
    }

    public static boolean h(Display display, Display display2) {
        if (display == display2) {
            return true;
        }
        if (display == null || display2 == null || display.getDisplayId() != display2.getDisplayId() || display.getFlags() != display2.getFlags() || display.isValid() != display2.isValid() || !display.getName().equals(display2.getName())) {
            return false;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        display2.getMetrics(displayMetrics2);
        return displayMetrics.equals(displayMetrics2);
    }
}
