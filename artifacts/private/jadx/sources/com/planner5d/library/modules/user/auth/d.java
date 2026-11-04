package com.planner5d.library.modules.user.auth;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
public final class d extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f222867d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final id.a f222868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f222869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull id.a user, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> actionAfterAgreement) {
        super(null);
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(actionAfterAgreement, "actionAfterAgreement");
        this.f222868b = user;
        this.f222869c = actionAfterAgreement;
    }

    @NotNull
    public final Function1<kotlin.coroutines.d<? super Unit>, Object> a() {
        return this.f222869c;
    }

    @NotNull
    public final id.a b() {
        return this.f222868b;
    }
}
