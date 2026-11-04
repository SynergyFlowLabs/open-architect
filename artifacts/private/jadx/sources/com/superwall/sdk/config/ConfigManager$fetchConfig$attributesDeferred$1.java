package com.superwall.sdk.config;

import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$attributesDeferred$1", f = "ConfigManager.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
final class ConfigManager$fetchConfig$attributesDeferred$1 extends o implements Function2<s0, kotlin.coroutines.d<? super HashMap<String, Object>>, Object> {
    int label;
    final /* synthetic */ ConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigManager$fetchConfig$attributesDeferred$1(ConfigManager configManager, kotlin.coroutines.d<? super ConfigManager$fetchConfig$attributesDeferred$1> dVar) {
        super(2, dVar);
        this.this$0 = configManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConfigManager$fetchConfig$attributesDeferred$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        ResultKt.m(obj);
        ConfigManager.Factory factory = this.this$0.factory;
        this.label = 1;
        Object objMakeSessionDeviceAttributes = factory.makeSessionDeviceAttributes(this);
        return objMakeSessionDeviceAttributes == objL ? objL : objMakeSessionDeviceAttributes;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super HashMap<String, Object>> dVar) {
        return ((ConfigManager$fetchConfig$attributesDeferred$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
