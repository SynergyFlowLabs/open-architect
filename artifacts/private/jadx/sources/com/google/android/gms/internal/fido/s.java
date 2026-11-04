package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes4.dex */
final class s extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f108032c;

    s(u uVar, int i10) {
        super(uVar.size(), i10);
        this.f108032c = uVar;
    }

    @Override // com.google.android.gms.internal.fido.p
    protected final Object b(int i10) {
        return this.f108032c.get(i10);
    }
}
