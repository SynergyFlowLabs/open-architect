package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.collection.b3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class k extends Drawable implements androidx.core.graphics.drawable.i, t {
    private static final float H1 = 0.75f;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f113540g3 = 0;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f113541h3 = 1;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f113542i3 = 2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final Paint f113543j3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f113544p1 = "k";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final float f113545p2 = 0.25f;

    @p0
    private PorterDuffColorFilter X;
    private int Y;

    @NonNull
    private final RectF Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f113546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r.j[] f113547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r.j[] f113548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BitSet f113549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f113550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Matrix f113551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f113552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Path f113553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f113554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f113555j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Region f113556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Region f113557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p f113558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f113559n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint f113560o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f113561p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.google.android.material.shadow.b f113562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private final q.b f113563t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final q f113564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private PorterDuffColorFilter f113565w;

    class a implements q.b {
        a() {
        }

        @Override // com.google.android.material.shape.q.b
        public void a(@NonNull r rVar, Matrix matrix, int i10) {
            k.this.f113549d.set(i10, rVar.e());
            k.this.f113547b[i10] = rVar.f(matrix);
        }

        @Override // com.google.android.material.shape.q.b
        public void b(@NonNull r rVar, Matrix matrix, int i10) {
            k.this.f113549d.set(i10 + 4, rVar.e());
            k.this.f113548c[i10] = rVar.f(matrix);
        }
    }

    class b implements p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f113567a;

        b(float f10) {
            this.f113567a = f10;
        }

        @Override // com.google.android.material.shape.p.c
        @NonNull
        public e a(@NonNull e eVar) {
            return eVar instanceof n ? eVar : new com.google.android.material.shape.b(this.f113567a, eVar);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    static {
        Paint paint = new Paint(1);
        f113543j3 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public k() {
        this(new p());
    }

    private boolean N0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f113546a.f113572d == null || color2 == (colorForState2 = this.f113546a.f113572d.getColorForState(iArr, (color2 = this.f113559n.getColor())))) {
            z10 = false;
        } else {
            this.f113559n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f113546a.f113573e == null || color == (colorForState = this.f113546a.f113573e.getColorForState(iArr, (color = this.f113560o.getColor())))) {
            return z10;
        }
        this.f113560o.setColor(colorForState);
        return true;
    }

    private boolean O0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f113565w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.X;
        d dVar = this.f113546a;
        this.f113565w = k(dVar.f113575g, dVar.f113576h, this.f113559n, true);
        d dVar2 = this.f113546a;
        this.X = k(dVar2.f113574f, dVar2.f113576h, this.f113560o, false);
        d dVar3 = this.f113546a;
        if (dVar3.f113589u) {
            this.f113562s.e(dVar3.f113575g.getColorForState(getState(), 0));
        }
        return (androidx.core.util.o.a(porterDuffColorFilter, this.f113565w) && androidx.core.util.o.a(porterDuffColorFilter2, this.X)) ? false : true;
    }

    private float P() {
        if (Z()) {
            return this.f113560o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void P0() {
        float fW = W();
        this.f113546a.f113586r = (int) Math.ceil(0.75f * fW);
        this.f113546a.f113587s = (int) Math.ceil(fW * f113545p2);
        O0();
        b0();
    }

    private boolean X() {
        d dVar = this.f113546a;
        int i10 = dVar.f113585q;
        if (i10 == 1 || dVar.f113586r <= 0) {
            return false;
        }
        return i10 == 2 || k0();
    }

    private boolean Y() {
        Paint.Style style = this.f113546a.f113590v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean Z() {
        Paint.Style style = this.f113546a.f113590v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f113560o.getStrokeWidth() > 0.0f;
    }

    private void b0() {
        super.invalidateSelf();
    }

    @p0
    private PorterDuffColorFilter f(@NonNull Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.Y = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(@NonNull RectF rectF, @NonNull Path path) {
        h(rectF, path);
        if (this.f113546a.f113578j != 1.0f) {
            this.f113551f.reset();
            Matrix matrix = this.f113551f;
            float f10 = this.f113546a.f113578j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f113551f);
        }
        path.computeBounds(this.Z, true);
    }

    private void h0(@NonNull Canvas canvas) {
        if (X()) {
            canvas.save();
            j0(canvas);
            if (!this.f113561p0) {
                p(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.Z.width() - getBounds().width());
            int iHeight = (int) (this.Z.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.Z.width()) + (this.f113546a.f113586r * 2) + iWidth, ((int) this.Z.height()) + (this.f113546a.f113586r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f113546a.f113586r) - iWidth;
            float f11 = (getBounds().top - this.f113546a.f113586r) - iHeight;
            canvas2.translate(-f10, -f11);
            p(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private void i() {
        p pVarY = getShapeAppearanceModel().y(new b(-P()));
        this.f113558m = pVarY;
        this.f113564v.d(pVarY, this.f113546a.f113579k, x(), this.f113553h);
    }

    private static int i0(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    @NonNull
    private PorterDuffColorFilter j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.Y = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private void j0(@NonNull Canvas canvas) {
        canvas.translate(J(), K());
    }

    @NonNull
    private PorterDuffColorFilter k(@p0 ColorStateList colorStateList, @p0 PorterDuff.Mode mode, @NonNull Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    @NonNull
    public static k m(Context context) {
        return n(context, 0.0f);
    }

    @NonNull
    public static k n(@NonNull Context context, float f10) {
        return o(context, f10, null);
    }

    @NonNull
    public static k o(@NonNull Context context, float f10, @p0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(com.google.android.material.color.u.c(context, r6.a.c.f359214e4, k.class.getSimpleName()));
        }
        k kVar = new k();
        kVar.a0(context);
        kVar.p0(colorStateList);
        kVar.o0(f10);
        return kVar;
    }

    private void p(@NonNull Canvas canvas) {
        this.f113549d.cardinality();
        if (this.f113546a.f113587s != 0) {
            canvas.drawPath(this.f113552g, this.f113562s.d());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f113547b[i10].b(this.f113562s, this.f113546a.f113586r, canvas);
            this.f113548c[i10].b(this.f113562s, this.f113546a.f113586r, canvas);
        }
        if (this.f113561p0) {
            int iJ = J();
            int iK = K();
            canvas.translate(-iJ, -iK);
            canvas.drawPath(this.f113552g, f113543j3);
            canvas.translate(iJ, iK);
        }
    }

    private void q(@NonNull Canvas canvas) {
        s(canvas, this.f113559n, this.f113552g, this.f113546a.f113569a, w());
    }

    private void s(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull p pVar, @NonNull RectF rectF) {
        if (!pVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = pVar.t().a(rectF) * this.f113546a.f113579k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    @NonNull
    private RectF x() {
        this.f113555j.set(w());
        float fP = P();
        this.f113555j.inset(fP, fP);
        return this.f113555j;
    }

    public float A() {
        return this.f113546a.f113579k;
    }

    @Deprecated
    public void A0(boolean z10) {
        y0(!z10 ? 1 : 0);
    }

    public Paint.Style B() {
        return this.f113546a.f113590v;
    }

    @Deprecated
    public void B0(int i10) {
        this.f113546a.f113586r = i10;
    }

    public float C() {
        return this.f113546a.f113582n;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void C0(int i10) {
        d dVar = this.f113546a;
        if (dVar.f113587s != i10) {
            dVar.f113587s = i10;
            b0();
        }
    }

    @Deprecated
    public void D(int i10, int i11, @NonNull Path path) {
        h(new RectF(0.0f, 0.0f, i10, i11), path);
    }

    @Deprecated
    public void D0(@NonNull s sVar) {
        setShapeAppearanceModel(sVar);
    }

    @androidx.annotation.l
    public int E() {
        return this.Y;
    }

    public void E0(float f10, @androidx.annotation.l int i10) {
        J0(f10);
        G0(ColorStateList.valueOf(i10));
    }

    public float F() {
        return this.f113546a.f113578j;
    }

    public void F0(float f10, @p0 ColorStateList colorStateList) {
        J0(f10);
        G0(colorStateList);
    }

    public int G() {
        return this.f113546a.f113588t;
    }

    public void G0(@p0 ColorStateList colorStateList) {
        d dVar = this.f113546a;
        if (dVar.f113573e != colorStateList) {
            dVar.f113573e = colorStateList;
            onStateChange(getState());
        }
    }

    public int H() {
        return this.f113546a.f113585q;
    }

    public void H0(@androidx.annotation.l int i10) {
        I0(ColorStateList.valueOf(i10));
    }

    @Deprecated
    public int I() {
        return (int) y();
    }

    public void I0(ColorStateList colorStateList) {
        this.f113546a.f113574f = colorStateList;
        O0();
        b0();
    }

    public int J() {
        d dVar = this.f113546a;
        return (int) (((double) dVar.f113587s) * Math.sin(Math.toRadians(dVar.f113588t)));
    }

    public void J0(float f10) {
        this.f113546a.f113580l = f10;
        invalidateSelf();
    }

    public int K() {
        d dVar = this.f113546a;
        return (int) (((double) dVar.f113587s) * Math.cos(Math.toRadians(dVar.f113588t)));
    }

    public void K0(float f10) {
        d dVar = this.f113546a;
        if (dVar.f113584p != f10) {
            dVar.f113584p = f10;
            P0();
        }
    }

    public int L() {
        return this.f113546a.f113586r;
    }

    public void L0(boolean z10) {
        d dVar = this.f113546a;
        if (dVar.f113589u != z10) {
            dVar.f113589u = z10;
            invalidateSelf();
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public int M() {
        return this.f113546a.f113587s;
    }

    public void M0(float f10) {
        K0(f10 - y());
    }

    @p0
    @Deprecated
    public s N() {
        p shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof s) {
            return (s) shapeAppearanceModel;
        }
        return null;
    }

    @p0
    public ColorStateList O() {
        return this.f113546a.f113573e;
    }

    @p0
    public ColorStateList Q() {
        return this.f113546a.f113574f;
    }

    public float R() {
        return this.f113546a.f113580l;
    }

    @p0
    public ColorStateList S() {
        return this.f113546a.f113575g;
    }

    public float T() {
        return this.f113546a.f113569a.r().a(w());
    }

    public float U() {
        return this.f113546a.f113569a.t().a(w());
    }

    public float V() {
        return this.f113546a.f113584p;
    }

    public float W() {
        return y() + V();
    }

    public void a0(Context context) {
        this.f113546a.f113570b = new w6.a(context);
        P0();
    }

    public boolean c0() {
        w6.a aVar = this.f113546a.f113570b;
        return aVar != null && aVar.l();
    }

    public boolean d0() {
        return this.f113546a.f113570b != null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f113559n.setColorFilter(this.f113565w);
        int alpha = this.f113559n.getAlpha();
        this.f113559n.setAlpha(i0(alpha, this.f113546a.f113581m));
        this.f113560o.setColorFilter(this.X);
        this.f113560o.setStrokeWidth(this.f113546a.f113580l);
        int alpha2 = this.f113560o.getAlpha();
        this.f113560o.setAlpha(i0(alpha2, this.f113546a.f113581m));
        if (this.f113550e) {
            i();
            g(w(), this.f113552g);
            this.f113550e = false;
        }
        h0(canvas);
        if (Y()) {
            q(canvas);
        }
        if (Z()) {
            t(canvas);
        }
        this.f113559n.setAlpha(alpha);
        this.f113560o.setAlpha(alpha2);
    }

    public boolean e0(int i10, int i11) {
        return getTransparentRegion().contains(i10, i11);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean f0() {
        return this.f113546a.f113569a.u(w());
    }

    @Deprecated
    public boolean g0() {
        int i10 = this.f113546a.f113585q;
        return i10 == 0 || i10 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f113546a.f113581m;
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public Drawable.ConstantState getConstantState() {
        return this.f113546a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @e.b(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f113546a.f113585q == 2) {
            return;
        }
        if (f0()) {
            outline.setRoundRect(getBounds(), T() * this.f113546a.f113579k);
        } else {
            g(w(), this.f113552g);
            com.google.android.material.drawable.a.l(outline, this.f113552g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f113546a.f113577i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f113546a.f113569a;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f113556k.set(getBounds());
        g(w(), this.f113552g);
        this.f113557l.setPath(this.f113552g, this.f113556k);
        this.f113556k.op(this.f113557l, Region.Op.DIFFERENCE);
        return this.f113556k;
    }

    @b1({b1.a.LIBRARY_GROUP})
    protected final void h(@NonNull RectF rectF, @NonNull Path path) {
        q qVar = this.f113564v;
        d dVar = this.f113546a;
        qVar.e(dVar.f113569a, dVar.f113579k, rectF, this.f113563t, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f113550e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f113546a.f113575g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f113546a.f113574f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f113546a.f113573e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f113546a.f113572d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    public boolean k0() {
        if (!f0()) {
            this.f113552g.isConvex();
        }
        return false;
    }

    @androidx.annotation.l
    @b1({b1.a.LIBRARY_GROUP})
    protected int l(@androidx.annotation.l int i10) {
        float fW = W() + C();
        w6.a aVar = this.f113546a.f113570b;
        return aVar != null ? aVar.e(i10, fW) : i10;
    }

    public void l0(float f10) {
        setShapeAppearanceModel(this.f113546a.f113569a.w(f10));
    }

    public void m0(@NonNull e eVar) {
        setShapeAppearanceModel(this.f113546a.f113569a.x(eVar));
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f113546a = new d(this.f113546a);
        return this;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void n0(boolean z10) {
        this.f113564v.n(z10);
    }

    public void o0(float f10) {
        d dVar = this.f113546a;
        if (dVar.f113583o != f10) {
            dVar.f113583o = f10;
            P0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f113550e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.d0.b
    protected boolean onStateChange(int[] iArr) {
        boolean z10 = N0(iArr) || O0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void p0(@p0 ColorStateList colorStateList) {
        d dVar = this.f113546a;
        if (dVar.f113572d != colorStateList) {
            dVar.f113572d = colorStateList;
            onStateChange(getState());
        }
    }

    public void q0(float f10) {
        d dVar = this.f113546a;
        if (dVar.f113579k != f10) {
            dVar.f113579k = f10;
            this.f113550e = true;
            invalidateSelf();
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    protected void r(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        s(canvas, paint, path, this.f113546a.f113569a, rectF);
    }

    public void r0(int i10, int i11, int i12, int i13) {
        d dVar = this.f113546a;
        if (dVar.f113577i == null) {
            dVar.f113577i = new Rect();
        }
        this.f113546a.f113577i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void s0(Paint.Style style) {
        this.f113546a.f113590v = style;
        b0();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@g0(from = 0, to = b3.f12144d) int i10) {
        d dVar = this.f113546a;
        if (dVar.f113581m != i10) {
            dVar.f113581m = i10;
            b0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f113546a.f113571c = colorFilter;
        b0();
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        this.f113546a.f113569a = pVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTint(@androidx.annotation.l int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintList(@p0 ColorStateList colorStateList) {
        this.f113546a.f113575g = colorStateList;
        O0();
        b0();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintMode(@p0 PorterDuff.Mode mode) {
        d dVar = this.f113546a;
        if (dVar.f113576h != mode) {
            dVar.f113576h = mode;
            O0();
            b0();
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    protected void t(@NonNull Canvas canvas) {
        s(canvas, this.f113560o, this.f113553h, this.f113558m, x());
    }

    public void t0(float f10) {
        d dVar = this.f113546a;
        if (dVar.f113582n != f10) {
            dVar.f113582n = f10;
            P0();
        }
    }

    public float u() {
        return this.f113546a.f113569a.j().a(w());
    }

    public void u0(float f10) {
        d dVar = this.f113546a;
        if (dVar.f113578j != f10) {
            dVar.f113578j = f10;
            invalidateSelf();
        }
    }

    public float v() {
        return this.f113546a.f113569a.l().a(w());
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void v0(boolean z10) {
        this.f113561p0 = z10;
    }

    @NonNull
    protected RectF w() {
        this.f113554i.set(getBounds());
        return this.f113554i;
    }

    public void w0(int i10) {
        this.f113562s.e(i10);
        int i11 = 3 | 0;
        this.f113546a.f113589u = false;
        b0();
    }

    public void x0(int i10) {
        d dVar = this.f113546a;
        if (dVar.f113588t != i10) {
            dVar.f113588t = i10;
            b0();
        }
    }

    public float y() {
        return this.f113546a.f113583o;
    }

    public void y0(int i10) {
        d dVar = this.f113546a;
        if (dVar.f113585q != i10) {
            dVar.f113585q = i10;
            b0();
        }
    }

    @p0
    public ColorStateList z() {
        return this.f113546a.f113572d;
    }

    @Deprecated
    public void z0(int i10) {
        o0(i10);
    }

    public k(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11) {
        this(p.e(context, attributeSet, i10, i11).m());
    }

    @Deprecated
    public k(@NonNull s sVar) {
        this((p) sVar);
    }

    public k(@NonNull p pVar) {
        this(new d(pVar, null));
    }

    @b1({b1.a.LIBRARY_GROUP})
    protected k(@NonNull d dVar) {
        q qVar;
        this.f113547b = new r.j[4];
        this.f113548c = new r.j[4];
        this.f113549d = new BitSet(8);
        this.f113551f = new Matrix();
        this.f113552g = new Path();
        this.f113553h = new Path();
        this.f113554i = new RectF();
        this.f113555j = new RectF();
        this.f113556k = new Region();
        this.f113557l = new Region();
        Paint paint = new Paint(1);
        this.f113559n = paint;
        Paint paint2 = new Paint(1);
        this.f113560o = paint2;
        this.f113562s = new com.google.android.material.shadow.b();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qVar = q.k();
        } else {
            qVar = new q();
        }
        this.f113564v = qVar;
        this.Z = new RectF();
        this.f113561p0 = true;
        this.f113546a = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        O0();
        N0(getState());
        this.f113563t = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @b1({b1.a.LIBRARY_GROUP})
    public static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        p f113569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        w6.a f113570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        ColorFilter f113571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        ColorStateList f113572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        ColorStateList f113573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        ColorStateList f113574f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        ColorStateList f113575g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        PorterDuff.Mode f113576h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        Rect f113577i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f113578j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f113579k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f113580l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f113581m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f113582n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f113583o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f113584p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f113585q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f113586r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f113587s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f113588t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f113589u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Paint.Style f113590v;

        public d(@NonNull p pVar, @p0 w6.a aVar) {
            this.f113572d = null;
            this.f113573e = null;
            this.f113574f = null;
            this.f113575g = null;
            this.f113576h = PorterDuff.Mode.SRC_IN;
            this.f113577i = null;
            this.f113578j = 1.0f;
            this.f113579k = 1.0f;
            this.f113581m = 255;
            this.f113582n = 0.0f;
            this.f113583o = 0.0f;
            this.f113584p = 0.0f;
            this.f113585q = 0;
            this.f113586r = 0;
            this.f113587s = 0;
            this.f113588t = 0;
            this.f113589u = false;
            this.f113590v = Paint.Style.FILL_AND_STROKE;
            this.f113569a = pVar;
            this.f113570b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            k kVar = new k(this);
            kVar.f113550e = true;
            return kVar;
        }

        public d(@NonNull d dVar) {
            this.f113572d = null;
            this.f113573e = null;
            this.f113574f = null;
            this.f113575g = null;
            this.f113576h = PorterDuff.Mode.SRC_IN;
            this.f113577i = null;
            this.f113578j = 1.0f;
            this.f113579k = 1.0f;
            this.f113581m = 255;
            this.f113582n = 0.0f;
            this.f113583o = 0.0f;
            this.f113584p = 0.0f;
            this.f113585q = 0;
            this.f113586r = 0;
            this.f113587s = 0;
            this.f113588t = 0;
            this.f113589u = false;
            this.f113590v = Paint.Style.FILL_AND_STROKE;
            this.f113569a = dVar.f113569a;
            this.f113570b = dVar.f113570b;
            this.f113580l = dVar.f113580l;
            this.f113571c = dVar.f113571c;
            this.f113572d = dVar.f113572d;
            this.f113573e = dVar.f113573e;
            this.f113576h = dVar.f113576h;
            this.f113575g = dVar.f113575g;
            this.f113581m = dVar.f113581m;
            this.f113578j = dVar.f113578j;
            this.f113587s = dVar.f113587s;
            this.f113585q = dVar.f113585q;
            this.f113589u = dVar.f113589u;
            this.f113579k = dVar.f113579k;
            this.f113582n = dVar.f113582n;
            this.f113583o = dVar.f113583o;
            this.f113584p = dVar.f113584p;
            this.f113586r = dVar.f113586r;
            this.f113588t = dVar.f113588t;
            this.f113574f = dVar.f113574f;
            this.f113590v = dVar.f113590v;
            if (dVar.f113577i != null) {
                this.f113577i = new Rect(dVar.f113577i);
            }
        }
    }
}
