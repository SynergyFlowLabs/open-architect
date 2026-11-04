package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface z<TConfig, TPlugin> {

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object b(z zVar, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
            }
            if ((i10 & 1) != 0) {
                function1 = new Function1() { // from class: io.ktor.client.plugins.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return z.a.c(obj2);
                    }
                };
            }
            return zVar.a(function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit c(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<this>");
            return Unit.f312394a;
        }
    }

    @NotNull
    TPlugin a(@NotNull Function1<? super TConfig, Unit> function1);

    void b(@NotNull TPlugin tplugin, @NotNull io.ktor.client.c cVar);

    @NotNull
    io.ktor.util.a<TPlugin> getKey();
}
