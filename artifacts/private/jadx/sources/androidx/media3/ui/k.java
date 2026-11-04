package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.z3;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class k extends FrameLayout {
    public static final int M3 = 5000;
    public static final int N3 = 0;
    public static final int O3 = 200;
    public static final int P3 = 100;
    private static final int Q3 = 1000;
    private boolean A3;
    private boolean B3;
    private boolean C3;
    private boolean D3;
    private long E3;
    private long[] F3;
    private boolean[] G3;
    private final Drawable H1;
    private long[] H3;
    private boolean[] I3;
    private long J3;
    private long K3;
    private long L3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f69954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<d> f69955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69960g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final String f69961g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69962h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final String f69963h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f69964i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private final String f69965i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f69966j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private final Drawable f69967j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69968k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private final Drawable f69969k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f69970l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private final float f69971l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f69972m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private final float f69973m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private final d1 f69974n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private final String f69975n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final StringBuilder f69976o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private final String f69977o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final Runnable f69978p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final Drawable f69979p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final Drawable f69980p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.common.z0 f69981p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @androidx.annotation.p0
    private c f69982q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean f69983r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Formatter f69984s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private boolean f69985s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z3.b f69986t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f69987t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f69988u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final z3.d f69989v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f69990v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f69991w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private int f69992w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private int f69993x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private int f69994y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private boolean f69995z3;

    private final class b implements androidx.media3.common.z0.g, d1.a, View.OnClickListener {
        private b() {
        }

        @Override // androidx.media3.ui.d1.a
        public void L(d1 d1Var, long j10) {
            if (k.this.f69972m != null) {
                k.this.f69972m.setText(androidx.media3.common.util.k1.J0(k.this.f69976o, k.this.f69984s, j10));
            }
        }

        @Override // androidx.media3.ui.d1.a
        public void P(d1 d1Var, long j10, boolean z10) {
            k.this.f69990v3 = false;
            if (z10 || k.this.f69981p3 == null) {
                return;
            }
            k kVar = k.this;
            kVar.I(kVar.f69981p3, j10);
        }

        @Override // androidx.media3.common.z0.g
        public void S(androidx.media3.common.z0 z0Var, androidx.media3.common.z0.f fVar) {
            if (fVar.b(4, 5)) {
                k.this.O();
            }
            if (fVar.b(4, 5, 7)) {
                k.this.P();
            }
            if (fVar.a(8)) {
                k.this.Q();
            }
            if (fVar.a(9)) {
                k.this.R();
            }
            if (fVar.b(8, 9, 11, 0, 13)) {
                k.this.N();
            }
            if (fVar.b(11, 0)) {
                k.this.S();
            }
        }

        @Override // androidx.media3.ui.d1.a
        public void l(d1 d1Var, long j10) {
            k.this.f69990v3 = true;
            if (k.this.f69972m != null) {
                k.this.f69972m.setText(androidx.media3.common.util.k1.J0(k.this.f69976o, k.this.f69984s, j10));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            androidx.media3.common.z0 z0Var = k.this.f69981p3;
            if (z0Var == null) {
                return;
            }
            if (k.this.f69957d == view) {
                z0Var.X1();
                return;
            }
            if (k.this.f69956c == view) {
                z0Var.I1();
                return;
            }
            if (k.this.f69960g == view) {
                if (z0Var.H() != 4) {
                    z0Var.t1();
                    return;
                }
                return;
            }
            if (k.this.f69962h == view) {
                z0Var.t2();
                return;
            }
            if (k.this.f69958e == view) {
                androidx.media3.common.util.k1.T0(z0Var);
                return;
            }
            if (k.this.f69959f == view) {
                androidx.media3.common.util.k1.S0(z0Var);
            } else if (k.this.f69964i == view) {
                z0Var.D(androidx.media3.common.util.p0.a(z0Var.C(), k.this.f69994y3));
            } else if (k.this.f69966j == view) {
                z0Var.K(!z0Var.s0());
            }
        }
    }

    public interface c {
        void a(long j10, long j11);
    }

    public interface d {
        void l(int i10);
    }

    static {
        androidx.media3.common.p0.a("media3.ui");
    }

    public k(Context context) {
        this(context, null);
    }

    private void B() {
        removeCallbacks(this.f69978p0);
        if (this.f69992w3 <= 0) {
            this.E3 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i10 = this.f69992w3;
        this.E3 = jUptimeMillis + ((long) i10);
        if (this.f69983r3) {
            postDelayed(this.f69978p0, i10);
        }
    }

    @e.a({"InlinedApi"})
    private static boolean C(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    private void F() {
        View view;
        View view2;
        boolean zI2 = androidx.media3.common.util.k1.i2(this.f69981p3, this.f69987t3);
        if (zI2 && (view2 = this.f69958e) != null) {
            view2.sendAccessibilityEvent(8);
            return;
        }
        if (!zI2 && (view = this.f69959f) != null) {
            view.sendAccessibilityEvent(8);
        }
    }

    private void G() {
        View view;
        View view2;
        boolean zI2 = androidx.media3.common.util.k1.i2(this.f69981p3, this.f69987t3);
        if (zI2 && (view2 = this.f69958e) != null) {
            view2.requestFocus();
        } else {
            if (zI2 || (view = this.f69959f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void H(androidx.media3.common.z0 z0Var, int i10, long j10) {
        z0Var.j0(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(androidx.media3.common.z0 z0Var, long j10) {
        int iL0;
        z3 z3VarC0 = z0Var.c0();
        if (this.f69988u3 && !z3VarC0.w()) {
            int iV = z3VarC0.v();
            iL0 = 0;
            while (true) {
                long jE = z3VarC0.t(iL0, this.f69989v).e();
                if (j10 < jE) {
                    break;
                }
                if (iL0 == iV - 1) {
                    j10 = jE;
                    break;
                } else {
                    j10 -= jE;
                    iL0++;
                }
            }
        } else {
            iL0 = z0Var.l0();
        }
        H(z0Var, iL0, j10);
        P();
    }

    private void L() {
        O();
        N();
        Q();
        R();
        S();
    }

    private void M(boolean z10, boolean z11, @androidx.annotation.p0 View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.f69971l3 : this.f69973m3);
        view.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        boolean zP0;
        boolean zP1;
        boolean zP2;
        boolean zP3;
        boolean zP4;
        if (D() && this.f69983r3) {
            androidx.media3.common.z0 z0Var = this.f69981p3;
            if (z0Var != null) {
                zP0 = z0Var.P0(5);
                zP2 = z0Var.P0(7);
                zP3 = z0Var.P0(11);
                zP4 = z0Var.P0(12);
                zP1 = z0Var.P0(9);
            } else {
                zP0 = false;
                zP1 = false;
                zP2 = false;
                zP3 = false;
                zP4 = false;
            }
            M(this.B3, zP2, this.f69956c);
            M(this.f69995z3, zP3, this.f69962h);
            M(this.A3, zP4, this.f69960g);
            M(this.C3, zP1, this.f69957d);
            d1 d1Var = this.f69974n;
            if (d1Var != null) {
                d1Var.setEnabled(zP0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        boolean z10;
        boolean z11;
        if (D() && this.f69983r3) {
            boolean zI2 = androidx.media3.common.util.k1.i2(this.f69981p3, this.f69987t3);
            View view = this.f69958e;
            boolean z12 = true;
            if (view != null) {
                z10 = !zI2 && view.isFocused();
                z11 = !zI2 && this.f69958e.isAccessibilityFocused();
                this.f69958e.setVisibility(zI2 ? 0 : 8);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f69959f;
            if (view2 != null) {
                z10 |= zI2 && view2.isFocused();
                if (!zI2 || !this.f69959f.isAccessibilityFocused()) {
                    z12 = false;
                }
                z11 |= z12;
                this.f69959f.setVisibility(zI2 ? 8 : 0);
            }
            if (z10) {
                G();
            }
            if (z11) {
                F();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        long jN0;
        long jR;
        if (D() && this.f69983r3) {
            androidx.media3.common.z0 z0Var = this.f69981p3;
            if (z0Var != null) {
                jN0 = this.J3 + z0Var.n0();
                jR = this.J3 + z0Var.R();
            } else {
                jN0 = 0;
                jR = 0;
            }
            boolean z10 = jN0 != this.K3;
            boolean z11 = jR != this.L3;
            this.K3 = jN0;
            this.L3 = jR;
            TextView textView = this.f69972m;
            if (textView != null && !this.f69990v3 && z10) {
                textView.setText(androidx.media3.common.util.k1.J0(this.f69976o, this.f69984s, jN0));
            }
            d1 d1Var = this.f69974n;
            if (d1Var != null) {
                d1Var.setPosition(jN0);
                this.f69974n.setBufferedPosition(jR);
            }
            c cVar = this.f69982q3;
            if (cVar != null && (z10 || z11)) {
                cVar.a(jN0, jR);
            }
            removeCallbacks(this.f69991w);
            int iH = z0Var == null ? 1 : z0Var.H();
            if (z0Var == null || !z0Var.isPlaying()) {
                if (iH == 4 || iH == 1) {
                    return;
                }
                postDelayed(this.f69991w, 1000L);
                return;
            }
            d1 d1Var2 = this.f69974n;
            long jMin = Math.min(d1Var2 != null ? d1Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jN0 % 1000));
            float f10 = z0Var.c().f61874a;
            postDelayed(this.f69991w, androidx.media3.common.util.k1.x(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f69993x3, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        ImageView imageView;
        if (D() && this.f69983r3 && (imageView = this.f69964i) != null) {
            if (this.f69994y3 == 0) {
                M(false, false, imageView);
                return;
            }
            androidx.media3.common.z0 z0Var = this.f69981p3;
            if (z0Var == null) {
                M(true, false, imageView);
                this.f69964i.setImageDrawable(this.f69979p1);
                this.f69964i.setContentDescription(this.f69961g3);
                return;
            }
            M(true, true, imageView);
            int iC = z0Var.C();
            if (iC == 0) {
                this.f69964i.setImageDrawable(this.f69979p1);
                this.f69964i.setContentDescription(this.f69961g3);
            } else if (iC == 1) {
                this.f69964i.setImageDrawable(this.H1);
                this.f69964i.setContentDescription(this.f69963h3);
            } else if (iC == 2) {
                this.f69964i.setImageDrawable(this.f69980p2);
                this.f69964i.setContentDescription(this.f69965i3);
            }
            this.f69964i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        ImageView imageView;
        if (D() && this.f69983r3 && (imageView = this.f69966j) != null) {
            androidx.media3.common.z0 z0Var = this.f69981p3;
            if (!this.D3) {
                M(false, false, imageView);
                return;
            }
            if (z0Var == null) {
                M(true, false, imageView);
                this.f69966j.setImageDrawable(this.f69969k3);
                this.f69966j.setContentDescription(this.f69977o3);
            } else {
                M(true, true, imageView);
                this.f69966j.setImageDrawable(z0Var.s0() ? this.f69967j3 : this.f69969k3);
                this.f69966j.setContentDescription(z0Var.s0() ? this.f69975n3 : this.f69977o3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        int i10;
        z3.d dVar;
        long j10;
        androidx.media3.common.z0 z0Var = this.f69981p3;
        if (z0Var == null) {
            return;
        }
        boolean z10 = true;
        this.f69988u3 = this.f69985s3 && x(z0Var.c0(), this.f69989v);
        long j11 = 0;
        this.J3 = 0L;
        z3 z3VarC0 = z0Var.c0();
        if (z3VarC0.w()) {
            i10 = 0;
        } else {
            int iL0 = z0Var.l0();
            boolean z11 = this.f69988u3;
            int i11 = z11 ? 0 : iL0;
            int iV = z11 ? z3VarC0.v() - 1 : iL0;
            i10 = 0;
            long j12 = 0;
            while (i11 <= iV) {
                if (i11 == iL0) {
                    this.J3 = androidx.media3.common.util.k1.A2(j12);
                }
                z3VarC0.t(i11, this.f69989v);
                z3.d dVar2 = this.f69989v;
                if (dVar2.f62000m == -9223372036854775807L) {
                    androidx.media3.common.util.a.i(this.f69988u3 ^ z10);
                    break;
                }
                int i12 = dVar2.f62001n;
                while (true) {
                    dVar = this.f69989v;
                    if (i12 <= dVar.f62002o) {
                        z3VarC0.j(i12, this.f69986t);
                        int iR = this.f69986t.r();
                        int iD = this.f69986t.d();
                        while (iR < iD) {
                            long jG = this.f69986t.g(iR);
                            if (jG == Long.MIN_VALUE) {
                                j10 = j11;
                                long j13 = this.f69986t.f61970d;
                                if (j13 != -9223372036854775807L) {
                                    jG = j13;
                                }
                                iR++;
                                j11 = j10;
                            } else {
                                j10 = j11;
                            }
                            long jQ = jG + this.f69986t.q();
                            if (jQ >= j10) {
                                long[] jArr = this.F3;
                                if (i10 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.F3 = Arrays.copyOf(jArr, length);
                                    this.G3 = Arrays.copyOf(this.G3, length);
                                }
                                this.F3[i10] = androidx.media3.common.util.k1.A2(j12 + jQ);
                                this.G3[i10] = this.f69986t.s(iR);
                                i10++;
                            }
                            iR++;
                            j11 = j10;
                        }
                        i12++;
                    }
                }
                j12 += dVar.f62000m;
                i11++;
                j11 = j11;
                z10 = true;
            }
            j11 = j12;
        }
        long jA2 = androidx.media3.common.util.k1.A2(j11);
        TextView textView = this.f69970l;
        if (textView != null) {
            textView.setText(androidx.media3.common.util.k1.J0(this.f69976o, this.f69984s, jA2));
        }
        d1 d1Var = this.f69974n;
        if (d1Var != null) {
            d1Var.setDuration(jA2);
            int length2 = this.H3.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.F3;
            if (i13 > jArr2.length) {
                this.F3 = Arrays.copyOf(jArr2, i13);
                this.G3 = Arrays.copyOf(this.G3, i13);
            }
            System.arraycopy(this.H3, 0, this.F3, i10, length2);
            System.arraycopy(this.I3, 0, this.G3, i10, length2);
            this.f69974n.b(this.F3, this.G3, i13);
        }
        P();
    }

    private static boolean x(z3 z3Var, z3.d dVar) {
        if (z3Var.v() > 100) {
            return false;
        }
        int iV = z3Var.v();
        for (int i10 = 0; i10 < iV; i10++) {
            if (z3Var.t(i10, dVar).f62000m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    private static int z(TypedArray typedArray, int i10) {
        return typedArray.getInt(v0.m.f70493t0, i10);
    }

    public void A() {
        if (D()) {
            setVisibility(8);
            Iterator<d> it = this.f69955b.iterator();
            while (it.hasNext()) {
                it.next().l(getVisibility());
            }
            removeCallbacks(this.f69991w);
            removeCallbacks(this.f69978p0);
            this.E3 = -9223372036854775807L;
        }
    }

    public boolean D() {
        return getVisibility() == 0;
    }

    public void E(d dVar) {
        this.f69955b.remove(dVar);
    }

    public void J(@androidx.annotation.p0 long[] jArr, @androidx.annotation.p0 boolean[] zArr) {
        boolean z10 = false;
        if (jArr == null) {
            this.H3 = new long[0];
            this.I3 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) androidx.media3.common.util.a.g(zArr);
            if (jArr.length == zArr2.length) {
                z10 = true;
                int i10 = 3 | 1;
            }
            androidx.media3.common.util.a.a(z10);
            this.H3 = jArr;
            this.I3 = zArr2;
        }
        S();
    }

    public void K() {
        if (!D()) {
            setVisibility(0);
            Iterator<d> it = this.f69955b.iterator();
            while (it.hasNext()) {
                it.next().l(getVisibility());
            }
            L();
            G();
            F();
        }
        B();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return y(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f69978p0);
        } else if (motionEvent.getAction() == 1) {
            B();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @androidx.annotation.p0
    public androidx.media3.common.z0 getPlayer() {
        return this.f69981p3;
    }

    public int getRepeatToggleModes() {
        return this.f69994y3;
    }

    public boolean getShowShuffleButton() {
        return this.D3;
    }

    public int getShowTimeoutMs() {
        return this.f69992w3;
    }

    public boolean getShowVrButton() {
        View view = this.f69968k;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f69983r3 = true;
        long j10 = this.E3;
        if (j10 != -9223372036854775807L) {
            long jUptimeMillis = j10 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                A();
            } else {
                postDelayed(this.f69978p0, jUptimeMillis);
            }
        } else if (D()) {
            B();
        }
        L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f69983r3 = false;
        removeCallbacks(this.f69991w);
        removeCallbacks(this.f69978p0);
    }

    public void setPlayer(@androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        androidx.media3.common.util.a.i(Looper.myLooper() == Looper.getMainLooper());
        androidx.media3.common.util.a.a(z0Var == null || z0Var.d0() == Looper.getMainLooper());
        androidx.media3.common.z0 z0Var2 = this.f69981p3;
        if (z0Var2 == z0Var) {
            return;
        }
        if (z0Var2 != null) {
            z0Var2.Q1(this.f69954a);
        }
        this.f69981p3 = z0Var;
        if (z0Var != null) {
            z0Var.U1(this.f69954a);
        }
        L();
    }

    public void setProgressUpdateListener(@androidx.annotation.p0 c cVar) {
        this.f69982q3 = cVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.f69994y3 = i10;
        androidx.media3.common.z0 z0Var = this.f69981p3;
        if (z0Var != null) {
            int iC = z0Var.C();
            if (i10 == 0 && iC != 0) {
                int i11 = 6 >> 0;
                this.f69981p3.D(0);
            } else if (i10 == 1 && iC == 2) {
                this.f69981p3.D(1);
            } else if (i10 == 2 && iC == 1) {
                this.f69981p3.D(2);
            }
        }
        Q();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.A3 = z10;
        N();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f69985s3 = z10;
        S();
    }

    public void setShowNextButton(boolean z10) {
        this.C3 = z10;
        N();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f69987t3 = z10;
        O();
    }

    public void setShowPreviousButton(boolean z10) {
        this.B3 = z10;
        N();
    }

    public void setShowRewindButton(boolean z10) {
        this.f69995z3 = z10;
        N();
    }

    public void setShowShuffleButton(boolean z10) {
        this.D3 = z10;
        R();
    }

    public void setShowTimeoutMs(int i10) {
        this.f69992w3 = i10;
        if (D()) {
            B();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.f69968k;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f69993x3 = androidx.media3.common.util.k1.w(i10, 16, 1000);
    }

    public void setVrButtonListener(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        View view = this.f69968k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            M(getShowVrButton(), onClickListener != null, this.f69968k);
        }
    }

    public void w(d dVar) {
        androidx.media3.common.util.a.g(dVar);
        this.f69955b.add(dVar);
    }

    public boolean y(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.media3.common.z0 z0Var = this.f69981p3;
        if (z0Var == null || !C(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (z0Var.H() != 4) {
                    z0Var.t1();
                }
            } else if (keyCode == 89) {
                z0Var.t2();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    androidx.media3.common.util.k1.V0(z0Var, this.f69987t3);
                } else if (keyCode == 87) {
                    z0Var.X1();
                } else if (keyCode == 88) {
                    z0Var.I1();
                } else if (keyCode == 126) {
                    androidx.media3.common.util.k1.T0(z0Var);
                } else if (keyCode == 127) {
                    androidx.media3.common.util.k1.S0(z0Var);
                }
            }
        }
        return true;
    }

    public k(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public k(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, @androidx.annotation.p0 AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int resourceId = v0.i.f70346b;
        this.f69987t3 = true;
        this.f69992w3 = 5000;
        this.f69994y3 = 0;
        this.f69993x3 = 200;
        this.E3 = -9223372036854775807L;
        this.f69995z3 = true;
        this.A3 = true;
        this.B3 = true;
        this.C3 = true;
        this.D3 = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, v0.m.f70457k0, i10, 0);
            try {
                this.f69992w3 = typedArrayObtainStyledAttributes.getInt(v0.m.E0, this.f69992w3);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(v0.m.f70481q0, resourceId);
                this.f69994y3 = z(typedArrayObtainStyledAttributes, this.f69994y3);
                this.f69995z3 = typedArrayObtainStyledAttributes.getBoolean(v0.m.C0, this.f69995z3);
                this.A3 = typedArrayObtainStyledAttributes.getBoolean(v0.m.f70517z0, this.A3);
                this.B3 = typedArrayObtainStyledAttributes.getBoolean(v0.m.B0, this.B3);
                this.C3 = typedArrayObtainStyledAttributes.getBoolean(v0.m.A0, this.C3);
                this.D3 = typedArrayObtainStyledAttributes.getBoolean(v0.m.D0, this.D3);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(v0.m.F0, this.f69993x3));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f69955b = new CopyOnWriteArrayList<>();
        this.f69986t = new z3.b();
        this.f69989v = new z3.d();
        StringBuilder sb2 = new StringBuilder();
        this.f69976o = sb2;
        this.f69984s = new Formatter(sb2, Locale.getDefault());
        this.F3 = new long[0];
        this.G3 = new boolean[0];
        this.H3 = new long[0];
        this.I3 = new boolean[0];
        b bVar = new b();
        this.f69954a = bVar;
        this.f69991w = new Runnable() { // from class: androidx.media3.ui.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f69886a.P();
            }
        };
        this.f69978p0 = new Runnable() { // from class: androidx.media3.ui.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f69889a.A();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        d1 d1Var = (d1) findViewById(v0.g.B0);
        View viewFindViewById = findViewById(v0.g.C0);
        if (d1Var != null) {
            this.f69974n = d1Var;
        } else if (viewFindViewById != null) {
            f fVar = new f(context, null, 0, attributeSet2);
            fVar.setId(v0.g.B0);
            fVar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(fVar, iIndexOfChild);
            this.f69974n = fVar;
        } else {
            this.f69974n = null;
        }
        this.f69970l = (TextView) findViewById(v0.g.f70280f0);
        this.f69972m = (TextView) findViewById(v0.g.f70340z0);
        d1 d1Var2 = this.f69974n;
        if (d1Var2 != null) {
            d1Var2.c(bVar);
        }
        View viewFindViewById2 = findViewById(v0.g.f70331w0);
        this.f69958e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(bVar);
        }
        View viewFindViewById3 = findViewById(v0.g.f70328v0);
        this.f69959f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(bVar);
        }
        View viewFindViewById4 = findViewById(v0.g.A0);
        this.f69956c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(bVar);
        }
        View viewFindViewById5 = findViewById(v0.g.f70316r0);
        this.f69957d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(bVar);
        }
        View viewFindViewById6 = findViewById(v0.g.E0);
        this.f69962h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(bVar);
        }
        View viewFindViewById7 = findViewById(v0.g.f70292j0);
        this.f69960g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(v0.g.D0);
        this.f69964i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(v0.g.I0);
        this.f69966j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View viewFindViewById8 = findViewById(v0.g.Q0);
        this.f69968k = viewFindViewById8;
        setShowVrButton(false);
        M(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.f69971l3 = resources.getInteger(v0.h.f70343b) / 100.0f;
        this.f69973m3 = resources.getInteger(v0.h.f70342a) / 100.0f;
        this.f69979p1 = androidx.media3.common.util.k1.r0(context, resources, v0.e.Q);
        this.H1 = androidx.media3.common.util.k1.r0(context, resources, v0.e.R);
        this.f69980p2 = androidx.media3.common.util.k1.r0(context, resources, v0.e.P);
        this.f69967j3 = androidx.media3.common.util.k1.r0(context, resources, v0.e.U);
        this.f69969k3 = androidx.media3.common.util.k1.r0(context, resources, v0.e.T);
        this.f69961g3 = resources.getString(v0.k.f70379p);
        this.f69963h3 = resources.getString(v0.k.f70380q);
        this.f69965i3 = resources.getString(v0.k.f70378o);
        this.f69975n3 = resources.getString(v0.k.f70386w);
        this.f69977o3 = resources.getString(v0.k.f70385v);
        this.K3 = -9223372036854775807L;
        this.L3 = -9223372036854775807L;
    }
}
