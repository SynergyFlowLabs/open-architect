package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class dc extends ac {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ ec f109105i;

    dc(ec ecVar) {
        this.f109105i = ecVar;
    }

    @Override // com.google.android.gms.internal.play_billing.ac
    protected final String a() {
        bc bcVar = (bc) this.f109105i.f109112a.get();
        if (bcVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(bcVar.f109065a) + "]";
    }
}
