package org.commonmark.internal;

import org.commonmark.node.u;
import org.commonmark.node.x;

/* JADX INFO: loaded from: classes14.dex */
public class q extends org.commonmark.parser.block.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f337680a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f337681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f337682c;

    public q(int i10) {
        this.f337681b = i10;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean b() {
        return true;
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.parser.block.c c(org.commonmark.parser.block.h hVar) {
        if (!hVar.b()) {
            return hVar.a() >= this.f337681b ? org.commonmark.parser.block.c.a(hVar.f() + this.f337681b) : org.commonmark.parser.block.c.d();
        }
        if (this.f337680a.e() == null) {
            return org.commonmark.parser.block.c.d();
        }
        org.commonmark.node.b bVarE = hVar.e().e();
        this.f337682c = (bVarE instanceof x) || (bVarE instanceof u);
        return org.commonmark.parser.block.c.b(hVar.d());
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.node.b e() {
        return this.f337680a;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean g(org.commonmark.node.b bVar) {
        if (this.f337682c) {
            org.commonmark.node.b bVarH = this.f337680a.h();
            if (bVarH instanceof org.commonmark.node.t) {
                ((org.commonmark.node.t) bVarH).r(false);
            }
        }
        return true;
    }
}
