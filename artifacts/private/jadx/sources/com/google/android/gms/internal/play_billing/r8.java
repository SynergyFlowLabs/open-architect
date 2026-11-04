package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class r8 implements e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h8 f109306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f109307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f109308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f109309d;

    r8(h8 h8Var, String str, Object[] objArr) {
        this.f109306a = h8Var;
        this.f109307b = str;
        this.f109308c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f109309d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f109309d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.e8
    public final h8 a() {
        return this.f109306a;
    }

    final String b() {
        return this.f109307b;
    }

    final Object[] c() {
        return this.f109308c;
    }

    @Override // com.google.android.gms.internal.play_billing.e8
    public final boolean g() {
        return (this.f109309d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.e8
    public final int h() {
        int i10 = this.f109309d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
