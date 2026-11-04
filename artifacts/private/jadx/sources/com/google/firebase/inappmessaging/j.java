package com.google.firebase.inappmessaging;

import com.google.protobuf.s1;

/* JADX INFO: loaded from: classes5.dex */
public enum j implements s1.c {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f123017f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f123018g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f123019h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f123020i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final s1.d<j> f123021j = new s1.d<j>() { // from class: com.google.firebase.inappmessaging.j.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(int i10) {
            return j.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f123023a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f123024a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return j.l(i10) != null;
        }
    }

    j(int i10) {
        this.f123023a = i10;
    }

    public static j l(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED_FETCH_ERROR;
        }
        if (i10 == 1) {
            return SERVER_ERROR;
        }
        if (i10 == 2) {
            return CLIENT_ERROR;
        }
        if (i10 != 3) {
            return null;
        }
        return NETWORK_ERROR;
    }

    public static s1.d<j> n() {
        return f123021j;
    }

    public static s1.e o() {
        return b.f123024a;
    }

    @Deprecated
    public static j p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        return this.f123023a;
    }
}
