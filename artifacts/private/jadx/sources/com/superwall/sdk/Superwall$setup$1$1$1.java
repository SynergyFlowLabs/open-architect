package com.superwall.sdk;

import com.superwall.sdk.config.ConfigManager;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.Superwall$setup$1$1$1", f = "Superwall.kt", i = {}, l = {544}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSuperwall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Superwall.kt\ncom/superwall/sdk/Superwall$setup$1$1$1\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 3 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,1155:1\n136#2,10:1156\n122#3,4:1166\n*S KotlinDebug\n*F\n+ 1 Superwall.kt\ncom/superwall/sdk/Superwall$setup$1$1$1\n*L\n538#1:1156,10\n546#1:1166,4\n*E\n"})
final class Superwall$setup$1$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ Superwall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Superwall$setup$1$1$1(Superwall superwall, d<? super Superwall$setup$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = superwall;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new Superwall$setup$1$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Either failure;
        Object objM785constructorimpl;
        Superwall superwall;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall superwall2 = this.this$0;
                superwall2.getDependencyContainer$superwall_release().getStorage().configure(superwall2.apiKey);
                superwall2.getDependencyContainer$superwall_release().getStorage().recordAppInstall(new Superwall$setup$1$1$1$1$1(superwall2, null));
                ConfigManager configManager = superwall2.getDependencyContainer$superwall_release().getConfigManager();
                this.L$0 = superwall2;
                this.label = 1;
                if (configManager.fetchConfiguration(this) == objL) {
                    return objL;
                }
                superwall = superwall2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                superwall = (Superwall) this.L$0;
                ResultKt.m(obj);
            }
            superwall.getDependencyContainer$superwall_release().getIdentityManager().configure();
            failure = new Either.Success(Unit.f312394a);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
        if (failure instanceof Either.Success) {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(((Either.Success) failure).getValue());
        } else {
            if (!(failure instanceof Either.Failure)) {
                throw new k0();
            }
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
        }
        Superwall superwall3 = this.this$0;
        Throwable thD = Result.d(objM785constructorimpl);
        if (thD == null) {
            k.f(t0.a(l1.e()), null, null, new Superwall$setup$1$1$1$2$1(superwall3, null), 3, null);
        } else {
            k.f(t0.a(l1.e()), null, null, new Superwall$setup$1$1$1$3$1(superwall3, thD, null), 3, null);
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.superwallCore, "Superwall SDK failed to initialize - " + thD.getMessage(), null, thD, 8, null);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((Superwall$setup$1$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
