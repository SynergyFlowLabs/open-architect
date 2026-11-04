package org.threeten.bp.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.r;

/* JADX INFO: loaded from: classes14.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Locale f340134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f340135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.threeten.bp.chrono.j f340136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f340137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f340138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f340139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f340140g;

    final class b extends cn.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        org.threeten.bp.chrono.j f340141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        r f340142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map<org.threeten.bp.temporal.j, Long> f340143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f340144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.threeten.bp.n f340145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        List<Object[]> f340146f;

        @Override // cn.c, org.threeten.bp.temporal.f
        public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
            if (lVar == org.threeten.bp.temporal.k.a()) {
                return (R) this.f340141a;
            }
            if (lVar != org.threeten.bp.temporal.k.g() && lVar != org.threeten.bp.temporal.k.f()) {
                return (R) super.d(lVar);
            }
            return (R) this.f340142b;
        }

        @Override // cn.c, org.threeten.bp.temporal.f
        public int l(org.threeten.bp.temporal.j jVar) {
            if (this.f340143c.containsKey(jVar)) {
                return cn.d.r(this.f340143c.get(jVar).longValue());
            }
            throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }

        @Override // org.threeten.bp.temporal.f
        public boolean q(org.threeten.bp.temporal.j jVar) {
            return this.f340143c.containsKey(jVar);
        }

        @Override // org.threeten.bp.temporal.f
        public long t(org.threeten.bp.temporal.j jVar) {
            if (this.f340143c.containsKey(jVar)) {
                return this.f340143c.get(jVar).longValue();
            }
            throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }

        public String toString() {
            return this.f340143c.toString() + "," + this.f340141a + "," + this.f340142b;
        }

        protected b w() {
            b bVar = e.this.new b();
            bVar.f340141a = this.f340141a;
            bVar.f340142b = this.f340142b;
            bVar.f340143c.putAll(this.f340143c);
            bVar.f340144d = this.f340144d;
            return bVar;
        }

        org.threeten.bp.format.a x() {
            org.threeten.bp.format.a aVar = new org.threeten.bp.format.a();
            aVar.f340035a.putAll(this.f340143c);
            aVar.f340036b = e.this.h();
            r rVar = this.f340142b;
            if (rVar != null) {
                aVar.f340037c = rVar;
            } else {
                aVar.f340037c = e.this.f340137d;
            }
            aVar.f340040f = this.f340144d;
            aVar.f340041g = this.f340145e;
            return aVar;
        }

        private b() {
            this.f340141a = null;
            this.f340142b = null;
            this.f340143c = new HashMap();
            this.f340145e = org.threeten.bp.n.f340271d;
        }
    }

    e(c cVar) {
        this.f340138e = true;
        this.f340139f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f340140g = arrayList;
        this.f340134a = cVar.h();
        this.f340135b = cVar.g();
        this.f340136c = cVar.f();
        this.f340137d = cVar.k();
        arrayList.add(new b());
    }

    static boolean d(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    private b f() {
        ArrayList<b> arrayList = this.f340140g;
        return arrayList.get(arrayList.size() - 1);
    }

    void b(d.q qVar, long j10, int i10, int i11) {
        b bVarF = f();
        if (bVarF.f340146f == null) {
            bVarF.f340146f = new ArrayList(2);
        }
        bVarF.f340146f.add(new Object[]{qVar, Long.valueOf(j10), Integer.valueOf(i10), Integer.valueOf(i11)});
    }

    boolean c(char c10, char c11) {
        if (l()) {
            return c10 == c11;
        }
        return d(c10, c11);
    }

    e e() {
        return new e(this);
    }

    void g(boolean z10) {
        if (z10) {
            ArrayList<b> arrayList = this.f340140g;
            arrayList.remove(arrayList.size() - 2);
        } else {
            ArrayList<b> arrayList2 = this.f340140g;
            arrayList2.remove(arrayList2.size() - 1);
        }
    }

    org.threeten.bp.chrono.j h() {
        org.threeten.bp.chrono.j jVar = f().f340141a;
        if (jVar != null) {
            return jVar;
        }
        org.threeten.bp.chrono.j jVar2 = this.f340136c;
        if (jVar2 == null) {
            jVar2 = org.threeten.bp.chrono.o.f339936e;
        }
        return jVar2;
    }

    Locale i() {
        return this.f340134a;
    }

    Long j(org.threeten.bp.temporal.j jVar) {
        return f().f340143c.get(jVar);
    }

    i k() {
        return this.f340135b;
    }

    boolean l() {
        return this.f340138e;
    }

    boolean m() {
        return this.f340139f;
    }

    void n(boolean z10) {
        this.f340138e = z10;
    }

    void o(Locale locale) {
        cn.d.j(locale, "locale");
        this.f340134a = locale;
    }

    void p(r rVar) {
        cn.d.j(rVar, "zone");
        f().f340142b = rVar;
    }

    void q(org.threeten.bp.chrono.j jVar) {
        cn.d.j(jVar, "chrono");
        b bVarF = f();
        bVarF.f340141a = jVar;
        if (bVarF.f340146f != null) {
            ArrayList<Object[]> arrayList = new ArrayList(bVarF.f340146f);
            bVarF.f340146f.clear();
            for (Object[] objArr : arrayList) {
                int i10 = 0 & 3;
                ((d.q) objArr[0]).e(this, ((Long) objArr[1]).longValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue());
            }
        }
    }

    int r(org.threeten.bp.temporal.j jVar, long j10, int i10, int i11) {
        cn.d.j(jVar, "field");
        Long lPut = f().f340143c.put(jVar, Long.valueOf(j10));
        return (lPut == null || lPut.longValue() == j10) ? i11 : ~i10;
    }

    void s() {
        f().f340144d = true;
    }

    void t(boolean z10) {
        this.f340139f = z10;
    }

    public String toString() {
        return f().toString();
    }

    void u() {
        this.f340140g.add(f().w());
    }

    boolean v(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 <= charSequence.length() && i11 + i12 <= charSequence2.length()) {
            if (l()) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (charSequence.charAt(i10 + i13) != charSequence2.charAt(i11 + i13)) {
                        return false;
                    }
                }
            } else {
                for (int i14 = 0; i14 < i12; i14++) {
                    char cCharAt = charSequence.charAt(i10 + i14);
                    char cCharAt2 = charSequence2.charAt(i11 + i14);
                    if (cCharAt != cCharAt2 && Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    b w() {
        return f();
    }

    e(Locale locale, i iVar, org.threeten.bp.chrono.j jVar) {
        this.f340138e = true;
        this.f340139f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f340140g = arrayList;
        this.f340134a = locale;
        this.f340135b = iVar;
        this.f340136c = jVar;
        this.f340137d = null;
        arrayList.add(new b());
    }

    e(e eVar) {
        this.f340138e = true;
        this.f340139f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f340140g = arrayList;
        this.f340134a = eVar.f340134a;
        this.f340135b = eVar.f340135b;
        this.f340136c = eVar.f340136c;
        this.f340137d = eVar.f340137d;
        this.f340138e = eVar.f340138e;
        this.f340139f = eVar.f340139f;
        arrayList.add(new b());
    }
}
