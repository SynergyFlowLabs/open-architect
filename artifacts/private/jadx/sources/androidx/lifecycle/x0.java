package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    public static final class a<T> implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52593a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super T, Unit> function1) {
            this.f52593a = function1;
        }

        @Override // androidx.lifecycle.d1
        public final void c(T t10) {
            this.f52593a.invoke(t10);
        }
    }

    @kotlin.l(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @androidx.annotation.l0
    @NotNull
    public static final <T> d1<T> a(@NotNull w0<T> w0Var, @NotNull o0 owner, @NotNull Function1<? super T, Unit> onChanged) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        a aVar = new a(onChanged);
        w0Var.k(owner, aVar);
        return aVar;
    }
}
