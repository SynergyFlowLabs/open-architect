package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class h5 implements t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w4 f107650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107651b = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f107652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f107653d;

    h5(w4 w4Var, String str, Object[] objArr) {
        this.f107650a = w4Var;
        this.f107652c = objArr;
        char cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (cCharAt < 55296) {
            this.f107653d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i11);
            if (cCharAt2 < 55296) {
                this.f107653d = (cCharAt2 << i12) | i10;
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.t4
    public final w4 a() {
        return this.f107650a;
    }

    final String b() {
        return this.f107651b;
    }

    final Object[] c() {
        return this.f107652c;
    }

    @Override // com.google.android.gms.internal.auth.t4
    public final boolean g() {
        return (this.f107653d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.t4
    public final int h() {
        return (this.f107653d & 1) != 0 ? 1 : 2;
    }
}
