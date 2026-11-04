package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p4 f129555a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p4 f129556b = new p4();

    static p4 a() {
        return f129555a;
    }

    static p4 b() {
        return f129556b;
    }

    private static p4 c() {
        try {
            return (p4) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
