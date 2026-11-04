package com.google.vr.cardboard;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f126844b = "o";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f126845a;

    public o(Context context) {
        this.f126845a = context.getApplicationContext();
    }

    @Override // com.google.vr.cardboard.a0
    public final boolean a(com.google.vr.sdk.proto.nano.c.d dVar) {
        return false;
    }

    @Override // com.google.vr.cardboard.a0
    public final com.google.vr.sdk.proto.nano.a.d b() {
        com.google.vr.sdk.proto.nano.a.d dVar = new com.google.vr.sdk.proto.nano.a.d();
        dVar.f129895c = new com.google.vr.sdk.proto.nano.a.c[0];
        return dVar;
    }

    @Override // com.google.vr.cardboard.a0
    public final com.google.vr.sdk.proto.nano.b.a c() {
        com.google.vr.sdk.proto.nano.b.a aVarD = d.d();
        return aVarD == null ? r.a(this.f126845a) : aVarD;
    }

    @Override // com.google.vr.cardboard.a0
    public final void close() {
    }

    @Override // com.google.vr.cardboard.a0
    public final com.google.vr.sdk.proto.nano.a.c d() {
        return d.b();
    }

    @Override // com.google.vr.cardboard.a0
    public final com.google.common.logging.nano.a.C1088a.m e(com.google.vr.sdk.proto.nano.d.a aVar) {
        return null;
    }

    @Override // com.google.vr.cardboard.a0
    public final com.google.vr.sdk.proto.nano.c.d f() {
        return null;
    }

    @Override // com.google.vr.cardboard.a0
    public final boolean g(com.google.vr.sdk.proto.nano.a.c cVar) {
        return cVar == null ? d.g() : d.h(cVar);
    }
}
