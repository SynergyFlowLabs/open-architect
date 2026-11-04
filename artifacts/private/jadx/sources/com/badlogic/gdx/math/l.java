package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f94986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f94987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f94988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f94989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f94990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f94991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f94992h;

    public l(int i10) {
        this.f94992h = i10 > 1 ? new f0(i10) : null;
        b();
    }

    public void a(float f10) {
        this.f94990f = f10;
        float f11 = this.f94986b + f10;
        this.f94986b = f11;
        int i10 = this.f94985a + 1;
        this.f94985a = i10;
        this.f94989e = f11 / i10;
        f0 f0Var = this.f94992h;
        if (f0Var != null) {
            f0Var.a(f10);
            this.f94991g = this.f94992h.d();
        } else {
            this.f94991g = f10;
        }
        f0 f0Var2 = this.f94992h;
        if (f0Var2 == null || f0Var2.g()) {
            float f12 = this.f94991g;
            if (f12 < this.f94987c) {
                this.f94987c = f12;
            }
            if (f12 > this.f94988d) {
                this.f94988d = f12;
            }
        }
    }

    public void b() {
        this.f94985a = 0;
        this.f94986b = 0.0f;
        this.f94987c = Float.MAX_VALUE;
        this.f94988d = Float.MIN_VALUE;
        this.f94989e = 0.0f;
        this.f94990f = 0.0f;
        this.f94991g = 0.0f;
        f0 f0Var = this.f94992h;
        if (f0Var != null) {
            f0Var.b();
        }
    }
}
