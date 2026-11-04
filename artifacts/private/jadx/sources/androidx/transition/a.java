package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public class a extends w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f75484g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f75485h = 70.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f75486i = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f75487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f75488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f75489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f75490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f75491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f75492f;

    public a() {
        this.f75487a = 0.0f;
        this.f75488b = 0.0f;
        this.f75489c = f75485h;
        this.f75490d = 0.0f;
        this.f75491e = 0.0f;
        this.f75492f = f75486i;
    }

    private static float h(float f10) {
        if (f10 < 0.0f || f10 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f10 / 2.0f));
    }

    @Override // androidx.transition.w
    @NonNull
    public Path a(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        Path path = new Path();
        path.moveTo(f10, f11);
        float f17 = f12 - f10;
        float f18 = f13 - f11;
        float f19 = (f17 * f17) + (f18 * f18);
        float f20 = (f10 + f12) / 2.0f;
        float f21 = (f11 + f13) / 2.0f;
        float f22 = 0.25f * f19;
        boolean z10 = f11 > f13;
        if (Math.abs(f17) < Math.abs(f18)) {
            float fAbs = Math.abs(f19 / (f18 * 2.0f));
            if (z10) {
                f15 = fAbs + f13;
                f14 = f12;
            } else {
                f15 = fAbs + f11;
                f14 = f10;
            }
            f16 = this.f75491e;
        } else {
            float f23 = f19 / (f17 * 2.0f);
            if (z10) {
                f15 = f11;
                f14 = f23 + f10;
            } else {
                f14 = f12 - f23;
                f15 = f13;
            }
            f16 = this.f75490d;
        }
        float f24 = f22 * f16 * f16;
        float f25 = f20 - f14;
        float f26 = f21 - f15;
        float f27 = (f25 * f25) + (f26 * f26);
        float f28 = this.f75492f;
        float f29 = f22 * f28 * f28;
        if (f27 >= f24) {
            f24 = f27 > f29 ? f29 : 0.0f;
        }
        if (f24 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f24 / f27);
            f14 = ((f14 - f20) * fSqrt) + f20;
            f15 = f21 + (fSqrt * (f15 - f21));
        }
        path.cubicTo((f10 + f14) / 2.0f, (f11 + f15) / 2.0f, (f14 + f12) / 2.0f, (f15 + f13) / 2.0f, f12, f13);
        return path;
    }

    public float b() {
        return this.f75489c;
    }

    public float c() {
        return this.f75487a;
    }

    public float d() {
        return this.f75488b;
    }

    public void e(float f10) {
        this.f75489c = f10;
        this.f75492f = h(f10);
    }

    public void f(float f10) {
        this.f75487a = f10;
        this.f75490d = h(f10);
    }

    public void g(float f10) {
        this.f75488b = f10;
        this.f75491e = h(f10);
    }

    public a(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75487a = 0.0f;
        this.f75488b = 0.0f;
        this.f75489c = f75485h;
        this.f75490d = 0.0f;
        this.f75491e = 0.0f;
        this.f75492f = f75486i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f75573j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        g(androidx.core.content.res.n.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        f(androidx.core.content.res.n.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        e(androidx.core.content.res.n.j(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, f75485h));
        typedArrayObtainStyledAttributes.recycle();
    }
}
