package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.w0;
import androidx.core.content.res.n;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e extends b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f10500v = "StateListDrawableCompat";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f10501w = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f10502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10503t;

    static class a extends b.d {
        int[][] J;

        a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[g()][];
            }
        }

        int D(int[] iArr, Drawable drawable) {
            int iA = a(drawable);
            this.J[iA] = iArr;
            return iA;
        }

        int E(int[] iArr) {
            int[][] iArr2 = this.J;
            int i10 = i();
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new e(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        public void r(int i10, int i11) {
            super.r(i10, i11);
            int[][] iArr = new int[i11][];
            System.arraycopy(this.J, 0, iArr, 0, i10);
            this.J = iArr;
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        void v() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            int length = iArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    this.J = iArr2;
                    return;
                } else {
                    int[] iArr3 = this.J[length];
                    iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }

    public e() {
        this(null, null);
    }

    private void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        a aVar = this.f10502s;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayS = n.s(resources, theme, attributeSet, k.b.C2243b.f307516w);
                int resourceId = typedArrayS.getResourceId(k.b.C2243b.f307517x, -1);
                Drawable drawableJ = resourceId > 0 ? w0.h().j(context, resourceId) : null;
                typedArrayS.recycle();
                int[] iArrP = p(attributeSet);
                if (drawableJ == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    drawableJ = k.a.C2242a.a(resources, xmlPullParser, attributeSet, theme);
                }
                aVar.D(iArrP, drawableJ);
            }
        }
    }

    private void x(TypedArray typedArray) {
        a aVar = this.f10502s;
        aVar.f10459d |= k.a.C2242a.b(typedArray);
        aVar.f10464i = typedArray.getBoolean(k.b.C2243b.f307512s, aVar.f10464i);
        aVar.f10467l = typedArray.getBoolean(k.b.C2243b.f307513t, aVar.f10467l);
        aVar.A = typedArray.getInt(k.b.C2243b.f307514u, aVar.A);
        aVar.B = typedArray.getInt(k.b.C2243b.f307515v, aVar.B);
        aVar.f10479x = typedArray.getBoolean(k.b.C2243b.f307510q, aVar.f10479x);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @androidx.annotation.w0(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.b
    void b() {
        super.b();
        this.f10503t = false;
    }

    @Override // androidx.appcompat.graphics.drawable.b
    void i(@NonNull b.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.f10502s = (a) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f10503t && super.mutate() == this) {
            this.f10502s.v();
            this.f10503t = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f10502s.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.b
    public a o() {
        return new a(this.f10502s, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iE = this.f10502s.E(iArr);
        if (iE < 0) {
            iE = this.f10502s.E(StateSet.WILD_CARD);
        }
        return h(iE) || zOnStateChange;
    }

    int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        boolean z10 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i12 = i10 + 1;
                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i10] = attributeNameResource;
                i10 = i12;
            }
        }
        return StateSet.trimStateSet(iArr, i10);
    }

    int q() {
        return this.f10502s.i();
    }

    Drawable r(int i10) {
        return this.f10502s.h(i10);
    }

    int s(int[] iArr) {
        return this.f10502s.E(iArr);
    }

    a t() {
        return this.f10502s;
    }

    int[] u(int i10) {
        return this.f10502s.J[i10];
    }

    public void v(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, k.b.C2243b.f307509p);
        setVisible(typedArrayS.getBoolean(k.b.C2243b.f307511r, true), true);
        x(typedArrayS);
        m(resources);
        typedArrayS.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    e(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }

    e(@p0 a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }
}
