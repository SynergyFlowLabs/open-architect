package com.superwall.sdk.analytics.session;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.o0;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.config.ConfigManager;
import com.superwall.sdk.config.models.ConfigState;
import com.superwall.sdk.config.models.ConfigStateKt;
import com.superwall.sdk.dependencies.DeviceHelperFactory;
import com.superwall.sdk.dependencies.UserAttributesEventFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAppSessionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSessionManager.kt\ncom/superwall/sdk/analytics/session/AppSessionManager\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,151:1\n136#2,10:152\n136#2,10:162\n*S KotlinDebug\n*F\n+ 1 AppSessionManager.kt\ncom/superwall/sdk/analytics/session/AppSessionManager\n*L\n92#1:152,10\n102#1:162,10\n*E\n"})
public final class AppSessionManager implements DefaultLifecycleObserver {

    @NotNull
    private AppSession appSession;

    @Nullable
    private Long appSessionTimeout;

    @NotNull
    private final IOScope backgroundScope;

    @NotNull
    private final ConfigManager configManager;

    @NotNull
    private final Factory delegate;
    private boolean didTrackAppLaunch;

    @Nullable
    private Date lastAppClose;

    @NotNull
    private final LocalStorage storage;

    public interface Factory extends AppManagerDelegate, DeviceHelperFactory, UserAttributesEventFactory {
    }

