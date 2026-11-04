package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.w0(23)
class d1 extends c1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f75555m = true;

    @androidx.annotation.w0(29)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    d1() {
    }

    @Override // androidx.transition.a1
    @e.a({"NewApi"})
    public void h(@NonNull View view, int i10) {
        if (f75555m) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f75555m = false;
            }
        }
    }
}
