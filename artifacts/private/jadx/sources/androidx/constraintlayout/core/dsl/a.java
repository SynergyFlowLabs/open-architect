package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c.f f43077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<s> f43079i;

    public a(String str) {
        super(str, new h.a(h.f43164f.get(h.b.BARRIER)));
        this.f43077g = null;
        this.f43078h = Integer.MIN_VALUE;
        this.f43079i = new ArrayList<>();
    }

    public a g(s sVar) {
        this.f43079i.add(sVar);
        this.f43168d.put("contains", k());
        return this;
    }

    public a h(String str) {
        return g(s.g(str));
    }

    public c.f i() {
        return this.f43077g;
    }

    public int j() {
        return this.f43078h;
    }

    public String k() {
        if (this.f43079i.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<s> it = this.f43079i.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void l(c.f fVar) {
        this.f43077g = fVar;
        this.f43168d.put("direction", h.f43163e.get(fVar));
    }

    public void m(int i10) {
        this.f43078h = i10;
        this.f43168d.put("margin", String.valueOf(i10));
    }

    public a(String str, String str2) {
        super(str, new h.a(h.f43164f.get(h.b.BARRIER)), str2);
        this.f43077g = null;
        this.f43078h = Integer.MIN_VALUE;
        this.f43079i = new ArrayList<>();
        Map<String, String> mapB = b();
        this.f43168d = mapB;
        if (mapB.containsKey("contains")) {
            s.a(this.f43168d.get("contains"), this.f43079i);
        }
    }
}
