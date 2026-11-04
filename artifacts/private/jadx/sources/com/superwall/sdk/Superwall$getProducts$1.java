package com.superwall.sdk;

import androidx.constraintlayout.core.motion.utils.v;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.Superwall", f = "Superwall.kt", i = {}, l = {v.b.f43998o}, m = "getProducts-gIAlu-s", n = {}, s = {})
final class Superwall$getProducts$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Superwall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Superwall$getProducts$1(Superwall superwall, kotlin.coroutines.d<? super Superwall$getProducts$1> dVar) {
        super(dVar);
        this.this$0 = superwall;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        int i10 = 3 ^ 0;
        Object objM12getProductsgIAlus = this.this$0.m12getProductsgIAlus(null, this);
        return objM12getProductsgIAlus == kotlin.coroutines.intrinsics.b.l() ? objM12getProductsgIAlus : Result.a(objM12getProductsgIAlus);
    }
}
