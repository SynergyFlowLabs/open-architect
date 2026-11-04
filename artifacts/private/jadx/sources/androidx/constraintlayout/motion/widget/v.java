package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
class v {
    private static final String G = "TouchResponse";
    private static final boolean H = false;
    private static final int I = 1000;
    private static final float J = 1.0E-7f;
    private static final float[][] K = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] L = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private static final int P = 3;
    private static final int Q = 4;
    private static final int R = 5;
    private static final int S = 0;
    private static final int T = 1;
    private static final int U = 2;
    private static final int V = 3;
    private static final int W = 4;
    private static final int X = 5;
    private static final int Y = 6;
    static final int Z = 1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final int f45469a0 = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final int f45470b0 = 4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f45471c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f45472d0 = 1;
    private float A;
    private float B;
    private float C;
    private float D;
    private int E;
    private int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f45479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f45480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f45481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f45482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f45483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f45484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f45485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f45486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f45487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float[] f45488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f45489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f45490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f45491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MotionLayout f45492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f45493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f45494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f45495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f45496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f45497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f45498z;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    class b implements NestedScrollView.e {
        b() {
        }

        @Override // androidx.core.widget.NestedScrollView.e
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        }
    }

    v(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f45473a = 0;
        this.f45474b = 0;
        this.f45475c = 0;
        this.f45476d = -1;
        this.f45477e = -1;
        this.f45478f = -1;
        this.f45479g = 0.5f;
        this.f45480h = 0.5f;
        this.f45481i = 0.5f;
        this.f45482j = 0.5f;
        this.f45483k = -1;
        this.f45484l = false;
        this.f45485m = 0.0f;
        this.f45486n = 1.0f;
        this.f45487o = false;
        this.f45488p = new float[2];
        this.f45489q = new int[2];
        this.f45493u = 4.0f;
        this.f45494v = 1.2f;
        this.f45495w = true;
        this.f45496x = 1.0f;
        this.f45497y = 0;
        this.f45498z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.f45492t = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index == androidx.constraintlayout.widget.j.c.f46599oe) {
                this.f45476d = typedArray.getResourceId(index, this.f45476d);
            } else if (index == androidx.constraintlayout.widget.j.c.f46616pe) {
                int i11 = typedArray.getInt(index, this.f45473a);
                this.f45473a = i11;
                float[] fArr = K[i11];
                this.f45480h = fArr[0];
                this.f45479g = fArr[1];
            } else if (index == androidx.constraintlayout.widget.j.c.Zd) {
                int i12 = typedArray.getInt(index, this.f45474b);
                this.f45474b = i12;
                float[][] fArr2 = L;
                if (i12 < fArr2.length) {
                    float[] fArr3 = fArr2[i12];
                    this.f45485m = fArr3[0];
                    this.f45486n = fArr3[1];
                } else {
                    this.f45486n = Float.NaN;
                    this.f45485m = Float.NaN;
                    this.f45484l = true;
                }
            } else if (index == androidx.constraintlayout.widget.j.c.f46430ee) {
                this.f45493u = typedArray.getFloat(index, this.f45493u);
            } else if (index == androidx.constraintlayout.widget.j.c.f46413de) {
                this.f45494v = typedArray.getFloat(index, this.f45494v);
            } else if (index == androidx.constraintlayout.widget.j.c.f46447fe) {
                this.f45495w = typedArray.getBoolean(index, this.f45495w);
            } else if (index == androidx.constraintlayout.widget.j.c.f46362ae) {
                this.f45496x = typedArray.getFloat(index, this.f45496x);
            } else if (index == androidx.constraintlayout.widget.j.c.f46379be) {
                this.f45498z = typedArray.getFloat(index, this.f45498z);
            } else if (index == androidx.constraintlayout.widget.j.c.f46633qe) {
                this.f45477e = typedArray.getResourceId(index, this.f45477e);
            } else if (index == androidx.constraintlayout.widget.j.c.f46481he) {
                this.f45475c = typedArray.getInt(index, this.f45475c);
            } else if (index == androidx.constraintlayout.widget.j.c.f46464ge) {
                this.f45497y = typedArray.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.j.c.f46396ce) {
                this.f45478f = typedArray.getResourceId(index, 0);
            } else if (index == androidx.constraintlayout.widget.j.c.f46498ie) {
                this.f45483k = typedArray.getResourceId(index, this.f45483k);
            } else if (index == androidx.constraintlayout.widget.j.c.f46531ke) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == androidx.constraintlayout.widget.j.c.f46548le) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == androidx.constraintlayout.widget.j.c.f46565me) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == androidx.constraintlayout.widget.j.c.f46582ne) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == androidx.constraintlayout.widget.j.c.f46514je) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == androidx.constraintlayout.widget.j.c.Yd) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.c.Xd);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    void A(float f10, float f11) {
        this.f45490r = f10;
        this.f45491s = f11;
    }

    public void B(float f10) {
        this.f45494v = f10;
    }

    public void C(float f10) {
        this.f45493u = f10;
    }

    public void D(boolean z10) {
        if (z10) {
            float[][] fArr = L;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = K;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = L;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = K;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = K[this.f45473a];
        this.f45480h = fArr5[0];
        this.f45479g = fArr5[1];
        int i10 = this.f45474b;
        float[][] fArr6 = L;
        if (i10 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i10];
        this.f45485m = fArr7[0];
        this.f45486n = fArr7[1];
    }

    public void E(float f10, float f11) {
        this.f45480h = f10;
        this.f45479g = f11;
    }

    public void F(int i10) {
        this.f45475c = i10;
    }

    void G(float f10, float f11) {
        this.f45490r = f10;
        this.f45491s = f11;
        this.f45487o = false;
    }

    void H() {
        View viewFindViewById;
        int i10 = this.f45476d;
        if (i10 != -1) {
            viewFindViewById = this.f45492t.findViewById(i10);
            if (viewFindViewById == null) {
                c.i(this.f45492t.getContext(), this.f45476d);
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }

    float a(float f10, float f11) {
        return (f10 * this.f45485m) + (f11 * this.f45486n);
    }

    public int d() {
        return this.f45476d;
    }

    public int e() {
        return this.F;
    }

    public int f() {
        return this.f45497y;
    }

    RectF g(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f45478f;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int h() {
        return this.f45478f;
    }

    float i() {
        return this.f45494v;
    }

    public float j() {
        return this.f45493u;
    }

    boolean k() {
        return this.f45495w;
    }

    float l(float f10, float f11) {
        this.f45492t.o0(this.f45476d, this.f45492t.getProgress(), this.f45480h, this.f45479g, this.f45488p);
        float f12 = this.f45485m;
        if (f12 != 0.0f) {
            float[] fArr = this.f45488p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f10 * f12) / fArr[0];
        }
        float[] fArr2 = this.f45488p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f11 * this.f45486n) / fArr2[1];
    }

    public int m() {
        return this.E;
    }

    public float n() {
        return this.A;
    }

    public float o() {
        return this.B;
    }

    public float p() {
        return this.C;
    }

    public float q() {
        return this.D;
    }

    RectF r(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f45477e;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int s() {
        return this.f45477e;
    }

    boolean t() {
        return this.f45487o;
    }

    public String toString() {
        if (Float.isNaN(this.f45485m)) {
            return f.f45124i;
        }
        return this.f45485m + " , " + this.f45486n;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    void u(MotionEvent motionEvent, MotionLayout.h hVar, int i10, t tVar) {
        char c10;
        int i11;
        char c11;
        float f10;
        char c12;
        if (this.f45484l) {
            v(motionEvent, hVar, i10, tVar);
            return;
        }
        hVar.c(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45490r = motionEvent.getRawX();
            this.f45491s = motionEvent.getRawY();
            this.f45487o = false;
            return;
        }
        if (action == 1) {
            this.f45487o = false;
            hVar.f(1000);
            float fG = hVar.g();
            float fD = hVar.d();
            float progress = this.f45492t.getProgress();
            int i12 = this.f45476d;
            if (i12 != -1) {
                this.f45492t.o0(i12, progress, this.f45480h, this.f45479g, this.f45488p);
                c10 = 0;
            } else {
                float fMin = Math.min(this.f45492t.getWidth(), this.f45492t.getHeight());
                float[] fArr = this.f45488p;
                fArr[1] = this.f45486n * fMin;
                c10 = 0;
                fArr[0] = fMin * this.f45485m;
            }
            float f11 = this.f45485m;
            float[] fArr2 = this.f45488p;
            float fAbs = f11 != 0.0f ? fG / fArr2[c10] : fD / fArr2[1];
            float f12 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f12 == 0.0f || f12 == 1.0f || (i11 = this.f45475c) == 3) {
                if (0.0f >= f12 || 1.0f <= f12) {
                    this.f45492t.setState(MotionLayout.l.FINISHED);
                    return;
                }
                return;
            }
            float f13 = ((double) f12) < 0.5d ? 0.0f : 1.0f;
            if (i11 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f13 = 1.0f;
            }
            if (this.f45475c == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f13 = 0.0f;
            }
            this.f45492t.P0(this.f45475c, f13, fAbs);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f45492t.setState(MotionLayout.l.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f45491s;
        float rawX = motionEvent.getRawX() - this.f45490r;
        if (Math.abs((this.f45485m * rawX) + (this.f45486n * rawY)) > this.f45498z || this.f45487o) {
            float progress2 = this.f45492t.getProgress();
            if (!this.f45487o) {
                this.f45487o = true;
                this.f45492t.setProgress(progress2);
            }
            int i13 = this.f45476d;
            if (i13 != -1) {
                c11 = 1;
                c12 = 0;
                f10 = progress2;
                this.f45492t.o0(i13, f10, this.f45480h, this.f45479g, this.f45488p);
            } else {
                c11 = 1;
                f10 = progress2;
                c12 = 0;
                float fMin2 = Math.min(this.f45492t.getWidth(), this.f45492t.getHeight());
                float[] fArr3 = this.f45488p;
                fArr3[1] = this.f45486n * fMin2;
                fArr3[0] = fMin2 * this.f45485m;
            }
            float f14 = this.f45485m;
            float[] fArr4 = this.f45488p;
            if (Math.abs(((f14 * fArr4[c12]) + (this.f45486n * fArr4[c11])) * this.f45496x) < 0.01d) {
                float[] fArr5 = this.f45488p;
                fArr5[c12] = 0.01f;
                fArr5[c11] = 0.01f;
            }
            float fMax = Math.max(Math.min(f10 + (this.f45485m != 0.0f ? rawX / this.f45488p[c12] : rawY / this.f45488p[c11]), 1.0f), 0.0f);
            if (this.f45475c == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.f45475c == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.f45492t.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.f45492t.h0(progress3 == 0.0f ? c11 : c12);
                }
                this.f45492t.setProgress(fMax);
                hVar.f(1000);
                this.f45492t.f44999d = this.f45485m != 0.0f ? hVar.g() / this.f45488p[c12] : hVar.d() / this.f45488p[c11];
            } else {
                this.f45492t.f44999d = 0.0f;
            }
            this.f45490r = motionEvent.getRawX();
            this.f45491s = motionEvent.getRawY();
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0278  */
    /* JADX WARN: Code duplicated, block: B:60:0x0294  */
    /* JADX WARN: Code duplicated, block: B:63:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x02bf  */
    void v(MotionEvent motionEvent, MotionLayout.h hVar, int i10, t tVar) {
        float left;
        float f10;
        int top;
        int bottom;
        int i11;
        float degrees;
        float f11;
        int i12;
        float f12;
        hVar.c(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45490r = motionEvent.getRawX();
            this.f45491s = motionEvent.getRawY();
            this.f45487o = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.f45492t.getWidth() / 2.0f;
            float height = this.f45492t.getHeight() / 2.0f;
            int i13 = this.f45483k;
            if (i13 != -1) {
                View viewFindViewById = this.f45492t.findViewById(i13);
                this.f45492t.getLocationOnScreen(this.f45489q);
                float left2 = this.f45489q[0] + ((viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f);
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.f45489q[1];
                width = left2;
            } else {
                int i14 = this.f45476d;
                if (i14 != -1) {
                    View viewFindViewById2 = this.f45492t.findViewById(this.f45492t.s0(i14).k());
                    if (viewFindViewById2 != null) {
                        this.f45492t.getLocationOnScreen(this.f45489q);
                        width = this.f45489q[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                        height = this.f45489q[1] + ((viewFindViewById2.getTop() + viewFindViewById2.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            double dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
            float fAtan2 = (float) (((dAtan2 - Math.atan2(this.f45491s - height, this.f45490r - width)) * 180.0d) / 3.141592653589793d);
            if (fAtan2 > 330.0f) {
                fAtan2 -= 360.0f;
            } else if (fAtan2 < -330.0f) {
                fAtan2 += 360.0f;
            }
            if (Math.abs(fAtan2) > 0.01d || this.f45487o) {
                float progress = this.f45492t.getProgress();
                if (!this.f45487o) {
                    this.f45487o = true;
                    this.f45492t.setProgress(progress);
                }
                int i15 = this.f45476d;
                if (i15 != -1) {
                    f12 = progress;
                    this.f45492t.o0(i15, f12, this.f45480h, this.f45479g, this.f45488p);
                    float[] fArr = this.f45488p;
                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    f12 = progress;
                    this.f45488p[1] = 360.0f;
                }
                float fMax = Math.max(Math.min(f12 + ((fAtan2 * this.f45496x) / this.f45488p[1]), 1.0f), 0.0f);
                float progress2 = this.f45492t.getProgress();
                if (fMax != progress2) {
                    if (progress2 == 0.0f || progress2 == 1.0f) {
                        this.f45492t.h0(progress2 == 0.0f);
                    }
                    this.f45492t.setProgress(fMax);
                    hVar.f(1000);
                    float fG = hVar.g();
                    double d10 = hVar.d();
                    double d11 = fG;
                    this.f45492t.f44999d = (float) Math.toDegrees((float) ((Math.hypot(d10, d11) * Math.sin(Math.atan2(d10, d11) - dAtan2)) / Math.hypot(rawX, rawY)));
                } else {
                    this.f45492t.f44999d = 0.0f;
                }
                this.f45490r = motionEvent.getRawX();
                this.f45491s = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.f45487o = false;
        hVar.f(16);
        float fG2 = hVar.g();
        float fD = hVar.d();
        float progress3 = this.f45492t.getProgress();
        float width2 = this.f45492t.getWidth() / 2.0f;
        float height2 = this.f45492t.getHeight() / 2.0f;
        int i16 = this.f45483k;
        if (i16 == -1) {
            int i17 = this.f45476d;
            if (i17 != -1) {
                View viewFindViewById3 = this.f45492t.findViewById(this.f45492t.s0(i17).k());
                this.f45492t.getLocationOnScreen(this.f45489q);
                left = this.f45489q[0] + ((viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f);
                f10 = this.f45489q[1];
                top = viewFindViewById3.getTop();
                bottom = viewFindViewById3.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            float rawY2 = motionEvent.getRawY() - height2;
            double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
            i11 = this.f45476d;
            if (i11 != -1) {
                this.f45492t.o0(i11, progress3, this.f45480h, this.f45479g, this.f45488p);
                float[] fArr2 = this.f45488p;
                fArr2[1] = (float) Math.toDegrees(fArr2[1]);
            } else {
                this.f45488p[1] = 360.0f;
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(fD + rawY2, fG2 + rawX2)) - degrees2)) * 62.5f;
            if (Float.isNaN(degrees)) {
                f11 = progress3;
            } else {
                f11 = (((degrees * 3.0f) * this.f45496x) / this.f45488p[1]) + progress3;
            }
            if (f11 != 0.0f || f11 == 1.0f || (i12 = this.f45475c) == 3) {
                if (0.0f < f11 || 1.0f <= f11) {
                    this.f45492t.setState(MotionLayout.l.FINISHED);
                }
                return;
            }
            float fAbs = (degrees * this.f45496x) / this.f45488p[1];
            float f13 = ((double) f11) < 0.5d ? 0.0f : 1.0f;
            if (i12 == 6) {
                if (progress3 + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f13 = 1.0f;
            }
            if (this.f45475c == 7) {
                if (progress3 + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f13 = 0.0f;
            }
            this.f45492t.P0(this.f45475c, f13, fAbs * 3.0f);
            if (0.0f >= progress3 || 1.0f <= progress3) {
                this.f45492t.setState(MotionLayout.l.FINISHED);
                return;
            }
            return;
        }
        View viewFindViewById4 = this.f45492t.findViewById(i16);
        this.f45492t.getLocationOnScreen(this.f45489q);
        left = this.f45489q[0] + ((viewFindViewById4.getLeft() + viewFindViewById4.getRight()) / 2.0f);
        f10 = this.f45489q[1];
        top = viewFindViewById4.getTop();
        bottom = viewFindViewById4.getBottom();
        float f14 = left;
        height2 = ((top + bottom) / 2.0f) + f10;
        width2 = f14;
        float rawX3 = motionEvent.getRawX() - width2;
        float rawY3 = motionEvent.getRawY() - height2;
        double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
        i11 = this.f45476d;
        if (i11 != -1) {
            this.f45492t.o0(i11, progress3, this.f45480h, this.f45479g, this.f45488p);
            float[] fArr3 = this.f45488p;
            fArr3[1] = (float) Math.toDegrees(fArr3[1]);
        } else {
            this.f45488p[1] = 360.0f;
        }
        degrees = ((float) (Math.toDegrees(Math.atan2(fD + rawY3, fG2 + rawX3)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees)) {
            f11 = (((degrees * 3.0f) * this.f45496x) / this.f45488p[1]) + progress3;
        } else {
            f11 = progress3;
        }
        if (f11 != 0.0f) {
        }
        if (0.0f < f11) {
        }
        this.f45492t.setState(MotionLayout.l.FINISHED);
    }

    void w(float f10, float f11) {
        float progress = this.f45492t.getProgress();
        if (!this.f45487o) {
            this.f45487o = true;
            this.f45492t.setProgress(progress);
        }
        this.f45492t.o0(this.f45476d, progress, this.f45480h, this.f45479g, this.f45488p);
        float f12 = this.f45485m;
        float[] fArr = this.f45488p;
        if (Math.abs((f12 * fArr[0]) + (this.f45486n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f45488p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f13 = this.f45485m;
        float fMax = Math.max(Math.min(progress + (f13 != 0.0f ? (f10 * f13) / this.f45488p[0] : (f11 * this.f45486n) / this.f45488p[1]), 1.0f), 0.0f);
        if (fMax != this.f45492t.getProgress()) {
            this.f45492t.setProgress(fMax);
        }
    }

    void x(float f10, float f11) {
        int i10;
        this.f45487o = false;
        float progress = this.f45492t.getProgress();
        this.f45492t.o0(this.f45476d, progress, this.f45480h, this.f45479g, this.f45488p);
        float f12 = this.f45485m;
        float[] fArr = this.f45488p;
        float f13 = f12 != 0.0f ? (f10 * f12) / fArr[0] : (f11 * this.f45486n) / fArr[1];
        if (!Float.isNaN(f13)) {
            progress += f13 / 3.0f;
        }
        if (progress == 0.0f || progress == 1.0f || (i10 = this.f45475c) == 3) {
            return;
        }
        this.f45492t.P0(i10, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f13);
    }

    public void y(int i10) {
        this.f45476d = i10;
    }

    void z(int i10) {
        this.F = i10;
    }

    v(MotionLayout motionLayout, u uVar) {
        this.f45473a = 0;
        this.f45474b = 0;
        this.f45475c = 0;
        this.f45476d = -1;
        this.f45477e = -1;
        this.f45478f = -1;
        this.f45479g = 0.5f;
        this.f45480h = 0.5f;
        this.f45481i = 0.5f;
        this.f45482j = 0.5f;
        this.f45483k = -1;
        this.f45484l = false;
        this.f45485m = 0.0f;
        this.f45486n = 1.0f;
        this.f45487o = false;
        this.f45488p = new float[2];
        this.f45489q = new int[2];
        this.f45493u = 4.0f;
        this.f45494v = 1.2f;
        this.f45495w = true;
        this.f45496x = 1.0f;
        this.f45497y = 0;
        this.f45498z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.f45492t = motionLayout;
        this.f45476d = uVar.q();
        int iR = uVar.r();
        this.f45473a = iR;
        if (iR != -1) {
            float[] fArr = K[iR];
            this.f45480h = fArr[0];
            this.f45479g = fArr[1];
        }
        int iB = uVar.b();
        this.f45474b = iB;
        float[][] fArr2 = L;
        if (iB < fArr2.length) {
            float[] fArr3 = fArr2[iB];
            this.f45485m = fArr3[0];
            this.f45486n = fArr3[1];
        } else {
            this.f45486n = Float.NaN;
            this.f45485m = Float.NaN;
            this.f45484l = true;
        }
        this.f45493u = uVar.g();
        this.f45494v = uVar.f();
        this.f45495w = uVar.h();
        this.f45496x = uVar.c();
        this.f45498z = uVar.d();
        this.f45477e = uVar.s();
        this.f45475c = uVar.j();
        this.f45497y = uVar.i();
        this.f45478f = uVar.e();
        this.f45483k = uVar.k();
        this.E = uVar.l();
        this.A = uVar.m();
        this.B = uVar.n();
        this.C = uVar.o();
        this.D = uVar.p();
        this.F = uVar.a();
    }
}
