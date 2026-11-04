package com.google.type;

import com.google.protobuf.s1;

/* JADX INFO: loaded from: classes5.dex */
public enum l implements s1.c {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f126741k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f126742l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f126743m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f126744n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f126745o = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f126746s = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f126747t = 6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f126748v = 7;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final s1.d<l> f126749w = new s1.d<l>() { // from class: com.google.type.l.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(int i10) {
            return l.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f126750a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f126751a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            if (l.l(i10) == null) {
                return false;
            }
            int i11 = 2 | 1;
            return true;
        }
    }

    l(int i10) {
        this.f126750a = i10;
    }

    public static l l(int i10) {
        switch (i10) {
            case 0:
                return DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    public static s1.d<l> n() {
        return f126749w;
    }

    public static s1.e o() {
        return b.f126751a;
    }

    @Deprecated
    public static l p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f126750a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
