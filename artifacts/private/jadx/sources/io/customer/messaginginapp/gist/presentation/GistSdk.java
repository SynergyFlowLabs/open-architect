package io.customer.messaginginapp.gist.presentation;

import androidx.lifecycle.c0;
import io.customer.messaginginapp.di.DIGraphMessagingInAppKt;
import io.customer.messaginginapp.gist.GistEnvironment;
import io.customer.messaginginapp.gist.data.listeners.GistQueue;
import io.customer.messaginginapp.state.InAppMessagingAction;
import io.customer.messaginginapp.state.InAppMessagingManager;
import io.customer.messaginginapp.state.InAppMessagingState;
import io.customer.messaginginapp.state.ModalMessageState;
import io.customer.messaginginapp.store.InAppPreferenceStore;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
public final class GistSdk implements GistProvider {

    @NotNull
    private final GistQueue gistQueue;

    @NotNull
    private final InAppMessagingManager inAppMessagingManager;

    @NotNull
    private final ih.e logger;

    @Nullable
    private Timer timer;

    /* JADX INFO: renamed from: io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1", f = "GistSdk.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nGistSdk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GistSdk.kt\nio/customer/messaginginapp/gist/presentation/GistSdk$subscribeToEvents$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,137:1\n17#2:138\n19#2:142\n17#2:143\n19#2:147\n46#3:139\n51#3:141\n46#3:144\n51#3:146\n105#4:140\n105#4:145\n*S KotlinDebug\n*F\n+ 1 GistSdk.kt\nio/customer/messaginginapp/gist/presentation/GistSdk$subscribeToEvents$1\n*L\n84#1:138\n84#1:142\n87#1:143\n87#1:147\n84#1:139\n84#1:141\n87#1:144\n87#1:146\n84#1:140\n87#1:145\n*E\n"})
    static final class AnonymousClass1 extends o implements n<s0, o0<? extends io.customer.sdk.lifecycle.b>, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, o0<? extends io.customer.sdk.lifecycle.b> o0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return invoke2(s0Var, (o0<io.customer.sdk.lifecycle.b>) o0Var, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final o0 o0Var = (o0) this.L$0;
                final kotlinx.coroutines.flow.i<io.customer.sdk.lifecycle.b> iVar = new kotlinx.coroutines.flow.i<io.customer.sdk.lifecycle.b>() { // from class: io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 GistSdk.kt\nio/customer/messaginginapp/gist/presentation/GistSdk$subscribeToEvents$1\n*L\n1#1,49:1\n18#2:50\n19#2:52\n85#3:51\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1$invokeSuspend$$inlined$filter$1$2", f = "GistSdk.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
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

                        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
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
                                io.customer.sdk.lifecycle.b bVar = (io.customer.sdk.lifecycle.b) obj;
                                if (bVar.h() == c0.a.ON_RESUME || bVar.h() == c0.a.ON_PAUSE) {
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
                    public Object collect(j<? super io.customer.sdk.lifecycle.b> jVar, kotlin.coroutines.d dVar) {
                        Object objCollect = o0Var.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                    }
                };
                kotlinx.coroutines.flow.i<io.customer.sdk.lifecycle.b> iVar2 = new kotlinx.coroutines.flow.i<io.customer.sdk.lifecycle.b>() { // from class: io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1$invokeSuspend$$inlined$filter$2

                    /* JADX INFO: renamed from: io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1$invokeSuspend$$inlined$filter$2$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 GistSdk.kt\nio/customer/messaginginapp/gist/presentation/GistSdk$subscribeToEvents$1\n*L\n1#1,49:1\n18#2:50\n19#2:52\n89#3:51\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1$invokeSuspend$$inlined$filter$2$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1$invokeSuspend$$inlined$filter$2$2", f = "GistSdk.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
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

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
                                io.customer.sdk.lifecycle.b bVar = (io.customer.sdk.lifecycle.b) obj;
                                if (bVar.f().get() != null && !(bVar.f().get() instanceof GistModalActivity)) {
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
                    public Object collect(j<? super io.customer.sdk.lifecycle.b> jVar, kotlin.coroutines.d dVar) {
                        Object objCollect = iVar.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                    }
                };
                final GistSdk gistSdk = GistSdk.this;
                j<? super io.customer.sdk.lifecycle.b> jVar = new j() { // from class: io.customer.messaginginapp.gist.presentation.GistSdk.subscribeToEvents.1.3

                    /* JADX INFO: renamed from: io.customer.messaginginapp.gist.presentation.GistSdk$subscribeToEvents$1$3$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[c0.a.values().length];
                            try {
                                iArr[c0.a.ON_RESUME.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[c0.a.ON_PAUSE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((io.customer.sdk.lifecycle.b) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(io.customer.sdk.lifecycle.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
                        int i11 = WhenMappings.$EnumSwitchMapping$0[bVar.h().ordinal()];
                        if (i11 == 1) {
                            gistSdk.onActivityResumed();
                        } else if (i11 == 2) {
                            gistSdk.onActivityPaused();
                        }
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVar2.collect(jVar, this) == objL) {
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

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, o0<io.customer.sdk.lifecycle.b> o0Var, kotlin.coroutines.d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1 = GistSdk.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = o0Var;
            return anonymousClass1.invokeSuspend(Unit.f312394a);
        }
    }

    public GistSdk(@NotNull String siteId, @NotNull String dataCenter, @NotNull GistEnvironment environment) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        Intrinsics.checkNotNullParameter(dataCenter, "dataCenter");
        Intrinsics.checkNotNullParameter(environment, "environment");
        eh.d dVar = eh.d.f274883c;
        InAppMessagingManager inAppMessagingManager = DIGraphMessagingInAppKt.getInAppMessagingManager(dVar);
        this.inAppMessagingManager = inAppMessagingManager;
        this.logger = dVar.w();
        this.gistQueue = DIGraphMessagingInAppKt.getGistQueue(dVar);
        inAppMessagingManager.dispatch(new InAppMessagingAction.Initialize(siteId, dataCenter, environment));
        subscribeToEvents();
    }

    static /* synthetic */ void fetchInAppMessages$default(GistSdk gistSdk, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        gistSdk.fetchInAppMessages(j10, j11);
    }

