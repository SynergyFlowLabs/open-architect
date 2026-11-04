package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes4.dex */
final class j extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f107974c;

    j(m mVar, int i10) {
        super(mVar.size(), i10);
        this.f107974c = mVar;
    }

    @Override // com.google.android.gms.internal.common.e
    protected final Object b(int i10) {
        return this.f107974c.get(i10);
    }
}
