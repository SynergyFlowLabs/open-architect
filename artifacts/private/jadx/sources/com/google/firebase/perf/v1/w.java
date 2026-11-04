package com.google.firebase.perf.v1;

import com.google.protobuf.s1;

/* JADX INFO: loaded from: classes5.dex */
public enum w implements s1.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f124389d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f124390e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final s1.d<w> f124391f = new s1.d<w>() { // from class: com.google.firebase.perf.v1.w.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w a(int i10) {
            return w.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f124393a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f124394a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return w.l(i10) != null;
        }
    }

    w(int i10) {
        this.f124393a = i10;
    }

    public static w l(int i10) {
        if (i10 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i10 == 1) {
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        int i11 = 0 >> 0;
        return null;
    }

    public static s1.d<w> n() {
        return f124391f;
    }

    public static s1.e o() {
        return b.f124394a;
    }

    @Deprecated
    public static w p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        return this.f124393a;
    }
}
