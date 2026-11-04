package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
abstract class h1 implements Comparable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparable f109141a = "";

    h1(Comparable comparable) {
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(h1 h1Var) {
        if (h1Var == g1.f109125b) {
            return 1;
        }
        if (h1Var == e1.f109106b) {
            return -1;
        }
        Comparable comparable = h1Var.f109141a;
        int i10 = l2.f109186d;
        int iCompareTo = "".compareTo("");
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof f1, h1Var instanceof f1);
    }

    abstract void c(StringBuilder sb2);

    abstract void d(StringBuilder sb2);

    public final boolean equals(@fj.a Object obj) {
        if (obj instanceof h1) {
            try {
                if (compareTo((h1) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
