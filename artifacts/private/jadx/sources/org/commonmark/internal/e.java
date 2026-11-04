package org.commonmark.internal;

import org.commonmark.node.a0;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f337578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f337579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f337580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f337581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f337582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f337583f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f337584g = false;

    private e(a0 a0Var, int i10, e eVar, f fVar, boolean z10) {
        this.f337578a = a0Var;
        this.f337579b = i10;
        this.f337580c = z10;
        this.f337581d = eVar;
        this.f337582e = fVar;
    }

    public static e a(a0 a0Var, int i10, e eVar, f fVar) {
        return new e(a0Var, i10, eVar, fVar, true);
    }

    public static e b(a0 a0Var, int i10, e eVar, f fVar) {
        return new e(a0Var, i10, eVar, fVar, false);
    }
}
