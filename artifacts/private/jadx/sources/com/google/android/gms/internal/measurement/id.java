package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class id implements vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yc f108568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f108569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f108570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f108571d;

    id(yc ycVar, String str, Object[] objArr) {
        this.f108568a = ycVar;
        this.f108569b = str;
        this.f108570c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f108571d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f108571d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.vc
    public final boolean a() {
        return (this.f108571d & 2) == 2;
    }

    final String b() {
        return this.f108569b;
    }

    final Object[] c() {
        return this.f108570c;
    }

    @Override // com.google.android.gms.internal.measurement.vc
    public final yc g() {
        return this.f108568a;
    }

    @Override // com.google.android.gms.internal.measurement.vc
    public final int h() {
        int i10 = this.f108571d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
