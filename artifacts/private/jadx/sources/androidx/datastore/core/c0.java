package androidx.datastore.core;

import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.q3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c0 f49488a = new c0();

    static final class a extends kotlin.jvm.internal.l0 implements Function1<File, w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f49489a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlinx.coroutines.s0 s0Var) {
            super(1);
            this.f49489a = s0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w invoke(@NotNull File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new a0(this.f49489a.getCoroutineContext(), it);
        }
    }

    private c0() {
    }

    public static /* synthetic */ l i(c0 c0Var, l0 l0Var, v1.b bVar, List list, kotlinx.coroutines.s0 s0Var, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 8) != 0) {
            s0Var = kotlinx.coroutines.t0.a(l1.c().plus(q3.c(null, 1, null)));
        }
        return c0Var.c(l0Var, bVar, list, s0Var, function0);
    }

    public static /* synthetic */ l j(c0 c0Var, q0 q0Var, v1.b bVar, List list, kotlinx.coroutines.s0 s0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 8) != 0) {
            s0Var = kotlinx.coroutines.t0.a(l1.c().plus(q3.c(null, 1, null)));
        }
        return c0Var.h(q0Var, bVar, list, s0Var);
    }

    @oj.j
    @NotNull
    public final <T> l<T> a(@NotNull l0<T> serializer, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return i(this, serializer, null, null, null, produceFile, 14, null);
    }

    @oj.j
    @NotNull
    public final <T> l<T> b(@NotNull l0<T> serializer, @Nullable v1.b<T> bVar, @NotNull List<? extends j<T>> migrations, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return i(this, serializer, bVar, migrations, null, produceFile, 8, null);
    }

    @oj.j
    @NotNull
    public final <T> l<T> c(@NotNull l0<T> serializer, @Nullable v1.b<T> bVar, @NotNull List<? extends j<T>> migrations, @NotNull kotlinx.coroutines.s0 scope, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        r rVar = new r(serializer, new a(scope), produceFile);
        List listListOf = CollectionsKt.listOf(k.f49508a.b(migrations));
        if (bVar == null) {
            bVar = (v1.b<T>) new v1.a();
        }
        return new n(rVar, listListOf, bVar, scope);
    }

    @oj.j
    @NotNull
    public final <T> l<T> d(@NotNull l0<T> serializer, @Nullable v1.b<T> bVar, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return i(this, serializer, bVar, null, null, produceFile, 12, null);
    }

    @oj.j
    @NotNull
    public final <T> l<T> e(@NotNull q0<T> storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return j(this, storage, null, null, null, 14, null);
    }

    @oj.j
    @NotNull
    public final <T> l<T> f(@NotNull q0<T> storage, @Nullable v1.b<T> bVar) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return j(this, storage, bVar, null, null, 12, null);
    }

    @oj.j
    @NotNull
    public final <T> l<T> g(@NotNull q0<T> storage, @Nullable v1.b<T> bVar, @NotNull List<? extends j<T>> migrations) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return j(this, storage, bVar, migrations, null, 8, null);
    }

    @oj.j
    @NotNull
    public final <T> l<T> h(@NotNull q0<T> storage, @Nullable v1.b<T> bVar, @NotNull List<? extends j<T>> migrations, @NotNull kotlinx.coroutines.s0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        List listListOf = CollectionsKt.listOf(k.f49508a.b(migrations));
        if (bVar == null) {
            bVar = (v1.b<T>) new v1.a();
        }
        return new n(storage, listListOf, bVar, scope);
    }
}
