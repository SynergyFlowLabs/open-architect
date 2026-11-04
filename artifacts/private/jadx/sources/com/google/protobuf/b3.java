package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public enum b3 implements s1.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f125798d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final s1.d<b3> f125799e = new s1.d<b3>() { // from class: com.google.protobuf.b3.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b3 a(int number) {
            return b3.b(number);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125801a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f125802a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int number) {
            return b3.b(number) != null;
        }
    }

    b3(int value) {
        this.f125801a = value;
    }

    public static b3 b(int value) {
        if (value != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static s1.d<b3> k() {
        return f125799e;
    }

    public static s1.e l() {
        return b.f125802a;
    }

    @Deprecated
    public static b3 n(int value) {
        return b(value);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f125801a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
