package com.google.vr.cardboard;

import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Class<?> f126809b = f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f126810a;

        private a(Object obj) {
            this.f126810a = obj;
        }

        static a a(Object obj) {
            if (obj != null && f126809b != null) {
                return new a(obj);
            }
            return null;
        }

        private static Class<?> f() {
            if (!b.c()) {
                return null;
            }
            try {
                return Class.forName("android.view.DisplayCutout");
            } catch (Exception unused) {
                return null;
            }
        }

        private int g(String str) {
            try {
                return ((Integer) f126809b.getDeclaredMethod(str, null).invoke(this.f126810a, null)).intValue();
            } catch (Exception unused) {
                return 0;
            }
        }

        public int b() {
            return g("getSafeInsetBottom");
        }

        public int c() {
            return g("getSafeInsetLeft");
        }

        public int d() {
            return g("getSafeInsetRight");
        }

        public int e() {
            return g("getSafeInsetTop");
        }
    }

    public static boolean c() {
        return true;
    }

    public boolean a(Window window) {
        if (!c()) {
            return false;
        }
        try {
            return WindowManager.LayoutParams.class.getField("layoutInDisplayCutoutMode").get(window.getAttributes()) == WindowManager.LayoutParams.class.getField("LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES").get(null);
        } catch (Exception e10) {
            new StringBuilder(String.valueOf(e10).length() + 56);
            return false;
        }
    }

    public a b(Display display) {
        if (!c()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.view.DisplayInfo");
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            Display.class.getDeclaredMethod("getDisplayInfo", cls).invoke(display, objNewInstance);
            Field declaredField = cls.getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            return a.a(declaredField.get(objNewInstance));
        } catch (Exception e10) {
            new StringBuilder(String.valueOf(e10).length() + 44);
            return null;
        }
    }
}
