package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public enum v implements k {
    BEFORE_ROC,
    ROC;

    public static v w(int i10) {
        if (i10 == 0) {
            return BEFORE_ROC;
        }
        if (i10 == 1) {
            return ROC;
        }
        throw new org.threeten.bp.b("Invalid era: " + i10);
    }

    private Object writeReplace() {
        return new w((byte) 6, this);
    }

    static v x(DataInput dataInput) throws IOException {
        return w(dataInput.readByte());
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return eVar.o(org.threeten.bp.temporal.a.f340342l3, getValue());
    }

    @Override // org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340342l3) {
            return jVar.range();
        }
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.ERAS;
        }
        if (lVar != org.threeten.bp.temporal.k.a() && lVar != org.threeten.bp.temporal.k.f() && lVar != org.threeten.bp.temporal.k.g() && lVar != org.threeten.bp.temporal.k.d() && lVar != org.threeten.bp.temporal.k.b() && lVar != org.threeten.bp.temporal.k.c()) {
            return lVar.a(this);
        }
        return null;
    }

    @Override // org.threeten.bp.chrono.k
    public int getValue() {
        return ordinal();
    }

    @Override // org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        return jVar == org.threeten.bp.temporal.a.f340342l3 ? getValue() : c(jVar).a(t(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.f340342l3;
        }
        return jVar != null && jVar.c(this);
    }

    @Override // org.threeten.bp.chrono.k
    public String r(org.threeten.bp.format.o oVar, Locale locale) {
        return new org.threeten.bp.format.d().r(org.threeten.bp.temporal.a.f340342l3, oVar).Q(locale).d(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340342l3) {
            return getValue();
        }
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    void z(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }
}
