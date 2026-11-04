package com.google.rpc;

import com.google.protobuf.s1;

/* JADX INFO: loaded from: classes5.dex */
public enum c implements s1.c {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);

    public static final int H1 = 5;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f126647g3 = 7;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f126649h3 = 16;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f126651i3 = 8;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f126653j3 = 9;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f126655k3 = 10;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final int f126657l3 = 11;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final int f126659m3 = 12;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final int f126661n3 = 13;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final int f126663o3 = 14;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f126664p0 = 3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f126665p1 = 4;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f126666p2 = 6;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f126667p3 = 15;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final s1.d<c> f126668q3 = new s1.d<c>() { // from class: com.google.rpc.c.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(int i10) {
            return c.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f126674a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f126675a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return c.l(i10) != null;
        }
    }

    c(int i10) {
        this.f126674a = i10;
    }

    public static c l(int i10) {
        switch (i10) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    public static s1.d<c> n() {
        return f126668q3;
    }

    public static s1.e o() {
        return b.f126675a;
    }

    @Deprecated
    public static c p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f126674a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
