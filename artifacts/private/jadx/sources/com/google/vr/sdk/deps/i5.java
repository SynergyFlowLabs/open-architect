package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class i5 implements r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t4 f129447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f129448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f129449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f129450d;

    i5(t4 t4Var, String str, Object[] objArr) {
        this.f129447a = t4Var;
        this.f129448b = str;
        this.f129449c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f129450d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f129450d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    final String a() {
        return this.f129448b;
    }

    @Override // com.google.vr.sdk.deps.r4
    public final boolean b() {
        return (this.f129450d & 2) == 2;
    }

    @Override // com.google.vr.sdk.deps.r4
    public final t4 c() {
        return this.f129447a;
    }

    final Object[] d() {
        return this.f129449c;
    }

    @Override // com.google.vr.sdk.deps.r4
    public final int y() {
        return (this.f129450d & 1) == 1 ? e5.f129354a : e5.f129355b;
    }
}
