package androidx.transition;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f75805a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f75806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f75807c;

    @androidx.annotation.w0(29)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(ViewGroup viewGroup, int i10) {
            return viewGroup.getChildDrawingOrder(i10);
        }

        @androidx.annotation.u
        static void b(ViewGroup viewGroup, boolean z10) {
            viewGroup.suppressLayout(z10);
        }
    }

    private y0() {
    }

    static int a(@NonNull ViewGroup viewGroup, int i10) {
        return a.a(viewGroup, i10);
    }

    @e.a({"NewApi"})
    private static void b(@NonNull ViewGroup viewGroup, boolean z10) {
        if (f75805a) {
            try {
                a.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f75805a = false;
            }
        }
    }

    static void c(@NonNull ViewGroup viewGroup, boolean z10) {
        a.b(viewGroup, z10);
    }
}
