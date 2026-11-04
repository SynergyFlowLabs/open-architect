package androidx.compose.foundation;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f21887a = 0.35f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f21888b = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f21889c = 9.80665f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f21890d = 39.37f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double f21891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double f21892f;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f21891e = dLog;
        f21892f = dLog - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(androidx.compose.ui.unit.d dVar, float f10) {
        double density = dVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f10) * f21887a;
        float f11 = f21888b;
        return (float) (((double) f11) * density * Math.exp((f21891e / f21892f) * Math.log(dAbs / (((double) f11) * density))));
    }
}
