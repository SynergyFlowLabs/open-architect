package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@y
final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c2 f50290a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c2 f50291b = new d2();

    private e2() {
    }

    static c2 a() {
        return f50290a;
    }

    static c2 b() {
        return f50291b;
    }

    private static c2 c() {
        if (k3.f50408d) {
            return null;
        }
        try {
            return (c2) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
