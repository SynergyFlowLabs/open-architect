package com.planner5d.library.activity.fragment.gallery;

import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@ij.f
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f133801b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<com.planner5d.library.model.manager.q0.c, a> f133802a = new LinkedHashMap();

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f133803c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final com.planner5d.library.model.manager.q0.d f133804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @NotNull
        public final List<com.planner5d.library.model.k> f133805b;

        public a(@NotNull com.planner5d.library.model.manager.q0.d listFilter, @NotNull List<com.planner5d.library.model.k> items) {
            Intrinsics.checkNotNullParameter(listFilter, "listFilter");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f133804a = listFilter;
            this.f133805b = items;
        }
    }

    @ij.a
    public m() {
    }

    @Nullable
    public final a a(@NotNull com.planner5d.library.model.manager.q0.c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        a aVar = this.f133802a.get(type);
        this.f133802a.remove(type);
        return aVar;
    }

    public final void b(@NotNull com.planner5d.library.model.manager.q0.c type, @NotNull l adapter) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Map<com.planner5d.library.model.manager.q0.c, a> map = this.f133802a;
        com.planner5d.library.model.manager.q0.d dVarK = adapter.K();
        Intrinsics.checkNotNullExpressionValue(dVarK, "getListFilter(...)");
        List<com.planner5d.library.model.k> listU = adapter.u();
        Intrinsics.checkNotNullExpressionValue(listU, "getItems(...)");
        map.put(type, new a(dVarK, listU));
    }

    public final void c(@NotNull com.planner5d.library.model.k model) {
        Intrinsics.checkNotNullParameter(model, "model");
        a aVar = this.f133802a.get(model.b().f180739a);
        if (aVar == null) {
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) aVar.f133805b);
        int size = mutableList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Intrinsics.areEqual(((com.planner5d.library.model.k) mutableList.get(i10)).b().f180740b, model.b().f180740b)) {
                mutableList.set(i10, model);
                this.f133802a.put(model.b().f180739a, new a(aVar.f133804a, mutableList));
                return;
            }
        }
    }
}
