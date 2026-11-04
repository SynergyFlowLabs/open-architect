package com.superwall.sdk.identity;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.config.ConfigManager;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.misc.ScopesKt;
import com.superwall.sdk.network.device.DeviceHelper;
import com.superwall.sdk.storage.AliasId;
import com.superwall.sdk.storage.AppUserId;
import com.superwall.sdk.storage.DidTrackFirstSeen;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.storage.Seed;
import com.superwall.sdk.storage.UserAttributes;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIdentityManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityManager.kt\ncom/superwall/sdk/identity/IdentityManager\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n17#2:304\n19#2:308\n46#3:305\n51#3:307\n105#4:306\n136#5,2:309\n138#5,8:312\n136#5,10:320\n1#6:311\n*S KotlinDebug\n*F\n+ 1 IdentityManager.kt\ncom/superwall/sdk/identity/IdentityManager\n*L\n93#1:304\n93#1:308\n93#1:305\n93#1:307\n93#1:306\n218#1:309,2\n218#1:312,8\n280#1:320,10\n*E\n"})
public final class IdentityManager {

    @NotNull
    private String _aliasId;

    @Nullable
    private String _appUserId;
    private int _seed;

    @NotNull
    private Map<String, ? extends Object> _userAttributes;

    @NotNull
    private final ConfigManager configManager;

    @NotNull
    private final DeviceHelper deviceHelper;

    @NotNull
    private final k0<Boolean> identityFlow;

    @NotNull
    private final CopyOnWriteArrayList<p2> identityJobs;

    @NotNull
    private final IOScope ioScope;

    @NotNull
    private final z1 queue;

    @NotNull
    private final s0 scope;

    @NotNull
    private final LocalStorage storage;

    @NotNull
    private final Function1<String, String> stringToSha;

