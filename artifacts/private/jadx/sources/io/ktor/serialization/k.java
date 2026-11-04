package io.ktor.serialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.websocket.e f296401a;

    public /* synthetic */ k(String str, Throwable th2, io.ktor.websocket.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2, eVar);
    }

    @NotNull
    public final io.ktor.websocket.e a() {
        return this.f296401a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull String message, @Nullable Throwable th2, @NotNull io.ktor.websocket.e frame) {
        super(message, th2);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(frame, "frame");
        this.f296401a = frame;
    }
}
