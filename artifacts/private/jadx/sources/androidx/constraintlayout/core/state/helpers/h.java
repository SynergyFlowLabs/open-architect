package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.k;

/* JADX INFO: loaded from: classes2.dex */
public class h implements e, androidx.constraintlayout.core.state.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final k f44315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.h f44317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44318d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44319e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f44320f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f44321g;

    public h(k kVar) {
        this.f44315a = kVar;
    }

    @Override // androidx.constraintlayout.core.state.helpers.e, androidx.constraintlayout.core.state.h
    public androidx.constraintlayout.core.widgets.e a() {
        if (this.f44317c == null) {
            this.f44317c = new androidx.constraintlayout.core.widgets.h();
        }
        return this.f44317c;
    }

    @Override // androidx.constraintlayout.core.state.helpers.e, androidx.constraintlayout.core.state.h
    public void apply() {
        this.f44317c.D2(this.f44316b);
        int i10 = this.f44318d;
        if (i10 != -1) {
            this.f44317c.y2(i10);
            return;
        }
        int i11 = this.f44319e;
        if (i11 != -1) {
            this.f44317c.z2(i11);
        } else {
            this.f44317c.A2(this.f44320f);
        }
    }

    @Override // androidx.constraintlayout.core.state.h
    public void b(androidx.constraintlayout.core.widgets.e eVar) {
        if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
            this.f44317c = (androidx.constraintlayout.core.widgets.h) eVar;
        } else {
            this.f44317c = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.h
    public void c(Object obj) {
        this.f44321g = obj;
    }

    @Override // androidx.constraintlayout.core.state.h
    public e d() {
        return null;
    }

    public h e(Object obj) {
        this.f44318d = -1;
        this.f44319e = this.f44315a.g(obj);
        this.f44320f = 0.0f;
        return this;
    }

    public int f() {
        return this.f44316b;
    }

    public h g(float f10) {
        this.f44318d = -1;
        this.f44319e = -1;
        this.f44320f = f10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.h
    public Object getKey() {
        return this.f44321g;
    }

    public void h(int i10) {
        this.f44316b = i10;
    }

    public h i(Object obj) {
        this.f44318d = this.f44315a.g(obj);
        this.f44319e = -1;
        this.f44320f = 0.0f;
        return this;
    }
}
