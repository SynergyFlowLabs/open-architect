package com.google.firebase.perf.v1;

import com.google.protobuf.s1;

/* JADX INFO: loaded from: classes5.dex */
public enum g implements s1.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f124262f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f124263g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f124264h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f124265i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final s1.d<g> f124266j = new s1.d<g>() { // from class: com.google.firebase.perf.v1.g.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(int i10) {
            return g.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f124268a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f124269a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return g.l(i10) != null;
        }
    }

    g(int i10) {
        this.f124268a = i10;
    }

    public static g l(int i10) {
        if (i10 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i10 == 1) {
            return FOREGROUND;
        }
        if (i10 == 2) {
            return BACKGROUND;
        }
        if (i10 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static s1.d<g> n() {
        return f124266j;
    }

    public static s1.e o() {
        return b.f124269a;
    }

    @Deprecated
    public static g p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        return this.f124268a;
    }
}
