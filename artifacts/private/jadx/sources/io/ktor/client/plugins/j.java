package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f294859a = pi.a.a("io.ktor.client.plugins.DefaultRequest");

    public static final void c(@NotNull io.ktor.client.j<?> jVar, @NotNull final Function1<? super h.a, Unit> block) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jVar.r(h.f294818b, new Function1() { // from class: io.ktor.client.plugins.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.d(block, (h.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, h.a install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        function1.invoke(install);
        return Unit.f312394a;
    }
}
