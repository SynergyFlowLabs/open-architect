package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final Map<EnumC0354b, String> f43080i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EnumC0354b f43081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList<s> f43082h;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c.f f43083a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43085c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c.a f43084b = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f43086d = Integer.MIN_VALUE;

        a(c.f fVar) {
            this.f43083a = fVar;
        }

        public void a(StringBuilder sb2) {
            if (this.f43084b != null) {
                sb2.append(this.f43083a.toString().toLowerCase());
                sb2.append(":");
                sb2.append(this);
                sb2.append(",\n");
            }
        }

        public String b() {
            return b.this.f43165a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            if (this.f43084b != null) {
                sb2.append("'");
                sb2.append(this.f43084b.b());
                sb2.append("',");
                sb2.append("'");
                sb2.append(this.f43084b.f43118a.toString().toLowerCase());
                sb2.append("'");
            }
            if (this.f43085c != 0) {
                sb2.append(",");
                sb2.append(this.f43085c);
            }
            if (this.f43086d != Integer.MIN_VALUE) {
                if (this.f43085c == 0) {
                    sb2.append(",0,");
                    sb2.append(this.f43086d);
                } else {
                    sb2.append(",");
                    sb2.append(this.f43086d);
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.dsl.b$b, reason: collision with other inner class name */
    public enum EnumC0354b {
        PACKED,
        SPREAD,
        SPREAD_INSIDE
    }

    static {
        HashMap map = new HashMap();
        f43080i = map;
        map.put(EnumC0354b.SPREAD, "'spread'");
        map.put(EnumC0354b.SPREAD_INSIDE, "'spread_inside'");
        map.put(EnumC0354b.PACKED, "'packed'");
    }

    public b(String str) {
        super(str, new h.a(""));
        int i10 = 7 | 0;
        this.f43081g = null;
        this.f43082h = new ArrayList<>();
    }

    public b g(s sVar) {
        this.f43082h.add(sVar);
        this.f43168d.put("contains", j());
        return this;
    }

    public b h(String str) {
        return g(s.g(str));
    }

    public EnumC0354b i() {
        return this.f43081g;
    }

    public String j() {
        if (this.f43082h.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<s> it = this.f43082h.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void k(EnumC0354b enumC0354b) {
        this.f43081g = enumC0354b;
        this.f43168d.put("style", f43080i.get(enumC0354b));
    }
}
