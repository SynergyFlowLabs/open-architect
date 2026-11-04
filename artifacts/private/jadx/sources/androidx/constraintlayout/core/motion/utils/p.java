package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public class p implements r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final double f43872l = Double.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f43875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f43876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f43877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f43878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f43879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f43880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f43881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f43882j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f43873a = 0.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43874b = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f43883k = 0;

    private void e(double d10) {
        if (d10 <= 0.0d) {
            return;
        }
        double d11 = this.f43875c;
        double d12 = this.f43873a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.f43881i)) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / ((double) iSqrt);
        int i10 = 0;
        while (i10 < iSqrt) {
            float f10 = this.f43879g;
            double d14 = this.f43876d;
            float f11 = this.f43880h;
            double d15 = d11;
            double d16 = ((-d11) * (((double) f10) - d14)) - (((double) f11) * d12);
            float f12 = this.f43881i;
            double d17 = d12;
            double d18 = ((double) f11) + (((d16 / ((double) f12)) * d13) / 2.0d);
            double d19 = ((((-((((double) f10) + ((d13 * d18) / 2.0d)) - d14)) * d15) - (d18 * d17)) / ((double) f12)) * d13;
            double d20 = ((double) f11) + (d19 / 2.0d);
            float f13 = f11 + ((float) d19);
            this.f43880h = f13;
            float f14 = f10 + ((float) (d20 * d13));
            this.f43879g = f14;
            int i11 = this.f43883k;
            if (i11 > 0) {
                if (f14 < 0.0f && (i11 & 1) == 1) {
                    this.f43879g = -f14;
                    this.f43880h = -f13;
                }
                float f15 = this.f43879g;
                if (f15 > 1.0f && (i11 & 2) == 2) {
                    this.f43879g = 2.0f - f15;
                    this.f43880h = -this.f43880h;
                }
            }
            i10++;
            d11 = d15;
            d12 = d17;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float a() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float b(float f10) {
        return this.f43880h;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public String c(String str, float f10) {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public boolean d() {
        double d10 = ((double) this.f43879g) - this.f43876d;
        double d11 = this.f43875c;
        double d12 = this.f43880h;
        return Math.sqrt((((d12 * d12) * ((double) this.f43881i)) + ((d11 * d10) * d10)) / d11) <= ((double) this.f43882j);
    }

    public float f() {
        double d10 = this.f43875c;
        return ((float) (((-d10) * (((double) this.f43879g) - this.f43876d)) - (this.f43873a * ((double) this.f43880h)))) / this.f43881i;
    }

    void g(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float getInterpolation(float f10) {
        e(f10 - this.f43878f);
        this.f43878f = f10;
        if (d()) {
            this.f43879g = (float) this.f43876d;
        }
        return this.f43879g;
    }

    public void h(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        this.f43876d = f11;
        this.f43873a = f15;
        this.f43874b = false;
        this.f43879g = f10;
        this.f43877e = f12;
        this.f43875c = f14;
        this.f43881i = f13;
        this.f43882j = f16;
        this.f43883k = i10;
        this.f43878f = 0.0f;
    }
}
