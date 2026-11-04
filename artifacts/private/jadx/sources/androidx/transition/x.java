package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes3.dex */
class x<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Property<T, PointF> f75790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PathMeasure f75791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f75792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f75793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PointF f75794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f75795f;

    x(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f75793d = new float[2];
        this.f75794e = new PointF();
        this.f75790a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f75791b = pathMeasure;
        this.f75792c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t10) {
        return Float.valueOf(this.f75795f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t10, Float f10) {
        this.f75795f = f10.floatValue();
        this.f75791b.getPosTan(this.f75792c * f10.floatValue(), this.f75793d, null);
        PointF pointF = this.f75794e;
        float[] fArr = this.f75793d;
        int i10 = 2 | 0;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f75790a.set(t10, pointF);
    }
}
