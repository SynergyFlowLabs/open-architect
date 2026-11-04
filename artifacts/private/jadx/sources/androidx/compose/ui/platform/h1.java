package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class h1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final float[] f40496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f40497b;

    public /* synthetic */ h1(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private final void b(float[] fArr, Matrix matrix) {
        androidx.compose.ui.graphics.k.b(this.f40496a, matrix);
        g0.i(fArr, this.f40496a);
    }

    private final void c(float[] fArr, float f10, float f11) {
        g0.j(fArr, f10, f11, this.f40496a);
    }

    private final void d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f40497b;
            view.getLocationInWindow(iArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        b(fArr, matrix);
    }

    @Override // androidx.compose.ui.platform.g1
    public void a(@NotNull View view, @NotNull float[] fArr) {
        androidx.compose.ui.graphics.c2.m(fArr);
        d(view, fArr);
    }

    private h1(float[] fArr) {
        this.f40496a = fArr;
        this.f40497b = new int[2];
    }
}
