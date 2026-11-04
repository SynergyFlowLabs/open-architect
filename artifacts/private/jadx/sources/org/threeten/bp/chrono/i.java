package org.threeten.bp.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.chrono.c;

/* JADX INFO: loaded from: classes14.dex */
final class i<D extends c> extends h<D> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f339881e = -5261813987200935591L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<D> f339882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.threeten.bp.s f339883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final org.threeten.bp.r f339884d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339885a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f339885a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.f340344m3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339885a[org.threeten.bp.temporal.a.f340346n3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private i(e<D> eVar, org.threeten.bp.s sVar, org.threeten.bp.r rVar) {
        this.f339882b = (e) cn.d.j(eVar, "dateTime");
        this.f339883c = (org.threeten.bp.s) cn.d.j(sVar, androidx.constraintlayout.core.motion.utils.v.c.R);
        this.f339884d = (org.threeten.bp.r) cn.d.j(rVar, "zone");
    }

    private i<D> f0(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return h0(V().E(), fVar, rVar);
    }

    static <R extends c> h<R> g0(e<R> eVar, org.threeten.bp.r rVar, org.threeten.bp.s sVar) {
        cn.d.j(eVar, "localDateTime");
        cn.d.j(rVar, "zone");
        if (rVar instanceof org.threeten.bp.s) {
            return new i(eVar, (org.threeten.bp.s) rVar, rVar);
        }
        org.threeten.bp.zone.g gVarZ = rVar.z();
        org.threeten.bp.h hVarD0 = org.threeten.bp.h.d0(eVar);
        List<org.threeten.bp.s> listH = gVarZ.h(hVarD0);
        if (listH.size() == 1) {
            sVar = listH.get(0);
        } else if (listH.size() == 0) {
            org.threeten.bp.zone.e eVarE = gVarZ.e(hVarD0);
            eVar = eVar.g0(eVarE.n().v());
            sVar = eVarE.q();
        } else if (sVar == null || !listH.contains(sVar)) {
            sVar = listH.get(0);
        }
        cn.d.j(sVar, androidx.constraintlayout.core.motion.utils.v.c.R);
        return new i(eVar, sVar, rVar);
    }

    static <R extends c> i<R> h0(j jVar, org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        org.threeten.bp.s sVarB = rVar.z().b(fVar);
        cn.d.j(sVarB, androidx.constraintlayout.core.motion.utils.v.c.R);
        return new i<>((e) jVar.z(org.threeten.bp.h.I0(fVar.H(), fVar.I(), sVarB)), sVarB, rVar);
    }

    static h<?> i0(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        d dVar = (d) objectInput.readObject();
        org.threeten.bp.s sVar = (org.threeten.bp.s) objectInput.readObject();
        return dVar.w(sVar).e0((org.threeten.bp.r) objectInput.readObject());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w(com.google.common.base.c.f116462o, this);
    }

    @Override // org.threeten.bp.chrono.h
    public org.threeten.bp.s E() {
        return this.f339883c;
    }

    @Override // org.threeten.bp.chrono.h
    public org.threeten.bp.r H() {
        return this.f339884d;
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: S */
    public h<D> v(long j10, org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? s(this.f339882b.v(j10, mVar)) : V().E().s(mVar.b(this, j10));
    }

    @Override // org.threeten.bp.chrono.h
    public d<D> W() {
        return this.f339882b;
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: Z */
    public h<D> o(org.threeten.bp.temporal.j jVar, long j10) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return V().E().s(jVar.b(this, j10));
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i10 = a.f339885a[aVar.ordinal()];
        if (i10 == 1) {
            return v(j10 - toEpochSecond(), org.threeten.bp.temporal.b.SECONDS);
        }
        if (i10 != 2) {
            return g0(this.f339882b.o(jVar, j10), this.f339884d, this.f339883c);
        }
        return f0(this.f339882b.U(org.threeten.bp.s.X(aVar.k(j10))), this.f339884d);
    }

    @Override // org.threeten.bp.chrono.h
    public h<D> a0() {
        org.threeten.bp.zone.e eVarE = H().z().e(org.threeten.bp.h.d0(this));
        if (eVarE != null && eVarE.v()) {
            org.threeten.bp.s sVarR = eVarE.r();
            if (!sVarR.equals(this.f339883c)) {
                return new i(this.f339882b, sVarR, this.f339884d);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.h
    public h<D> c0() {
        org.threeten.bp.zone.e eVarE = H().z().e(org.threeten.bp.h.d0(this));
        if (eVarE != null) {
            org.threeten.bp.s sVarQ = eVarE.q();
            if (!sVarQ.equals(E())) {
                return new i(this.f339882b, sVarQ, this.f339884d);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.h
    public h<D> d0(org.threeten.bp.r rVar) {
        cn.d.j(rVar, "zone");
        return this.f339884d.equals(rVar) ? this : f0(this.f339882b.U(this.f339883c), rVar);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean e(org.threeten.bp.temporal.m mVar) {
        if (mVar instanceof org.threeten.bp.temporal.b) {
            return mVar.isDateBased() || mVar.isTimeBased();
        }
        return mVar != null && mVar.c(this);
    }

    @Override // org.threeten.bp.chrono.h
    public h<D> e0(org.threeten.bp.r rVar) {
        return g0(this.f339882b, rVar, this.f339883c);
    }

    @Override // org.threeten.bp.chrono.h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    @Override // org.threeten.bp.chrono.h
    public int hashCode() {
        return Integer.rotateLeft(H().hashCode(), 3) ^ (W().hashCode() ^ E().hashCode());
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        h<?> hVarV = V().E().V(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, hVarV);
        }
        return this.f339882b.k(hVarV.d0(this.f339883c).W(), mVar);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        return (jVar instanceof org.threeten.bp.temporal.a) || (jVar != null && jVar.c(this));
    }

    @Override // org.threeten.bp.chrono.h
    public String toString() {
        String str = W().toString() + E().toString();
        if (E() == H()) {
            return str;
        }
        return str + AbstractJsonLexerKt.BEGIN_LIST + H().toString() + AbstractJsonLexerKt.END_LIST;
    }

    void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f339882b);
        objectOutput.writeObject(this.f339883c);
        objectOutput.writeObject(this.f339884d);
    }
}
