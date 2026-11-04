package org.threeten.bp.chrono;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class f implements org.threeten.bp.temporal.i {
    public static f a(c cVar, c cVar2) {
        cn.d.j(cVar, "startDateInclusive");
        cn.d.j(cVar2, "endDateExclusive");
        return cVar.U(cVar2);
    }

    @Override // org.threeten.bp.temporal.i
    public abstract org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar);

    @Override // org.threeten.bp.temporal.i
    public abstract org.threeten.bp.temporal.e c(org.threeten.bp.temporal.e eVar);

    @Override // org.threeten.bp.temporal.i
    public abstract long d(org.threeten.bp.temporal.m mVar);

    public abstract j e();

    public abstract boolean equals(Object obj);

    public boolean f() {
        Iterator<org.threeten.bp.temporal.m> it = getUnits().iterator();
        while (it.hasNext()) {
            if (d(it.next()) < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        Iterator<org.threeten.bp.temporal.m> it = getUnits().iterator();
        while (it.hasNext()) {
            if (d(it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.threeten.bp.temporal.i
    public abstract List<org.threeten.bp.temporal.m> getUnits();

    public abstract f h(org.threeten.bp.temporal.i iVar);

    public abstract int hashCode();

    public abstract f i(int i10);

    public f j() {
        return i(-1);
    }

    public abstract f k();

    public abstract f l(org.threeten.bp.temporal.i iVar);

    public abstract String toString();
}
