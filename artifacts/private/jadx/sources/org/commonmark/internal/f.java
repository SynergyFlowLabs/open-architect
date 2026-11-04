package org.commonmark.internal;

import org.commonmark.node.a0;

/* JADX INFO: loaded from: classes14.dex */
public class f implements cm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f337585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f337586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f337587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f337588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f337589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f337590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f337591g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f337592h = 1;

    public f(a0 a0Var, char c10, boolean z10, boolean z11, f fVar) {
        this.f337585a = a0Var;
        this.f337586b = c10;
        this.f337587c = z10;
        this.f337588d = z11;
        this.f337589e = fVar;
    }

    @Override // cm.b
    public boolean a() {
        return this.f337588d;
    }

    @Override // cm.b
    public int b() {
        return this.f337592h;
    }

    @Override // cm.b
    public boolean c() {
        return this.f337587c;
    }

    @Override // cm.b
    public int length() {
        return this.f337591g;
    }
}
