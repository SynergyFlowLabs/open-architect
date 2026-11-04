package io.ktor.serialization;

import io.ktor.http.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface b {

    public static final class a {
        public static /* synthetic */ void b(b bVar, m mVar, d dVar, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i10 & 4) != 0) {
                function1 = new Function1() { // from class: io.ktor.serialization.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return b.a.c((d) obj2);
                    }
                };
            }
            bVar.a(mVar, dVar, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit c(d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return Unit.f312394a;
        }
    }

    <T extends d> void a(@NotNull m mVar, @NotNull T t10, @NotNull Function1<? super T, Unit> function1);
}
