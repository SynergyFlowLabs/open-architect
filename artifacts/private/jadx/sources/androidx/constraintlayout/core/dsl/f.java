package androidx.constraintlayout.core.dsl;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class f extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f43158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f43159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f43160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f43161m;

    public class a extends b.a {
        a(c.e eVar) {
            super(c.f.valueOf(eVar.name()));
        }
    }

    public f(String str) {
        super(str);
        this.f43158j = new a(c.e.LEFT);
        this.f43159k = new a(c.e.RIGHT);
        this.f43160l = new a(c.e.START);
        this.f43161m = new a(c.e.END);
        this.f43166b = new h.a(h.f43164f.get(h.b.HORIZONTAL_CHAIN));
    }

    public void A(c.d dVar, int i10, int i11) {
        a aVar = this.f43160l;
        aVar.f43084b = dVar;
        aVar.f43085c = i10;
        aVar.f43086d = i11;
        this.f43168d.put("start", aVar.toString());
    }

    public a l() {
        return this.f43161m;
    }

    public a m() {
        return this.f43158j;
    }

    public a n() {
        return this.f43159k;
    }

    public a o() {
        return this.f43160l;
    }

    public void p(c.d dVar) {
        q(dVar, 0);
    }

    public void q(c.d dVar, int i10) {
        r(dVar, i10, Integer.MIN_VALUE);
    }

    public void r(c.d dVar, int i10, int i11) {
        a aVar = this.f43161m;
        aVar.f43084b = dVar;
        aVar.f43085c = i10;
        aVar.f43086d = i11;
        this.f43168d.put("end", aVar.toString());
    }

    public void s(c.d dVar) {
        t(dVar, 0);
    }

    public void t(c.d dVar, int i10) {
        u(dVar, i10, Integer.MIN_VALUE);
    }

    public void u(c.d dVar, int i10, int i11) {
        a aVar = this.f43158j;
        aVar.f43084b = dVar;
        aVar.f43085c = i10;
        aVar.f43086d = i11;
        this.f43168d.put("left", aVar.toString());
    }

    public void v(c.d dVar) {
        w(dVar, 0);
    }

    public void w(c.d dVar, int i10) {
        x(dVar, i10, Integer.MIN_VALUE);
    }

    public void x(c.d dVar, int i10, int i11) {
        a aVar = this.f43159k;
        aVar.f43084b = dVar;
        aVar.f43085c = i10;
        aVar.f43086d = i11;
        this.f43168d.put("right", aVar.toString());
    }

    public void y(c.d dVar) {
        z(dVar, 0);
    }

    public void z(c.d dVar, int i10) {
        A(dVar, i10, Integer.MIN_VALUE);
    }

    public f(String str, String str2) {
        super(str);
        this.f43158j = new a(c.e.LEFT);
        this.f43159k = new a(c.e.RIGHT);
        this.f43160l = new a(c.e.START);
        this.f43161m = new a(c.e.END);
        this.f43167c = str2;
        this.f43166b = new h.a(h.f43164f.get(h.b.HORIZONTAL_CHAIN));
        Map<String, String> mapB = b();
        this.f43168d = mapB;
        if (mapB.containsKey("contains")) {
            s.a(this.f43168d.get("contains"), this.f43082h);
        }
    }
}
