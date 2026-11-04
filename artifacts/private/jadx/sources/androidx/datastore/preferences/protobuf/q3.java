package androidx.datastore.preferences.protobuf;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f50531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f50532b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f50533c = 28;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f50534d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f50535e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f50536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50537g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50538h = 28;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f50539i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f50540j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f50541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Logger f50542l;

    public static final class a extends RuntimeException {
        public a(String message) {
            super(message);
        }
    }

    public enum b {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        b bVar = b.PUBLIC;
        f50531a = bVar;
        f50536f = bVar;
        f50541k = d(4, 28, 2, "");
        f50542l = Logger.getLogger(q3.class.getName());
    }

    private q3() {
    }

    private static boolean a() {
        String str = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals(com.facebook.internal.z0.P);
    }

    public static void b(b domain, int major, int minor, int patch, String suffix, String location) {
        if (a()) {
            return;
        }
        c(domain, major, minor, patch, suffix, location);
    }

    private static void c(b domain, int major, int minor, int patch, String suffix, String location) {
        if (!a()) {
            String strD = d(major, minor, patch, suffix);
            if (major < 0 || minor < 0 || patch < 0) {
                throw new a("Invalid gencode version: " + strD);
            }
            b bVar = f50536f;
            if (domain != bVar) {
                throw new a(String.format("Detected mismatched Protobuf Gencode/Runtime domains when loading %s: gencode %s, runtime %s. Cross-domain usage of Protobuf is not supported.", location, domain, bVar));
            }
            if (major != 4) {
                if (major != 3) {
                    throw new a(String.format("Detected mismatched Protobuf Gencode/Runtime major versions when loading %s: gencode %s, runtime %s. Same major version is required.", location, strD, f50541k));
                }
                f50542l.warning(String.format(" Protobuf gencode version %s is exactly one major version older than the runtime version %s at %s. Please update the gencode to avoid compatibility violations in the next runtime release.", strD, f50541k, location));
            }
            if (28 < minor || (minor == 28 && 2 < patch)) {
                throw new a(String.format("Detected incompatible Protobuf Gencode/Runtime versions when loading %s: gencode %s, runtime %s. Runtime version cannot be older than the linked gencode version.", location, strD, f50541k));
            }
            if (28 > minor || 2 > patch) {
                f50542l.warning(String.format(" Protobuf gencode version %s is older than the runtime version %s at %s. Please avoid checked-in Protobuf gencode that can be obsolete.", strD, f50541k, location));
            }
            if (!suffix.equals("")) {
                throw new a(String.format("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading %s: gencode %s, runtime %s. Version suffixes must be the same.", location, strD, f50541k));
            }
        }
    }

    private static String d(int major, int minor, int patch, String suffix) {
        return String.format("%d.%d.%d%s", Integer.valueOf(major), Integer.valueOf(minor), Integer.valueOf(patch), suffix);
    }
}
