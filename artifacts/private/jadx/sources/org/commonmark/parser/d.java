package org.commonmark.parser;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.commonmark.internal.h;
import org.commonmark.internal.m;
import org.commonmark.internal.n;
import org.commonmark.node.v;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<org.commonmark.parser.block.e> f337748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<cm.a> f337749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.commonmark.parser.c f337750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<e> f337751d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<org.commonmark.parser.block.e> f337752a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<cm.a> f337753b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<e> f337754c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Set<Class<? extends org.commonmark.node.b>> f337755d = h.s();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private org.commonmark.parser.c f337756e;

        class a implements org.commonmark.parser.c {
            a() {
            }

            @Override // org.commonmark.parser.c
            public org.commonmark.parser.a a(org.commonmark.parser.b bVar) {
                return new n(bVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public org.commonmark.parser.c k() {
            org.commonmark.parser.c cVar = this.f337756e;
            return cVar != null ? cVar : new a();
        }

        public d f() {
            int i10 = 6 << 0;
            return new d(this);
        }

        public b g(org.commonmark.parser.block.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("blockParserFactory must not be null");
            }
            this.f337752a.add(eVar);
            return this;
        }

        public b h(cm.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("delimiterProcessor must not be null");
            }
            this.f337753b.add(aVar);
            return this;
        }

        public b i(Set<Class<? extends org.commonmark.node.b>> set) {
            if (set == null) {
                throw new NullPointerException("enabledBlockTypes must not be null");
            }
            this.f337755d = set;
            return this;
        }

        public b j(Iterable<? extends am.a> iterable) {
            if (iterable == null) {
                throw new NullPointerException("extensions must not be null");
            }
            for (am.a aVar : iterable) {
                if (aVar instanceof c) {
                    ((c) aVar).a(this);
                }
            }
            return this;
        }

        public b l(org.commonmark.parser.c cVar) {
            this.f337756e = cVar;
            return this;
        }

        public b m(e eVar) {
            if (eVar == null) {
                throw new NullPointerException("postProcessor must not be null");
            }
            this.f337754c.add(eVar);
            return this;
        }
    }

    public interface c extends am.a {
        void a(b bVar);
    }

    public static b a() {
        return new b();
    }

    private h b() {
        return new h(this.f337748a, this.f337750c, this.f337749b);
    }

    private v e(v vVar) {
        Iterator<e> it = this.f337751d.iterator();
        while (it.hasNext()) {
            vVar = it.next().a(vVar);
        }
        return vVar;
    }

    public v c(String str) {
        if (str != null) {
            return e(b().v(str));
        }
        throw new NullPointerException("input must not be null");
    }

    public v d(Reader reader) throws IOException {
        if (reader != null) {
            return e(b().u(reader));
        }
        throw new NullPointerException("input must not be null");
    }

    private d(b bVar) {
        this.f337748a = h.l(bVar.f337752a, bVar.f337755d);
        org.commonmark.parser.c cVarK = bVar.k();
        this.f337750c = cVarK;
        this.f337751d = bVar.f337754c;
        List<cm.a> list = bVar.f337753b;
        this.f337749b = list;
        cVarK.a(new m(list, Collections.EMPTY_MAP));
    }
}
