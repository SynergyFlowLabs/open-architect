package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class z0 extends d1 {
    z0() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.d1
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.d1
    public final d1 b(Comparable comparable, Comparable comparable2) {
        int iCompareTo = comparable.compareTo(comparable2);
        if (iCompareTo < 0) {
            return d1.f109078b;
        }
        return iCompareTo > 0 ? d1.f109079c : d1.f109077a;
    }
}
