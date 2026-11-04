package io.ktor.client.request.forms;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Long f295297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<c0> f295298b;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@Nullable Long l10, @NotNull Function0<? extends c0> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f295297a = l10;
        this.f295298b = block;
    }

    @NotNull
    public final Function0<c0> a() {
        return this.f295298b;
    }

    @Nullable
    public final Long b() {
        return this.f295297a;
    }

    public /* synthetic */ r(Long l10, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, function0);
    }
}
