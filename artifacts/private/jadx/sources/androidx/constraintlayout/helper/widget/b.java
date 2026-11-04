package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.motion.widget.t;
import androidx.constraintlayout.widget.j;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class b extends p {

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final boolean f44855r3 = false;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final String f44856s3 = "Carousel";

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final int f44857t3 = 1;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final int f44858u3 = 2;
    private int H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f44859g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f44860h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private float f44861i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f44862j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f44863k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private int f44864l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private float f44865m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private int f44866n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC0362b f44867o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private int f44868o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f44869p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f44870p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f44871p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    int f44872p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    Runnable f44873q3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<View> f44874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f44875t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f44876v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private MotionLayout f44877w;

    class a implements Runnable {

        /* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.b$a$a, reason: collision with other inner class name */
        class RunnableC0361a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f44879a;

            RunnableC0361a(float f10) {
                this.f44879a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f44877w.P0(5, 1.0f, this.f44879a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f44877w.setProgress(0.0f);
            b.this.c0();
            b.this.f44867o.a(b.this.f44876v);
            float velocity = b.this.f44877w.getVelocity();
            if (b.this.f44864l3 != 2 || velocity <= b.this.f44865m3 || b.this.f44876v >= b.this.f44867o.count() - 1) {
                return;
            }
            float f10 = velocity * b.this.f44861i3;
            if (b.this.f44876v != 0 || b.this.f44875t <= b.this.f44876v) {
                if (b.this.f44876v != b.this.f44867o.count() - 1 || b.this.f44875t >= b.this.f44876v) {
                    b.this.f44877w.post(new RunnableC0361a(f10));
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0362b {
        void a(int i10);

        void b(View view, int i10);

        int count();
    }

    public b(Context context) {
        super(context);
        this.f44867o = null;
        this.f44874s = new ArrayList<>();
        this.f44875t = 0;
        this.f44876v = 0;
        this.f44869p0 = -1;
        this.f44870p1 = false;
        this.H1 = -1;
        this.f44871p2 = -1;
        this.f44859g3 = -1;
        this.f44860h3 = -1;
        this.f44861i3 = 0.9f;
        this.f44862j3 = 0;
        this.f44863k3 = 4;
        int i10 = 2 & 1;
        this.f44864l3 = 1;
        this.f44865m3 = 2.0f;
        this.f44866n3 = -1;
        this.f44868o3 = 200;
        this.f44872p3 = -1;
        this.f44873q3 = new a();
    }

    public static /* synthetic */ void M(b bVar) {
        bVar.f44877w.setTransitionDuration(bVar.f44868o3);
        if (bVar.f44866n3 < bVar.f44876v) {
            bVar.f44877w.W0(bVar.f44859g3, bVar.f44868o3);
        } else {
            bVar.f44877w.W0(bVar.f44860h3, bVar.f44868o3);
        }
    }

    private void V(boolean z10) {
        Iterator<t.b> it = this.f44877w.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().P(z10);
        }
    }

    private boolean W(int i10, boolean z10) {
        MotionLayout motionLayout;
        t.b bVarT0;
        if (i10 == -1 || (motionLayout = this.f44877w) == null || (bVarT0 = motionLayout.t0(i10)) == null || z10 == bVarT0.K()) {
            return false;
        }
        bVarT0.P(z10);
        return true;
    }

    private void X(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.f46347a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46415e) {
                    this.f44869p0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44869p0);
                } else if (index == j.c.f46381c) {
                    this.H1 = typedArrayObtainStyledAttributes.getResourceId(index, this.H1);
                } else if (index == j.c.f46432f) {
                    this.f44871p2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44871p2);
                } else if (index == j.c.f46398d) {
                    this.f44863k3 = typedArrayObtainStyledAttributes.getInt(index, this.f44863k3);
                } else if (index == j.c.f46483i) {
                    this.f44859g3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44859g3);
                } else if (index == j.c.f46466h) {
                    this.f44860h3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44860h3);
                } else if (index == j.c.f46516k) {
                    this.f44861i3 = typedArrayObtainStyledAttributes.getFloat(index, this.f44861i3);
                } else if (index == j.c.f46499j) {
                    this.f44864l3 = typedArrayObtainStyledAttributes.getInt(index, this.f44864l3);
                } else if (index == j.c.f46533l) {
                    this.f44865m3 = typedArrayObtainStyledAttributes.getFloat(index, this.f44865m3);
                } else if (index == j.c.f46449g) {
                    this.f44870p1 = typedArrayObtainStyledAttributes.getBoolean(index, this.f44870p1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        InterfaceC0362b interfaceC0362b = this.f44867o;
        if (interfaceC0362b == null || this.f44877w == null || interfaceC0362b.count() == 0) {
            return;
        }
        int size = this.f44874s.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.f44874s.get(i10);
            int iCount = (this.f44876v + i10) - this.f44862j3;
            if (this.f44870p1) {
                if (iCount < 0) {
                    int i11 = this.f44863k3;
                    if (i11 != 4) {
                        e0(view, i11);
                    } else {
                        e0(view, 0);
                    }
                    if (iCount % this.f44867o.count() == 0) {
                        this.f44867o.b(view, 0);
                    } else {
                        InterfaceC0362b interfaceC0362b2 = this.f44867o;
                        interfaceC0362b2.b(view, interfaceC0362b2.count() + (iCount % this.f44867o.count()));
                    }
                } else if (iCount >= this.f44867o.count()) {
                    if (iCount == this.f44867o.count()) {
                        iCount = 0;
                    } else if (iCount > this.f44867o.count()) {
                        iCount %= this.f44867o.count();
                    }
                    int i12 = this.f44863k3;
                    if (i12 != 4) {
                        e0(view, i12);
                    } else {
                        e0(view, 0);
                    }
                    this.f44867o.b(view, iCount);
                } else {
                    e0(view, 0);
                    this.f44867o.b(view, iCount);
                }
            } else if (iCount < 0) {
                e0(view, this.f44863k3);
            } else if (iCount >= this.f44867o.count()) {
                e0(view, this.f44863k3);
            } else {
                e0(view, 0);
                this.f44867o.b(view, iCount);
            }
        }
        int i13 = this.f44866n3;
        if (i13 != -1 && i13 != this.f44876v) {
            this.f44877w.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.M(this.f44854a);
                }
            });
        } else if (i13 == this.f44876v) {
            this.f44866n3 = -1;
        }
        if (this.H1 == -1 || this.f44871p2 == -1 || this.f44870p1) {
            return;
        }
        int iCount2 = this.f44867o.count();
        if (this.f44876v == 0) {
            W(this.H1, false);
        } else {
            W(this.H1, true);
            this.f44877w.setTransition(this.H1);
        }
        if (this.f44876v == iCount2 - 1) {
            W(this.f44871p2, false);
        } else {
            W(this.f44871p2, true);
            this.f44877w.setTransition(this.f44871p2);
        }
    }

    private boolean d0(int i10, View view, int i11) {
        androidx.constraintlayout.widget.f.a aVarK0;
        androidx.constraintlayout.widget.f fVarP0 = this.f44877w.p0(i10);
        if (fVarP0 != null && (aVarK0 = fVarP0.k0(view.getId())) != null) {
            aVarK0.f45924c.f46052c = 1;
            view.setVisibility(i11);
            return true;
        }
        return false;
    }

    private boolean e0(View view, int i10) {
        MotionLayout motionLayout = this.f44877w;
        if (motionLayout == null) {
            return false;
        }
        boolean zD0 = false;
        for (int i11 : motionLayout.getConstraintSetIds()) {
            zD0 |= d0(i11, view, i10);
        }
        return zD0;
    }

    public boolean Y() {
        return this.f44870p1;
    }

    public void Z(int i10) {
        this.f44876v = Math.max(0, Math.min(getCount() - 1, i10));
        a0();
    }

    public void a0() {
        int size = this.f44874s.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.f44874s.get(i10);
            if (this.f44867o.count() == 0) {
                e0(view, this.f44863k3);
            } else {
                e0(view, 0);
            }
        }
        this.f44877w.H0();
        c0();
    }

    public void b0(int i10, int i11) {
        this.f44866n3 = Math.max(0, Math.min(getCount() - 1, i10));
        int iMax = Math.max(0, i11);
        this.f44868o3 = iMax;
        this.f44877w.setTransitionDuration(iMax);
        if (i10 < this.f44876v) {
            this.f44877w.W0(this.f44859g3, this.f44868o3);
        } else {
            this.f44877w.W0(this.f44860h3, this.f44868o3);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.p, androidx.constraintlayout.motion.widget.MotionLayout.k
    public void g(MotionLayout motionLayout, int i10, int i11, float f10) {
        this.f44872p3 = i10;
    }

    public int getCount() {
        InterfaceC0362b interfaceC0362b = this.f44867o;
        if (interfaceC0362b != null) {
            return interfaceC0362b.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f44876v;
    }

    @Override // androidx.constraintlayout.motion.widget.p, androidx.constraintlayout.motion.widget.MotionLayout.k
    public void i(MotionLayout motionLayout, int i10) {
        int i11 = this.f44876v;
        this.f44875t = i11;
        if (i10 == this.f44860h3) {
            this.f44876v = i11 + 1;
        } else if (i10 == this.f44859g3) {
            this.f44876v = i11 - 1;
        }
        if (this.f44870p1) {
            if (this.f44876v >= this.f44867o.count()) {
                this.f44876v = 0;
            }
            if (this.f44876v < 0) {
                this.f44876v = this.f44867o.count() - 1;
            }
        } else {
            if (this.f44876v >= this.f44867o.count()) {
                this.f44876v = this.f44867o.count() - 1;
            }
            if (this.f44876v < 0) {
                this.f44876v = 0;
            }
        }
        if (this.f44875t != this.f44876v) {
            this.f44877w.post(this.f44873q3);
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            this.f44874s.clear();
            for (int i10 = 0; i10 < this.f45787b; i10++) {
                int i11 = this.f45786a[i10];
                View viewById = motionLayout.getViewById(i11);
                if (this.f44869p0 == i11) {
                    this.f44862j3 = i10;
                }
                this.f44874s.add(viewById);
            }
            this.f44877w = motionLayout;
            if (this.f44864l3 == 2) {
                t.b bVarT0 = motionLayout.t0(this.f44871p2);
                if (bVarT0 != null) {
                    bVarT0.T(5);
                }
                t.b bVarT1 = this.f44877w.t0(this.H1);
                if (bVarT1 != null) {
                    bVarT1.T(5);
                }
            }
            c0();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44874s.clear();
    }

    public void setAdapter(InterfaceC0362b interfaceC0362b) {
        this.f44867o = interfaceC0362b;
    }

    public void setInfinite(boolean z10) {
        this.f44870p1 = z10;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44867o = null;
        this.f44874s = new ArrayList<>();
        this.f44875t = 0;
        this.f44876v = 0;
        this.f44869p0 = -1;
        this.f44870p1 = false;
        this.H1 = -1;
        this.f44871p2 = -1;
        this.f44859g3 = -1;
        this.f44860h3 = -1;
        this.f44861i3 = 0.9f;
        this.f44862j3 = 0;
        this.f44863k3 = 4;
        int i10 = 6 << 1;
        this.f44864l3 = 1;
        this.f44865m3 = 2.0f;
        this.f44866n3 = -1;
        this.f44868o3 = 200;
        this.f44872p3 = -1;
        this.f44873q3 = new a();
        X(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44867o = null;
        this.f44874s = new ArrayList<>();
        this.f44875t = 0;
        this.f44876v = 0;
        this.f44869p0 = -1;
        this.f44870p1 = false;
        this.H1 = -1;
        this.f44871p2 = -1;
        this.f44859g3 = -1;
        this.f44860h3 = -1;
        this.f44861i3 = 0.9f;
        this.f44862j3 = 0;
        this.f44863k3 = 4;
        this.f44864l3 = 1;
        this.f44865m3 = 2.0f;
        this.f44866n3 = -1;
        this.f44868o3 = 200;
        this.f44872p3 = -1;
        this.f44873q3 = new a();
        X(context, attributeSet);
    }
}
