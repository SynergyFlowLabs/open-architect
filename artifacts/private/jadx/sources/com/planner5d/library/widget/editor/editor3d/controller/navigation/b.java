package com.planner5d.library.widget.editor.editor3d.controller.navigation;

/* JADX INFO: loaded from: classes12.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f255478a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f255479b;

    b(j jVar) {
        this.f255479b = jVar;
    }

    void a() {
        a aVar = this.f255478a;
        if (aVar != null) {
            aVar.c(this.f255479b);
            this.f255478a = null;
        }
    }

    void b(j jVar, j jVar2, int i10) {
        a aVar = new a(i10, jVar, jVar2);
        this.f255478a = null;
        if (i10 > 0) {
            this.f255478a = aVar;
        } else {
            aVar.c(this.f255479b);
        }
    }

    boolean c() {
        a aVar = this.f255478a;
        if (aVar == null) {
            return false;
        }
        if (aVar.a(this.f255479b)) {
            return true;
        }
        this.f255478a = null;
        return false;
    }
}
