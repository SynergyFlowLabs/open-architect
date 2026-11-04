package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class k2 implements Serializable, g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f107681a;

    k2(Object obj) {
        this.f107681a = obj;
    }

    @Override // com.google.android.gms.internal.auth.g2
    public final Object a() {
        return this.f107681a;
    }

    public final boolean equals(@fj.a Object obj) {
        if (!(obj instanceof k2)) {
            return false;
        }
        Object obj2 = this.f107681a;
        Object obj3 = ((k2) obj).f107681a;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f107681a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f107681a.toString() + ")";
    }
}
