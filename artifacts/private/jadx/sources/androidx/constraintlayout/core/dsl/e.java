package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f43157i;

    e(String str) {
        super(str, new h.a(""));
        this.f43155g = Integer.MIN_VALUE;
        this.f43156h = Integer.MIN_VALUE;
        this.f43157i = Float.NaN;
    }

    public int g() {
        return this.f43156h;
    }

    public float h() {
        return this.f43157i;
    }

    public int i() {
        return this.f43155g;
    }

    public void j(int i10) {
        this.f43156h = i10;
        this.f43168d.put("end", String.valueOf(i10));
    }

    public void k(float f10) {
        this.f43157i = f10;
        this.f43168d.put(io.sentry.profilemeasurements.a.f306071n, String.valueOf(f10));
    }

    public void l(int i10) {
        this.f43155g = i10;
        this.f43168d.put("start", String.valueOf(i10));
    }
}
