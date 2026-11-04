package com.google.api;

/* JADX INFO: loaded from: classes4.dex */
public enum k1 implements com.google.protobuf.s1.c {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f116239i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f116240j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f116241k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f116242l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f116243m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f116244n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.protobuf.s1.d<k1> f116245o = new com.google.protobuf.s1.d<k1>() { // from class: com.google.api.k1.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k1 a(int i10) {
            return k1.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f116247a;

    private static final class b implements com.google.protobuf.s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.google.protobuf.s1.e f116248a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return k1.l(i10) != null;
        }
    }

    static {
        int i10 = 4 >> 2;
    }

    k1(int i10) {
        this.f116247a = i10;
    }

    public static k1 l(int i10) {
        if (i10 == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return EARLY_ACCESS;
        }
        if (i10 == 2) {
            return ALPHA;
        }
        if (i10 == 3) {
            return BETA;
        }
        if (i10 == 4) {
            return GA;
        }
        if (i10 != 5) {
            return null;
        }
        return DEPRECATED;
    }

    public static com.google.protobuf.s1.d<k1> n() {
        return f116245o;
    }

    public static com.google.protobuf.s1.e o() {
        return b.f116248a;
    }

    @Deprecated
    public static k1 p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f116247a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
