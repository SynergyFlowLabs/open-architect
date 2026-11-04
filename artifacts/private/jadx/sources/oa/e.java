package oa;

import com.planner5d.library.model.converter.json.from.j;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class e implements h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<j> f333608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.a> f333609b;

    public e(ij.c<j> cVar, ij.c<com.planner5d.library.model.converter.json.from.a> cVar2) {
        this.f333608a = cVar;
        this.f333609b = cVar2;
    }

    public static e a(ij.c<j> cVar, ij.c<com.planner5d.library.model.converter.json.from.a> cVar2) {
        return new e(cVar, cVar2);
    }

    public static d c(j jVar, com.planner5d.library.model.converter.json.from.a aVar) {
        return new d(jVar, aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f333608a.get(), this.f333609b.get());
    }
}
