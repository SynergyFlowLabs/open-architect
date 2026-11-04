package com.planner5d.library.model.editorcollection;

import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
public final class n extends t implements i.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f180719d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f180720e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f180721f = 64;

    public static final class a extends t.b<n> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.planner5d.library.model.editorcollection.k
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public n a(@Nullable id.a aVar) {
            return new n(aVar);
        }

        private a() {
        }
    }

    public n(@Nullable id.a aVar) {
        super("used_last", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(g.b bVar, g.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.a(), bVar.a());
    }

    @Override // com.planner5d.library.model.editorcollection.i
    @NotNull
    public List<g.b> a(boolean z10) {
        return d().d();
    }

    @Override // com.planner5d.library.model.editorcollection.i.a
    public void b(@NotNull g.b value) throws l0 {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new l0("Cannot remove from last used list");
    }

    @Override // com.planner5d.library.model.editorcollection.i.a
    public void c(@NotNull final g.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List<g.b> mutableList = CollectionsKt.toMutableList((Collection) a(false));
        CollectionsKt.removeAll((List) mutableList, new Function1() { // from class: com.planner5d.library.model.editorcollection.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(n.g(value, (g.b) obj));
            }
        });
        mutableList.add(0, value);
        while (mutableList.size() > 64) {
            mutableList.remove(mutableList.size() - 1);
        }
        d().g(mutableList);
    }
}
