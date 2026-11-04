package io.ktor.client.engine;

import io.ktor.client.engine.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface l<T extends j> {

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b b(l lVar, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i10 & 1) != 0) {
                function1 = new Function1() { // from class: io.ktor.client.engine.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return l.a.c((j) obj2);
                    }
                };
            }
            return lVar.a(function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit c(j jVar) {
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            return Unit.f312394a;
        }
    }

    @NotNull
    b a(@NotNull Function1<? super T, Unit> function1);
}
