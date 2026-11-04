package com.superwall.sdk.paywall.presentation;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.models.config.FeatureGatingBehavior;
import com.superwall.sdk.paywall.presentation.internal.InternalPresentationLogic;
import com.superwall.sdk.paywall.presentation.internal.request.PaywallOverrides;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallSkippedReason;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPublicPresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicPresentation.kt\ncom/superwall/sdk/paywall/presentation/PublicPresentationKt\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 3 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,235:1\n136#2,10:236\n108#3,5:246\n*S KotlinDebug\n*F\n+ 1 PublicPresentation.kt\ncom/superwall/sdk/paywall/presentation/PublicPresentationKt\n*L\n216#1:236,10\n231#1:246,5\n*E\n"})
public final class PublicPresentationKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.PublicPresentationKt$dismiss$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.PublicPresentationKt$dismiss$2", f = "PublicPresentation.kt", i = {0}, l = {38, 44}, m = "invokeSuspend", n = {"completionSignal"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nPublicPresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicPresentation.kt\ncom/superwall/sdk/paywall/presentation/PublicPresentationKt$dismiss$2\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,235:1\n136#2,10:236\n*S KotlinDebug\n*F\n+ 1 PublicPresentation.kt\ncom/superwall/sdk/paywall/presentation/PublicPresentationKt$dismiss$2\n*L\n36#1:236,10\n*E\n"})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Superwall $this_dismiss;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Superwall superwall, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$this_dismiss = superwall;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$1$lambda$0(x xVar) {
            Unit unit = Unit.f312394a;
            xVar.R(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$this_dismiss, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0091  */
        /* JADX WARN: Code duplicated, block: B:43:0x009a  */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
        
            if (r4.q(r10) == r1) goto L47;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r13 = 2
                int r0 = r14.label
                r13 = 3
                r2 = 2
                r13 = 6
                r3 = 0
                r4 = 1
                r13 = 5
                if (r0 == 0) goto L35
                r13 = 0
                if (r0 == r4) goto L22
                r13 = 0
                if (r0 != r2) goto L1a
                kotlin.ResultKt.m(r15)
                goto Lb6
            L1a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L22:
                r13 = 4
                java.lang.Object r0 = r14.L$0
                r4 = r0
                r13 = 7
                kotlinx.coroutines.x r4 = (kotlinx.coroutines.x) r4
                kotlin.ResultKt.m(r15)     // Catch: java.lang.Throwable -> L30
                r10 = r14
                r10 = r14
                r13 = 3
                goto L67
            L30:
                r0 = move-exception
                r15 = r0
                r10 = r14
                r10 = r14
                goto L8b
            L35:
                r13 = 5
                kotlin.ResultKt.m(r15)
                r13 = 0
                kotlinx.coroutines.x r15 = kotlinx.coroutines.z.c(r3, r4, r3)
                r13 = 6
                com.superwall.sdk.Superwall r5 = r14.$this_dismiss
                com.superwall.sdk.paywall.view.PaywallView r6 = r5.getPaywallView()     // Catch: java.lang.Throwable -> L75
                r13 = 4
                if (r6 == 0) goto L79
                com.superwall.sdk.paywall.presentation.internal.state.PaywallResult$Declined r7 = new com.superwall.sdk.paywall.presentation.internal.state.PaywallResult$Declined     // Catch: java.lang.Throwable -> L75
                r13 = 7
                r7.<init>()     // Catch: java.lang.Throwable -> L75
                com.superwall.sdk.paywall.presentation.d r9 = new com.superwall.sdk.paywall.presentation.d     // Catch: java.lang.Throwable -> L75
                r9.<init>()     // Catch: java.lang.Throwable -> L75
                r13 = 2
                r14.L$0 = r15     // Catch: java.lang.Throwable -> L75
                r14.label = r4     // Catch: java.lang.Throwable -> L75
                r8 = 0
                r11 = 4
                r13 = r11
                r12 = 0
                r10 = r14
                java.lang.Object r14 = com.superwall.sdk.paywall.presentation.internal.InternalPresentationKt.dismiss$default(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6e
                r13 = 6
                if (r14 != r1) goto L66
                r13 = 5
                goto Lb5
            L66:
                r4 = r15
            L67:
                kotlin.Unit r14 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L6a
                goto L85
            L6a:
                r0 = move-exception
                r15 = r0
                r13 = 0
                goto L8b
            L6e:
                r0 = move-exception
            L6f:
                r14 = r0
                r14 = r0
                r4 = r15
                r15 = r14
                r13 = 0
                goto L8b
            L75:
                r0 = move-exception
                r10 = r14
                r10 = r14
                goto L6f
            L79:
                r10 = r14
                kotlin.Unit r14 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L6e
                boolean r14 = r15.R(r14)     // Catch: java.lang.Throwable -> L6e
                java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r14)     // Catch: java.lang.Throwable -> L6e
                r4 = r15
            L85:
                com.superwall.sdk.misc.Either$Success r15 = new com.superwall.sdk.misc.Either$Success     // Catch: java.lang.Throwable -> L6a
                r15.<init>(r14)     // Catch: java.lang.Throwable -> L6a
                goto La9
            L8b:
                boolean r14 = com.superwall.sdk.utilities.ErrorTrackingKt.access$shouldLog(r15)
                if (r14 == 0) goto La2
                com.superwall.sdk.Superwall$Companion r14 = com.superwall.sdk.Superwall.Companion
                boolean r0 = r14.getInitialized()
                r13 = 0
                if (r0 == 0) goto La2
                r13 = 2
                com.superwall.sdk.Superwall r14 = r14.getInstance()
                com.superwall.sdk.utilities.ErrorTrackingKt.trackError(r14, r15)
            La2:
                r13 = 4
                com.superwall.sdk.misc.Either$Failure r14 = new com.superwall.sdk.misc.Either$Failure
                r13 = 3
                r14.<init>(r15)
            La9:
                r13 = 1
                r10.L$0 = r3
                r10.label = r2
                r13 = 5
                java.lang.Object r14 = r4.q(r10)
                if (r14 != r1) goto Lb6
            Lb5:
                return r1
            Lb6:
                kotlin.Unit r14 = kotlin.Unit.f312394a
                r13 = 4
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.PublicPresentationKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.PublicPresentationKt$dismissForNextPaywall$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.PublicPresentationKt$dismissForNextPaywall$2", f = "PublicPresentation.kt", i = {0}, l = {66, 75}, m = "invokeSuspend", n = {"completionSignal"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nPublicPresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicPresentation.kt\ncom/superwall/sdk/paywall/presentation/PublicPresentationKt$dismissForNextPaywall$2\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,235:1\n136#2,10:236\n*S KotlinDebug\n*F\n+ 1 PublicPresentation.kt\ncom/superwall/sdk/paywall/presentation/PublicPresentationKt$dismissForNextPaywall$2\n*L\n64#1:236,10\n*E\n"})
    static final class C26782 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Superwall $this_dismissForNextPaywall;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26782(Superwall superwall, kotlin.coroutines.d<? super C26782> dVar) {
            super(2, dVar);
            this.$this_dismissForNextPaywall = superwall;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$1$lambda$0(x xVar) {
            Unit unit = Unit.f312394a;
            xVar.R(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26782(this.$this_dismissForNextPaywall, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x008d  */
        /* JADX WARN: Code duplicated, block: B:40:0x0096  */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
        
            if (r4.q(r10) == r1) goto L44;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r11 = 1
                int r0 = r12.label
                r2 = 2
                r3 = 0
                r4 = 1
                r11 = 5
                if (r0 == 0) goto L33
                if (r0 == r4) goto L22
                if (r0 != r2) goto L17
                kotlin.ResultKt.m(r13)
                r11 = 7
                goto Lae
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "ncs//hautustioivt n/o er rboekei w//lm /eferl// coo"
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r11 = 5
                r12.<init>(r13)
                throw r12
            L22:
                r11 = 3
                java.lang.Object r0 = r12.L$0
                r4 = r0
                kotlinx.coroutines.x r4 = (kotlinx.coroutines.x) r4
                kotlin.ResultKt.m(r13)     // Catch: java.lang.Throwable -> L2e
                r10 = r12
                r11 = 2
                goto L60
            L2e:
                r0 = move-exception
                r13 = r0
                r13 = r0
                r10 = r12
                goto L86
            L33:
                kotlin.ResultKt.m(r13)
                kotlinx.coroutines.x r13 = kotlinx.coroutines.z.c(r3, r4, r3)
                r11 = 1
                com.superwall.sdk.Superwall r5 = r12.$this_dismissForNextPaywall
                r11 = 1
                com.superwall.sdk.paywall.view.PaywallView r6 = r5.getPaywallView()     // Catch: java.lang.Throwable -> L6e
                if (r6 == 0) goto L71
                com.superwall.sdk.paywall.presentation.internal.state.PaywallResult$Declined r7 = new com.superwall.sdk.paywall.presentation.internal.state.PaywallResult$Declined     // Catch: java.lang.Throwable -> L6e
                r7.<init>()     // Catch: java.lang.Throwable -> L6e
                com.superwall.sdk.paywall.presentation.PaywallCloseReason$ForNextPaywall r8 = com.superwall.sdk.paywall.presentation.PaywallCloseReason.ForNextPaywall.INSTANCE     // Catch: java.lang.Throwable -> L6e
                com.superwall.sdk.paywall.presentation.e r9 = new com.superwall.sdk.paywall.presentation.e     // Catch: java.lang.Throwable -> L6e
                r9.<init>()     // Catch: java.lang.Throwable -> L6e
                r12.L$0 = r13     // Catch: java.lang.Throwable -> L6e
                r11 = 5
                r12.label = r4     // Catch: java.lang.Throwable -> L6e
                r10 = r12
                r11 = 3
                java.lang.Object r12 = com.superwall.sdk.paywall.presentation.internal.InternalPresentationKt.dismiss(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L66
                if (r12 != r1) goto L5f
                r11 = 4
                goto Lad
            L5f:
                r4 = r13
            L60:
                kotlin.Unit r12 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L63
                goto L7f
            L63:
                r0 = move-exception
                r13 = r0
                goto L86
            L66:
                r0 = move-exception
            L67:
                r12 = r0
                r12 = r0
                r4 = r13
                r13 = r12
                r13 = r12
                r11 = 4
                goto L86
            L6e:
                r0 = move-exception
                r10 = r12
                goto L67
            L71:
                r10 = r12
                r10 = r12
                r11 = 6
                kotlin.Unit r12 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L66
                boolean r12 = r13.R(r12)     // Catch: java.lang.Throwable -> L66
                java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r12)     // Catch: java.lang.Throwable -> L66
                r4 = r13
            L7f:
                r11 = 0
                com.superwall.sdk.misc.Either$Success r13 = new com.superwall.sdk.misc.Either$Success     // Catch: java.lang.Throwable -> L63
                r13.<init>(r12)     // Catch: java.lang.Throwable -> L63
                goto La2
            L86:
                boolean r12 = com.superwall.sdk.utilities.ErrorTrackingKt.access$shouldLog(r13)
                r11 = 1
                if (r12 == 0) goto L9d
                r11 = 4
                com.superwall.sdk.Superwall$Companion r12 = com.superwall.sdk.Superwall.Companion
                boolean r0 = r12.getInitialized()
                if (r0 == 0) goto L9d
                com.superwall.sdk.Superwall r12 = r12.getInstance()
                com.superwall.sdk.utilities.ErrorTrackingKt.trackError(r12, r13)
            L9d:
                com.superwall.sdk.misc.Either$Failure r12 = new com.superwall.sdk.misc.Either$Failure
                r12.<init>(r13)
            La2:
                r11 = 4
                r10.L$0 = r3
                r10.label = r2
                java.lang.Object r12 = r4.q(r10)
                if (r12 != r1) goto Lae
            Lad:
                return r1
            Lae:
                kotlin.Unit r12 = kotlin.Unit.f312394a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.PublicPresentationKt.C26782.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26782) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.PublicPresentationKt$dismissSync$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.PublicPresentationKt$dismissSync$1", f = "PublicPresentation.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Superwall $this_dismissSync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Superwall superwall, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_dismissSync = superwall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$this_dismissSync, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall superwall = this.$this_dismissSync;
                this.label = 1;
                if (PublicPresentationKt.dismiss(superwall, this) == objL) {
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

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.PublicPresentationKt$dismissSyncForNextPaywall$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.PublicPresentationKt$dismissSyncForNextPaywall$1", f = "PublicPresentation.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "invokeSuspend", n = {}, s = {})
    static final class C26791 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Superwall $this_dismissSyncForNextPaywall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26791(Superwall superwall, kotlin.coroutines.d<? super C26791> dVar) {
            super(2, dVar);
            this.$this_dismissSyncForNextPaywall = superwall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26791(this.$this_dismissSyncForNextPaywall, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall superwall = this.$this_dismissSyncForNextPaywall;
                this.label = 1;
                if (PublicPresentationKt.dismissForNextPaywall(superwall, this) == objL) {
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
            return ((C26791) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.PublicPresentationKt$internallyRegister$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.PublicPresentationKt$internallyRegister$1", f = "PublicPresentation.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    static final class C26801 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ x<Unit> $collectionWillStart;
        final /* synthetic */ Function0<Unit> $completion;
        final /* synthetic */ PaywallPresentationHandler $handler;
        final /* synthetic */ j0<PaywallState> $publisher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26801(x<Unit> xVar, j0<PaywallState> j0Var, PaywallPresentationHandler paywallPresentationHandler, Function0<Unit> function0, kotlin.coroutines.d<? super C26801> dVar) {
            super(2, dVar);
            this.$collectionWillStart = xVar;
            this.$publisher = j0Var;
            this.$handler = paywallPresentationHandler;
            this.$completion = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26801(this.$collectionWillStart, this.$publisher, this.$handler, this.$completion, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.$collectionWillStart.R(Unit.f312394a);
                j0<PaywallState> j0Var = this.$publisher;
                final PaywallPresentationHandler paywallPresentationHandler = this.$handler;
                final Function0<Unit> function0 = this.$completion;
                j<? super PaywallState> jVar = new j() { // from class: com.superwall.sdk.paywall.presentation.PublicPresentationKt.internallyRegister.1.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((PaywallState) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(PaywallState paywallState, kotlin.coroutines.d<? super Unit> dVar) {
                        Function1<Throwable, Unit> onErrorHandler$superwall_release;
                        Function1<PaywallSkippedReason, Unit> onSkipHandler$superwall_release;
                        Function1<Throwable, Unit> onErrorHandler$superwall_release2;
                        Function2<PaywallInfo, PaywallResult, Unit> onDismissHandler$superwall_release;
                        Function1<PaywallInfo, Unit> onPresentHandler$superwall_release;
                        PaywallPresentationHandler paywallPresentationHandler2 = paywallPresentationHandler;
                        Function0<Unit> function1 = function0;
                        try {
                            Unit unit = null;
                            if (paywallState instanceof PaywallState.Presented) {
                                if (paywallPresentationHandler2 != null && (onPresentHandler$superwall_release = paywallPresentationHandler2.getOnPresentHandler$superwall_release()) != null) {
                                    onPresentHandler$superwall_release.invoke(((PaywallState.Presented) paywallState).getPaywallInfo());
                                    unit = Unit.f312394a;
                                }
                            } else if (paywallState instanceof PaywallState.Dismissed) {
                                PaywallInfo paywallInfoComponent1 = ((PaywallState.Dismissed) paywallState).component1();
                                PaywallResult paywallResultComponent2 = ((PaywallState.Dismissed) paywallState).component2();
                                if (paywallPresentationHandler2 != null && (onDismissHandler$superwall_release = paywallPresentationHandler2.getOnDismissHandler$superwall_release()) != null) {
                                    onDismissHandler$superwall_release.invoke(paywallInfoComponent1, paywallResultComponent2);
                                }
                                if ((paywallResultComponent2 instanceof PaywallResult.Purchased) || (paywallResultComponent2 instanceof PaywallResult.Restored)) {
                                    if (function1 != null) {
                                        function1.invoke();
                                        unit = Unit.f312394a;
                                    }
                                } else {
                                    if (!(paywallResultComponent2 instanceof PaywallResult.Declined)) {
                                        throw new k0();
                                    }
                                    PaywallCloseReason closeReason = paywallInfoComponent1.getCloseReason();
                                    FeatureGatingBehavior featureGatingBehavior = paywallInfoComponent1.getFeatureGatingBehavior();
                                    if (closeReason.getStateShouldComplete() && Intrinsics.areEqual(featureGatingBehavior, FeatureGatingBehavior.NonGated.INSTANCE) && function1 != null) {
                                        function1.invoke();
                                    }
                                    if (Intrinsics.areEqual(closeReason, PaywallCloseReason.WebViewFailedToLoad.INSTANCE) && Intrinsics.areEqual(featureGatingBehavior, FeatureGatingBehavior.Gated.INSTANCE)) {
                                        Throwable thPresentationError = InternalPresentationLogic.INSTANCE.presentationError("SWKPresentationError", com.planner5d.library.engine.input.f.b.f160742x1, "Webview Failed", "Trying to present gated paywall but the webview could not load.");
                                        if (paywallPresentationHandler2 != null && (onErrorHandler$superwall_release2 = paywallPresentationHandler2.getOnErrorHandler$superwall_release()) != null) {
                                            onErrorHandler$superwall_release2.invoke(thPresentationError);
                                            unit = Unit.f312394a;
                                        }
                                    } else {
                                        unit = Unit.f312394a;
                                    }
                                }
                            } else if (paywallState instanceof PaywallState.Skipped) {
                                PaywallSkippedReason paywallSkippedReasonComponent1 = ((PaywallState.Skipped) paywallState).component1();
                                if (paywallPresentationHandler2 != null && (onSkipHandler$superwall_release = paywallPresentationHandler2.getOnSkipHandler$superwall_release()) != null) {
                                    onSkipHandler$superwall_release.invoke(paywallSkippedReasonComponent1);
                                }
                                if (function1 != null) {
                                    function1.invoke();
                                    unit = Unit.f312394a;
                                }
                            } else {
                                if (!(paywallState instanceof PaywallState.PresentationError)) {
                                    throw new k0();
                                }
                                if (paywallPresentationHandler2 != null && (onErrorHandler$superwall_release = paywallPresentationHandler2.getOnErrorHandler$superwall_release()) != null) {
                                    onErrorHandler$superwall_release.invoke(((PaywallState.PresentationError) paywallState).getError());
                                    unit = Unit.f312394a;
                                }
                            }
                            new Either.Success(unit);
                        } catch (Throwable th2) {
                            if (ErrorTrackingKt.shouldLog(th2)) {
                                Superwall.Companion companion = Superwall.Companion;
                                if (companion.getInitialized()) {
                                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                                }
                            }
                            new Either.Failure(th2);
                        }
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (j0Var.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26801) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.PublicPresentationKt$internallyRegister$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.PublicPresentationKt$internallyRegister$2", f = "PublicPresentation.kt", i = {}, l = {183, 184}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPublicPresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicPresentation.kt\ncom/superwall/sdk/paywall/presentation/PublicPresentationKt$internallyRegister$2\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,235:1\n136#2,10:236\n*S KotlinDebug\n*F\n+ 1 PublicPresentation.kt\ncom/superwall/sdk/paywall/presentation/PublicPresentationKt$internallyRegister$2\n*L\n182#1:236,10\n*E\n"})
    static final class C26812 extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ x<Unit> $collectionWillStart;
        final /* synthetic */ Function0<Unit> $completion;
        final /* synthetic */ Map<String, Object> $params;
        final /* synthetic */ String $placement;
        final /* synthetic */ j0<PaywallState> $publisher;
        final /* synthetic */ Superwall $this_internallyRegister;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26812(x<Unit> xVar, Superwall superwall, String str, Map<String, ? extends Object> map, Function0<Unit> function0, j0<PaywallState> j0Var, kotlin.coroutines.d<? super C26812> dVar) {
            super(1, dVar);
            this.$collectionWillStart = xVar;
            this.$this_internallyRegister = superwall;
            this.$placement = str;
            this.$params = map;
            this.$completion = function0;
            this.$publisher = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new C26812(this.$collectionWillStart, this.$this_internallyRegister, this.$placement, this.$params, this.$completion, this.$publisher, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
        
            if (com.superwall.sdk.paywall.presentation.PublicPresentationKt.trackAndPresentPaywall(r8, r1, r4, null, r2, r5, r12) == r7) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
                int r0 = r12.label
                r1 = 2
                r11 = 7
                r2 = 1
                if (r0 == 0) goto L40
                r11 = 5
                if (r0 == r2) goto L21
                r11 = 6
                if (r0 != r1) goto L17
                kotlin.ResultKt.m(r13)     // Catch: java.lang.Throwable -> L9a
                r11 = 1
                goto L91
            L17:
                r11 = 1
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r11 = 1
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Object r0 = r12.L$4
                kotlinx.coroutines.flow.j0 r0 = (kotlinx.coroutines.flow.j0) r0
                java.lang.Object r3 = r12.L$3
                kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                r11 = 0
                java.lang.Object r4 = r12.L$2
                java.util.Map r4 = (java.util.Map) r4
                java.lang.Object r5 = r12.L$1
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r8 = r12.L$0
                com.superwall.sdk.Superwall r8 = (com.superwall.sdk.Superwall) r8
                r11 = 2
                kotlin.ResultKt.m(r13)     // Catch: java.lang.Throwable -> L9a
                r10 = r5
                r10 = r5
                r5 = r0
                r0 = r10
                r11 = 0
                goto L69
            L40:
                r11 = 4
                kotlin.ResultKt.m(r13)
                kotlinx.coroutines.x<kotlin.Unit> r0 = r12.$collectionWillStart
                com.superwall.sdk.Superwall r8 = r12.$this_internallyRegister
                java.lang.String r5 = r12.$placement
                java.util.Map<java.lang.String, java.lang.Object> r4 = r12.$params
                r11 = 5
                kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r12.$completion
                kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState> r9 = r12.$publisher
                r12.L$0 = r8     // Catch: java.lang.Throwable -> L9a
                r12.L$1 = r5     // Catch: java.lang.Throwable -> L9a
                r12.L$2 = r4     // Catch: java.lang.Throwable -> L9a
                r12.L$3 = r3     // Catch: java.lang.Throwable -> L9a
                r12.L$4 = r9     // Catch: java.lang.Throwable -> L9a
                r12.label = r2     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r0 = r0.q(r12)     // Catch: java.lang.Throwable -> L9a
                r11 = 3
                if (r0 != r7) goto L66
                r11 = 0
                goto L8f
            L66:
                r0 = r5
                r5 = r9
                r5 = r9
            L69:
                r11 = 2
                if (r3 == 0) goto L6e
                r11 = 5
                goto L6f
            L6e:
                r2 = 0
            L6f:
                r3 = 7
                r3 = 0
                r12.L$0 = r3     // Catch: java.lang.Throwable -> L9a
                r12.L$1 = r3     // Catch: java.lang.Throwable -> L9a
                r12.L$2 = r3     // Catch: java.lang.Throwable -> L9a
                r12.L$3 = r3     // Catch: java.lang.Throwable -> L9a
                r12.L$4 = r3     // Catch: java.lang.Throwable -> L9a
                r11 = 5
                r12.label = r1     // Catch: java.lang.Throwable -> L9a
                r3 = 0
                r1 = r4
                r4 = r2
                r2 = r1
                r2 = r1
                r6 = r12
                r1 = r0
                r1 = r0
                r0 = r8
                r0 = r8
                java.lang.Object r0 = com.superwall.sdk.paywall.presentation.PublicPresentationKt.access$trackAndPresentPaywall(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9a
                r11 = 3
                if (r0 != r7) goto L91
            L8f:
                r11 = 1
                return r7
            L91:
                r11 = 2
                kotlin.Unit r0 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L9a
                com.superwall.sdk.misc.Either$Success r1 = new com.superwall.sdk.misc.Either$Success     // Catch: java.lang.Throwable -> L9a
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L9a
                goto Lba
            L9a:
                r0 = move-exception
                boolean r1 = com.superwall.sdk.utilities.ErrorTrackingKt.access$shouldLog(r0)
                if (r1 == 0) goto Lb3
                r11 = 5
                com.superwall.sdk.Superwall$Companion r1 = com.superwall.sdk.Superwall.Companion
                r11 = 7
                boolean r2 = r1.getInitialized()
                if (r2 == 0) goto Lb3
                r11 = 4
                com.superwall.sdk.Superwall r1 = r1.getInstance()
                com.superwall.sdk.utilities.ErrorTrackingKt.trackError(r1, r0)
            Lb3:
                r11 = 6
                com.superwall.sdk.misc.Either$Failure r1 = new com.superwall.sdk.misc.Either$Failure
                r11 = 4
                r1.<init>(r0)
            Lba:
                kotlin.Unit r0 = kotlin.Unit.f312394a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.PublicPresentationKt.C26812.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26812) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.PublicPresentationKt$trackAndPresentPaywall$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.PublicPresentationKt", f = "PublicPresentation.kt", i = {0, 0, 0, 1}, l = {217, 230, 232}, m = "trackAndPresentPaywall", n = {"$this$trackAndPresentPaywall", "paywallOverrides", "publisher", "publisher"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class C26821 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C26821(kotlin.coroutines.d<? super C26821> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PublicPresentationKt.trackAndPresentPaywall(null, null, null, null, false, null, this);
        }
    }

    @Nullable
    public static final Object dismiss(@NotNull Superwall superwall, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = i.h(l1.e(), new AnonymousClass2(superwall, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public static final Object dismissForNextPaywall(@NotNull Superwall superwall, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = i.h(l1.e(), new C26782(superwall, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public static final void dismissSync(@NotNull Superwall superwall) throws InterruptedException {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        kotlinx.coroutines.j.b(null, new AnonymousClass1(superwall, null), 1, null);
    }

    public static final void dismissSyncForNextPaywall(@NotNull Superwall superwall) throws InterruptedException {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        kotlinx.coroutines.j.b(null, new C26791(superwall, null), 1, null);
    }

    private static final void internallyRegister(Superwall superwall, String str, Map<String, ? extends Object> map, PaywallPresentationHandler paywallPresentationHandler, Function0<Unit> function0) {
        j0 j0VarB = q0.b(0, 0, null, 7, null);
        x xVarC = z.c(null, 1, null);
        k.f(t0.a(l1.e()), null, null, new C26801(xVarC, j0VarB, paywallPresentationHandler, function0, null), 3, null);
        superwall.getSerialTaskManager$superwall_release().addTask(new C26812(xVarC, superwall, str, map, function0, j0VarB, null));
    }

    static /* synthetic */ void internallyRegister$default(Superwall superwall, String str, Map map, PaywallPresentationHandler paywallPresentationHandler, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            paywallPresentationHandler = null;
        }
        if ((i10 & 8) != 0) {
            function0 = null;
        }
        internallyRegister(superwall, str, map, paywallPresentationHandler, function0);
    }

    @oj.j
    public static final void register(@NotNull Superwall superwall, @NotNull String placement) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(placement, "placement");
        register$default(superwall, placement, null, null, null, 14, null);
    }

    public static /* synthetic */ void register$default(Superwall superwall, String str, Map map, PaywallPresentationHandler paywallPresentationHandler, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            paywallPresentationHandler = null;
        }
        if ((i10 & 8) != 0) {
            function0 = null;
        }
        register(superwall, str, map, paywallPresentationHandler, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:67:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0137, code lost:
    
        if (r1.emit(r2, r3) == r4) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.j0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.superwall.sdk.analytics.internal.TrackingLogic$Companion] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object trackAndPresentPaywall(com.superwall.sdk.Superwall r20, java.lang.String r21, java.util.Map<java.lang.String, ? extends java.lang.Object> r22, com.superwall.sdk.paywall.presentation.internal.request.PaywallOverrides r23, boolean r24, kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState> r25, kotlin.coroutines.d<? super kotlin.Unit> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.PublicPresentationKt.trackAndPresentPaywall(com.superwall.sdk.Superwall, java.lang.String, java.util.Map, com.superwall.sdk.paywall.presentation.internal.request.PaywallOverrides, boolean, kotlinx.coroutines.flow.j0, kotlin.coroutines.d):java.lang.Object");
    }

    static /* synthetic */ Object trackAndPresentPaywall$default(Superwall superwall, String str, Map map, PaywallOverrides paywallOverrides, boolean z10, j0 j0Var, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            paywallOverrides = null;
        }
        return trackAndPresentPaywall(superwall, str, map, paywallOverrides, z10, j0Var, dVar);
    }

    @oj.j
    public static final void register(@NotNull Superwall superwall, @NotNull String placement, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(placement, "placement");
        register$default(superwall, placement, map, null, null, 12, null);
    }

    @oj.j
    public static final void register(@NotNull Superwall superwall, @NotNull String placement, @Nullable Map<String, ? extends Object> map, @Nullable PaywallPresentationHandler paywallPresentationHandler) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(placement, "placement");
        register$default(superwall, placement, map, paywallPresentationHandler, null, 8, null);
    }

    @oj.j
    public static final void register(@NotNull Superwall superwall, @NotNull String placement, @Nullable Map<String, ? extends Object> map, @Nullable PaywallPresentationHandler paywallPresentationHandler, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(placement, "placement");
        internallyRegister(superwall, placement, map, paywallPresentationHandler, function0);
    }
}
