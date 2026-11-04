package com.android.volley;

/* JADX INFO: loaded from: classes3.dex */
public class i implements x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f89450e = 2500;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f89451f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f89452g = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f89453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f89454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f89455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f89456d;

    public i() {
        this(2500, 1, 1.0f);
    }

    @Override // com.android.volley.x
    public int a() {
        return this.f89454b;
    }

    @Override // com.android.volley.x
    public void b(a0 a0Var) throws a0 {
        this.f89454b++;
        int i10 = this.f89453a;
        this.f89453a = i10 + ((int) (i10 * this.f89456d));
        if (!e()) {
            throw a0Var;
        }
    }

    @Override // com.android.volley.x
    public int c() {
        return this.f89453a;
    }

    public float d() {
        return this.f89456d;
    }

    protected boolean e() {
        return this.f89454b <= this.f89455c;
    }

    public i(int i10, int i11, float f10) {
        this.f89453a = i10;
        this.f89455c = i11;
        this.f89456d = f10;
    }
}
