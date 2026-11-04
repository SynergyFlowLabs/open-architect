package com.planner5d.library.widget.event.directional;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.planner5d.library.widget.VirtualJoystickView;

/* JADX INFO: loaded from: classes8.dex */
public class g extends com.planner5d.library.widget.event.directional.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.widget.event.directional.a[] f258165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f258166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f258167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f258168g;

    private static class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f258169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.planner5d.library.math.k f258170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.planner5d.library.math.k f258171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.planner5d.library.math.k f258172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.planner5d.library.math.k f258173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f258174f;

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            synchronized (this.f258174f) {
                try {
                    this.f258172d.V(this.f258170b);
                    this.f258173e.V(this.f258171c);
                    if (isInterrupted()) {
                        this.f258172d.a0();
                        this.f258173e.a0();
                    }
                    this.f258169a.q(this.f258172d, this.f258173e);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
            synchronized (this.f258174f) {
                this.f258170b.V(kVar);
                this.f258171c.V(kVar2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            do {
                c();
                try {
                    Thread.sleep(24L);
                } catch (InterruptedException unused) {
                }
            } while (!isInterrupted());
            c();
        }

        private a(i iVar) {
            this.f258170b = new com.planner5d.library.math.k();
            this.f258171c = new com.planner5d.library.math.k();
            this.f258172d = new com.planner5d.library.math.k();
            this.f258173e = new com.planner5d.library.math.k();
            this.f258174f = new Object();
            this.f258169a = iVar;
        }
    }

    public g(i iVar) {
        super(null);
        this.f258167f = null;
        this.f258168g = new Object();
        this.f258166e = iVar;
        i iVar2 = new i() { // from class: com.planner5d.library.widget.event.directional.f
            @Override // com.planner5d.library.widget.event.directional.i
            public final void q(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
                this.f258164a.h(kVar, kVar2);
            }
        };
        this.f258165d = new com.planner5d.library.widget.event.directional.a[]{new c(iVar2), new b(iVar2), new e(iVar2), new d(iVar2)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        if (this.f258166e == null) {
            return;
        }
        synchronized (this.f258168g) {
            try {
                if (kVar.D() && kVar2.D()) {
                    a aVar = this.f258167f;
                    if (aVar != null) {
                        aVar.d(kVar, kVar2);
                        this.f258167f.interrupt();
                        this.f258167f = null;
                    } else {
                        this.f258166e.q(new com.planner5d.library.math.k(kVar), new com.planner5d.library.math.k(kVar2));
                    }
                } else {
                    a aVar2 = this.f258167f;
                    if (aVar2 == null) {
                        a aVar3 = new a(this.f258166e);
                        this.f258167f = aVar3;
                        aVar3.start();
                        this.f258167f.d(kVar, kVar2);
                        this.f258167f.c();
                    } else {
                        aVar2.d(kVar, kVar2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean a(int i10, int i11, int i12, int i13, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return false;
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean b(int i10, KeyEvent keyEvent, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return false;
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean c(MotionEvent motionEvent, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return false;
    }

    @Override // com.planner5d.library.widget.event.directional.a
    public boolean f(int i10, int i11, int i12, int i13) {
        for (com.planner5d.library.widget.event.directional.a aVar : this.f258165d) {
            if (aVar.f(i10, i11, i12, i13)) {
                return true;
            }
        }
        return false;
    }

    public void i(double d10) {
        i iVar = this.f258166e;
        if (iVar != null) {
            iVar.g(d10);
        }
    }

    public void j(com.planner5d.library.widget.editor.a.d dVar, VirtualJoystickView virtualJoystickView) {
        for (com.planner5d.library.widget.event.directional.a aVar : this.f258165d) {
            if (aVar instanceof d) {
                ((d) aVar).g().f(dVar, virtualJoystickView);
            }
        }
    }

    @Override // com.planner5d.library.widget.event.directional.a, android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        for (com.planner5d.library.widget.event.directional.a aVar : this.f258165d) {
            if (aVar.onGenericMotion(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.planner5d.library.widget.event.directional.a, android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        for (com.planner5d.library.widget.event.directional.a aVar : this.f258165d) {
            if (aVar.onKey(view, i10, keyEvent)) {
                return true;
            }
        }
        return false;
    }
}
