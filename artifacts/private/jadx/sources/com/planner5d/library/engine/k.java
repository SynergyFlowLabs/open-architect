package com.planner5d.library.engine;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface k {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f160759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f160760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f160761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f160762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f160763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f160764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f160765g;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f160759a = i10;
            this.f160760b = i11;
            this.f160761c = i12;
            this.f160762d = i13;
            this.f160763e = i14;
            this.f160764f = i15;
            this.f160765g = i16;
        }

        public final int a() {
            return this.f160762d;
        }

        public final int b() {
            return this.f160761c;
        }

        public final int c() {
            return this.f160763e;
        }

        public final int d() {
            return this.f160760b;
        }

        public final int e() {
            return this.f160759a;
        }

        public final int f() {
            return this.f160765g;
        }

        public final int g() {
            return this.f160764f;
        }

        @NotNull
        public String toString() {
            return "r: " + this.f160759a + ", g: " + this.f160760b + ", b: " + this.f160761c + ", a: " + this.f160762d + ", depth: " + this.f160763e + ", stencil: " + this.f160764f + ", num samples: " + this.f160765g;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final int f160766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public final int f160767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        public final int f160768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        public final int f160769d;

        public b(int i10, int i11, int i12, int i13) {
            this.f160766a = i10;
            this.f160767b = i11;
            this.f160768c = i12;
            this.f160769d = i13;
        }

        @NotNull
        public String toString() {
            return this.f160766a + "x" + this.f160767b + ", bpp: " + this.f160769d + ", hz: " + this.f160768c;
        }
    }

    void a();

    @NotNull
    b b();

    float e();

    float getDensity();

    int getHeight();

    int getWidth();
}
