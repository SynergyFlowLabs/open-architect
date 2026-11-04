package org.commonmark.renderer.html;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.commonmark.node.v;

/* JADX INFO: loaded from: classes14.dex */
public class g implements dm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f337761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f337762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f337763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<org.commonmark.renderer.html.c> f337764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<f> f337765e;

    class a implements f {
        a() {
        }

        @Override // org.commonmark.renderer.html.f
        public dm.a a(e eVar) {
            return new org.commonmark.renderer.html.d(eVar);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f337767a = "\n";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f337768b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f337769c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<org.commonmark.renderer.html.c> f337770d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<f> f337771e = new ArrayList();

        public b f(org.commonmark.renderer.html.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("attributeProviderFactory must not be null");
            }
            this.f337770d.add(cVar);
            return this;
        }

        public g g() {
            return new g(this, null);
        }

        public b h(boolean z10) {
            this.f337768b = z10;
            return this;
        }

        public b i(Iterable<? extends am.a> iterable) {
            if (iterable == null) {
                throw new NullPointerException("extensions must not be null");
            }
            for (am.a aVar : iterable) {
                if (aVar instanceof c) {
                    ((c) aVar).b(this);
                }
            }
            return this;
        }

        public b j(f fVar) {
            if (fVar == null) {
                throw new NullPointerException("nodeRendererFactory must not be null");
            }
            this.f337771e.add(fVar);
            return this;
        }

        public b k(boolean z10) {
            this.f337769c = z10;
            return this;
        }

        public b l(String str) {
            this.f337767a = str;
            return this;
        }
    }

    public interface c extends am.a {
        void b(b bVar);
    }

    private class d implements e, org.commonmark.renderer.html.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f337772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<org.commonmark.renderer.html.a> f337773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final bm.a f337774c;

        /* synthetic */ d(g gVar, h hVar, a aVar) {
            this(hVar);
        }

        private void g(v vVar, String str, Map<String, String> map) {
            Iterator<org.commonmark.renderer.html.a> it = this.f337773b.iterator();
            while (it.hasNext()) {
                it.next().a(vVar, str, map);
            }
        }

        @Override // org.commonmark.renderer.html.e
        public void a(v vVar) {
            this.f337774c.b(vVar);
        }

        @Override // org.commonmark.renderer.html.e
        public h b() {
            return this.f337772a;
        }

        @Override // org.commonmark.renderer.html.e
        public Map<String, String> c(v vVar, String str, Map<String, String> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            g(vVar, str, linkedHashMap);
            return linkedHashMap;
        }

        @Override // org.commonmark.renderer.html.e
        public String d() {
            return g.this.f337761a;
        }

        @Override // org.commonmark.renderer.html.e
        public String e(String str) {
            return g.this.f337763c ? org.commonmark.internal.util.a.e(str) : str;
        }

        @Override // org.commonmark.renderer.html.e
        public boolean f() {
            return g.this.f337762b;
        }

        private d(h hVar) {
            this.f337774c = new bm.a();
            this.f337772a = hVar;
            this.f337773b = new ArrayList(g.this.f337764d.size());
            Iterator it = g.this.f337764d.iterator();
            while (it.hasNext()) {
                this.f337773b.add(((org.commonmark.renderer.html.c) it.next()).a(this));
            }
            int size = g.this.f337765e.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                this.f337774c.a(((f) g.this.f337765e.get(size)).a(this));
            }
        }
    }

    /* synthetic */ g(b bVar, a aVar) {
        this(bVar);
    }

    public static b h() {
        return new b();
    }

    @Override // dm.b
    public String a(v vVar) {
        if (vVar == null) {
            throw new NullPointerException("node must not be null");
        }
        StringBuilder sb2 = new StringBuilder();
        b(vVar, sb2);
        return sb2.toString();
    }

    @Override // dm.b
    public void b(v vVar, Appendable appendable) {
        if (vVar == null) {
            throw new NullPointerException("node must not be null");
        }
        new d(this, new h(appendable), null).a(vVar);
    }

    private g(b bVar) {
        this.f337761a = bVar.f337767a;
        this.f337762b = bVar.f337768b;
        this.f337763c = bVar.f337769c;
        this.f337764d = new ArrayList(bVar.f337770d);
        ArrayList arrayList = new ArrayList(bVar.f337771e.size() + 1);
        this.f337765e = arrayList;
        arrayList.addAll(bVar.f337771e);
        arrayList.add(new a());
    }
}
