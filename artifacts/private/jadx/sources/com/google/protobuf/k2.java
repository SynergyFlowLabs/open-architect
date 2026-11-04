package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@y
final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i2 f126025a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i2 f126026b = new j2();

    k2() {
    }

    static i2 a() {
        return f126025a;
    }

    static i2 b() {
        return f126026b;
    }

    private static i2 c() {
        try {
            return (i2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
