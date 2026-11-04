package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.core.content.res.n;
import androidx.core.graphics.o;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class i extends androidx.vectordrawable.graphics.drawable.h {
    private static final int X = 0;
    private static final int Y = 1;
    private static final int Z = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f75902k = "VectorDrawableCompat";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final PorterDuff.Mode f75903l = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f75904m = "clip-path";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f75905n = "group";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f75906o = "path";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f75907p0 = 2048;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final boolean f75908p1 = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f75909s = "vector";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f75910t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f75911v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f75912w = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f75913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f75914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorFilter f75915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f75916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f75917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f75918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f75919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f75920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f75921j;

    private static class b extends f {
        b() {
        }

        private void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f75949b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f75948a = o.d(string2);
            }
            this.f75950c = n.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (n.r(xmlPullParser, "pathData")) {
                TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.I);
                j(typedArrayS, xmlPullParser);
                typedArrayS.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f75969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f75970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f75971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f75972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f75973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f75974f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int[] f75975g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ColorStateList f75976h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PorterDuff.Mode f75977i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f75978j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f75979k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f75980l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Paint f75981m;

        public h(h hVar) {
            this.f75971c = null;
            this.f75972d = i.f75903l;
            if (hVar != null) {
                this.f75969a = hVar.f75969a;
                g gVar = new g(hVar.f75970b);
                this.f75970b = gVar;
                if (hVar.f75970b.f75957e != null) {
                    gVar.f75957e = new Paint(hVar.f75970b.f75957e);
                }
                if (hVar.f75970b.f75956d != null) {
                    this.f75970b.f75956d = new Paint(hVar.f75970b.f75956d);
                }
                this.f75971c = hVar.f75971c;
                this.f75972d = hVar.f75972d;
                this.f75973e = hVar.f75973e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f75974f.getWidth() && i11 == this.f75974f.getHeight();
        }

        public boolean b() {
            return !this.f75980l && this.f75976h == this.f75971c && this.f75977i == this.f75972d && this.f75979k == this.f75973e && this.f75978j == this.f75970b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f75974f != null && a(i10, i11)) {
                return;
            }
            this.f75974f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f75980l = true;
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f75974f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f75981m == null) {
                Paint paint = new Paint();
                this.f75981m = paint;
                paint.setFilterBitmap(true);
            }
            this.f75981m.setAlpha(this.f75970b.getRootAlpha());
            this.f75981m.setColorFilter(colorFilter);
            return this.f75981m;
        }

        public boolean f() {
            return this.f75970b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f75970b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f75969a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f75970b.g(iArr);
            this.f75980l |= zG;
            return zG;
        }

        public void i() {
            this.f75976h = this.f75971c;
            this.f75977i = this.f75972d;
            this.f75978j = this.f75970b.getRootAlpha();
            this.f75979k = this.f75973e;
            this.f75980l = false;
        }

        public void j(int i10, int i11) {
            this.f75974f.eraseColor(0);
            this.f75970b.b(new Canvas(this.f75974f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public h() {
            this.f75971c = null;
            this.f75972d = i.f75903l;
            this.f75970b = new g();
        }
    }

    i() {
        this.f75917f = true;
        this.f75919h = new float[9];
        this.f75920i = new Matrix();
        this.f75921j = new Rect();
        this.f75913b = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    @p0
    public static i d(@NonNull Resources resources, @v int i10, @p0 Resources.Theme theme) {
        i iVar = new i();
        iVar.f75901a = androidx.core.content.res.i.g(resources, i10, theme);
        iVar.f75918g = new C0765i(iVar.f75901a.getConstantState());
        return iVar;
    }

    public static i e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void h(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f75913b;
        g gVar = hVar.f75970b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f75960h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (f75906o.equals(name)) {
                    c cVar = new c();
                    cVar.k(resources, attributeSet, theme, xmlPullParser);
                    dVar.f75935b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f75968p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f75969a = cVar.f75951d | hVar.f75969a;
                    z10 = false;
                    boolean z11 = false;
                } else if (f75904m.equals(name)) {
                    b bVar = new b();
                    bVar.i(resources, attributeSet, theme, xmlPullParser);
                    dVar.f75935b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f75968p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f75969a = bVar.f75951d | hVar.f75969a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f75935b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f75968p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f75969a = dVar2.f75944k | hVar.f75969a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean i() {
        return isAutoMirrored() && androidx.core.graphics.drawable.c.f(this) == 1;
    }

    private static PorterDuff.Mode j(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void k(d dVar, int i10) {
        String str = "";
        for (int i11 = 0; i11 < i10; i11++) {
            str = str + "    ";
        }
        dVar.getGroupName();
        dVar.getLocalMatrix().toString();
        for (int i12 = 0; i12 < dVar.f75935b.size(); i12++) {
            e eVar = dVar.f75935b.get(i12);
            if (eVar instanceof d) {
                k((d) eVar, i10 + 1);
            } else {
                ((f) eVar).g(i10 + 1);
            }
        }
    }

    private void m(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f75913b;
        g gVar = hVar.f75970b;
        hVar.f75972d = j(n.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = n.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f75971c = colorStateListG;
        }
        hVar.f75973e = n.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f75973e);
        gVar.f75963k = n.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f75963k);
        float fJ = n.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f75964l);
        gVar.f75964l = fJ;
        if (gVar.f75963k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f75961i = typedArray.getDimension(3, gVar.f75961i);
        float dimension = typedArray.getDimension(2, gVar.f75962j);
        gVar.f75962j = dimension;
        if (gVar.f75961i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(n.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f75966n = string;
            gVar.f75968p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f75901a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.c.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f75921j);
        if (this.f75921j.width() <= 0 || this.f75921j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f75915d;
        if (colorFilter == null) {
            colorFilter = this.f75914c;
        }
        canvas.getMatrix(this.f75920i);
        this.f75920i.getValues(this.f75919h);
        float fAbs = Math.abs(this.f75919h[0]);
        float fAbs2 = Math.abs(this.f75919h[4]);
        float fAbs3 = Math.abs(this.f75919h[1]);
        float fAbs4 = Math.abs(this.f75919h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f75921j.width() * fAbs);
        int iHeight = (int) (this.f75921j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin > 0 && iMin2 > 0) {
            int iSave = canvas.save();
            Rect rect = this.f75921j;
            canvas.translate(rect.left, rect.top);
            if (i()) {
                canvas.translate(this.f75921j.width(), 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            this.f75921j.offsetTo(0, 0);
            this.f75913b.c(iMin, iMin2);
            if (!this.f75917f) {
                this.f75913b.j(iMin, iMin2);
            } else if (!this.f75913b.b()) {
                this.f75913b.j(iMin, iMin2);
                this.f75913b.i();
            }
            this.f75913b.d(canvas, colorFilter, this.f75921j);
            canvas.restoreToCount(iSave);
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public float f() {
        g gVar;
        h hVar = this.f75913b;
        if (hVar != null && (gVar = hVar.f75970b) != null) {
            float f10 = gVar.f75961i;
            if (f10 != 0.0f) {
                float f11 = gVar.f75962j;
                if (f11 != 0.0f) {
                    float f12 = gVar.f75964l;
                    if (f12 != 0.0f) {
                        float f13 = gVar.f75963k;
                        if (f13 != 0.0f) {
                            return Math.min(f13 / f10, f12 / f11);
                        }
                    }
                }
            }
        }
        return 1.0f;
    }

    Object g(String str) {
        return this.f75913b.f75970b.f75968p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f75901a;
        return drawable != null ? androidx.core.graphics.drawable.c.d(drawable) : this.f75913b.f75970b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f75913b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f75901a;
        return drawable != null ? androidx.core.graphics.drawable.c.e(drawable) : this.f75915d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f75901a != null) {
            return new C0765i(this.f75901a.getConstantState());
        }
        this.f75913b.f75969a = getChangingConfigurations();
        return this.f75913b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f75901a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f75913b.f75970b.f75962j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f75901a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f75913b.f75970b.f75961i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f75901a;
        return drawable != null ? androidx.core.graphics.drawable.c.h(drawable) : this.f75913b.f75973e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f75913b;
        if (hVar != null) {
            if (hVar.g()) {
                return true;
            }
            ColorStateList colorStateList = this.f75913b.f75971c;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    void l(boolean z10) {
        this.f75917f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f75916e && super.mutate() == this) {
            this.f75913b = new h(this.f75913b);
            this.f75916e = true;
        }
        return this;
    }

    PorterDuffColorFilter n(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f75913b;
        ColorStateList colorStateList = hVar.f75971c;
        if (colorStateList == null || (mode = hVar.f75972d) == null) {
            z10 = false;
        } else {
            this.f75914c = n(this.f75914c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.setAlpha(i10);
            return;
        }
        if (this.f75913b.f75970b.getRootAlpha() != i10) {
            this.f75913b.f75970b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.j(drawable, z10);
        } else {
            this.f75913b.f75973e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTint(int i10) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f75913b;
        if (hVar.f75971c != colorStateList) {
            hVar.f75971c = colorStateList;
            this.f75914c = n(this.f75914c, colorStateList, hVar.f75972d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.i
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.p(drawable, mode);
            return;
        }
        h hVar = this.f75913b;
        if (hVar.f75972d != mode) {
            hVar.f75972d = mode;
            this.f75914c = n(this.f75914c, hVar.f75971c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f75901a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.i$i, reason: collision with other inner class name */
    @w0(24)
    private static class C0765i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f75982a;

        public C0765i(Drawable.ConstantState constantState) {
            this.f75982a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f75982a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f75982a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f75901a = (VectorDrawable) this.f75982a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f75901a = (VectorDrawable) this.f75982a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f75901a = (VectorDrawable) this.f75982a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f75915d = colorFilter;
            invalidateSelf();
        }
    }

    private static abstract class f extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected static final int f75947e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected o.b[] f75948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f75949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f75950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f75951d;

        public f() {
            super();
            this.f75948a = null;
            this.f75950c = 0;
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(o.b[] bVarArr) {
            String str = " ";
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                str = str + bVarArr[i10].f47851a + ":";
                for (float f10 : bVarArr[i10].f47852b) {
                    str = str + f10 + ",";
                }
            }
            return str;
        }

        public void g(int i10) {
            String str = "";
            for (int i11 = 0; i11 < i10; i11++) {
                str = str + "    ";
            }
            f(this.f75948a);
        }

        public o.b[] getPathData() {
            return this.f75948a;
        }

        public String getPathName() {
            return this.f75949b;
        }

        public void h(Path path) {
            path.reset();
            o.b[] bVarArr = this.f75948a;
            if (bVarArr != null) {
                o.b.k(bVarArr, path);
            }
        }

        public void setPathData(o.b[] bVarArr) {
            if (o.b(this.f75948a, bVarArr)) {
                o.m(this.f75948a, bVarArr);
            } else {
                this.f75948a = o.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f75948a = null;
            this.f75950c = 0;
            this.f75949b = fVar.f75949b;
            this.f75951d = fVar.f75951d;
            this.f75948a = o.f(fVar.f75948a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f75901a;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f75913b;
        hVar.f75970b = new g();
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f75812a);
        m(typedArrayS, xmlPullParser, theme);
        typedArrayS.recycle();
        hVar.f75969a = getChangingConfigurations();
        hVar.f75980l = true;
        h(resources, xmlPullParser, attributeSet, theme);
        this.f75914c = n(this.f75914c, hVar.f75971c, hVar.f75972d);
    }

    i(@NonNull h hVar) {
        this.f75917f = true;
        this.f75919h = new float[9];
        this.f75920i = new Matrix();
        this.f75921j = new Rect();
        this.f75913b = hVar;
        this.f75914c = n(this.f75914c, hVar.f75971c, hVar.f75972d);
    }

    private static class c extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int[] f75922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.content.res.d f75923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f75924h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        androidx.core.content.res.d f75925i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f75926j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f75927k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f75928l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f75929m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f75930n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Cap f75931o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Paint.Join f75932p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f75933q;

        c() {
            this.f75924h = 0.0f;
            this.f75926j = 1.0f;
            this.f75927k = 1.0f;
            this.f75928l = 0.0f;
            this.f75929m = 1.0f;
            this.f75930n = 0.0f;
            this.f75931o = Paint.Cap.BUTT;
            this.f75932p = Paint.Join.MITER;
            this.f75933q = 4.0f;
        }

        private Paint.Cap i(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join j(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f75922f = null;
            if (n.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f75949b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f75948a = o.d(string2);
                }
                this.f75925i = n.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f75927k = n.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f75927k);
                this.f75931o = i(n.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f75931o);
                this.f75932p = j(n.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f75932p);
                this.f75933q = n.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f75933q);
                this.f75923g = n.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f75926j = n.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f75926j);
                this.f75924h = n.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f75924h);
                this.f75929m = n.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f75929m);
                this.f75930n = n.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f75930n);
                this.f75928l = n.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f75928l);
                this.f75950c = n.k(typedArray, xmlPullParser, "fillType", 13, this.f75950c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            return this.f75925i.i() || this.f75923g.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            return this.f75923g.j(iArr) | this.f75925i.j(iArr);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public void c(Resources.Theme theme) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean d() {
            return this.f75922f != null;
        }

        float getFillAlpha() {
            return this.f75927k;
        }

        @l
        int getFillColor() {
            return this.f75925i.e();
        }

        float getStrokeAlpha() {
            return this.f75926j;
        }

        @l
        int getStrokeColor() {
            return this.f75923g.e();
        }

        float getStrokeWidth() {
            return this.f75924h;
        }

        float getTrimPathEnd() {
            return this.f75929m;
        }

        float getTrimPathOffset() {
            return this.f75930n;
        }

        float getTrimPathStart() {
            return this.f75928l;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f75850t);
            l(typedArrayS, xmlPullParser, theme);
            typedArrayS.recycle();
        }

        void setFillAlpha(float f10) {
            this.f75927k = f10;
        }

        void setFillColor(int i10) {
            this.f75925i.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f75926j = f10;
        }

        void setStrokeColor(int i10) {
            this.f75923g.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f75924h = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f75929m = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f75930n = f10;
        }

        void setTrimPathStart(float f10) {
            this.f75928l = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f75924h = 0.0f;
            this.f75926j = 1.0f;
            this.f75927k = 1.0f;
            this.f75928l = 0.0f;
            this.f75929m = 1.0f;
            this.f75930n = 0.0f;
            this.f75931o = Paint.Cap.BUTT;
            this.f75932p = Paint.Join.MITER;
            this.f75933q = 4.0f;
            this.f75922f = cVar.f75922f;
            this.f75923g = cVar.f75923g;
            this.f75924h = cVar.f75924h;
            this.f75926j = cVar.f75926j;
            this.f75925i = cVar.f75925i;
            this.f75950c = cVar.f75950c;
            this.f75927k = cVar.f75927k;
            this.f75928l = cVar.f75928l;
            this.f75929m = cVar.f75929m;
            this.f75930n = cVar.f75930n;
            this.f75931o = cVar.f75931o;
            this.f75932p = cVar.f75932p;
            this.f75933q = cVar.f75933q;
        }
    }

    private static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f75952q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f75953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f75954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f75955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f75956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f75957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f75958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f75959g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f75960h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f75961i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f75962j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f75963k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f75964l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f75965m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f75966n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f75967o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final androidx.collection.a<String, Object> f75968p;

        public g() {
            this.f75955c = new Matrix();
            this.f75961i = 0.0f;
            this.f75962j = 0.0f;
            this.f75963k = 0.0f;
            this.f75964l = 0.0f;
            this.f75965m = 255;
            this.f75966n = null;
            this.f75967o = null;
            this.f75968p = new androidx.collection.a<>();
            this.f75960h = new d();
            this.f75953a = new Path();
            this.f75954b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f75934a.set(matrix);
            dVar2.f75934a.preConcat(dVar2.f75943j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f75935b.size()) {
                e eVar = dVar2.f75935b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f75934a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar2, (f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f75963k;
            float f11 = i11 / this.f75964l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f75934a;
            this.f75955c.set(matrix);
            this.f75955c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.h(this.f75953a);
            Path path = this.f75953a;
            this.f75954b.reset();
            if (fVar.e()) {
                this.f75954b.setFillType(fVar.f75950c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f75954b.addPath(path, this.f75955c);
                canvas.clipPath(this.f75954b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f75928l;
            if (f12 != 0.0f || cVar.f75929m != 1.0f) {
                float f13 = cVar.f75930n;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f75929m + f13) % 1.0f;
                if (this.f75958f == null) {
                    this.f75958f = new PathMeasure();
                }
                this.f75958f.setPath(this.f75953a, false);
                float length = this.f75958f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f75958f.getSegment(f16, length, path, true);
                    this.f75958f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f75958f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f75954b.addPath(path, this.f75955c);
            if (cVar.f75925i.l()) {
                androidx.core.content.res.d dVar2 = cVar.f75925i;
                if (this.f75957e == null) {
                    Paint paint = new Paint(1);
                    this.f75957e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f75957e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f75955c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f75927k * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(dVar2.e(), cVar.f75927k));
                }
                paint2.setColorFilter(colorFilter);
                this.f75954b.setFillType(cVar.f75950c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f75954b, paint2);
            }
            if (cVar.f75923g.l()) {
                androidx.core.content.res.d dVar3 = cVar.f75923g;
                if (this.f75956d == null) {
                    Paint paint3 = new Paint(1);
                    this.f75956d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f75956d;
                Paint.Join join = cVar.f75932p;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f75931o;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f75933q);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f75955c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f75926j * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(dVar3.e(), cVar.f75926j));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f75924h * fMin * fE);
                canvas.drawPath(this.f75954b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f75960h, f75952q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f75967o == null) {
                this.f75967o = Boolean.valueOf(this.f75960h.a());
            }
            return this.f75967o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f75960h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f75965m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f75965m = i10;
        }

        public g(g gVar) {
            this.f75955c = new Matrix();
            this.f75961i = 0.0f;
            this.f75962j = 0.0f;
            this.f75963k = 0.0f;
            this.f75964l = 0.0f;
            this.f75965m = 255;
            this.f75966n = null;
            this.f75967o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f75968p = aVar;
            this.f75960h = new d(gVar.f75960h, aVar);
            this.f75953a = new Path(gVar.f75953a);
            this.f75954b = new Path(gVar.f75954b);
            this.f75961i = gVar.f75961i;
            this.f75962j = gVar.f75962j;
            this.f75963k = gVar.f75963k;
            this.f75964l = gVar.f75964l;
            this.f75959g = gVar.f75959g;
            this.f75965m = gVar.f75965m;
            this.f75966n = gVar.f75966n;
            String str = gVar.f75966n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f75967o = gVar.f75967o;
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f75934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<e> f75935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f75936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f75937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f75938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f75939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f75940g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f75941h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f75942i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f75943j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f75944k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f75945l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f75946m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            f bVar;
            super();
            this.f75934a = new Matrix();
            this.f75935b = new ArrayList<>();
            this.f75936c = 0.0f;
            this.f75937d = 0.0f;
            this.f75938e = 0.0f;
            this.f75939f = 1.0f;
            this.f75940g = 1.0f;
            this.f75941h = 0.0f;
            this.f75942i = 0.0f;
            Matrix matrix = new Matrix();
            this.f75943j = matrix;
            this.f75946m = null;
            this.f75936c = dVar.f75936c;
            this.f75937d = dVar.f75937d;
            this.f75938e = dVar.f75938e;
            this.f75939f = dVar.f75939f;
            this.f75940g = dVar.f75940g;
            this.f75941h = dVar.f75941h;
            this.f75942i = dVar.f75942i;
            this.f75945l = dVar.f75945l;
            String str = dVar.f75946m;
            this.f75946m = str;
            this.f75944k = dVar.f75944k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f75943j);
            ArrayList<e> arrayList = dVar.f75935b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f75935b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f75935b.add(bVar);
                    String str2 = bVar.f75949b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f75943j.reset();
            this.f75943j.postTranslate(-this.f75937d, -this.f75938e);
            this.f75943j.postScale(this.f75939f, this.f75940g);
            this.f75943j.postRotate(this.f75936c, 0.0f, 0.0f);
            this.f75943j.postTranslate(this.f75941h + this.f75937d, this.f75942i + this.f75938e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f75945l = null;
            this.f75936c = n.j(typedArray, xmlPullParser, androidx.constraintlayout.motion.widget.f.f45124i, 5, this.f75936c);
            boolean z10 = false | true;
            this.f75937d = typedArray.getFloat(1, this.f75937d);
            this.f75938e = typedArray.getFloat(2, this.f75938e);
            this.f75939f = n.j(typedArray, xmlPullParser, "scaleX", 3, this.f75939f);
            this.f75940g = n.j(typedArray, xmlPullParser, "scaleY", 4, this.f75940g);
            this.f75941h = n.j(typedArray, xmlPullParser, "translateX", 6, this.f75941h);
            this.f75942i = n.j(typedArray, xmlPullParser, "translateY", 7, this.f75942i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f75946m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f75935b.size(); i10++) {
                if (this.f75935b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f75935b.size(); i10++) {
                zB |= this.f75935b.get(i10).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f75832k);
            e(typedArrayS, xmlPullParser);
            typedArrayS.recycle();
        }

        public String getGroupName() {
            return this.f75946m;
        }

        public Matrix getLocalMatrix() {
            return this.f75943j;
        }

        public float getPivotX() {
            return this.f75937d;
        }

        public float getPivotY() {
            return this.f75938e;
        }

        public float getRotation() {
            return this.f75936c;
        }

        public float getScaleX() {
            return this.f75939f;
        }

        public float getScaleY() {
            return this.f75940g;
        }

        public float getTranslateX() {
            return this.f75941h;
        }

        public float getTranslateY() {
            return this.f75942i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f75937d) {
                this.f75937d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f75938e) {
                this.f75938e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f75936c) {
                this.f75936c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f75939f) {
                this.f75939f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f75940g) {
                this.f75940g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f75941h) {
                this.f75941h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f75942i) {
                this.f75942i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f75934a = new Matrix();
            this.f75935b = new ArrayList<>();
            this.f75936c = 0.0f;
            this.f75937d = 0.0f;
            this.f75938e = 0.0f;
            this.f75939f = 1.0f;
            this.f75940g = 1.0f;
            this.f75941h = 0.0f;
            this.f75942i = 0.0f;
            this.f75943j = new Matrix();
            this.f75946m = null;
        }
    }
}
