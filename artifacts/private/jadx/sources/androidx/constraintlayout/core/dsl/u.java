package androidx.constraintlayout.core.dsl;

import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class u extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f43345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f43346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f43347l;

    public class a extends b.a {
        a(c.h hVar) {
            super(c.f.valueOf(hVar.name()));
        }
    }

    public u(String str) {
        super(str);
        this.f43345j = new a(c.h.TOP);
        this.f43346k = new a(c.h.BOTTOM);
        this.f43347l = new a(c.h.BASELINE);
        this.f43166b = new h.a(h.f43164f.get(h.b.VERTICAL_CHAIN));
    }

    public a l() {
        return this.f43347l;
    }

    public a m() {
        return this.f43346k;
    }

    public a n() {
        return this.f43345j;
    }

    public void o(c.g gVar) {
        p(gVar, 0);
    }

    public void p(c.g gVar, int i10) {
        q(gVar, i10, Integer.MIN_VALUE);
    }

    public void q(c.g gVar, int i10, int i11) {
        a aVar = this.f43347l;
        aVar.f43084b = gVar;
        aVar.f43085c = i10;
        aVar.f43086d = i11;
        this.f43168d.put("baseline", aVar.toString());
    }

    public void r(c.g gVar) {
        s(gVar, 0);
    }

    public void s(c.g gVar, int i10) {
        t(gVar, i10, Integer.MIN_VALUE);
    }

    public void t(c.g gVar, int i10, int i11) {
        a aVar = this.f43346k;
        aVar.f43084b = gVar;
        aVar.f43085c = i10;
        aVar.f43086d = i11;
        this.f43168d.put(VerticalAlignment.BOTTOM, aVar.toString());
    }

    public void u(c.g gVar) {
        v(gVar, 0);
    }

    public void v(c.g gVar, int i10) {
        w(gVar, i10, Integer.MIN_VALUE);
    }

    public void w(c.g gVar, int i10, int i11) {
        a aVar = this.f43345j;
        aVar.f43084b = gVar;
        aVar.f43085c = i10;
        aVar.f43086d = i11;
        this.f43168d.put("top", aVar.toString());
    }

    public u(String str, String str2) {
        super(str);
        this.f43345j = new a(c.h.TOP);
        this.f43346k = new a(c.h.BOTTOM);
        this.f43347l = new a(c.h.BASELINE);
        this.f43167c = str2;
        this.f43166b = new h.a(h.f43164f.get(h.b.VERTICAL_CHAIN));
        Map<String, String> mapB = b();
        this.f43168d = mapB;
        if (mapB.containsKey("contains")) {
            s.a(this.f43168d.get("contains"), this.f43082h);
        }
    }
}
