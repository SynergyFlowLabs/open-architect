package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.w0(22)
class c1 extends b1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f75527l = true;

    @androidx.annotation.w0(29)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    c1() {
    }

    @Override // androidx.transition.a1
    @e.a({"NewApi"})
    public void f(@NonNull View view, int i10, int i11, int i12, int i13) {
        if (f75527l) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f75527l = false;
            }
        }
    }
}
