package n5;

import com.facebook.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, a>> f332731a = new ConcurrentHashMap<>();

    public static /* synthetic */ List b(b bVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g0 g0Var = g0.f99617a;
            str = g0.o();
        }
        return bVar.a(str);
    }

    public static /* synthetic */ a d(b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g0 g0Var = g0.f99617a;
            str = g0.o();
        }
        return bVar.c(str, str2);
    }

    public static /* synthetic */ boolean f(b bVar, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g0 g0Var = g0.f99617a;
            str = g0.o();
        }
        return bVar.e(str, str2, z10);
    }

    public static /* synthetic */ void h(b bVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g0 g0Var = g0.f99617a;
            str = g0.o();
        }
        bVar.g(str);
    }

    public static /* synthetic */ void j(b bVar, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g0 g0Var = g0.f99617a;
            str = g0.o();
        }
        bVar.i(str, aVar);
    }

    public static /* synthetic */ void l(b bVar, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g0 g0Var = g0.f99617a;
            str = g0.o();
        }
        bVar.k(str, str2, z10);
    }

    public static /* synthetic */ void n(b bVar, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g0 g0Var = g0.f99617a;
            str = g0.o();
        }
        bVar.m(str, list);
    }

    @Nullable
    public final List<a> a(@NotNull String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        ConcurrentHashMap<String, a> concurrentHashMap = this.f332731a.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, a>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    @Nullable
    public final a c(@NotNull String appId, @NotNull String name) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(name, "name");
        ConcurrentHashMap<String, a> concurrentHashMap = this.f332731a.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(name);
    }

    public final boolean e(@NotNull String appId, @NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(name, "name");
        a aVarC = c(appId, name);
        return aVarC == null ? z10 : aVarC.f();
    }

    public final void g(@NotNull String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f332731a.remove(appId);
    }

    public final void i(@NotNull String appId, @NotNull a gateKeeper) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(gateKeeper, "gateKeeper");
        if (!this.f332731a.containsKey(appId)) {
            this.f332731a.put(appId, new ConcurrentHashMap<>());
        }
        ConcurrentHashMap<String, a> concurrentHashMap = this.f332731a.get(appId);
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.put(gateKeeper.e(), gateKeeper);
    }

    public final void k(@NotNull String appId, @NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(name, "name");
        i(appId, new a(name, z10));
    }

    public final void m(@NotNull String appId, @NotNull List<a> gateKeeperList) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        for (a aVar : gateKeeperList) {
            concurrentHashMap.put(aVar.e(), aVar);
        }
        this.f332731a.put(appId, concurrentHashMap);
    }
}
