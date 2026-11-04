package io.ktor.client.plugins.api;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    @NotNull
    public static final <PluginConfigT> b<PluginConfigT> b(@NotNull String name, @NotNull Function0<? extends PluginConfigT> createConfiguration, @NotNull Function1<? super d<PluginConfigT>, Unit> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createConfiguration, "createConfiguration");
        Intrinsics.checkNotNullParameter(body, "body");
        return new e(name, createConfiguration, body);
    }

    @NotNull
    public static final b<Unit> c(@NotNull String name, @NotNull Function1<? super d<Unit>, Unit> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        return b(name, new Function0() { // from class: io.ktor.client.plugins.api.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.d();
            }
        }, body);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d() {
        return Unit.f312394a;
    }
}
