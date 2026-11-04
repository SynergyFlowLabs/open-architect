package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f45660n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f45661o = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f45662s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f45663t = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f45664v = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f45665w = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f45666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f45667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.a f45668m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void M(androidx.constraintlayout.core.widgets.e eVar, int i10, boolean z10) {
        this.f45667l = i10;
        if (z10) {
            int i11 = this.f45666k;
            if (i11 == 5) {
                this.f45667l = 1;
            } else if (i11 == 6) {
                this.f45667l = 0;
            }
        } else {
            int i12 = this.f45666k;
            if (i12 == 5) {
                this.f45667l = 0;
            } else if (i12 == 6) {
                this.f45667l = 1;
            }
        }
        if (eVar instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) eVar).v2(this.f45667l);
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void B(f.a aVar, androidx.constraintlayout.core.widgets.j jVar, ConstraintLayout.b bVar, SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray) {
        super.B(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) jVar;
            M(aVar2, aVar.f45926e.f45996h0, ((androidx.constraintlayout.core.widgets.f) jVar.U()).P2());
            aVar2.u2(aVar.f45926e.f46012p0);
            aVar2.w2(aVar.f45926e.f45998i0);
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void D(androidx.constraintlayout.core.widgets.e eVar, boolean z10) {
        M(eVar, this.f45666k, z10);
    }

    @Deprecated
    public boolean L() {
        return this.f45668m.p2();
    }

    public boolean getAllowsGoneWidget() {
        return this.f45668m.p2();
    }

    public int getMargin() {
        return this.f45668m.r2();
    }

    public int getType() {
        return this.f45666k;
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f45668m.u2(z10);
    }

    public void setDpMargin(int i10) {
        this.f45668m.w2((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f45668m.w2(i10);
    }

    public void setType(int i10) {
        this.f45666k = i10;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.f45668m = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46486i2) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.f46469h2) {
                    this.f45668m.u2(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == j.c.f46502j2) {
                    this.f45668m.w2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f45789d = this.f45668m;
        K();
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }
}
