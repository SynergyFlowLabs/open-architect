package androidx.core.util;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class p<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f48411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f48412b;

    public p(F f10, S s10) {
        this.f48411a = f10;
        this.f48412b = s10;
    }

    @NonNull
    public static <A, B> p<A, B> a(A a10, B b10) {
        return new p<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return o.a(pVar.f48411a, this.f48411a) && o.a(pVar.f48412b, this.f48412b);
    }

    public int hashCode() {
        F f10 = this.f48411a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f48412b;
        return iHashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.f48411a + " " + this.f48412b + "}";
    }
}
