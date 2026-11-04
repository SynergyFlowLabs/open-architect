package com.superwall.sdk.deeplinks;

import android.net.Uri;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent;
import com.superwall.sdk.config.models.ConfigurationStatus;
import com.superwall.sdk.debug.DebugManager;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import com.superwall.sdk.web.WebPaywallRedeemer;
import java.util.concurrent.ConcurrentLinkedDeque;
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
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDeepLinkRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinkRouter.kt\ncom/superwall/sdk/deeplinks/DeepLinkRouter\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 3 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,89:1\n136#2,10:90\n122#3,4:100\n*S KotlinDebug\n*F\n+ 1 DeepLinkRouter.kt\ncom/superwall/sdk/deeplinks/DeepLinkRouter\n*L\n53#1:90,10\n74#1:100,4\n*E\n"})
public final class DeepLinkRouter {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static ConcurrentLinkedDeque<Uri> unhandledDeepLinks = new ConcurrentLinkedDeque<>();

    @NotNull
    private final DebugManager debugManager;

    @NotNull
    private final IOScope ioScope;

    @NotNull
    private final WebPaywallRedeemer redeemer;

    @NotNull
    private final Function2<TrackableSuperwallEvent, d<? super Unit>, Object> track;

    /* JADX INFO: renamed from: com.superwall.sdk.deeplinks.DeepLinkRouter$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.deeplinks.DeepLinkRouter$1", f = "DeepLinkRouter.kt", i = {}, l = {42, 43}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.deeplinks.DeepLinkRouter$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "com.superwall.sdk.deeplinks.DeepLinkRouter$1$1", f = "DeepLinkRouter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C18751 extends o implements Function2<Boolean, d<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            C18751(d<? super C18751> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C18751 c18751 = new C18751(dVar);
                c18751.Z$0 = ((Boolean) obj).booleanValue();
                return c18751;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Boolean> dVar) {
                return invoke(bool.booleanValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.Z$0);
            }

            public final Object invoke(boolean z10, d<? super Boolean> dVar) {
                return ((C18751) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: com.superwall.sdk.deeplinks.DeepLinkRouter$1$2, reason: invalid class name */
        @f(c = "com.superwall.sdk.deeplinks.DeepLinkRouter$1$2", f = "DeepLinkRouter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends o implements Function2<ConfigurationStatus, d<? super Boolean>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(d<? super AnonymousClass2> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfigurationStatus configurationStatus, d<? super Boolean> dVar) {
                return ((AnonymousClass2) create(configurationStatus, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.a(((ConfigurationStatus) this.L$0) instanceof ConfigurationStatus.Configured);
            }
        }

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return DeepLinkRouter.this.new AnonymousClass1(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (kotlinx.coroutines.flow.k.x0(r7, r1, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.label
                r2 = 0
                r3 = 3
                r3 = 2
                r4 = 1
                r5 = r4
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                kotlin.ResultKt.m(r7)
                goto L56
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1d:
                kotlin.ResultKt.m(r7)
                goto L3c
            L21:
                kotlin.ResultKt.m(r7)
                com.superwall.sdk.Superwall$Companion r7 = com.superwall.sdk.Superwall.Companion
                r5 = 0
                kotlinx.coroutines.flow.i r7 = r7.getHasInitialized()
                r5 = 2
                com.superwall.sdk.deeplinks.DeepLinkRouter$1$1 r1 = new com.superwall.sdk.deeplinks.DeepLinkRouter$1$1
                r1.<init>(r2)
                r5 = 1
                r6.label = r4
                java.lang.Object r7 = kotlinx.coroutines.flow.k.x0(r7, r1, r6)
                if (r7 != r0) goto L3c
                r5 = 5
                goto L55
            L3c:
                r5 = 4
                com.superwall.sdk.Superwall$Companion r7 = com.superwall.sdk.Superwall.Companion
                com.superwall.sdk.Superwall r7 = r7.getInstance()
                kotlinx.coroutines.flow.i r7 = r7.getConfigurationStateListener()
                com.superwall.sdk.deeplinks.DeepLinkRouter$1$2 r1 = new com.superwall.sdk.deeplinks.DeepLinkRouter$1$2
                r5 = 3
                r1.<init>(r2)
                r6.label = r3
                java.lang.Object r7 = kotlinx.coroutines.flow.k.x0(r7, r1, r6)
                if (r7 != r0) goto L56
            L55:
                return r0
            L56:
                java.util.concurrent.ConcurrentLinkedDeque r7 = com.superwall.sdk.deeplinks.DeepLinkRouter.access$getUnhandledDeepLinks$cp()
                r5 = 0
                boolean r7 = r7.isEmpty()
                r5 = 5
                if (r7 != 0) goto L7e
                java.util.concurrent.ConcurrentLinkedDeque r7 = com.superwall.sdk.deeplinks.DeepLinkRouter.access$getUnhandledDeepLinks$cp()
                java.lang.Object r7 = r7.pop()
                android.net.Uri r7 = (android.net.Uri) r7
                com.superwall.sdk.deeplinks.DeepLinkRouter r0 = com.superwall.sdk.deeplinks.DeepLinkRouter.this
                r5 = 5
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                r0.m24handleDeepLinkIoAF18A(r7)
                java.util.concurrent.ConcurrentLinkedDeque r0 = com.superwall.sdk.deeplinks.DeepLinkRouter.access$getUnhandledDeepLinks$cp()
                r5 = 7
                r0.remove(r7)
                goto L56
            L7e:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.deeplinks.DeepLinkRouter.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: handleDeepLink-IoAF18A, reason: not valid java name */
        public final Object m25handleDeepLinkIoAF18A(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (!Result.h(DeepLinkRouterKt.getRedeemableCode(uri)) && !Result.h(DebugManager.Companion.m23outcomeForDeepLinkIoAF18A(uri))) {
                Result.a aVar = Result.Companion;
                return Result.m785constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Not a superwall link")));
            }
            Superwall.Companion companion = Superwall.Companion;
            if (companion.getInitialized() && (companion.getInstance().getConfigurationState() instanceof ConfigurationStatus.Configured)) {
                Result.a(companion.getInstance().getDependencyContainer$superwall_release().getDeepLinkRouter$superwall_release().m24handleDeepLinkIoAF18A(uri));
            } else {
                DeepLinkRouter.unhandledDeepLinks.add(uri);
            }
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(Boolean.TRUE);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeepLinkRouter(@NotNull WebPaywallRedeemer redeemer, @NotNull IOScope ioScope, @NotNull DebugManager debugManager, @NotNull Function2<? super TrackableSuperwallEvent, ? super d<? super Unit>, ? extends Object> track) {
        Intrinsics.checkNotNullParameter(redeemer, "redeemer");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(debugManager, "debugManager");
        Intrinsics.checkNotNullParameter(track, "track");
        this.redeemer = redeemer;
        this.ioScope = ioScope;
        this.debugManager = debugManager;
        this.track = track;
        k.f(ioScope, null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final DebugManager getDebugManager() {
        return this.debugManager;
    }

    @NotNull
    public final IOScope getIoScope() {
        return this.ioScope;
    }

    @NotNull
    public final WebPaywallRedeemer getRedeemer() {
        return this.redeemer;
    }

    @NotNull
    public final Function2<TrackableSuperwallEvent, d<? super Unit>, Object> getTrack() {
        return this.track;
    }

    @NotNull
    /* JADX INFO: renamed from: handleDeepLink-IoAF18A, reason: not valid java name */
    public final Object m24handleDeepLinkIoAF18A(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            k.f(this.ioScope, null, null, new DeepLinkRouter$handleDeepLink$1$1(this, uri, null), 3, null);
            Object objMo81handleDeepLinkIoAF18A = this.redeemer.getDeepLinkReferrer().mo81handleDeepLinkIoAF18A(uri);
            if (Result.h(objMo81handleDeepLinkIoAF18A)) {
                boolean z10 = false;
                k.f(this.ioScope, null, null, new DeepLinkRouter$handleDeepLink$1$handledAsRedemption$1$1(this, (String) objMo81handleDeepLinkIoAF18A, null), 3, null);
                Result.a aVar = Result.Companion;
                return Result.m785constructorimpl(Boolean.TRUE);
            }
            boolean zH = Result.h(objMo81handleDeepLinkIoAF18A);
            if (!zH) {
                zH = this.debugManager.handle(uri);
            }
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(Boolean.valueOf(zH));
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            Either.Failure failure = new Either.Failure(th2);
            Result.a aVar3 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(failure.getError()));
        }
    }

    public /* synthetic */ DeepLinkRouter(WebPaywallRedeemer webPaywallRedeemer, IOScope iOScope, DebugManager debugManager, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(webPaywallRedeemer, (i10 & 2) != 0 ? new IOScope(null, 1, null) : iOScope, debugManager, function2);
    }
}
