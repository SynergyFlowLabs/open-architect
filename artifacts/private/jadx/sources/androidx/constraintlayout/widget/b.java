package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final String f45785j = "CONSTRAINT_LAYOUT_HELPER_CHILD";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f45786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f45787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f45788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected androidx.constraintlayout.core.widgets.i f45789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f45790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f45791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f45792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View[] f45793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected HashMap<Integer, String> f45794i;

    public b(Context context) {
        super(context);
        this.f45786a = new int[32];
        this.f45790e = false;
        this.f45793h = null;
        this.f45794i = new HashMap<>();
        this.f45788c = context;
        z(null);
    }

    public static boolean A(View view) {
        return f45785j == view.getTag();
    }

    private void l(String str) {
        String strTrim;
        int iW;
        if (str == null || str.length() == 0 || this.f45788c == null || (iW = w((strTrim = str.trim()))) == 0) {
            return;
        }
        this.f45794i.put(Integer.valueOf(iW), strTrim);
        m(iW);
    }

    private void m(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f45787b + 1;
        int[] iArr = this.f45786a;
        if (i11 > iArr.length) {
            this.f45786a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f45786a;
        int i12 = this.f45787b;
        iArr2[i12] = i10;
        this.f45787b = i12 + 1;
    }

    private void n(String str) {
        if (str == null || str.length() == 0 || this.f45788c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f45678c0) && childAt.getId() != -1) {
                m(childAt.getId());
            }
        }
    }

    private int[] u(String str) {
        String[] strArrSplit = str.split(",");
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        for (String str2 : strArrSplit) {
            int iW = w(str2.trim());
            if (iW != 0) {
                iArr[i10] = iW;
                i10++;
            }
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    private int v(ConstraintLayout constraintLayout, String str) {
        String resourceEntryName;
        if (str != null && constraintLayout != null) {
            Resources resources = this.f45788c.getResources();
            if (resources == null) {
                return 0;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    private int w(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iV = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iV = ((Integer) designInformation).intValue();
            }
        }
        if (iV == 0 && constraintLayout != null) {
            iV = v(constraintLayout, str);
        }
        if (iV == 0) {
            try {
                iV = j.b.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iV == 0 ? this.f45788c.getResources().getIdentifier(str, "id", this.f45788c.getPackageName()) : iV;
    }

    public void B(f.a aVar, androidx.constraintlayout.core.widgets.j jVar, ConstraintLayout.b bVar, SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray) {
        f.b bVar2 = aVar.f45926e;
        int[] iArr = bVar2.f46002k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f46004l0;
            if (str != null) {
                if (str.length() > 0) {
                    f.b bVar3 = aVar.f45926e;
                    bVar3.f46002k0 = u(bVar3.f46004l0);
                } else {
                    aVar.f45926e.f46002k0 = null;
                }
            }
        }
        if (jVar != null) {
            jVar.b();
            if (aVar.f45926e.f46002k0 != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr2 = aVar.f45926e.f46002k0;
                    if (i10 >= iArr2.length) {
                        break;
                    }
                    androidx.constraintlayout.core.widgets.e eVar = sparseArray.get(iArr2[i10]);
                    if (eVar != null) {
                        jVar.a(eVar);
                    }
                    i10++;
                }
            }
        }
    }

    public int C(View view) {
        int i10;
        int id2 = view.getId();
        int i11 = -1;
        if (id2 == -1) {
            return -1;
        }
        this.f45791f = null;
        for (int i12 = 0; i12 < this.f45787b; i12++) {
            if (this.f45786a[i12] == id2) {
                int i13 = i12;
                while (true) {
                    i10 = this.f45787b;
                    if (i13 >= i10 - 1) {
                        break;
                    }
                    int[] iArr = this.f45786a;
                    int i14 = i13 + 1;
                    iArr[i13] = iArr[i14];
                    i13 = i14;
                }
                this.f45786a[i10 - 1] = 0;
                this.f45787b = i10 - 1;
                i11 = i12;
                break;
            }
        }
        requestLayout();
        return i11;
    }

    public void D(androidx.constraintlayout.core.widgets.e eVar, boolean z10) {
    }

    public void E(ConstraintLayout constraintLayout) {
    }

    public void F(ConstraintLayout constraintLayout) {
    }

    public void G(ConstraintLayout constraintLayout) {
    }

    public void H(ConstraintLayout constraintLayout) {
    }

    public void I(androidx.constraintlayout.core.widgets.f fVar, androidx.constraintlayout.core.widgets.i iVar, SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray) {
        iVar.b();
        for (int i10 = 0; i10 < this.f45787b; i10++) {
            iVar.a(sparseArray.get(this.f45786a[i10]));
        }
    }

    public void J(ConstraintLayout constraintLayout) {
        String str;
        int iV;
        if (isInEditMode()) {
            setIds(this.f45791f);
        }
        androidx.constraintlayout.core.widgets.i iVar = this.f45789d;
        if (iVar == null) {
            return;
        }
        iVar.b();
        for (int i10 = 0; i10 < this.f45787b; i10++) {
            int i11 = this.f45786a[i10];
            View viewById = constraintLayout.getViewById(i11);
            if (viewById == null && (iV = v(constraintLayout, (str = this.f45794i.get(Integer.valueOf(i11))))) != 0) {
                this.f45786a[i10] = iV;
                this.f45794i.put(Integer.valueOf(iV), str);
                viewById = constraintLayout.getViewById(iV);
            }
            if (viewById != null) {
                this.f45789d.a(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f45789d.c(constraintLayout.mLayoutWidget);
    }

    public void K() {
        if (this.f45789d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f45716v0 = (androidx.constraintlayout.core.widgets.e) this.f45789d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f45786a, this.f45787b);
    }

    public void o(View view) {
        if (view == this || view.getId() == -1 || view.getParent() == null) {
            return;
        }
        this.f45791f = null;
        m(view.getId());
        requestLayout();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f45791f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f45792g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f45790e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p() {
    }

    protected void q() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        r((ConstraintLayout) parent);
    }

    protected void r(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f45787b; i10++) {
            View viewById = constraintLayout.getViewById(this.f45786a[i10]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void s(ConstraintLayout constraintLayout) {
    }

    protected void setIds(String str) {
        this.f45791f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f45787b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                l(str.substring(i10));
                return;
            } else {
                l(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f45792g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f45787b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                n(str.substring(i10));
                return;
            } else {
                n(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f45791f = null;
        this.f45787b = 0;
        for (int i10 : iArr) {
            m(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f45791f == null) {
            m(i10);
        }
    }

    public boolean t(int i10) {
        for (int i11 : this.f45786a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    protected View[] x(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f45793h;
        if (viewArr == null || viewArr.length != this.f45787b) {
            this.f45793h = new View[this.f45787b];
        }
        for (int i10 = 0; i10 < this.f45787b; i10++) {
            this.f45793h[i10] = constraintLayout.getViewById(this.f45786a[i10]);
        }
        return this.f45793h;
    }

    public int y(int i10) {
        int i11 = -1;
        for (int i12 : this.f45786a) {
            i11++;
            if (i12 == i10) {
                return i11;
            }
        }
        return i11;
    }

    protected void z(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46638r2) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f45791f = string;
                    setIds(string);
                } else if (index == j.c.f46655s2) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f45792g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45786a = new int[32];
        int i10 = 4 | 0;
        this.f45790e = false;
        this.f45793h = null;
        this.f45794i = new HashMap<>();
        this.f45788c = context;
        z(attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45786a = new int[32];
        this.f45790e = false;
        this.f45793h = null;
        this.f45794i = new HashMap<>();
        this.f45788c = context;
        z(attributeSet);
    }
}
