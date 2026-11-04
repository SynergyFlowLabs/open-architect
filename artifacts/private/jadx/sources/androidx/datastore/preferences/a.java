package androidx.datastore.preferences;

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
@i(name = "PreferenceDataStoreDelegateKt")
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.datastore.preferences.a$a, reason: collision with other inner class name */
    public static final class C0440a extends l0 implements Function1<Context, List<? extends j<androidx.datastore.preferences.core.f>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0440a f49851a = new C0440a();

        C0440a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<j<androidx.datastore.preferences.core.f>> invoke(@NotNull Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.emptyList();
        }
    }

    @NotNull
    public static final kotlin.properties.e<Context, l<androidx.datastore.preferences.core.f>> a(@NotNull String name, @Nullable v1.b<androidx.datastore.preferences.core.f> bVar, @NotNull Function1<? super Context, ? extends List<? extends j<androidx.datastore.preferences.core.f>>> produceMigrations, @NotNull s0 scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ kotlin.properties.e b(String str, v1.b bVar, Function1 function1, s0 s0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            function1 = C0440a.f49851a;
        }
        if ((i10 & 8) != 0) {
            s0Var = t0.a(l1.c().plus(q3.c(null, 1, null)));
        }
        return a(str, bVar, function1, s0Var);
    }
}
