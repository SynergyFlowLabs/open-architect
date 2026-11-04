package com.planner5d.library.widget.editor.editor3d.model;

/* JADX INFO: loaded from: classes12.dex */
public class g implements fc.a.InterfaceC1901a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.engine.a f255747c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f255745a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f255746b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f255748d = new Object();

    public g(com.planner5d.library.engine.a aVar) {
        this.f255747c = aVar;
    }

    @Override // fc.a.InterfaceC1901a
    public boolean a() {
        boolean z10;
        synchronized (this.f255748d) {
            try {
                if (this.f255747c.k()) {
                    this.f255745a = true;
                }
                z10 = this.f255745a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f255748d) {
            z10 = this.f255746b;
        }
        return z10;
    }

    public void c() {
        synchronized (this.f255748d) {
            try {
                this.f255745a = true;
                this.f255746b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        synchronized (this.f255748d) {
            this.f255745a = true;
        }
    }
}
