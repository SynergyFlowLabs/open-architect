package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.w0(29)
class e1 extends d1 {
    e1() {
    }

    @Override // androidx.transition.a1
    public float c(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.b1, androidx.transition.a1
    public void e(@NonNull View view, @androidx.annotation.p0 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.c1, androidx.transition.a1
    public void f(@NonNull View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.transition.a1
    public void g(@NonNull View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // androidx.transition.d1, androidx.transition.a1
    public void h(@NonNull View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // androidx.transition.b1, androidx.transition.a1
    public void i(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.b1, androidx.transition.a1
    public void j(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
