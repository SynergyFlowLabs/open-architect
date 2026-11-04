package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
abstract class k0 implements n2 {
    k0() {
    }

    public final boolean equals(@fj.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            return h().equals(((n2) obj).h());
        }
        return false;
    }

    public final int hashCode() {
        return h().hashCode();
    }

    public final String toString() {
        return h().toString();
    }
}
