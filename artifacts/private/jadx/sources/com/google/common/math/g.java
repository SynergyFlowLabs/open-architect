package com.google.common.math;

import com.google.common.base.j0;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.math.e
@com.google.common.annotations.d
public abstract class g {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f119416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f119417b;

        public g a(double x10, double y10) {
            j0.d(com.google.common.math.d.d(x10) && com.google.common.math.d.d(y10));
            double d10 = this.f119416a;
            if (x10 != d10) {
                return b((y10 - this.f119417b) / (x10 - d10));
            }
            j0.d(y10 != this.f119417b);
            return new e(this.f119416a);
        }

        public g b(double slope) {
            j0.d(!Double.isNaN(slope));
            return com.google.common.math.d.d(slope) ? new d(slope, this.f119417b - (this.f119416a * slope)) : new e(this.f119416a);
        }

        private b(double x10, double y10) {
            this.f119416a = x10;
            this.f119417b = y10;
        }
    }

    private static final class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f119418a = new c();

        private c() {
        }

        @Override // com.google.common.math.g
        public g c() {
            return this;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return false;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return false;
        }

        @Override // com.google.common.math.g
        public double g() {
            return Double.NaN;
        }

        @Override // com.google.common.math.g
        public double h(double x10) {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }
    }

    public static g a() {
        return c.f119418a;
    }

    public static g b(double y10) {
        j0.d(com.google.common.math.d.d(y10));
        return new d(0.0d, y10);
    }

    public static b f(double x10, double y10) {
        j0.d(com.google.common.math.d.d(x10) && com.google.common.math.d.d(y10));
        return new b(x10, y10);
    }

    public static g i(double x10) {
        j0.d(com.google.common.math.d.d(x10));
        return new e(x10);
    }

    public abstract g c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract double g();

    public abstract double h(double x10);

    private static final class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final double f119422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a8.b
        @fj.a
        g f119423b;

        e(double x10) {
            this.f119422a = x10;
            this.f119423b = null;
        }

        private g j() {
            return new d(0.0d, this.f119422a, this);
        }

        @Override // com.google.common.math.g
        public g c() {
            g gVarJ = this.f119423b;
            if (gVarJ == null) {
                gVarJ = j();
                this.f119423b = gVarJ;
            }
            return gVarJ;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return false;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return true;
        }

        @Override // com.google.common.math.g
        public double g() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.math.g
        public double h(double x10) {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f119422a));
        }

        e(double x10, g inverse) {
            this.f119422a = x10;
            this.f119423b = inverse;
        }
    }

    private static final class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final double f119419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final double f119420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.b
        @fj.a
        g f119421c;

        d(double slope, double yIntercept) {
            this.f119419a = slope;
            this.f119420b = yIntercept;
            this.f119421c = null;
        }

        private g j() {
            double d10 = this.f119419a;
            return d10 != 0.0d ? new d(1.0d / d10, (this.f119420b * (-1.0d)) / d10, this) : new e(this.f119420b, this);
        }

        @Override // com.google.common.math.g
        public g c() {
            g gVar = this.f119421c;
            if (gVar != null) {
                return gVar;
            }
            g gVarJ = j();
            this.f119421c = gVarJ;
            return gVarJ;
        }

        @Override // com.google.common.math.g
        public boolean d() {
            return this.f119419a == 0.0d;
        }

        @Override // com.google.common.math.g
        public boolean e() {
            return false;
        }

        @Override // com.google.common.math.g
        public double g() {
            return this.f119419a;
        }

        @Override // com.google.common.math.g
        public double h(double x10) {
            return (x10 * this.f119419a) + this.f119420b;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f119419a), Double.valueOf(this.f119420b));
        }

        d(double slope, double yIntercept, g inverse) {
            this.f119419a = slope;
            this.f119420b = yIntercept;
            this.f119421c = inverse;
        }
    }
}
