package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@y
final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x2 f126635a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x2 f126636b = new y2();

    z2() {
    }

    static x2 a() {
        return f126635a;
    }

    static x2 b() {
        return f126636b;
    }

    private static x2 c() {
        try {
            return (x2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
