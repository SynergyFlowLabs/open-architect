package ud;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.y1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@e
@s("javax.inject.Singleton")
public final class c implements h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y1> f381240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x> f381241b;

    public c(ij.c<y1> cVar, ij.c<x> cVar2) {
        this.f381240a = cVar;
        this.f381241b = cVar2;
    }

    public static c a(ij.c<y1> cVar, ij.c<x> cVar2) {
        return new c(cVar, cVar2);
    }

    public static b c(y1 y1Var, x xVar) {
        return new b(y1Var, xVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f381240a.get(), this.f381241b.get());
    }
}
