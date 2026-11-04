package io.ktor.client.plugins.websocket;

import io.ktor.websocket.o0;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface u extends o0 {

    public static final class a {
        @Nullable
        public static Object a(@NotNull u uVar, @NotNull io.ktor.websocket.e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objA = o0.a.a(uVar, eVar, dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }

    @NotNull
    io.ktor.client.call.b h();
}
