package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public enum d3 implements s1.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f50049d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final s1.d<d3> f50050e = new s1.d<d3>() { // from class: androidx.datastore.preferences.protobuf.d3.a
        @Override // androidx.datastore.preferences.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d3 a(int number) {
            return d3.b(number);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50052a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f50053a = new b();

        private b() {
        }

        @Override // androidx.datastore.preferences.protobuf.s1.e
        public boolean a(int number) {
            return d3.b(number) != null;
        }
    }

    d3(int value) {
        this.f50052a = value;
    }

    public static d3 b(int value) {
        if (value != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static s1.d<d3> k() {
        return f50050e;
    }

    public static s1.e l() {
        return b.f50053a;
    }

    @Deprecated
    public static d3 n(int value) {
        return b(value);
    }

    @Override // androidx.datastore.preferences.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f50052a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
