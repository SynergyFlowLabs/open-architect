package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.n;

/* JADX INFO: loaded from: classes2.dex */
public class Flow extends n {
    public static final int H1 = 2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f44838g3 = 1;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f44839h3 = 2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f44840i3 = 0;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f44841j3 = 1;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f44842k3 = 2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final int f44843l3 = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44844n = "Flow";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f44845o = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f44846p0 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f44847p1 = 1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f44848p2 = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f44849s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f44850t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f44851v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f44852w = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.g f44853m;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    public void B(androidx.constraintlayout.widget.f.a aVar, j jVar, ConstraintLayout.b bVar, SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray) {
        super.B(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof androidx.constraintlayout.core.widgets.g) {
            androidx.constraintlayout.core.widgets.g gVar = (androidx.constraintlayout.core.widgets.g) jVar;
            int i10 = bVar.Z;
            if (i10 != -1) {
                gVar.y3(i10);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void D(androidx.constraintlayout.core.widgets.e eVar, boolean z10) {
        this.f44853m.n2(z10);
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
        L(this.f44853m, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f44853m.l3(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f44853m.m3(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f44853m.n3(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f44853m.o3(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f44853m.p3(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f44853m.q3(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f44853m.r3(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f44853m.s3(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f44853m.t3(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f44853m.u3(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f44853m.v3(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f44853m.w3(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f44853m.x3(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f44853m.y3(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f44853m.C2(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f44853m.D2(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f44853m.F2(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f44853m.G2(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f44853m.I2(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f44853m.z3(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f44853m.A3(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f44853m.B3(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f44853m.C3(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f44853m.D3(i10);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b
    protected void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.f44853m = new androidx.constraintlayout.core.widgets.g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.c.H1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.j.c.I1) {
                    this.f44853m.y3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.J1) {
                    this.f44853m.C2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.f46350a2) {
                    this.f44853m.H2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.f46367b2) {
                    this.f44853m.E2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.K1) {
                    this.f44853m.F2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.L1) {
                    this.f44853m.I2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.M1) {
                    this.f44853m.G2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.N1) {
                    this.f44853m.D2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.K2) {
                    this.f44853m.D3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.A2) {
                    this.f44853m.s3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.J2) {
                    this.f44853m.C3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.f46689u2) {
                    this.f44853m.m3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.C2) {
                    this.f44853m.u3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.f46723w2) {
                    this.f44853m.o3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.E2) {
                    this.f44853m.w3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.f46757y2) {
                    this.f44853m.q3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.j.c.f46672t2) {
                    this.f44853m.l3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.j.c.B2) {
                    this.f44853m.t3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.j.c.f46706v2) {
                    this.f44853m.n3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.j.c.D2) {
                    this.f44853m.v3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.j.c.H2) {
                    this.f44853m.A3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.j.c.f46740x2) {
                    this.f44853m.p3(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == androidx.constraintlayout.widget.j.c.G2) {
                    this.f44853m.z3(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == androidx.constraintlayout.widget.j.c.f46774z2) {
                    this.f44853m.r3(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.I2) {
                    this.f44853m.B3(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.j.c.F2) {
                    this.f44853m.x3(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f45789d = this.f44853m;
        K();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
