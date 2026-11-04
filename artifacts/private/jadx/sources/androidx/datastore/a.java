package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.j;
import androidx.datastore.core.l;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@i(name = "DataStoreDelegateKt")
public final class a {

    /* JADX INFO: renamed from: androidx.datastore.a$a, reason: collision with other inner class name */
    static final class C0427a extends l0 implements Function1<Context, List<? extends j<Object>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0427a f49444a = new C0427a();

        C0427a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<j<Object>> invoke(@NotNull Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.emptyList();
        }
    }

    @NotNull
    public static final <T> kotlin.properties.e<Context, l<T>> a(@NotNull String fileName, @NotNull androidx.datastore.core.l0<T> serializer, @Nullable v1.b<T> bVar, @NotNull Function1<? super Context, ? extends List<? extends j<T>>> produceMigrations, @NotNull s0 scope) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new d(fileName, new e(serializer), bVar, produceMigrations, scope);
    }

    public static /* synthetic */ kotlin.properties.e b(String str, androidx.datastore.core.l0 l0Var, v1.b bVar, Function1 function1, s0 s0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bVar = null;
        }
        if ((i10 & 8) != 0) {
            function1 = C0427a.f49444a;
        }
        if ((i10 & 16) != 0) {
            s0Var = t0.a(l1.c().plus(q3.c(null, 1, null)));
        }
        return a(str, l0Var, bVar, function1, s0Var);
    }
}
