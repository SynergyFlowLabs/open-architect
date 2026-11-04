package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.config.models.ConfigState;
import com.superwall.sdk.dependencies.DependencyContainer;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatus;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class WaitForSubsStatusAndConfigKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt", f = "WaitForSubsStatusAndConfig.kt", i = {0, 0, 0, 0, 2, 2, 2, 2, 2, 3, 3, 3, 3, 5, 5}, l = {35, 67, 85, com.planner5d.library.engine.input.f.b.f160697i1, 120, 129, androidx.media2.widget.f.i.f59775g0, com.planner5d.library.engine.input.f.b.H1}, m = "waitForEntitlementsAndConfig", n = {"$this$waitForEntitlementsAndConfig", "request", "paywallStatePublisher", "dependencyContainer", "$this$waitForEntitlementsAndConfig", "request", "paywallStatePublisher", "dependencyContainer", "configState", "$this$waitForEntitlementsAndConfig", "request", "paywallStatePublisher", "dependencyContainer", "paywallStatePublisher", "dependencyContainer"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WaitForSubsStatusAndConfigKt.waitForEntitlementsAndConfig(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$2", f = "WaitForSubsStatusAndConfig.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nWaitForSubsStatusAndConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitForSubsStatusAndConfig.kt\ncom/superwall/sdk/paywall/presentation/internal/operators/WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,151:1\n17#2:152\n19#2:156\n46#3:153\n51#3:155\n105#4:154\n*S KotlinDebug\n*F\n+ 1 WaitForSubsStatusAndConfig.kt\ncom/superwall/sdk/paywall/presentation/internal/operators/WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$2\n*L\n37#1:152\n37#1:156\n37#1:153\n37#1:155\n37#1:154\n*E\n"})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super SubscriptionStatus>, Object> {
        final /* synthetic */ PresentationRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PresentationRequest presentationRequest, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$request = presentationRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$request, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            final z0<SubscriptionStatus> entitlements = this.$request.getFlags().getEntitlements();
            i<SubscriptionStatus> iVar = new i<SubscriptionStatus>() { // from class: com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$2$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WaitForSubsStatusAndConfig.kt\ncom/superwall/sdk/paywall/presentation/internal/operators/WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$2\n*L\n1#1,49:1\n18#2:50\n19#2:52\n37#3:51\n*E\n"})
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$2$invokeSuspend$$inlined$filter$1$2", f = "WaitForSubsStatusAndConfig.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends d {
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
                            int i10 = 5 | 0;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
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
                        Object objL = b.l();
                        int i11 = anonymousClass1.label;
                        if (i11 == 0) {
                            ResultKt.m(obj2);
                            j jVar = this.$this_unsafeFlow;
                            if (!(((SubscriptionStatus) obj) instanceof SubscriptionStatus.Unknown)) {
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
                public Object collect(j<? super SubscriptionStatus> jVar, kotlin.coroutines.d dVar) {
                    Object objCollect = entitlements.collect(new AnonymousClass2(jVar), dVar);
                    return objCollect == b.l() ? objCollect : Unit.f312394a;
                }
            };
            this.label = 1;
            Object objW0 = k.w0(iVar, this);
            return objW0 == objL ? objL : objW0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super SubscriptionStatus> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$3, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$3", f = "WaitForSubsStatusAndConfig.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ DependencyContainer $dependencyContainer;
        final /* synthetic */ PresentationRequest $request;
        final /* synthetic */ Superwall $this_waitForEntitlementsAndConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PresentationRequest presentationRequest, DependencyContainer dependencyContainer, Superwall superwall, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$request = presentationRequest;
            this.$dependencyContainer = dependencyContainer;
            this.$this_waitForEntitlementsAndConfig = superwall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass3(this.$request, this.$dependencyContainer, this.$this_waitForEntitlementsAndConfig, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent.PresentationRequest presentationRequest = new InternalSuperwallEvent.PresentationRequest(this.$request.getPresentationInfo().getEventData(), this.$request.getFlags().getType(), PaywallPresentationRequestStatus.Timeout.INSTANCE, new PaywallPresentationRequestStatusReason.SubscriptionStatusTimeout(), this.$dependencyContainer, null, 32, null);
                Superwall superwall = this.$this_waitForEntitlementsAndConfig;
                this.label = 1;
                if (TrackingKt.track(superwall, presentationRequest, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$4, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$4", f = "WaitForSubsStatusAndConfig.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160690g0}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ k0<ConfigState> $configState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(k0<ConfigState> k0Var, kotlin.coroutines.d<? super AnonymousClass4> dVar) {
            super(2, dVar);
            this.$configState = k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass4(this.$configState, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0<ConfigState> k0Var = this.$configState;
                this.label = 1;
                if (WaitForSubsStatusAndConfigKt.waitForEntitlementsAndConfig$configOrThrow(k0Var, this) == objL) {
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
            return ((AnonymousClass4) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$5, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$5", f = "WaitForSubsStatusAndConfig.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass5 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ DependencyContainer $dependencyContainer;
        final /* synthetic */ PresentationRequest $request;
        final /* synthetic */ Superwall $this_waitForEntitlementsAndConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(PresentationRequest presentationRequest, DependencyContainer dependencyContainer, Superwall superwall, kotlin.coroutines.d<? super AnonymousClass5> dVar) {
            super(2, dVar);
            this.$request = presentationRequest;
            this.$dependencyContainer = dependencyContainer;
            this.$this_waitForEntitlementsAndConfig = superwall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass5(this.$request, this.$dependencyContainer, this.$this_waitForEntitlementsAndConfig, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent.PresentationRequest presentationRequest = new InternalSuperwallEvent.PresentationRequest(this.$request.getPresentationInfo().getEventData(), this.$request.getFlags().getType(), PaywallPresentationRequestStatus.Timeout.INSTANCE, new PaywallPresentationRequestStatusReason.NoConfig(), this.$dependencyContainer, null, 32, null);
                Superwall superwall = this.$this_waitForEntitlementsAndConfig;
                this.label = 1;
                if (TrackingKt.track(superwall, presentationRequest, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass5) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x024c  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0112, code lost:
    
        if (kotlinx.coroutines.b4.d(r6, r4, r2) == r3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012c, code lost:
    
        if (waitForEntitlementsAndConfig$configOrThrow(r0, r2) == r3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017d, code lost:
    
        if (r7.emit(r0, r2) == r3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0196, code lost:
    
        if (waitForEntitlementsAndConfig$configOrThrow(r1, r2) == r3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b6, code lost:
    
        if (kotlinx.coroutines.flow.k.w0(r0, r2) == r3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01fc, code lost:
    
        if (r4.emit(r1, r2) == r3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0260, code lost:
    
        if (r14.emit(r1, r2) == r3) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.superwall.sdk.dependencies.DependencyContainer] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.superwall.sdk.dependencies.DependencyContainer] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v27, types: [com.superwall.sdk.dependencies.DependencyContainer] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.j0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForEntitlementsAndConfig(@org.jetbrains.annotations.NotNull com.superwall.sdk.Superwall r29, @org.jetbrains.annotations.NotNull com.superwall.sdk.paywall.presentation.internal.PresentationRequest r30, @org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState> r31, @org.jetbrains.annotations.Nullable com.superwall.sdk.dependencies.DependencyContainer r32, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r33) throws com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason.NoConfig, com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason.SubscriptionStatusTimeout {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.internal.operators.WaitForSubsStatusAndConfigKt.waitForEntitlementsAndConfig(com.superwall.sdk.Superwall, com.superwall.sdk.paywall.presentation.internal.PresentationRequest, kotlinx.coroutines.flow.j0, com.superwall.sdk.dependencies.DependencyContainer, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object waitForEntitlementsAndConfig$configOrThrow(z0<? extends ConfigState> z0Var, kotlin.coroutines.d<? super Unit> dVar) {
        Object objX0 = k.x0(z0Var, new WaitForSubsStatusAndConfigKt$waitForEntitlementsAndConfig$configOrThrow$2(null), dVar);
        return objX0 == b.l() ? objX0 : Unit.f312394a;
    }

    public static /* synthetic */ Object waitForEntitlementsAndConfig$default(Superwall superwall, PresentationRequest presentationRequest, j0 j0Var, DependencyContainer dependencyContainer, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j0Var = null;
        }
        if ((i10 & 4) != 0) {
            dependencyContainer = null;
        }
        return waitForEntitlementsAndConfig(superwall, presentationRequest, j0Var, dependencyContainer, dVar);
    }
}
