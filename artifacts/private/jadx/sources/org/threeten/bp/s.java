package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes14.dex */
public final class s extends r implements org.threeten.bp.temporal.f, org.threeten.bp.temporal.g, Comparable<s>, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f340315i = 3600;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f340316j = 60;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f340317k = 60;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f340319m = 2357656521762053153L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f340323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient String f340324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<s> f340312f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ConcurrentMap<Integer, s> f340313g = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ConcurrentMap<String, s> f340314h = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f340320n = X(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f340321o = X(-64800);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f340318l = 64800;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f340322s = X(f340318l);

    class a implements org.threeten.bp.temporal.l<s> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(org.threeten.bp.temporal.f fVar) {
            return s.R(fVar);
        }
    }

    private s(int i10) {
        this.f340323d = i10;
        this.f340324e = N(i10);
    }

    private static String N(int i10) {
        if (i10 == 0) {
            return org.locationtech.jts.io.gml2.a.f338505w;
        }
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder();
        int i11 = iAbs / f340315i;
        int i12 = (iAbs / 60) % 60;
        sb2.append(i10 < 0 ? "-" : org.slf4j.h.f339615a3);
        sb2.append(i11 < 10 ? com.facebook.appevents.p.f99189d0 : "");
        sb2.append(i11);
        sb2.append(i12 < 10 ? ":0" : ":");
        sb2.append(i12);
        int i13 = iAbs % 60;
        if (i13 != 0) {
            sb2.append(i13 < 10 ? ":0" : ":");
            sb2.append(i13);
        }
        return sb2.toString();
    }

    public static s R(org.threeten.bp.temporal.f fVar) {
        s sVar = (s) fVar.d(org.threeten.bp.temporal.k.d());
        if (sVar != null) {
            return sVar;
        }
        throw new b("Unable to obtain ZoneOffset from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    public static s T(String str) {
        int iY;
        int iY2;
        int iY3;
        char cCharAt;
        cn.d.j(str, "offsetId");
        s sVar = f340314h.get(str);
        if (sVar != null) {
            return sVar;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length != 5) {
                    int i10 = 5 << 6;
                    if (length == 6) {
                        iY = Y(str, 1, false);
                        iY2 = Y(str, 4, true);
                    } else if (length == 7) {
                        iY = Y(str, 1, false);
                        iY2 = Y(str, 3, false);
                        iY3 = Y(str, 5, false);
                    } else {
                        if (length != 9) {
                            throw new b("Invalid ID for ZoneOffset, invalid format: " + str);
                        }
                        iY = Y(str, 1, false);
                        iY2 = Y(str, 4, true);
                        iY3 = Y(str, 7, true);
                    }
                } else {
                    iY = Y(str, 1, false);
                    iY2 = Y(str, 3, false);
                }
                iY3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' && cCharAt != '-') {
                throw new b("Invalid ID for ZoneOffset, plus/minus not found when expected: " + str);
            }
            return cCharAt == '-' ? W(-iY, -iY2, -iY3) : W(iY, iY2, iY3);
        }
        str = str.charAt(0) + com.facebook.appevents.p.f99189d0 + str.charAt(1);
        iY = Y(str, 1, false);
        iY2 = 0;
        iY3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
            throw new b("Invalid ID for ZoneOffset, plus/minus not found when expected: " + str);
        }
        if (cCharAt == '-') {
        }
    }

    public static s U(int i10) {
        return W(i10, 0, 0);
    }

    public static s V(int i10, int i11) {
        return W(i10, i11, 0);
    }

    public static s W(int i10, int i11, int i12) {
        c0(i10, i11, i12);
        return X(a0(i10, i11, i12));
    }

    public static s X(int i10) {
        if (Math.abs(i10) > f340318l) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 != 0) {
            return new s(i10);
        }
        Integer numValueOf = Integer.valueOf(i10);
        ConcurrentMap<Integer, s> concurrentMap = f340313g;
        s sVar = concurrentMap.get(numValueOf);
        if (sVar != null) {
            return sVar;
        }
        concurrentMap.putIfAbsent(numValueOf, new s(i10));
        s sVar2 = concurrentMap.get(numValueOf);
        f340314h.putIfAbsent(sVar2.getId(), sVar2);
        return sVar2;
    }

    private static int Y(CharSequence charSequence, int i10, boolean z10) {
        if (z10 && charSequence.charAt(i10 - 1) != ':') {
            throw new b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char cCharAt = charSequence.charAt(i10);
        char cCharAt2 = charSequence.charAt(i10 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return ((cCharAt - org.locationtech.jts.geom.l.f338160j) * 10) + (cCharAt2 - org.locationtech.jts.geom.l.f338160j);
        }
        throw new b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    static s Z(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? X(dataInput.readInt()) : X(b10 * 900);
    }

    private static int a0(int i10, int i11, int i12) {
        return (i10 * f340315i) + (i11 * 60) + i12;
    }

    private static void c0(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new b("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new b("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i11) > 59) {
            throw new b("Zone offset minutes not in valid range: abs(value) " + Math.abs(i11) + " is not in the range 0 to 59");
        }
        if (Math.abs(i12) > 59) {
            throw new b("Zone offset seconds not in valid range: abs(value) " + Math.abs(i12) + " is not in the range 0 to 59");
        }
        if (Math.abs(i10) == 18) {
            if (Math.abs(i11) > 0 || Math.abs(i12) > 0) {
                throw new b("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 8, this);
    }

    @Override // org.threeten.bp.r
    void M(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        d0(dataOutput);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public int compareTo(s sVar) {
        return sVar.f340323d - this.f340323d;
    }

    public int S() {
        return this.f340323d;
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return eVar.o(org.threeten.bp.temporal.a.f340346n3, this.f340323d);
    }

    @Override // org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340346n3) {
            return jVar.range();
        }
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.d() || lVar == org.threeten.bp.temporal.k.f()) {
            return this;
        }
        if (lVar != org.threeten.bp.temporal.k.b() && lVar != org.threeten.bp.temporal.k.c() && lVar != org.threeten.bp.temporal.k.e() && lVar != org.threeten.bp.temporal.k.a() && lVar != org.threeten.bp.temporal.k.g()) {
            return lVar.a(this);
        }
        return null;
    }

    void d0(DataOutput dataOutput) throws IOException {
        int i10 = this.f340323d;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    @Override // org.threeten.bp.r
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f340323d == ((s) obj).f340323d;
    }

    @Override // org.threeten.bp.r
    public String getId() {
        return this.f340324e;
    }

    @Override // org.threeten.bp.r
    public int hashCode() {
        return this.f340323d;
    }

    @Override // org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340346n3) {
            return this.f340323d;
        }
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return c(jVar).a(t(jVar), jVar);
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.f340346n3;
        }
        return jVar != null && jVar.c(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340346n3) {
            return this.f340323d;
        }
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        throw new b("Unsupported field: " + jVar);
    }

    @Override // org.threeten.bp.r
    public String toString() {
        return this.f340324e;
    }

    @Override // org.threeten.bp.r
    public org.threeten.bp.zone.g z() {
        return org.threeten.bp.zone.g.m(this);
    }
}
