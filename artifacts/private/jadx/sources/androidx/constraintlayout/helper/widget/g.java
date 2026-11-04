package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.core.widgets.l;
import androidx.constraintlayout.widget.n;

/* JADX INFO: loaded from: classes2.dex */
public class g extends n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44949n = "MotionPlaceholder";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    l f44950m;

    public g(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    public void I(androidx.constraintlayout.core.widgets.f fVar, i iVar, SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray) {
    }

    @Override // androidx.constraintlayout.widget.n
    public void L(androidx.constraintlayout.core.widgets.n nVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (nVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            nVar.w2(mode, size, mode2, size2);
            setMeasuredDimension(nVar.r2(), nVar.q2());
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @e.a({"WrongCall"})
    protected void onMeasure(int i10, int i11) {
        L(this.f44950m, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b
    protected void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.f45789d = new l();
        K();
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
    }
}
