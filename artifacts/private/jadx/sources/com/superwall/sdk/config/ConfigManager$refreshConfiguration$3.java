package com.superwall.sdk.config;

import android.content.Context;
import com.superwall.sdk.network.AwaitUntilNetworkExistsKt;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.ConfigManager$refreshConfiguration$3", f = "ConfigManager.kt", i = {}, l = {410}, m = "invokeSuspend", n = {}, s = {})
final class ConfigManager$refreshConfiguration$3 extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ AtomicInteger $retryCount;
    int label;
    final /* synthetic */ ConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigManager$refreshConfiguration$3(AtomicInteger atomicInteger, ConfigManager configManager, kotlin.coroutines.d<? super ConfigManager$refreshConfiguration$3> dVar) {
        super(1, dVar);
        this.$retryCount = atomicInteger;
        this.this$0 = configManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new ConfigManager$refreshConfiguration$3(this.$retryCount, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            this.$retryCount.incrementAndGet();
            Context context = this.this$0.context;
            this.label = 1;
            if (AwaitUntilNetworkExistsKt.awaitUntilNetworkExists$default(context, 0L, this, 1, null) == objL) {
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

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((ConfigManager$refreshConfiguration$3) create(dVar)).invokeSuspend(Unit.f312394a);
    }
}
