package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public abstract class j implements Comparable<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<j> f339886a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, j> f339887b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<String, j> f339888c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f339889d;

    class a implements org.threeten.bp.temporal.l<j> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(org.threeten.bp.temporal.f fVar) {
            return j.v(fVar);
        }
    }

    class b extends cn.c {
        b() {
        }

        @Override // cn.c, org.threeten.bp.temporal.f
        public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
            return lVar == org.threeten.bp.temporal.k.a() ? (R) j.this : (R) super.d(lVar);
        }

        @Override // org.threeten.bp.temporal.f
        public boolean q(org.threeten.bp.temporal.j jVar) {
            return false;
        }

        @Override // org.threeten.bp.temporal.f
        public long t(org.threeten.bp.temporal.j jVar) {
            throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
    }

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
            method = null;
        }
        f339889d = method;
    }

    protected j() {
    }

    public static j D(String str) {
        x();
        j jVar = f339887b.get(str);
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = f339888c.get(str);
        if (jVar2 != null) {
            return jVar2;
        }
        throw new org.threeten.bp.b("Unknown chronology: " + str);
    }

    public static j E(Locale locale) {
        String str;
        x();
        cn.d.j(locale, "locale");
        Method method = f339889d;
        if (method != null) {
            try {
                str = (String) method.invoke(locale, "ca");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        } else {
            str = locale.equals(q.f339941e) ? "japanese" : "iso";
        }
        if (str == null || "iso".equals(str) || "iso8601".equals(str)) {
            return o.f339936e;
        }
        j jVar = f339888c.get(str);
        if (jVar != null) {
            return jVar;
        }
        throw new org.threeten.bp.b("Unknown calendar system: " + str);
    }

    static j M(DataInput dataInput) throws IOException {
        return D(dataInput.readUTF());
    }

    private static void N(j jVar) {
        f339887b.putIfAbsent(jVar.getId(), jVar);
        String calendarType = jVar.getCalendarType();
        if (calendarType != null) {
            f339888c.putIfAbsent(calendarType, jVar);
        }
    }

    private Object T() {
        return new w((byte) 11, this);
    }

    public static Set<j> getAvailableChronologies() {
        x();
        return new HashSet(f339887b.values());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j v(org.threeten.bp.temporal.f fVar) {
        cn.d.j(fVar, "temporal");
        j jVar = (j) fVar.d(org.threeten.bp.temporal.k.a());
        return jVar != null ? jVar : o.f339936e;
    }

    private static void x() {
        ConcurrentHashMap<String, j> concurrentHashMap = f339887b;
        if (concurrentHashMap.isEmpty()) {
            N(o.f339936e);
            N(x.f339992e);
            N(t.f339968e);
            N(q.f339942f);
            l lVar = l.f339891e;
            N(lVar);
            concurrentHashMap.putIfAbsent("Hijrah", lVar);
            f339888c.putIfAbsent(androidx.core.text.util.j.d.f48323g, lVar);
            for (j jVar : ServiceLoader.load(j.class, j.class.getClassLoader())) {
                f339887b.putIfAbsent(jVar.getId(), jVar);
                String calendarType = jVar.getCalendarType();
                if (calendarType != null) {
                    f339888c.putIfAbsent(calendarType, jVar);
                }
            }
        }
    }

    public f H(int i10, int i11, int i12) {
        return new g(this, i10, i11, i12);
    }

    public abstract int I(k kVar, int i10);

    public abstract org.threeten.bp.temporal.o L(org.threeten.bp.temporal.a aVar);

    public abstract c O(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.format.k kVar);

    void R(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.temporal.a aVar, long j10) {
        Long l10 = map.get(aVar);
        if (l10 == null || l10.longValue() == j10) {
            map.put(aVar, Long.valueOf(j10));
            return;
        }
        throw new org.threeten.bp.b("Invalid state, field: " + aVar + " " + l10 + " conflicts with " + aVar + " " + j10);
    }

    void S(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(getId());
    }

    public h<?> U(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return i.h0(this, fVar, rVar);
    }

    public h<?> V(org.threeten.bp.temporal.f fVar) {
        try {
            org.threeten.bp.r rVarW = org.threeten.bp.r.w(fVar);
            try {
                return U(org.threeten.bp.f.E(fVar), rVarW);
            } catch (org.threeten.bp.b unused) {
                return i.g0(r(z(fVar)), rVarW, null);
            }
        } catch (org.threeten.bp.b e10) {
            throw new org.threeten.bp.b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + fVar.getClass(), e10);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        return getId().compareTo(jVar.getId());
    }

    public abstract c c(int i10, int i11, int i12);

    public c d(k kVar, int i10, int i11, int i12) {
        return c(I(kVar, i10), i11, i12);
    }

    public abstract c e(org.threeten.bp.temporal.f fVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && compareTo((j) obj) == 0;
    }

    public abstract List<k> eras();

    public abstract c f(long j10);

    public abstract String getCalendarType();

    public abstract String getId();

    public int hashCode() {
        return getId().hashCode() ^ getClass().hashCode();
    }

    public abstract boolean isLeapYear(long j10);

    public c k() {
        return l(org.threeten.bp.a.g());
    }

    public c l(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        return e(org.threeten.bp.g.A0(aVar));
    }

    public c n(org.threeten.bp.r rVar) {
        return l(org.threeten.bp.a.f(rVar));
    }

    public abstract c o(int i10, int i11);

    public c p(k kVar, int i10, int i11) {
        return o(I(kVar, i10), i11);
    }

    <D extends c> D q(org.threeten.bp.temporal.e eVar) {
        D d10 = (D) eVar;
        if (equals(d10.E())) {
            return d10;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + getId() + ", actual: " + d10.E().getId());
    }

    <D extends c> e<D> r(org.threeten.bp.temporal.e eVar) {
        e<D> eVar2 = (e) eVar;
        if (equals(eVar2.V().E())) {
            return eVar2;
        }
        throw new ClassCastException("Chrono mismatch, required: " + getId() + ", supplied: " + eVar2.V().E().getId());
    }

    <D extends c> i<D> s(org.threeten.bp.temporal.e eVar) {
        i<D> iVar = (i) eVar;
        if (equals(iVar.V().E())) {
            return iVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + getId() + ", supplied: " + iVar.V().E().getId());
    }

    public abstract k t(int i10);

    public String toString() {
        return getId();
    }

    public String w(org.threeten.bp.format.o oVar, Locale locale) {
        return new org.threeten.bp.format.d().c(oVar).Q(locale).d(new b());
    }

    public d<?> z(org.threeten.bp.temporal.f fVar) {
        try {
            return e(fVar).w(org.threeten.bp.i.H(fVar));
        } catch (org.threeten.bp.b e10) {
            throw new org.threeten.bp.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + fVar.getClass(), e10);
        }
    }
}
