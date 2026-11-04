package com.airbnb.lottie.model;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.core.util.p;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    T f88544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    T f88545b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public void b(T t10, T t11) {
        this.f88544a = t10;
        this.f88545b = t11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return a(pVar.f48411a, this.f88544a) && a(pVar.f48412b, this.f88545b);
    }

    public int hashCode() {
        T t10 = this.f88544a;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f88545b;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f88544a + " " + this.f88545b + "}";
    }
}