    private final InAppPreferenceStore getInAppPreferenceStore() {
        return DIGraphMessagingInAppKt.getInAppPreferenceStore(eh.d.f274883c);
    }

    private final InAppMessagingState getState() {
        return this.inAppMessagingManager.getCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityPaused() {
        ih.e.a.a(this.logger, "Activity paused, stopping polling", null, 2, null);
        resetTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityResumed() {
        ih.e.a.a(this.logger, "Activity resumed, starting polling", null, 2, null);
        fetchInAppMessages$default(this, getState().getPollInterval(), 0L, 2, null);
    }

    private final void resetTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        this.timer = null;
    }

    private final void subscribeToEvents() {
        eh.d.f274883c.r().e(new AnonymousClass1(null));
        int i10 = 5 ^ 0;
        InAppMessagingManager.subscribeToAttribute$default(this.inAppMessagingManager, new Function1() { // from class: io.customer.messaginginapp.gist.presentation.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(GistSdk.subscribeToEvents$lambda$1((InAppMessagingState) obj));
            }
        }, null, new Function1() { // from class: io.customer.messaginginapp.gist.presentation.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GistSdk.subscribeToEvents$lambda$2(this.f288359a, ((Long) obj).longValue());
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long subscribeToEvents$lambda$1(InAppMessagingState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPollInterval();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToEvents$lambda$2(GistSdk gistSdk, long j10) {
        gistSdk.fetchInAppMessages(j10, j10);
        return Unit.f312394a;
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistProvider
    public void dismissMessage() {
        ModalMessageState modalMessageState = getState().getModalMessageState();
        ModalMessageState.Displayed displayed = modalMessageState instanceof ModalMessageState.Displayed ? (ModalMessageState.Displayed) modalMessageState : null;
        if (displayed == null) {
            return;
        }
        this.inAppMessagingManager.dispatch(new InAppMessagingAction.DismissMessage(displayed.getMessage(), false, false, 6, null));
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistProvider
    public void fetchInAppMessages() {
        boolean z10 = false | false;
        fetchInAppMessages$default(this, getState().getPollInterval(), 0L, 2, null);
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistProvider
    public void reset() {
        this.inAppMessagingManager.dispatch(InAppMessagingAction.Reset.INSTANCE);
        getInAppPreferenceStore().clearAll();
        resetTimer();
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistProvider
    public void setCurrentRoute(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        ih.e.a.a(this.logger, "Current gist route is: " + getState().getCurrentRoute() + ", new route is: " + route, null, 2, null);
        if (Intrinsics.areEqual(getState().getCurrentRoute(), route)) {
            return;
        }
        this.inAppMessagingManager.dispatch(new InAppMessagingAction.SetPageRoute(route));
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistProvider
    public void setUserId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (!Intrinsics.areEqual(getState().getUserId(), userId)) {
            this.inAppMessagingManager.dispatch(new InAppMessagingAction.SetUserIdentifier(userId));
            fetchInAppMessages$default(this, getState().getPollInterval(), 0L, 2, null);
            return;
        }
        ih.e.a.a(this.logger, "Current user id is already set to: " + getState().getUserId() + ", ignoring new user id", null, 2, null);
    }

    private final void fetchInAppMessages(long j10, long j11) {
        ih.e.a.a(this.logger, "Starting polling with duration: " + j10 + " and initial delay: " + j11, null, 2, null);
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timerK = kotlin.concurrent.c.k("GistPolling", true);
        timerK.schedule(new TimerTask() { // from class: io.customer.messaginginapp.gist.presentation.GistSdk$fetchInAppMessages$$inlined$timer$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                this.this$0.gistQueue.fetchUserMessages();
            }
        }, j11, j10);
        this.timer = timerK;
    }

    public /* synthetic */ GistSdk(String str, String str2, GistEnvironment gistEnvironment, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? GistEnvironment.PROD : gistEnvironment);
    }
}
