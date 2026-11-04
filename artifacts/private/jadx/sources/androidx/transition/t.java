package androidx.transition;

import android.graphics.Matrix;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f75766a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f75767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f75768c;

    @androidx.annotation.w0(29)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    private t() {
    }

    static void a(@NonNull ImageView imageView, @androidx.annotation.p0 Matrix matrix) {
        a.a(imageView, matrix);
    }

    @e.a({"SoonBlockedPrivateApi"})
    private static void b() {
        if (!f75768c) {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                f75767b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f75768c = true;
        }
    }

    @e.a({"NewApi"})
    @androidx.annotation.w0(21)
    private static void c(@NonNull ImageView imageView, @androidx.annotation.p0 Matrix matrix) {
        if (f75766a) {
            try {
                a.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f75766a = false;
            }
        }
    }
}
