package androidx.work.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStartStopToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/StartStopTokens\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n361#2,7:66\n467#2,7:73\n1855#3,2:80\n1#4:82\n*S KotlinDebug\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/StartStopTokens\n*L\n40#1:66,7\n52#1:73,7\n53#1:80,2\n*E\n"})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f76610a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<androidx.work.impl.model.n, a0> f76611b = new LinkedHashMap();

    public final boolean a(@NotNull androidx.work.impl.model.n id2) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f76610a) {
            try {
                zContainsKey = this.f76611b.containsKey(id2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsKey;
    }

    @Nullable
    public final a0 b(@NotNull androidx.work.impl.model.n id2) {
        a0 a0VarRemove;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f76610a) {
            try {
                a0VarRemove = this.f76611b.remove(id2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a0VarRemove;
    }

    @Nullable
    public final a0 c(@NotNull androidx.work.impl.model.v spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return b(androidx.work.impl.model.z.a(spec));
    }

    @NotNull
    public final List<a0> d(@NotNull String workSpecId) {
        List<a0> list;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f76610a) {
            try {
                Map<androidx.work.impl.model.n, a0> map = this.f76611b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<androidx.work.impl.model.n, a0> entry : map.entrySet()) {
                    if (Intrinsics.areEqual(entry.getKey().f(), workSpecId)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.f76611b.remove((androidx.work.impl.model.n) it.next());
                }
                list = CollectionsKt.toList(linkedHashMap.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @NotNull
    public final a0 e(@NotNull androidx.work.impl.model.n id2) {
        a0 a0Var;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f76610a) {
            try {
                Map<androidx.work.impl.model.n, a0> map = this.f76611b;
                a0 a0Var2 = map.get(id2);
                if (a0Var2 == null) {
                    a0Var2 = new a0(id2);
                    map.put(id2, a0Var2);
                }
                a0Var = a0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a0Var;
    }

    @NotNull
    public final a0 f(@NotNull androidx.work.impl.model.v spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return e(androidx.work.impl.model.z.a(spec));
    }
}
