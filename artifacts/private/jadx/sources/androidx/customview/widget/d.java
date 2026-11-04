package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.view.u1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 8;
    public static final int G = 15;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    private static final int K = 20;
    private static final int L = 256;
    private static final int M = 600;
    private static final Interpolator N = new a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f49214x = "ViewDragHelper";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f49215y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f49216z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49218b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f49220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f49221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f49222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f49223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f49224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f49225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f49226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f49227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f49228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f49229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f49230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f49231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f49232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f49233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OverScroller f49234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f49235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f49236t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f49237u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ViewGroup f49238v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49219c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f49239w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.R(0);
        }
    }

    public static abstract class c {
        public int a(@NonNull View view, int i10, int i11) {
            return 0;
        }

        public int b(@NonNull View view, int i10, int i11) {
            return 0;
        }

        public int c(int i10) {
            return i10;
        }

        public int d(@NonNull View view) {
            return 0;
        }

        public int e(@NonNull View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(@NonNull View view, int i10) {
        }

        public void j(int i10) {
        }

        public void k(@NonNull View view, int i10, int i11, @t0 int i12, @t0 int i13) {
        }

        public void l(@NonNull View view, float f10, float f11) {
        }

        public abstract boolean m(@NonNull View view, int i10);
    }

    private d(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f49238v = viewGroup;
        this.f49235s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f49232p = i10;
        this.f49231o = i10;
        this.f49218b = viewConfiguration.getScaledTouchSlop();
        this.f49229m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f49230n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f49234r = new OverScroller(context, N);
    }

    private int C(int i10, int i11) {
        int i12 = i10 < this.f49238v.getLeft() + this.f49231o ? 1 : 0;
        if (i11 < this.f49238v.getTop() + this.f49231o) {
            i12 |= 4;
        }
        if (i10 > this.f49238v.getRight() - this.f49231o) {
            i12 |= 2;
        }
        return i11 > this.f49238v.getBottom() - this.f49231o ? i12 | 8 : i12;
    }

    private boolean K(int i10) {
        return J(i10);
    }

    private void N() {
        this.f49228l.computeCurrentVelocity(1000, this.f49229m);
        r(i(this.f49228l.getXVelocity(this.f49219c), this.f49230n, this.f49229m), i(this.f49228l.getYVelocity(this.f49219c), this.f49230n, this.f49229m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.customview.widget.d$c] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void O(float f10, float f11, int i10) {
        int i11;
        boolean zE = e(f10, f11, i10, 1);
        ?? r10 = zE;
        if (e(f11, f10, i10, 4)) {
            r10 = (zE ? 1 : 0) | 4;
        }
        ?? r11 = r10;
        if (e(f10, f11, i10, 2)) {
            r11 = (r10 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (e(f11, f10, i10, 8)) {
            i11 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 == 0) {
            r12 = i11;
            return;
        }
        r12 = i11;
        int[] iArr = this.f49225i;
        iArr[i10] = (iArr[i10] | r12) == true ? 1 : 0;
        this.f49235s.f(r12, i10);
    }

    private void P(float f10, float f11, int i10) {
        u(i10);
        float[] fArr = this.f49220d;
        this.f49222f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f49221e;
        this.f49223g[i10] = f11;
        fArr2[i10] = f11;
        this.f49224h[i10] = C((int) f10, (int) f11);
        this.f49227k |= 1 << i10;
    }

    private void Q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (K(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f49222f[pointerId] = x10;
                this.f49223g[pointerId] = y10;
            }
        }
    }

    private boolean e(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f49224h[i10] & i11) == i11 && (this.f49233q & i11) != 0 && (this.f49226j[i10] & i11) != i11 && (this.f49225i[i10] & i11) != i11) {
            int i12 = this.f49218b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f49235s.g(i11)) {
                    int[] iArr = this.f49226j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f49225i[i10] & i11) == 0 && fAbs > this.f49218b) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean h(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f49235s.d(view) > 0;
        boolean z11 = this.f49235s.e(view) > 0;
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i10 = this.f49218b;
            return f12 > ((float) (i10 * i10));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.f49218b);
        }
        return z11 && Math.abs(f11) > ((float) this.f49218b);
    }

    private float i(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        if (fAbs > f12) {
            return f10 > 0.0f ? f12 : -f12;
        }
        return f10;
    }

    private int j(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    private void k() {
        float[] fArr = this.f49220d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f49221e, 0.0f);
        Arrays.fill(this.f49222f, 0.0f);
        Arrays.fill(this.f49223g, 0.0f);
        Arrays.fill(this.f49224h, 0);
        Arrays.fill(this.f49225i, 0);
        Arrays.fill(this.f49226j, 0);
        this.f49227k = 0;
    }

    private void l(int i10) {
        if (this.f49220d != null && J(i10)) {
            this.f49220d[i10] = 0.0f;
            this.f49221e[i10] = 0.0f;
            this.f49222f[i10] = 0.0f;
            this.f49223g[i10] = 0.0f;
            int i11 = 6 | 0;
            this.f49224h[i10] = 0;
            this.f49225i[i10] = 0;
            this.f49226j[i10] = 0;
            this.f49227k = (~(1 << i10)) & this.f49227k;
        }
    }

    private int m(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f49238v.getWidth();
        float f10 = width / 2;
        float fS = f10 + (s(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fS / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int n(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iJ = j(i12, (int) this.f49230n, (int) this.f49229m);
        int iJ2 = j(i13, (int) this.f49230n, (int) this.f49229m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iJ);
        int iAbs4 = Math.abs(iJ2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iJ != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iJ2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((m(i10, iJ, this.f49235s.d(view)) * f14) + (m(i11, iJ2, this.f49235s.e(view)) * (f12 / f13)));
    }

    public static d p(@NonNull ViewGroup viewGroup, float f10, @NonNull c cVar) {
        d dVarQ = q(viewGroup, cVar);
        dVarQ.f49218b = (int) (dVarQ.f49218b * (1.0f / f10));
        return dVarQ;
    }

    public static d q(@NonNull ViewGroup viewGroup, @NonNull c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    private void r(float f10, float f11) {
        this.f49237u = true;
        this.f49235s.l(this.f49236t, f10, f11);
        this.f49237u = false;
        if (this.f49217a == 1) {
            R(0);
        }
    }

    private float s(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void t(int i10, int i11, int i12, int i13) {
        int left = this.f49236t.getLeft();
        int top = this.f49236t.getTop();
        if (i12 != 0) {
            i10 = this.f49235s.a(this.f49236t, i10, i12);
            u1.h1(this.f49236t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f49235s.b(this.f49236t, i11, i13);
            u1.i1(this.f49236t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f49235s.k(this.f49236t, i14, i15, i14 - left, i15 - top);
    }

    private void u(int i10) {
        float[] fArr = this.f49220d;
        if (fArr != null && fArr.length > i10) {
            return;
        }
        int i11 = i10 + 1;
        float[] fArr2 = new float[i11];
        float[] fArr3 = new float[i11];
        float[] fArr4 = new float[i11];
        float[] fArr5 = new float[i11];
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        if (fArr != null) {
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            float[] fArr6 = this.f49221e;
            System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
            float[] fArr7 = this.f49222f;
            System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
            float[] fArr8 = this.f49223g;
            System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            int[] iArr4 = this.f49224h;
            System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
            int[] iArr5 = this.f49225i;
            System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
            int[] iArr6 = this.f49226j;
            System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
        }
        this.f49220d = fArr2;
        this.f49221e = fArr3;
        this.f49222f = fArr4;
        this.f49223g = fArr5;
        this.f49224h = iArr;
        this.f49225i = iArr2;
        this.f49226j = iArr3;
    }

    private boolean x(int i10, int i11, int i12, int i13) {
        int left = this.f49236t.getLeft();
        int top = this.f49236t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f49234r.abortAnimation();
            R(0);
            return false;
        }
        this.f49234r.startScroll(left, top, i14, i15, n(this.f49236t, i14, i15, i12, i13));
        R(2);
        return true;
    }

    @t0
    public int A() {
        return this.f49232p;
    }

    @t0
    public int B() {
        return this.f49231o;
    }

    public float D() {
        return this.f49230n;
    }

    @t0
    public int E() {
        return this.f49218b;
    }

    public int F() {
        return this.f49217a;
    }

    public boolean G(int i10, int i11) {
        return L(this.f49236t, i10, i11);
    }

    public boolean H(int i10) {
        int length = this.f49224h.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (I(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean I(int i10, int i11) {
        return J(i11) && (this.f49224h[i11] & i10) != 0;
    }

    public boolean J(int i10) {
        return (this.f49227k & (1 << i10)) != 0;
    }

    public boolean L(@p0 View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void M(@NonNull MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f49228l == null) {
            this.f49228l = VelocityTracker.obtain();
        }
        this.f49228l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewV = v((int) x10, (int) y10);
            P(x10, y10, pointerId);
            Y(viewV, pointerId);
            int i12 = this.f49224h[pointerId];
            int i13 = this.f49233q;
            if ((i12 & i13) != 0) {
                this.f49235s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f49217a == 1) {
                N();
            }
            c();
            return;
        }
        if (actionMasked == 2) {
            if (this.f49217a == 1) {
                if (K(this.f49219c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f49219c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f49222f;
                    int i14 = this.f49219c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f49223g[i14]);
                    t(this.f49236t.getLeft() + i15, this.f49236t.getTop() + i16, i15, i16);
                    Q(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (K(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f49220d[pointerId2];
                    float f11 = y12 - this.f49221e[pointerId2];
                    O(f10, f11, pointerId2);
                    if (this.f49217a != 1) {
                        View viewV2 = v((int) x12, (int) y12);
                        if (h(viewV2, f10, f11) && Y(viewV2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            Q(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f49217a == 1) {
                r(0.0f, 0.0f);
            }
            c();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            P(x13, y13, pointerId3);
            if (this.f49217a != 0) {
                if (G((int) x13, (int) y13)) {
                    Y(this.f49236t, pointerId3);
                    return;
                }
                return;
            } else {
                Y(v((int) x13, (int) y13), pointerId3);
                int i17 = this.f49224h[pointerId3];
                int i18 = this.f49233q;
                if ((i17 & i18) != 0) {
                    this.f49235s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f49217a == 1 && pointerId4 == this.f49219c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f49219c) {
                    View viewV3 = v((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f49236t;
                    if (viewV3 == view && Y(view, pointerId5)) {
                        i10 = this.f49219c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                N();
            }
        }
        l(pointerId4);
    }

    void R(int i10) {
        this.f49238v.removeCallbacks(this.f49239w);
        if (this.f49217a != i10) {
            this.f49217a = i10;
            this.f49235s.j(i10);
            if (this.f49217a == 0) {
                this.f49236t = null;
            }
        }
    }

    public void S(@g0(from = 0) @t0 int i10) {
        this.f49231o = i10;
    }

    public void T(int i10) {
        this.f49233q = i10;
    }

    public void U(float f10) {
        this.f49230n = f10;
    }

    public boolean V(int i10, int i11) {
        if (this.f49237u) {
            return x(i10, i11, (int) this.f49228l.getXVelocity(this.f49219c), (int) this.f49228l.getYVelocity(this.f49219c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    public boolean W(@NonNull MotionEvent motionEvent) {
        View viewV;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f49228l == null) {
            this.f49228l = VelocityTracker.obtain();
        }
        this.f49228l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            P(x10, y10, pointerId);
            View viewV2 = v((int) x10, (int) y10);
            if (viewV2 == this.f49236t && this.f49217a == 2) {
                Y(viewV2, pointerId);
            }
            int i10 = this.f49224h[pointerId];
            int i11 = this.f49233q;
            if ((i10 & i11) != 0) {
                this.f49235s.h(i10 & i11, pointerId);
            }
        } else if (actionMasked == 1) {
            c();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                c();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                P(x11, y11, pointerId2);
                int i12 = this.f49217a;
                if (i12 == 0) {
                    int i13 = this.f49224h[pointerId2];
                    int i14 = this.f49233q;
                    if ((i13 & i14) != 0) {
                        this.f49235s.h(i13 & i14, pointerId2);
                    }
                } else if (i12 == 2 && (viewV = v((int) x11, (int) y11)) == this.f49236t) {
                    Y(viewV, pointerId2);
                }
            } else if (actionMasked == 6) {
                l(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f49220d != null && this.f49221e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i15 = 0; i15 < pointerCount; i15++) {
                int pointerId3 = motionEvent.getPointerId(i15);
                if (K(pointerId3)) {
                    float x12 = motionEvent.getX(i15);
                    float y12 = motionEvent.getY(i15);
                    float f10 = x12 - this.f49220d[pointerId3];
                    float f11 = y12 - this.f49221e[pointerId3];
                    View viewV3 = v((int) x12, (int) y12);
                    boolean z10 = viewV3 != null && h(viewV3, f10, f11);
                    if (!z10) {
                        O(f10, f11, pointerId3);
                        if (this.f49217a != 1) {
                            break;
                        }
                    } else {
                        int left = viewV3.getLeft();
                        int i16 = (int) f10;
                        int iA = this.f49235s.a(viewV3, left + i16, i16);
                        int top = viewV3.getTop();
                        int i17 = (int) f11;
                        int iB = this.f49235s.b(viewV3, top + i17, i17);
                        int iD = this.f49235s.d(viewV3);
                        int iE = this.f49235s.e(viewV3);
                        if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                            break;
                        }
                        O(f10, f11, pointerId3);
                        if (this.f49217a != 1 || (z10 && Y(viewV3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            Q(motionEvent);
        }
        return this.f49217a == 1;
    }

    public boolean X(@NonNull View view, int i10, int i11) {
        this.f49236t = view;
        this.f49219c = -1;
        boolean zX = x(i10, i11, 0, 0);
        if (!zX && this.f49217a == 0 && this.f49236t != null) {
            this.f49236t = null;
        }
        return zX;
    }

    boolean Y(View view, int i10) {
        if (view == this.f49236t && this.f49219c == i10) {
            return true;
        }
        if (view == null || !this.f49235s.m(view, i10)) {
            return false;
        }
        this.f49219c = i10;
        d(view, i10);
        return true;
    }

    public void a() {
        c();
        if (this.f49217a == 2) {
            int currX = this.f49234r.getCurrX();
            int currY = this.f49234r.getCurrY();
            this.f49234r.abortAnimation();
            int currX2 = this.f49234r.getCurrX();
            int currY2 = this.f49234r.getCurrY();
            this.f49235s.k(this.f49236t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        R(0);
    }

    protected boolean b(@NonNull View view, boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && b(childAt, true, i10, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z10) {
            return view.canScrollHorizontally(-i10) || view.canScrollVertically(-i11);
        }
        return false;
    }

    public void c() {
        this.f49219c = -1;
        k();
        VelocityTracker velocityTracker = this.f49228l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f49228l = null;
        }
    }

    public void d(@NonNull View view, int i10) {
        if (view.getParent() == this.f49238v) {
            this.f49236t = view;
            this.f49219c = i10;
            this.f49235s.i(view, i10);
            R(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f49238v + ")");
    }

    public boolean f(int i10) {
        int length = this.f49220d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (g(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i10, int i11) {
        if (!J(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.f49222f[i11] - this.f49220d[i11];
        float f11 = this.f49223g[i11] - this.f49221e[i11];
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i12 = this.f49218b;
            return f12 > ((float) (i12 * i12));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.f49218b);
        }
        return z11 && Math.abs(f11) > ((float) this.f49218b);
    }

    public boolean o(boolean z10) {
        if (this.f49217a == 2) {
            boolean zComputeScrollOffset = this.f49234r.computeScrollOffset();
            int currX = this.f49234r.getCurrX();
            int currY = this.f49234r.getCurrY();
            int left = currX - this.f49236t.getLeft();
            int top = currY - this.f49236t.getTop();
            if (left != 0) {
                u1.h1(this.f49236t, left);
            }
            if (top != 0) {
                u1.i1(this.f49236t, top);
            }
            if (left != 0 || top != 0) {
                this.f49235s.k(this.f49236t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f49234r.getFinalX() && currY == this.f49234r.getFinalY()) {
                this.f49234r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f49238v.post(this.f49239w);
                } else {
                    R(0);
                }
            }
        }
        return this.f49217a == 2;
    }

    @p0
    public View v(int i10, int i11) {
        for (int childCount = this.f49238v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f49238v.getChildAt(this.f49235s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int i10, int i11, int i12, int i13) {
        if (!this.f49237u) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f49234r.fling(this.f49236t.getLeft(), this.f49236t.getTop(), (int) this.f49228l.getXVelocity(this.f49219c), (int) this.f49228l.getYVelocity(this.f49219c), i10, i12, i11, i13);
        R(2);
    }

    public int y() {
        return this.f49219c;
    }

    @p0
    public View z() {
        return this.f49236t;
    }
}
