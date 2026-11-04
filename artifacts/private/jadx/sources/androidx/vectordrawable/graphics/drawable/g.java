package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.b1;
import androidx.core.content.res.n;
import androidx.core.graphics.o;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class g implements Interpolator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f75896c = 0.002f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f75897d = 3000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f75898e = 1.0E-5d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f75899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f75900b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f75899a = new float[iMin];
        this.f75900b = new float[iMin];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < iMin; i11++) {
            pathMeasure.getPosTan((i11 * length) / (iMin - 1), fArr, null);
            this.f75899a[i11] = fArr[0];
            this.f75900b[i11] = fArr[1];
        }
        if (Math.abs(this.f75899a[0]) <= 1.0E-5d && Math.abs(this.f75900b[0]) <= 1.0E-5d) {
            int i12 = iMin - 1;
            if (Math.abs(this.f75899a[i12] - 1.0f) <= 1.0E-5d && Math.abs(this.f75900b[i12] - 1.0f) <= 1.0E-5d) {
                float f10 = 0.0f;
                int i13 = 0;
                while (i10 < iMin) {
                    float[] fArr2 = this.f75899a;
                    int i14 = i13 + 1;
                    float f11 = fArr2[i13];
                    if (f11 < f10) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f11);
                    }
                    fArr2[i10] = f11;
                    i10++;
                    f10 = f11;
                    i13 = i14;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb2.append(this.f75899a[0]);
        sb2.append(",");
        sb2.append(this.f75900b[0]);
        sb2.append(" end:");
        int i15 = iMin - 1;
        sb2.append(this.f75899a[i15]);
        sb2.append(",");
        sb2.append(this.f75900b[i15]);
        throw new IllegalArgumentException(sb2.toString());
    }

    private void c(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (n.r(xmlPullParser, "pathData")) {
            String strM = n.m(typedArray, xmlPullParser, "pathData", 4);
            Path pathE = o.e(strM);
            if (pathE != null) {
                b(pathE);
                return;
            }
            throw new InflateException("The path is null, which is created from " + strM);
        }
        if (!n.r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!n.r(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float fJ = n.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float fJ2 = n.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zR = n.r(xmlPullParser, "controlX2");
        if (zR != n.r(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zR) {
            a(fJ, fJ2, n.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), n.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            c(fJ, fJ2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f75899a.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f75899a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f75899a;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f75900b[i10];
        }
        float[] fArr2 = this.f75900b;
        float f14 = fArr2[i10];
        return f14 + (((f10 - f12) / f13) * (fArr2[length] - f14));
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, a.f75847r0);
        d(typedArrayS, xmlPullParser);
        typedArrayS.recycle();
    }
}
