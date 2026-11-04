package io.ktor.client.request.forms;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Long f295276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<io.ktor.utils.io.h> f295277b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Nullable Long l10, @NotNull Function0<? extends io.ktor.utils.io.h> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f295276a = l10;
        this.f295277b = block;
    }

    @NotNull
    public final Function0<io.ktor.utils.io.h> a() {
        return this.f295277b;
    }

    @Nullable
    public final Long b() {
        return this.f295276a;
    }

    public /* synthetic */ a(Long l10, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, function0);
    }
}
