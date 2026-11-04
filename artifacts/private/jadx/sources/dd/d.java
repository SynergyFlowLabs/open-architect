package dd;

import com.planner5d.library.model.manager.u1;
import com.planner5d.library.userimporteddata.i;
import com.planner5d.library.userimporteddata.l;
import com.planner5d.library.userimporteddata.n;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@e
@s("javax.inject.Singleton")
public final class d implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<n> f269922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<i> f269923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<l> f269924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<u1> f269925d;

    public d(ij.c<n> cVar, ij.c<i> cVar2, ij.c<l> cVar3, ij.c<u1> cVar4) {
        this.f269922a = cVar;
        this.f269923b = cVar2;
        this.f269924c = cVar3;
        this.f269925d = cVar4;
    }

    public static d a(ij.c<n> cVar, ij.c<i> cVar2, ij.c<l> cVar3, ij.c<u1> cVar4) {
        return new d(cVar, cVar2, cVar3, cVar4);
    }

    public static c c(n nVar, i iVar, l lVar, u1 u1Var) {
        return new c(nVar, iVar, lVar, u1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f269922a.get(), this.f269923b.get(), this.f269924c.get(), this.f269925d.get());
    }
}
