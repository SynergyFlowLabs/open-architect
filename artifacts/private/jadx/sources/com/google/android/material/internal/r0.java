package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f112904a = "r0";

    private static class a {
        private a() {
        }

        @NonNull
        static Rect a(@NonNull WindowManager windowManager) {
            int i10;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point pointB = b(defaultDisplay);
            Rect rect = new Rect();
            int i11 = pointB.x;
            if (i11 == 0 || (i10 = pointB.y) == 0) {
                defaultDisplay.getRectSize(rect);
                return rect;
            }
            rect.right = i11;
            rect.bottom = i10;
            return rect;
        }

        private static Point b(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                int i10 = 4 & 1;
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
                return point;
            } catch (IllegalAccessException unused) {
                String unused2 = r0.f112904a;
                return point;
            } catch (NoSuchMethodException unused3) {
                String unused4 = r0.f112904a;
                return point;
            } catch (InvocationTargetException unused5) {
                String unused6 = r0.f112904a;
                return point;
            }
        }
    }

    @w0(api = 17)
    private static class b {
        private b() {
        }

        @NonNull
        static Rect a(@NonNull WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    @w0(api = 30)
    private static class c {
        private c() {
        }

        @NonNull
        static Rect a(@NonNull WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    private r0() {
    }

    @NonNull
    public static Rect b(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? c.a(windowManager) : b.a(windowManager);
    }
}
