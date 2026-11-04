package io.ktor.websocket;

import io.ktor.websocket.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface f0<ConfigType, ExtensionType extends e0<ConfigType>> {
    boolean a();

    @NotNull
    ExtensionType b(@NotNull Function1<? super ConfigType, Unit> function1);

    boolean c();

    boolean d();

    @NotNull
    io.ktor.util.a<ExtensionType> getKey();
}
