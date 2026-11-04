package com.superwall.sdk.config;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$10$1", f = "ConfigManager.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
final class ConfigManager$fetchConfig$10$1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigManager$fetchConfig$10$1(ConfigManager configManager, kotlin.coroutines.d<? super ConfigManager$fetchConfig$10$1> dVar) {
        super(2, dVar);
        this.this$0 = configManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConfigManager$fetchConfig$10$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            ConfigManager configManager = this.this$0;
            this.label = 1;
            if (configManager.preloadPaywalls(this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((ConfigManager$fetchConfig$10$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
