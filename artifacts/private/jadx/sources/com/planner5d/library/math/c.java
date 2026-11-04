package com.planner5d.library.math;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f180466e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final k f180467f = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f180468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f180469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k f180470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f180471d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a(float f10, float f11, float f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }

        @NotNull
        public final k b() {
            return c.f180467f;
        }

        @NotNull
        public final k c(@NotNull k p10, @NotNull k p11, @NotNull k p12, @NotNull k p13) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            Intrinsics.checkNotNullParameter(p12, "p3");
            Intrinsics.checkNotNullParameter(p13, "p4");
            float f10 = p11.f180480a - p10.f180480a;
            float f11 = p11.f180481b - p10.f180481b;
            float f12 = p13.f180480a - p12.f180480a;
            float f13 = p13.f180481b - p12.f180481b;
            float f14 = (f13 * f10) - (f12 * f11);
            return f14 == 0.0f ? b() : new k(f10, f11).R(((f12 * (p10.f180481b - p12.f180481b)) - (f13 * (p10.f180480a - p12.f180480a))) / f14).b(p10);
        }

        @NotNull
        public final k d(@NotNull k p10, @NotNull k p11, @NotNull k p12, @NotNull k p13) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            Intrinsics.checkNotNullParameter(p12, "p3");
            Intrinsics.checkNotNullParameter(p13, "p4");
            float f10 = p11.f180480a;
            float f11 = p10.f180480a;
            float f12 = f10 - f11;
            float f13 = p11.f180481b;
            float f14 = p10.f180481b;
            float f15 = f13 - f14;
            float f16 = p13.f180480a;
            float f17 = p12.f180480a;
            float f18 = f16 - f17;
            float f19 = p13.f180481b;
            float f20 = p12.f180481b;
            float f21 = f19 - f20;
            float f22 = (f21 * f12) - (f18 * f15);
            if (f22 == 0.0f) {
                return b();
            }
            float f23 = f14 - f20;
            float f24 = f11 - f17;
            float f25 = ((f18 * f23) - (f21 * f24)) / f22;
            if (f25 < 0.0f || f25 > 1.0f) {
                return b();
            }
            float f26 = ((f23 * f12) - (f24 * f15)) / f22;
            return (f26 < 0.0f || f26 > 1.0f) ? b() : new k(f11 + (f12 * f25), f14 + (f15 * f25));
        }

        @NotNull
        public final c[] e(@NotNull k... points) {
            Intrinsics.checkNotNullParameter(points, "points");
            int length = points.length - 1;
            c[] cVarArr = new c[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                cVarArr[i10] = new c(points[i10], points[i11]);
                i10 = i11;
            }
            return cVarArr;
        }

        public final float f(@NotNull k point, @NotNull k vector) {
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(vector, "vector");
            return ((float) Math.cos(vector.f(point))) * point.F();
        }

        public final float g(@NotNull k point, @NotNull k vector, float f10, float f11) {
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(vector, "vector");
            return a(f(point, vector), f10, f11);
        }

        public final float h(@NotNull k point, @NotNull k lineStart, @NotNull k lineEnd) {
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(lineStart, "lineStart");
            Intrinsics.checkNotNullParameter(lineEnd, "lineEnd");
            return f(new k(point).c0(lineStart), new k(lineEnd).c0(lineStart));
        }

        private a() {
        }
    }

    public c(@NotNull k start, @NotNull k end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.f180468a = new k(start);
        this.f180469b = new k(end);
        this.f180470c = new k(end).c0(start).M();
        this.f180471d = start.m(end);
    }

    @NotNull
    public final k b() {
        return this.f180470c;
    }

    @NotNull
    public final k c() {
        return this.f180469b;
    }

    public final float d() {
        return this.f180471d;
    }

    @NotNull
    public final k e() {
        return this.f180468a;
    }

    @NotNull
    public final k f(@NotNull c line) {
        Intrinsics.checkNotNullParameter(line, "line");
        k kVarG = g(line);
        k kVar = f180467f;
        if (kVarG != kVar) {
            k kVarC0 = new k(kVarG).c0(this.f180468a);
            if (kVarC0.F() <= this.f180471d && this.f180470c.s(kVarC0)) {
                return kVarG;
            }
        }
        return kVar;
    }

    @NotNull
    public final k g(@NotNull c line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return f180466e.c(this.f180468a, this.f180469b, line.f180468a, line.f180469b);
    }

    @NotNull
    public final k h(@NotNull c segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        return f180466e.d(this.f180468a, this.f180469b, segment.f180468a, segment.f180469b);
    }

    public final float i(@NotNull k point) {
        Intrinsics.checkNotNullParameter(point, "point");
        return j(point, true);
    }

    public final float j(@NotNull k point, boolean z10) {
        Intrinsics.checkNotNullParameter(point, "point");
        a aVar = f180466e;
        float fH = aVar.h(point, this.f180468a, this.f180469b);
        return z10 ? aVar.a(fH, 0.0f, this.f180471d) : fH;
    }

    @NotNull
    public String toString() {
        return "LineSegment(" + this.f180468a + " -> " + this.f180469b + ", direction=" + this.f180470c + " length=" + this.f180471d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull c line) {
        this(line.f180468a, line.f180469b);
        Intrinsics.checkNotNullParameter(line, "line");
    }
}
