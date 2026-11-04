package io.ktor.client.plugins.observer;

import io.ktor.http.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends io.ktor.client.call.b {
    public /* synthetic */ c(io.ktor.client.c cVar, Function0 function0, io.ktor.client.call.b bVar, v0 v0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (Function0<? extends io.ktor.utils.io.h>) function0, bVar, (i10 & 8) != 0 ? bVar.k().O() : v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.h t(io.ktor.utils.io.h hVar) {
        return hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull io.ktor.client.c client, @NotNull Function0<? extends io.ktor.utils.io.h> block, @NotNull io.ktor.client.call.b originCall, @NotNull v0 responseHeaders) {
        super(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(originCall, "originCall");
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        n(new e(this, originCall.j()));
        p(new g(this, block, originCall.k(), responseHeaders));
    }

    public /* synthetic */ c(io.ktor.client.c cVar, io.ktor.utils.io.h hVar, io.ktor.client.call.b bVar, v0 v0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, hVar, bVar, (i10 & 8) != 0 ? bVar.k().O() : v0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull io.ktor.client.c client, @NotNull final io.ktor.utils.io.h content, @NotNull io.ktor.client.call.b originCall, @NotNull v0 responseHeaders) {
        this(client, (Function0<? extends io.ktor.utils.io.h>) new Function0() { // from class: io.ktor.client.plugins.observer.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.t(content);
            }
        }, originCall, responseHeaders);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(originCall, "originCall");
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
    }
}
