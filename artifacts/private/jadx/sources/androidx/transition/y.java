package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public class y extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f75802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Path f75803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f75804c;

    public y() {
        Path path = new Path();
        this.f75803b = path;
        this.f75804c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f75802a = path;
    }

    private static float b(float f10, float f11) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    @Override // androidx.transition.w
    @NonNull
    public Path a(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float fB = b(f14, f15);
        double dAtan2 = Math.atan2(f15, f14);
        this.f75804c.setScale(fB, fB);
        this.f75804c.postRotate((float) Math.toDegrees(dAtan2));
        this.f75804c.postTranslate(f10, f11);
        Path path = new Path();
        this.f75803b.transform(this.f75804c, path);
        return path;
    }

    @NonNull
    public Path c() {
        return this.f75802a;
    }

    public void d(@NonNull Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        boolean z10 = false | false;
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f10 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f75804c.setTranslate(-f12, -f13);
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fB = 1.0f / b(f14, f15);
        this.f75804c.postScale(fB, fB);
        this.f75804c.postRotate((float) Math.toDegrees(-Math.atan2(f15, f14)));
        path.transform(this.f75804c, this.f75803b);
        this.f75802a = path;
    }

    public y(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this.f75803b = new Path();
        this.f75804c = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f75574k);
        try {
            String strM = androidx.core.content.res.n.m(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM != null) {
                d(androidx.core.graphics.o.e(strM));
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public y(@NonNull Path path) {
        this.f75803b = new Path();
        this.f75804c = new Matrix();
        d(path);
    }
}
