package com.superwall.sdk.misc;

import java.lang.Throwable;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.misc.EitherKt", f = "Either.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "eitherWithTimeout-rnQQ1Ag", n = {"error"}, s = {"L$0"})
final class EitherKt$eitherWithTimeout$1<T, E extends Throwable> extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    EitherKt$eitherWithTimeout$1(kotlin.coroutines.d<? super EitherKt$eitherWithTimeout$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return EitherKt.m26eitherWithTimeoutrnQQ1Ag(0L, null, null, this);
    }
}
