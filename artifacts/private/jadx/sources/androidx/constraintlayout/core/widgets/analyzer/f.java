package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f44555d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f44557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44558g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f44552a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44553b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44554c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f44556e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f44559h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f44560i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f44561j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List<d> f44562k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List<f> f44563l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f44555d = pVar;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        Iterator<f> it = this.f44563l.iterator();
        while (it.hasNext()) {
            if (!it.next().f44561j) {
                return;
            }
        }
        this.f44554c = true;
        d dVar2 = this.f44552a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f44553b) {
            this.f44555d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f44563l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f44561j) {
            g gVar = this.f44560i;
            if (gVar != null) {
                if (!gVar.f44561j) {
                    return;
                } else {
                    this.f44557f = this.f44559h * gVar.f44558g;
                }
            }
            e(fVar.f44558g + this.f44557f);
        }
        d dVar3 = this.f44552a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f44562k.add(dVar);
        if (this.f44561j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f44563l.clear();
        this.f44562k.clear();
        this.f44561j = false;
        this.f44558g = 0;
        this.f44554c = false;
        this.f44553b = false;
    }

    public String d() {
        String str;
        String strY = this.f44555d.f44616b.y();
        a aVar = this.f44556e;
        if (aVar == a.LEFT || aVar == a.RIGHT) {
            str = strY + "_HORIZONTAL";
        } else {
            str = strY + "_VERTICAL";
        }
        return str + ":" + this.f44556e.name();
    }

    public void e(int i10) {
        if (this.f44561j) {
            return;
        }
        this.f44561j = true;
        this.f44558g = i10;
        for (d dVar : this.f44562k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f44555d.f44616b.y());
        sb2.append(":");
        sb2.append(this.f44556e);
        sb2.append("(");
        sb2.append(this.f44561j ? Integer.valueOf(this.f44558g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f44563l.size());
        sb2.append(":d=");
        sb2.append(this.f44562k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
