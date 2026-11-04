package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class g2 extends i2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final g2 f109126a = new g2();

    private g2() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
