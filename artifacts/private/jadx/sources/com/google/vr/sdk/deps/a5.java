package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z4 f127701a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z4 f127702b = new z4();

    static z4 a() {
        return f127701a;
    }

    static z4 b() {
        return f127702b;
    }

    private static z4 c() {
        try {
            return (z4) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
