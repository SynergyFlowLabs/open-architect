package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public enum b4 implements s1.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f125807f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f125808g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f125809h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final s1.d<b4> f125810i = new s1.d<b4>() { // from class: com.google.protobuf.b4.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b4 a(int number) {
            return b4.b(number);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125812a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f125813a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int number) {
            return b4.b(number) != null;
        }
    }

    b4(int value) {
        this.f125812a = value;
    }

    public static b4 b(int value) {
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

    public static s1.d<b4> k() {
        return f125810i;
    }

    public static s1.e l() {
        return b.f125813a;
    }

    @Deprecated
    public static b4 n(int value) {
        return b(value);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f125812a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
