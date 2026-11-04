package org.commonmark.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.commonmark.node.b0;
import org.commonmark.node.x;

/* JADX INFO: loaded from: classes14.dex */
public class h implements org.commonmark.parser.block.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Set<Class<? extends org.commonmark.node.b>> f337594p = new LinkedHashSet(Arrays.asList(org.commonmark.node.c.class, org.commonmark.node.m.class, org.commonmark.node.k.class, org.commonmark.node.n.class, b0.class, org.commonmark.node.t.class, org.commonmark.node.q.class));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Map<Class<? extends org.commonmark.node.b>, org.commonmark.parser.block.e> f337595q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f337596a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f337599d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f337603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<org.commonmark.parser.block.e> f337604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final org.commonmark.parser.c f337605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<cm.a> f337606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g f337607l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f337597b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f337598c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f337600e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f337601f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f337602g = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, org.commonmark.node.s> f337608m = new LinkedHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<org.commonmark.parser.block.d> f337609n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Set<org.commonmark.parser.block.d> f337610o = new LinkedHashSet();

    private static class a implements org.commonmark.parser.block.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.commonmark.parser.block.d f337611a;

        public a(org.commonmark.parser.block.d dVar) {
            this.f337611a = dVar;
        }

        @Override // org.commonmark.parser.block.g
        public org.commonmark.parser.block.d a() {
            return this.f337611a;
        }

        @Override // org.commonmark.parser.block.g
        public CharSequence b() {
            org.commonmark.parser.block.d dVar = this.f337611a;
            if (!(dVar instanceof r)) {
                return null;
            }
            CharSequence charSequenceI = ((r) dVar).i();
            if (charSequenceI.length() == 0) {
                return null;
            }
            return charSequenceI;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(org.commonmark.node.c.class, new c.a());
        map.put(org.commonmark.node.m.class, new j.a());
        map.put(org.commonmark.node.k.class, new i.a());
        map.put(org.commonmark.node.n.class, new k.b());
        map.put(b0.class, new t.a());
        map.put(org.commonmark.node.t.class, new p.a());
        map.put(org.commonmark.node.q.class, new l.a());
        f337595q = Collections.unmodifiableMap(map);
    }

    public h(List<org.commonmark.parser.block.e> list, org.commonmark.parser.c cVar, List<cm.a> list2) {
        this.f337604i = list;
        this.f337605j = cVar;
        this.f337606k = list2;
        g gVar = new g();
        this.f337607l = gVar;
        g(gVar);
    }

    private void g(org.commonmark.parser.block.d dVar) {
        this.f337609n.add(dVar);
        this.f337610o.add(dVar);
    }

    private <T extends org.commonmark.parser.block.d> T h(T t10) {
        while (!e().g(t10.e())) {
            n(e());
        }
        e().e().d(t10.e());
        g(t10);
        return t10;
    }

    private void i(r rVar) {
        for (org.commonmark.node.s sVar : rVar.j()) {
            rVar.e().k(sVar);
            String strQ = sVar.q();
            if (!this.f337608m.containsKey(strQ)) {
                this.f337608m.put(strQ, sVar);
            }
        }
    }

    private void j() {
        CharSequence charSequenceSubSequence;
        if (this.f337599d) {
            int i10 = this.f337597b + 1;
            CharSequence charSequence = this.f337596a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i10, charSequence.length());
            int iA = org.commonmark.internal.util.d.a(this.f337598c);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence2.length() + iA);
            for (int i11 = 0; i11 < iA; i11++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f337596a;
            charSequenceSubSequence = charSequence2.subSequence(this.f337597b, charSequence2.length());
        }
        e().f(charSequenceSubSequence);
    }

    private void k() {
        if (this.f337596a.charAt(this.f337597b) != '\t') {
            this.f337597b++;
            this.f337598c++;
        } else {
            this.f337597b++;
            int i10 = this.f337598c;
            this.f337598c = i10 + org.commonmark.internal.util.d.a(i10);
        }
    }

    public static List<org.commonmark.parser.block.e> l(List<org.commonmark.parser.block.e> list, Set<Class<? extends org.commonmark.node.b>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<Class<? extends org.commonmark.node.b>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f337595q.get(it.next()));
        }
        return arrayList;
    }

    private void m() {
        List<org.commonmark.parser.block.d> list = this.f337609n;
        list.remove(list.size() - 1);
    }

    private void n(org.commonmark.parser.block.d dVar) {
        if (e() == dVar) {
            m();
        }
        if (dVar instanceof r) {
            i((r) dVar);
        }
        dVar.h();
    }

    private org.commonmark.node.i o() {
        p(this.f337609n);
        x();
        return this.f337607l.e();
    }

    private void p(List<org.commonmark.parser.block.d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            n(list.get(size));
        }
    }

    private d q(org.commonmark.parser.block.d dVar) {
        a aVar = new a(dVar);
        Iterator<org.commonmark.parser.block.e> it = this.f337604i.iterator();
        while (it.hasNext()) {
            org.commonmark.parser.block.f fVarA = it.next().a(this, aVar);
            if (fVarA instanceof d) {
                return (d) fVarA;
            }
        }
        return null;
    }

    private void r() {
        int i10 = this.f337597b;
        int i11 = this.f337598c;
        this.f337603h = true;
        int length = this.f337596a.length();
        while (i10 < length) {
            char cCharAt = this.f337596a.charAt(i10);
            if (cCharAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (cCharAt != ' ') {
                this.f337603h = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.f337600e = i10;
        this.f337601f = i11;
        this.f337602g = i11 - this.f337598c;
    }

    public static Set<Class<? extends org.commonmark.node.b>> s() {
        return f337594p;
    }

    private void t(CharSequence charSequence) {
        this.f337596a = org.commonmark.internal.util.d.j(charSequence);
        this.f337597b = 0;
        this.f337598c = 0;
        this.f337599d = false;
        List<org.commonmark.parser.block.d> list = this.f337609n;
        int i10 = 1;
        for (org.commonmark.parser.block.d dVar : list.subList(1, list.size())) {
            r();
            org.commonmark.parser.block.c cVarC = dVar.c(this);
            if (!(cVarC instanceof b)) {
                break;
            }
            b bVar = (b) cVarC;
            if (bVar.g()) {
                n(dVar);
                return;
            }
            if (bVar.f() != -1) {
                z(bVar.f());
            } else if (bVar.e() != -1) {
                y(bVar.e());
            }
            i10++;
        }
        List<org.commonmark.parser.block.d> list2 = this.f337609n;
        ArrayList arrayList = new ArrayList(list2.subList(i10, list2.size()));
        org.commonmark.parser.block.d dVar2 = this.f337609n.get(i10 - 1);
        boolean zIsEmpty = arrayList.isEmpty();
        boolean zB = (dVar2.e() instanceof x) || dVar2.b();
        while (zB) {
            r();
            if (b() || (this.f337602g < org.commonmark.internal.util.d.f337718k && org.commonmark.internal.util.d.h(this.f337596a, this.f337600e))) {
                z(this.f337600e);
                break;
            }
            d dVarQ = q(dVar2);
            if (dVarQ == null) {
                z(this.f337600e);
                break;
            }
            if (!zIsEmpty) {
                p(arrayList);
                zIsEmpty = true;
            }
            if (dVarQ.h() != -1) {
                z(dVarQ.h());
            } else if (dVarQ.g() != -1) {
                y(dVarQ.g());
            }
            if (dVarQ.i()) {
                w();
            }
            org.commonmark.parser.block.d[] dVarArrF = dVarQ.f();
            int length = dVarArrF.length;
            int i11 = 0;
            while (i11 < length) {
                org.commonmark.parser.block.d dVar3 = dVarArrF[i11];
                org.commonmark.parser.block.d dVarH = h(dVar3);
                i11++;
                zB = dVar3.b();
                dVar2 = dVarH;
            }
        }
        if (!zIsEmpty && !b() && e().d()) {
            j();
            return;
        }
        if (!zIsEmpty) {
            p(arrayList);
        }
        if (!dVar2.b()) {
            j();
        } else {
            if (b()) {
                return;
            }
            h(new r());
            j();
        }
    }

    private void w() {
        org.commonmark.parser.block.d dVarE = e();
        m();
        this.f337610o.remove(dVarE);
        if (dVarE instanceof r) {
            i((r) dVarE);
        }
        dVarE.e().o();
    }

    private void x() {
        org.commonmark.parser.a aVarA = this.f337605j.a(new m(this.f337606k, this.f337608m));
        Iterator<org.commonmark.parser.block.d> it = this.f337610o.iterator();
        while (it.hasNext()) {
            it.next().a(aVarA);
        }
    }

    private void y(int i10) {
        int i11;
        int i12 = this.f337601f;
        if (i10 >= i12) {
            this.f337597b = this.f337600e;
            this.f337598c = i12;
        }
        int length = this.f337596a.length();
        while (true) {
            i11 = this.f337598c;
            if (i11 >= i10 || this.f337597b == length) {
                break;
            } else {
                k();
            }
        }
        if (i11 <= i10) {
            this.f337599d = false;
            return;
        }
        this.f337597b--;
        this.f337598c = i10;
        this.f337599d = true;
    }

    private void z(int i10) {
        int i11 = this.f337600e;
        if (i10 >= i11) {
            this.f337597b = i11;
            this.f337598c = this.f337601f;
        }
        int length = this.f337596a.length();
        while (true) {
            int i12 = this.f337597b;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                k();
            }
        }
        this.f337599d = false;
    }

    @Override // org.commonmark.parser.block.h
    public int a() {
        return this.f337602g;
    }

    @Override // org.commonmark.parser.block.h
    public boolean b() {
        return this.f337603h;
    }

    @Override // org.commonmark.parser.block.h
    public CharSequence c() {
        return this.f337596a;
    }

    @Override // org.commonmark.parser.block.h
    public int d() {
        return this.f337600e;
    }

    @Override // org.commonmark.parser.block.h
    public org.commonmark.parser.block.d e() {
        List<org.commonmark.parser.block.d> list = this.f337609n;
        return list.get(list.size() - 1);
    }

    @Override // org.commonmark.parser.block.h
    public int f() {
        return this.f337598c;
    }

    @Override // org.commonmark.parser.block.h
    public int getIndex() {
        return this.f337597b;
    }

    public org.commonmark.node.i u(Reader reader) throws IOException {
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return o();
            }
            t(line);
        }
    }

    public org.commonmark.node.i v(String str) {
        int i10 = 0;
        while (true) {
            int iC = org.commonmark.internal.util.d.c(str, i10);
            if (iC == -1) {
                break;
            }
            t(str.substring(i10, iC));
            i10 = iC + 1;
            if (i10 < str.length() && str.charAt(iC) == '\r' && str.charAt(i10) == '\n') {
                i10 = iC + 2;
            }
        }
        if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
            t(str.substring(i10));
        }
        return o();
    }
}
