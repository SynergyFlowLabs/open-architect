package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f48845a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48846b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48847c = 10;

    static class a {
        private a() {
        }

        static void a(@NonNull Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    @androidx.annotation.w0(28)
    static class b {
        private b() {
        }

        static <T> T a(Window window, int i10) {
            return (T) window.requireViewById(i10);
        }
    }

    @androidx.annotation.w0(30)
    static class c {
        private c() {
        }

        static void a(@NonNull Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z10);
        }
    }

    @androidx.annotation.w0(35)
    static class d {
        private d() {
        }

        static void a(@NonNull Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    private k2() {
    }

    @NonNull
    public static v3 a(@NonNull Window window, @NonNull View view) {
        return new v3(window, view);
    }

    @NonNull
    public static <T extends View> T b(@NonNull Window window, @androidx.annotation.d0 int i10) {
        return (T) b.a(window, i10);
    }

    public static void c(@NonNull Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            d.a(window, z10);
        } else if (i10 >= 30) {
            c.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
