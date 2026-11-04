package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f50657a = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Class<?> f50658b = e();

    u0() {
    }

    public static v0 a() {
        v0 v0VarC = c("newInstance");
        return v0VarC != null ? v0VarC : new v0();
    }

    public static v0 b() {
        v0 v0VarC = c("getEmptyRegistry");
        return v0VarC != null ? v0VarC : v0.f50701e;
    }

    private static final v0 c(String methodName) {
        Class<?> cls = f50658b;
        if (cls == null) {
            return null;
        }
        try {
            return (v0) cls.getDeclaredMethod(methodName, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean d(v0 registry) {
        Class<?> cls;
        return (k3.f50408d || (cls = f50658b) == null || !cls.isAssignableFrom(registry.getClass())) ? false : true;
    }

    static Class<?> e() {
        try {
            return Class.forName(f50657a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
