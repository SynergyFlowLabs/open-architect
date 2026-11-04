package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.d
@o0
final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f119950a = 2147483647999999999L;

    private c2() {
    }

    static void a(@fj.a Object blocker, long nanos) {
        LockSupport.parkNanos(blocker, Math.min(nanos, f119950a));
    }
}
