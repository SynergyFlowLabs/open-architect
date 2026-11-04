package tb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob.c f376252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<? extends n> f376253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i f376254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f376255d;

    public j(@NotNull ob.c editor) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        this.f376252a = editor;
        this.f376253b = CollectionsKt.emptyList();
        this.f376254c = new i();
        this.f376255d = new h(editor).a(new rb.c(0.0f, 1, null)).a(new rb.b(0.0f, 1, null));
    }

    private final List<String> a(List<? extends qb.a> list) {
        Collection collectionListOf;
        ArrayList arrayList = new ArrayList();
        for (qb.a aVar : list) {
            if (e(aVar)) {
                List<qb.a> listA = ((qb.f) aVar).a();
                collectionListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    collectionListOf.add(((qb.a) it.next()).d());
                }
            } else {
                collectionListOf = CollectionsKt.listOf(aVar.d());
            }
            CollectionsKt.addAll(arrayList, collectionListOf);
        }
        return arrayList;
    }

    private final boolean c(qb.a aVar) {
        return aVar instanceof qb.h;
    }

    private final boolean d(qb.a aVar) {
        return (aVar instanceof qb.d) || (aVar instanceof qb.e);
    }

    private final boolean e(qb.a aVar) {
        return aVar instanceof qb.f;
    }

    @NotNull
    public final List<n> b() {
        return this.f376253b;
    }

    public final void f(@NotNull qb.a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (c(item)) {
            this.f376253b = this.f376254c.c(this.f376252a.b(), (qb.c) item);
        } else if (d(item)) {
            this.f376253b = this.f376255d.h(this.f376252a.b());
        }
    }

    public final void g(@NotNull List<? extends qb.a> items) {
        String strD;
        Intrinsics.checkNotNullParameter(items, "items");
        List<String> listA = a(items);
        List<? extends n> list = this.f376253b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            g gVarC = ((n) obj).c();
            if (gVarC != null && (strD = gVarC.d()) != null && !listA.contains(strD)) {
                arrayList.add(obj);
            }
        }
        this.f376253b = arrayList;
    }

    public final void h(@NotNull List<? extends n> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f376253b = list;
    }
}
