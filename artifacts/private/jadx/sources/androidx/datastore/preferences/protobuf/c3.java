package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@y
final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a3 f50037a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a3 f50038b = new b3();

    private c3() {
    }

    static a3 a() {
        return f50037a;
    }

    static a3 b() {
        return f50038b;
    }

    private static a3 c() {
        if (k3.f50408d) {
            return null;
        }
        try {
            return (a3) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
