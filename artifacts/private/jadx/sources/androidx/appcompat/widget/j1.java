package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f11376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f11377c;

    @androidx.annotation.w0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @androidx.annotation.u
        static int b(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    private j1(Context context, TypedArray typedArray) {
        this.f11375a = context;
        this.f11376b = typedArray;
    }

    public static j1 E(Context context, int i10, int[] iArr) {
        return new j1(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static j1 F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new j1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static j1 G(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new j1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean A(int i10, TypedValue typedValue) {
        return this.f11376b.getValue(i10, typedValue);
    }

    public TypedArray B() {
        return this.f11376b;
    }

    public boolean C(int i10) {
        return this.f11376b.hasValue(i10);
    }

    public int D() {
        return this.f11376b.length();
    }

    public TypedValue H(int i10) {
        return this.f11376b.peekValue(i10);
    }

    public void I() {
        this.f11376b.recycle();
    }

    public boolean a(int i10, boolean z10) {
        return this.f11376b.getBoolean(i10, z10);
    }

    @androidx.annotation.w0(21)
    public int b() {
        return a.a(this.f11376b);
    }

    public int c(int i10, int i11) {
        return this.f11376b.getColor(i10, i11);
    }

    public ColorStateList d(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f11376b.hasValue(i10) || (resourceId = this.f11376b.getResourceId(i10, 0)) == 0 || (colorStateListA = j.a.a(this.f11375a, resourceId)) == null) ? this.f11376b.getColorStateList(i10) : colorStateListA;
    }

    public float e(int i10, float f10) {
        return this.f11376b.getDimension(i10, f10);
    }

    public int f(int i10, int i11) {
        return this.f11376b.getDimensionPixelOffset(i10, i11);
    }

    public int g(int i10, int i11) {
        return this.f11376b.getDimensionPixelSize(i10, i11);
    }

    public Drawable h(int i10) {
        int resourceId;
        return (!this.f11376b.hasValue(i10) || (resourceId = this.f11376b.getResourceId(i10, 0)) == 0) ? this.f11376b.getDrawable(i10) : j.a.b(this.f11375a, resourceId);
    }

    public Drawable i(int i10) {
        int resourceId;
        if (!this.f11376b.hasValue(i10) || (resourceId = this.f11376b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return n.b().d(this.f11375a, resourceId, true);
    }

    public float j(int i10, float f10) {
        return this.f11376b.getFloat(i10, f10);
    }

    @androidx.annotation.p0
    public Typeface k(@androidx.annotation.h1 int i10, int i11, @androidx.annotation.p0 androidx.core.content.res.i.f fVar) {
        int resourceId = this.f11376b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f11377c == null) {
            this.f11377c = new TypedValue();
        }
        return androidx.core.content.res.i.k(this.f11375a, resourceId, this.f11377c, i11, fVar);
    }

    public float l(int i10, int i11, int i12, float f10) {
        return this.f11376b.getFraction(i10, i11, i12, f10);
    }

    public int m(int i10) {
        return this.f11376b.getIndex(i10);
    }

    public int n() {
        return this.f11376b.getIndexCount();
    }

    public int o(int i10, int i11) {
        return this.f11376b.getInt(i10, i11);
    }

    public int p(int i10, int i11) {
        return this.f11376b.getInteger(i10, i11);
    }

    public int q(int i10, int i11) {
        return this.f11376b.getLayoutDimension(i10, i11);
    }

    public int r(int i10, String str) {
        return this.f11376b.getLayoutDimension(i10, str);
    }

    public String s(int i10) {
        return this.f11376b.getNonResourceString(i10);
    }

    public String t() {
        return this.f11376b.getPositionDescription();
    }

    public int u(int i10, int i11) {
        return this.f11376b.getResourceId(i10, i11);
    }

    public Resources v() {
        return this.f11376b.getResources();
    }

    public String w(int i10) {
        return this.f11376b.getString(i10);
    }

    public CharSequence x(int i10) {
        return this.f11376b.getText(i10);
    }

    public CharSequence[] y(int i10) {
        return this.f11376b.getTextArray(i10);
    }

    public int z(int i10) {
        return a.b(this.f11376b, i10);
    }
}
