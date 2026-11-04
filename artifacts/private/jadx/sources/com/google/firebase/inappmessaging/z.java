package com.google.firebase.inappmessaging;

import com.google.protobuf.s1;

/* JADX INFO: loaded from: classes5.dex */
public enum z implements s1.c {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f123146f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f123147g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f123148h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f123149i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final s1.d<z> f123150j = new s1.d<z>() { // from class: com.google.firebase.inappmessaging.z.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(int i10) {
            return z.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f123152a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f123153a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return z.l(i10) != null;
        }
    }

    static {
        int i10 = 3 >> 1;
    }

    z(int i10) {
        this.f123152a = i10;
    }

    public static z l(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED_RENDER_ERROR;
        }
        if (i10 == 1) {
            return IMAGE_FETCH_ERROR;
        }
        if (i10 == 2) {
            return IMAGE_DISPLAY_ERROR;
        }
        if (i10 != 3) {
            return null;
        }
        return IMAGE_UNSUPPORTED_FORMAT;
    }

    public static s1.d<z> n() {
        return f123150j;
    }

    public static s1.e o() {
        return b.f123153a;
    }

    @Deprecated
    public static z p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        return this.f123152a;
    }
}
