package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class z {
    public static final String A = "ConstraintOverride";
    public static final String B = "CustomAttribute";
    public static final String C = "CustomMethod";
    private static final int D = -1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    static final int J = 0;
    static final int K = 1;
    static final int L = 2;
    private static final int M = -1;
    private static final int N = -2;
    static final int O = 0;
    static final int P = 1;
    static final int Q = 2;
    static final int R = 3;
    static final int S = 4;
    static final int T = 5;
    static final int U = 6;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f45504x = "ViewTransition";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f45505y = "ViewTransition";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f45506z = "KeyFrameSet";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    androidx.constraintlayout.widget.f f45507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45508b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f45512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    i f45513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    androidx.constraintlayout.widget.f.a f45514h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f45517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f45518l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Context f45522p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45509c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f45510d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45511e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f45515i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45516j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f45519m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f45520n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f45521o = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f45523q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f45524r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f45525s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f45526t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f45527u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f45528v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f45529w = -1;

    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f45530a;

        a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f45530a = dVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f45530a.a(f10);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f45534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        o f45535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f45537f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        a0 f45539h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Interpolator f45540i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f45542k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f45543l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f45544m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f45546o;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.g f45538g = new androidx.constraintlayout.core.motion.utils.g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f45541j = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Rect f45545n = new Rect();

        b(a0 a0Var, o oVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            this.f45546o = false;
            this.f45539h = a0Var;
            this.f45535d = oVar;
            this.f45536e = i10;
            this.f45537f = i11;
            long jNanoTime = System.nanoTime();
            this.f45534c = jNanoTime;
            this.f45544m = jNanoTime;
            this.f45539h.c(this);
            this.f45540i = interpolator;
            this.f45532a = i13;
            this.f45533b = i14;
            if (i12 == 3) {
                this.f45546o = true;
            }
            this.f45543l = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            a();
        }

        void a() {
            if (this.f45541j) {
                c();
            } else {
                b();
            }
        }

        void b() {
            long jNanoTime = System.nanoTime();
            long j10 = jNanoTime - this.f45544m;
            this.f45544m = jNanoTime;
            float f10 = this.f45542k + (((float) (j10 * 1.0E-6d)) * this.f45543l);
            this.f45542k = f10;
            if (f10 >= 1.0f) {
                this.f45542k = 1.0f;
            }
            Interpolator interpolator = this.f45540i;
            float interpolation = interpolator == null ? this.f45542k : interpolator.getInterpolation(this.f45542k);
            o oVar = this.f45535d;
            boolean zL = oVar.L(oVar.f45323b, interpolation, jNanoTime, this.f45538g);
            if (this.f45542k >= 1.0f) {
                if (this.f45532a != -1) {
                    this.f45535d.J().setTag(this.f45532a, Long.valueOf(System.nanoTime()));
                }
                if (this.f45533b != -1) {
                    this.f45535d.J().setTag(this.f45533b, null);
                }
                if (!this.f45546o) {
                    this.f45539h.k(this);
                }
            }
            if (this.f45542k >= 1.0f && !zL) {
                return;
            }
            this.f45539h.g();
        }

        void c() {
            long jNanoTime = System.nanoTime();
            long j10 = jNanoTime - this.f45544m;
            this.f45544m = jNanoTime;
            float f10 = this.f45542k - (((float) (j10 * 1.0E-6d)) * this.f45543l);
            this.f45542k = f10;
            if (f10 < 0.0f) {
                this.f45542k = 0.0f;
            }
            Interpolator interpolator = this.f45540i;
            float interpolation = interpolator == null ? this.f45542k : interpolator.getInterpolation(this.f45542k);
            o oVar = this.f45535d;
            boolean zL = oVar.L(oVar.f45323b, interpolation, jNanoTime, this.f45538g);
            if (this.f45542k <= 0.0f) {
                if (this.f45532a != -1) {
                    this.f45535d.J().setTag(this.f45532a, Long.valueOf(System.nanoTime()));
                }
                if (this.f45533b != -1) {
                    this.f45535d.J().setTag(this.f45533b, null);
                }
                this.f45539h.k(this);
            }
            if (this.f45542k > 0.0f || zL) {
                this.f45539h.g();
            }
        }

        public void d(int i10, float f10, float f11) {
            if (i10 == 1) {
                if (this.f45541j) {
                    return;
                }
                e(true);
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f45535d.J().getHitRect(this.f45545n);
                if (this.f45545n.contains((int) f10, (int) f11) || this.f45541j) {
                    return;
                }
                e(true);
            }
        }

        void e(boolean z10) {
            int i10;
            this.f45541j = z10;
            if (z10 && (i10 = this.f45537f) != -1) {
                this.f45543l = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            }
            this.f45539h.g();
            this.f45544m = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    z(Context context, XmlPullParser xmlPullParser) {
        byte b10;
        this.f45522p = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals(A)) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals(f45506z)) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals(C)) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals(B)) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 0) {
                        m(context, xmlPullParser);
                    } else if (b10 == 1) {
                        this.f45513g = new i(context, xmlPullParser);
                    } else if (b10 == 2) {
                        this.f45514h = androidx.constraintlayout.widget.f.w(context, xmlPullParser);
                    } else if (b10 == 3 || b10 == 4) {
                        androidx.constraintlayout.widget.a.q(context, xmlPullParser, this.f45514h.f45928g);
                    } else {
                        c.f();
                        xmlPullParser.getLineNumber();
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public static /* synthetic */ void a(z zVar, View[] viewArr) {
        if (zVar.f45523q != -1) {
            for (View view : viewArr) {
                view.setTag(zVar.f45523q, Long.valueOf(System.nanoTime()));
            }
        }
        if (zVar.f45524r != -1) {
            for (View view2 : viewArr) {
                view2.setTag(zVar.f45524r, null);
            }
        }
    }

    private void m(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.j.c.f46753xf);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == androidx.constraintlayout.widget.j.c.f46770yf) {
                this.f45508b = typedArrayObtainStyledAttributes.getResourceId(index, this.f45508b);
            } else if (index == androidx.constraintlayout.widget.j.c.Gf) {
                if (MotionLayout.f44987u4) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f45517k);
                    this.f45517k = resourceId;
                    if (resourceId == -1) {
                        this.f45518l = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f45518l = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f45517k = typedArrayObtainStyledAttributes.getResourceId(index, this.f45517k);
                }
            } else if (index == androidx.constraintlayout.widget.j.c.Hf) {
                this.f45509c = typedArrayObtainStyledAttributes.getInt(index, this.f45509c);
            } else if (index == androidx.constraintlayout.widget.j.c.Kf) {
                this.f45510d = typedArrayObtainStyledAttributes.getBoolean(index, this.f45510d);
            } else if (index == androidx.constraintlayout.widget.j.c.If) {
                this.f45511e = typedArrayObtainStyledAttributes.getInt(index, this.f45511e);
            } else if (index == androidx.constraintlayout.widget.j.c.Cf) {
                this.f45515i = typedArrayObtainStyledAttributes.getInt(index, this.f45515i);
            } else if (index == androidx.constraintlayout.widget.j.c.Lf) {
                this.f45516j = typedArrayObtainStyledAttributes.getInt(index, this.f45516j);
            } else if (index == androidx.constraintlayout.widget.j.c.Mf) {
                this.f45512f = typedArrayObtainStyledAttributes.getInt(index, this.f45512f);
            } else if (index == androidx.constraintlayout.widget.j.c.Ff) {
                int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f45521o = resourceId2;
                    if (resourceId2 != -1) {
                        this.f45519m = -2;
                    }
                } else if (i11 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f45520n = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f45519m = -1;
                    } else {
                        this.f45521o = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f45519m = -2;
                    }
                } else {
                    this.f45519m = typedArrayObtainStyledAttributes.getInteger(index, this.f45519m);
                }
            } else if (index == androidx.constraintlayout.widget.j.c.Jf) {
                this.f45523q = typedArrayObtainStyledAttributes.getResourceId(index, this.f45523q);
            } else if (index == androidx.constraintlayout.widget.j.c.Bf) {
                this.f45524r = typedArrayObtainStyledAttributes.getResourceId(index, this.f45524r);
            } else if (index == androidx.constraintlayout.widget.j.c.Ef) {
                this.f45525s = typedArrayObtainStyledAttributes.getResourceId(index, this.f45525s);
            } else if (index == androidx.constraintlayout.widget.j.c.Df) {
                this.f45526t = typedArrayObtainStyledAttributes.getResourceId(index, this.f45526t);
            } else if (index == androidx.constraintlayout.widget.j.c.Af) {
                this.f45528v = typedArrayObtainStyledAttributes.getResourceId(index, this.f45528v);
            } else if (index == androidx.constraintlayout.widget.j.c.f46787zf) {
                this.f45527u = typedArrayObtainStyledAttributes.getInteger(index, this.f45527u);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void u(t.b bVar, View view) {
        int i10 = this.f45515i;
        if (i10 != -1) {
            bVar.O(i10);
        }
        bVar.U(this.f45511e);
        bVar.Q(this.f45519m, this.f45520n, this.f45521o);
        int id2 = view.getId();
        i iVar = this.f45513g;
        if (iVar != null) {
            ArrayList<f> arrayListD = iVar.d(-1);
            i iVar2 = new i();
            Iterator<f> it = arrayListD.iterator();
            while (it.hasNext()) {
                iVar2.c(it.next().clone().k(id2));
            }
            bVar.t(iVar2);
        }
    }

    void b(a0 a0Var, MotionLayout motionLayout, View view) {
        o oVar = new o(view);
        oVar.R(view);
        this.f45513g.a(oVar);
        oVar.a0(motionLayout.getWidth(), motionLayout.getHeight(), this.f45515i, System.nanoTime());
        new b(a0Var, oVar, this.f45515i, this.f45516j, this.f45509c, f(motionLayout.getContext()), this.f45523q, this.f45524r);
    }

    void c(a0 a0Var, MotionLayout motionLayout, int i10, androidx.constraintlayout.widget.f fVar, final View... viewArr) {
        if (this.f45510d) {
            return;
        }
        int i11 = this.f45512f;
        if (i11 == 2) {
            b(a0Var, motionLayout, viewArr[0]);
            return;
        }
        if (i11 == 1) {
            for (int i12 : motionLayout.getConstraintSetIds()) {
                if (i12 != i10) {
                    androidx.constraintlayout.widget.f fVarP0 = motionLayout.p0(i12);
                    for (View view : viewArr) {
                        androidx.constraintlayout.widget.f.a aVarK0 = fVarP0.k0(view.getId());
                        androidx.constraintlayout.widget.f.a aVar = this.f45514h;
                        if (aVar != null) {
                            aVar.h(aVarK0);
                            aVarK0.f45928g.putAll(this.f45514h.f45928g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.f fVar2 = new androidx.constraintlayout.widget.f();
        fVar2.I(fVar);
        for (View view2 : viewArr) {
            androidx.constraintlayout.widget.f.a aVarK1 = fVar2.k0(view2.getId());
            androidx.constraintlayout.widget.f.a aVar2 = this.f45514h;
            if (aVar2 != null) {
                aVar2.h(aVarK1);
                aVarK1.f45928g.putAll(this.f45514h.f45928g);
            }
        }
        motionLayout.a1(i10, fVar2);
        motionLayout.a1(androidx.constraintlayout.widget.j.b.f46307j1, fVar);
        motionLayout.setState(androidx.constraintlayout.widget.j.b.f46307j1, -1, -1);
        t.b bVar = new t.b(-1, motionLayout.f44993a, androidx.constraintlayout.widget.j.b.f46307j1, i10);
        for (View view3 : viewArr) {
            u(bVar, view3);
        }
        motionLayout.setTransition(bVar);
        motionLayout.S0(new Runnable() { // from class: androidx.constraintlayout.motion.widget.y
            @Override // java.lang.Runnable
            public final void run() {
                z.a(this.f45502a, viewArr);
            }
        });
    }

    boolean d(View view) {
        int i10 = this.f45525s;
        boolean z10 = i10 == -1 || view.getTag(i10) != null;
        int i11 = this.f45526t;
        return z10 && (i11 == -1 || view.getTag(i11) == null);
    }

    int e() {
        return this.f45508b;
    }

    Interpolator f(Context context) {
        int i10 = this.f45519m;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(context, this.f45521o);
        }
        if (i10 == -1) {
            return new a(androidx.constraintlayout.core.motion.utils.d.c(this.f45520n));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int g() {
        return this.f45527u;
    }

    public int h() {
        return this.f45529w;
    }

    public int i() {
        return this.f45528v;
    }

    public int j() {
        return this.f45509c;
    }

    boolean k() {
        return !this.f45510d;
    }

    boolean l(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f45517k != -1 || this.f45518l != null) && d(view)) {
            if (view.getId() == this.f45517k) {
                return true;
            }
            return this.f45518l != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).f45678c0) != null && str.matches(this.f45518l);
        }
        return false;
    }

    void n(boolean z10) {
        this.f45510d = !z10;
    }

    void o(int i10) {
        this.f45508b = i10;
    }

    public void p(int i10) {
        this.f45527u = i10;
    }

    public void q(int i10) {
        this.f45529w = i10;
    }

    public void r(int i10) {
        this.f45528v = i10;
    }

    public void s(int i10) {
        this.f45509c = i10;
    }

    boolean t(int i10) {
        int i11 = this.f45509c;
        if (i11 == 1) {
            return i10 == 0;
        }
        if (i11 == 2) {
            return i10 == 1;
        }
        return i11 == 3 && i10 == 0;
    }

    public String toString() {
        return "ViewTransition(" + c.i(this.f45522p, this.f45508b) + ")";
    }
}
