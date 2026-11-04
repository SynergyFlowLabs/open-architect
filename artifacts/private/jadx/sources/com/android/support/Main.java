package com.android.support;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public class Main {
    private static native void CheckOverlayPermission(Context context);

    static {
        System.loadLibrary("ee");
    }

    public static void StartWithoutPermission(Context context) {
        CrashHandler.init(context, true);
        if (context instanceof Activity) {
            Menu menu = new Menu(context);
            menu.SetWindowManagerActivity();
            menu.ShowMenu();
        } else {
            CheckOverlayPermission(context);
        }
    }

    public static void Start(Context context) {
        CrashHandler.init(context, false);
        CheckOverlayPermission(context);
    }
}
