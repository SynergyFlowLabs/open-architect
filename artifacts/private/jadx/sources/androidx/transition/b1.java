package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.w0(21)
class b1 extends a1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f75515i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f75516j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f75517k = true;

    @androidx.annotation.w0(29)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        @androidx.annotation.u
        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        @androidx.annotation.u
        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    b1() {
    }

    @Override // androidx.transition.a1
    @e.a({"NewApi"})
    public void e(@NonNull View view, @androidx.annotation.p0 Matrix matrix) {
        if (f75515i) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f75515i = false;
            }
        }
    }

    @Override // androidx.transition.a1
    @e.a({"NewApi"})
    public void i(@NonNull View view, @NonNull Matrix matrix) {
        if (f75516j) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f75516j = false;
            }
        }
    }

    @Override // androidx.transition.a1
    @e.a({"NewApi"})
    public void j(@NonNull View view, @NonNull Matrix matrix) {
        if (f75517k) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f75517k = false;
            }
        }
    }
}
