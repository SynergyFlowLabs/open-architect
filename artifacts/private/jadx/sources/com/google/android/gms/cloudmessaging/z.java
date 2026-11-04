package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class z extends a0 {
    z(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.a0
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new b0(4, "Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.a0
    final boolean b() {
        return true;
    }
}
