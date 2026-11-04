package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public enum e4 implements s1.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50299f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50300g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50301h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final s1.d<e4> f50302i = new s1.d<e4>() { // from class: androidx.datastore.preferences.protobuf.e4.a
        @Override // androidx.datastore.preferences.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e4 a(int number) {
            return e4.b(number);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50304a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f50305a = new b();

        private b() {
        }

        @Override // androidx.datastore.preferences.protobuf.s1.e
        public boolean a(int number) {
            return e4.b(number) != null;
        }
    }

    e4(int value) {
        this.f50304a = value;
    }

    public static e4 b(int value) {
        if (value == 0) {
            return SYNTAX_PROTO2;
        }
        if (value == 1) {
            return SYNTAX_PROTO3;
        }
        if (value != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static s1.d<e4> k() {
        return f50302i;
    }

    public static s1.e l() {
        return b.f50305a;
    }

    @Deprecated
    public static e4 n(int value) {
        return b(value);
    }

    @Override // androidx.datastore.preferences.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f50304a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
