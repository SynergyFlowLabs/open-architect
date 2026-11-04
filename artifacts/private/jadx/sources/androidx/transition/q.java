package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.w0(21)
class q implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f75747b = "GhostViewApi21";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<?> f75748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f75749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f75750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f75751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Method f75752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f75753h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f75754a;

    private q(@NonNull View view) {
        this.f75754a = view;
    }

    @e.a({"BanUncheckedReflection"})
    static o b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = f75750e;
        if (method != null) {
            try {
                return new q((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        return null;
    }

    private static void c() {
        if (f75751f) {
            return;
        }
        try {
            d();
            Method declaredMethod = f75748c.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f75750e = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f75751f = true;
    }

    private static void d() {
        if (f75749d) {
            return;
        }
        try {
            f75748c = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException unused) {
        }
        f75749d = true;
    }

    private static void e() {
        if (f75753h) {
            return;
        }
        try {
            d();
            Method declaredMethod = f75748c.getDeclaredMethod("removeGhost", View.class);
            f75752g = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f75753h = true;
    }

    @e.a({"BanUncheckedReflection"})
    static void f(View view) {
        e();
        Method method = f75752g;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    @Override // androidx.transition.o
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.o
    public void setVisibility(int i10) {
        this.f75754a.setVisibility(i10);
    }
}
