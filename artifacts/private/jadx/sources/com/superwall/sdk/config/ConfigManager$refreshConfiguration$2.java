package com.superwall.sdk.config;

import com.superwall.sdk.network.device.DeviceHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.ConfigManager$refreshConfiguration$2", f = "ConfigManager.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
final class ConfigManager$refreshConfiguration$2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigManager$refreshConfiguration$2(ConfigManager configManager, kotlin.coroutines.d<? super ConfigManager$refreshConfiguration$2> dVar) {
        super(2, dVar);
        this.this$0 = configManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConfigManager$refreshConfiguration$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            DeviceHelper deviceHelper = this.this$0.deviceHelper;
            kotlin.time.c.a aVar = kotlin.time.c.f313406b;
            long jM0 = kotlin.time.e.m0(1, kotlin.time.f.SECONDS);
            this.label = 1;
            if (deviceHelper.m65getEnrichment8Mi8wO0(0, jM0, this) == objL) {
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
        return ((ConfigManager$refreshConfiguration$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
