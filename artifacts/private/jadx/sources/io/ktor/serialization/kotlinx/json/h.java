package io.ktor.serialization.kotlinx.json;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h {
    @NotNull
    public static final ri.b a(@NotNull ri.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        s sVarA = bVar.a();
        Intrinsics.checkNotNull(sVarA);
        s sVarG = sVarA.d().get(0).g();
        Intrinsics.checkNotNull(sVarG);
        kotlin.reflect.g gVarJ = sVarG.J();
        Intrinsics.checkNotNull(gVarJ, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        return new ri.b((kotlin.reflect.d) gVarJ, sVarG);
    }
}
