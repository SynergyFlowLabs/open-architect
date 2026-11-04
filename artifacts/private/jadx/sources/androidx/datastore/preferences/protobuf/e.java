package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f50065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f50066b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f50067c;

    static {
        boolean z10;
        if (f50065a || a("org.robolectric.Robolectric") == null) {
            z10 = false;
        } else {
            z10 = true;
            int i10 = 5 << 1;
        }
        f50067c = z10;
    }

    private e() {
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f50066b;
    }

    static boolean c() {
        if (!f50065a && (f50066b == null || f50067c)) {
            return false;
        }
        return true;
    }
}
