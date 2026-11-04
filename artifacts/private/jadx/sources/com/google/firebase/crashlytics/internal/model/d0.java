package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class d0 extends g0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f121554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f121556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f121557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f121558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f121559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f121560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f121561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f121562i;

    d0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f121554a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f121555b = str;
        this.f121556c = i11;
        this.f121557d = j10;
        this.f121558e = j11;
        this.f121559f = z10;
        this.f121560g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f121561h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f121562i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public int a() {
        return this.f121554a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public int b() {
        return this.f121556c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public long d() {
        return this.f121558e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public boolean e() {
        return this.f121559f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.b) {
            g0.b bVar = (g0.b) obj;
            if (this.f121554a == bVar.a() && this.f121555b.equals(bVar.g()) && this.f121556c == bVar.b() && this.f121557d == bVar.j() && this.f121558e == bVar.d() && this.f121559f == bVar.e() && this.f121560g == bVar.i() && this.f121561h.equals(bVar.f()) && this.f121562i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public String f() {
        return this.f121561h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public String g() {
        return this.f121555b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public String h() {
        return this.f121562i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f121554a ^ 1000003) * 1000003) ^ this.f121555b.hashCode()) * 1000003) ^ this.f121556c) * 1000003;
        long j10 = this.f121557d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f121558e;
        return this.f121562i.hashCode() ^ ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f121559f ? 1231 : 1237)) * 1000003) ^ this.f121560g) * 1000003) ^ this.f121561h.hashCode()) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public int i() {
        return this.f121560g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public long j() {
        return this.f121557d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f121554a + ", model=" + this.f121555b + ", availableProcessors=" + this.f121556c + ", totalRam=" + this.f121557d + ", diskSpace=" + this.f121558e + ", isEmulator=" + this.f121559f + ", state=" + this.f121560g + ", manufacturer=" + this.f121561h + ", modelClass=" + this.f121562i + "}";
    }
}
