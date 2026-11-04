package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import androidx.constraintlayout.widget.n;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class d extends n {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final String f44893q3 = "Grid";

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final int f44894r3 = 1;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final int f44895s3 = 0;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final boolean f44896t3 = false;
    private String H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private String f44897g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private float f44898h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private float f44899i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f44900j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f44901k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f44902l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f44903m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f44904m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f44905n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private boolean[][] f44906n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View[] f44907o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    Set<Integer> f44908o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f44909p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private String f44910p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private String f44911p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int[] f44912p3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ConstraintLayout f44913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f44914t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f44915v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f44916w;

    public d(Context context) {
        super(context);
        this.f44903m = 50;
        this.f44905n = 50;
        this.f44901k3 = 0;
        this.f44908o3 = new HashSet();
    }

    private boolean M() {
        d dVar;
        View[] viewArrX = x(this.f44913s);
        int i10 = 0;
        while (i10 < this.f45787b) {
            if (this.f44908o3.contains(Integer.valueOf(this.f45786a[i10]))) {
                dVar = this;
            } else {
                int nextPosition = this.getNextPosition();
                int iT = this.T(nextPosition);
                int iS = this.S(nextPosition);
                if (nextPosition == -1) {
                    return false;
                }
                dVar = this;
                dVar.Q(viewArrX[i10], iT, iS, 1, 1);
            }
            i10++;
            this = dVar;
        }
        return true;
    }

    private void N() {
        int iMax = Math.max(this.f44914t, this.f44916w);
        View[] viewArr = this.f44907o;
        int i10 = 0;
        if (viewArr == null) {
            this.f44907o = new View[iMax];
            int i11 = 0;
            while (true) {
                View[] viewArr2 = this.f44907o;
                if (i11 >= viewArr2.length) {
                    break;
                }
                viewArr2[i11] = a0();
                i11++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i12 = 0; i12 < iMax; i12++) {
                View[] viewArr4 = this.f44907o;
                if (i12 < viewArr4.length) {
                    viewArr3[i12] = viewArr4[i12];
                } else {
                    viewArr3[i12] = a0();
                }
            }
            int i13 = iMax;
            while (true) {
                View[] viewArr5 = this.f44907o;
                if (i13 >= viewArr5.length) {
                    break;
                }
                this.f44913s.removeView(viewArr5[i13]);
                i13++;
            }
            this.f44907o = viewArr3;
        }
        this.f44912p3 = new int[iMax];
        while (true) {
            View[] viewArr6 = this.f44907o;
            if (i10 >= viewArr6.length) {
                f0();
                e0();
                return;
            } else {
                this.f44912p3[i10] = viewArr6[i10].getId();
                i10++;
            }
        }
    }

    private void O(View view) {
        ConstraintLayout.b bVarB0 = b0(view);
        bVarB0.L = -1.0f;
        bVarB0.f45683f = -1;
        bVarB0.f45681e = -1;
        bVarB0.f45685g = -1;
        bVarB0.f45687h = -1;
        ((ViewGroup.MarginLayoutParams) bVarB0).leftMargin = -1;
        view.setLayoutParams(bVarB0);
    }

    private void P(View view) {
        ConstraintLayout.b bVarB0 = b0(view);
        bVarB0.M = -1.0f;
        bVarB0.f45691j = -1;
        bVarB0.f45689i = -1;
        bVarB0.f45693k = -1;
        bVarB0.f45695l = -1;
        ((ViewGroup.MarginLayoutParams) bVarB0).topMargin = -1;
        view.setLayoutParams(bVarB0);
    }

    private void Q(View view, int i10, int i11, int i12, int i13) {
        ConstraintLayout.b bVarB0 = b0(view);
        int[] iArr = this.f44912p3;
        bVarB0.f45681e = iArr[i11];
        bVarB0.f45689i = iArr[i10];
        bVarB0.f45687h = iArr[(i11 + i13) - 1];
        bVarB0.f45695l = iArr[(i10 + i12) - 1];
        view.setLayoutParams(bVarB0);
    }

    private boolean R(boolean z10) {
        int[][] iArrC0;
        int[][] iArrC1;
        if (this.f44913s == null || this.f44914t < 1 || this.f44916w < 1) {
            return false;
        }
        if (z10) {
            for (int i10 = 0; i10 < this.f44906n3.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.f44906n3;
                    if (i11 < zArr[0].length) {
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
            }
            this.f44908o3.clear();
        }
        this.f44901k3 = 0;
        N();
        String str = this.H1;
        boolean zU = (str == null || str.trim().isEmpty() || (iArrC1 = c0(this.H1)) == null) ? true : U(iArrC1);
        String str2 = this.f44910p1;
        if (str2 != null && !str2.trim().isEmpty() && (iArrC0 = c0(this.f44910p1)) != null) {
            zU &= V(this.f45786a, iArrC0);
        }
        return (zU && M()) || !this.f44902l3;
    }

    private int S(int i10) {
        return this.f44900j3 == 1 ? i10 / this.f44914t : i10 % this.f44916w;
    }

    private int T(int i10) {
        return this.f44900j3 == 1 ? i10 % this.f44914t : i10 / this.f44916w;
    }

    private boolean U(int[][] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iT = T(iArr[i10][0]);
            int iS = S(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!X(iT, iS, iArr2[1], iArr2[2])) {
                return false;
            }
        }
        return true;
    }

    private boolean V(int[] iArr, int[][] iArr2) {
        View[] viewArrX = x(this.f44913s);
        int i10 = 0;
        while (i10 < iArr2.length) {
            int iT = this.T(iArr2[i10][0]);
            int iS = this.S(iArr2[i10][0]);
            int[] iArr3 = iArr2[i10];
            if (!this.X(iT, iS, iArr3[1], iArr3[2])) {
                return false;
            }
            View view = viewArrX[i10];
            int[] iArr4 = iArr2[i10];
            int i11 = iArr4[1];
            int i12 = iArr4[2];
            d dVar = this;
            dVar.Q(view, iT, iS, i11, i12);
            dVar.f44908o3.add(Integer.valueOf(iArr[i10]));
            i10++;
            this = dVar;
        }
        return true;
    }

    private void W() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f44914t, this.f44916w);
        this.f44906n3 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    private boolean X(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.f44906n3;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean Y(CharSequence charSequence) {
        return true;
    }

    private boolean Z(String str) {
        return true;
    }

    private View a0() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.f44913s.addView(view, new ConstraintLayout.b(0, 0));
        return view;
    }

    private ConstraintLayout.b b0(View view) {
        return (ConstraintLayout.b) view.getLayoutParams();
    }

    private int[][] c0(String str) {
        if (!Y(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i10][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i10][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i10][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    private float[] d0(int i10, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length != i10) {
                return null;
            }
            fArr = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr[i11] = Float.parseFloat(strArrSplit[i11].trim());
            }
        }
        return fArr;
    }

    private void e0() {
        int i10;
        int id2 = getId();
        int iMax = Math.max(this.f44914t, this.f44916w);
        float[] fArrD0 = d0(this.f44916w, this.f44897g3);
        int i11 = 0;
        ConstraintLayout.b bVarB0 = b0(this.f44907o[0]);
        if (this.f44916w == 1) {
            O(this.f44907o[0]);
            bVarB0.f45681e = id2;
            bVarB0.f45687h = id2;
            this.f44907o[0].setLayoutParams(bVarB0);
            return;
        }
        while (true) {
            i10 = this.f44916w;
            if (i11 >= i10) {
                break;
            }
            ConstraintLayout.b bVarB1 = b0(this.f44907o[i11]);
            O(this.f44907o[i11]);
            if (fArrD0 != null) {
                bVarB1.L = fArrD0[i11];
            }
            if (i11 > 0) {
                bVarB1.f45683f = this.f44912p3[i11 - 1];
            } else {
                bVarB1.f45681e = id2;
            }
            if (i11 < this.f44916w - 1) {
                bVarB1.f45685g = this.f44912p3[i11 + 1];
            } else {
                bVarB1.f45687h = id2;
            }
            if (i11 > 0) {
                ((ViewGroup.MarginLayoutParams) bVarB1).leftMargin = (int) this.f44898h3;
            }
            this.f44907o[i11].setLayoutParams(bVarB1);
            i11++;
        }
        while (i10 < iMax) {
            ConstraintLayout.b bVarB2 = b0(this.f44907o[i10]);
            O(this.f44907o[i10]);
            bVarB2.f45681e = id2;
            bVarB2.f45687h = id2;
            this.f44907o[i10].setLayoutParams(bVarB2);
            i10++;
        }
    }

    private void f0() {
        int i10;
        int id2 = getId();
        int iMax = Math.max(this.f44914t, this.f44916w);
        float[] fArrD0 = d0(this.f44914t, this.f44911p2);
        int i11 = 0;
        if (this.f44914t == 1) {
            ConstraintLayout.b bVarB0 = b0(this.f44907o[0]);
            P(this.f44907o[0]);
            bVarB0.f45689i = id2;
            bVarB0.f45695l = id2;
            this.f44907o[0].setLayoutParams(bVarB0);
            return;
        }
        while (true) {
            i10 = this.f44914t;
            if (i11 >= i10) {
                break;
            }
            ConstraintLayout.b bVarB1 = b0(this.f44907o[i11]);
            P(this.f44907o[i11]);
            if (fArrD0 != null) {
                bVarB1.M = fArrD0[i11];
            }
            if (i11 > 0) {
                bVarB1.f45691j = this.f44912p3[i11 - 1];
            } else {
                bVarB1.f45689i = id2;
            }
            if (i11 < this.f44914t - 1) {
                bVarB1.f45693k = this.f44912p3[i11 + 1];
            } else {
                bVarB1.f45695l = id2;
            }
            if (i11 > 0) {
                ((ViewGroup.MarginLayoutParams) bVarB1).topMargin = (int) this.f44898h3;
            }
            this.f44907o[i11].setLayoutParams(bVarB1);
            i11++;
        }
        while (i10 < iMax) {
            ConstraintLayout.b bVarB2 = b0(this.f44907o[i10]);
            P(this.f44907o[i10]);
            bVarB2.f45689i = id2;
            bVarB2.f45695l = id2;
            this.f44907o[i10].setLayoutParams(bVarB2);
            i10++;
        }
    }

    private void g0() {
        int i10;
        int i11 = this.f44915v;
        if (i11 != 0 && (i10 = this.f44909p0) != 0) {
            this.f44914t = i11;
            this.f44916w = i10;
            return;
        }
        int i12 = this.f44909p0;
        if (i12 > 0) {
            this.f44916w = i12;
            this.f44914t = ((this.f45787b + i12) - 1) / i12;
        } else if (i11 > 0) {
            this.f44914t = i11;
            this.f44916w = ((this.f45787b + i11) - 1) / i11;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f45787b) + 1.5d);
            this.f44914t = iSqrt;
            this.f44916w = ((this.f45787b + iSqrt) - 1) / iSqrt;
        }
    }

    private int getNextPosition() {
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10 = this.f44901k3;
            if (i10 >= this.f44914t * this.f44916w) {
                return -1;
            }
            int iT = T(i10);
            int iS = S(this.f44901k3);
            boolean[] zArr = this.f44906n3[iT];
            if (zArr[iS]) {
                zArr[iS] = false;
                z10 = true;
            }
            this.f44901k3++;
        }
        return i10;
    }

    public String getColumnWeights() {
        return this.f44897g3;
    }

    public int getColumns() {
        return this.f44909p0;
    }

    public float getHorizontalGaps() {
        return this.f44898h3;
    }

    public int getOrientation() {
        return this.f44900j3;
    }

    public String getRowWeights() {
        return this.f44911p2;
    }

    public int getRows() {
        return this.f44915v;
    }

    public String getSkips() {
        return this.H1;
    }

    public String getSpans() {
        return this.f44910p1;
    }

    public float getVerticalGaps() {
        return this.f44899i3;
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44913s = (ConstraintLayout) getParent();
        R(false);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(l1.a.f316127c);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            View[] viewArr = this.f44907o;
            int length = viewArr.length;
            int i10 = 0;
            while (i10 < length) {
                View view = viewArr[i10];
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                Canvas canvas2 = canvas;
                canvas2.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas2.drawRect(0.0f, top2, right - left, bottom2, paint);
                i10++;
                canvas = canvas2;
            }
        }
    }

    public void setColumnWeights(String str) {
        String str2;
        if (Z(str) && ((str2 = this.f44897g3) == null || !str2.equals(str))) {
            this.f44897g3 = str;
            R(true);
            invalidate();
        }
    }

    public void setColumns(int i10) {
        if (i10 <= 50 && this.f44909p0 != i10) {
            this.f44909p0 = i10;
            g0();
            W();
            R(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f10) {
        if (f10 >= 0.0f && this.f44898h3 != f10) {
            this.f44898h3 = f10;
            R(true);
            invalidate();
        }
    }

    public void setOrientation(int i10) {
        if ((i10 == 0 || i10 == 1) && this.f44900j3 != i10) {
            this.f44900j3 = i10;
            R(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        String str2;
        if (Z(str) && ((str2 = this.f44911p2) == null || !str2.equals(str))) {
            this.f44911p2 = str;
            R(true);
            invalidate();
        }
    }

    public void setRows(int i10) {
        if (i10 <= 50 && this.f44915v != i10) {
            this.f44915v = i10;
            g0();
            W();
            R(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        if (Y(str)) {
            String str2 = this.H1;
            if (str2 == null || !str2.equals(str)) {
                this.H1 = str;
                R(true);
                invalidate();
            }
        }
    }

    public void setSpans(CharSequence charSequence) {
        if (Y(charSequence)) {
            String str = this.f44910p1;
            if (str == null || !str.contentEquals(charSequence)) {
                this.f44910p1 = charSequence.toString();
                R(true);
                invalidate();
            }
        }
    }

    public void setVerticalGaps(float f10) {
        if (f10 >= 0.0f && this.f44899i3 != f10) {
            this.f44899i3 = f10;
            R(true);
            invalidate();
        }
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.b
    protected void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.f45790e = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.M8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.S8) {
                    this.f44915v = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == j.c.O8) {
                    this.f44909p0 = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == j.c.U8) {
                    this.f44910p1 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == j.c.T8) {
                    this.H1 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == j.c.R8) {
                    this.f44911p2 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == j.c.N8) {
                    this.f44897g3 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == j.c.Q8) {
                    this.f44900j3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == j.c.P8) {
                    this.f44898h3 = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == j.c.X8) {
                    this.f44899i3 = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == j.c.W8) {
                    this.f44902l3 = typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == j.c.V8) {
                    this.f44904m3 = typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            g0();
            W();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44903m = 50;
        this.f44905n = 50;
        this.f44901k3 = 0;
        this.f44908o3 = new HashSet();
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44903m = 50;
        this.f44905n = 50;
        this.f44901k3 = 0;
        this.f44908o3 = new HashSet();
    }
}
