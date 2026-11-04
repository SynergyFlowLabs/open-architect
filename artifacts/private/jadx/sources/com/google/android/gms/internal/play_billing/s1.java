package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f109320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f109321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f109322c;

    s1(Object obj, Object obj2, Object obj3) {
        this.f109320a = obj;
        this.f109321b = obj2;
        this.f109322c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f109322c;
        Object obj2 = this.f109321b;
        Object obj3 = this.f109320a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
