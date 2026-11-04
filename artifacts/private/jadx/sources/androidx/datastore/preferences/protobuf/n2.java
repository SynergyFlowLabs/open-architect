package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@y
final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2 f50493a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2 f50494b = new m2();

    private n2() {
    }

    static l2 a() {
        return f50493a;
    }

    static l2 b() {
        return f50494b;
    }

    private static l2 c() {
        if (k3.f50408d) {
            return null;
        }
        try {
            return (l2) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
