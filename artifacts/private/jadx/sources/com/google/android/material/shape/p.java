package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f113595m = new n(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f f113596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f113597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f f113598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    f f113599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    e f113600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    e f113601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    e f113602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    e f113603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    h f113604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    h f113605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    h f113606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    h f113607l;

    @b1({b1.a.LIBRARY_GROUP})
    public interface c {
        @NonNull
        e a(@NonNull e eVar);
    }

    @NonNull
    public static b a() {
        return new b();
    }

    @NonNull
    public static b b(Context context, @g1 int i10, @g1 int i11) {
        return c(context, i10, i11, 0);
    }

    @NonNull
    private static b c(Context context, @g1 int i10, @g1 int i11, int i12) {
        return d(context, i10, i11, new com.google.android.material.shape.a(i12));
    }

    @NonNull
    private static b d(Context context, @g1 int i10, @g1 int i11, @NonNull e eVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(r6.a.o.lt);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(r6.a.o.mt, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(r6.a.o.pt, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(r6.a.o.qt, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(r6.a.o.ot, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(r6.a.o.nt, i12);
            e eVarM = m(typedArrayObtainStyledAttributes, r6.a.o.rt, eVar);
            e eVarM2 = m(typedArrayObtainStyledAttributes, r6.a.o.ut, eVarM);
            e eVarM3 = m(typedArrayObtainStyledAttributes, r6.a.o.vt, eVarM);
            e eVarM4 = m(typedArrayObtainStyledAttributes, r6.a.o.tt, eVarM);
            b bVarV = new b().I(i13, eVarM2).N(i14, eVarM3).A(i15, eVarM4).v(i16, m(typedArrayObtainStyledAttributes, r6.a.o.st, eVarM));
            typedArrayObtainStyledAttributes.recycle();
            return bVarV;
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @NonNull
    public static b e(@NonNull Context context, AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    @NonNull
    public static b f(@NonNull Context context, AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11, int i12) {
        return g(context, attributeSet, i10, i11, new com.google.android.material.shape.a(i12));
    }

    @NonNull
    public static b g(@NonNull Context context, AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11, @NonNull e eVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.Rn, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Sn, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Tn, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, eVar);
    }

    @NonNull
    private static e m(TypedArray typedArray, int i10, @NonNull e eVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new com.google.android.material.shape.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new n(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return eVar;
    }

    @NonNull
    public h h() {
        return this.f113606k;
    }

    @NonNull
    public f i() {
        return this.f113599d;
    }

    @NonNull
    public e j() {
        return this.f113603h;
    }

    @NonNull
    public f k() {
        return this.f113598c;
    }

    @NonNull
    public e l() {
        return this.f113602g;
    }

    @NonNull
    public h n() {
        return this.f113607l;
    }

    @NonNull
    public h o() {
        return this.f113605j;
    }

    @NonNull
    public h p() {
        return this.f113604i;
    }

    @NonNull
    public f q() {
        return this.f113596a;
    }

    @NonNull
    public e r() {
        return this.f113600e;
    }

    @NonNull
    public f s() {
        return this.f113597b;
    }

    @NonNull
    public e t() {
        return this.f113601f;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean u(@NonNull RectF rectF) {
        int i10 = 3 ^ 0;
        boolean z10 = this.f113607l.getClass().equals(h.class) && this.f113605j.getClass().equals(h.class) && this.f113604i.getClass().equals(h.class) && this.f113606k.getClass().equals(h.class);
        float fA = this.f113600e.a(rectF);
        return z10 && ((this.f113601f.a(rectF) > fA ? 1 : (this.f113601f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f113603h.a(rectF) > fA ? 1 : (this.f113603h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f113602g.a(rectF) > fA ? 1 : (this.f113602g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f113597b instanceof o) && (this.f113596a instanceof o) && (this.f113598c instanceof o) && (this.f113599d instanceof o));
    }

    @NonNull
    public b v() {
        return new b(this);
    }

    @NonNull
    public p w(float f10) {
        return v().o(f10).m();
    }

    @NonNull
    public p x(@NonNull e eVar) {
        return v().p(eVar).m();
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public p y(@NonNull c cVar) {
        return v().L(cVar.a(r())).Q(cVar.a(t())).y(cVar.a(j())).D(cVar.a(l())).m();
    }

    private p(@NonNull b bVar) {
        this.f113596a = bVar.f113608a;
        this.f113597b = bVar.f113609b;
        this.f113598c = bVar.f113610c;
        this.f113599d = bVar.f113611d;
        this.f113600e = bVar.f113612e;
        this.f113601f = bVar.f113613f;
        this.f113602g = bVar.f113614g;
        this.f113603h = bVar.f113615h;
        this.f113604i = bVar.f113616i;
        this.f113605j = bVar.f113617j;
        this.f113606k = bVar.f113618k;
        this.f113607l = bVar.f113619l;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private f f113608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private f f113609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private f f113610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private f f113611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        private e f113612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        private e f113613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        private e f113614g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        private e f113615h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        private h f113616i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        private h f113617j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        private h f113618k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        private h f113619l;

        public b() {
            this.f113608a = l.b();
            this.f113609b = l.b();
            this.f113610c = l.b();
            this.f113611d = l.b();
            this.f113612e = new com.google.android.material.shape.a(0.0f);
            this.f113613f = new com.google.android.material.shape.a(0.0f);
            this.f113614g = new com.google.android.material.shape.a(0.0f);
            this.f113615h = new com.google.android.material.shape.a(0.0f);
            this.f113616i = l.c();
            this.f113617j = l.c();
            this.f113618k = l.c();
            this.f113619l = l.c();
        }

        private static float n(f fVar) {
            if (fVar instanceof o) {
                return ((o) fVar).f113594a;
            }
            if (fVar instanceof g) {
                return ((g) fVar).f113531a;
            }
            return -1.0f;
        }

        @NonNull
        @z7.a
        public b A(int i10, @NonNull e eVar) {
            return B(l.a(i10)).D(eVar);
        }

        @NonNull
        @z7.a
        public b B(@NonNull f fVar) {
            this.f113610c = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                C(fN);
            }
            return this;
        }

        @NonNull
        @z7.a
        public b C(@androidx.annotation.r float f10) {
            this.f113614g = new com.google.android.material.shape.a(f10);
            return this;
        }

        @NonNull
        @z7.a
        public b D(@NonNull e eVar) {
            this.f113614g = eVar;
            return this;
        }

        @NonNull
        @z7.a
        public b E(@NonNull h hVar) {
            this.f113619l = hVar;
            return this;
        }

        @NonNull
        @z7.a
        public b F(@NonNull h hVar) {
            this.f113617j = hVar;
            return this;
        }

        @NonNull
        @z7.a
        public b G(@NonNull h hVar) {
            this.f113616i = hVar;
            return this;
        }

        @NonNull
        @z7.a
        public b H(int i10, @androidx.annotation.r float f10) {
            return J(l.a(i10)).K(f10);
        }

        @NonNull
        @z7.a
        public b I(int i10, @NonNull e eVar) {
            return J(l.a(i10)).L(eVar);
        }

        @NonNull
        @z7.a
        public b J(@NonNull f fVar) {
            this.f113608a = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                K(fN);
            }
            return this;
        }

        @NonNull
        @z7.a
        public b K(@androidx.annotation.r float f10) {
            this.f113612e = new com.google.android.material.shape.a(f10);
            return this;
        }

        @NonNull
        @z7.a
        public b L(@NonNull e eVar) {
            this.f113612e = eVar;
            return this;
        }

        @NonNull
        @z7.a
        public b M(int i10, @androidx.annotation.r float f10) {
            return O(l.a(i10)).P(f10);
        }

        @NonNull
        @z7.a
        public b N(int i10, @NonNull e eVar) {
            return O(l.a(i10)).Q(eVar);
        }

        @NonNull
        @z7.a
        public b O(@NonNull f fVar) {
            this.f113609b = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                P(fN);
            }
            return this;
        }

        @NonNull
        @z7.a
        public b P(@androidx.annotation.r float f10) {
            this.f113613f = new com.google.android.material.shape.a(f10);
            return this;
        }

        @NonNull
        @z7.a
        public b Q(@NonNull e eVar) {
            this.f113613f = eVar;
            return this;
        }

        @NonNull
        public p m() {
            return new p(this);
        }

        @NonNull
        @z7.a
        public b o(@androidx.annotation.r float f10) {
            return K(f10).P(f10).C(f10).x(f10);
        }

        @NonNull
        @z7.a
        public b p(@NonNull e eVar) {
            return L(eVar).Q(eVar).D(eVar).y(eVar);
        }

        @NonNull
        @z7.a
        public b q(int i10, @androidx.annotation.r float f10) {
            return r(l.a(i10)).o(f10);
        }

        @NonNull
        @z7.a
        public b r(@NonNull f fVar) {
            return J(fVar).O(fVar).B(fVar).w(fVar);
        }

        @NonNull
        @z7.a
        public b s(@NonNull h hVar) {
            return E(hVar).G(hVar).F(hVar).t(hVar);
        }

        @NonNull
        @z7.a
        public b t(@NonNull h hVar) {
            this.f113618k = hVar;
            return this;
        }

        @NonNull
        @z7.a
        public b u(int i10, @androidx.annotation.r float f10) {
            return w(l.a(i10)).x(f10);
        }

        @NonNull
        @z7.a
        public b v(int i10, @NonNull e eVar) {
            return w(l.a(i10)).y(eVar);
        }

        @NonNull
        @z7.a
        public b w(@NonNull f fVar) {
            this.f113611d = fVar;
            float fN = n(fVar);
            if (fN != -1.0f) {
                x(fN);
            }
            return this;
        }

        @NonNull
        @z7.a
        public b x(@androidx.annotation.r float f10) {
            this.f113615h = new com.google.android.material.shape.a(f10);
            return this;
        }

        @NonNull
        @z7.a
        public b y(@NonNull e eVar) {
            this.f113615h = eVar;
            return this;
        }

        @NonNull
        @z7.a
        public b z(int i10, @androidx.annotation.r float f10) {
            return B(l.a(i10)).C(f10);
        }

        public b(@NonNull p pVar) {
            this.f113608a = l.b();
            this.f113609b = l.b();
            this.f113610c = l.b();
            this.f113611d = l.b();
            this.f113612e = new com.google.android.material.shape.a(0.0f);
            this.f113613f = new com.google.android.material.shape.a(0.0f);
            this.f113614g = new com.google.android.material.shape.a(0.0f);
            this.f113615h = new com.google.android.material.shape.a(0.0f);
            this.f113616i = l.c();
            this.f113617j = l.c();
            this.f113618k = l.c();
            this.f113619l = l.c();
            this.f113608a = pVar.f113596a;
            this.f113609b = pVar.f113597b;
            this.f113610c = pVar.f113598c;
            this.f113611d = pVar.f113599d;
            this.f113612e = pVar.f113600e;
            this.f113613f = pVar.f113601f;
            this.f113614g = pVar.f113602g;
            this.f113615h = pVar.f113603h;
            this.f113616i = pVar.f113604i;
            this.f113617j = pVar.f113605j;
            this.f113618k = pVar.f113606k;
            this.f113619l = pVar.f113607l;
        }
    }

    public p() {
        this.f113596a = l.b();
        this.f113597b = l.b();
        this.f113598c = l.b();
        this.f113599d = l.b();
        this.f113600e = new com.google.android.material.shape.a(0.0f);
        this.f113601f = new com.google.android.material.shape.a(0.0f);
        this.f113602g = new com.google.android.material.shape.a(0.0f);
        this.f113603h = new com.google.android.material.shape.a(0.0f);
        this.f113604i = l.c();
        this.f113605j = l.c();
        this.f113606k = l.c();
        this.f113607l = l.c();
    }
}
