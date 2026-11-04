package com.google.android.filament.utils;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class Manipulator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d[] f104787b = d.values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f104788a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0956a f104789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104790b;

        /* JADX INFO: renamed from: com.google.android.filament.utils.Manipulator$a$a, reason: collision with other inner class name */
        private static class C0956a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f104791a;

            C0956a(long j10) {
                this.f104791a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                Manipulator.nDestroyBuilder(this.f104791a);
            }
        }

        public a() {
            long jNCreateBuilder = Manipulator.nCreateBuilder();
            this.f104790b = jNCreateBuilder;
            this.f104789a = new C0956a(jNCreateBuilder);
        }

        @NonNull
        public Manipulator a(d dVar) {
            long jNBuilderBuild = Manipulator.nBuilderBuild(this.f104790b, dVar.ordinal());
            if (jNBuilderBuild != 0) {
                return new Manipulator(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Manipulator");
        }

        @NonNull
        public a b(float f10) {
            Manipulator.nBuilderFarPlane(this.f104790b, f10);
            return this;
        }

        public a c(float f10) {
            Manipulator.nBuilderFlightMaxMoveSpeed(this.f104790b, f10);
            return this;
        }

        public a d(float f10) {
            Manipulator.nBuilderFlightMoveDamping(this.f104790b, f10);
            return this;
        }

        public a e(float f10, float f11) {
            Manipulator.nBuilderFlightPanSpeed(this.f104790b, f10, f11);
            return this;
        }

        public a f(int i10) {
            Manipulator.nBuilderFlightSpeedSteps(this.f104790b, i10);
            return this;
        }

        public a g(float f10, float f11) {
            Manipulator.nBuilderFlightStartOrientation(this.f104790b, f10, f11);
            return this;
        }

        public a h(float f10, float f11, float f12) {
            Manipulator.nBuilderFlightStartPosition(this.f104790b, f10, f11, f12);
            return this;
        }

        @NonNull
        public a i(float f10) {
            Manipulator.nBuilderFovDegrees(this.f104790b, f10);
            return this;
        }

        @NonNull
        public a j(b bVar) {
            Manipulator.nBuilderFovDirection(this.f104790b, bVar.ordinal());
            return this;
        }

        @NonNull
        public a k(float f10, float f11, float f12, float f13) {
            Manipulator.nBuilderGroundPlane(this.f104790b, f10, f11, f12, f13);
            return this;
        }

        @NonNull
        public a l(float f10, float f11) {
            Manipulator.nBuilderMapExtent(this.f104790b, f10, f11);
            return this;
        }

        @NonNull
        public a m(float f10) {
            Manipulator.nBuilderMapMinDistance(this.f104790b, f10);
            return this;
        }

        @NonNull
        public a n(float f10, float f11, float f12) {
            Manipulator.nBuilderOrbitHomePosition(this.f104790b, f10, f11, f12);
            return this;
        }

        @NonNull
        public a o(float f10, float f11) {
            Manipulator.nBuilderOrbitSpeed(this.f104790b, f10, f11);
            return this;
        }

        @NonNull
        public a p(Boolean bool) {
            Manipulator.nBuilderPanning(this.f104790b, bool);
            return this;
        }

        @NonNull
        public a q(float f10, float f11, float f12) {
            Manipulator.nBuilderTargetPosition(this.f104790b, f10, f11, f12);
            return this;
        }

        @NonNull
        public a r(float f10, float f11, float f12) {
            Manipulator.nBuilderUpVector(this.f104790b, f10, f11, f12);
            return this;
        }

        @NonNull
        public a s(@androidx.annotation.g0(from = 1) int i10, @androidx.annotation.g0(from = 1) int i11) {
            Manipulator.nBuilderViewport(this.f104790b, i10, i11);
            return this;
        }

        @NonNull
        public a t(float f10) {
            Manipulator.nBuilderZoomSpeed(this.f104790b, f10);
            return this;
        }
    }

    public enum b {
        VERTICAL,
        HORIZONTAL;

        static {
            int i10 = 5 | 1;
        }
    }

    public enum c {
        FORWARD,
        LEFT,
        BACKWARD,
        RIGHT,
        UP,
        DOWN;

        static {
            int i10 = 1 >> 3;
        }
    }

    public enum d {
        ORBIT,
        MAP,
        FREE_FLIGHT
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFarPlane(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightMaxMoveSpeed(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightMoveDamping(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightPanSpeed(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightSpeedSteps(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightStartOrientation(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFlightStartPosition(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFovDegrees(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFovDirection(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGroundPlane(long j10, float f10, float f11, float f12, float f13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMapExtent(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMapMinDistance(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderOrbitHomePosition(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderOrbitSpeed(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPanning(long j10, Boolean bool);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTargetPosition(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUpVector(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderViewport(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderZoomSpeed(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nDestroyManipulator(long j10);

    private static native long nGetCurrentBookmark(long j10);

    private static native long nGetHomeBookmark(long j10);

    private static native void nGetLookAtDouble(long j10, double[] dArr, double[] dArr2, double[] dArr3);

    private static native void nGetLookAtFloat(long j10, float[] fArr, float[] fArr2, float[] fArr3);

    private static native int nGetMode(long j10);

    private static native void nGrabBegin(long j10, int i10, int i11, boolean z10);

    private static native void nGrabEnd(long j10);

    private static native void nGrabUpdate(long j10, int i10, int i11);

    private static native void nJumpToBookmark(long j10, long j11);

    private static native void nKeyDown(long j10, int i10);

    private static native void nKeyUp(long j10, int i10);

    private static native void nRaycast(long j10, int i10, int i11, float[] fArr);

    private static native void nScroll(long j10, int i10, int i11, float f10);

    private static native void nSetViewport(long j10, int i10, int i11);

    private static native void nUpdate(long j10, float f10);

    public d A() {
        return f104787b[nGetMode(this.f104788a)];
    }

    public void B(int i10, int i11, boolean z10) {
        nGrabBegin(this.f104788a, i10, i11, z10);
    }

    public void C() {
        nGrabEnd(this.f104788a);
    }

    public void D(int i10, int i11) {
        nGrabUpdate(this.f104788a, i10, i11);
    }

    public void E(Bookmark bookmark) {
        nJumpToBookmark(this.f104788a, bookmark.a());
    }

    public void F(c cVar) {
        nKeyDown(this.f104788a, cVar.ordinal());
    }

    public void G(c cVar) {
        nKeyUp(this.f104788a, cVar.ordinal());
    }

    @d1(min = 3)
    @p0
    public float[] H(int i10, int i11) {
        float[] fArr = new float[3];
        nRaycast(this.f104788a, i10, i11, fArr);
        return fArr;
    }

    public void I(int i10, int i11, float f10) {
        nScroll(this.f104788a, i10, i11, f10);
    }

    public void J(int i10, int i11) {
        nSetViewport(this.f104788a, i10, i11);
    }

    public void K(float f10) {
        nUpdate(this.f104788a, f10);
    }

    public void finalize() {
        try {
            super.finalize();
        } catch (Throwable unused) {
        }
        nDestroyManipulator(this.f104788a);
    }

    public Bookmark w() {
        return new Bookmark(nGetCurrentBookmark(this.f104788a));
    }

    public Bookmark x() {
        return new Bookmark(nGetHomeBookmark(this.f104788a));
    }

    public void y(@NonNull @d1(min = 3) double[] dArr, @NonNull @d1(min = 3) double[] dArr2, @NonNull @d1(min = 3) double[] dArr3) {
        nGetLookAtDouble(this.f104788a, dArr, dArr2, dArr3);
    }

    public void z(@NonNull @d1(min = 3) float[] fArr, @NonNull @d1(min = 3) float[] fArr2, @NonNull @d1(min = 3) float[] fArr3) {
        nGetLookAtFloat(this.f104788a, fArr, fArr2, fArr3);
    }

    private Manipulator(long j10) {
        this.f104788a = j10;
    }
}
