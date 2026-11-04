package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@y
final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w0<?> f50770a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w0<?> f50771b = c();

    private y0() {
    }

    static w0<?> a() {
        w0<?> w0Var = f50771b;
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static w0<?> b() {
        return f50770a;
    }

    private static w0<?> c() {
        if (k3.f50408d) {
            return null;
        }
        try {
            return (w0) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
