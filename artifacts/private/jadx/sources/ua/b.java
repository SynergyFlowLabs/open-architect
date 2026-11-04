package ua;

import com.planner5d.library.model.manager.u1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;
import ij.c;

/* JADX INFO: loaded from: classes6.dex */
@r
@e
@s
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<u1> f381209a;

    public b(c<u1> cVar) {
        this.f381209a = cVar;
    }

    public static b a(c<u1> cVar) {
        return new b(cVar);
    }

    public static a c(u1 u1Var) {
        return new a(u1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f381209a.get());
    }
}
