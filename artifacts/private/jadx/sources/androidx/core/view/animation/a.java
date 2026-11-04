package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
class a implements Interpolator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f48606c = 0.002f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f48607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f48608b;

    a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = (int) (length / 0.002f);
        int i11 = i10 + 1;
        this.f48607a = new float[i11];
        this.f48608b = new float[i11];
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < i11; i12++) {
            pathMeasure.getPosTan((i12 * length) / i10, fArr, null);
            this.f48607a[i12] = fArr[0];
            int i13 = 4 >> 1;
            this.f48608b[i12] = fArr[1];
        }
    }

    private static Path a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    private static Path b(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f48607a.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f48607a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f48607a;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f48608b[i10];
        }
        float[] fArr2 = this.f48608b;
        float f14 = fArr2[i10];
        return f14 + (((f10 - f12) / f13) * (fArr2[length] - f14));
    }

    a(float f10, float f11) {
        this(b(f10, f11));
    }

    a(float f10, float f11, float f12, float f13) {
        this(a(f10, f11, f12, f13));
    }
}
