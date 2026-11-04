package org.threeten.bp.format;

import java.io.IOException;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.r;

/* JADX INFO: loaded from: classes14.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f340042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f340043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f340044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f340045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f340046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f340047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f340048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f340049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f340050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f340051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f340052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f340053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f340054t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f340055u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f340056v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final org.threeten.bp.temporal.l<org.threeten.bp.n> f340057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final org.threeten.bp.temporal.l<Boolean> f340058x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d.g f340059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Locale f340060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f340061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f340062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<org.threeten.bp.temporal.j> f340063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final org.threeten.bp.chrono.j f340064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r f340065g;

    class a implements org.threeten.bp.temporal.l<org.threeten.bp.n> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.n a(org.threeten.bp.temporal.f fVar) {
            return fVar instanceof org.threeten.bp.format.a ? ((org.threeten.bp.format.a) fVar).f340041g : org.threeten.bp.n.f340271d;
        }
    }

    class b implements org.threeten.bp.temporal.l<Boolean> {
        b() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(org.threeten.bp.temporal.f fVar) {
            return fVar instanceof org.threeten.bp.format.a ? Boolean.valueOf(((org.threeten.bp.format.a) fVar).f340040f) : Boolean.FALSE;
        }
    }

    static {
        d dVar = new d();
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340340k3;
        l lVar = l.EXCEEDS_PAD;
        d dVarH = dVar.v(aVar, 4, 10, lVar).h(org.apache.commons.codec.language.l.f335457d);
        org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.f340334h3;
        d dVarH2 = dVarH.u(aVar2, 2).h(org.apache.commons.codec.language.l.f335457d);
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.f340349p0;
        d dVarU = dVarH2.u(aVar3, 2);
        k kVar = k.STRICT;
        c cVarR = dVarU.R(kVar);
        org.threeten.bp.chrono.o oVar = org.threeten.bp.chrono.o.f339936e;
        c cVarD = cVarR.D(oVar);
        f340042h = cVarD;
        f340043i = new d().I().a(cVarD).m().R(kVar).D(oVar);
        f340044j = new d().I().a(cVarD).F().m().R(kVar).D(oVar);
        d dVar2 = new d();
        org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.f340353t;
        d dVarH3 = dVar2.u(aVar4, 2).h(AbstractJsonLexerKt.COLON);
        org.threeten.bp.temporal.a aVar5 = org.threeten.bp.temporal.a.f340343m;
        d dVarH4 = dVarH3.u(aVar5, 2).F().h(AbstractJsonLexerKt.COLON);
        org.threeten.bp.temporal.a aVar6 = org.threeten.bp.temporal.a.f340339k;
        c cVarR2 = dVarH4.u(aVar6, 2).F().d(org.threeten.bp.temporal.a.f340329e, 0, 9, true).R(kVar);
        f340045k = cVarR2;
        f340046l = new d().I().a(cVarR2).m().R(kVar);
        f340047m = new d().I().a(cVarR2).F().m().R(kVar);
        c cVarD2 = new d().I().a(cVarD).h(org.locationtech.jts.geom.l.f338158h).a(cVarR2).R(kVar).D(oVar);
        f340048n = cVarD2;
        c cVarD3 = new d().I().a(cVarD2).m().R(kVar).D(oVar);
        f340049o = cVarD3;
        f340050p = new d().a(cVarD3).F().h(AbstractJsonLexerKt.BEGIN_LIST).J().A().h(AbstractJsonLexerKt.END_LIST).R(kVar).D(oVar);
        f340051q = new d().a(cVarD2).F().m().F().h(AbstractJsonLexerKt.BEGIN_LIST).J().A().h(AbstractJsonLexerKt.END_LIST).R(kVar).D(oVar);
        f340052r = new d().I().v(aVar, 4, 10, lVar).h(org.apache.commons.codec.language.l.f335457d).u(org.threeten.bp.temporal.a.f340350p1, 3).F().m().R(kVar).D(oVar);
        d dVarH5 = new d().I().v(org.threeten.bp.temporal.c.f340382d, 4, 10, lVar).i("-W").u(org.threeten.bp.temporal.c.f340381c, 2).h(org.apache.commons.codec.language.l.f335457d);
        org.threeten.bp.temporal.a aVar7 = org.threeten.bp.temporal.a.X;
        f340053s = dVarH5.u(aVar7, 1).F().m().R(kVar).D(oVar);
        f340054t = new d().I().e().R(kVar);
        f340055u = new d().I().u(aVar, 4).u(aVar2, 2).u(aVar3, 2).F().l("+HHMMss", org.locationtech.jts.io.gml2.a.f338505w).R(kVar).D(oVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        f340056v = new d().I().M().F().q(aVar7, map).i(", ").E().v(aVar3, 1, 2, l.NOT_NEGATIVE).h(' ').q(aVar2, map2).h(' ').u(aVar, 4).h(' ').u(aVar4, 2).h(AbstractJsonLexerKt.COLON).u(aVar5, 2).F().h(AbstractJsonLexerKt.COLON).u(aVar6, 2).E().h(' ').l("+HHMM", org.apache.commons.lang3.time.m.f337525a).R(k.SMART).D(oVar);
        f340057w = new a();
        f340058x = new b();
    }

    c(d.g gVar, Locale locale, i iVar, k kVar, Set<org.threeten.bp.temporal.j> set, org.threeten.bp.chrono.j jVar, r rVar) {
        this.f340059a = (d.g) cn.d.j(gVar, "printerParser");
        this.f340060b = (Locale) cn.d.j(locale, "locale");
        this.f340061c = (i) cn.d.j(iVar, "decimalStyle");
        this.f340062d = (k) cn.d.j(kVar, "resolverStyle");
        this.f340063e = set;
        this.f340064f = jVar;
        this.f340065g = rVar;
    }

    private f c(CharSequence charSequence, RuntimeException runtimeException) {
        String string;
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        return new f("Text '" + string + "' could not be parsed: " + runtimeException.getMessage(), charSequence, 0, runtimeException);
    }

    public static c l(j jVar) {
        cn.d.j(jVar, "dateStyle");
        return new d().j(jVar, null).P().D(org.threeten.bp.chrono.o.f339936e);
    }

    public static c m(j jVar) {
        cn.d.j(jVar, "dateTimeStyle");
        return new d().j(jVar, jVar).P().D(org.threeten.bp.chrono.o.f339936e);
    }

    public static c n(j jVar, j jVar2) {
        cn.d.j(jVar, "dateStyle");
        cn.d.j(jVar2, "timeStyle");
        return new d().j(jVar, jVar2).P().D(org.threeten.bp.chrono.o.f339936e);
    }

    public static c o(j jVar) {
        cn.d.j(jVar, "timeStyle");
        return new d().j(null, jVar).P().D(org.threeten.bp.chrono.o.f339936e);
    }

    public static c p(String str) {
        return new d().o(str).P();
    }

    public static c q(String str, Locale locale) {
        return new d().o(str).Q(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.threeten.bp.format.a v(CharSequence charSequence, ParsePosition parsePosition) {
        String string;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        e.b bVarX = x(charSequence, parsePosition2);
        if (bVarX != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return bVarX.x();
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            throw new f("Text '" + string + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
        }
        throw new f("Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e.b x(CharSequence charSequence, ParsePosition parsePosition) {
        cn.d.j(charSequence, "text");
        cn.d.j(parsePosition, "position");
        e eVar = new e(this);
        int iB = this.f340059a.b(eVar, charSequence, parsePosition.getIndex());
        if (iB < 0) {
            parsePosition.setErrorIndex(~iB);
            return null;
        }
        parsePosition.setIndex(iB);
        return eVar.w();
    }

    public static final org.threeten.bp.temporal.l<org.threeten.bp.n> y() {
        return f340057w;
    }

    public static final org.threeten.bp.temporal.l<Boolean> z() {
        return f340058x;
    }

    public Format A() {
        return new C2448c(this, null);
    }

    public Format B(org.threeten.bp.temporal.l<?> lVar) {
        cn.d.j(lVar, "query");
        return new C2448c(this, lVar);
    }

    d.g C(boolean z10) {
        return this.f340059a.a(z10);
    }

    public c D(org.threeten.bp.chrono.j jVar) {
        return cn.d.c(this.f340064f, jVar) ? this : new c(this.f340059a, this.f340060b, this.f340061c, this.f340062d, this.f340063e, jVar, this.f340065g);
    }

    public c E(i iVar) {
        return this.f340061c.equals(iVar) ? this : new c(this.f340059a, this.f340060b, iVar, this.f340062d, this.f340063e, this.f340064f, this.f340065g);
    }

    public c F(Locale locale) {
        return this.f340060b.equals(locale) ? this : new c(this.f340059a, locale, this.f340061c, this.f340062d, this.f340063e, this.f340064f, this.f340065g);
    }

    public c G(Set<org.threeten.bp.temporal.j> set) {
        if (set == null) {
            return new c(this.f340059a, this.f340060b, this.f340061c, this.f340062d, null, this.f340064f, this.f340065g);
        }
        if (cn.d.c(this.f340063e, set)) {
            return this;
        }
        return new c(this.f340059a, this.f340060b, this.f340061c, this.f340062d, Collections.unmodifiableSet(new HashSet(set)), this.f340064f, this.f340065g);
    }

    public c H(org.threeten.bp.temporal.j... jVarArr) {
        if (jVarArr == null) {
            return new c(this.f340059a, this.f340060b, this.f340061c, this.f340062d, null, this.f340064f, this.f340065g);
        }
        HashSet hashSet = new HashSet(Arrays.asList(jVarArr));
        if (cn.d.c(this.f340063e, hashSet)) {
            return this;
        }
        return new c(this.f340059a, this.f340060b, this.f340061c, this.f340062d, Collections.unmodifiableSet(hashSet), this.f340064f, this.f340065g);
    }

    public c I(k kVar) {
        cn.d.j(kVar, "resolverStyle");
        return cn.d.c(this.f340062d, kVar) ? this : new c(this.f340059a, this.f340060b, this.f340061c, kVar, this.f340063e, this.f340064f, this.f340065g);
    }

    public c J(r rVar) {
        return cn.d.c(this.f340065g, rVar) ? this : new c(this.f340059a, this.f340060b, this.f340061c, this.f340062d, this.f340063e, this.f340064f, rVar);
    }

    public String d(org.threeten.bp.temporal.f fVar) {
        StringBuilder sb2 = new StringBuilder(32);
        e(fVar, sb2);
        return sb2.toString();
    }

    public void e(org.threeten.bp.temporal.f fVar, Appendable appendable) {
        cn.d.j(fVar, "temporal");
        cn.d.j(appendable, "appendable");
        try {
            g gVar = new g(fVar, this);
            if (appendable instanceof StringBuilder) {
                this.f340059a.c(gVar, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb2 = new StringBuilder(32);
            this.f340059a.c(gVar, sb2);
            appendable.append(sb2);
        } catch (IOException e10) {
            throw new org.threeten.bp.b(e10.getMessage(), e10);
        }
    }

    public org.threeten.bp.chrono.j f() {
        return this.f340064f;
    }

    public i g() {
        return this.f340061c;
    }

    public Locale h() {
        return this.f340060b;
    }

    public Set<org.threeten.bp.temporal.j> i() {
        return this.f340063e;
    }

    public k j() {
        return this.f340062d;
    }

    public r k() {
        return this.f340065g;
    }

    public <T> T r(CharSequence charSequence, org.threeten.bp.temporal.l<T> lVar) {
        cn.d.j(charSequence, "text");
        cn.d.j(lVar, "type");
        try {
            return (T) v(charSequence, null).U(this.f340062d, this.f340063e).D(lVar);
        } catch (f e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw c(charSequence, e11);
        }
    }

    public org.threeten.bp.temporal.f s(CharSequence charSequence) {
        cn.d.j(charSequence, "text");
        try {
            return v(charSequence, null).U(this.f340062d, this.f340063e);
        } catch (f e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw c(charSequence, e11);
        }
    }

    public org.threeten.bp.temporal.f t(CharSequence charSequence, ParsePosition parsePosition) {
        cn.d.j(charSequence, "text");
        cn.d.j(parsePosition, "position");
        try {
            return v(charSequence, parsePosition).U(this.f340062d, this.f340063e);
        } catch (IndexOutOfBoundsException e10) {
            throw e10;
        } catch (f e11) {
            throw e11;
        } catch (RuntimeException e12) {
            throw c(charSequence, e12);
        }
    }

    public String toString() {
        String string = this.f340059a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public org.threeten.bp.temporal.f u(CharSequence charSequence, org.threeten.bp.temporal.l<?>... lVarArr) {
        cn.d.j(charSequence, "text");
        cn.d.j(lVarArr, "types");
        if (lVarArr.length < 2) {
            throw new IllegalArgumentException("At least two types must be specified");
        }
        try {
            org.threeten.bp.format.a aVarU = v(charSequence, null).U(this.f340062d, this.f340063e);
            for (org.threeten.bp.temporal.l<?> lVar : lVarArr) {
                try {
                    return (org.threeten.bp.temporal.f) aVarU.D(lVar);
                } catch (RuntimeException unused) {
                }
            }
            throw new org.threeten.bp.b("Unable to convert parsed text to any specified type: " + Arrays.toString(lVarArr));
        } catch (f e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw c(charSequence, e11);
        }
    }

    public org.threeten.bp.temporal.f w(CharSequence charSequence, ParsePosition parsePosition) {
        return x(charSequence, parsePosition);
    }

    /* JADX INFO: renamed from: org.threeten.bp.format.c$c, reason: collision with other inner class name */
    static class C2448c extends Format {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f340066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.temporal.l<?> f340067b;

        public C2448c(c cVar, org.threeten.bp.temporal.l<?> lVar) {
            this.f340066a = cVar;
            this.f340067b = lVar;
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            cn.d.j(obj, "obj");
            cn.d.j(stringBuffer, "toAppendTo");
            cn.d.j(fieldPosition, "pos");
            if (!(obj instanceof org.threeten.bp.temporal.f)) {
                throw new IllegalArgumentException("Format target must implement TemporalAccessor");
            }
            fieldPosition.setBeginIndex(0);
            fieldPosition.setEndIndex(0);
            try {
                this.f340066a.e((org.threeten.bp.temporal.f) obj, stringBuffer);
                return stringBuffer;
            } catch (RuntimeException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            }
        }

        @Override // java.text.Format
        public Object parseObject(String str) throws ParseException {
            cn.d.j(str, "text");
            try {
                org.threeten.bp.temporal.l<?> lVar = this.f340067b;
                return lVar == null ? this.f340066a.v(str, null).U(this.f340066a.j(), this.f340066a.i()) : this.f340066a.r(str, lVar);
            } catch (f e10) {
                throw new ParseException(e10.getMessage(), e10.a());
            } catch (RuntimeException e11) {
                throw ((ParseException) new ParseException(e11.getMessage(), 0).initCause(e11));
            }
        }

        @Override // java.text.Format
        public Object parseObject(String str, ParsePosition parsePosition) {
            cn.d.j(str, "text");
            try {
                e.b bVarX = this.f340066a.x(str, parsePosition);
                if (bVarX == null) {
                    if (parsePosition.getErrorIndex() < 0) {
                        parsePosition.setErrorIndex(0);
                    }
                    return null;
                }
                try {
                    org.threeten.bp.format.a aVarU = bVarX.x().U(this.f340066a.j(), this.f340066a.i());
                    org.threeten.bp.temporal.l<?> lVar = this.f340067b;
                    return lVar == null ? aVarU : aVarU.D(lVar);
                } catch (RuntimeException unused) {
                    parsePosition.setErrorIndex(0);
                    return null;
                }
            } catch (IndexOutOfBoundsException unused2) {
                if (parsePosition.getErrorIndex() < 0) {
                    parsePosition.setErrorIndex(0);
                }
                return null;
            }
        }
    }
}
