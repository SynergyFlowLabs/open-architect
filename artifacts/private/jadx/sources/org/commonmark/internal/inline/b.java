package org.commonmark.internal.inline;

import org.commonmark.node.a0;
import org.commonmark.node.j;
import org.commonmark.node.v;
import org.commonmark.node.z;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b implements cm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f337615a;

    protected b(char c10) {
        this.f337615a = c10;
    }

    @Override // cm.a
    public char a() {
        return this.f337615a;
    }

    @Override // cm.a
    public int b() {
        return 1;
    }

    @Override // cm.a
    public char c() {
        return this.f337615a;
    }

    @Override // cm.a
    public int d(cm.b bVar, cm.b bVar2) {
        if ((bVar.a() || bVar2.c()) && bVar2.b() % 3 != 0 && (bVar.b() + bVar2.b()) % 3 == 0) {
            return 0;
        }
        return (bVar.length() < 2 || bVar2.length() < 2) ? 1 : 2;
    }

    @Override // cm.a
    public void e(a0 a0Var, a0 a0Var2, int i10) {
        v zVar;
        String strValueOf = String.valueOf(c());
        if (i10 == 1) {
            zVar = new j(strValueOf);
        } else {
            zVar = new z(strValueOf + strValueOf);
        }
        v vVarG = a0Var.g();
        while (vVarG != null && vVarG != a0Var2) {
            v vVarG2 = vVarG.g();
            zVar.d(vVarG);
            vVarG = vVarG2;
        }
        a0Var.j(zVar);
    }
}
