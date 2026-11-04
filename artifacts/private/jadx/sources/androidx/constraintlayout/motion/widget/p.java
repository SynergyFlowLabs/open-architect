package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class p extends androidx.constraintlayout.widget.b implements q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f45349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f45350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f45351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected View[] f45352n;

    public p(Context context) {
        super(context);
        this.f45349k = false;
        this.f45350l = false;
    }

    public void L(View view, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public void a(MotionLayout motionLayout) {
    }

    public void b(MotionLayout motionLayout, HashMap<View, o> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public void c(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public boolean d() {
        return this.f45349k;
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public boolean e() {
        return this.f45350l;
    }

    public boolean f() {
        return false;
    }

    public void g(MotionLayout motionLayout, int i10, int i11, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public float getProgress() {
        return this.f45351m;
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public void h(Canvas canvas) {
    }

    public void i(MotionLayout motionLayout, int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.k
    public void j(MotionLayout motionLayout, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.k
    public void k(MotionLayout motionLayout, int i10, boolean z10, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void setProgress(float f10) {
        this.f45351m = f10;
        int i10 = 0;
        if (this.f45787b > 0) {
            this.f45352n = x((ConstraintLayout) getParent());
            while (i10 < this.f45787b) {
                L(this.f45352n[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof p)) {
                L(childAt, f10);
            }
            i10++;
        }
    }

    @Override // androidx.constraintlayout.widget.b
    protected void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.c.f46412dd);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.j.c.f46446fd) {
                    this.f45349k = typedArrayObtainStyledAttributes.getBoolean(index, this.f45349k);
                } else if (index == androidx.constraintlayout.widget.j.c.f46429ed) {
                    this.f45350l = typedArrayObtainStyledAttributes.getBoolean(index, this.f45350l);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45349k = false;
        this.f45350l = false;
        z(attributeSet);
    }

    public p(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45349k = false;
        this.f45350l = false;
        z(attributeSet);
    }
}
