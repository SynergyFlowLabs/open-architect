package com.superwall.sdk.config;

import android.content.Context;
import com.superwall.sdk.config.models.ConfigState;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.config.FeatureFlags;
import com.superwall.sdk.network.AwaitUntilNetworkExistsKt;
import com.superwall.sdk.network.NetworkError;
import com.superwall.sdk.network.SuperwallAPI;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.b4;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$configDeferred$1", f = "ConfigManager.kt", i = {0, 1}, l = {androidx.media2.widget.f.i.f59767c0, 165}, m = "invokeSuspend", n = {"start", "start"}, s = {"J$0", "J$0"})
final class ConfigManager$fetchConfig$configDeferred$1 extends o implements Function2<s0, kotlin.coroutines.d<? super Either<? extends Config, ? extends Throwable>>, Object> {
    final /* synthetic */ i1.g $configDuration;
    final /* synthetic */ AtomicInteger $configRetryCount;
    final /* synthetic */ i1.a $isConfigFromCache;
    final /* synthetic */ Config $oldConfig;
    long J$0;
    int label;
    final /* synthetic */ ConfigManager this$0;

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$configDeferred$1$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$configDeferred$1$1", f = "ConfigManager.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$fetchConfig$configDeferred$1$1\n+ 2 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,425:1\n127#2:426\n*S KotlinDebug\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$fetchConfig$configDeferred$1$1\n*L\n144#1:426\n*E\n"})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Either<? extends Config, NetworkError>>, Object> {
        final /* synthetic */ AtomicInteger $configRetryCount;
        final /* synthetic */ i1.a $isConfigFromCache;
        final /* synthetic */ Config $oldConfig;
        int label;
        final /* synthetic */ ConfigManager this$0;

        /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$configDeferred$1$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$configDeferred$1$1$1", f = "ConfigManager.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$fetchConfig$configDeferred$1$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,425:1\n230#2,5:426\n*S KotlinDebug\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$fetchConfig$configDeferred$1$1$1\n*L\n141#1:426,5\n*E\n"})
        static final class C18731 extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
            final /* synthetic */ AtomicInteger $configRetryCount;
            int label;
            final /* synthetic */ ConfigManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18731(ConfigManager configManager, AtomicInteger atomicInteger, kotlin.coroutines.d<? super C18731> dVar) {
                super(1, dVar);
                this.this$0 = configManager;
                this.$configRetryCount = atomicInteger;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new C18731(this.this$0, this.$configRetryCount, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    k0<ConfigState> configState$superwall_release = this.this$0.getConfigState$superwall_release();
                    while (!configState$superwall_release.compareAndSet(configState$superwall_release.getValue(), ConfigState.Retrying.INSTANCE)) {
                    }
                    this.$configRetryCount.incrementAndGet();
                    Function1 function1 = this.this$0.awaitUtilNetwork;
                    this.label = 1;
                    if (function1.invoke(this) == objL) {
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
                return ((C18731) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ConfigManager configManager, AtomicInteger atomicInteger, i1.a aVar, Config config, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = configManager;
            this.$configRetryCount = atomicInteger;
            this.$isConfigFromCache = aVar;
            this.$oldConfig = config;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$configRetryCount, this.$isConfigFromCache, this.$oldConfig, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Either<? extends Config, NetworkError>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Either<Config, NetworkError>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SuperwallAPI superwallAPI = this.this$0.network;
                C18731 c18731 = new C18731(this.this$0, this.$configRetryCount, null);
                this.label = 1;
                obj = superwallAPI.getConfig(c18731, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Either either = (Either) obj;
            i1.a aVar = this.$isConfigFromCache;
            Config config = this.$oldConfig;
            if (!(either instanceof Either.Failure)) {
                return either;
            }
            aVar.f312744a = true;
            return new Either.Success(config);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super Either<Config, NetworkError>> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$configDeferred$1$3, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$configDeferred$1$3", f = "ConfigManager.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$fetchConfig$configDeferred$1$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,425:1\n230#2,5:426\n*S KotlinDebug\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$fetchConfig$configDeferred$1$3\n*L\n166#1:426,5\n*E\n"})
    static final class AnonymousClass3 extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ AtomicInteger $configRetryCount;
        int label;
        final /* synthetic */ ConfigManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ConfigManager configManager, AtomicInteger atomicInteger, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(1, dVar);
            this.this$0 = configManager;
            this.$configRetryCount = atomicInteger;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass3(this.this$0, this.$configRetryCount, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0<ConfigState> configState$superwall_release = this.this$0.getConfigState$superwall_release();
                while (!configState$superwall_release.compareAndSet(configState$superwall_release.getValue(), ConfigState.Retrying.INSTANCE)) {
                }
                this.$configRetryCount.incrementAndGet();
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
            return ((AnonymousClass3) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigManager$fetchConfig$configDeferred$1(Config config, ConfigManager configManager, AtomicInteger atomicInteger, i1.a aVar, i1.g gVar, kotlin.coroutines.d<? super ConfigManager$fetchConfig$configDeferred$1> dVar) {
        super(2, dVar);
        this.$oldConfig = config;
        this.this$0 = configManager;
        this.$configRetryCount = atomicInteger;
        this.$isConfigFromCache = aVar;
        this.$configDuration = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConfigManager$fetchConfig$configDeferred$1(this.$oldConfig, this.this$0, this.$configRetryCount, this.$isConfigFromCache, this.$configDuration, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Either<? extends Config, ? extends Throwable>> dVar) {
        return invoke2(s0Var, (kotlin.coroutines.d<? super Either<Config, ? extends Throwable>>) dVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j10;
        FeatureFlags featureFlags;
        Throwable th2;
        long j11;
        Config config;
        Object failure;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Config config2 = this.$oldConfig;
            if (config2 == null || (featureFlags = config2.getFeatureFlags()) == null || !featureFlags.getEnableConfigRefresh()) {
                SuperwallAPI superwallAPI = this.this$0.network;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$configRetryCount, null);
                this.J$0 = jCurrentTimeMillis;
                this.label = 2;
                obj = superwallAPI.getConfig(anonymousClass3, this);
                if (obj != objL) {
                    j10 = jCurrentTimeMillis;
                    failure = (Either) obj;
                    j11 = j10;
                }
            } else {
                try {
                    long j12 = this.this$0.CACHE_LIMIT;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$configRetryCount, this.$isConfigFromCache, this.$oldConfig, null);
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    obj = b4.d(j12, anonymousClass1, this);
                    if (obj != objL) {
                        j11 = jCurrentTimeMillis;
                        failure = (Either) obj;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    j11 = jCurrentTimeMillis;
                    config = this.$oldConfig;
                    if (config != null) {
                        this.$isConfigFromCache.f312744a = true;
                        failure = new Either.Success(config);
                    } else {
                        failure = new Either.Failure(th2);
                    }
                }
            }
            return objL;
        }
        if (i10 == 1) {
            j11 = this.J$0;
            try {
                ResultKt.m(obj);
                failure = (Either) obj;
            } catch (Throwable th4) {
                th2 = th4;
                config = this.$oldConfig;
                if (config != null) {
                    this.$isConfigFromCache.f312744a = true;
                    failure = new Either.Success(config);
                } else {
                    failure = new Either.Failure(th2);
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.J$0;
            ResultKt.m(obj);
            failure = (Either) obj;
            j11 = j10;
        }
        this.$configDuration.f312750a = System.currentTimeMillis() - j11;
        return failure;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super Either<Config, ? extends Throwable>> dVar) {
        return ((ConfigManager$fetchConfig$configDeferred$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
