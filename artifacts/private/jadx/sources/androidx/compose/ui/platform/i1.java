package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(29)
final class i1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Matrix f40509a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f40510b = new int[2];

    @Override // androidx.compose.ui.platform.g1
    @androidx.annotation.u
    public void a(@NotNull View view, @NotNull float[] fArr) {
        this.f40509a.reset();
        view.transformMatrixToGlobal(this.f40509a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f40510b);
        int[] iArr = this.f40510b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f40510b;
        this.f40509a.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        androidx.compose.ui.graphics.k.b(fArr, this.f40509a);
    }
}
