package com.google.firebase.inappmessaging;

import com.google.protobuf.s1;

/* JADX INFO: loaded from: classes5.dex */
public enum h implements s1.c {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f122559e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f122560f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f122561g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final s1.d<h> f122562h = new s1.d<h>() { // from class: com.google.firebase.inappmessaging.h.a
        @Override // com.google.protobuf.s1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(int i10) {
            return h.l(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f122564a;

    private static final class b implements s1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s1.e f122565a = new b();

        private b() {
        }

        @Override // com.google.protobuf.s1.e
        public boolean a(int i10) {
            return h.l(i10) != null;
        }
    }

    h(int i10) {
        this.f122564a = i10;
    }

    public static h l(int i10) {
        if (i10 == 0) {
            return UNKNOWN_EVENT_TYPE;
        }
        if (i10 == 1) {
            return IMPRESSION_EVENT_TYPE;
        }
        if (i10 != 2) {
            return null;
        }
        return CLICK_EVENT_TYPE;
    }

    public static s1.d<h> n() {
        return f122562h;
    }

    public static s1.e o() {
        return b.f122565a;
    }

    @Deprecated
    public static h p(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.s1.c
    public final int i() {
        return this.f122564a;
    }
}
