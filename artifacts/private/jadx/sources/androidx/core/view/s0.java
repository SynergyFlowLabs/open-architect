package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 {

    @Deprecated
    public static final int A = 17;

    @Deprecated
    public static final int B = 18;

    @Deprecated
    public static final int C = 19;

    @Deprecated
    public static final int D = 20;

    @Deprecated
    public static final int E = 21;

    @Deprecated
    public static final int F = 22;

    @Deprecated
    public static final int G = 23;

    @Deprecated
    public static final int H = 24;

    @Deprecated
    public static final int I = 25;
    public static final int J = 26;
    public static final int K = 27;
    public static final int L = 28;

    @Deprecated
    public static final int M = 32;

    @Deprecated
    public static final int N = 33;

    @Deprecated
    public static final int O = 34;

    @Deprecated
    public static final int P = 35;

    @Deprecated
    public static final int Q = 36;

    @Deprecated
    public static final int R = 37;

    @Deprecated
    public static final int S = 38;

    @Deprecated
    public static final int T = 39;

    @Deprecated
    public static final int U = 40;

    @Deprecated
    public static final int V = 41;

    @Deprecated
    public static final int W = 42;

    @Deprecated
    public static final int X = 43;

    @Deprecated
    public static final int Y = 44;

    @Deprecated
    public static final int Z = 45;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f48912a = 255;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Deprecated
    public static final int f48913a0 = 46;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f48914b = 5;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @Deprecated
    public static final int f48915b0 = 47;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f48916c = 6;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Deprecated
    public static final int f48917c0 = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f48918d = 7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f48919e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f48920f = 65280;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f48921g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final int f48922h = 9;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final int f48923i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f48924j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f48925k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f48926l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f48927m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f48928n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final int f48929o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final int f48930p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f48931q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f48932r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f48933s = 9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f48934t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f48935u = 11;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f48936v = 12;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final int f48937w = 13;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final int f48938x = 14;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final int f48939y = 15;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final int f48940z = 16;

    private s0() {
    }

    @androidx.annotation.v0(expression = "event.findPointerIndex(pointerId)")
    @Deprecated
    public static int a(MotionEvent motionEvent, int i10) {
        return motionEvent.findPointerIndex(i10);
    }

    @androidx.annotation.v0(expression = "event.getActionIndex()")
    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @androidx.annotation.v0(expression = "event.getActionMasked()")
    @Deprecated
    public static int c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @androidx.annotation.v0(expression = "event.getAxisValue(axis)")
    @Deprecated
    public static float d(MotionEvent motionEvent, int i10) {
        return motionEvent.getAxisValue(i10);
    }

    @androidx.annotation.v0(expression = "event.getAxisValue(axis, pointerIndex)")
    @Deprecated
    public static float e(MotionEvent motionEvent, int i10, int i11) {
        return motionEvent.getAxisValue(i10, i11);
    }

    @androidx.annotation.v0(expression = "event.getButtonState()")
    @Deprecated
    public static int f(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @androidx.annotation.v0(expression = "event.getPointerCount()")
    @Deprecated
    public static int g(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @androidx.annotation.v0(expression = "event.getPointerId(pointerIndex)")
    @Deprecated
    public static int h(MotionEvent motionEvent, int i10) {
        return motionEvent.getPointerId(i10);
    }

    @androidx.annotation.v0(expression = "event.getSource()")
    @Deprecated
    public static int i(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @androidx.annotation.v0(expression = "event.getX(pointerIndex)")
    @Deprecated
    public static float j(MotionEvent motionEvent, int i10) {
        return motionEvent.getX(i10);
    }

    @androidx.annotation.v0(expression = "event.getY(pointerIndex)")
    @Deprecated
    public static float k(MotionEvent motionEvent, int i10) {
        return motionEvent.getY(i10);
    }

    public static boolean l(@NonNull MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
