package androidx.datastore.preferences.core;

import androidx.datastore.core.m;
import androidx.datastore.core.q0;
import androidx.datastore.core.r;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import okio.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f49868a = new e();

    static final class a extends l0 implements Function0<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<File> f49869a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends File> function0) {
            super(0);
            this.f49869a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileInvoke = this.f49869a.invoke();
            if (Intrinsics.areEqual(kotlin.io.l.b0(fileInvoke), "preferences_pb")) {
                File absoluteFile = fileInvoke.getAbsoluteFile();
                Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    static final class b extends l0 implements Function0<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<r0> f49870a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<r0> function0) {
            super(0);
            this.f49870a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return this.f49870a.invoke().toFile();
        }
    }

    private e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.datastore.core.l i(e eVar, q0 q0Var, v1.b bVar, List list, s0 s0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 8) != 0) {
            s0Var = t0.a(androidx.datastore.preferences.core.a.c().plus(q3.c(null, 1, null)));
        }
        return eVar.d(q0Var, bVar, list, s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.datastore.core.l j(e eVar, v1.b bVar, List list, s0 s0Var, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 4) != 0) {
            s0Var = t0.a(l1.c().plus(q3.c(null, 1, null)));
        }
        return eVar.g(bVar, list, s0Var, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.datastore.core.l o(e eVar, v1.b bVar, List list, s0 s0Var, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 4) != 0) {
            s0Var = t0.a(androidx.datastore.preferences.core.a.c().plus(q3.c(null, 1, null)));
        }
        return eVar.m(bVar, list, s0Var, function0);
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> a(@NotNull q0<f> storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return i(this, storage, null, null, null, 14, null);
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> b(@NotNull q0<f> storage, @Nullable v1.b<f> bVar) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        int i10 = 2 | 0;
        return i(this, storage, bVar, null, null, 12, null);
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> c(@NotNull q0<f> storage, @Nullable v1.b<f> bVar, @NotNull List<? extends androidx.datastore.core.j<f>> migrations) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return i(this, storage, bVar, migrations, null, 8, null);
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> d(@NotNull q0<f> storage, @Nullable v1.b<f> bVar, @NotNull List<? extends androidx.datastore.core.j<f>> migrations, @NotNull s0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new d(m.f49533a.h(storage, bVar, migrations, scope));
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> e(@NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return j(this, null, null, null, produceFile, 7, null);
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> f(@Nullable v1.b<f> bVar, @NotNull List<? extends androidx.datastore.core.j<f>> migrations, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return j(this, bVar, migrations, null, produceFile, 4, null);
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> g(@Nullable v1.b<f> bVar, @NotNull List<? extends androidx.datastore.core.j<f>> migrations, @NotNull s0 scope, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new d(d(new r(h.f49874a, null, new a(produceFile), 2, null), bVar, migrations, scope));
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> h(@Nullable v1.b<f> bVar, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return j(this, bVar, null, null, produceFile, 6, null);
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> k(@NotNull Function0<r0> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return o(this, null, null, null, produceFile, 7, null);
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> l(@Nullable v1.b<f> bVar, @NotNull List<? extends androidx.datastore.core.j<f>> migrations, @NotNull Function0<r0> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return o(this, bVar, migrations, null, produceFile, 4, null);
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> m(@Nullable v1.b<f> bVar, @NotNull List<? extends androidx.datastore.core.j<f>> migrations, @NotNull s0 scope, @NotNull Function0<r0> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return g(bVar, migrations, scope, new b(produceFile));
    }

    @oj.j
    @NotNull
    public final androidx.datastore.core.l<f> n(@Nullable v1.b<f> bVar, @NotNull Function0<r0> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return o(this, bVar, null, null, produceFile, 6, null);
    }
}
