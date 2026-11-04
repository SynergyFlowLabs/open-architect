package com.planner5d.library.widget.editor.editor3dcardboard;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class b implements com.planner5d.library.engine.l, View.OnGenericMotionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f255925a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1730b f255926b = new C1730b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.widget.event.directional.g f255927c = new com.planner5d.library.widget.event.directional.g(new a());

    class a implements com.planner5d.library.widget.event.directional.i {
        a() {
        }

        private float c(com.planner5d.library.math.k kVar) {
            return Math.abs(Math.abs(kVar.f180480a) > Math.abs(kVar.f180481b) ? kVar.f180480a : kVar.f180481b) * 1.5f;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0045  */
        @Override // com.planner5d.library.widget.event.directional.i
        public void q(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
            Integer num;
            if (kVar.D()) {
                kVar.V(kVar2);
            }
            if (kVar.D()) {
                num = null;
            } else {
                float f10 = kVar.f180480a;
                if (f10 < 0.0f) {
                    num = 3;
                } else if (f10 > 0.0f) {
                    num = 4;
                } else {
                    float f11 = kVar.f180481b;
                    if (f11 < 0.0f) {
                        num = 1;
                    } else if (f11 > 0.0f) {
                        num = 2;
                    } else {
                        num = null;
                    }
                }
            }
            b.this.f(num, c(kVar), true);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.editor3dcardboard.b$b, reason: collision with other inner class name */
    static class C1730b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f255929d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f255930e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f255931f = 3;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f255932g = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f255933a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f255934b = 1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f255935c = true;

        C1730b() {
        }

        public void c(C1730b c1730b) {
            c1730b.f255934b = this.f255934b;
            c1730b.f255933a = this.f255933a;
            c1730b.f255935c = this.f255935c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Integer num, float f10, boolean z10) {
        synchronized (this.f255926b) {
            try {
                C1730b c1730b = this.f255926b;
                c1730b.f255933a = num;
                c1730b.f255934b = f10;
                c1730b.f255935c = z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void b(C1730b c1730b) {
        synchronized (this.f255926b) {
            try {
                this.f255926b.c(c1730b);
                if (c1730b.f255935c) {
                    this.f255926b.f255933a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.engine.l
    public boolean c(int i10, int i11, int i12, int i13) {
        f(null, 1.0f, false);
        return true;
    }

    @Override // com.planner5d.library.engine.l
    public boolean d(int i10, int i11, int i12, int i13) {
        f(1, 1.0f, false);
        return true;
    }

    void e() {
        synchronized (this.f255926b) {
            try {
                Integer num = this.f255926b.f255933a;
                f((num == null || num.intValue() != 1) ? 1 : null, 1.0f, false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.engine.l
    public boolean k(int i10, int i11, int i12) {
        return false;
    }

    @Override // com.planner5d.library.engine.l
    public boolean l(int i10) {
        return false;
    }

    @Override // com.planner5d.library.engine.l
    public boolean n(int i10, int i11) {
        return false;
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        boolean zOnGenericMotion;
        synchronized (this.f255925a) {
            zOnGenericMotion = this.f255927c.onGenericMotion(view, motionEvent);
        }
        return zOnGenericMotion;
    }

    @Override // com.planner5d.library.engine.l
    public boolean p(int i10) {
        this.f255927c.onKey(null, i10, new KeyEvent(1, i10));
        return false;
    }

    @Override // com.planner5d.library.engine.l
    public boolean r(int i10) {
        this.f255927c.onKey(null, i10, new KeyEvent(0, i10));
        return false;
    }

    @Override // com.planner5d.library.engine.l
    public boolean s(char c10) {
        return false;
    }
}
