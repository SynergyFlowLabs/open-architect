package tb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob.c f376250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<rb.a> f376251b;

    public h(@NotNull ob.c editor) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        this.f376250a = editor;
        this.f376251b = new ArrayList();
    }

    private final void b(List<e> list, qb.a aVar) {
        list.add(k.f376256a.a(aVar));
    }

    private final List<e> c(List<? extends qb.a> list) {
        List<qb.a> listE = e(list);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            b(arrayList, (qb.a) it.next());
        }
        return arrayList;
    }

    private final List<f> d() {
        List<qb.g> listA = this.f376250a.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, f((qb.g) it.next()));
        }
        return arrayList;
    }

    private final List<qb.a> e(List<? extends qb.a> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            qb.a aVar = (qb.a) obj;
            if ((aVar instanceof qb.d) || (aVar instanceof qb.e)) {
                List<rb.a> list2 = this.f376251b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (((rb.a) it.next()).a(aVar));
                }
                arrayList.add(obj);
                break;
            }
        }
        return arrayList;
    }

    private final List<f> f(qb.g gVar) {
        return gVar.isHidden() ? CollectionsKt.emptyList() : CollectionsKt.listOf((Object[]) new f[]{g(gVar, qb.g.b.InLine), g(gVar, qb.g.b.OutLine)});
    }

    private final f g(qb.g gVar, qb.g.b bVar) {
        return new f(gVar.c(bVar), gVar.e(bVar), gVar);
    }

    @NotNull
    public final h a(@NotNull rb.a filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f376251b.add(filter);
        return this;
    }

    @NotNull
    public final List<n> h(@NotNull List<? extends qb.a> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return CollectionsKt.plus((Collection) c(items), (Iterable) d());
    }
}
