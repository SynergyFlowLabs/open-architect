package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes4.dex */
final class u3 extends s3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w3 f108198c;

    u3(w3 w3Var, int i10) {
        super(w3Var.size(), i10);
        this.f108198c = w3Var;
    }

    @Override // com.google.android.gms.internal.location.s3
    protected final Object b(int i10) {
        return this.f108198c.get(i10);
    }
}
