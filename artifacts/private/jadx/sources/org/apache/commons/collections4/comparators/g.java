package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.collections4.k;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class g<I, O> implements Comparator<I>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335643c = 3456940356043606220L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<O> f335644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0<? super I, ? extends O> f335645b;

    public g(w0<? super I, ? extends O> w0Var) {
        this(w0Var, k.f335897a);
    }

    @Override // java.util.Comparator
    public int compare(I i10, I i11) {
        return this.f335644a.compare(this.f335645b.a(i10), this.f335645b.a(i11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            g gVar = (g) obj;
            Comparator<O> comparator = this.f335644a;
            if (comparator != null ? comparator.equals(gVar.f335644a) : gVar.f335644a == null) {
                w0<? super I, ? extends O> w0Var = this.f335645b;
                if (w0Var != null ? w0Var.equals(gVar.f335645b) : gVar.f335645b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Comparator<O> comparator = this.f335644a;
        int iHashCode = (629 + (comparator == null ? 0 : comparator.hashCode())) * 37;
        w0<? super I, ? extends O> w0Var = this.f335645b;
        return iHashCode + (w0Var != null ? w0Var.hashCode() : 0);
    }

    public g(w0<? super I, ? extends O> w0Var, Comparator<O> comparator) {
        this.f335644a = comparator;
        this.f335645b = w0Var;
    }
}
