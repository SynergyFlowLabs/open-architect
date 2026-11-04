package com.planner5d.library.services.utility;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class n3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function0<? extends T> f225336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private T f225337b;

    public n3(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f225336a = initializer;
    }

    public final T a() {
        Function0<? extends T> function0 = this.f225336a;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            this.f225337b = tInvoke;
            this.f225336a = null;
            if (tInvoke != null) {
                return tInvoke;
            }
        }
        return this.f225337b;
    }
}
