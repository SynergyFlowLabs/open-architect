package hf;

import com.planner5d.library.math.k;
import java.util.ArrayList;
import java.util.List;
import kf.e;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<b> f285792a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<kf.d> f285793b = new ArrayList();

    public static /* synthetic */ b c(c cVar, k kVar, k kVar2, e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            eVar = null;
        }
        return cVar.b(kVar, kVar2, eVar);
    }

    @NotNull
    public final c a(@NotNull b wall1, @NotNull b wall2, int i10, int i11, @NotNull e color) {
        Intrinsics.checkNotNullParameter(wall1, "wall1");
        Intrinsics.checkNotNullParameter(wall2, "wall2");
        Intrinsics.checkNotNullParameter(color, "color");
        this.f285793b.add(new kf.d(wall1.b(), wall2.b(), i10, i11, color));
        return this;
    }

    @NotNull
    public final b b(@NotNull k start, @NotNull k end, @Nullable e eVar) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        d dVar = new d(new kf.c(start, end, eVar, this.f285792a.size(), null));
        this.f285792a.add(dVar);
        return dVar;
    }

    @NotNull
    public final kf.b d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = CollectionsKt.toList(this.f285793b);
        for (b bVar : this.f285792a) {
            arrayList.add(bVar.b());
            arrayList2.addAll(bVar.a());
        }
        e();
        return new kf.b(arrayList, list, arrayList2);
    }

    public final void e() {
        this.f285792a.clear();
        this.f285793b.clear();
    }
}