    /* JADX INFO: renamed from: com.superwall.sdk.analytics.session.AppSessionManager$listenForAppSessionTimeout$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.analytics.session.AppSessionManager$listenForAppSessionTimeout$1", f = "AppSessionManager.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAppSessionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSessionManager.kt\ncom/superwall/sdk/analytics/session/AppSessionManager$listenForAppSessionTimeout$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,151:1\n56#2:152\n59#2:156\n46#3:153\n51#3:155\n105#4:154\n*S KotlinDebug\n*F\n+ 1 AppSessionManager.kt\ncom/superwall/sdk/analytics/session/AppSessionManager$listenForAppSessionTimeout$1\n*L\n79#1:152\n79#1:156\n79#1:153\n79#1:155\n79#1:154\n*E\n"})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return AppSessionManager.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final k0<ConfigState> configState$superwall_release = AppSessionManager.this.configManager.getConfigState$superwall_release();
                i<Config> iVar = new i<Config>() { // from class: com.superwall.sdk.analytics.session.AppSessionManager$listenForAppSessionTimeout$1$invokeSuspend$$inlined$mapNotNull$1

                    /* JADX INFO: renamed from: com.superwall.sdk.analytics.session.AppSessionManager$listenForAppSessionTimeout$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AppSessionManager.kt\ncom/superwall/sdk/analytics/session/AppSessionManager$listenForAppSessionTimeout$1\n*L\n1#1,49:1\n57#2:50\n58#2:52\n79#3:51\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.superwall.sdk.analytics.session.AppSessionManager$listenForAppSessionTimeout$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        @f(c = "com.superwall.sdk.analytics.session.AppSessionManager$listenForAppSessionTimeout$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "AppSessionManager.kt", i = {}, l = {52}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
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

                        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
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
                    public Object collect(j<? super Config> jVar, d dVar) {
                        Object objCollect = configState$superwall_release.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final AppSessionManager appSessionManager = AppSessionManager.this;
                j<? super Config> jVar = new j() { // from class: com.superwall.sdk.analytics.session.AppSessionManager.listenForAppSessionTimeout.1.2
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Config) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Config config, d<? super Unit> dVar) {
                        appSessionManager.setAppSessionTimeout(kotlin.coroutines.jvm.internal.b.g(config.getAppSessionTimeout()));
                        if (!appSessionManager.didTrackAppLaunch) {
                            appSessionManager.sessionCouldRefresh();
                        }
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVar.collect(jVar, this) == objL) {
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
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.analytics.session.AppSessionManager$onStart$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.analytics.session.AppSessionManager$onStart$1", f = "AppSessionManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160707m}, m = "invokeSuspend", n = {}, s = {})
    static final class C26241 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C26241(d<? super C26241> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26241(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall companion = Superwall.Companion.getInstance();
                InternalSuperwallEvent.AppOpen appOpen = new InternalSuperwallEvent.AppOpen(null, 1, null);
                this.label = 1;
                if (TrackingKt.track(companion, appOpen, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((Result) obj).j();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26241) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.analytics.session.AppSessionManager$onStop$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.analytics.session.AppSessionManager$onStop$1", f = "AppSessionManager.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    static final class C26251 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C26251(d<? super C26251> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26251(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall companion = Superwall.Companion.getInstance();
                int i11 = 7 | 0;
                InternalSuperwallEvent.AppClose appClose = new InternalSuperwallEvent.AppClose(null, 1, null);
                this.label = 1;
                if (TrackingKt.track(companion, appClose, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((Result) obj).j();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26251) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.analytics.session.AppSessionManager$trackAppLaunch$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.analytics.session.AppSessionManager$trackAppLaunch$1", f = "AppSessionManager.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    static final class C26261 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C26261(d<? super C26261> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26261(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall companion = Superwall.Companion.getInstance();
                InternalSuperwallEvent.AppLaunch appLaunch = new InternalSuperwallEvent.AppLaunch(null, 1, null);
                this.label = 1;
                if (TrackingKt.track(companion, appLaunch, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((Result) obj).j();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26261) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public AppSessionManager(@NotNull ConfigManager configManager, @NotNull LocalStorage storage, @NotNull Factory delegate, @NotNull IOScope backgroundScope) {
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.configManager = configManager;
        this.storage = storage;
        this.delegate = delegate;
        this.backgroundScope = backgroundScope;
        this.appSession = new AppSession((String) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null);
        listenForAppSessionTimeout();
    }

    private final void detectNewSession() {
        Object objF;
        try {
            if (AppSessionLogic.INSTANCE.didStartNewSession(this.lastAppClose, this.appSessionTimeout)) {
                setAppSession(new AppSession((String) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null));
                k.f(this.backgroundScope, null, null, new AppSessionManager$detectNewSession$1$1(this, null), 3, null);
                objF = k.f(this.backgroundScope, null, null, new AppSessionManager$detectNewSession$1$2(this, null), 3, null);
            } else {
                this.appSession.setEndAt(null);
                objF = Unit.f312394a;
            }
            new Either.Success(objF);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionCouldRefresh() {
        try {
            detectNewSession();
            trackAppLaunch();
            int i10 = 2 & 0;
            new Either.Success(k.f(this.backgroundScope, null, null, new AppSessionManager$sessionCouldRefresh$1$1(this, null), 3, null));
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

    private final void trackAppLaunch() {
        if (this.didTrackAppLaunch) {
            return;
        }
        k.f(this.backgroundScope, null, null, new C26261(null), 3, null);
        this.didTrackAppLaunch = true;
    }

    private final void willTerminate() {
        this.appSession.setEndAt(new Date());
    }

    @NotNull
    public final AppSession getAppSession() {
        return this.appSession;
    }

    @Nullable
    public final Long getAppSessionTimeout() {
        return this.appSessionTimeout;
    }

    public final void listenForAppSessionTimeout() {
        k.f(this.backgroundScope, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        k.f(this.backgroundScope, null, null, new C26241(null), 3, null);
        sessionCouldRefresh();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        k.f(this.backgroundScope, null, null, new C26251(null), 3, null);
        this.lastAppClose = new Date();
        this.appSession.setEndAt(new Date());
    }

    public final void setAppSession(@NotNull AppSession value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.appSession = value;
        k.f(t0.a(l1.e()), null, null, new AppSessionManager$appSession$1(this, value, null), 3, null);
    }

    public final void setAppSessionTimeout(@Nullable Long l10) {
        this.appSessionTimeout = l10;
    }
}
