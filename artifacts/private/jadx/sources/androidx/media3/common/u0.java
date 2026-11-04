package androidx.media3.common;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f61446a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pair<Float, Float> f61447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pair<Float, Float> f61448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pair<Float, Float> f61449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f61450e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f61451f = 1.0f;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        f61447b = Pair.create(fValueOf, fValueOf);
        f61448c = Pair.create(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        f61449d = Pair.create(fValueOf2, fValueOf2);
    }

    default Pair<Float, Float> Z0() {
        return f61449d;
    }

    default float a1() {
        return 1.0f;
    }

    default Pair<Float, Float> b1() {
        return f61448c;
    }

    default float c1() {
        return 1.0f;
    }

    default Pair<Float, Float> d1() {
        return f61447b;
    }

    default float e1() {
        return 0.0f;
    }
}
