package ub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tb.g;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private List<b> f381218a = new ArrayList();

    public final void a(@NotNull List<b> additional) {
        Intrinsics.checkNotNullParameter(additional, "additional");
        this.f381218a.addAll(additional);
    }

    @NotNull
    public final List<b> b() {
        return this.f381218a;
    }

    @NotNull
    public final List<b> c(@NotNull List<b> hits) {
        Intrinsics.checkNotNullParameter(hits, "hits");
        ArrayList arrayList = new ArrayList();
        for (Object obj : hits) {
            if (((b) obj).k()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void d(@NotNull List<b> hits) {
        String strD;
        Intrinsics.checkNotNullParameter(hits, "hits");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (b bVar : CollectionsKt.plus((Collection) this.f381218a, (Iterable) hits)) {
            g gVarM = bVar.m();
            if (gVarM != null && (strD = gVarM.d()) != null) {
                linkedHashMap.put(strD, bVar);
            }
        }
        this.f381218a = CollectionsKt.toMutableList(linkedHashMap.values());
    }
}
