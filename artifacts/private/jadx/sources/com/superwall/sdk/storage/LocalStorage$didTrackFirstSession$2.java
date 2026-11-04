package com.superwall.sdk.storage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.storage.LocalStorage$didTrackFirstSession$2", f = "LocalStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class LocalStorage$didTrackFirstSession$2 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ boolean $value;
    int label;
    final /* synthetic */ LocalStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalStorage$didTrackFirstSession$2(LocalStorage localStorage, boolean z10, d<? super LocalStorage$didTrackFirstSession$2> dVar) {
        super(2, dVar);
        this.this$0 = localStorage;
        this.$value = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LocalStorage$didTrackFirstSession$2(this.this$0, this.$value, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.this$0._didTrackFirstSession = this.$value;
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((LocalStorage$didTrackFirstSession$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
