package ob;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tb.g;
import tb.j;
import tb.k;
import tb.l;
import tb.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f333613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f333614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l f333615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final pb.d f333616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private tb.e f333617e;

    public b(@NotNull c editorDataProvider) {
        Intrinsics.checkNotNullParameter(editorDataProvider, "editorDataProvider");
        this.f333613a = editorDataProvider;
        this.f333614b = new j(editorDataProvider);
        this.f333615c = new l();
        this.f333616d = new pb.d();
    }

    private final void b() {
        Iterator<T> it = this.f333614b.b().iterator();
        while (it.hasNext()) {
            g gVarC = ((n) it.next()).c();
            if (gVarC instanceof qb.a) {
                this.f333616d.e((qb.a) gVarC, false);
            }
        }
    }

    private final void c(List<ub.b> list) {
        for (ub.b bVar : list) {
            if (bVar.m() instanceof qb.a) {
                this.f333616d.e((qb.a) bVar.m(), true);
            }
        }
    }

    private final void d(qb.a aVar) {
        this.f333617e = k.f376256a.a(aVar);
    }

    private final void e(qb.a aVar) {
        this.f333614b.f(aVar);
        this.f333614b.g(CollectionsKt.listOf(aVar));
    }

    private final boolean f(qb.a aVar) {
        return ((aVar instanceof qb.d) || (aVar instanceof qb.e)) && this.f333613a.c();
    }

    private final void g(qb.a aVar) {
        if (f(aVar)) {
            d(aVar);
            h();
        }
    }

    private final void h() {
        tb.e eVar = this.f333617e;
        if (eVar == null) {
            return;
        }
        b();
        List<ub.b> listA = this.f333615c.a(eVar, this.f333614b.b());
        for (ub.b bVar : listA) {
            this.f333616d.b(bVar.i(), bVar.j(), bVar.l());
        }
        c(listA);
    }

    @Override // ob.e
    @NotNull
    public d a(@NotNull qb.a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f333616d.a();
        e(item);
        g(item);
        return new d(this.f333616d.d(), CollectionsKt.toList(this.f333616d.c()));
    }
}
