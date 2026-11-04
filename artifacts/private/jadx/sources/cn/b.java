package cn;

import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b extends c implements e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [org.threeten.bp.temporal.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // org.threeten.bp.temporal.e
    public e f(long j10, m mVar) {
        long j11;
        ?? V;
        if (j10 == Long.MIN_VALUE) {
            j11 = 1;
            V = v(Long.MAX_VALUE, mVar);
        } else {
            j11 = -j10;
            this = this;
        }
        return V.v(j11, mVar);
    }

    @Override // org.threeten.bp.temporal.e
    public e n(i iVar) {
        return iVar.c(this);
    }

    @Override // org.threeten.bp.temporal.e
    public e p(i iVar) {
        return iVar.b(this);
    }

    @Override // org.threeten.bp.temporal.e
    public e s(g gVar) {
        return gVar.b(this);
    }
}
