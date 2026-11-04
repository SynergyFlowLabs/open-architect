package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.y;
import androidx.core.content.res.i;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f113299r = "TextAppearance";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f113300s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f113301t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f113302u = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final ColorStateList f113303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final ColorStateList f113304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final ColorStateList f113305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f113306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f113307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f113308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f113309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f113310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f113311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f113312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f113313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f113314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private ColorStateList f113315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f113316n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @y
    private final int f113317o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f113318p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Typeface f113319q;

    class a extends i.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f113320a;

        a(f fVar) {
            this.f113320a = fVar;
        }

        @Override // androidx.core.content.res.i.f
        public void f(int i10) {
            d.this.f113318p = true;
            this.f113320a.a(i10);
        }

        @Override // androidx.core.content.res.i.f
        public void g(@NonNull Typeface typeface) {
            d dVar = d.this;
            dVar.f113319q = Typeface.create(typeface, dVar.f113307e);
            d.this.f113318p = true;
            this.f113320a.b(d.this.f113319q, false);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f113322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f113323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f113324c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f113322a = context;
            this.f113323b = textPaint;
            this.f113324c = fVar;
        }

        @Override // com.google.android.material.resources.f
        public void a(int i10) {
            this.f113324c.a(i10);
        }

        @Override // com.google.android.material.resources.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            d.this.p(this.f113322a, this.f113323b, typeface);
            this.f113324c.b(typeface, z10);
        }
    }

    public d(@NonNull Context context, @g1 int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, r6.a.o.cw);
        l(typedArrayObtainStyledAttributes.getDimension(r6.a.o.dw, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, r6.a.o.gw));
        this.f113303a = c.a(context, typedArrayObtainStyledAttributes, r6.a.o.hw);
        this.f113304b = c.a(context, typedArrayObtainStyledAttributes, r6.a.o.iw);
        this.f113307e = typedArrayObtainStyledAttributes.getInt(r6.a.o.fw, 0);
        this.f113308f = typedArrayObtainStyledAttributes.getInt(r6.a.o.ew, 1);
        int iG = c.g(typedArrayObtainStyledAttributes, r6.a.o.pw, r6.a.o.nw);
        this.f113317o = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.f113306d = typedArrayObtainStyledAttributes.getString(iG);
        this.f113309g = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.rw, false);
        this.f113305c = c.a(context, typedArrayObtainStyledAttributes, r6.a.o.jw);
        this.f113310h = typedArrayObtainStyledAttributes.getFloat(r6.a.o.kw, 0.0f);
        this.f113311i = typedArrayObtainStyledAttributes.getFloat(r6.a.o.lw, 0.0f);
        this.f113312j = typedArrayObtainStyledAttributes.getFloat(r6.a.o.mw, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, r6.a.o.co);
        this.f113313k = typedArrayObtainStyledAttributes2.hasValue(r6.a.o.eo);
        this.f113314l = typedArrayObtainStyledAttributes2.getFloat(r6.a.o.eo, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f113319q == null && (str = this.f113306d) != null) {
            this.f113319q = Typeface.create(str, this.f113307e);
        }
        if (this.f113319q == null) {
            int i10 = this.f113308f;
            if (i10 != 1) {
                int i11 = 5 ^ 2;
                if (i10 == 2) {
                    this.f113319q = Typeface.SERIF;
                } else if (i10 != 3) {
                    this.f113319q = Typeface.DEFAULT;
                } else {
                    this.f113319q = Typeface.MONOSPACE;
                }
            } else {
                this.f113319q = Typeface.SANS_SERIF;
            }
            this.f113319q = Typeface.create(this.f113319q, this.f113307e);
        }
    }

    private boolean m(Context context) {
        if (e.b()) {
            return true;
        }
        int i10 = this.f113317o;
        return (i10 != 0 ? i.d(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f113319q;
    }

    @NonNull
    @l1
    public Typeface f(@NonNull Context context) {
        if (this.f113318p) {
            return this.f113319q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = i.j(context, this.f113317o);
                this.f113319q = typefaceJ;
                if (typefaceJ != null) {
                    this.f113319q = Typeface.create(typefaceJ, this.f113307e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        d();
        this.f113318p = true;
        return this.f113319q;
    }

    public void g(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(@NonNull Context context, @NonNull f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f113317o;
        if (i10 == 0) {
            this.f113318p = true;
        }
        if (this.f113318p) {
            fVar.b(this.f113319q, true);
            return;
        }
        try {
            i.l(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f113318p = true;
            fVar.a(1);
        } catch (Exception unused2) {
            this.f113318p = true;
            fVar.a(-3);
        }
    }

    @p0
    public ColorStateList i() {
        return this.f113315m;
    }

    public float j() {
        return this.f113316n;
    }

    public void k(@p0 ColorStateList colorStateList) {
        this.f113315m = colorStateList;
    }

    public void l(float f10) {
        this.f113316n = f10;
    }

    public void n(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f113315m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f113312j;
        float f11 = this.f113310h;
        float f12 = this.f113311i;
        ColorStateList colorStateList2 = this.f113305c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceA = g.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f113307e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f113316n);
        if (this.f113313k) {
            textPaint.setLetterSpacing(this.f113314l);
        }
    }
}
