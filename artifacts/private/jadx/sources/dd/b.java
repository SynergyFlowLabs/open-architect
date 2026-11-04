package dd;

import com.planner5d.library.model.converter.json.from.c0;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.userimporteddata.i;
import com.planner5d.library.userimporteddata.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@e
@s("javax.inject.Singleton")
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f269912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<l> f269913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p0> f269914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c0> f269915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<u1> f269916e;

    public b(ij.c<i> cVar, ij.c<l> cVar2, ij.c<p0> cVar3, ij.c<c0> cVar4, ij.c<u1> cVar5) {
        this.f269912a = cVar;
        this.f269913b = cVar2;
        this.f269914c = cVar3;
        this.f269915d = cVar4;
        this.f269916e = cVar5;
    }

    public static b a(ij.c<i> cVar, ij.c<l> cVar2, ij.c<p0> cVar3, ij.c<c0> cVar4, ij.c<u1> cVar5) {
        return new b(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static a c(i iVar, l lVar, p0 p0Var, c0 c0Var, u1 u1Var) {
        return new a(iVar, lVar, p0Var, c0Var, u1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f269912a.get(), this.f269913b.get(), this.f269914c.get(), this.f269915d.get(), this.f269916e.get());
    }
}
