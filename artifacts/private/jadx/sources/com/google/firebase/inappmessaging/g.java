package com.google.firebase.inappmessaging;

import com.google.protobuf.s1;

/* JADX INFO: loaded from: classes5.dex */
public enum g implements s1.c {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f122548f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f122549g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f122550h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f122551i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final s1.d<g> f122552j = new s1.d<g>() { // from class: com.google.firebase.inappmessaging.g.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(int i10) {
            return g.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f122554a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f122555a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return g.l(i10) != null;
        }
    }

    g(int i10) {
        this.f122554a = i10;
    }

    public static g l(int i10) {
        if (i10 == 0) {
            return UNKNOWN_DISMISS_TYPE;
        }
        if (i10 == 1) {
            return AUTO;
        }
        if (i10 == 2) {
            return CLICK;
        }
        if (i10 != 3) {
            return null;
        }
        return SWIPE;
    }

    public static s1.d<g> n() {
        return f122552j;
    }

    public static s1.e o() {
        return b.f122555a;
    }

    @Deprecated
    public static g p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        return this.f122554a;
    }
}
