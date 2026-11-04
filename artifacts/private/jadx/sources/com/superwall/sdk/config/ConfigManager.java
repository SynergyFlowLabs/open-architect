package com.superwall.sdk.config;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.v;
import com.canhub.cropper.core.CropImageOptions;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.config.models.ConfigState;
import com.superwall.sdk.config.models.ConfigStateKt;
import com.superwall.sdk.config.options.SuperwallOptions;
import com.superwall.sdk.dependencies.DeviceHelperFactory;
import com.superwall.sdk.dependencies.DeviceInfoFactory;
import com.superwall.sdk.dependencies.RequestFactory;
import com.superwall.sdk.dependencies.RuleAttributesFactory;
import com.superwall.sdk.dependencies.StoreTransactionFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.config.FeatureFlags;
import com.superwall.sdk.models.enrichment.Enrichment;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.triggers.Experiment;
import com.superwall.sdk.models.triggers.Trigger;
import com.superwall.sdk.network.AwaitUntilNetworkExistsKt;
import com.superwall.sdk.network.NetworkError;
import com.superwall.sdk.network.SuperwallAPI;
import com.superwall.sdk.network.device.DeviceHelper;
import com.superwall.sdk.paywall.manager.PaywallManager;
import com.superwall.sdk.storage.DisableVerboseEvents;
import com.superwall.sdk.storage.LatestConfig;
import com.superwall.sdk.storage.Storage;
import com.superwall.sdk.store.Entitlements;
import com.superwall.sdk.store.StoreManager;
import com.superwall.sdk.web.WebPaywallRedeemer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.n;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 6 Either.kt\ncom/superwall/sdk/misc/EitherKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n56#2:426\n59#2:430\n46#3:427\n51#3:429\n105#4:428\n230#5,5:431\n230#5,5:441\n108#6,5:436\n108#6,5:447\n1#7:446\n*S KotlinDebug\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager\n*L\n98#1:426\n98#1:430\n98#1:427\n98#1:429\n98#1:428\n121#1:431,5\n268#1:441,5\n260#1:436,5\n377#1:447,5\n*E\n"})
public class ConfigManager {
    private final long CACHE_LIMIT;

    @NotNull
    private Map<String, Trigger> _triggersByEventName;

    @NotNull
    private final Assignments assignments;

    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> awaitUtilNetwork;

    @NotNull
    private final k0<ConfigState> configState;

    @NotNull
    private final Context context;

    @NotNull
    private final DeviceHelper deviceHelper;

    @NotNull
    private final Entitlements entitlements;

    @NotNull
    private final Factory factory;

    @NotNull
    private final i<Config> hasConfig;

    @NotNull
    private final IOScope ioScope;

    @NotNull
    private final SuperwallAPI network;

    @NotNull
    private SuperwallOptions options;

    @NotNull
    private final PaywallManager paywallManager;

    @NotNull
    private final PaywallPreload paywallPreload;

    @NotNull
    private final Storage storage;

    @NotNull
    private final StoreManager storeManager;

    @NotNull
    private final Function2<InternalSuperwallEvent, kotlin.coroutines.d<? super Unit>, Object> track;

