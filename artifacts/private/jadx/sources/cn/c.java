package cn;

import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.n;
import org.threeten.bp.temporal.o;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c implements f {
    @Override // org.threeten.bp.temporal.f
    public o c(j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        if (q(jVar)) {
            return jVar.range();
        }
        throw new n("Unsupported field: " + jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public <R> R d(l<R> lVar) {
        if (lVar == k.g() || lVar == k.a() || lVar == k.e()) {
            return null;
        }
        return lVar.a(this);
    }

    @Override // org.threeten.bp.temporal.f
    public int l(j jVar) {
        return c(jVar).a(t(jVar), jVar);
    }
}
