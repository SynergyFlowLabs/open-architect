package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class oc implements wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wc[] f108716a;

    oc(wc... wcVarArr) {
        this.f108716a = wcVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.wc
    public final boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f108716a[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.wc
    public final vc b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            wc wcVar = this.f108716a[i10];
            if (wcVar.a(cls)) {
                return wcVar.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
