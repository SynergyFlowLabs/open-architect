package uk;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public abstract class f<L, M, R> implements Comparable<f<L, M, R>>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f381280a = 1;

    public static <L, M, R> f<L, M, R> o(L l10, M m10, R r10) {
        return new b(l10, m10, r10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(f<L, M, R> fVar) {
        return new org.apache.commons.lang3.builder.b().g(k(), fVar.k()).g(l(), fVar.l()).g(n(), fVar.n()).D();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(k(), fVar.k()) && Objects.equals(l(), fVar.l()) && Objects.equals(n(), fVar.n())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((k() == null ? 0 : k().hashCode()) ^ (l() == null ? 0 : l().hashCode())) ^ (n() != null ? n().hashCode() : 0);
    }

    public abstract L k();

    public abstract M l();

    public abstract R n();

    public String p(String str) {
        return String.format(str, k(), l(), n());
    }

    public String toString() {
        return "(" + k() + "," + l() + "," + n() + ")";
    }
}
