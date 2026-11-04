package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class MotionLayout extends ConstraintLayout implements y0 {
    public static final int A4 = 1;
    public static final int B4 = 2;
    public static final int C4 = 3;
    private static final float D4 = 1.0E-5f;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final int f44977k4 = 0;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final int f44978l4 = 1;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final int f44979m4 = 2;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final int f44980n4 = 3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final int f44981o4 = 4;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final int f44982p4 = 5;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final int f44983q4 = 6;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final int f44984r4 = 7;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    static final String f44985s4 = "MotionLayout";

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final boolean f44986t4 = false;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static boolean f44987u4 = false;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final int f44988v4 = 0;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final int f44989w4 = 1;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final int f44990x4 = 2;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    static final int f44991y4 = 50;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final int f44992z4 = 0;
    private CopyOnWriteArrayList<k> A3;
    private int B3;
    private long C3;
    private float D3;
    private int E3;
    private float F3;
    boolean G3;
    private float H1;
    protected boolean H3;
    int I3;
    int J3;
    int K3;
    int L3;
    int M3;
    int N3;
    float O3;
    private androidx.constraintlayout.core.motion.utils.g P3;
    private boolean Q3;
    private j R3;
    private Runnable S3;
    private int[] T3;
    int U3;
    private boolean V3;
    int W3;
    HashMap<View, androidx.constraintlayout.motion.utils.e> X3;
    private int Y3;
    private int Z3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    t f44993a;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private int f44994a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Interpolator f44995b;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    Rect f44996b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Interpolator f44997c;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private boolean f44998c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f44999d;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    l f45000d4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45001e;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    g f45002e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f45003f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private boolean f45004f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45005g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    int f45006g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private RectF f45007g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45008h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    f f45009h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private View f45010h4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f45011i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f45012i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private Matrix f45013i4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f45014j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private androidx.constraintlayout.motion.utils.b f45015j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    ArrayList<Integer> f45016j4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    HashMap<View, o> f45017k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private e f45018k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f45019l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.d f45020l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f45021m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    boolean f45022m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f45023n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    int f45024n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f45025o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    int f45026o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    boolean f45027p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private k f45028p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private float f45029p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    int f45030p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    int f45031q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    boolean f45032r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f45033s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    float f45034s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f45035t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    float f45036t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    long f45037u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f45038v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    float f45039v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f45040w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private boolean f45041w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private ArrayList<p> f45042x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private ArrayList<p> f45043y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private ArrayList<p> f45044z3;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.R3.a();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.V3 = false;
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f45047a;

        c(View view) {
            this.f45047a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45047a.setNestedScrollingEnabled(true);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.R3.a();
        }
    }

    class e extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f45050a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f45051b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f45052c;

        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public float a() {
            return MotionLayout.this.f44999d;
        }

        public void b(float f10, float f11, float f12) {
            this.f45050a = f10;
            this.f45051b = f11;
            this.f45052c = f12;
        }

        @Override // androidx.constraintlayout.motion.widget.r, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11;
            float f12;
            float f13 = this.f45050a;
            if (f13 > 0.0f) {
                float f14 = this.f45052c;
                if (f13 / f14 < f10) {
                    f10 = f13 / f14;
                }
                MotionLayout.this.f44999d = f13 - (f14 * f10);
                f11 = (f13 * f10) - (((f14 * f10) * f10) / 2.0f);
                f12 = this.f45051b;
            } else {
                float f15 = this.f45052c;
                if ((-f13) / f15 < f10) {
                    f10 = (-f13) / f15;
                }
                MotionLayout.this.f44999d = (f15 * f10) + f13;
                f11 = (f13 * f10) + (((f15 * f10) * f10) / 2.0f);
                f12 = this.f45051b;
            }
            return f11 + f12;
        }
    }

    private class f {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f45054v = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float[] f45055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int[] f45056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float[] f45057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Path f45058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f45059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Paint f45060f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Paint f45061g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Paint f45062h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Paint f45063i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float[] f45064j;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        DashPathEffect f45070p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f45071q;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f45074t;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final int f45065k = -21965;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final int f45066l = -2067046;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final int f45067m = -13391360;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f45068n = 1996488704;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f45069o = 10;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Rect f45072r = new Rect();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f45073s = false;

        f() {
            this.f45074t = 1;
            Paint paint = new Paint();
            this.f45059e = paint;
            paint.setAntiAlias(true);
            this.f45059e.setColor(-21965);
            this.f45059e.setStrokeWidth(2.0f);
            Paint paint2 = this.f45059e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f45060f = paint3;
            paint3.setAntiAlias(true);
            this.f45060f.setColor(-2067046);
            this.f45060f.setStrokeWidth(2.0f);
            this.f45060f.setStyle(style);
            Paint paint4 = new Paint();
            this.f45061g = paint4;
            paint4.setAntiAlias(true);
            this.f45061g.setColor(-13391360);
            this.f45061g.setStrokeWidth(2.0f);
            this.f45061g.setStyle(style);
            Paint paint5 = new Paint();
            this.f45062h = paint5;
            paint5.setAntiAlias(true);
            this.f45062h.setColor(-13391360);
            this.f45062h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f45064j = new float[8];
            Paint paint6 = new Paint();
            this.f45063i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f45070p = dashPathEffect;
            this.f45061g.setPathEffect(dashPathEffect);
            this.f45057c = new float[100];
            this.f45056b = new int[50];
            if (this.f45073s) {
                this.f45059e.setStrokeWidth(8.0f);
                this.f45063i.setStrokeWidth(8.0f);
                this.f45060f.setStrokeWidth(8.0f);
                this.f45074t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.f45055a, this.f45059e);
        }

        private void d(Canvas canvas) {
            boolean z10 = false;
            boolean z11 = false;
            for (int i10 = 0; i10 < this.f45071q; i10++) {
                int i11 = this.f45056b[i10];
                if (i11 == 1) {
                    z10 = true;
                }
                if (i11 == 0) {
                    z11 = true;
                }
            }
            if (z10) {
                g(canvas);
            }
            if (z11) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f45055a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.f45061g);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.f45061g);
        }

        private void f(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f45055a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fMin = Math.min(f12, f14);
            float fMax = Math.max(f13, f15);
            float fMin2 = f10 - Math.min(f12, f14);
            float fMax2 = Math.max(f13, f15) - f11;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d)) / 100.0f);
            m(str, this.f45062h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f45072r.width() / 2)) + fMin, f11 - 20.0f, this.f45062h);
            canvas.drawLine(f10, f11, Math.min(f12, f14), f11, this.f45061g);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d)) / 100.0f);
            m(str2, this.f45062h);
            canvas.drawText(str2, f10 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f45072r.height() / 2)), this.f45062h);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), this.f45061g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.f45055a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f45061g);
        }

        private void h(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f45055a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f12 - f14, f13 - f15);
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f10 - f12) * f16) + ((f11 - f13) * f17)) / (fHypot * fHypot);
            float f19 = f12 + (f16 * f18);
            float f20 = f13 + (f18 * f17);
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f19, f20);
            float fHypot2 = (float) Math.hypot(f19 - f10, f20 - f11);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            m(str, this.f45062h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f45072r.width() / 2), -20.0f, this.f45062h);
            canvas.drawLine(f10, f11, f19, f20, this.f45061g);
        }

        private void i(Canvas canvas, float f10, float f11, int i10, int i11) {
            String str = "" + (((int) (((double) (((f10 - (i10 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i10))) + 0.5d)) / 100.0f);
            m(str, this.f45062h);
            canvas.drawText(str, ((f10 / 2.0f) - (this.f45072r.width() / 2)) + 0.0f, f11 - 20.0f, this.f45062h);
            canvas.drawLine(f10, f11, Math.min(0.0f, 1.0f), f11, this.f45061g);
            String str2 = "" + (((int) (((double) (((f11 - (i11 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i11))) + 0.5d)) / 100.0f);
            m(str2, this.f45062h);
            canvas.drawText(str2, f10 + 5.0f, 0.0f - ((f11 / 2.0f) - (this.f45072r.height() / 2)), this.f45062h);
            canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), this.f45061g);
        }

        private void j(Canvas canvas, o oVar) {
            this.f45058d.reset();
            for (int i10 = 0; i10 <= 50; i10++) {
                oVar.g(i10 / 50, this.f45064j, 0);
                Path path = this.f45058d;
                float[] fArr = this.f45064j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f45058d;
                float[] fArr2 = this.f45064j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f45058d;
                float[] fArr3 = this.f45064j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f45058d;
                float[] fArr4 = this.f45064j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f45058d.close();
            }
            this.f45059e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f45058d, this.f45059e);
            canvas.translate(-2.0f, -2.0f);
            this.f45059e.setColor(l1.a.f316127c);
            canvas.drawPath(this.f45058d, this.f45059e);
        }

        private void k(Canvas canvas, int i10, int i11, o oVar) {
            int width;
            int height;
            View view = oVar.f45323b;
            if (view != null) {
                width = view.getWidth();
                height = oVar.f45323b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i12 = 1; i12 < i11 - 1; i12++) {
                if (i10 != 4 || this.f45056b[i12 - 1] != 0) {
                    float[] fArr = this.f45057c;
                    int i13 = i12 * 2;
                    float f10 = fArr[i13];
                    float f11 = fArr[i13 + 1];
                    this.f45058d.reset();
                    this.f45058d.moveTo(f10, f11 + 10.0f);
                    this.f45058d.lineTo(f10 + 10.0f, f11);
                    this.f45058d.lineTo(f10, f11 - 10.0f);
                    this.f45058d.lineTo(f10 - 10.0f, f11);
                    this.f45058d.close();
                    int i14 = i12 - 1;
                    oVar.w(i14);
                    if (i10 == 4) {
                        int i15 = this.f45056b[i14];
                        if (i15 == 1) {
                            h(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i15 == 0) {
                            f(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i15 == 2) {
                            i(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.f45058d, this.f45063i);
                    }
                    if (i10 == 2) {
                        h(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i10 == 3) {
                        f(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i10 == 6) {
                        i(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f45058d, this.f45063i);
                }
            }
            float[] fArr2 = this.f45055a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f45060f);
                float[] fArr3 = this.f45055a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f45060f);
            }
        }

        private void l(Canvas canvas, float f10, float f11, float f12, float f13) {
            canvas.drawRect(f10, f11, f12, f13, this.f45061g);
            canvas.drawLine(f10, f11, f12, f13, this.f45061g);
        }

        public void a(Canvas canvas, HashMap<View, o> map, int i10, int i11) {
            if (map != null && map.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i11 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f45005g) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f45062h);
                    canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f45059e);
                }
                for (o oVar : map.values()) {
                    int iQ = oVar.q();
                    if (i11 > 0 && iQ == 0) {
                        iQ = 1;
                    }
                    if (iQ != 0) {
                        this.f45071q = oVar.e(this.f45057c, this.f45056b);
                        if (iQ >= 1) {
                            int i12 = i10 / 16;
                            float[] fArr = this.f45055a;
                            if (fArr == null || fArr.length != i12 * 2) {
                                this.f45055a = new float[i12 * 2];
                                this.f45058d = new Path();
                            }
                            int i13 = this.f45074t;
                            canvas.translate(i13, i13);
                            this.f45059e.setColor(1996488704);
                            this.f45063i.setColor(1996488704);
                            this.f45060f.setColor(1996488704);
                            this.f45061g.setColor(1996488704);
                            oVar.f(this.f45055a, i12);
                            b(canvas, iQ, this.f45071q, oVar);
                            this.f45059e.setColor(-21965);
                            this.f45060f.setColor(-2067046);
                            this.f45063i.setColor(-2067046);
                            this.f45061g.setColor(-13391360);
                            int i14 = this.f45074t;
                            canvas.translate(-i14, -i14);
                            b(canvas, iQ, this.f45071q, oVar);
                            if (iQ == 5) {
                                j(canvas, oVar);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void b(Canvas canvas, int i10, int i11, o oVar) {
            if (i10 == 4) {
                d(canvas);
            }
            if (i10 == 2) {
                g(canvas);
            }
            if (i10 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i10, i11, oVar);
        }

        void m(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f45072r);
        }
    }

    class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.constraintlayout.core.widgets.f f45076a = new androidx.constraintlayout.core.widgets.f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.core.widgets.f f45077b = new androidx.constraintlayout.core.widgets.f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.constraintlayout.widget.f f45078c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.widget.f f45079d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f45081f;

        g() {
        }

        private void b(int i10, int i11) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f45003f == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.f fVar = this.f45077b;
                androidx.constraintlayout.widget.f fVar2 = this.f45079d;
                motionLayout2.resolveSystem(fVar, optimizationLevel, (fVar2 == null || fVar2.f45918e == 0) ? i10 : i11, (fVar2 == null || fVar2.f45918e == 0) ? i11 : i10);
                androidx.constraintlayout.widget.f fVar3 = this.f45078c;
                if (fVar3 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.f fVar4 = this.f45076a;
                    int i12 = fVar3.f45918e;
                    int i13 = i12 == 0 ? i10 : i11;
                    if (i12 == 0) {
                        i10 = i11;
                    }
                    motionLayout3.resolveSystem(fVar4, optimizationLevel, i13, i10);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.f fVar5 = this.f45078c;
            if (fVar5 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.f fVar6 = this.f45076a;
                int i14 = fVar5.f45918e;
                motionLayout4.resolveSystem(fVar6, optimizationLevel, i14 == 0 ? i10 : i11, i14 == 0 ? i11 : i10);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            androidx.constraintlayout.core.widgets.f fVar7 = this.f45077b;
            androidx.constraintlayout.widget.f fVar8 = this.f45079d;
            int i15 = (fVar8 == null || fVar8.f45918e == 0) ? i10 : i11;
            if (fVar8 == null || fVar8.f45918e == 0) {
                i10 = i11;
            }
            motionLayout5.resolveSystem(fVar7, optimizationLevel, i15, i10);
        }

        @e.a({"LogConditional"})
        private void d(String str, androidx.constraintlayout.core.widgets.f fVar) {
            String str2 = str + " " + androidx.constraintlayout.motion.widget.c.k((View) fVar.w());
            fVar.toString();
            int size = fVar.m2().size();
            for (int i10 = 0; i10 < size; i10++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("[");
                sb2.append(i10);
                sb2.append("] ");
                androidx.constraintlayout.core.widgets.e eVar = fVar.m2().get(i10);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("");
                sb3.append(eVar.R.f44662f != null ? androidx.exifinterface.media.a.f51379e5 : "_");
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(eVar.T.f44662f != null ? "B" : "_");
                String string2 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string2);
                sb5.append(eVar.Q.f44662f != null ? "L" : "_");
                String string3 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(string3);
                sb6.append(eVar.S.f44662f != null ? "R" : "_");
                View view = (View) eVar.w();
                String strK = androidx.constraintlayout.motion.widget.c.k(view);
                if (view instanceof TextView) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(strK);
                    sb7.append("(");
                    sb7.append((Object) ((TextView) view).getText());
                    sb7.append(")");
                }
                eVar.toString();
            }
        }

        @e.a({"LogConditional"})
        private void e(String str, ConstraintLayout.b bVar) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(bVar.f45711t != -1 ? "SS" : "__");
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(bVar.f45709s != -1 ? "|SE" : "|__");
            String string2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string2);
            sb4.append(bVar.f45713u != -1 ? "|ES" : "|__");
            String string3 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string3);
            sb5.append(bVar.f45715v != -1 ? "|EE" : "|__");
            String string4 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(string4);
            sb6.append(bVar.f45681e != -1 ? "|LL" : "|__");
            String string5 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string5);
            sb7.append(bVar.f45683f != -1 ? "|LR" : "|__");
            String string6 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string6);
            sb8.append(bVar.f45685g != -1 ? "|RL" : "|__");
            String string7 = sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(string7);
            sb9.append(bVar.f45687h != -1 ? "|RR" : "|__");
            String string8 = sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(string8);
            sb10.append(bVar.f45689i != -1 ? "|TT" : "|__");
            String string9 = sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(string9);
            sb11.append(bVar.f45691j != -1 ? "|TB" : "|__");
            String string10 = sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(string10);
            sb12.append(bVar.f45693k != -1 ? "|BT" : "|__");
            String string11 = sb12.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(string11);
            sb13.append(bVar.f45695l != -1 ? "|BB" : "|__");
        }

        @e.a({"LogConditional"})
        private void f(String str, androidx.constraintlayout.core.widgets.e eVar) {
            String string;
            String string2;
            String string3;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            String string4 = "__";
            if (eVar.R.f44662f != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(androidx.exifinterface.media.a.f51379e5);
                sb3.append(eVar.R.f44662f.f44661e == androidx.constraintlayout.core.widgets.d.a.TOP ? androidx.exifinterface.media.a.f51379e5 : "B");
                string = sb3.toString();
            } else {
                string = "__";
            }
            sb2.append(string);
            String string5 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string5);
            if (eVar.T.f44662f != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("B");
                sb5.append(eVar.T.f44662f.f44661e == androidx.constraintlayout.core.widgets.d.a.TOP ? androidx.exifinterface.media.a.f51379e5 : "B");
                string2 = sb5.toString();
            } else {
                string2 = "__";
            }
            sb4.append(string2);
            String string6 = sb4.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(string6);
            if (eVar.Q.f44662f != null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("L");
                sb7.append(eVar.Q.f44662f.f44661e == androidx.constraintlayout.core.widgets.d.a.LEFT ? "L" : "R");
                string3 = sb7.toString();
            } else {
                string3 = "__";
            }
            sb6.append(string3);
            String string7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string7);
            if (eVar.S.f44662f != null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append("R");
                sb9.append(eVar.S.f44662f.f44661e == androidx.constraintlayout.core.widgets.d.a.LEFT ? "L" : "R");
                string4 = sb9.toString();
            }
            sb8.append(string4);
            eVar.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m(androidx.constraintlayout.core.widgets.f fVar, androidx.constraintlayout.widget.f fVar2) {
            SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray = new SparseArray<>();
            androidx.constraintlayout.widget.g.a aVar = new androidx.constraintlayout.widget.g.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, fVar);
            sparseArray.put(MotionLayout.this.getId(), fVar);
            if (fVar2 != null && fVar2.f45918e != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.f45077b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            for (androidx.constraintlayout.core.widgets.e eVar : fVar.m2()) {
                eVar.g1(true);
                sparseArray.put(((View) eVar.w()).getId(), eVar);
            }
            for (androidx.constraintlayout.core.widgets.e eVar2 : fVar.m2()) {
                View view = (View) eVar2.w();
                fVar2.u(view.getId(), aVar);
                eVar2.d2(fVar2.v0(view.getId()));
                eVar2.z1(fVar2.n0(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.b) {
                    fVar2.s((androidx.constraintlayout.widget.b) view, eVar2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).K();
                    }
                }
                aVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, eVar2, aVar, sparseArray);
                if (fVar2.u0(view.getId()) == 1) {
                    eVar2.c2(view.getVisibility());
                } else {
                    eVar2.c2(fVar2.t0(view.getId()));
                }
            }
            for (androidx.constraintlayout.core.widgets.e eVar3 : fVar.m2()) {
                if (eVar3 instanceof androidx.constraintlayout.core.widgets.n) {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) eVar3.w();
                    androidx.constraintlayout.core.widgets.i iVar = (androidx.constraintlayout.core.widgets.i) eVar3;
                    bVar.I(fVar, iVar, sparseArray);
                    ((androidx.constraintlayout.core.widgets.n) iVar).o2();
                }
            }
        }

        public void a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f45017k.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = MotionLayout.this.getChildAt(i10);
                o oVar = new o(childAt);
                int id2 = childAt.getId();
                iArr[i10] = id2;
                sparseArray.put(id2, oVar);
                MotionLayout.this.f45017k.put(childAt, oVar);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt2 = MotionLayout.this.getChildAt(i11);
                o oVar2 = MotionLayout.this.f45017k.get(childAt2);
                if (oVar2 != null) {
                    if (this.f45078c != null) {
                        androidx.constraintlayout.core.widgets.e eVarG = g(this.f45076a, childAt2);
                        if (eVarG != null) {
                            oVar2.W(MotionLayout.this.O0(eVarG), this.f45078c, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.f45006g3 != 0) {
                            androidx.constraintlayout.motion.widget.c.g();
                            androidx.constraintlayout.motion.widget.c.k(childAt2);
                            childAt2.getClass();
                        }
                    } else if (MotionLayout.this.V3) {
                        androidx.constraintlayout.motion.utils.e eVar = MotionLayout.this.X3.get(childAt2);
                        MotionLayout motionLayout = MotionLayout.this;
                        oVar2.X(eVar, childAt2, motionLayout.W3, motionLayout.Y3, MotionLayout.this.Z3);
                    }
                    if (this.f45079d != null) {
                        androidx.constraintlayout.core.widgets.e eVarG2 = g(this.f45077b, childAt2);
                        if (eVarG2 != null) {
                            oVar2.T(MotionLayout.this.O0(eVarG2), this.f45079d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.f45006g3 != 0) {
                            androidx.constraintlayout.motion.widget.c.g();
                            androidx.constraintlayout.motion.widget.c.k(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                o oVar3 = (o) sparseArray.get(iArr[i12]);
                int iK = oVar3.k();
                if (iK != -1) {
                    oVar3.b0((o) sparseArray.get(iK));
                }
            }
        }

        void c(androidx.constraintlayout.core.widgets.f fVar, androidx.constraintlayout.core.widgets.f fVar2) {
            androidx.constraintlayout.core.widgets.e jVar;
            ArrayList<androidx.constraintlayout.core.widgets.e> arrayListM2 = fVar.m2();
            HashMap<androidx.constraintlayout.core.widgets.e, androidx.constraintlayout.core.widgets.e> map = new HashMap<>();
            map.put(fVar, fVar2);
            fVar2.m2().clear();
            fVar2.n(fVar, map);
            for (androidx.constraintlayout.core.widgets.e eVar : arrayListM2) {
                if (eVar instanceof androidx.constraintlayout.core.widgets.a) {
                    jVar = new androidx.constraintlayout.core.widgets.a();
                } else if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
                    jVar = new androidx.constraintlayout.core.widgets.h();
                } else if (eVar instanceof androidx.constraintlayout.core.widgets.g) {
                    jVar = new androidx.constraintlayout.core.widgets.g();
                } else if (eVar instanceof androidx.constraintlayout.core.widgets.l) {
                    jVar = new androidx.constraintlayout.core.widgets.l();
                } else {
                    jVar = eVar instanceof androidx.constraintlayout.core.widgets.i ? new androidx.constraintlayout.core.widgets.j() : new androidx.constraintlayout.core.widgets.e();
                }
                fVar2.a(jVar);
                map.put(eVar, jVar);
            }
            for (androidx.constraintlayout.core.widgets.e eVar2 : arrayListM2) {
                map.get(eVar2).n(eVar2, map);
            }
        }

        androidx.constraintlayout.core.widgets.e g(androidx.constraintlayout.core.widgets.f fVar, View view) {
            if (fVar.w() == view) {
                return fVar;
            }
            ArrayList<androidx.constraintlayout.core.widgets.e> arrayListM2 = fVar.m2();
            int size = arrayListM2.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.constraintlayout.core.widgets.e eVar = arrayListM2.get(i10);
                if (eVar.w() == view) {
                    return eVar;
                }
            }
            return null;
        }

        void h(androidx.constraintlayout.core.widgets.f fVar, androidx.constraintlayout.widget.f fVar2, androidx.constraintlayout.widget.f fVar3) {
            this.f45078c = fVar2;
            this.f45079d = fVar3;
            this.f45076a = new androidx.constraintlayout.core.widgets.f();
            this.f45077b = new androidx.constraintlayout.core.widgets.f();
            this.f45076a.V2(((ConstraintLayout) MotionLayout.this).mLayoutWidget.H2());
            this.f45077b.V2(((ConstraintLayout) MotionLayout.this).mLayoutWidget.H2());
            this.f45076a.q2();
            this.f45077b.q2();
            c(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f45076a);
            c(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f45077b);
            if (MotionLayout.this.f45025o > 0.5d) {
                if (fVar2 != null) {
                    m(this.f45076a, fVar2);
                }
                m(this.f45077b, fVar3);
            } else {
                m(this.f45077b, fVar3);
                if (fVar2 != null) {
                    m(this.f45076a, fVar2);
                }
            }
            this.f45076a.Z2(MotionLayout.this.isRtl());
            this.f45076a.b3();
            this.f45077b.Z2(MotionLayout.this.isRtl());
            this.f45077b.b3();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.f fVar4 = this.f45076a;
                    androidx.constraintlayout.core.widgets.e.b bVar = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
                    fVar4.E1(bVar);
                    this.f45077b.E1(bVar);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.f fVar5 = this.f45076a;
                    androidx.constraintlayout.core.widgets.e.b bVar2 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
                    fVar5.Z1(bVar2);
                    this.f45077b.Z1(bVar2);
                }
            }
        }

        public boolean i(int i10, int i11) {
            return (i10 == this.f45080e && i11 == this.f45081f) ? false : true;
        }

        public void j(int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.M3 = mode;
            motionLayout.N3 = mode2;
            b(i10, i11);
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i10, i11);
                MotionLayout.this.I3 = this.f45076a.m0();
                MotionLayout.this.J3 = this.f45076a.D();
                MotionLayout.this.K3 = this.f45077b.m0();
                MotionLayout.this.L3 = this.f45077b.D();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.H3 = (motionLayout2.I3 == motionLayout2.K3 && motionLayout2.J3 == motionLayout2.L3) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i12 = motionLayout3.I3;
            int i13 = motionLayout3.J3;
            int i14 = motionLayout3.M3;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                i12 = (int) (i12 + (motionLayout3.O3 * (motionLayout3.K3 - i12)));
            }
            int i15 = i12;
            int i16 = motionLayout3.N3;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                i13 = (int) (i13 + (motionLayout3.O3 * (motionLayout3.L3 - i13)));
            }
            MotionLayout.this.resolveMeasuredDimension(i10, i11, i15, i13, this.f45076a.Q2() || this.f45077b.Q2(), this.f45076a.O2() || this.f45077b.O2());
        }

        public void k() {
            j(MotionLayout.this.f45008h, MotionLayout.this.f45011i);
            MotionLayout.this.N0();
        }

        public void l(int i10, int i11) {
            this.f45080e = i10;
            this.f45081f = i11;
        }
    }

    protected interface h {
        void a();

        float b(int i10);

        void c(MotionEvent motionEvent);

        void clear();

        float d();

        void e(int i10, float f10);

        void f(int i10);

        float g();

        float h(int i10);
    }

    private static class i implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static i f45083b = new i();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        VelocityTracker f45084a;

        private i() {
        }

        public static i i() {
            f45083b.f45084a = VelocityTracker.obtain();
            return f45083b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void a() {
            VelocityTracker velocityTracker = this.f45084a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f45084a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public float b(int i10) {
            if (this.f45084a != null) {
                return b(i10);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void c(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f45084a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void clear() {
            VelocityTracker velocityTracker = this.f45084a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public float d() {
            VelocityTracker velocityTracker = this.f45084a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void e(int i10, float f10) {
            VelocityTracker velocityTracker = this.f45084a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10, f10);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void f(int i10) {
            VelocityTracker velocityTracker = this.f45084a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public float g() {
            VelocityTracker velocityTracker = this.f45084a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public float h(int i10) {
            VelocityTracker velocityTracker = this.f45084a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i10);
            }
            return 0.0f;
        }
    }

    class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f45085a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f45086b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f45087c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45088d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final String f45089e = "motion.progress";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f45090f = "motion.velocity";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final String f45091g = "motion.StartState";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f45092h = "motion.EndState";

        j() {
        }

        void a() {
            int i10 = this.f45087c;
            if (i10 != -1 || this.f45088d != -1) {
                if (i10 == -1) {
                    MotionLayout.this.V0(this.f45088d);
                } else {
                    int i11 = this.f45088d;
                    if (i11 == -1) {
                        MotionLayout.this.setState(i10, -1, -1);
                    } else {
                        MotionLayout.this.M0(i10, i11);
                    }
                }
                MotionLayout.this.setState(l.SETUP);
            }
            if (Float.isNaN(this.f45086b)) {
                if (Float.isNaN(this.f45085a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f45085a);
            } else {
                MotionLayout.this.L0(this.f45085a, this.f45086b);
                this.f45085a = Float.NaN;
                this.f45086b = Float.NaN;
                this.f45087c = -1;
                this.f45088d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f45085a);
            bundle.putFloat("motion.velocity", this.f45086b);
            bundle.putInt("motion.StartState", this.f45087c);
            bundle.putInt("motion.EndState", this.f45088d);
            return bundle;
        }

        public void c() {
            this.f45088d = MotionLayout.this.f45005g;
            this.f45087c = MotionLayout.this.f45001e;
            this.f45086b = MotionLayout.this.getVelocity();
            this.f45085a = MotionLayout.this.getProgress();
        }

        public void d(int i10) {
            this.f45088d = i10;
        }

        public void e(float f10) {
            this.f45085a = f10;
        }

        public void f(int i10) {
            this.f45087c = i10;
        }

        public void g(Bundle bundle) {
            this.f45085a = bundle.getFloat("motion.progress");
            this.f45086b = bundle.getFloat("motion.velocity");
            this.f45087c = bundle.getInt("motion.StartState");
            this.f45088d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f45086b = f10;
        }
    }

    public interface k {
        void g(MotionLayout motionLayout, int i10, int i11, float f10);

        void i(MotionLayout motionLayout, int i10);

        void j(MotionLayout motionLayout, int i10, int i11);

        void k(MotionLayout motionLayout, int i10, boolean z10, float f10);
    }

    enum l {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        this.f44997c = null;
        this.f44999d = 0.0f;
        this.f45001e = -1;
        this.f45003f = -1;
        this.f45005g = -1;
        this.f45008h = 0;
        this.f45011i = 0;
        this.f45014j = true;
        this.f45017k = new HashMap<>();
        this.f45019l = 0L;
        this.f45021m = 1.0f;
        this.f45023n = 0.0f;
        this.f45025o = 0.0f;
        this.f45035t = 0.0f;
        this.f45040w = false;
        this.f45027p0 = false;
        this.f45006g3 = 0;
        this.f45012i3 = false;
        this.f45015j3 = new androidx.constraintlayout.motion.utils.b();
        this.f45018k3 = new e();
        this.f45022m3 = true;
        this.f45032r3 = false;
        this.f45041w3 = false;
        this.f45042x3 = null;
        this.f45043y3 = null;
        this.f45044z3 = null;
        this.A3 = null;
        this.B3 = 0;
        this.C3 = -1L;
        this.D3 = 0.0f;
        this.E3 = 0;
        this.F3 = 0.0f;
        this.G3 = false;
        this.H3 = false;
        this.P3 = new androidx.constraintlayout.core.motion.utils.g();
        this.Q3 = false;
        this.S3 = null;
        this.T3 = null;
        this.U3 = 0;
        this.V3 = false;
        this.W3 = 0;
        this.X3 = new HashMap<>();
        this.f44996b4 = new Rect();
        this.f44998c4 = false;
        this.f45000d4 = l.UNDEFINED;
        this.f45002e4 = new g();
        this.f45004f4 = false;
        this.f45007g4 = new RectF();
        this.f45010h4 = null;
        this.f45013i4 = null;
        this.f45016j4 = new ArrayList<>();
        w0(null);
    }

    private void F0() {
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if (this.f45028p1 == null && ((copyOnWriteArrayList = this.A3) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.G3 = false;
        for (Integer num : this.f45016j4) {
            k kVar = this.f45028p1;
            if (kVar != null) {
                kVar.i(this, num.intValue());
            }
            CopyOnWriteArrayList<k> copyOnWriteArrayList2 = this.A3;
            if (copyOnWriteArrayList2 != null) {
                Iterator<k> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().i(this, num.intValue());
                }
            }
        }
        this.f45016j4.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        int childCount = getChildCount();
        this.f45002e4.a();
        this.f45040w = true;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            sparseArray.put(childAt.getId(), this.f45017k.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iM = this.f44993a.m();
        if (iM != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                o oVar = this.f45017k.get(getChildAt(i12));
                if (oVar != null) {
                    oVar.U(iM);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f45017k.size()];
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            o oVar2 = this.f45017k.get(getChildAt(i14));
            if (oVar2.k() != -1) {
                sparseBooleanArray.put(oVar2.k(), true);
                iArr[i13] = oVar2.k();
                i13++;
            }
        }
        if (this.f45044z3 != null) {
            for (int i15 = 0; i15 < i13; i15++) {
                o oVar3 = this.f45017k.get(findViewById(iArr[i15]));
                if (oVar3 != null) {
                    this.f44993a.z(oVar3);
                }
            }
            Iterator<p> it = this.f45044z3.iterator();
            while (it.hasNext()) {
                it.next().b(this, this.f45017k);
            }
            for (int i16 = 0; i16 < i13; i16++) {
                o oVar4 = this.f45017k.get(findViewById(iArr[i16]));
                if (oVar4 != null) {
                    oVar4.a0(width, height, this.f45021m, getNanoTime());
                }
            }
        } else {
            for (int i17 = 0; i17 < i13; i17++) {
                o oVar5 = this.f45017k.get(findViewById(iArr[i17]));
                if (oVar5 != null) {
                    this.f44993a.z(oVar5);
                    oVar5.a0(width, height, this.f45021m, getNanoTime());
                }
            }
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            o oVar6 = this.f45017k.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && oVar6 != null) {
                this.f44993a.z(oVar6);
                oVar6.a0(width, height, this.f45021m, getNanoTime());
            }
        }
        float fN = this.f44993a.N();
        if (fN != 0.0f) {
            boolean z10 = ((double) fN) < 0.0d;
            float fAbs = Math.abs(fN);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i19 = 0; i19 < childCount; i19++) {
                o oVar7 = this.f45017k.get(getChildAt(i19));
                if (!Float.isNaN(oVar7.f45334m)) {
                    for (int i20 = 0; i20 < childCount; i20++) {
                        o oVar8 = this.f45017k.get(getChildAt(i20));
                        if (!Float.isNaN(oVar8.f45334m)) {
                            fMin = Math.min(fMin, oVar8.f45334m);
                            fMax = Math.max(fMax, oVar8.f45334m);
                        }
                    }
                    while (i10 < childCount) {
                        o oVar9 = this.f45017k.get(getChildAt(i10));
                        if (!Float.isNaN(oVar9.f45334m)) {
                            oVar9.f45336o = 1.0f / (1.0f - fAbs);
                            if (z10) {
                                oVar9.f45335n = fAbs - (((fMax - oVar9.f45334m) / (fMax - fMin)) * fAbs);
                            } else {
                                oVar9.f45335n = fAbs - (((oVar9.f45334m - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i10++;
                    }
                    return;
                }
                float fT = oVar7.t();
                float fU = oVar7.u();
                float f10 = z10 ? fU - fT : fU + fT;
                fMin2 = Math.min(fMin2, f10);
                fMax2 = Math.max(fMax2, f10);
            }
            while (i10 < childCount) {
                o oVar10 = this.f45017k.get(getChildAt(i10));
                float fT2 = oVar10.t();
                float fU2 = oVar10.u();
                float f11 = z10 ? fU2 - fT2 : fU2 + fT2;
                oVar10.f45336o = 1.0f / (1.0f - fAbs);
                oVar10.f45335n = fAbs - (((f11 - fMin2) * fAbs) / (fMax2 - fMin2));
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect O0(androidx.constraintlayout.core.widgets.e eVar) {
        this.f44996b4.top = eVar.p0();
        this.f44996b4.left = eVar.o0();
        Rect rect = this.f44996b4;
        int iM0 = eVar.m0();
        Rect rect2 = this.f44996b4;
        rect.right = iM0 + rect2.left;
        int iD = eVar.D();
        Rect rect3 = this.f44996b4;
        rect2.bottom = iD + rect3.top;
        return rect3;
    }

    private boolean X(View view, MotionEvent motionEvent, float f10, float f11) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f10, f11);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f10, -f11);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f10, f11);
        if (this.f45013i4 == null) {
            this.f45013i4 = new Matrix();
        }
        matrix.invert(this.f45013i4);
        motionEventObtain.transform(this.f45013i4);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    private void Y() {
        t tVar = this.f44993a;
        if (tVar == null) {
            return;
        }
        int iO = tVar.O();
        t tVar2 = this.f44993a;
        Z(iO, tVar2.o(tVar2.O()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (t.b bVar : this.f44993a.s()) {
            t.b bVar2 = this.f44993a.f45389c;
            a0(bVar);
            int I = bVar.I();
            int iB = bVar.B();
            androidx.constraintlayout.motion.widget.c.i(getContext(), I);
            androidx.constraintlayout.motion.widget.c.i(getContext(), iB);
            sparseIntArray.get(I);
            sparseIntArray2.get(iB);
            sparseIntArray.put(I, iB);
            sparseIntArray2.put(iB, I);
            this.f44993a.o(I);
            this.f44993a.o(iB);
        }
    }

    private void Z(int i10, androidx.constraintlayout.widget.f fVar) {
        androidx.constraintlayout.motion.widget.c.i(getContext(), i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (fVar.k0(childAt.getId()) == null) {
                androidx.constraintlayout.motion.widget.c.k(childAt);
            }
        }
        int[] iArrO0 = fVar.o0();
        for (int i12 = 0; i12 < iArrO0.length; i12++) {
            int i13 = iArrO0[i12];
            androidx.constraintlayout.motion.widget.c.i(getContext(), i13);
            findViewById(iArrO0[i12]);
            fVar.n0(i13);
            fVar.v0(i13);
        }
    }

    private void a0(t.b bVar) {
        bVar.I();
        bVar.B();
    }

    private void c0() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            o oVar = this.f45017k.get(childAt);
            if (oVar != null) {
                oVar.V(childAt);
            }
        }
    }

    @e.a({"LogConditional"})
    private void d0() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            androidx.constraintlayout.motion.widget.c.g();
            androidx.constraintlayout.motion.widget.c.k(this);
            androidx.constraintlayout.motion.widget.c.i(getContext(), this.f45003f);
            androidx.constraintlayout.motion.widget.c.k(childAt);
            childAt.getLeft();
            childAt.getTop();
        }
    }

    private static boolean d1(float f10, float f11, float f12) {
        boolean z10 = true & false;
        if (f10 > 0.0f) {
            float f13 = f10 / f12;
            return f11 + ((f10 * f13) - (((f12 * f13) * f13) / 2.0f)) > 1.0f;
        }
        float f14 = (-f10) / f12;
        return f11 + ((f10 * f14) + (((f12 * f14) * f14) / 2.0f)) < 0.0f;
    }

    private void j0() {
        boolean z10;
        float fSignum = Math.signum(this.f45035t - this.f45025o);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f44995b;
        float interpolation = this.f45025o + (!(interpolator instanceof androidx.constraintlayout.motion.utils.b) ? (((nanoTime - this.f45033s) * fSignum) * 1.0E-9f) / this.f45021m : 0.0f);
        if (this.f45038v) {
            interpolation = this.f45035t;
        }
        if ((fSignum <= 0.0f || interpolation < this.f45035t) && (fSignum > 0.0f || interpolation > this.f45035t)) {
            z10 = false;
        } else {
            interpolation = this.f45035t;
            z10 = true;
        }
        if (interpolator != null && !z10) {
            interpolation = this.f45012i3 ? interpolator.getInterpolation((nanoTime - this.f45019l) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f45035t) || (fSignum <= 0.0f && interpolation <= this.f45035t)) {
            interpolation = this.f45035t;
        }
        this.O3 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f44997c;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        float f10 = interpolation;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            o oVar = this.f45017k.get(childAt);
            if (oVar != null) {
                oVar.L(childAt, f10, nanoTime2, this.P3);
            }
        }
        if (this.H3) {
            requestLayout();
        }
    }

    private void k0() {
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if ((this.f45028p1 == null && ((copyOnWriteArrayList = this.A3) == null || copyOnWriteArrayList.isEmpty())) || this.F3 == this.f45023n) {
            return;
        }
        if (this.E3 != -1) {
            m0();
            this.G3 = true;
        }
        this.E3 = -1;
        float f10 = this.f45023n;
        this.F3 = f10;
        k kVar = this.f45028p1;
        if (kVar != null) {
            kVar.g(this, this.f45001e, this.f45005g, f10);
        }
        CopyOnWriteArrayList<k> copyOnWriteArrayList2 = this.A3;
        if (copyOnWriteArrayList2 != null) {
            Iterator<k> it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                it.next().g(this, this.f45001e, this.f45005g, this.f45023n);
            }
        }
        this.G3 = true;
    }

    private void m0() {
        k kVar = this.f45028p1;
        if (kVar != null) {
            kVar.j(this, this.f45001e, this.f45005g);
        }
        CopyOnWriteArrayList<k> copyOnWriteArrayList = this.A3;
        if (copyOnWriteArrayList != null) {
            Iterator<k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().j(this, this.f45001e, this.f45005g);
            }
        }
    }

    private boolean v0(float f10, float f11, View view, MotionEvent motionEvent) {
        boolean z10;
        if (!(view instanceof ViewGroup)) {
            z10 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z10 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (v0((childAt.getLeft() + f10) - view.getScrollX(), (childAt.getTop() + f11) - view.getScrollY(), childAt, motionEvent)) {
                z10 = true;
                break;
            }
            childCount--;
        }
        if (!z10) {
            this.f45007g4.set(f10, f11, (view.getRight() + f10) - view.getLeft(), (view.getBottom() + f11) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.f45007g4.contains(motionEvent.getX(), motionEvent.getY())) && X(view, motionEvent, -f10, -f11)) {
                return true;
            }
        }
        return z10;
    }

    private void w0(AttributeSet attributeSet) {
        t tVar;
        f44987u4 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.c.Gd);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.j.c.Jd) {
                    this.f44993a = new t(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == androidx.constraintlayout.widget.j.c.Id) {
                    this.f45003f = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == androidx.constraintlayout.widget.j.c.Ld) {
                    this.f45035t = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f45040w = true;
                } else if (index == androidx.constraintlayout.widget.j.c.Hd) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == androidx.constraintlayout.widget.j.c.Md) {
                    if (this.f45006g3 == 0) {
                        this.f45006g3 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == androidx.constraintlayout.widget.j.c.Kd) {
                    this.f45006g3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z10) {
                this.f44993a = null;
            }
        }
        if (this.f45006g3 != 0) {
            Y();
        }
        if (this.f45003f == -1 && (tVar = this.f44993a) != null) {
            this.f45003f = tVar.O();
            this.f45001e = this.f44993a.O();
            this.f45005g = this.f44993a.u();
        }
    }

    public boolean A0(int i10) {
        t tVar = this.f44993a;
        if (tVar != null) {
            return tVar.V(i10);
        }
        return false;
    }

    public void B0(int i10) {
        if (!isAttachedToWindow()) {
            this.f45003f = i10;
        }
        if (this.f45001e == i10) {
            setProgress(0.0f);
        } else if (this.f45005g == i10) {
            setProgress(1.0f);
        } else {
            M0(i10, i10);
        }
    }

    int C0(String str) {
        t tVar = this.f44993a;
        if (tVar == null) {
            return 0;
        }
        return tVar.X(str);
    }

    protected h D0() {
        return i.i();
    }

    void E0() {
        t tVar = this.f44993a;
        if (tVar == null) {
            return;
        }
        if (tVar.i(this, this.f45003f)) {
            requestLayout();
            return;
        }
        int i10 = this.f45003f;
        if (i10 != -1) {
            this.f44993a.f(this, i10);
        }
        if (this.f44993a.s0()) {
            this.f44993a.q0();
        }
    }

    @Deprecated
    public void G0() {
        H0();
    }

    public void H0() {
        this.f45002e4.k();
        invalidate();
    }

    public boolean I0(k kVar) {
        CopyOnWriteArrayList<k> copyOnWriteArrayList = this.A3;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(kVar);
    }

    public void J0(int i10, int i11) {
        int i12 = 1;
        this.V3 = true;
        this.Y3 = getWidth();
        this.Z3 = getHeight();
        int rotation = getDisplay().getRotation();
        if ((rotation + 1) % 4 <= (this.f44994a4 + 1) % 4) {
            i12 = 2;
        }
        this.W3 = i12;
        this.f44994a4 = rotation;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            androidx.constraintlayout.motion.utils.e eVar = this.X3.get(childAt);
            if (eVar == null) {
                eVar = new androidx.constraintlayout.motion.utils.e();
                this.X3.put(childAt, eVar);
            }
            eVar.a(childAt);
        }
        this.f45001e = -1;
        this.f45005g = i10;
        this.f44993a.o0(-1, i10);
        this.f45002e4.h(this.mLayoutWidget, null, this.f44993a.o(this.f45005g));
        this.f45023n = 0.0f;
        this.f45025o = 0.0f;
        invalidate();
        S0(new b());
        if (i11 > 0) {
            this.f45021m = i11 / 1000.0f;
        }
    }

    public void K0(int i10) {
        if (getCurrentState() == -1) {
            V0(i10);
            return;
        }
        int[] iArr = this.T3;
        if (iArr == null) {
            this.T3 = new int[4];
        } else if (iArr.length <= this.U3) {
            this.T3 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.T3;
        int i11 = this.U3;
        this.U3 = i11 + 1;
        iArr2[i11] = i10;
    }

    public void L0(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.R3 == null) {
                this.R3 = new j();
            }
            this.R3.e(f10);
            this.R3.h(f11);
            return;
        }
        setProgress(f10);
        setState(l.MOVING);
        this.f44999d = f11;
        if (f11 != 0.0f) {
            V(f11 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f10 == 0.0f || f10 == 1.0f) {
                return;
            }
            V(f10 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void M0(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.R3 == null) {
                this.R3 = new j();
            }
            this.R3.f(i10);
            this.R3.d(i11);
            return;
        }
        t tVar = this.f44993a;
        if (tVar != null) {
            this.f45001e = i10;
            this.f45005g = i11;
            tVar.o0(i10, i11);
            this.f45002e4.h(this.mLayoutWidget, this.f44993a.o(i10), this.f44993a.o(i11));
            H0();
            this.f45025o = 0.0f;
            T0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    public void P0(int i10, float f10, float f11) {
        float f12;
        if (this.f44993a == null || this.f45025o == f10) {
            return;
        }
        this.f45012i3 = true;
        this.f45019l = getNanoTime();
        this.f45021m = this.f44993a.t() / 1000.0f;
        this.f45035t = f10;
        this.f45040w = true;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (i10 != 1 || i10 == 7) {
                f12 = 0.0f;
            } else {
                if (i10 == 2 || i10 == 6) {
                    f10 = 1.0f;
                }
                f12 = f10;
            }
            if (this.f44993a.n() == 0) {
                this.f45015j3.b(this.f45025o, f12, f11, this.f45021m, this.f44993a.C(), this.f44993a.D());
            } else {
                this.f45015j3.f(this.f45025o, f12, f11, this.f44993a.K(), this.f44993a.L(), this.f44993a.J(), this.f44993a.M(), this.f44993a.I());
            }
            int i11 = this.f45003f;
            this.f45035t = f12;
            this.f45003f = i11;
            this.f44995b = this.f45015j3;
        } else if (i10 == 4) {
            this.f45018k3.b(f11, this.f45025o, this.f44993a.C());
            this.f44995b = this.f45018k3;
        } else if (i10 != 5) {
            if (i10 == 6 || i10 == 7) {
                if (i10 != 1) {
                    f12 = 0.0f;
                } else {
                    f12 = 0.0f;
                }
                if (this.f44993a.n() == 0) {
                    this.f45015j3.b(this.f45025o, f12, f11, this.f45021m, this.f44993a.C(), this.f44993a.D());
                } else {
                    this.f45015j3.f(this.f45025o, f12, f11, this.f44993a.K(), this.f44993a.L(), this.f44993a.J(), this.f44993a.M(), this.f44993a.I());
                }
                int i12 = this.f45003f;
                this.f45035t = f12;
                this.f45003f = i12;
                this.f44995b = this.f45015j3;
            }
        } else if (d1(f11, this.f45025o, this.f44993a.C())) {
            this.f45018k3.b(f11, this.f45025o, this.f44993a.C());
            this.f44995b = this.f45018k3;
        } else {
            this.f45015j3.b(this.f45025o, f10, f11, this.f45021m, this.f44993a.C(), this.f44993a.D());
            this.f44999d = 0.0f;
            int i13 = this.f45003f;
            this.f45035t = f10;
            this.f45003f = i13;
            this.f44995b = this.f45015j3;
        }
        this.f45038v = false;
        this.f45019l = getNanoTime();
        invalidate();
    }

    public void Q0(float f10, float f11) {
        if (this.f44993a == null || this.f45025o == f10) {
            return;
        }
        this.f45012i3 = true;
        this.f45019l = getNanoTime();
        this.f45021m = this.f44993a.t() / 1000.0f;
        this.f45035t = f10;
        this.f45040w = true;
        this.f45015j3.f(this.f45025o, f10, f11, this.f44993a.K(), this.f44993a.L(), this.f44993a.J(), this.f44993a.M(), this.f44993a.I());
        int i10 = this.f45003f;
        this.f45035t = f10;
        this.f45003f = i10;
        this.f44995b = this.f45015j3;
        this.f45038v = false;
        this.f45019l = getNanoTime();
        invalidate();
    }

    public void R0() {
        V(1.0f);
        this.S3 = null;
    }

    public void S0(Runnable runnable) {
        V(1.0f);
        this.S3 = runnable;
    }

    public void T0() {
        V(0.0f);
    }

    public void U(k kVar) {
        if (this.A3 == null) {
            this.A3 = new CopyOnWriteArrayList<>();
        }
        this.A3.add(kVar);
    }

    public void U0(Runnable runnable) {
        V(0.0f);
        this.S3 = runnable;
    }

    void V(float f10) {
        t tVar = this.f44993a;
        if (tVar == null) {
            return;
        }
        float f11 = this.f45025o;
        float f12 = this.f45023n;
        if (f11 != f12 && this.f45038v) {
            this.f45025o = f12;
        }
        float f13 = this.f45025o;
        if (f13 == f10) {
            return;
        }
        this.f45012i3 = false;
        this.f45035t = f10;
        this.f45021m = tVar.t() / 1000.0f;
        setProgress(this.f45035t);
        this.f44995b = null;
        this.f44997c = this.f44993a.x();
        this.f45038v = false;
        this.f45019l = getNanoTime();
        this.f45040w = true;
        this.f45023n = f13;
        this.f45025o = f13;
        invalidate();
    }

    public void V0(int i10) {
        if (isAttachedToWindow()) {
            X0(i10, -1, -1);
            return;
        }
        if (this.R3 == null) {
            this.R3 = new j();
        }
        this.R3.d(i10);
    }

    public boolean W(int i10, o oVar) {
        t tVar = this.f44993a;
        if (tVar != null) {
            return tVar.h(i10, oVar);
        }
        return false;
    }

    public void W0(int i10, int i11) {
        if (isAttachedToWindow()) {
            Y0(i10, -1, -1, i11);
            return;
        }
        if (this.R3 == null) {
            this.R3 = new j();
        }
        this.R3.d(i10);
    }

    public void X0(int i10, int i11, int i12) {
        Y0(i10, i11, i12, -1);
    }

    public void Y0(int i10, int i11, int i12, int i13) {
        androidx.constraintlayout.widget.m mVar;
        int iA;
        t tVar = this.f44993a;
        if (tVar != null && (mVar = tVar.f45388b) != null && (iA = mVar.a(this.f45003f, i10, i11, i12)) != -1) {
            i10 = iA;
        }
        int i14 = this.f45003f;
        if (i14 == i10) {
            return;
        }
        if (this.f45001e == i10) {
            V(0.0f);
            if (i13 > 0) {
                this.f45021m = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f45005g == i10) {
            V(1.0f);
            if (i13 > 0) {
                this.f45021m = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f45005g = i10;
        if (i14 != -1) {
            M0(i14, i10);
            V(1.0f);
            this.f45025o = 0.0f;
            R0();
            if (i13 > 0) {
                this.f45021m = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f45012i3 = false;
        this.f45035t = 1.0f;
        this.f45023n = 0.0f;
        this.f45025o = 0.0f;
        this.f45033s = getNanoTime();
        this.f45019l = getNanoTime();
        this.f45038v = false;
        this.f44995b = null;
        if (i13 == -1) {
            this.f45021m = this.f44993a.t() / 1000.0f;
        }
        this.f45001e = -1;
        this.f44993a.o0(-1, this.f45005g);
        SparseArray sparseArray = new SparseArray();
        if (i13 == 0) {
            this.f45021m = this.f44993a.t() / 1000.0f;
        } else if (i13 > 0) {
            this.f45021m = i13 / 1000.0f;
        }
        int childCount = getChildCount();
        this.f45017k.clear();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            this.f45017k.put(childAt, new o(childAt));
            sparseArray.put(childAt.getId(), this.f45017k.get(childAt));
        }
        this.f45040w = true;
        this.f45002e4.h(this.mLayoutWidget, null, this.f44993a.o(i10));
        H0();
        this.f45002e4.a();
        c0();
        int width = getWidth();
        int height = getHeight();
        if (this.f45044z3 != null) {
            for (int i16 = 0; i16 < childCount; i16++) {
                o oVar = this.f45017k.get(getChildAt(i16));
                if (oVar != null) {
                    this.f44993a.z(oVar);
                }
            }
            Iterator<p> it = this.f45044z3.iterator();
            while (it.hasNext()) {
                it.next().b(this, this.f45017k);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                o oVar2 = this.f45017k.get(getChildAt(i17));
                if (oVar2 != null) {
                    oVar2.a0(width, height, this.f45021m, getNanoTime());
                }
            }
        } else {
            for (int i18 = 0; i18 < childCount; i18++) {
                o oVar3 = this.f45017k.get(getChildAt(i18));
                if (oVar3 != null) {
                    this.f44993a.z(oVar3);
                    oVar3.a0(width, height, this.f45021m, getNanoTime());
                }
            }
        }
        float fN = this.f44993a.N();
        if (fN != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i19 = 0; i19 < childCount; i19++) {
                o oVar4 = this.f45017k.get(getChildAt(i19));
                float fU = oVar4.u() + oVar4.t();
                fMin = Math.min(fMin, fU);
                fMax = Math.max(fMax, fU);
            }
            for (int i20 = 0; i20 < childCount; i20++) {
                o oVar5 = this.f45017k.get(getChildAt(i20));
                float fT = oVar5.t();
                float fU2 = oVar5.u();
                oVar5.f45336o = 1.0f / (1.0f - fN);
                oVar5.f45335n = fN - ((((fT + fU2) - fMin) * fN) / (fMax - fMin));
            }
        }
        this.f45023n = 0.0f;
        this.f45025o = 0.0f;
        this.f45040w = true;
        invalidate();
    }

    public void Z0() {
        this.f45002e4.h(this.mLayoutWidget, this.f44993a.o(this.f45001e), this.f44993a.o(this.f45005g));
        H0();
    }

    public void a1(int i10, androidx.constraintlayout.widget.f fVar) {
        t tVar = this.f44993a;
        if (tVar != null) {
            tVar.k0(i10, fVar);
        }
        Z0();
        if (this.f45003f == i10) {
            fVar.r(this);
        }
    }

    public androidx.constraintlayout.widget.f b0(int i10) {
        t tVar = this.f44993a;
        if (tVar == null) {
            return null;
        }
        androidx.constraintlayout.widget.f fVarO = tVar.o(i10);
        androidx.constraintlayout.widget.f fVar = new androidx.constraintlayout.widget.f();
        fVar.I(fVarO);
        return fVar;
    }

    public void b1(int i10, androidx.constraintlayout.widget.f fVar, int i11) {
        if (this.f44993a != null && this.f45003f == i10) {
            a1(androidx.constraintlayout.widget.j.b.f46307j1, p0(i10));
            setState(androidx.constraintlayout.widget.j.b.f46307j1, -1, -1);
            a1(i10, fVar);
            t.b bVar = new t.b(-1, this.f44993a, androidx.constraintlayout.widget.j.b.f46307j1, i10);
            bVar.O(i11);
            setTransition(bVar);
            R0();
        }
    }

    public void c1(int i10, View... viewArr) {
        t tVar = this.f44993a;
        if (tVar != null) {
            tVar.u0(i10, viewArr);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        a0 a0Var;
        ArrayList<p> arrayList = this.f45044z3;
        if (arrayList != null) {
            Iterator<p> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(canvas);
            }
        }
        i0(false);
        t tVar = this.f44993a;
        if (tVar != null && (a0Var = tVar.f45404r) != null) {
            a0Var.d();
        }
        super.dispatchDraw(canvas);
        if (this.f44993a == null) {
            return;
        }
        if ((this.f45006g3 & 1) == 1 && !isInEditMode()) {
            this.B3++;
            long nanoTime = getNanoTime();
            long j10 = this.C3;
            if (j10 != -1) {
                long j11 = nanoTime - j10;
                if (j11 > 200000000) {
                    this.D3 = ((int) ((this.B3 / (j11 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.B3 = 0;
                    this.C3 = nanoTime;
                }
            } else {
                this.C3 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            String str = this.D3 + " fps " + androidx.constraintlayout.motion.widget.c.l(this, this.f45001e) + " -> ";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(androidx.constraintlayout.motion.widget.c.l(this, this.f45005g));
            sb2.append(" (progress: ");
            sb2.append(progress);
            sb2.append(" ) state=");
            int i10 = this.f45003f;
            sb2.append(i10 == -1 ? "undefined" : androidx.constraintlayout.motion.widget.c.l(this, i10));
            String string = sb2.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f45006g3 > 1) {
            if (this.f45009h3 == null) {
                this.f45009h3 = new f();
            }
            this.f45009h3.a(canvas, this.f45017k, this.f44993a.t(), this.f45006g3);
        }
        ArrayList<p> arrayList2 = this.f45044z3;
        if (arrayList2 != null) {
            Iterator<p> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().h(canvas);
            }
        }
    }

    void e0(boolean z10) {
        t tVar = this.f44993a;
        if (tVar == null) {
            return;
        }
        tVar.k(z10);
    }

    public void f0(int i10, boolean z10) {
        t.b bVarT0 = t0(i10);
        if (z10) {
            bVarT0.P(true);
            return;
        }
        t tVar = this.f44993a;
        if (bVarT0 == tVar.f45389c) {
            for (t.b bVar : tVar.R(this.f45003f)) {
                if (bVar.K()) {
                    this.f44993a.f45389c = bVar;
                    break;
                }
            }
        }
        bVarT0.P(false);
    }

    public void g0(int i10, boolean z10) {
        t tVar = this.f44993a;
        if (tVar != null) {
            tVar.l(i10, z10);
        }
    }

    @d0
    public int[] getConstraintSetIds() {
        t tVar = this.f44993a;
        if (tVar == null) {
            return null;
        }
        return tVar.r();
    }

    public int getCurrentState() {
        return this.f45003f;
    }

    public ArrayList<t.b> getDefinedTransitions() {
        t tVar = this.f44993a;
        if (tVar == null) {
            return null;
        }
        return tVar.s();
    }

    public androidx.constraintlayout.motion.widget.d getDesignTool() {
        if (this.f45020l3 == null) {
            this.f45020l3 = new androidx.constraintlayout.motion.widget.d(this);
        }
        return this.f45020l3;
    }

    public int getEndState() {
        return this.f45005g;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f45025o;
    }

    public t getScene() {
        return this.f44993a;
    }

    public int getStartState() {
        return this.f45001e;
    }

    public float getTargetPosition() {
        return this.f45035t;
    }

    public Bundle getTransitionState() {
        if (this.R3 == null) {
            this.R3 = new j();
        }
        this.R3.c();
        return this.R3.b();
    }

    public long getTransitionTimeMs() {
        t tVar = this.f44993a;
        if (tVar != null) {
            this.f45021m = tVar.t() / 1000.0f;
        }
        return (long) (this.f45021m * 1000.0f);
    }

    public float getVelocity() {
        return this.f44999d;
    }

    void h0(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            o oVar = this.f45017k.get(getChildAt(i10));
            if (oVar != null) {
                oVar.i(z10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01be  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x0220  */
    /* JADX WARN: Code duplicated, block: B:180:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v52 float) = (r3v51 float), (r3v53 float), (r3v53 float) binds: [B:47:0x00ae, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0112  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    /* JADX WARN: Code duplicated, block: B:93:0x015d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0174  */
    /* JADX WARN: Code duplicated, block: B:98:0x0184  */
    void i0(boolean z10) {
        boolean z11;
        char c10;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        o oVar;
        boolean z12;
        if (this.f45033s == -1) {
            this.f45033s = getNanoTime();
        }
        float f10 = this.f45025o;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f45003f = -1;
        }
        boolean z13 = false;
        if (this.f45041w3 || (this.f45040w && (z10 || this.f45035t != f10))) {
            float fSignum = Math.signum(this.f45035t - f10);
            long nanoTime2 = getNanoTime();
            Interpolator interpolator3 = this.f44995b;
            float f11 = !(interpolator3 instanceof r) ? (((nanoTime2 - this.f45033s) * fSignum) * 1.0E-9f) / this.f45021m : 0.0f;
            float f12 = this.f45025o + f11;
            if (this.f45038v) {
                f12 = this.f45035t;
            }
            if ((fSignum <= 0.0f || f12 < this.f45035t) && (fSignum > 0.0f || f12 > this.f45035t)) {
                z11 = false;
            } else {
                f12 = this.f45035t;
                this.f45040w = false;
                z11 = true;
            }
            this.f45025o = f12;
            this.f45023n = f12;
            this.f45033s = nanoTime2;
            if (interpolator3 == null || z11) {
                this.f44999d = f11;
            } else {
                if (this.f45012i3) {
                    float interpolation2 = interpolator3.getInterpolation((nanoTime2 - this.f45019l) * 1.0E-9f);
                    Interpolator interpolator4 = this.f44995b;
                    androidx.constraintlayout.motion.utils.b bVar = this.f45015j3;
                    c10 = interpolator4 == bVar ? bVar.e() ? (char) 2 : (char) 1 : (char) 0;
                    this.f45025o = interpolation2;
                    this.f45033s = nanoTime2;
                    Interpolator interpolator5 = this.f44995b;
                    if (interpolator5 instanceof r) {
                        float fA = ((r) interpolator5).a();
                        this.f44999d = fA;
                        if (Math.abs(fA) * this.f45021m <= D4 && c10 == 2) {
                            this.f45040w = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.f45025o = 1.0f;
                            this.f45040w = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f12 = interpolation2;
                        } else {
                            this.f45025o = 0.0f;
                            this.f45040w = false;
                            f12 = 0.0f;
                        }
                    } else {
                        f12 = interpolation2;
                    }
                } else {
                    float interpolation3 = interpolator3.getInterpolation(f12);
                    Interpolator interpolator6 = this.f44995b;
                    if (interpolator6 instanceof r) {
                        this.f44999d = ((r) interpolator6).a();
                    } else {
                        this.f44999d = ((interpolator6.getInterpolation(f12 + f11) - interpolation3) * fSignum) / f11;
                    }
                    f12 = interpolation3;
                }
                if (Math.abs(this.f44999d) > D4) {
                    setState(l.MOVING);
                }
                if (c10 != 1) {
                    if ((fSignum <= 0.0f && f12 >= this.f45035t) || (fSignum <= 0.0f && f12 <= this.f45035t)) {
                        f12 = this.f45035t;
                        this.f45040w = false;
                    }
                    if (f12 < 1.0f || f12 <= 0.0f) {
                        this.f45040w = false;
                        setState(l.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.f45041w3 = false;
                nanoTime = getNanoTime();
                this.O3 = f12;
                interpolator = this.f44997c;
                if (interpolator == null) {
                    interpolation = f12;
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                }
                interpolator2 = this.f44997c;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f45021m) + f12);
                    this.f44999d = interpolation4;
                    this.f44999d = interpolation4 - this.f44997c.getInterpolation(f12);
                }
                for (i10 = 0; i10 < childCount; i10++) {
                    childAt = getChildAt(i10);
                    oVar = this.f45017k.get(childAt);
                    if (oVar != null) {
                        this.f45041w3 |= oVar.L(childAt, interpolation, nanoTime, this.P3);
                    }
                }
                boolean z14 = (fSignum <= 0.0f && f12 >= this.f45035t) || (fSignum <= 0.0f && f12 <= this.f45035t);
                if (!this.f45041w3 && !this.f45040w && z14) {
                    setState(l.FINISHED);
                }
                if (this.H3) {
                    requestLayout();
                }
                this.f45041w3 = (!z14) | this.f45041w3;
                if (f12 <= 0.0f && (i13 = this.f45001e) != -1 && this.f45003f != i13) {
                    this.f45003f = i13;
                    this.f44993a.o(i13).p(this);
                    setState(l.FINISHED);
                    z13 = true;
                }
                if (f12 >= 1.0d) {
                    i11 = this.f45003f;
                    i12 = this.f45005g;
                    if (i11 != i12) {
                        this.f45003f = i12;
                        this.f44993a.o(i12).p(this);
                        setState(l.FINISHED);
                        z13 = true;
                    }
                }
                if (!this.f45041w3 || this.f45040w) {
                    invalidate();
                } else if ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f)) {
                    setState(l.FINISHED);
                }
                if (!this.f45041w3 && !this.f45040w && ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f))) {
                    E0();
                }
            }
            c10 = 0;
            if (Math.abs(this.f44999d) > D4) {
                setState(l.MOVING);
            }
            if (c10 != 1) {
                if (fSignum <= 0.0f) {
                    f12 = this.f45035t;
                    this.f45040w = false;
                } else {
                    f12 = this.f45035t;
                    this.f45040w = false;
                }
                if (f12 < 1.0f) {
                    this.f45040w = false;
                    setState(l.FINISHED);
                } else {
                    this.f45040w = false;
                    setState(l.FINISHED);
                }
            }
            childCount = getChildCount();
            this.f45041w3 = false;
            nanoTime = getNanoTime();
            this.O3 = f12;
            interpolator = this.f44997c;
            if (interpolator == null) {
                interpolation = f12;
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            interpolator2 = this.f44997c;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f45021m) + f12);
                this.f44999d = interpolation5;
                this.f44999d = interpolation5 - this.f44997c.getInterpolation(f12);
            }
            while (i10 < childCount) {
                childAt = getChildAt(i10);
                oVar = this.f45017k.get(childAt);
                if (oVar != null) {
                    this.f45041w3 |= oVar.L(childAt, interpolation, nanoTime, this.P3);
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.f45041w3) {
                setState(l.FINISHED);
            }
            if (this.H3) {
                requestLayout();
            }
            this.f45041w3 = (!z14) | this.f45041w3;
            if (f12 <= 0.0f) {
                this.f45003f = i13;
                this.f44993a.o(i13).p(this);
                setState(l.FINISHED);
                z13 = true;
            }
            if (f12 >= 1.0d) {
                i11 = this.f45003f;
                i12 = this.f45005g;
                if (i11 != i12) {
                    this.f45003f = i12;
                    this.f44993a.o(i12).p(this);
                    setState(l.FINISHED);
                    z13 = true;
                }
            }
            if (this.f45041w3) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f45041w3) {
                E0();
            }
        }
        float f13 = this.f45025o;
        if (f13 < 1.0f) {
            if (f13 <= 0.0f) {
                int i14 = this.f45003f;
                int i15 = this.f45001e;
                z12 = i14 == i15 ? z13 : true;
                this.f45003f = i15;
            }
            this.f45004f4 |= z13;
            if (z13 && !this.Q3) {
                requestLayout();
            }
            this.f45023n = this.f45025o;
        }
        int i16 = this.f45003f;
        int i17 = this.f45005g;
        z12 = i16 == i17 ? z13 : true;
        this.f45003f = i17;
        z13 = z12;
        this.f45004f4 |= z13;
        if (z13) {
            requestLayout();
        }
        this.f45023n = this.f45025o;
    }

    @Override // androidx.core.view.x0
    public void l(@NonNull View view, @NonNull View view2, int i10, int i11) {
        this.f45037u3 = getNanoTime();
        this.f45039v3 = 0.0f;
        this.f45034s3 = 0.0f;
        this.f45036t3 = 0.0f;
    }

    protected void l0() {
        int iIntValue;
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if ((this.f45028p1 != null || ((copyOnWriteArrayList = this.A3) != null && !copyOnWriteArrayList.isEmpty())) && this.E3 == -1) {
            this.E3 = this.f45003f;
            if (this.f45016j4.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.f45016j4;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i10 = this.f45003f;
            if (iIntValue != i10 && i10 != -1) {
                this.f45016j4.add(Integer.valueOf(i10));
            }
        }
        F0();
        Runnable runnable = this.S3;
        if (runnable != null) {
            runnable.run();
            this.S3 = null;
        }
        int[] iArr = this.T3;
        if (iArr == null || this.U3 <= 0) {
            return;
        }
        V0(iArr[0]);
        int[] iArr2 = this.T3;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.U3--;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i10) {
        t.b bVar;
        if (i10 == 0) {
            this.f44993a = null;
            return;
        }
        try {
            t tVar = new t(getContext(), this, i10);
            this.f44993a = tVar;
            if (this.f45003f == -1) {
                this.f45003f = tVar.O();
                this.f45001e = this.f44993a.O();
                this.f45005g = this.f44993a.u();
            }
            if (!isAttachedToWindow()) {
                this.f44993a = null;
                return;
            }
            try {
                Display display = getDisplay();
                this.f44994a4 = display == null ? 0 : display.getRotation();
                t tVar2 = this.f44993a;
                if (tVar2 != null) {
                    androidx.constraintlayout.widget.f fVarO = tVar2.o(this.f45003f);
                    this.f44993a.i0(this);
                    ArrayList<p> arrayList = this.f45044z3;
                    if (arrayList != null) {
                        Iterator<p> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().a(this);
                        }
                    }
                    if (fVarO != null) {
                        fVarO.r(this);
                    }
                    this.f45001e = this.f45003f;
                }
                E0();
                j jVar = this.R3;
                if (jVar != null) {
                    if (this.f44998c4) {
                        post(new a());
                        return;
                    } else {
                        jVar.a();
                        return;
                    }
                }
                t tVar3 = this.f44993a;
                if (tVar3 != null && (bVar = tVar3.f45389c) != null && bVar.z() == 4) {
                    R0();
                    setState(l.SETUP);
                    setState(l.MOVING);
                }
            } catch (Exception e10) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e10);
            }
        } catch (Exception e11) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e11);
        }
    }

    @Override // androidx.core.view.x0
    public void m(@NonNull View view, int i10) {
        t tVar = this.f44993a;
        if (tVar != null) {
            float f10 = this.f45039v3;
            if (f10 == 0.0f) {
                return;
            }
            tVar.f0(this.f45034s3 / f10, this.f45036t3 / f10);
        }
    }

    public void n0(int i10, boolean z10, float f10) {
        k kVar = this.f45028p1;
        if (kVar != null) {
            kVar.k(this, i10, z10, f10);
        }
        CopyOnWriteArrayList<k> copyOnWriteArrayList = this.A3;
        if (copyOnWriteArrayList != null) {
            Iterator<k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().k(this, i10, z10, f10);
            }
        }
    }

    @Override // androidx.core.view.x0
    public void o(@NonNull View view, int i10, int i11, int i12, int i13, int i14) {
    }

    void o0(int i10, float f10, float f11, float f12, float[] fArr) {
        HashMap<View, o> map = this.f45017k;
        View viewById = getViewById(i10);
        o oVar = map.get(viewById);
        if (oVar != null) {
            oVar.p(f10, f11, f12, fArr);
            float y10 = viewById.getY();
            this.H1 = f10;
            this.f45029p2 = y10;
            return;
        }
        if (viewById != null) {
            viewById.getContext().getResources().getResourceName(i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        t.b bVar;
        int i10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f44994a4 = display.getRotation();
        }
        t tVar = this.f44993a;
        if (tVar != null && (i10 = this.f45003f) != -1) {
            androidx.constraintlayout.widget.f fVarO = tVar.o(i10);
            this.f44993a.i0(this);
            ArrayList<p> arrayList = this.f45044z3;
            if (arrayList != null) {
                Iterator<p> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().a(this);
                }
            }
            if (fVarO != null) {
                fVarO.r(this);
            }
            this.f45001e = this.f45003f;
        }
        E0();
        j jVar = this.R3;
        if (jVar != null) {
            if (this.f44998c4) {
                post(new d());
                return;
            } else {
                jVar.a();
                return;
            }
        }
        t tVar2 = this.f44993a;
        if (tVar2 != null && (bVar = tVar2.f45389c) != null && bVar.z() == 4) {
            R0();
            setState(l.SETUP);
            setState(l.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        v vVarJ;
        int iS;
        RectF rectFR;
        t tVar = this.f44993a;
        if (tVar != null && this.f45014j) {
            a0 a0Var = tVar.f45404r;
            if (a0Var != null) {
                a0Var.l(motionEvent);
            }
            t.b bVar = this.f44993a.f45389c;
            if (bVar != null && bVar.K() && (vVarJ = bVar.J()) != null && ((motionEvent.getAction() != 0 || (rectFR = vVarJ.r(this, new RectF())) == null || rectFR.contains(motionEvent.getX(), motionEvent.getY())) && (iS = vVarJ.s()) != -1)) {
                View view = this.f45010h4;
                if (view == null || view.getId() != iS) {
                    this.f45010h4 = findViewById(iS);
                }
                View view2 = this.f45010h4;
                if (view2 != null) {
                    this.f45007g4.set(view2.getLeft(), this.f45010h4.getTop(), this.f45010h4.getRight(), this.f45010h4.getBottom());
                    if (this.f45007g4.contains(motionEvent.getX(), motionEvent.getY()) && !v0(this.f45010h4.getLeft(), this.f45010h4.getTop(), this.f45010h4, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.Q3 = true;
        try {
            if (this.f44993a == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                this.Q3 = false;
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.f45030p3 != i14 || this.f45031q3 != i15) {
                H0();
                i0(true);
            }
            this.f45030p3 = i14;
            this.f45031q3 = i15;
            this.f45024n3 = i14;
            this.f45026o3 = i15;
            this.Q3 = false;
        } catch (Throwable th2) {
            this.Q3 = false;
            throw th2;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f44993a == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        boolean z11 = (this.f45008h == i10 && this.f45011i == i11) ? false : true;
        if (this.f45004f4) {
            this.f45004f4 = false;
            E0();
            F0();
            z11 = true;
        }
        if (this.mDirtyHierarchy) {
            z11 = true;
        }
        this.f45008h = i10;
        this.f45011i = i11;
        int iO = this.f44993a.O();
        int iU = this.f44993a.u();
        if ((z11 || this.f45002e4.i(iO, iU)) && this.f45001e != -1) {
            super.onMeasure(i10, i11);
            this.f45002e4.h(this.mLayoutWidget, this.f44993a.o(iO), this.f44993a.o(iU));
            this.f45002e4.k();
            this.f45002e4.l(iO, iU);
        } else {
            if (z11) {
                super.onMeasure(i10, i11);
            }
            z10 = true;
        }
        if (this.H3 || z10) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iM0 = this.mLayoutWidget.m0() + getPaddingLeft() + getPaddingRight();
            int iD = this.mLayoutWidget.D() + paddingTop;
            int i12 = this.M3;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                int i13 = this.I3;
                iM0 = (int) (i13 + (this.O3 * (this.K3 - i13)));
                requestLayout();
            }
            int i14 = this.N3;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                int i15 = this.J3;
                iD = (int) (i15 + (this.O3 * (this.L3 - i15)));
                requestLayout();
            }
            setMeasuredDimension(iM0, iD);
        }
        j0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedFling(@NonNull View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedPreFling(@NonNull View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        t tVar = this.f44993a;
        if (tVar != null) {
            tVar.n0(isRtl());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        t tVar = this.f44993a;
        if (tVar == null || !this.f45014j || !tVar.s0()) {
            return super.onTouchEvent(motionEvent);
        }
        t.b bVar = this.f44993a.f45389c;
        if (bVar != null && !bVar.K()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f44993a.g0(motionEvent, getCurrentState(), this);
        if (this.f44993a.f45389c.L(4)) {
            return this.f44993a.f45389c.J().t();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof p) {
            p pVar = (p) view;
            if (this.A3 == null) {
                this.A3 = new CopyOnWriteArrayList<>();
            }
            this.A3.add(pVar);
            if (pVar.d()) {
                if (this.f45042x3 == null) {
                    this.f45042x3 = new ArrayList<>();
                }
                this.f45042x3.add(pVar);
            }
            if (pVar.e()) {
                if (this.f45043y3 == null) {
                    this.f45043y3 = new ArrayList<>();
                }
                this.f45043y3.add(pVar);
            }
            if (pVar.f()) {
                if (this.f45044z3 == null) {
                    this.f45044z3 = new ArrayList<>();
                }
                this.f45044z3.add(pVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<p> arrayList = this.f45042x3;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<p> arrayList2 = this.f45043y3;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public androidx.constraintlayout.widget.f p0(int i10) {
        t tVar = this.f44993a;
        if (tVar == null) {
            return null;
        }
        return tVar.o(i10);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void parseLayoutDescription(int i10) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.core.view.x0
    public void q(@NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        t.b bVar;
        v vVarJ;
        int iS;
        t tVar = this.f44993a;
        if (tVar == null || (bVar = tVar.f45389c) == null || !bVar.K()) {
            return;
        }
        int i13 = -1;
        if (!bVar.K() || (vVarJ = bVar.J()) == null || (iS = vVarJ.s()) == -1 || view.getId() == iS) {
            if (tVar.E()) {
                v vVarJ2 = bVar.J();
                if (vVarJ2 != null && (vVarJ2.f() & 4) != 0) {
                    i13 = i11;
                }
                float f10 = this.f45023n;
                if ((f10 == 1.0f || f10 == 0.0f) && view.canScrollVertically(i13)) {
                    return;
                }
            }
            if (bVar.J() != null && (bVar.J().f() & 1) != 0) {
                float fG = tVar.G(i10, i11);
                float f11 = this.f45025o;
                if ((f11 <= 0.0f && fG < 0.0f) || (f11 >= 1.0f && fG > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new c(view));
                    return;
                }
            }
            float f12 = this.f45023n;
            long nanoTime = getNanoTime();
            float f13 = i10;
            this.f45034s3 = f13;
            float f14 = i11;
            this.f45036t3 = f14;
            this.f45039v3 = (float) ((nanoTime - this.f45037u3) * 1.0E-9d);
            this.f45037u3 = nanoTime;
            tVar.e0(f13, f14);
            if (f12 != this.f45023n) {
                iArr[0] = i10;
                iArr[1] = i11;
            }
            i0(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f45032r3 = true;
        }
    }

    String q0(int i10) {
        t tVar = this.f44993a;
        if (tVar == null) {
            return null;
        }
        return tVar.Y(i10);
    }

    public int[] r0(String... strArr) {
        t tVar = this.f44993a;
        if (tVar == null) {
            return null;
        }
        return tVar.B(strArr);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        t tVar;
        t.b bVar;
        if (!this.H3 && this.f45003f == -1 && (tVar = this.f44993a) != null && (bVar = tVar.f45389c) != null) {
            int iE = bVar.E();
            if (iE == 0) {
                return;
            }
            if (iE == 2) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    this.f45017k.get(getChildAt(i10)).P();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // androidx.core.view.y0
    public void s(@NonNull View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f45032r3 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f45032r3 = false;
    }

    o s0(int i10) {
        return this.f45017k.get(findViewById(i10));
    }

    public void setDebugMode(int i10) {
        this.f45006g3 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f44998c4 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f45014j = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.f44993a != null) {
            setState(l.MOVING);
            Interpolator interpolatorX = this.f44993a.x();
            if (interpolatorX != null) {
                setProgress(interpolatorX.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<p> arrayList = this.f45043y3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f45043y3.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<p> arrayList = this.f45042x3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f45042x3.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        if (f10 >= 0.0f) {
            int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.R3 == null) {
                this.R3 = new j();
            }
            this.R3.e(f10);
            return;
        }
        if (f10 <= 0.0f) {
            if (this.f45025o == 1.0f && this.f45003f == this.f45005g) {
                setState(l.MOVING);
            }
            this.f45003f = this.f45001e;
            if (this.f45025o == 0.0f) {
                setState(l.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.f45025o == 0.0f && this.f45003f == this.f45001e) {
                setState(l.MOVING);
            }
            this.f45003f = this.f45005g;
            if (this.f45025o == 1.0f) {
                setState(l.FINISHED);
            }
        } else {
            this.f45003f = -1;
            setState(l.MOVING);
        }
        if (this.f44993a == null) {
            return;
        }
        this.f45038v = true;
        this.f45035t = f10;
        this.f45023n = f10;
        this.f45033s = -1L;
        this.f45019l = -1L;
        this.f44995b = null;
        this.f45040w = true;
        invalidate();
    }

    public void setScene(t tVar) {
        this.f44993a = tVar;
        tVar.n0(isRtl());
        H0();
    }

    void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.f45003f = i10;
            return;
        }
        if (this.R3 == null) {
            this.R3 = new j();
        }
        this.R3.f(i10);
        this.R3.d(i10);
    }

    void setState(l lVar) {
        l lVar2 = l.FINISHED;
        if (lVar != lVar2 || this.f45003f != -1) {
            l lVar3 = this.f45000d4;
            this.f45000d4 = lVar;
            l lVar4 = l.MOVING;
            if (lVar3 == lVar4 && lVar == lVar4) {
                k0();
            }
            int iOrdinal = lVar3.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                if (lVar == lVar4) {
                    k0();
                }
                if (lVar == lVar2) {
                    l0();
                }
            } else if (iOrdinal == 2 && lVar == lVar2) {
                l0();
            }
        }
    }

    public void setTransition(int i10) {
        float f10;
        if (this.f44993a != null) {
            t.b bVarT0 = t0(i10);
            this.f45001e = bVarT0.I();
            this.f45005g = bVarT0.B();
            if (!isAttachedToWindow()) {
                if (this.R3 == null) {
                    this.R3 = new j();
                }
                this.R3.f(this.f45001e);
                this.R3.d(this.f45005g);
                return;
            }
            int i11 = this.f45003f;
            if (i11 == this.f45001e) {
                f10 = 0.0f;
            } else {
                f10 = i11 == this.f45005g ? 1.0f : Float.NaN;
            }
            this.f44993a.p0(bVarT0);
            this.f45002e4.h(this.mLayoutWidget, this.f44993a.o(this.f45001e), this.f44993a.o(this.f45005g));
            H0();
            if (this.f45025o != f10) {
                if (f10 == 0.0f) {
                    h0(true);
                    this.f44993a.o(this.f45001e).r(this);
                } else if (f10 == 1.0f) {
                    h0(false);
                    this.f44993a.o(this.f45005g).r(this);
                }
            }
            this.f45025o = Float.isNaN(f10) ? 0.0f : f10;
            if (!Float.isNaN(f10)) {
                setProgress(f10);
            } else {
                androidx.constraintlayout.motion.widget.c.g();
                T0();
            }
        }
    }

    public void setTransitionDuration(int i10) {
        t tVar = this.f44993a;
        if (tVar == null) {
            return;
        }
        tVar.l0(i10);
    }

    public void setTransitionListener(k kVar) {
        this.f45028p1 = kVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.R3 == null) {
            this.R3 = new j();
        }
        this.R3.g(bundle);
        if (isAttachedToWindow()) {
            this.R3.a();
        }
    }

    @Override // androidx.core.view.x0
    public boolean t(@NonNull View view, @NonNull View view2, int i10, int i11) {
        t.b bVar;
        t tVar = this.f44993a;
        return (tVar == null || (bVar = tVar.f45389c) == null || bVar.J() == null || (this.f44993a.f45389c.J().f() & 2) != 0) ? false : true;
    }

    public t.b t0(int i10) {
        return this.f44993a.P(i10);
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.c.i(context, this.f45001e) + "->" + androidx.constraintlayout.motion.widget.c.i(context, this.f45005g) + " (pos:" + this.f45025o + " Dpos/Dt:" + this.f44999d;
    }

    public void u0(View view, float f10, float f11, float[] fArr, int i10) {
        float interpolation;
        float[] fArr2;
        float fA = this.f44999d;
        float f12 = this.f45025o;
        if (this.f44995b != null) {
            float fSignum = Math.signum(this.f45035t - f12);
            float interpolation2 = this.f44995b.getInterpolation(this.f45025o + D4);
            interpolation = this.f44995b.getInterpolation(this.f45025o);
            fA = (fSignum * ((interpolation2 - interpolation) / D4)) / this.f45021m;
        } else {
            interpolation = f12;
        }
        Interpolator interpolator = this.f44995b;
        if (interpolator instanceof r) {
            fA = ((r) interpolator).a();
        }
        o oVar = this.f45017k.get(view);
        if ((i10 & 1) == 0) {
            fArr2 = fArr;
            oVar.C(interpolation, view.getWidth(), view.getHeight(), f10, f11, fArr2);
        } else {
            fArr2 = fArr;
            oVar.p(interpolation, f10, f11, fArr2);
        }
        if (i10 < 2) {
            fArr2[0] = fArr2[0] * fA;
            fArr2[1] = fArr2[1] * fA;
        }
    }

    public boolean x0() {
        return this.f44998c4;
    }

    public boolean y0() {
        return this.V3;
    }

    public boolean z0() {
        return this.f45014j;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i10, int i11, int i12) {
        setState(l.SETUP);
        this.f45003f = i10;
        this.f45001e = -1;
        this.f45005g = -1;
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.e(i10, i11, i12);
            return;
        }
        t tVar = this.f44993a;
        if (tVar != null) {
            tVar.o(i10).r(this);
        }
    }

    protected void setTransition(t.b bVar) {
        this.f44993a.p0(bVar);
        setState(l.SETUP);
        if (this.f45003f == this.f44993a.u()) {
            this.f45025o = 1.0f;
            this.f45023n = 1.0f;
            this.f45035t = 1.0f;
        } else {
            this.f45025o = 0.0f;
            this.f45023n = 0.0f;
            this.f45035t = 0.0f;
        }
        this.f45033s = bVar.L(1) ? -1L : getNanoTime();
        int iO = this.f44993a.O();
        int iU = this.f44993a.u();
        if (iO == this.f45001e && iU == this.f45005g) {
            return;
        }
        this.f45001e = iO;
        this.f45005g = iU;
        this.f44993a.o0(iO, iU);
        this.f45002e4.h(this.mLayoutWidget, this.f44993a.o(this.f45001e), this.f44993a.o(this.f45005g));
        this.f45002e4.l(this.f45001e, this.f45005g);
        this.f45002e4.k();
        H0();
    }

    public MotionLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44997c = null;
        this.f44999d = 0.0f;
        this.f45001e = -1;
        this.f45003f = -1;
        this.f45005g = -1;
        this.f45008h = 0;
        this.f45011i = 0;
        this.f45014j = true;
        this.f45017k = new HashMap<>();
        this.f45019l = 0L;
        this.f45021m = 1.0f;
        this.f45023n = 0.0f;
        this.f45025o = 0.0f;
        this.f45035t = 0.0f;
        this.f45040w = false;
        this.f45027p0 = false;
        this.f45006g3 = 0;
        this.f45012i3 = false;
        this.f45015j3 = new androidx.constraintlayout.motion.utils.b();
        this.f45018k3 = new e();
        this.f45022m3 = true;
        this.f45032r3 = false;
        this.f45041w3 = false;
        this.f45042x3 = null;
        this.f45043y3 = null;
        this.f45044z3 = null;
        this.A3 = null;
        this.B3 = 0;
        this.C3 = -1L;
        this.D3 = 0.0f;
        this.E3 = 0;
        this.F3 = 0.0f;
        this.G3 = false;
        this.H3 = false;
        this.P3 = new androidx.constraintlayout.core.motion.utils.g();
        this.Q3 = false;
        this.S3 = null;
        this.T3 = null;
        this.U3 = 0;
        this.V3 = false;
        this.W3 = 0;
        this.X3 = new HashMap<>();
        this.f44996b4 = new Rect();
        this.f44998c4 = false;
        this.f45000d4 = l.UNDEFINED;
        this.f45002e4 = new g();
        this.f45004f4 = false;
        this.f45007g4 = new RectF();
        this.f45010h4 = null;
        this.f45013i4 = null;
        this.f45016j4 = new ArrayList<>();
        w0(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44997c = null;
        this.f44999d = 0.0f;
        this.f45001e = -1;
        this.f45003f = -1;
        this.f45005g = -1;
        this.f45008h = 0;
        this.f45011i = 0;
        this.f45014j = true;
        this.f45017k = new HashMap<>();
        this.f45019l = 0L;
        this.f45021m = 1.0f;
        this.f45023n = 0.0f;
        this.f45025o = 0.0f;
        this.f45035t = 0.0f;
        this.f45040w = false;
        this.f45027p0 = false;
        this.f45006g3 = 0;
        this.f45012i3 = false;
        this.f45015j3 = new androidx.constraintlayout.motion.utils.b();
        this.f45018k3 = new e();
        this.f45022m3 = true;
        this.f45032r3 = false;
        this.f45041w3 = false;
        this.f45042x3 = null;
        this.f45043y3 = null;
        this.f45044z3 = null;
        this.A3 = null;
        this.B3 = 0;
        this.C3 = -1L;
        this.D3 = 0.0f;
        this.E3 = 0;
        this.F3 = 0.0f;
        this.G3 = false;
        this.H3 = false;
        this.P3 = new androidx.constraintlayout.core.motion.utils.g();
        this.Q3 = false;
        this.S3 = null;
        this.T3 = null;
        this.U3 = 0;
        this.V3 = false;
        this.W3 = 0;
        this.X3 = new HashMap<>();
        this.f44996b4 = new Rect();
        this.f44998c4 = false;
        this.f45000d4 = l.UNDEFINED;
        this.f45002e4 = new g();
        this.f45004f4 = false;
        this.f45007g4 = new RectF();
        this.f45010h4 = null;
        this.f45013i4 = null;
        this.f45016j4 = new ArrayList<>();
        w0(attributeSet);
    }
}