    /* JADX INFO: renamed from: com.superwall.sdk.identity.IdentityManager$configure$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.identity.IdentityManager$configure$1", f = "IdentityManager.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return IdentityManager.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                boolean neverCalledStaticConfig = IdentityManager.this.storage.getNeverCalledStaticConfig();
                Boolean bool = (Boolean) IdentityManager.this.storage.read(DidTrackFirstSeen.INSTANCE);
                if (IdentityLogic.INSTANCE.shouldGetAssignments(IdentityManager.this.isLoggedIn(), neverCalledStaticConfig, !(bool != null ? bool.booleanValue() : false))) {
                    ConfigManager configManager = IdentityManager.this.configManager;
                    this.label = 1;
                    if (configManager.getAssignments(this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            IdentityManager.this.didSetIdentity();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.identity.IdentityManager$didSetIdentity$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.identity.IdentityManager$didSetIdentity$1", f = "IdentityManager.kt", i = {}, l = {209, 210}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nIdentityManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityManager.kt\ncom/superwall/sdk/identity/IdentityManager$didSetIdentity$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,303:1\n1863#2,2:304\n*S KotlinDebug\n*F\n+ 1 IdentityManager.kt\ncom/superwall/sdk/identity/IdentityManager$didSetIdentity$1\n*L\n209#1:304,2\n*E\n"})
    static final class C26561 extends o implements Function2<s0, d<? super Unit>, Object> {
        Object L$0;
        int label;

        C26561(d<? super C26561> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return IdentityManager.this.new C26561(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 7
                int r1 = r5.label
                r2 = 2
                r3 = 1
                r4 = r3
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1e
                r4 = 3
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r6)
                goto L6c
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 3
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1e:
                r4 = 0
                java.lang.Object r1 = r5.L$0
                java.util.Iterator r1 = (java.util.Iterator) r1
                r4 = 2
                kotlin.ResultKt.m(r6)
                goto L37
            L28:
                kotlin.ResultKt.m(r6)
                com.superwall.sdk.identity.IdentityManager r6 = com.superwall.sdk.identity.IdentityManager.this
                r4 = 7
                java.util.concurrent.CopyOnWriteArrayList r6 = com.superwall.sdk.identity.IdentityManager.access$getIdentityJobs$p(r6)
                java.util.Iterator r6 = r6.iterator()
                r1 = r6
            L37:
                boolean r6 = r1.hasNext()
                r4 = 0
                if (r6 == 0) goto L52
                r4 = 0
                java.lang.Object r6 = r1.next()
                kotlinx.coroutines.p2 r6 = (kotlinx.coroutines.p2) r6
                r5.L$0 = r1
                r4 = 0
                r5.label = r3
                java.lang.Object r6 = r6.d1(r5)
                r4 = 3
                if (r6 != r0) goto L37
                goto L6b
            L52:
                r4 = 5
                com.superwall.sdk.identity.IdentityManager r6 = com.superwall.sdk.identity.IdentityManager.this
                r4 = 4
                kotlinx.coroutines.flow.k0 r6 = com.superwall.sdk.identity.IdentityManager.access$getIdentityFlow$p(r6)
                r4 = 4
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r3)
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r5 = r6.emit(r1, r5)
                r4 = 2
                if (r5 != r0) goto L6c
            L6b:
                return r0
            L6c:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.identity.IdentityManager.C26561.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26561) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.identity.IdentityManager$identify$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.identity.IdentityManager$identify$1", f = "IdentityManager.kt", i = {0}, l = {androidx.media2.widget.f.i.f59801t0, 188}, m = "invokeSuspend", n = {"sanitizedUserId"}, s = {"L$2"})
    @SourceDebugExtension({"SMAP\nIdentityManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityManager.kt\ncom/superwall/sdk/identity/IdentityManager$identify$1\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,303:1\n136#2,10:304\n*S KotlinDebug\n*F\n+ 1 IdentityManager.kt\ncom/superwall/sdk/identity/IdentityManager$identify$1\n*L\n145#1:304,10\n*E\n"})
    static final class C26571 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ IdentityOptions $options;
        final /* synthetic */ String $userId;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ IdentityManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26571(String str, IdentityManager identityManager, IdentityOptions identityOptions, d<? super C26571> dVar) {
            super(2, dVar);
            this.$userId = str;
            this.this$0 = identityManager;
            this.$options = identityOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26571(this.$userId, this.this$0, this.$options, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0113 A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:8:0x001c, B:38:0x00ef, B:40:0x00f5, B:45:0x0144, B:41:0x0113, B:13:0x003a, B:27:0x0087, B:29:0x008e, B:31:0x0094, B:32:0x009e, B:16:0x004e, B:18:0x0057, B:21:0x0065, B:24:0x006d, B:42:0x012a, B:44:0x0131), top: B:56:0x000b }] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            IdentityManager identityManager;
            IdentityOptions identityOptions;
            String strSanitize;
            IdentityManager identityManager2;
            IdentityOptions identityOptions2;
            Object objL = b.l();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        String str = (String) this.L$2;
                        identityOptions = (IdentityOptions) this.L$1;
                        IdentityManager identityManager3 = (IdentityManager) this.L$0;
                        ResultKt.m(obj);
                        strSanitize = str;
                        identityManager = identityManager3;
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        identityOptions2 = (IdentityOptions) this.L$1;
                        identityManager2 = (IdentityManager) this.L$0;
                        ResultKt.m(obj);
                    }
                    if (identityOptions2 == null && identityOptions2.getRestorePaywallAssignments()) {
                        identityManager2.identityJobs.add(k.f(identityManager2.ioScope, null, null, new IdentityManager$identify$1$1$1$3(identityManager2, null), 3, null));
                    } else {
                        k.f(identityManager2.ioScope, null, null, new IdentityManager$identify$1$1$1$4(identityManager2, null), 3, null);
                        identityManager2.didSetIdentity();
                    }
                    new Either.Success(Unit.f312394a);
                    return Unit.f312394a;
                }
                ResultKt.m(obj);
                String str2 = this.$userId;
                identityManager = this.this$0;
                identityOptions = this.$options;
                strSanitize = IdentityLogic.INSTANCE.sanitize(str2);
                if (strSanitize != null) {
                    if (!Intrinsics.areEqual(identityManager._appUserId, strSanitize) && !Intrinsics.areEqual(strSanitize, "")) {
                        k0 k0Var = identityManager.identityFlow;
                        Boolean boolA = kotlin.coroutines.jvm.internal.b.a(false);
                        this.L$0 = identityManager;
                        this.L$1 = identityOptions;
                        this.L$2 = strSanitize;
                        this.label = 1;
                        if (k0Var.emit(boolA, this) == objL) {
                        }
                        return objL;
                    }
                    if (Intrinsics.areEqual(strSanitize, "")) {
                        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.identityManager, "The provided userId was empty.", null, null, 24, null);
                    }
                }
                new Either.Success(Unit.f312394a);
                return Unit.f312394a;
                String str3 = identityManager._appUserId;
                if (str3 != null && !Intrinsics.areEqual(strSanitize, str3)) {
                    Superwall.Companion.getInstance().reset$superwall_release(true);
                }
                identityManager._appUserId = strSanitize;
                identityManager.identityJobs.add(k.f(identityManager.ioScope, null, null, new IdentityManager$identify$1$1$1$1(identityManager, strSanitize, null), 3, null));
                identityManager.saveIds();
                k.f(identityManager.ioScope, null, null, new IdentityManager$identify$1$1$1$2(null), 3, null);
                ConfigManager configManager = identityManager.configManager;
                this.L$0 = identityManager;
                this.L$1 = identityOptions;
                this.L$2 = null;
                this.label = 2;
                if (configManager.checkForWebEntitlements(this) != objL) {
                    identityManager2 = identityManager;
                    identityOptions2 = identityOptions;
                    if (identityOptions2 == null) {
                        k.f(identityManager2.ioScope, null, null, new IdentityManager$identify$1$1$1$4(identityManager2, null), 3, null);
                        identityManager2.didSetIdentity();
                    } else {
                        k.f(identityManager2.ioScope, null, null, new IdentityManager$identify$1$1$1$4(identityManager2, null), 3, null);
                        identityManager2.didSetIdentity();
                    }
                    new Either.Success(Unit.f312394a);
                    return Unit.f312394a;
                }
                return objL;
            } catch (Throwable th2) {
                if (ErrorTrackingKt.shouldLog(th2)) {
                    Superwall.Companion companion = Superwall.Companion;
                    if (companion.getInitialized()) {
                        ErrorTrackingKt.trackError(companion.getInstance(), th2);
                    }
                }
                new Either.Failure(th2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26571) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.identity.IdentityManager$mergeUserAttributes$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.identity.IdentityManager$mergeUserAttributes$1", f = "IdentityManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C26581 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $newUserAttributes;
        final /* synthetic */ boolean $shouldTrackMerge;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26581(Map<String, ? extends Object> map, boolean z10, d<? super C26581> dVar) {
            super(2, dVar);
            this.$newUserAttributes = map;
            this.$shouldTrackMerge = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return IdentityManager.this.new C26581(this.$newUserAttributes, this.$shouldTrackMerge, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            IdentityManager.this._mergeUserAttributes(this.$newUserAttributes, this.$shouldTrackMerge);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26581) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.identity.IdentityManager$reset$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.identity.IdentityManager$reset$1", f = "IdentityManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.M1}, m = "invokeSuspend", n = {}, s = {})
    static final class C26591 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C26591(d<? super C26591> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return IdentityManager.this.new C26591(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var = IdentityManager.this.identityFlow;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(false);
                this.label = 1;
                if (k0Var.emit(boolA, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26591) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdentityManager(@NotNull DeviceHelper deviceHelper, @NotNull LocalStorage storage, @NotNull ConfigManager configManager, @NotNull IOScope ioScope, @NotNull Function1<? super String, String> stringToSha) {
        Intrinsics.checkNotNullParameter(deviceHelper, "deviceHelper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(stringToSha, "stringToSha");
        this.deviceHelper = deviceHelper;
        this.storage = storage;
        this.configManager = configManager;
        this.ioScope = ioScope;
        this.stringToSha = stringToSha;
        this._appUserId = (String) storage.read(AppUserId.INSTANCE);
        AliasId aliasId = AliasId.INSTANCE;
        String str = (String) storage.read(aliasId);
        this._aliasId = str == null ? IdentityLogic.INSTANCE.generateAlias() : str;
        Seed seed = Seed.INSTANCE;
        Integer num = (Integer) storage.read(seed);
        this._seed = num != null ? num.intValue() : IdentityLogic.INSTANCE.generateSeed();
        Map<String, ? extends Object> map = (Map) storage.read(UserAttributes.INSTANCE);
        this._userAttributes = map == null ? MapsKt.emptyMap() : map;
        this.identityFlow = b1.a(Boolean.FALSE);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        z1 z1VarD = b2.d(executorServiceNewSingleThreadExecutor);
        this.queue = z1VarD;
        this.scope = t0.a(z1VarD);
        this.identityJobs = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (((String) storage.read(aliasId)) == null) {
            storage.write(aliasId, this._aliasId);
            linkedHashMap.put("aliasId", this._aliasId);
        }
        if (((Integer) storage.read(seed)) == null) {
            storage.write(seed, Integer.valueOf(this._seed));
            linkedHashMap.put("seed", Integer.valueOf(this._seed));
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        mergeUserAttributes(linkedHashMap, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void _mergeUserAttributes(Map<String, ? extends Object> map, boolean z10) {
        try {
            Map<String, ? extends Object> mapMergeAttributes = IdentityLogic.INSTANCE.mergeAttributes(map, this._userAttributes, this.deviceHelper.getAppInstalledAtString());
            if (z10) {
                k.f(this.ioScope, null, null, new IdentityManager$_mergeUserAttributes$1$1(this, mapMergeAttributes, null), 3, null);
            }
            this.storage.write(UserAttributes.INSTANCE, mapMergeAttributes);
            this._userAttributes = mapMergeAttributes;
            new Either.Success(Unit.f312394a);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            new Either.Failure(th2);
        }
    }

    static /* synthetic */ void _mergeUserAttributes$default(IdentityManager identityManager, Map map, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        identityManager._mergeUserAttributes(map, z10);
    }

    private final void _reset() {
        this._appUserId = null;
        IdentityLogic identityLogic = IdentityLogic.INSTANCE;
        this._aliasId = identityLogic.generateAlias();
        this._seed = identityLogic.generateSeed();
        this._userAttributes = MapsKt.emptyMap();
        saveIds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void didSetIdentity() {
        k.f(this.scope, null, null, new C26561(null), 3, null);
    }

    public static /* synthetic */ void identify$default(IdentityManager identityManager, String str, IdentityOptions identityOptions, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            identityOptions = null;
        }
        identityManager.identify(str, identityOptions);
    }

    public static /* synthetic */ void mergeUserAttributes$default(IdentityManager identityManager, Map map, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        identityManager.mergeUserAttributes(map, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveIds() {
        try {
            String str = this._appUserId;
            if (str != null) {
                this.storage.write(AppUserId.INSTANCE, str);
            } else {
                this.storage.delete(AppUserId.INSTANCE);
            }
            this.storage.write(AliasId.INSTANCE, this._aliasId);
            this.storage.write(Seed.INSTANCE, Integer.valueOf(this._seed));
            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("aliasId", this._aliasId), TuplesKt.to("seed", Integer.valueOf(this._seed)));
            String str2 = this._appUserId;
            if (str2 != null) {
                mapMutableMapOf.put("appUserId", str2);
            }
            _mergeUserAttributes$default(this, mapMutableMapOf, false, 2, null);
            new Either.Success(Unit.f312394a);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            new Either.Failure(th2);
        }
    }

    public final void configure() {
        ScopesKt.launchWithTracking(this.ioScope, new AnonymousClass1(null));
    }

    @NotNull
    public final String getAliasId() {
        return (String) i.f(this.queue, new IdentityManager$aliasId$1(this, null));
    }

    @Nullable
    public final String getAppUserId() {
        return (String) i.f(this.queue, new IdentityManager$appUserId$1(this, null));
    }

    @NotNull
    public final String getExternalAccountId() {
        return this.configManager.getOptions().getPassIdentifiersToPlayStore() ? getUserId() : this.stringToSha.invoke(getUserId());
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Boolean> getHasIdentity() {
        final z0 z0VarN = kotlinx.coroutines.flow.k.n(this.identityFlow);
        return new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.superwall.sdk.identity.IdentityManager$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.superwall.sdk.identity.IdentityManager$special$$inlined$filter$1$2, reason: invalid class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IdentityManager.kt\ncom/superwall/sdk/identity/IdentityManager\n*L\n1#1,49:1\n18#2:50\n19#2:52\n93#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.superwall.sdk.identity.IdentityManager$special$$inlined$filter$1$2$1, reason: invalid class name */
                @f(c = "com.superwall.sdk.identity.IdentityManager$special$$inlined$filter$1$2", f = "IdentityManager.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
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

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(Object obj, d dVar) {
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
                    Object objL = b.l();
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        ResultKt.m(obj2);
                        j jVar = this.$this_unsafeFlow;
                        if (((Boolean) obj).booleanValue()) {
                            anonymousClass1.label = 1;
                            if (jVar.emit(obj, anonymousClass1) == objL) {
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
            public Object collect(j<? super Boolean> jVar, d dVar) {
                Object objCollect = z0VarN.collect(new AnonymousClass2(jVar), dVar);
                return objCollect == b.l() ? objCollect : Unit.f312394a;
            }
        };
    }

    public final int getSeed() {
        return ((Number) i.f(this.queue, new IdentityManager$seed$1(this, null))).intValue();
    }

    @NotNull
    public final Map<String, Object> getUserAttributes() {
        return (Map) i.f(this.queue, new IdentityManager$userAttributes$1(this, null));
    }

    @NotNull
    public final String getUserId() {
        return (String) i.f(this.queue, new IdentityManager$userId$1(this, null));
    }

    public final void identify(@NotNull String userId, @Nullable IdentityOptions identityOptions) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        k.f(this.scope, null, null, new C26571(userId, this, identityOptions, null), 3, null);
    }

    public final boolean isLoggedIn() {
        return this._appUserId != null;
    }

    public final void mergeUserAttributes(@NotNull Map<String, ? extends Object> newUserAttributes, boolean z10) {
        Intrinsics.checkNotNullParameter(newUserAttributes, "newUserAttributes");
        k.f(this.scope, null, null, new C26581(newUserAttributes, z10, null), 3, null);
    }

    public final void reset(boolean z10) {
        k.f(this.ioScope, null, null, new C26591(null), 3, null);
        if (z10) {
            _reset();
        } else {
            _reset();
            didSetIdentity();
        }
    }

    public /* synthetic */ IdentityManager(DeviceHelper deviceHelper, LocalStorage localStorage, ConfigManager configManager, IOScope iOScope, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceHelper, localStorage, configManager, iOScope, (i10 & 16) != 0 ? new Function1() { // from class: com.superwall.sdk.identity.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IdentityManager._init_$lambda$0((String) obj);
            }
        } : function1);
    }
}
