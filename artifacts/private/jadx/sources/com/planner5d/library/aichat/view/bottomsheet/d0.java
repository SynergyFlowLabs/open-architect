package com.planner5d.library.aichat.view.bottomsheet;

import com.planner5d.library.aichat.command.AiChatResponseMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements yc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f142025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private AiChatResponseMessage f142026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f142027c;

    public d0(int i10, @NotNull AiChatResponseMessage message, boolean z10) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f142025a = i10;
        this.f142026b = message;
        this.f142027c = z10;
    }

    public final boolean a() {
        return this.f142027c;
    }

    public final int b() {
        return this.f142025a;
    }

    @NotNull
    public final AiChatResponseMessage c() {
        return this.f142026b;
    }

    public final void d(@NotNull AiChatResponseMessage aiChatResponseMessage) {
        Intrinsics.checkNotNullParameter(aiChatResponseMessage, "<set-?>");
        this.f142026b = aiChatResponseMessage;
    }

    @Override // yc.b
    public boolean equals(@Nullable Object obj) {
        AiChatResponseMessage aiChatResponseMessage = this.f142026b;
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        return Intrinsics.areEqual(aiChatResponseMessage, d0Var != null ? d0Var.f142026b : null) && ((d0) obj).f142027c == this.f142027c && n(obj);
    }

    public int hashCode() {
        return this.f142026b.hashCode() + Integer.hashCode(this.f142025a);
    }

    @Override // yc.b
    public boolean n(@Nullable Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        return d0Var != null && this.f142025a == d0Var.f142025a;
    }
}
