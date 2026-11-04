package klipper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class y extends x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<x> f312385h;

    public y() {
        super(null, null, 3, null);
        this.f312385h = new ArrayList();
    }

    public final void n() {
        this.f312385h.clear();
        r1.g(c()).clear();
    }

    @NotNull
    public final List<x> o() {
        return this.f312385h;
    }

    @NotNull
    public final List<List<k>> p() {
        List<List<k>> listD = q.d(t());
        q.m(listD, this, t.Closed);
        return listD;
    }

    @Nullable
    public final x q() {
        return (x) CollectionsKt.firstOrNull((List) c());
    }

    @NotNull
    public final List<List<k>> r() {
        List<List<k>> listD = q.d(b());
        Iterator<x> it = c().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "children.iterator()");
        while (it.hasNext()) {
            x next = it.next();
            if (next.k()) {
                listD.add(next.d());
            }
        }
        return listD;
    }

    @NotNull
    public final List<List<k>> s() {
        List<List<k>> listD = q.d(t());
        q.m(listD, this, t.Any);
        return listD;
    }

    public final int t() {
        int size = this.f312385h.size();
        return (size <= 0 || Intrinsics.areEqual(c().get(0), this.f312385h.get(0))) ? size : size - 1;
    }
}
