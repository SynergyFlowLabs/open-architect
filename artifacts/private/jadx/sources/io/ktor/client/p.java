package io.ktor.client;

import io.ktor.utils.io.r0;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    @r0
    @NotNull
    public static final c c(@NotNull io.ktor.client.engine.b engine, @NotNull Function1<? super j<?>, Unit> block) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(block, "block");
        j jVar = new j();
        block.invoke(jVar);
        return new c(engine, jVar, false);
    }

    @r0
    @NotNull
    public static final <T extends io.ktor.client.engine.j> c d(@NotNull io.ktor.client.engine.l<? extends T> engineFactory, @NotNull Function1<? super j<T>, Unit> block) {
        Intrinsics.checkNotNullParameter(engineFactory, "engineFactory");
        Intrinsics.checkNotNullParameter(block, "block");
        j jVar = new j();
        block.invoke(jVar);
        final io.ktor.client.engine.b bVarA = engineFactory.a(jVar.m());
        c cVar = new c(bVarA, jVar, true);
        CoroutineContext.Element element = cVar.getCoroutineContext().get(p2.M2);
        Intrinsics.checkNotNull(element);
        ((p2) element).E(new Function1() { // from class: io.ktor.client.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.g(bVarA, (Throwable) obj);
            }
        });
        return cVar;
    }

    public static /* synthetic */ c e(io.ktor.client.engine.l lVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return p.f((j) obj2);
                }
            };
        }
        return d(lVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(io.ktor.client.engine.b bVar, Throwable th2) throws IOException {
        bVar.close();
        return Unit.f312394a;
    }
}
