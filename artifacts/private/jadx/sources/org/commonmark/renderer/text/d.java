package org.commonmark.renderer.text;

import java.util.ArrayList;
import java.util.List;
import org.commonmark.node.v;

/* JADX INFO: loaded from: classes14.dex */
public class d implements dm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f337782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<org.commonmark.renderer.text.c> f337783b;

    class a implements org.commonmark.renderer.text.c {
        a() {
        }

        @Override // org.commonmark.renderer.text.c
        public dm.a a(org.commonmark.renderer.text.b bVar) {
            return new org.commonmark.renderer.text.a(bVar);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f337785a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<org.commonmark.renderer.text.c> f337786b = new ArrayList();

        public d c() {
            return new d(this, null);
        }

        public b d(Iterable<? extends am.a> iterable) {
            for (am.a aVar : iterable) {
                if (aVar instanceof InterfaceC2414d) {
                    ((InterfaceC2414d) aVar).c(this);
                }
            }
            return this;
        }

        public b e(org.commonmark.renderer.text.c cVar) {
            this.f337786b.add(cVar);
            return this;
        }

        public b f(boolean z10) {
            this.f337785a = z10;
            return this;
        }
    }

    private class c implements org.commonmark.renderer.text.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f337787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bm.a f337788b;

        /* synthetic */ c(d dVar, e eVar, a aVar) {
            this(eVar);
        }

        @Override // org.commonmark.renderer.text.b
        public void a(v vVar) {
            this.f337788b.b(vVar);
        }

        @Override // org.commonmark.renderer.text.b
        public e b() {
            return this.f337787a;
        }

        @Override // org.commonmark.renderer.text.b
        public boolean c() {
            return d.this.f337782a;
        }

        private c(e eVar) {
            this.f337788b = new bm.a();
            this.f337787a = eVar;
            for (int size = d.this.f337783b.size() - 1; size >= 0; size--) {
                this.f337788b.a(((org.commonmark.renderer.text.c) d.this.f337783b.get(size)).a(this));
            }
        }
    }

    /* JADX INFO: renamed from: org.commonmark.renderer.text.d$d, reason: collision with other inner class name */
    public interface InterfaceC2414d extends am.a {
        void c(b bVar);
    }

    /* synthetic */ d(b bVar, a aVar) {
        this(bVar);
    }

    public static b e() {
        return new b();
    }

    @Override // dm.b
    public String a(v vVar) {
        StringBuilder sb2 = new StringBuilder();
        b(vVar, sb2);
        return sb2.toString();
    }

    @Override // dm.b
    public void b(v vVar, Appendable appendable) {
        new c(this, new e(appendable), null).a(vVar);
    }

    private d(b bVar) {
        this.f337782a = bVar.f337785a;
        ArrayList arrayList = new ArrayList(bVar.f337786b.size() + 1);
        this.f337783b = arrayList;
        arrayList.addAll(bVar.f337786b);
        arrayList.add(new a());
    }
}
