package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11629a = "ViewUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f11630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f11631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.k(api = 27)
    static final boolean f11632d = true;

    @androidx.annotation.w0(29)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(@NonNull View view, @NonNull Rect rect, @NonNull Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    private v1() {
    }

    public static void a(@NonNull View view, @NonNull Rect rect, @NonNull Rect rect2) {
        a.a(view, rect, rect2);
    }

    public static boolean b(View view) {
        return view.getLayoutDirection() == 1;
    }

    @e.a({"BanUncheckedReflection"})
    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
