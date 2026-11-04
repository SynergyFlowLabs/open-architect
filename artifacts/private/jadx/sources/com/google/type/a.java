package com.google.type;

import com.google.protobuf.s1;

/* JADX INFO: loaded from: classes5.dex */
public enum a implements s1.c {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f126710k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f126711l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f126712m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f126713n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f126714o = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f126715s = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f126716t = 6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f126717v = 7;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final s1.d<a> f126718w = new s1.d<a>() { // from class: com.google.type.a.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            return a.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f126719a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f126720a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return a.l(i10) != null;
        }
    }

    a(int i10) {
        this.f126719a = i10;
    }

    public static a l(int i10) {
        switch (i10) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
            default:
                return null;
        }
    }

    public static s1.d<a> n() {
        return f126718w;
    }

    public static s1.e o() {
        return b.f126720a;
    }

    @Deprecated
    public static a p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f126719a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