    @NotNull
    private final Function0<WebPaywallRedeemer> webPaywallRedeemer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$1", f = "ConfigManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(1, dVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$context, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Context context = this.$context;
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
            return ((AnonymousClass1) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public interface Factory extends RequestFactory, DeviceInfoFactory, RuleAttributesFactory, DeviceHelperFactory, StoreTransactionFactory {
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$checkForWebEntitlements$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$checkForWebEntitlements$2", f = "ConfigManager.kt", i = {}, l = {v.c.f44017r}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ConfigManager.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                WebPaywallRedeemer webPaywallRedeemer = (WebPaywallRedeemer) ConfigManager.this.webPaywallRedeemer.invoke();
                WebPaywallRedeemer.RedeemType.Existing existing = WebPaywallRedeemer.RedeemType.Existing.INSTANCE;
                this.label = 1;
                if (webPaywallRedeemer.redeem(existing, this) == objL) {
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
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.config.ConfigManager", f = "ConfigManager.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 8, 8, 9}, l = {212, 213, 221, 232, 233, 237, com.planner5d.library.engine.input.f.b.U1, com.planner5d.library.engine.input.f.b.W1, 270, com.badlogic.gdx.utils.compression.lzma.a.f95331z}, m = "fetchConfig", n = {"this", "isConfigFromCache", "isEnrichmentFromCache", "configRetryCount", "configDuration", "attributesDeferred", "this", "isConfigFromCache", "isEnrichmentFromCache", "configRetryCount", "configDuration", "result", "enriched", "this", "isConfigFromCache", "isEnrichmentFromCache", "enrichmentResult", "this", "isConfigFromCache", "isEnrichmentFromCache", "enrichmentResult", "this", "isConfigFromCache", "isEnrichmentFromCache", "enrichmentResult", "this", "isConfigFromCache", "isEnrichmentFromCache", "enrichmentResult", "this", "isConfigFromCache", "isEnrichmentFromCache", "enrichmentResult", "this", "isConfigFromCache", "this", "e", "e"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class C26301 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C26301(kotlin.coroutines.d<? super C26301> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigManager.this.fetchConfig(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$3, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$3", f = "ConfigManager.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ HashMap<String, Object> $attributes;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(HashMap<String, Object> map, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$attributes = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ConfigManager.this.new AnonymousClass3(this.$attributes, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function2 function2 = ConfigManager.this.track;
                HashMap<String, Object> map = this.$attributes;
                Intrinsics.checkNotNull(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
                InternalSuperwallEvent.DeviceAttributes deviceAttributes = new InternalSuperwallEvent.DeviceAttributes(map, null, 2, null);
                this.label = 1;
                if (function2.invoke(deviceAttributes, this) == objL) {
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
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$4, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$4", f = "ConfigManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends o implements Function2<Config, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ i1.g $configDuration;
        final /* synthetic */ AtomicInteger $configRetryCount;
        final /* synthetic */ i1.a $isConfigFromCache;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$4$1, reason: invalid class name */
        @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$4$1", f = "ConfigManager.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            final /* synthetic */ i1.g $configDuration;
            final /* synthetic */ AtomicInteger $configRetryCount;
            final /* synthetic */ i1.a $isConfigFromCache;
            final /* synthetic */ Config $it;
            int label;
            final /* synthetic */ ConfigManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ConfigManager configManager, i1.a aVar, Config config, i1.g gVar, AtomicInteger atomicInteger, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = configManager;
                this.$isConfigFromCache = aVar;
                this.$it = config;
                this.$configDuration = gVar;
                this.$configRetryCount = atomicInteger;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$isConfigFromCache, this.$it, this.$configDuration, this.$configRetryCount, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Function2 function2 = this.this$0.track;
                    InternalSuperwallEvent.ConfigRefresh configRefresh = new InternalSuperwallEvent.ConfigRefresh(this.$isConfigFromCache.f312744a, this.$it.getBuildId(), this.$configRetryCount.get(), this.$configDuration.f312750a);
                    this.label = 1;
                    if (function2.invoke(configRefresh, this) == objL) {
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
                return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(i1.a aVar, i1.g gVar, AtomicInteger atomicInteger, kotlin.coroutines.d<? super AnonymousClass4> dVar) {
            super(2, dVar);
            this.$isConfigFromCache = aVar;
            this.$configDuration = gVar;
            this.$configRetryCount = atomicInteger;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass4 anonymousClass4 = ConfigManager.this.new AnonymousClass4(this.$isConfigFromCache, this.$configDuration, this.$configRetryCount, dVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Config config, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass4) create(config, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            k.f(ConfigManager.this.ioScope, null, null, new AnonymousClass1(ConfigManager.this, this.$isConfigFromCache, (Config) this.L$0, this.$configDuration, this.$configRetryCount, null), 3, null);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$5, reason: invalid class name */
    /* synthetic */ class AnonymousClass5 extends kotlin.jvm.internal.a implements Function2<Config, kotlin.coroutines.d<? super Unit>, Object>, n {
        AnonymousClass5(Object obj) {
            super(2, obj, ConfigManager.class, "processConfig", "processConfig(Lcom/superwall/sdk/models/config/Config;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Config config, kotlin.coroutines.d<? super Unit> dVar) {
            return ConfigManager.fetchConfig$processConfig((ConfigManager) this.receiver, config, dVar);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$6, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$6", f = "ConfigManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass6 extends o implements Function2<Config, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$6$1, reason: invalid class name */
        @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$6$1", f = "ConfigManager.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConfigManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ConfigManager configManager, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = configManager;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass1(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    ConfigManager configManager = this.this$0;
                    this.label = 1;
                    if (configManager.checkForWebEntitlements(this) == objL) {
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
                return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        AnonymousClass6(kotlin.coroutines.d<? super AnonymousClass6> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ConfigManager.this.new AnonymousClass6(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Config config, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass6) create(config, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            k.f(ConfigManager.this.ioScope, null, null, new AnonymousClass1(ConfigManager.this, null), 3, null);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$7, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$7", f = "ConfigManager.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$fetchConfig$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,425:1\n1368#2:426\n1454#2,5:427\n*S KotlinDebug\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$fetchConfig$7\n*L\n239#1:426\n239#1:427,5\n*E\n"})
    static final class AnonymousClass7 extends o implements Function2<Config, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass7(kotlin.coroutines.d<? super AnonymousClass7> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass7 anonymousClass7 = ConfigManager.this.new AnonymousClass7(dVar);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Config config, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass7) create(config, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Config config = (Config) this.L$0;
                    if (ConfigManager.this.getOptions().getPaywalls().getShouldPreload()) {
                        List<Paywall> paywalls = config.getPaywalls();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = paywalls.iterator();
                        while (it.hasNext()) {
                            CollectionsKt.addAll(arrayList, ((Paywall) it.next()).getProductIds());
                        }
                        Set<String> set = CollectionsKt.toSet(arrayList);
                        StoreManager storeManager = ConfigManager.this.storeManager;
                        this.label = 1;
                        if (storeManager.products(set, this) == objL) {
                            return objL;
                        }
                    }
                    return Unit.f312394a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            } catch (Throwable th2) {
                Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Failed to preload products", null, th2, 8, null);
                Unit unit = Unit.f312394a;
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$8, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$8", f = "ConfigManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$fetchConfig$8\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,425:1\n230#2,5:426\n*S KotlinDebug\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$fetchConfig$8\n*L\n252#1:426,5\n*E\n"})
    static final class AnonymousClass8 extends o implements Function2<Config, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass8(kotlin.coroutines.d<? super AnonymousClass8> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass8 anonymousClass8 = ConfigManager.this.new AnonymousClass8(dVar);
            anonymousClass8.L$0 = obj;
            return anonymousClass8;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Config config, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass8) create(config, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Config config = (Config) this.L$0;
            k0<ConfigState> configState$superwall_release = ConfigManager.this.getConfigState$superwall_release();
            while (!configState$superwall_release.compareAndSet(configState$superwall_release.getValue(), new ConfigState.Retrieved(config))) {
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$9, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$9", f = "ConfigManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass9 extends o implements Function2<Config, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Either<Enrichment, Throwable> $enrichmentResult;
        final /* synthetic */ i1.a $isConfigFromCache;
        final /* synthetic */ i1.a $isEnrichmentFromCache;
        int label;
        final /* synthetic */ ConfigManager this$0;

        /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$9$1, reason: invalid class name */
        @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$9$1", f = "ConfigManager.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConfigManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ConfigManager configManager, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = configManager;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass1(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    ConfigManager configManager = this.this$0;
                    this.label = 1;
                    if (configManager.refreshConfiguration$superwall_release(this) == objL) {
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
                return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$fetchConfig$9$2, reason: invalid class name */
        @f(c = "com.superwall.sdk.config.ConfigManager$fetchConfig$9$2", f = "ConfigManager.kt", i = {}, l = {258}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConfigManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ConfigManager configManager, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = configManager;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass2(this.this$0, dVar);
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
                    if (deviceHelper.m65getEnrichment8Mi8wO0(6, jM0, this) == objL) {
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
                return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(i1.a aVar, ConfigManager configManager, i1.a aVar2, Either<Enrichment, Throwable> either, kotlin.coroutines.d<? super AnonymousClass9> dVar) {
            super(2, dVar);
            this.$isConfigFromCache = aVar;
            this.this$0 = configManager;
            this.$isEnrichmentFromCache = aVar2;
            this.$enrichmentResult = either;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass9(this.$isConfigFromCache, this.this$0, this.$isEnrichmentFromCache, this.$enrichmentResult, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Config config, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass9) create(config, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (this.$isConfigFromCache.f312744a) {
                k.f(this.this$0.ioScope, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            }
            if (this.$isEnrichmentFromCache.f312744a || this.$enrichmentResult.getThrowable() != null) {
                k.f(this.this$0.ioScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$getAssignments$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.config.ConfigManager", f = "ConfigManager.kt", i = {0, 1}, l = {292, 297, 298}, m = "getAssignments", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class C26311 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26311(kotlin.coroutines.d<? super C26311> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigManager.this.getAssignments(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$handleConfigUpdate$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.config.ConfigManager", f = "ConfigManager.kt", i = {0, 0, 0, 1}, l = {CropImageOptions.S3, 366}, m = "handleConfigUpdate", n = {"this", "fetchDuration", "retryCount", "this"}, s = {"L$0", "J$0", "I$0", "L$0"})
    static final class C26321 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26321(kotlin.coroutines.d<? super C26321> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigManager.this.handleConfigUpdate(null, 0L, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$handleConfigUpdate$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.config.ConfigManager$handleConfigUpdate$2", f = "ConfigManager.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    static final class C26332 extends o implements Function2<Config, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C26332(kotlin.coroutines.d<? super C26332> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C26332 c26332 = ConfigManager.this.new C26332(dVar);
            c26332.L$0 = obj;
            return c26332;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Config config, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26332) create(config, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Config config = (Config) this.L$0;
                ConfigManager.this.paywallManager.resetPaywallRequestCache$superwall_release();
                Config config2 = ConfigManager.this.getConfig();
                if (config2 != null) {
                    PaywallPreload paywallPreload = ConfigManager.this.paywallPreload;
                    this.label = 1;
                    if (paywallPreload.removeUnusedPaywallVCsFromCache$superwall_release(config2, config, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$handleConfigUpdate$3, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.config.ConfigManager$handleConfigUpdate$3", f = "ConfigManager.kt", i = {}, l = {369}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$handleConfigUpdate$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,425:1\n230#2,5:426\n*S KotlinDebug\n*F\n+ 1 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager$handleConfigUpdate$3\n*L\n368#1:426,5\n*E\n"})
    static final class C26343 extends o implements Function2<Config, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ long $fetchDuration;
        final /* synthetic */ int $retryCount;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26343(int i10, long j10, kotlin.coroutines.d<? super C26343> dVar) {
            super(2, dVar);
            this.$retryCount = i10;
            this.$fetchDuration = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C26343 c26343 = ConfigManager.this.new C26343(this.$retryCount, this.$fetchDuration, dVar);
            c26343.L$0 = obj;
            return c26343;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Config config, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26343) create(config, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Config config = (Config) this.L$0;
                ConfigManager.this.processConfig(config);
                k0<ConfigState> configState$superwall_release = ConfigManager.this.getConfigState$superwall_release();
                while (!configState$superwall_release.compareAndSet(configState$superwall_release.getValue(), new ConfigState.Retrieved(config))) {
                }
                Function2 function2 = ConfigManager.this.track;
                int i11 = 5 | 0;
                InternalSuperwallEvent.ConfigRefresh configRefresh = new InternalSuperwallEvent.ConfigRefresh(false, config.getBuildId(), this.$retryCount, this.$fetchDuration);
                this.label = 1;
                if (function2.invoke(configRefresh, this) == objL) {
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
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$preloadAllPaywalls$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.config.ConfigManager", f = "ConfigManager.kt", i = {0}, l = {346, 345}, m = "preloadAllPaywalls", n = {"this"}, s = {"L$0"})
    static final class C26351 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26351(kotlin.coroutines.d<? super C26351> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigManager.this.preloadAllPaywalls(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$preloadPaywallsByNames$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.config.ConfigManager", f = "ConfigManager.kt", i = {0}, l = {353, 352}, m = "preloadPaywallsByNames", n = {"eventNames"}, s = {"L$0"})
    static final class C26361 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26361(kotlin.coroutines.d<? super C26361> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigManager.this.preloadPaywallsByNames(null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$processConfig$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.config.ConfigManager$processConfig$2", f = "ConfigManager.kt", i = {}, l = {331}, m = "invokeSuspend", n = {}, s = {})
    static final class C26372 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C26372(kotlin.coroutines.d<? super C26372> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ConfigManager.this.new C26372(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                StoreManager storeManager = ConfigManager.this.storeManager;
                this.label = 1;
                if (storeManager.loadPurchasedProducts(this) == objL) {
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
            return ((C26372) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$reset$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.config.ConfigManager$reset$1", f = "ConfigManager.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
    static final class C26381 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C26381(kotlin.coroutines.d<? super C26381> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ConfigManager.this.new C26381(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                ConfigManager configManager = ConfigManager.this;
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
            return ((C26381) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConfigManager(@NotNull Context context, @NotNull StoreManager storeManager, @NotNull Entitlements entitlements, @NotNull Storage storage, @NotNull SuperwallAPI network, @NotNull DeviceHelper deviceHelper, @NotNull SuperwallOptions options, @NotNull PaywallManager paywallManager, @NotNull Function0<WebPaywallRedeemer> webPaywallRedeemer, @NotNull Factory factory, @NotNull Assignments assignments, @NotNull PaywallPreload paywallPreload, @NotNull IOScope ioScope, @NotNull Function2<? super InternalSuperwallEvent, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> track, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> awaitUtilNetwork) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storeManager, "storeManager");
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(deviceHelper, "deviceHelper");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(paywallManager, "paywallManager");
        Intrinsics.checkNotNullParameter(webPaywallRedeemer, "webPaywallRedeemer");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        Intrinsics.checkNotNullParameter(paywallPreload, "paywallPreload");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(awaitUtilNetwork, "awaitUtilNetwork");
        this.context = context;
        this.storeManager = storeManager;
        this.entitlements = entitlements;
        this.storage = storage;
        this.network = network;
        this.deviceHelper = deviceHelper;
        this.options = options;
        this.paywallManager = paywallManager;
        this.webPaywallRedeemer = webPaywallRedeemer;
        this.factory = factory;
        this.assignments = assignments;
        this.paywallPreload = paywallPreload;
        this.ioScope = ioScope;
        this.track = track;
        this.awaitUtilNetwork = awaitUtilNetwork;
        kotlin.time.c.a aVar = kotlin.time.c.f313406b;
        this.CACHE_LIMIT = kotlin.time.e.m0(1, kotlin.time.f.SECONDS);
        final k0<ConfigState> k0VarA = b1.a(ConfigState.None.INSTANCE);
        this.configState = k0VarA;
        this.hasConfig = kotlinx.coroutines.flow.k.W1(new i<Config>() { // from class: com.superwall.sdk.config.ConfigManager$special$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$special$$inlined$mapNotNull$1$2, reason: invalid class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConfigManager.kt\ncom/superwall/sdk/config/ConfigManager\n*L\n1#1,49:1\n57#2:50\n58#2:52\n98#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigManager$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @f(c = "com.superwall.sdk.config.ConfigManager$special$$inlined$mapNotNull$1$2", f = "ConfigManager.kt", i = {}, l = {52}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        ResultKt.m(obj2);
                        j jVar = this.$this_unsafeFlow;
                        Config config = ConfigStateKt.getConfig((ConfigState) obj);
                        if (config != null) {
                            anonymousClass1.label = 1;
                            if (jVar.emit(config, anonymousClass1) == objL) {
                                return objL;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj2);
                    }
                    return Unit.f312394a;
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Config> jVar, kotlin.coroutines.d dVar) {
                Object objCollect = k0VarA.collect(new AnonymousClass2(jVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }, 1);
        this._triggersByEventName = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0070 A[PHI: r0 r1 r2 r3 r4
      0x0070: PHI (r0v34 java.lang.Object) = (r0v33 java.lang.Object), (r0v2 java.lang.Object) binds: [B:51:0x028e, B:17:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r1v35 com.superwall.sdk.misc.Either) = (r1v32 com.superwall.sdk.misc.Either), (r1v40 com.superwall.sdk.misc.Either) binds: [B:51:0x028e, B:17:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r2v24 kotlin.jvm.internal.i1$a) = (r2v21 kotlin.jvm.internal.i1$a), (r2v30 kotlin.jvm.internal.i1$a) binds: [B:51:0x028e, B:17:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r3v28 kotlin.jvm.internal.i1$a) = (r3v25 kotlin.jvm.internal.i1$a), (r3v32 kotlin.jvm.internal.i1$a) binds: [B:51:0x028e, B:17:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r4v23 com.superwall.sdk.config.ConfigManager) = (r4v20 com.superwall.sdk.config.ConfigManager), (r4v27 com.superwall.sdk.config.ConfigManager) binds: [B:51:0x028e, B:17:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x0227  */
    /* JADX WARN: Code duplicated, block: B:44:0x0244 A[PHI: r0 r1 r2 r3 r4
      0x0244: PHI (r0v25 java.lang.Object) = (r0v24 java.lang.Object), (r0v2 java.lang.Object) binds: [B:42:0x0240, B:21:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r1v26 com.superwall.sdk.misc.Either) = (r1v23 com.superwall.sdk.misc.Either), (r1v28 com.superwall.sdk.misc.Either) binds: [B:42:0x0240, B:21:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r2v15 kotlin.jvm.internal.i1$a) = (r2v12 kotlin.jvm.internal.i1$a), (r2v17 kotlin.jvm.internal.i1$a) binds: [B:42:0x0240, B:21:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r3v19 kotlin.jvm.internal.i1$a) = (r3v16 kotlin.jvm.internal.i1$a), (r3v21 kotlin.jvm.internal.i1$a) binds: [B:42:0x0240, B:21:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r4v14 com.superwall.sdk.config.ConfigManager) = (r4v11 com.superwall.sdk.config.ConfigManager), (r4v16 com.superwall.sdk.config.ConfigManager) binds: [B:42:0x0240, B:21:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x025e A[PHI: r0 r1 r2 r3 r4
      0x025e: PHI (r0v28 java.lang.Object) = (r0v27 java.lang.Object), (r0v2 java.lang.Object) binds: [B:45:0x025a, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r1v29 com.superwall.sdk.misc.Either) = (r1v26 com.superwall.sdk.misc.Either), (r1v31 com.superwall.sdk.misc.Either) binds: [B:45:0x025a, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r2v18 kotlin.jvm.internal.i1$a) = (r2v15 kotlin.jvm.internal.i1$a), (r2v20 kotlin.jvm.internal.i1$a) binds: [B:45:0x025a, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r3v22 kotlin.jvm.internal.i1$a) = (r3v19 kotlin.jvm.internal.i1$a), (r3v24 kotlin.jvm.internal.i1$a) binds: [B:45:0x025a, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r4v17 com.superwall.sdk.config.ConfigManager) = (r4v14 com.superwall.sdk.config.ConfigManager), (r4v19 com.superwall.sdk.config.ConfigManager) binds: [B:45:0x025a, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0278 A[PHI: r0 r1 r2 r3 r4
      0x0278: PHI (r0v31 java.lang.Object) = (r0v30 java.lang.Object), (r0v2 java.lang.Object) binds: [B:48:0x0274, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r1v32 com.superwall.sdk.misc.Either) = (r1v29 com.superwall.sdk.misc.Either), (r1v34 com.superwall.sdk.misc.Either) binds: [B:48:0x0274, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r2v21 kotlin.jvm.internal.i1$a) = (r2v18 kotlin.jvm.internal.i1$a), (r2v23 kotlin.jvm.internal.i1$a) binds: [B:48:0x0274, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r3v25 kotlin.jvm.internal.i1$a) = (r3v22 kotlin.jvm.internal.i1$a), (r3v27 kotlin.jvm.internal.i1$a) binds: [B:48:0x0274, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r4v20 com.superwall.sdk.config.ConfigManager) = (r4v17 com.superwall.sdk.config.ConfigManager), (r4v22 com.superwall.sdk.config.ConfigManager) binds: [B:48:0x0274, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0314  */
    /* JADX WARN: Code duplicated, block: B:80:0x033b  */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:0: B:63:0x02e2->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0304, code lost:
    
        if (r2.refreshConfiguration$superwall_release(r7) == r8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0325, code lost:
    
        if (r0.invoke(r2, r7) == r8) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchConfig(kotlin.coroutines.d<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.config.ConfigManager.fetchConfig(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object fetchConfig$processConfig(ConfigManager configManager, Config config, kotlin.coroutines.d dVar) {
        configManager.processConfig(config);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAssignments$lambda$8$lambda$7(NetworkError it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = 6 >> 0;
        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.configManager, "Error retrieving assignments.", null, it, 8, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object handleConfigUpdate(Either<Config, ?> either, long j10, int i10, kotlin.coroutines.d<? super Unit> dVar) {
        C26321 c26321;
        ConfigManager configManager;
        int i11;
        ConfigManager configManager2;
        Either either2;
        if (dVar instanceof C26321) {
            c26321 = (C26321) dVar;
            int i12 = c26321.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c26321.label = i12 - Integer.MIN_VALUE;
            } else {
                c26321 = new C26321(dVar);
            }
        } else {
            c26321 = new C26321(dVar);
        }
        Object objThen = c26321.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = c26321.label;
        if (i13 == 0) {
            ResultKt.m(objThen);
            C26332 c26332 = new C26332(null);
            c26321.L$0 = this;
            c26321.J$0 = j10;
            c26321.I$0 = i10;
            c26321.label = 1;
            objThen = EitherKt.then(either, c26332, c26321);
            if (objThen != objL) {
                configManager = this;
                i11 = i10;
            }
            return objL;
        }
        if (i13 == 1) {
            i11 = c26321.I$0;
            j10 = c26321.J$0;
            configManager = (ConfigManager) c26321.L$0;
            ResultKt.m(objThen);
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            configManager2 = (ConfigManager) c26321.L$0;
            ResultKt.m(objThen);
        }
        either2 = (Either) objThen;
        if (either2 instanceof Either.Success) {
            k.f(configManager2.ioScope, null, null, new ConfigManager$handleConfigUpdate$4$1(configManager2, null), 3, null);
        } else {
            if (either2 instanceof Either.Failure) {
                throw new kotlin.k0();
            }
            Logger.INSTANCE.debug(LogLevel.warn, LogScope.superwallCore, "Failed to refresh configuration.", null, ((Either.Failure) either2).getError());
        }
        return Unit.f312394a;
        C26343 c26343 = configManager.new C26343(i11, j10, null);
        c26321.L$0 = configManager;
        c26321.label = 2;
        objThen = EitherKt.then((Either) objThen, c26343, c26321);
        if (objThen != objL) {
            configManager2 = configManager;
            either2 = (Either) objThen;
            if (either2 instanceof Either.Success) {
                k.f(configManager2.ioScope, null, null, new ConfigManager$handleConfigUpdate$4$1(configManager2, null), 3, null);
            } else {
                if (either2 instanceof Either.Failure) {
                    throw new kotlin.k0();
                }
                Logger.INSTANCE.debug(LogLevel.warn, LogScope.superwallCore, "Failed to refresh configuration.", null, ((Either.Failure) either2).getError());
            }
            return Unit.f312394a;
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object preloadPaywalls(kotlin.coroutines.d<? super Unit> dVar) {
        Object objPreloadAllPaywalls;
        return (this.options.getPaywalls().getShouldPreload() && (objPreloadAllPaywalls = preloadAllPaywalls(dVar)) == kotlin.coroutines.intrinsics.b.l()) ? objPreloadAllPaywalls : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processConfig(Config config) {
        this.storage.write(DisableVerboseEvents.INSTANCE, Boolean.valueOf(config.getFeatureFlags().getDisableVerboseEvents()));
        if (config.getFeatureFlags().getEnableConfigRefresh()) {
            this.storage.write(LatestConfig.INSTANCE, config);
        }
        ConfigLogic configLogic = ConfigLogic.INSTANCE;
        setTriggersByEventName(configLogic.getTriggersByEventName(config.getTriggers()));
        this.assignments.choosePaywallVariants(config.getTriggers());
        this.entitlements.addEntitlementsByProductId$superwall_release(configLogic.extractEntitlementsByProductId(config.getProducts()));
        k.f(this.ioScope, null, null, new C26372(null), 3, null);
    }

    @Nullable
    public final Object checkForWebEntitlements(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        FeatureFlags featureFlags;
        Config config = getConfig();
        if (config != null && (featureFlags = config.getFeatureFlags()) != null && featureFlags.getWeb2App()) {
            k.f(this.ioScope, null, null, new AnonymousClass2(null), 3, null);
        }
        return Unit.f312394a;
    }

    @Nullable
    public final Object fetchConfiguration(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objFetchConfig;
        return (Intrinsics.areEqual(this.configState.getValue(), ConfigState.Retrieving.INSTANCE) || (objFetchConfig = fetchConfig(dVar)) != kotlin.coroutines.intrinsics.b.l()) ? Unit.f312394a : objFetchConfig;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if (r10 == r1) goto L40;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAssignments(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.config.ConfigManager.getAssignments(kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Config getConfig() {
        ConfigState value = this.configState.getValue();
        if (value instanceof ConfigState.Failed) {
            k.f(this.ioScope, null, null, new ConfigManager$config$1$1(this, null), 3, null);
        }
        return ConfigStateKt.getConfig(value);
    }

    @NotNull
    public final k0<ConfigState> getConfigState$superwall_release() {
        return this.configState;
    }

    @NotNull
    public final i<Config> getHasConfig() {
        return this.hasConfig;
    }

    @NotNull
    public final SuperwallOptions getOptions() {
        return this.options;
    }

    @NotNull
    public final Map<String, Trigger> getTriggersByEventName() {
        return this._triggersByEventName;
    }

    @NotNull
    public final Map<String, Experiment.Variant> getUnconfirmedAssignments() {
        return this.assignments.getUnconfirmedAssignments();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r7.preloadAllPaywalls((com.superwall.sdk.models.config.Config) r8, r2, r0) == r1) goto L23;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preloadAllPaywalls(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.superwall.sdk.config.ConfigManager.C26351
            if (r0 == 0) goto L16
            r0 = r8
            r6 = 4
            com.superwall.sdk.config.ConfigManager$preloadAllPaywalls$1 r0 = (com.superwall.sdk.config.ConfigManager.C26351) r0
            int r1 = r0.label
            r6 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            r6 = 0
            int r1 = r1 - r2
            r0.label = r1
            goto L1c
        L16:
            r6 = 5
            com.superwall.sdk.config.ConfigManager$preloadAllPaywalls$1 r0 = new com.superwall.sdk.config.ConfigManager$preloadAllPaywalls$1
            r0.<init>(r8)
        L1c:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            r6 = 7
            if (r2 != r3) goto L31
            kotlin.ResultKt.m(r8)
            goto L7a
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            r6 = 2
            java.lang.Object r7 = r0.L$1
            com.superwall.sdk.config.PaywallPreload r7 = (com.superwall.sdk.config.PaywallPreload) r7
            java.lang.Object r2 = r0.L$0
            r6 = 7
            com.superwall.sdk.config.ConfigManager r2 = (com.superwall.sdk.config.ConfigManager) r2
            kotlin.ResultKt.m(r8)
            goto L64
        L47:
            kotlin.ResultKt.m(r8)
            com.superwall.sdk.config.PaywallPreload r8 = r7.paywallPreload
            r6 = 2
            kotlinx.coroutines.flow.k0<com.superwall.sdk.config.models.ConfigState> r2 = r7.configState
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            r6 = 2
            java.lang.Object r2 = com.superwall.sdk.misc.Config_AwaitFirstValidConfigKt.awaitFirstValidConfig(r2, r0)
            r6 = 4
            if (r2 != r1) goto L5f
            r6 = 2
            goto L79
        L5f:
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
            r8 = r5
        L64:
            r6 = 2
            com.superwall.sdk.models.config.Config r8 = (com.superwall.sdk.models.config.Config) r8
            r6 = 3
            android.content.Context r2 = r2.context
            r4 = 0
            r6 = 5
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r7 = r7.preloadAllPaywalls(r8, r2, r0)
            r6 = 0
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            r6 = 5
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.config.ConfigManager.preloadAllPaywalls(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r7.preloadPaywallsByNames((com.superwall.sdk.models.config.Config) r9, r8, r0) == r1) goto L23;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preloadPaywallsByNames(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.superwall.sdk.config.ConfigManager.C26361
            r6 = 3
            if (r0 == 0) goto L17
            r0 = r9
            r6 = 4
            com.superwall.sdk.config.ConfigManager$preloadPaywallsByNames$1 r0 = (com.superwall.sdk.config.ConfigManager.C26361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            r3 = r1 & r2
            r6 = 3
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.label = r1
            goto L1d
        L17:
            com.superwall.sdk.config.ConfigManager$preloadPaywallsByNames$1 r0 = new com.superwall.sdk.config.ConfigManager$preloadPaywallsByNames$1
            r6 = 1
            r0.<init>(r9)
        L1d:
            java.lang.Object r9 = r0.result
            r6 = 6
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r6 = r4
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3d
            r6 = 2
            if (r2 != r3) goto L34
            kotlin.ResultKt.m(r9)
            goto L7a
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = 5
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            r6 = 4
            java.lang.Object r7 = r0.L$1
            r6 = 6
            com.superwall.sdk.config.PaywallPreload r7 = (com.superwall.sdk.config.PaywallPreload) r7
            java.lang.Object r8 = r0.L$0
            r6 = 0
            java.util.Set r8 = (java.util.Set) r8
            kotlin.ResultKt.m(r9)
            goto L67
        L4c:
            r6 = 0
            kotlin.ResultKt.m(r9)
            com.superwall.sdk.config.PaywallPreload r9 = r7.paywallPreload
            kotlinx.coroutines.flow.k0<com.superwall.sdk.config.models.ConfigState> r7 = r7.configState
            r6 = 1
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r7 = com.superwall.sdk.misc.Config_AwaitFirstValidConfigKt.awaitFirstValidConfig(r7, r0)
            r6 = 1
            if (r7 != r1) goto L64
            r6 = 1
            goto L78
        L64:
            r5 = r9
            r9 = r7
            r7 = r5
        L67:
            com.superwall.sdk.models.config.Config r9 = (com.superwall.sdk.models.config.Config) r9
            r2 = 0
            r6 = 6
            r0.L$0 = r2
            r6 = 5
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.preloadPaywallsByNames(r9, r8, r0)
            if (r7 != r1) goto L7a
        L78:
            r6 = 6
            return r1
        L7a:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.config.ConfigManager.preloadPaywallsByNames(java.util.Set, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        if (r1.handleConfigUpdate((com.superwall.sdk.misc.Either) r15, r9, r5, r6) == r0) goto L31;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshConfiguration$superwall_release(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.superwall.sdk.config.ConfigManager$refreshConfiguration$1
            if (r0 == 0) goto L14
            r0 = r15
            com.superwall.sdk.config.ConfigManager$refreshConfiguration$1 r0 = (com.superwall.sdk.config.ConfigManager$refreshConfiguration$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.superwall.sdk.config.ConfigManager$refreshConfiguration$1 r0 = new com.superwall.sdk.config.ConfigManager$refreshConfiguration$1
            r0.<init>(r14, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L46
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            kotlin.ResultKt.m(r15)
            goto Lad
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            long r7 = r6.J$0
            java.lang.Object r14 = r6.L$1
            java.util.concurrent.atomic.AtomicInteger r14 = (java.util.concurrent.atomic.AtomicInteger) r14
            java.lang.Object r1 = r6.L$0
            com.superwall.sdk.config.ConfigManager r1 = (com.superwall.sdk.config.ConfigManager) r1
            kotlin.ResultKt.m(r15)
            goto L92
        L46:
            kotlin.ResultKt.m(r15)
            com.superwall.sdk.models.config.Config r15 = r14.getConfig()
            if (r15 != 0) goto L52
            kotlin.Unit r14 = kotlin.Unit.f312394a
            return r14
        L52:
            com.superwall.sdk.models.config.FeatureFlags r15 = r15.getFeatureFlags()
            boolean r15 = r15.getEnableConfigRefresh()
            if (r15 != 0) goto L5f
            kotlin.Unit r14 = kotlin.Unit.f312394a
            return r14
        L5f:
            com.superwall.sdk.misc.IOScope r7 = r14.ioScope
            com.superwall.sdk.config.ConfigManager$refreshConfiguration$2 r10 = new com.superwall.sdk.config.ConfigManager$refreshConfiguration$2
            r10.<init>(r14, r4)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.i.e(r7, r8, r9, r10, r11, r12)
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r15.<init>(r1)
            long r7 = java.lang.System.currentTimeMillis()
            com.superwall.sdk.network.SuperwallAPI r1 = r14.network
            com.superwall.sdk.config.ConfigManager$refreshConfiguration$3 r5 = new com.superwall.sdk.config.ConfigManager$refreshConfiguration$3
            r5.<init>(r15, r14, r4)
            r6.L$0 = r14
            r6.L$1 = r15
            r6.J$0 = r7
            r6.label = r3
            java.lang.Object r1 = r1.getConfig(r5, r6)
            if (r1 != r0) goto L8d
            goto Lac
        L8d:
            r13 = r1
            r1 = r14
            r14 = r15
            r15 = r13
            r15 = r13
        L92:
            com.superwall.sdk.misc.Either r15 = (com.superwall.sdk.misc.Either) r15
            int r5 = r14.get()
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r7
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r2
            r2 = r15
            r2 = r15
            r3 = r9
            java.lang.Object r14 = r1.handleConfigUpdate(r2, r3, r5, r6)
            if (r14 != r0) goto Lad
        Lac:
            return r0
        Lad:
            kotlin.Unit r14 = kotlin.Unit.f312394a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.config.ConfigManager.refreshConfiguration$superwall_release(kotlin.coroutines.d):java.lang.Object");
    }

    public final void reset() {
        Config config = ConfigStateKt.getConfig(this.configState.getValue());
        if (config == null) {
            return;
        }
        this.assignments.reset();
        this.assignments.choosePaywallVariants(config.getTriggers());
        k.f(this.ioScope, null, null, new C26381(null), 3, null);
    }

    public final void setOptions(@NotNull SuperwallOptions superwallOptions) {
        Intrinsics.checkNotNullParameter(superwallOptions, "<set-?>");
        this.options = superwallOptions;
    }

    public final void setTriggersByEventName(@NotNull Map<String, Trigger> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._triggersByEventName = MapsKt.toMutableMap(value);
    }

    public /* synthetic */ ConfigManager(Context context, StoreManager storeManager, Entitlements entitlements, Storage storage, SuperwallAPI superwallAPI, DeviceHelper deviceHelper, SuperwallOptions superwallOptions, PaywallManager paywallManager, Function0 function0, Factory factory, Assignments assignments, PaywallPreload paywallPreload, IOScope iOScope, Function2 function2, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Context context2;
        Function1 anonymousClass1;
        if ((i10 & 16384) != 0) {
            context2 = context;
            anonymousClass1 = new AnonymousClass1(context2, null);
        } else {
            context2 = context;
            anonymousClass1 = function1;
        }
        this(context2, storeManager, entitlements, storage, superwallAPI, deviceHelper, superwallOptions, paywallManager, function0, factory, assignments, paywallPreload, iOScope, function2, anonymousClass1);
    }
}
