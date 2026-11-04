package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class c0 extends a0 {
    c0(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.a0
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.a0
    final boolean b() {
        return false;
    }
}
