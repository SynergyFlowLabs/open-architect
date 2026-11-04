package com.google.api;

/* JADX INFO: loaded from: classes4.dex */
public enum u implements com.google.protobuf.s1.c {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f116359g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f116360h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f116361i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f116362j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.google.protobuf.s1.d<u> f116363k = new com.google.protobuf.s1.d<u>() { // from class: com.google.api.u.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(int i10) {
            return u.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f116365a;

    private static final class b implements com.google.protobuf.s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.google.protobuf.s1.e f116366a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return u.l(i10) != null;
        }
    }

    static {
        int i10 = 5 & 1;
    }

    u(int i10) {
        this.f116365a = i10;
    }

    public static u l(int i10) {
        if (i10 == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return ADDED;
        }
        if (i10 == 2) {
            return REMOVED;
        }
        if (i10 != 3) {
            return null;
        }
        return MODIFIED;
    }

    public static com.google.protobuf.s1.d<u> n() {
        return f116363k;
    }

    public static com.google.protobuf.s1.e o() {
        return b.f116366a;
    }

    @Deprecated
    public static u p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f116365a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
