package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Comparable<e>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f340514d = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.threeten.bp.h f340515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f340516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f340517c;

    e(org.threeten.bp.h hVar, s sVar, s sVar2) {
        this.f340515a = hVar;
        this.f340516b = sVar;
        this.f340517c = sVar2;
    }

    private int o() {
        return q().S() - r().S();
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public static e x(org.threeten.bp.h hVar, s sVar, s sVar2) {
        cn.d.j(hVar, "transition");
        cn.d.j(sVar, "offsetBefore");
        cn.d.j(sVar2, "offsetAfter");
        if (sVar.equals(sVar2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        if (hVar.l0() == 0) {
            return new e(hVar, sVar, sVar2);
        }
        throw new IllegalArgumentException("Nano-of-second must be zero");
    }

    static e z(DataInput dataInput) throws IOException {
        long jB = a.b(dataInput);
        s sVarD = a.d(dataInput);
        s sVarD2 = a.d(dataInput);
        if (sVarD.equals(sVarD2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        return new e(jB, sVarD, sVarD2);
    }

    void D(DataOutput dataOutput) throws IOException {
        a.f(toEpochSecond(), dataOutput);
        a.h(this.f340516b, dataOutput);
        a.h(this.f340517c, dataOutput);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        return p().compareTo(eVar.p());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f340515a.equals(eVar.f340515a) && this.f340516b.equals(eVar.f340516b) && this.f340517c.equals(eVar.f340517c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Integer.rotateLeft(this.f340517c.hashCode(), 16) ^ (this.f340515a.hashCode() ^ this.f340516b.hashCode());
    }

    public org.threeten.bp.h k() {
        return this.f340515a.T0(o());
    }

    public org.threeten.bp.h l() {
        return this.f340515a;
    }

    public org.threeten.bp.e n() {
        return org.threeten.bp.e.Y(o());
    }

    public org.threeten.bp.f p() {
        return this.f340515a.U(this.f340516b);
    }

    public s q() {
        return this.f340517c;
    }

    public s r() {
        return this.f340516b;
    }

    List<s> s() {
        return t() ? Collections.EMPTY_LIST : Arrays.asList(r(), q());
    }

    public boolean t() {
        return q().S() > r().S();
    }

    public long toEpochSecond() {
        return this.f340515a.T(this.f340516b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transition[");
        sb2.append(t() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f340515a);
        sb2.append(this.f340516b);
        sb2.append(" to ");
        sb2.append(this.f340517c);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public boolean v() {
        return q().S() < r().S();
    }

    public boolean w(s sVar) {
        if (t()) {
            return false;
        }
        return r().equals(sVar) || q().equals(sVar);
    }

    e(long j10, s sVar, s sVar2) {
        this.f340515a = org.threeten.bp.h.I0(j10, 0, sVar);
        this.f340516b = sVar;
        this.f340517c = sVar2;
    }
}
