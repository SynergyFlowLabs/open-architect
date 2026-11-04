package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public enum x {
    OPEN(false),
    CLOSED(true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f118265a;

    x(boolean inclusive) {
        this.f118265a = inclusive;
    }

    static x l(boolean inclusive) {
        return inclusive ? CLOSED : OPEN;
    }
}
