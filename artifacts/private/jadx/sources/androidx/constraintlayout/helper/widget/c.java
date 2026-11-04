package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import androidx.constraintlayout.widget.n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class c extends n {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static int f44881g3 = 0;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static float f44882h3 = 0.0f;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f44883p2 = "CircularFlow";
    private Integer H1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ConstraintLayout f44884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f44885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f44886o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private String f44887p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private Float f44888p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f44889s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f44890t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f44891v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f44892w;

    public c(Context context) {
        super(context);
    }

    private void M(String str) {
        float[] fArr;
        if (str != null && str.length() != 0 && this.f45788c != null && (fArr = this.f44886o) != null) {
            if (this.f44891v + 1 > fArr.length) {
                this.f44886o = Arrays.copyOf(fArr, fArr.length + 1);
            }
            this.f44886o[this.f44891v] = Integer.parseInt(str);
            this.f44891v++;
        }
    }

    private void N(String str) {
        int[] iArr;
        if (str != null && str.length() != 0 && this.f45788c != null && (iArr = this.f44889s) != null) {
            if (this.f44890t + 1 > iArr.length) {
                this.f44889s = Arrays.copyOf(iArr, iArr.length + 1);
            }
            this.f44889s[this.f44890t] = (int) (Integer.parseInt(str) * this.f45788c.getResources().getDisplayMetrics().density);
            this.f44890t++;
        }
    }

    private void P() {
        this.f44884m = (ConstraintLayout) getParent();
        for (int i10 = 0; i10 < this.f45787b; i10++) {
            View viewById = this.f44884m.getViewById(this.f45786a[i10]);
            if (viewById != null) {
                int i11 = f44881g3;
                float f10 = f44882h3;
                int[] iArr = this.f44889s;
                if (iArr == null || i10 >= iArr.length) {
                    Integer num = this.H1;
                    if (num == null || num.intValue() == -1) {
                        this.f45794i.get(Integer.valueOf(viewById.getId()));
                    } else {
                        this.f44890t++;
                        if (this.f44889s == null) {
                            this.f44889s = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f44889s = radius;
                        radius[this.f44890t - 1] = i11;
                    }
                } else {
                    i11 = iArr[i10];
                }
                float[] fArr = this.f44886o;
                if (fArr == null || i10 >= fArr.length) {
                    Float f11 = this.f44888p1;
                    if (f11 == null || f11.floatValue() == -1.0f) {
                        this.f45794i.get(Integer.valueOf(viewById.getId()));
                    } else {
                        this.f44891v++;
                        if (this.f44886o == null) {
                            this.f44886o = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f44886o = angles;
                        angles[this.f44891v - 1] = f10;
                    }
                } else {
                    f10 = fArr[i10];
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) viewById.getLayoutParams();
                bVar.f45707r = f10;
                bVar.f45703p = this.f44885n;
                bVar.f45705q = i11;
                viewById.setLayoutParams(bVar);
            }
        }
        q();
    }

    private float[] R(float[] fArr, int i10) {
        return (fArr == null || i10 < 0 || i10 >= this.f44891v) ? fArr : S(fArr, i10);
    }

    private static float[] S(float[] fArr, int i10) {
        float[] fArr2 = new float[fArr.length - 1];
        int i11 = 0;
        for (int i12 = 0; i12 < fArr.length; i12++) {
            if (i12 != i10) {
                fArr2[i11] = fArr[i12];
                i11++;
            }
        }
        return fArr2;
    }

    private static int[] T(int[] iArr, int i10) {
        int[] iArr2 = new int[iArr.length - 1];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (i12 != i10) {
                iArr2[i11] = iArr[i12];
                i11++;
            }
        }
        return iArr2;
    }

    private int[] U(int[] iArr, int i10) {
        return (iArr == null || i10 < 0 || i10 >= this.f44890t) ? iArr : T(iArr, i10);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f44891v = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                M(str.substring(i10).trim());
                return;
            } else {
                M(str.substring(i10, iIndexOf).trim());
                i10 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f44890t = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                N(str.substring(i10).trim());
                return;
            } else {
                N(str.substring(i10, iIndexOf).trim());
                i10 = iIndexOf + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public int C(View view) {
        int iC = super.C(view);
        if (iC == -1) {
            return iC;
        }
        androidx.constraintlayout.widget.f fVar = new androidx.constraintlayout.widget.f();
        fVar.H(this.f44884m);
        fVar.F(view.getId(), 8);
        fVar.r(this.f44884m);
        float[] fArr = this.f44886o;
        if (iC < fArr.length) {
            this.f44886o = R(fArr, iC);
            this.f44891v--;
        }
        int[] iArr = this.f44889s;
        if (iC < iArr.length) {
            this.f44889s = U(iArr, iC);
            this.f44890t--;
        }
        P();
        return iC;
    }

    public void O(View view, int i10, float f10) {
        if (t(view.getId())) {
            return;
        }
        o(view);
        this.f44891v++;
        float[] angles = getAngles();
        this.f44886o = angles;
        angles[this.f44891v - 1] = f10;
        this.f44890t++;
        int[] radius = getRadius();
        this.f44889s = radius;
        radius[this.f44890t - 1] = (int) (i10 * this.f45788c.getResources().getDisplayMetrics().density);
        P();
    }

    public boolean Q(View view) {
        return t(view.getId()) && y(view.getId()) != -1;
    }

    public void V(View view, float f10) {
        if (!Q(view)) {
            view.getId();
            return;
        }
        int iY = y(view.getId());
        if (iY > this.f44886o.length) {
            return;
        }
        float[] angles = getAngles();
        this.f44886o = angles;
        angles[iY] = f10;
        P();
    }

    public void W(View view, int i10) {
        if (!Q(view)) {
            view.getId();
            return;
        }
        int iY = y(view.getId());
        if (iY > this.f44889s.length) {
            return;
        }
        int[] radius = getRadius();
        this.f44889s = radius;
        radius[iY] = (int) (i10 * this.f45788c.getResources().getDisplayMetrics().density);
        P();
    }

    public void X(View view, int i10, float f10) {
        if (!Q(view)) {
            view.getId();
            return;
        }
        int iY = y(view.getId());
        if (getAngles().length > iY) {
            float[] angles = getAngles();
            this.f44886o = angles;
            angles[iY] = f10;
        }
        if (getRadius().length > iY) {
            int[] radius = getRadius();
            this.f44889s = radius;
            radius[iY] = (int) (i10 * this.f45788c.getResources().getDisplayMetrics().density);
        }
        P();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f44886o, this.f44891v);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f44889s, this.f44890t);
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f44892w;
        if (str != null) {
            this.f44886o = new float[1];
            setAngles(str);
        }
        String str2 = this.f44887p0;
        if (str2 != null) {
            this.f44889s = new int[1];
            setRadius(str2);
        }
        Float f10 = this.f44888p1;
        if (f10 != null) {
            setDefaultAngle(f10.floatValue());
        }
        Integer num = this.H1;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        P();
    }

    public void setDefaultAngle(float f10) {
        f44882h3 = f10;
    }

    public void setDefaultRadius(int i10) {
        f44881g3 = i10;
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b
    protected void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46604p2) {
                    this.f44885n = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == j.c.f46536l2) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f44892w = string;
                    setAngles(string);
                } else if (index == j.c.f46587o2) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f44887p0 = string2;
                    setRadius(string2);
                } else if (index == j.c.f46553m2) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f44882h3));
                    this.f44888p1 = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == j.c.f46570n2) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f44881g3));
                    this.H1 = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
