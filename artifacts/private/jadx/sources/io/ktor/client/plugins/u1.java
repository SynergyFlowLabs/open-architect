package io.ktor.client.plugins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@io.ktor.utils.io.r0
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f295134a;

    /* JADX WARN: Multi-variable type inference failed */
    public u1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String a() {
        return this.f295134a;
    }

    public final void b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f295134a = str;
    }

    public u1(@NotNull String agent) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        this.f295134a = agent;
    }

    public /* synthetic */ u1(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "Ktor http-client" : str);
    }
}
