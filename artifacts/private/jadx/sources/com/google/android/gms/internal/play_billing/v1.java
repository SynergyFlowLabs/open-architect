package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f109360a = new ArrayList();

    public final v1 a(l2 l2Var) {
        if (l2Var.d()) {
            throw new IllegalArgumentException(h0.a("range must not be empty, but was %s", l2Var));
        }
        this.f109360a.add(l2Var);
        return this;
    }

    final v1 b(v1 v1Var) {
        Iterator it = v1Var.f109360a.iterator();
        while (it.hasNext()) {
            a((l2) it.next());
        }
        return this;
    }

    public final w1 c() {
        n1 n1Var = new n1(this.f109360a.size());
        Collections.sort(this.f109360a, k2.f109158a);
        Iterator it = this.f109360a.iterator();
        b2 b2Var = it instanceof b2 ? (b2) it : new b2(it);
        while (b2Var.hasNext()) {
            l2 l2VarC = (l2) b2Var.next();
            while (b2Var.hasNext()) {
                l2 l2Var = (l2) b2Var.a();
                if (l2VarC.f109187a.compareTo(l2Var.f109188b) > 0 || l2Var.f109187a.compareTo(l2VarC.f109188b) > 0) {
                    break;
                }
                g0.d(l2VarC.b(l2Var).d(), "Overlapping ranges not permitted but found %s overlapping %s", l2VarC, l2Var);
                l2VarC = l2VarC.c((l2) b2Var.next());
            }
            n1Var.e(l2VarC);
        }
        r1 r1VarF = n1Var.f();
        if (r1VarF.isEmpty()) {
            return w1.b();
        }
        if (r1VarF.size() == 1) {
            b3 b3VarListIterator = r1VarF.listIterator(0);
            Object next = b3VarListIterator.next();
            if (b3VarListIterator.hasNext()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("expected one element but was: <");
                sb2.append(next);
                for (int i10 = 0; i10 < 4 && b3VarListIterator.hasNext(); i10++) {
                    sb2.append(", ");
                    sb2.append(b3VarListIterator.next());
                }
                if (b3VarListIterator.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append(kotlin.text.b0.f313281f);
                throw new IllegalArgumentException(sb2.toString());
            }
            if (((l2) next).equals(l2.a())) {
                return w1.a();
            }
        }
        return new w1(r1VarF);
    }
}
