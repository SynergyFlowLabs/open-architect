package com.google.api;

/* JADX INFO: loaded from: classes4.dex */
public enum v0 implements com.google.protobuf.s1.c {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f116380i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f116381j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f116382k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f116383l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f116384m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f116385n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.protobuf.s1.d<v0> f116386o = new com.google.protobuf.s1.d<v0>() { // from class: com.google.api.v0.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v0 a(int i10) {
            return v0.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f116388a;

    private static final class b implements com.google.protobuf.s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.google.protobuf.s1.e f116389a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return v0.l(i10) != null;
        }
    }

    v0(int i10) {
        this.f116388a = i10;
    }

    public static v0 l(int i10) {
        if (i10 == 0) {
            return FIELD_BEHAVIOR_UNSPECIFIED;
        }
        if (i10 == 1) {
            return OPTIONAL;
        }
        if (i10 == 2) {
            return REQUIRED;
        }
        if (i10 == 3) {
            return OUTPUT_ONLY;
        }
        if (i10 == 4) {
            return INPUT_ONLY;
        }
        if (i10 != 5) {
            return null;
        }
        return IMMUTABLE;
    }

    public static com.google.protobuf.s1.d<v0> n() {
        return f116386o;
    }

    public static com.google.protobuf.s1.e o() {
        return b.f116389a;
    }

    @Deprecated
    public static v0 p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f116388a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
