package com.google.logging.type;

import com.google.protobuf.s1;

/* JADX INFO: loaded from: classes5.dex */
public enum d implements s1.c {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(700),
    EMERGENCY(800),
    UNRECOGNIZED(-1);

    public static final int X = 800;
    private static final s1.d<d> Y = new s1.d<d>() { // from class: com.google.logging.type.d.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(int i10) {
            return d.l(i10);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f125687l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f125688m = 100;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f125689n = 200;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f125690o = 300;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f125691s = 400;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f125692t = 500;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f125693v = 600;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f125694w = 700;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125695a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f125696a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return d.l(i10) != null;
        }
    }

    d(int i10) {
        this.f125695a = i10;
    }

    public static d l(int i10) {
        if (i10 == 0) {
            return DEFAULT;
        }
        if (i10 == 100) {
            return DEBUG;
        }
        if (i10 == 200) {
            return INFO;
        }
        if (i10 == 300) {
            return NOTICE;
        }
        if (i10 == 400) {
            return WARNING;
        }
        if (i10 == 500) {
            return ERROR;
        }
        if (i10 == 600) {
            return CRITICAL;
        }
        if (i10 == 700) {
            return ALERT;
        }
        if (i10 != 800) {
            return null;
        }
        return EMERGENCY;
    }

    public static s1.d<d> n() {
        return Y;
    }

    public static s1.e o() {
        return b.f125696a;
    }

    @Deprecated
    public static d p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f125695a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
