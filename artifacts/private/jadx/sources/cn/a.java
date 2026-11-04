package cn;

import java.util.Locale;
import org.threeten.bp.chrono.k;
import org.threeten.bp.format.o;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.n;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends c implements k {
    @Override // org.threeten.bp.temporal.g
    public e b(e eVar) {
        return eVar.o(org.threeten.bp.temporal.a.f340342l3, getValue());
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.ERAS;
        }
        if (lVar == org.threeten.bp.temporal.k.a() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d() || lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c()) {
            return null;
        }
        return lVar.a(this);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(j jVar) {
        return jVar == org.threeten.bp.temporal.a.f340342l3 ? getValue() : c(jVar).a(t(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.f340342l3;
        }
        return jVar != null && jVar.c(this);
    }

    @Override // org.threeten.bp.chrono.k
    public String r(o oVar, Locale locale) {
        return new org.threeten.bp.format.d().r(org.threeten.bp.temporal.a.f340342l3, oVar).Q(locale).d(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340342l3) {
            return getValue();
        }
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        throw new n("Unsupported field: " + jVar);
    }
}
