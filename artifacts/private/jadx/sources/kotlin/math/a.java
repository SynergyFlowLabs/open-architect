package kotlin.math;

import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f312854a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f
    public static final double f312855b = Math.log(2.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f
    public static final double f312856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @f
    public static final double f312857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @f
    public static final double f312858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @f
    public static final double f312859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @f
    public static final double f312860g;

    static {
        double dUlp = Math.ulp(1.0d);
        f312856c = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        f312857d = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f312858e = dSqrt2;
        double d10 = 1;
        f312859f = d10 / dSqrt;
        f312860g = d10 / dSqrt2;
    }

    private a() {
    }
}
