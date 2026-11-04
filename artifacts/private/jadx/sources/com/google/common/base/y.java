package com.google.common.base;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@k
final class y {
    private y() {
    }

    static void a(Buffer b10) {
        b10.clear();
    }

    static void b(Buffer b10) {
        b10.flip();
    }

    static void c(Buffer b10, int limit) {
        b10.limit(limit);
    }

    static void d(Buffer b10, int position) {
        b10.position(position);
    }
}
