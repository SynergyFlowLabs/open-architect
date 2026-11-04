package com.superwall.sdk.web;

import android.content.Context;
import com.devtodev.core.data.metrics.MetricConsts;
import com.facebook.internal.p;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.entitlements.Redeemable;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.models.entitlements.TransactionReceipt;
import com.superwall.sdk.models.internal.DeviceVendorId;
import com.superwall.sdk.models.internal.ErrorInfo;
import com.superwall.sdk.models.internal.RedemptionOwnership;
import com.superwall.sdk.models.internal.RedemptionOwnershipType;
import com.superwall.sdk.models.internal.RedemptionResult;
import com.superwall.sdk.models.internal.UserId;
import com.superwall.sdk.models.internal.WebRedemptionResponse;
import com.superwall.sdk.network.Network;
import com.superwall.sdk.network.NetworkError;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.storage.LatestRedemptionResponse;
import com.superwall.sdk.storage.Storage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nWebPaywallRedeemer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebPaywallRedeemer.kt\ncom/superwall/sdk/web/WebPaywallRedeemer\n+ 2 Either.kt\ncom/superwall/sdk/misc/EitherKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,341:1\n115#2,5:342\n108#2,2:351\n112#2:360\n110#2:361\n1557#3:347\n1628#3,3:348\n1755#3,3:353\n295#3,2:356\n230#3,2:358\n808#3,11:372\n774#3:383\n865#3,2:384\n827#3:386\n855#3,2:387\n136#4,10:362\n*S KotlinDebug\n*F\n+ 1 WebPaywallRedeemer.kt\ncom/superwall/sdk/web/WebPaywallRedeemer\n*L\n84#1:342,5\n145#1:351,2\n145#1:360\n145#1:361\n123#1:347\n123#1:348,3\n170#1:353,3\n183#1:356,2\n205#1:358,2\n274#1:372,11\n275#1:383\n275#1:384,2\n287#1:386\n287#1:387,2\n254#1:362,10\n*E\n"})
public final class WebPaywallRedeemer {

    @NotNull
    private final Context context;

    @NotNull
    private final Function0<Set<Entitlement>> currentPaywallEntitlements;

    @NotNull
    private final CheckForReferral deepLinkReferrer;

    @NotNull
    private final Function1<RedemptionResult, Unit> didRedeemLink;

    @NotNull
    private final Function0<Set<Entitlement>> getActiveDeviceEntitlements;

    @NotNull
    private final Function0<String> getAliasId;

    @NotNull
    private final Function0<DeviceVendorId> getDeviceId;

    @NotNull
    private final Function0<String> getExternalAccountId;

    @NotNull
    private final Function0<PaywallInfo> getPaywallInfo;

    @NotNull
    private final Function0<UserId> getUserId;

    @NotNull
    private final Function1<SubscriptionStatus, Unit> internallySetSubscriptionStatus;

    @NotNull
    private final IOScope ioScope;

    @NotNull
    private final Function1<kotlin.coroutines.d<? super Boolean>, Object> isPaywallVisible;

    @NotNull
    private final Function0<Boolean> isWebToAppEnabled;

    @NotNull
    private final Function0<Long> maxAge;

    @NotNull
    private final Network network;

    @Nullable
    private p2 pollingJob;

    @NotNull
    private final Function1<kotlin.coroutines.d<? super List<TransactionReceipt>>, Object> receipts;

    @NotNull
    private final Storage storage;

    @NotNull
    private final Function2<Trackable, kotlin.coroutines.d<? super Unit>, Object> track;

    @NotNull
    private final Function1<String, Unit> trackRestorationFailed;

    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> triggerRestoreInPaywall;

    @NotNull
    private final Function0<Unit> willRedeemLink;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.superwall.sdk.web.WebPaywallRedeemer$5, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.WebPaywallRedeemer$5", f = "WebPaywallRedeemer.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass5 extends o implements Function2<Trackable, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass5(kotlin.coroutines.d<? super AnonymousClass5> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(dVar);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Trackable trackable, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass5) create(trackable, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Trackable trackable = (Trackable) this.L$0;
                Superwall companion = Superwall.Companion.getInstance();
                this.label = 1;
                if (TrackingKt.track(companion, trackable, this) == objL) {
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
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.superwall.sdk.web.WebPaywallRedeemer$6, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.WebPaywallRedeemer$6", f = "WebPaywallRedeemer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass6 extends o implements Function1<kotlin.coroutines.d<? super Boolean>, Object> {
        int label;

        AnonymousClass6(kotlin.coroutines.d<? super AnonymousClass6> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass6(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(Superwall.Companion.getInstance().isPaywallPresented());
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Boolean> dVar) {
            return ((AnonymousClass6) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.superwall.sdk.web.WebPaywallRedeemer$7, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.WebPaywallRedeemer$7", f = "WebPaywallRedeemer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass7 extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass7(kotlin.coroutines.d<? super AnonymousClass7> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass7(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass7) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.web.WebPaywallRedeemer$8, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.WebPaywallRedeemer$8", f = "WebPaywallRedeemer.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass8 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass8(kotlin.coroutines.d<? super AnonymousClass8> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return WebPaywallRedeemer.this.new AnonymousClass8(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (WebPaywallRedeemer.this.isWebToAppEnabled().invoke().booleanValue()) {
                    WebPaywallRedeemer webPaywallRedeemer = WebPaywallRedeemer.this;
                    this.label = 1;
                    if (webPaywallRedeemer.checkForRefferal(this) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass8) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public interface RedeemType {

        public static final class Code implements RedeemType {

            @NotNull
            private final String code;

            @NotNull
            private final String description;

            public Code(@NotNull String code) {
                Intrinsics.checkNotNullParameter(code, "code");
                this.code = code;
                this.description = "CODE";
            }

            public static /* synthetic */ Code copy$default(Code code, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = code.code;
                }
                return code.copy(str);
            }

            @NotNull
            public final String component1() {
                return this.code;
            }

            @NotNull
            public final Code copy(@NotNull String code) {
                Intrinsics.checkNotNullParameter(code, "code");
                return new Code(code);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Code) && Intrinsics.areEqual(this.code, ((Code) obj).code);
            }

            @Override // com.superwall.sdk.web.WebPaywallRedeemer.RedeemType
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override // com.superwall.sdk.web.WebPaywallRedeemer.RedeemType
            @NotNull
            public String getDescription() {
                return this.description;
            }

            public int hashCode() {
                return this.code.hashCode();
            }

            @NotNull
            public String toString() {
                return "Code(code=" + this.code + ")";
            }
        }

        public static final class Existing implements RedeemType {

            @Nullable
            private static final String code = null;

            @NotNull
            public static final Existing INSTANCE = new Existing();

            @NotNull
            private static final String description = "EXISTING_CODES";

            private Existing() {
            }

            @Override // com.superwall.sdk.web.WebPaywallRedeemer.RedeemType
            @Nullable
            public String getCode() {
                return code;
            }

            @Override // com.superwall.sdk.web.WebPaywallRedeemer.RedeemType
            @NotNull
            public String getDescription() {
                return description;
            }
        }

        @Nullable
        String getCode();

        @NotNull
        String getDescription();
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RedemptionOwnershipType.values().length];
            try {
                iArr[RedemptionOwnershipType.AppUser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RedemptionOwnershipType.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.web.WebPaywallRedeemer$checkForRefferal$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.WebPaywallRedeemer", f = "WebPaywallRedeemer.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160702k0, 89}, m = "checkForRefferal", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
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
            return WebPaywallRedeemer.this.checkForRefferal(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.web.WebPaywallRedeemer$clear$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.WebPaywallRedeemer$clear$1", f = "WebPaywallRedeemer.kt", i = {}, l = {301}, m = "invokeSuspend", n = {}, s = {})
    static final class C27641 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C27641(kotlin.coroutines.d<? super C27641> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return WebPaywallRedeemer.this.new C27641(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                WebPaywallRedeemer webPaywallRedeemer = WebPaywallRedeemer.this;
                RedeemType.Existing existing = RedeemType.Existing.INSTANCE;
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
            return ((C27641) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.web.WebPaywallRedeemer$redeem$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.WebPaywallRedeemer", f = "WebPaywallRedeemer.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9}, l = {127, 128, 136, 143, 138, com.planner5d.library.engine.input.f.b.G1, 185, p.f100029m, 214, 241}, m = "redeem", n = {"this", "redemption", "allCodes", "this", "redemption", "allCodes", "this", "redemption", "allCodes", "this", "redemption", "this", "redemption", "this", "redemption", MetricConsts.Install, "this", "redemption", MetricConsts.Install, "this", "redemption", MetricConsts.Install, "this", "redemption", MetricConsts.Install, "this", "errorMessage"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C27651 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C27651(kotlin.coroutines.d<? super C27651> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebPaywallRedeemer.this.redeem(null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.web.WebPaywallRedeemer$startPolling$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.WebPaywallRedeemer$startPolling$1", f = "WebPaywallRedeemer.kt", i = {}, l = {311, 312}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nWebPaywallRedeemer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebPaywallRedeemer.kt\ncom/superwall/sdk/web/WebPaywallRedeemer$startPolling$1\n+ 2 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,341:1\n108#2,5:342\n*S KotlinDebug\n*F\n+ 1 WebPaywallRedeemer.kt\ncom/superwall/sdk/web/WebPaywallRedeemer$startPolling$1\n*L\n313#1:342,5\n*E\n"})
    static final class C27661 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ long $maxAge;
        int label;
        final /* synthetic */ WebPaywallRedeemer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27661(long j10, WebPaywallRedeemer webPaywallRedeemer, kotlin.coroutines.d<? super C27661> dVar) {
            super(2, dVar);
            this.$maxAge = j10;
            this.this$0 = webPaywallRedeemer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C27661(this.$maxAge, this.this$0, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0034  */
        /* JADX WARN: Code duplicated, block: B:17:0x0044  */
        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        
            if (r15 == r0) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005d -> B:22:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.web.WebPaywallRedeemer.C27661.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27661) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebPaywallRedeemer(@NotNull Context context, @NotNull IOScope ioScope, @NotNull CheckForReferral deepLinkReferrer, @NotNull Network network, @NotNull Storage storage, @NotNull Function0<Unit> willRedeemLink, @NotNull Function1<? super RedemptionResult, Unit> didRedeemLink, @NotNull Function0<Long> maxAge, @NotNull Function0<? extends Set<Entitlement>> getActiveDeviceEntitlements, @NotNull Function0<UserId> getUserId, @NotNull Function0<DeviceVendorId> getDeviceId, @NotNull Function0<String> getAliasId, @NotNull Function2<? super Trackable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> track, @NotNull Function1<? super SubscriptionStatus, Unit> internallySetSubscriptionStatus, @NotNull Function1<? super kotlin.coroutines.d<? super Boolean>, ? extends Object> isPaywallVisible, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> triggerRestoreInPaywall, @NotNull Function0<? extends Set<Entitlement>> currentPaywallEntitlements, @NotNull Function0<PaywallInfo> getPaywallInfo, @NotNull Function1<? super String, Unit> trackRestorationFailed, @NotNull Function0<Boolean> isWebToAppEnabled, @NotNull Function1<? super kotlin.coroutines.d<? super List<TransactionReceipt>>, ? extends Object> receipts, @NotNull Function0<String> getExternalAccountId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(deepLinkReferrer, "deepLinkReferrer");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(willRedeemLink, "willRedeemLink");
        Intrinsics.checkNotNullParameter(didRedeemLink, "didRedeemLink");
        Intrinsics.checkNotNullParameter(maxAge, "maxAge");
        Intrinsics.checkNotNullParameter(getActiveDeviceEntitlements, "getActiveDeviceEntitlements");
        Intrinsics.checkNotNullParameter(getUserId, "getUserId");
        Intrinsics.checkNotNullParameter(getDeviceId, "getDeviceId");
        Intrinsics.checkNotNullParameter(getAliasId, "getAliasId");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(internallySetSubscriptionStatus, "internallySetSubscriptionStatus");
        Intrinsics.checkNotNullParameter(isPaywallVisible, "isPaywallVisible");
        Intrinsics.checkNotNullParameter(triggerRestoreInPaywall, "triggerRestoreInPaywall");
        Intrinsics.checkNotNullParameter(currentPaywallEntitlements, "currentPaywallEntitlements");
        Intrinsics.checkNotNullParameter(getPaywallInfo, "getPaywallInfo");
        Intrinsics.checkNotNullParameter(trackRestorationFailed, "trackRestorationFailed");
        Intrinsics.checkNotNullParameter(isWebToAppEnabled, "isWebToAppEnabled");
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        Intrinsics.checkNotNullParameter(getExternalAccountId, "getExternalAccountId");
        this.context = context;
        this.ioScope = ioScope;
        this.deepLinkReferrer = deepLinkReferrer;
        this.network = network;
        this.storage = storage;
        this.willRedeemLink = willRedeemLink;
        this.didRedeemLink = didRedeemLink;
        this.maxAge = maxAge;
        this.getActiveDeviceEntitlements = getActiveDeviceEntitlements;
        this.getUserId = getUserId;
        this.getDeviceId = getDeviceId;
        this.getAliasId = getAliasId;
        this.track = track;
        this.internallySetSubscriptionStatus = internallySetSubscriptionStatus;
        this.isPaywallVisible = isPaywallVisible;
        this.triggerRestoreInPaywall = triggerRestoreInPaywall;
        this.currentPaywallEntitlements = currentPaywallEntitlements;
        this.getPaywallInfo = getPaywallInfo;
        this.trackRestorationFailed = trackRestorationFailed;
        this.isWebToAppEnabled = isWebToAppEnabled;
        this.receipts = receipts;
        this.getExternalAccountId = getExternalAccountId;
        k.f(ioScope, null, null, new AnonymousClass8(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _init_$lambda$0() {
        return Superwall.Companion.getInstance().getEntitlements().getActiveDeviceEntitlements$superwall_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceVendorId _init_$lambda$1() {
        return new DeviceVendorId(Superwall.Companion.getInstance().m13getVendorId6xTLGo0$superwall_release(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$2() {
        return Superwall.Companion.getInstance().getDependencyContainer$superwall_release().getIdentityManager().getAliasId();
    }

    private final void startPolling(long j10) {
        if (this.isWebToAppEnabled.invoke().booleanValue()) {
            p2 p2Var = this.pollingJob;
            if (p2Var != null) {
                p2.a.b(p2Var, null, 1, null);
            }
            this.pollingJob = k.f(t0.m(this.ioScope, l1.c()), null, null, new C27661(j10, this, null), 3, null);
        }
    }

    static /* synthetic */ void startPolling$default(WebPaywallRedeemer webPaywallRedeemer, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = webPaywallRedeemer.maxAge.invoke().longValue();
        }
        webPaywallRedeemer.startPolling(j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r6.redeem(r2, r0) == r1) goto L27;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkForRefferal(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<kotlin.Unit, java.lang.Throwable>> r7) {
        /*
            r6 = this;
            r5 = 5
            boolean r0 = r7 instanceof com.superwall.sdk.web.WebPaywallRedeemer.AnonymousClass1
            if (r0 == 0) goto L15
            r0 = r7
            com.superwall.sdk.web.WebPaywallRedeemer$checkForRefferal$1 r0 = (com.superwall.sdk.web.WebPaywallRedeemer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            r5 = 0
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L15:
            r5 = 4
            com.superwall.sdk.web.WebPaywallRedeemer$checkForRefferal$1 r0 = new com.superwall.sdk.web.WebPaywallRedeemer$checkForRefferal$1
            r0.<init>(r7)
        L1b:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = r4
            if (r2 == 0) goto L48
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            r5 = 7
            kotlin.ResultKt.m(r7)     // Catch: java.lang.Throwable -> L82
            goto L78
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            java.lang.Object r6 = r0.L$0
            com.superwall.sdk.web.WebPaywallRedeemer r6 = (com.superwall.sdk.web.WebPaywallRedeemer) r6
            kotlin.ResultKt.m(r7)     // Catch: java.lang.Throwable -> L82
            kotlin.Result r7 = (kotlin.Result) r7     // Catch: java.lang.Throwable -> L82
            java.lang.Object r7 = r7.j()     // Catch: java.lang.Throwable -> L82
            r5 = 1
            goto L5a
        L48:
            kotlin.ResultKt.m(r7)
            r5 = 3
            com.superwall.sdk.web.CheckForReferral r7 = r6.deepLinkReferrer     // Catch: java.lang.Throwable -> L82
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L82
            r0.label = r4     // Catch: java.lang.Throwable -> L82
            java.lang.Object r7 = r7.mo80checkForReferralIoAF18A(r0)     // Catch: java.lang.Throwable -> L82
            r5 = 4
            if (r7 != r1) goto L5a
            goto L76
        L5a:
            r5 = 0
            java.lang.Throwable r2 = kotlin.Result.d(r7)     // Catch: java.lang.Throwable -> L82
            if (r2 != 0) goto L81
            r5 = 0
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L82
            com.superwall.sdk.web.WebPaywallRedeemer$RedeemType$Code r2 = new com.superwall.sdk.web.WebPaywallRedeemer$RedeemType$Code     // Catch: java.lang.Throwable -> L82
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L82
            r7 = 0
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L82
            r0.label = r3     // Catch: java.lang.Throwable -> L82
            r5 = 4
            java.lang.Object r6 = r6.redeem(r2, r0)     // Catch: java.lang.Throwable -> L82
            r5 = 2
            if (r6 != r1) goto L78
        L76:
            r5 = 3
            return r1
        L78:
            kotlin.Unit r6 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L82
            r5 = 7
            com.superwall.sdk.misc.Either$Success r7 = new com.superwall.sdk.misc.Either$Success     // Catch: java.lang.Throwable -> L82
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L82
            return r7
        L81:
            throw r2     // Catch: java.lang.Throwable -> L82
        L82:
            r6 = move-exception
            com.superwall.sdk.misc.Either$Failure r7 = new com.superwall.sdk.misc.Either$Failure
            r5 = 2
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.web.WebPaywallRedeemer.checkForRefferal(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r9 == r1) goto L28;
     */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: checkForWebEntitlements-AKGx8qU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m82checkForWebEntitlementsAKGx8qU(@org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.NotNull com.superwall.sdk.models.internal.DeviceVendorId r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<? extends java.util.Set<com.superwall.sdk.models.entitlements.Entitlement>, java.lang.Throwable>> r9) {
        /*
            r6 = this;
            r5 = 7
            boolean r0 = r9 instanceof com.superwall.sdk.web.WebPaywallRedeemer$checkForWebEntitlements$1
            if (r0 == 0) goto L14
            r0 = r9
            com.superwall.sdk.web.WebPaywallRedeemer$checkForWebEntitlements$1 r0 = (com.superwall.sdk.web.WebPaywallRedeemer$checkForWebEntitlements$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L14:
            com.superwall.sdk.web.WebPaywallRedeemer$checkForWebEntitlements$1 r0 = new com.superwall.sdk.web.WebPaywallRedeemer$checkForWebEntitlements$1
            r5 = 6
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 2
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            r5 = 3
            if (r2 == r4) goto L3a
            r5 = 7
            if (r2 != r3) goto L31
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L83
            goto L60
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = 1
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L83
            r5 = 1
            goto L51
        L3f:
            kotlin.ResultKt.m(r9)
            r5 = 7
            if (r7 != 0) goto L54
            com.superwall.sdk.network.Network r6 = r6.network     // Catch: java.lang.Throwable -> L83
            r0.label = r4     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r6.webEntitlementsByDeviceID(r8, r0)     // Catch: java.lang.Throwable -> L83
            r5 = 4
            if (r9 != r1) goto L51
            goto L5e
        L51:
            com.superwall.sdk.misc.Either r9 = (com.superwall.sdk.misc.Either) r9     // Catch: java.lang.Throwable -> L83
            goto L62
        L54:
            com.superwall.sdk.network.Network r6 = r6.network     // Catch: java.lang.Throwable -> L83
            r0.label = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r6.mo62webEntitlementsByUserId5PBZuVg(r7, r8, r0)     // Catch: java.lang.Throwable -> L83
            if (r9 != r1) goto L60
        L5e:
            r5 = 0
            return r1
        L60:
            com.superwall.sdk.misc.Either r9 = (com.superwall.sdk.misc.Either) r9     // Catch: java.lang.Throwable -> L83
        L62:
            java.lang.Object r6 = r9.getSuccess()     // Catch: java.lang.Throwable -> L83
            com.superwall.sdk.models.entitlements.WebEntitlements r6 = (com.superwall.sdk.models.entitlements.WebEntitlements) r6     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L70
            java.util.List r6 = r6.getEntitlements()     // Catch: java.lang.Throwable -> L83
            if (r6 != 0) goto L74
        L70:
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L83
        L74:
            r5 = 1
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L83
            java.util.Set r6 = kotlin.collections.CollectionsKt.toSet(r6)     // Catch: java.lang.Throwable -> L83
            com.superwall.sdk.misc.Either$Success r7 = new com.superwall.sdk.misc.Either$Success     // Catch: java.lang.Throwable -> L83
            r5 = 0
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L83
            r5 = 5
            return r7
        L83:
            r6 = move-exception
            boolean r7 = com.superwall.sdk.utilities.ErrorTrackingKt.access$shouldLog(r6)
            if (r7 == 0) goto L9b
            r5 = 7
            com.superwall.sdk.Superwall$Companion r7 = com.superwall.sdk.Superwall.Companion
            boolean r8 = r7.getInitialized()
            r5 = 7
            if (r8 == 0) goto L9b
            com.superwall.sdk.Superwall r7 = r7.getInstance()
            com.superwall.sdk.utilities.ErrorTrackingKt.trackError(r7, r6)
        L9b:
            com.superwall.sdk.misc.Either$Failure r7 = new com.superwall.sdk.misc.Either$Failure
            r5 = 6
            r7.<init>(r6)
            r5 = 4
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.web.WebPaywallRedeemer.m82checkForWebEntitlementsAKGx8qU(java.lang.String, com.superwall.sdk.models.internal.DeviceVendorId, kotlin.coroutines.d):java.lang.Object");
    }

    public final void clear(@NotNull RedemptionOwnershipType ownership) {
        ArrayList arrayList;
        WebRedemptionResponse webRedemptionResponseCopy$default;
        List<RedemptionResult> codes;
        boolean z10;
        Intrinsics.checkNotNullParameter(ownership, "ownership");
        WebRedemptionResponse webRedemptionResponse = (WebRedemptionResponse) this.storage.read(LatestRedemptionResponse.INSTANCE);
        if (webRedemptionResponse == null || (codes = webRedemptionResponse.getCodes()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : codes) {
                if (obj instanceof RedemptionResult.Success) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                RedemptionResult.Success success = (RedemptionResult.Success) obj2;
                int i10 = WhenMappings.$EnumSwitchMapping$0[ownership.ordinal()];
                if (i10 == 1) {
                    z10 = success.getRedemptionInfo().getOwnership() instanceof RedemptionOwnership.AppUser;
                } else {
                    if (i10 != 2) {
                        throw new k0();
                    }
                    z10 = success.getRedemptionInfo().getOwnership() instanceof RedemptionOwnership.Device;
                }
                if (z10) {
                    arrayList.add(obj2);
                }
            }
        }
        if (webRedemptionResponse != null) {
            List<RedemptionResult> codes2 = webRedemptionResponse.getCodes();
            ArrayList arrayList3 = arrayList;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : codes2) {
                if (!CollectionsKt.contains(arrayList3 == null ? CollectionsKt.emptyList() : arrayList3, (RedemptionResult) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            webRedemptionResponseCopy$default = WebRedemptionResponse.copy$default(webRedemptionResponse, arrayList4, CollectionsKt.emptyList(), null, 4, null);
        } else {
            webRedemptionResponseCopy$default = null;
        }
        if (webRedemptionResponseCopy$default != null) {
            this.storage.write(LatestRedemptionResponse.INSTANCE, webRedemptionResponseCopy$default);
        }
        this.internallySetSubscriptionStatus.invoke(new SubscriptionStatus.Active(this.getActiveDeviceEntitlements.invoke()));
        k.f(this.ioScope, null, null, new C27641(null), 3, null);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Function0<Set<Entitlement>> getCurrentPaywallEntitlements() {
        return this.currentPaywallEntitlements;
    }

    @NotNull
    public final CheckForReferral getDeepLinkReferrer() {
        return this.deepLinkReferrer;
    }

    @NotNull
    public final Function1<RedemptionResult, Unit> getDidRedeemLink() {
        return this.didRedeemLink;
    }

    @NotNull
    public final Function0<Set<Entitlement>> getGetActiveDeviceEntitlements() {
        return this.getActiveDeviceEntitlements;
    }

    @NotNull
    public final Function0<String> getGetAliasId() {
        return this.getAliasId;
    }

    @NotNull
    public final Function0<DeviceVendorId> getGetDeviceId() {
        return this.getDeviceId;
    }

    @NotNull
    public final Function0<String> getGetExternalAccountId() {
        return this.getExternalAccountId;
    }

    @NotNull
    public final Function0<PaywallInfo> getGetPaywallInfo() {
        return this.getPaywallInfo;
    }

    @NotNull
    public final Function0<UserId> getGetUserId() {
        return this.getUserId;
    }

    @NotNull
    public final Function1<SubscriptionStatus, Unit> getInternallySetSubscriptionStatus() {
        return this.internallySetSubscriptionStatus;
    }

    @NotNull
    public final IOScope getIoScope() {
        return this.ioScope;
    }

    @NotNull
    public final Function0<Long> getMaxAge() {
        return this.maxAge;
    }

    @NotNull
    public final Network getNetwork() {
        return this.network;
    }

    @NotNull
    public final Function1<kotlin.coroutines.d<? super List<TransactionReceipt>>, Object> getReceipts() {
        return this.receipts;
    }

    @NotNull
    public final Storage getStorage() {
        return this.storage;
    }

    @NotNull
    public final Function2<Trackable, kotlin.coroutines.d<? super Unit>, Object> getTrack() {
        return this.track;
    }

    @NotNull
    public final Function1<String, Unit> getTrackRestorationFailed() {
        return this.trackRestorationFailed;
    }

    @NotNull
    public final Function1<kotlin.coroutines.d<? super Unit>, Object> getTriggerRestoreInPaywall() {
        return this.triggerRestoreInPaywall;
    }

    @NotNull
    public final Function0<Unit> getWillRedeemLink() {
        return this.willRedeemLink;
    }

    @NotNull
    public final Function1<kotlin.coroutines.d<? super Boolean>, Object> isPaywallVisible() {
        return this.isPaywallVisible;
    }

    @NotNull
    public final Function0<Boolean> isWebToAppEnabled() {
        return this.isWebToAppEnabled;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0316  */
    /* JADX WARN: Code duplicated, block: B:108:0x0339  */
    /* JADX WARN: Code duplicated, block: B:114:0x0358  */
    /* JADX WARN: Code duplicated, block: B:117:0x036d A[PHI: r0 r1 r2 r4 r5
      0x036d: PHI (r0v36 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType$Code) = 
      (r0v31 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType$Code)
      (r0v39 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType$Code)
     binds: [B:115:0x0369, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x036d: PHI (r1v23 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType) = 
      (r1v20 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType)
      (r1v25 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType)
     binds: [B:115:0x0369, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x036d: PHI (r2v35 com.superwall.sdk.models.internal.WebRedemptionResponse) = 
      (r2v32 com.superwall.sdk.models.internal.WebRedemptionResponse)
      (r2v36 com.superwall.sdk.models.internal.WebRedemptionResponse)
     binds: [B:115:0x0369, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x036d: PHI (r4v51 com.superwall.sdk.web.WebPaywallRedeemer) = (r4v48 com.superwall.sdk.web.WebPaywallRedeemer), (r4v53 com.superwall.sdk.web.WebPaywallRedeemer) binds: [B:115:0x0369, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x036d: PHI (r5v36 java.lang.Object) = (r5v29 java.lang.Object), (r5v45 java.lang.Object) binds: [B:115:0x0369, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0375  */
    /* JADX WARN: Code duplicated, block: B:121:0x0389  */
    /* JADX WARN: Code duplicated, block: B:124:0x039f  */
    /* JADX WARN: Code duplicated, block: B:126:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:127:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:131:0x03de  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:139:0x0416  */
    /* JADX WARN: Code duplicated, block: B:141:0x041c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0420  */
    /* JADX WARN: Code duplicated, block: B:146:0x0444  */
    /* JADX WARN: Code duplicated, block: B:149:0x044a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0450  */
    /* JADX WARN: Code duplicated, block: B:157:0x0480  */
    /* JADX WARN: Code duplicated, block: B:161:0x049f  */
    /* JADX WARN: Code duplicated, block: B:164:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:168:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:171:0x0405 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[LOOP:0: B:132:0x03e8->B:172:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[LOOP:1: B:106:0x0333->B:175:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[LOOP:2: B:90:0x02e7->B:178:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x00d0 A[PHI: r0 r1 r2 r4 r6 r7 r8 r9
      0x00d0: PHI (r0v21 com.superwall.sdk.models.internal.DeviceVendorId) = (r0v17 com.superwall.sdk.models.internal.DeviceVendorId), (r0v25 com.superwall.sdk.models.internal.DeviceVendorId) binds: [B:63:0x023d, B:19:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r1v12 java.lang.String) = (r1v9 java.lang.String), (r1v15 java.lang.String) binds: [B:63:0x023d, B:19:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r2v20 java.lang.Object) = (r2v19 java.lang.Object), (r2v1 java.lang.Object) binds: [B:63:0x023d, B:19:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r4v39 java.lang.String) = (r4v35 java.lang.String), (r4v44 java.lang.String) binds: [B:63:0x023d, B:19:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r6v8 java.util.List<com.superwall.sdk.models.entitlements.Redeemable>) = 
      (r6v5 java.util.List<com.superwall.sdk.models.entitlements.Redeemable>)
      (r6v11 java.util.List<com.superwall.sdk.models.entitlements.Redeemable>)
     binds: [B:63:0x023d, B:19:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r7v14 com.superwall.sdk.network.Network) = (r7v13 com.superwall.sdk.network.Network), (r7v17 com.superwall.sdk.network.Network) binds: [B:63:0x023d, B:19:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r8v4 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType) = (r8v3 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType), (r8v7 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType) binds: [B:63:0x023d, B:19:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r9v3 com.superwall.sdk.web.WebPaywallRedeemer) = (r9v1 com.superwall.sdk.web.WebPaywallRedeemer), (r9v6 com.superwall.sdk.web.WebPaywallRedeemer) binds: [B:63:0x023d, B:19:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e4 A[PHI: r0 r1 r2
      0x01e4: PHI (r0v6 com.superwall.sdk.web.WebPaywallRedeemer) = 
      (r0v0 com.superwall.sdk.web.WebPaywallRedeemer)
      (r0v2 com.superwall.sdk.web.WebPaywallRedeemer)
      (r0v2 com.superwall.sdk.web.WebPaywallRedeemer)
      (r0v9 com.superwall.sdk.web.WebPaywallRedeemer)
     binds: [B:37:0x0151, B:50:0x01c0, B:52:0x01e0, B:23:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r1v4 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType) = 
      (r1v0 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType)
      (r1v1 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType)
      (r1v1 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType)
      (r1v6 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType)
     binds: [B:37:0x0151, B:50:0x01c0, B:52:0x01e0, B:23:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r2v16 java.util.List<com.superwall.sdk.models.entitlements.Redeemable>) = 
      (r2v10 java.util.List<com.superwall.sdk.models.entitlements.Redeemable>)
      (r2v14 java.util.List<com.superwall.sdk.models.entitlements.Redeemable>)
      (r2v14 java.util.List<com.superwall.sdk.models.entitlements.Redeemable>)
      (r2v17 java.util.List<com.superwall.sdk.models.entitlements.Redeemable>)
     binds: [B:37:0x0151, B:50:0x01c0, B:52:0x01e0, B:23:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:60:0x020e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0214  */
    /* JADX WARN: Code duplicated, block: B:68:0x0269  */
    /* JADX WARN: Code duplicated, block: B:71:0x0274  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a1 A[PHI: r0 r1 r2 r4
      0x02a1: PHI (r0v31 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType$Code) = 
      (r0v26 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType$Code)
      (r0v35 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType$Code)
     binds: [B:72:0x029d, B:17:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r1v20 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType) = 
      (r1v16 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType)
      (r1v22 com.superwall.sdk.web.WebPaywallRedeemer$RedeemType)
     binds: [B:72:0x029d, B:17:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r2v32 com.superwall.sdk.models.internal.WebRedemptionResponse) = 
      (r2v31 com.superwall.sdk.models.internal.WebRedemptionResponse)
      (r2v34 com.superwall.sdk.models.internal.WebRedemptionResponse)
     binds: [B:72:0x029d, B:17:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r4v48 com.superwall.sdk.web.WebPaywallRedeemer) = (r4v45 com.superwall.sdk.web.WebPaywallRedeemer), (r4v50 com.superwall.sdk.web.WebPaywallRedeemer) binds: [B:72:0x029d, B:17:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:79:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:86:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:89:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:97:0x030e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0313  */
    @Nullable
    public final Object redeem(@NotNull RedeemType redeemType, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C27651 c27651;
        List<Redeemable> arrayList;
        boolean z10;
        Object objInvoke;
        List<Redeemable> allCodes;
        Function2<Trackable, kotlin.coroutines.d<? super Unit>, Object> function2;
        InternalSuperwallEvent.Restore restore;
        Function2<Trackable, kotlin.coroutines.d<? super Unit>, Object> function3;
        InternalSuperwallEvent.Redemptions redemptions;
        WebPaywallRedeemer webPaywallRedeemer;
        List<Redeemable> list;
        RedeemType redeemType2;
        Network network;
        UserId userIdInvoke;
        String strM33unboximpl;
        String strInvoke;
        DeviceVendorId deviceVendorIdInvoke;
        RedeemType redeemType3;
        WebPaywallRedeemer webPaywallRedeemer2;
        RedeemType.Code code;
        Object objMo61redeemTokenmylZ20U;
        WebPaywallRedeemer webPaywallRedeemer3;
        Either either;
        NetworkError networkError;
        Function2<Trackable, kotlin.coroutines.d<? super Unit>, Object> track;
        InternalSuperwallEvent.Redemptions redemptions2;
        NetworkError networkError2;
        WebRedemptionResponse webRedemptionResponse;
        Function2<Trackable, kotlin.coroutines.d<? super Unit>, Object> track2;
        InternalSuperwallEvent.Redemptions redemptions3;
        RedeemType.Code code2;
        String code3;
        List<RedemptionResult> codes;
        Iterator<T> it;
        List<RedemptionResult> codes2;
        Iterator<T> it2;
        Object obj;
        Object objInvoke2;
        Object next;
        RedeemType.Code code4;
        String code5;
        Function1<kotlin.coroutines.d<? super Unit>, Object> triggerRestoreInPaywall;
        WebPaywallRedeemer webPaywallRedeemer4;
        String localizedMessage;
        Object objInvoke3;
        Object obj2;
        WebPaywallRedeemer webPaywallRedeemer5;
        WebPaywallRedeemer webPaywallRedeemer6 = this;
        RedeemType redeemType4 = redeemType;
        if (dVar instanceof C27651) {
            c27651 = (C27651) dVar;
            int i10 = c27651.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27651.label = i10 - Integer.MIN_VALUE;
            } else {
                c27651 = webPaywallRedeemer6.new C27651(dVar);
            }
        } else {
            c27651 = webPaywallRedeemer6.new C27651(dVar);
        }
        C27651 c27652 = c27651;
        Object objInvoke4 = c27652.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        String str = "";
        switch (c27652.label) {
            case 0:
                ResultKt.m(objInvoke4);
                if (!webPaywallRedeemer6.isWebToAppEnabled.invoke().booleanValue()) {
                    return Unit.f312394a;
                }
                WebRedemptionResponse webRedemptionResponse2 = (WebRedemptionResponse) webPaywallRedeemer6.storage.read(LatestRedemptionResponse.INSTANCE);
                if (webRedemptionResponse2 == null || (allCodes = webRedemptionResponse2.getAllCodes()) == null || (arrayList = CollectionsKt.toMutableList((Collection) allCodes)) == null) {
                    arrayList = new ArrayList<>();
                }
                if (redeemType4 instanceof RedeemType.Code) {
                    webPaywallRedeemer6.willRedeemLink.invoke();
                    if (arrayList.isEmpty()) {
                        z10 = true;
                    } else {
                        List<Redeemable> list2 = arrayList;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((Redeemable) it3.next()).getCode());
                        }
                        z10 = !arrayList2.contains(((RedeemType.Code) redeemType4).getCode());
                    }
                    arrayList.add(new Redeemable(((RedeemType.Code) redeemType4).getCode(), kotlin.coroutines.jvm.internal.b.a(z10)));
                    Function1<kotlin.coroutines.d<? super Boolean>, Object> function1 = webPaywallRedeemer6.isPaywallVisible;
                    c27652.L$0 = webPaywallRedeemer6;
                    c27652.L$1 = redeemType4;
                    c27652.L$2 = arrayList;
                    c27652.label = 1;
                    objInvoke = function1.invoke(c27652);
                    if (objInvoke != objL) {
                        if (((Boolean) objInvoke).booleanValue()) {
                            function2 = webPaywallRedeemer6.track;
                            restore = new InternalSuperwallEvent.Restore(InternalSuperwallEvent.Restore.State.Start.INSTANCE, webPaywallRedeemer6.getPaywallInfo.invoke());
                            c27652.L$0 = webPaywallRedeemer6;
                            c27652.L$1 = redeemType4;
                            c27652.L$2 = arrayList;
                            c27652.label = 2;
                            if (function2.invoke(restore, c27652) != objL) {
                                function3 = webPaywallRedeemer6.track;
                                redemptions = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Start.INSTANCE, redeemType4);
                                c27652.L$0 = webPaywallRedeemer6;
                                c27652.L$1 = redeemType4;
                                c27652.L$2 = arrayList;
                                c27652.label = 3;
                                if (function3.invoke(redemptions, c27652) != objL) {
                                    webPaywallRedeemer = webPaywallRedeemer6;
                                    list = arrayList;
                                    redeemType2 = redeemType4;
                                    network = webPaywallRedeemer.network;
                                    userIdInvoke = webPaywallRedeemer.getUserId.invoke();
                                    if (userIdInvoke != null) {
                                        strM33unboximpl = userIdInvoke.m33unboximpl();
                                    } else {
                                        strM33unboximpl = null;
                                    }
                                    strInvoke = webPaywallRedeemer.getAliasId.invoke();
                                    deviceVendorIdInvoke = webPaywallRedeemer.getDeviceId.invoke();
                                    Function1<kotlin.coroutines.d<? super List<TransactionReceipt>>, Object> function4 = webPaywallRedeemer.receipts;
                                    c27652.L$0 = webPaywallRedeemer;
                                    c27652.L$1 = redeemType2;
                                    c27652.L$2 = network;
                                    c27652.L$3 = list;
                                    c27652.L$4 = strM33unboximpl;
                                    c27652.L$5 = strInvoke;
                                    c27652.L$6 = deviceVendorIdInvoke;
                                    c27652.label = 4;
                                    objInvoke4 = function4.invoke(c27652);
                                    if (objInvoke4 != objL) {
                                        RedeemType redeemType5 = redeemType2;
                                        DeviceVendorId deviceVendorId = deviceVendorIdInvoke;
                                        List<Redeemable> list3 = list;
                                        String str2 = strM33unboximpl;
                                        Network network2 = network;
                                        String str3 = strInvoke;
                                        redeemType3 = redeemType5;
                                        String strInvoke2 = webPaywallRedeemer.getExternalAccountId.invoke();
                                        c27652.L$0 = webPaywallRedeemer;
                                        c27652.L$1 = redeemType3;
                                        c27652.L$2 = null;
                                        c27652.L$3 = null;
                                        c27652.L$4 = null;
                                        c27652.L$5 = null;
                                        c27652.L$6 = null;
                                        c27652.label = 5;
                                        webPaywallRedeemer2 = webPaywallRedeemer;
                                        code = null;
                                        objMo61redeemTokenmylZ20U = network2.mo61redeemTokenmylZ20U(list3, str2, str3, deviceVendorId, (List) objInvoke4, strInvoke2, c27652);
                                        if (objMo61redeemTokenmylZ20U != objL) {
                                            webPaywallRedeemer3 = webPaywallRedeemer2;
                                            objInvoke4 = objMo61redeemTokenmylZ20U;
                                            either = (Either) objInvoke4;
                                            if (either instanceof Either.Success) {
                                                webRedemptionResponse = (WebRedemptionResponse) ((Either.Success) either).getValue();
                                                webPaywallRedeemer3.getStorage().write(LatestRedemptionResponse.INSTANCE, webRedemptionResponse);
                                                track2 = webPaywallRedeemer3.getTrack();
                                                redemptions3 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Complete.INSTANCE, redeemType3);
                                                c27652.L$0 = webPaywallRedeemer3;
                                                c27652.L$1 = redeemType3;
                                                c27652.L$2 = webRedemptionResponse;
                                                c27652.label = 6;
                                                if (track2.invoke(redemptions3, c27652) != objL) {
                                                    if (redeemType3 instanceof RedeemType.Code) {
                                                        Logger logger = Logger.INSTANCE;
                                                        LogLevel logLevel = LogLevel.debug;
                                                        LogScope logScope = LogScope.webEntitlements;
                                                        if (redeemType3 != null) {
                                                            code2 = (RedeemType.Code) redeemType3;
                                                        } else {
                                                            code2 = code;
                                                        }
                                                        if (code2 != null || (code3 = code2.getCode()) == null) {
                                                            code3 = "";
                                                        }
                                                        Logger.debug$default(logger, logLevel, logScope, "Entitlement redemption done", MapsKt.mapOf(TuplesKt.to("code", code3)), null, 16, null);
                                                        codes = webRedemptionResponse.getCodes();
                                                        if ((codes instanceof Collection) || !codes.isEmpty()) {
                                                            it = codes.iterator();
                                                            while (true) {
                                                                if (!it.hasNext()) {
                                                                    if (redeemType3 != null) {
                                                                        code4 = (RedeemType.Code) redeemType3;
                                                                    } else {
                                                                        code4 = code;
                                                                    }
                                                                    if (code4 != null && (code5 = code4.getCode()) != null) {
                                                                        str = code5;
                                                                    }
                                                                    codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                                } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                                    codes2 = webRedemptionResponse.getCodes();
                                                                }
                                                            }
                                                        } else {
                                                            if (redeemType3 != null) {
                                                                code4 = (RedeemType.Code) redeemType3;
                                                            } else {
                                                                code4 = code;
                                                            }
                                                            if (code4 != null) {
                                                                str = code5;
                                                            }
                                                            codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                        }
                                                        it2 = codes2.iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                next = it2.next();
                                                                if (Intrinsics.areEqual(((RedemptionResult) next).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                                    obj = next;
                                                                }
                                                            } else {
                                                                obj = code;
                                                            }
                                                        }
                                                        if (((RedemptionResult) obj) != null) {
                                                            Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible = webPaywallRedeemer3.isPaywallVisible();
                                                            c27652.L$0 = webPaywallRedeemer3;
                                                            c27652.L$1 = redeemType3;
                                                            c27652.L$2 = webRedemptionResponse;
                                                            c27652.label = 7;
                                                            objInvoke2 = function1IsPaywallVisible.invoke(c27652);
                                                            if (objInvoke2 != objL) {
                                                                if (((Boolean) objInvoke2).booleanValue()) {
                                                                    if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                                                                        triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                                                                        c27652.L$0 = webPaywallRedeemer3;
                                                                        c27652.L$1 = redeemType3;
                                                                        c27652.L$2 = webRedemptionResponse;
                                                                        c27652.label = 8;
                                                                        if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                                                                            webPaywallRedeemer4 = webPaywallRedeemer3;
                                                                            webPaywallRedeemer3 = webPaywallRedeemer4;
                                                                        }
                                                                    } else {
                                                                        webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                                        return Unit.f312394a;
                                                    }
                                                    if (!Intrinsics.areEqual(redeemType3, RedeemType.Existing.INSTANCE)) {
                                                        throw new k0();
                                                    }
                                                    webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                                                    if (redeemType3 instanceof RedeemType.Code) {
                                                        for (RedemptionResult redemptionResult : webRedemptionResponse.getCodes()) {
                                                            if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                                webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                                                            }
                                                        }
                                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                    }
                                                    startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                                    return Unit.f312394a;
                                                }
                                            } else {
                                                if (!(either instanceof Either.Failure)) {
                                                    throw new k0();
                                                }
                                                networkError = (NetworkError) ((Either.Failure) either).getError();
                                                track = webPaywallRedeemer3.getTrack();
                                                redemptions2 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Fail.INSTANCE, redeemType3);
                                                c27652.L$0 = webPaywallRedeemer3;
                                                c27652.L$1 = redeemType3;
                                                c27652.L$2 = networkError;
                                                c27652.label = 9;
                                                if (track.invoke(redemptions2, c27652) != objL) {
                                                    networkError2 = networkError;
                                                    if (redeemType3 instanceof RedeemType.Code) {
                                                        localizedMessage = networkError2.getLocalizedMessage();
                                                        if (localizedMessage == null && (localizedMessage = networkError2.getMessage()) == null) {
                                                            localizedMessage = "Redemption failed, error unknown";
                                                        }
                                                        RedeemType.Code code6 = (RedeemType.Code) redeemType3;
                                                        Logger.INSTANCE.debug(LogLevel.error, LogScope.webEntitlements, "Failed to redeem purchase token", MapsKt.mapOf(TuplesKt.to("code", code6.getCode())), networkError2);
                                                        Function1<RedemptionResult, Unit> didRedeemLink = webPaywallRedeemer3.getDidRedeemLink();
                                                        String code7 = code6.getCode();
                                                        didRedeemLink.invoke(new RedemptionResult.Error(code7 != null ? code7 : "", new ErrorInfo(localizedMessage)));
                                                        Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible2 = webPaywallRedeemer3.isPaywallVisible();
                                                        c27652.L$0 = webPaywallRedeemer3;
                                                        c27652.L$1 = localizedMessage;
                                                        c27652.L$2 = code;
                                                        c27652.label = 10;
                                                        objInvoke3 = function1IsPaywallVisible2.invoke(c27652);
                                                        if (objInvoke3 != objL) {
                                                            obj2 = objInvoke3;
                                                            webPaywallRedeemer5 = webPaywallRedeemer3;
                                                            if (((Boolean) obj2).booleanValue()) {
                                                                webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                                                            }
                                                            webPaywallRedeemer3 = webPaywallRedeemer5;
                                                        }
                                                    }
                                                    startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                                    return Unit.f312394a;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            function3 = webPaywallRedeemer6.track;
                            redemptions = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Start.INSTANCE, redeemType4);
                            c27652.L$0 = webPaywallRedeemer6;
                            c27652.L$1 = redeemType4;
                            c27652.L$2 = arrayList;
                            c27652.label = 3;
                            if (function3.invoke(redemptions, c27652) != objL) {
                                webPaywallRedeemer = webPaywallRedeemer6;
                                list = arrayList;
                                redeemType2 = redeemType4;
                                network = webPaywallRedeemer.network;
                                userIdInvoke = webPaywallRedeemer.getUserId.invoke();
                                if (userIdInvoke != null) {
                                    strM33unboximpl = userIdInvoke.m33unboximpl();
                                } else {
                                    strM33unboximpl = null;
                                }
                                strInvoke = webPaywallRedeemer.getAliasId.invoke();
                                deviceVendorIdInvoke = webPaywallRedeemer.getDeviceId.invoke();
                                Function1<kotlin.coroutines.d<? super List<TransactionReceipt>>, Object> function5 = webPaywallRedeemer.receipts;
                                c27652.L$0 = webPaywallRedeemer;
                                c27652.L$1 = redeemType2;
                                c27652.L$2 = network;
                                c27652.L$3 = list;
                                c27652.L$4 = strM33unboximpl;
                                c27652.L$5 = strInvoke;
                                c27652.L$6 = deviceVendorIdInvoke;
                                c27652.label = 4;
                                objInvoke4 = function5.invoke(c27652);
                                if (objInvoke4 != objL) {
                                    RedeemType redeemType6 = redeemType2;
                                    DeviceVendorId deviceVendorId2 = deviceVendorIdInvoke;
                                    List<Redeemable> list4 = list;
                                    String str4 = strM33unboximpl;
                                    Network network3 = network;
                                    String str5 = strInvoke;
                                    redeemType3 = redeemType6;
                                    String strInvoke3 = webPaywallRedeemer.getExternalAccountId.invoke();
                                    c27652.L$0 = webPaywallRedeemer;
                                    c27652.L$1 = redeemType3;
                                    c27652.L$2 = null;
                                    c27652.L$3 = null;
                                    c27652.L$4 = null;
                                    c27652.L$5 = null;
                                    c27652.L$6 = null;
                                    c27652.label = 5;
                                    webPaywallRedeemer2 = webPaywallRedeemer;
                                    code = null;
                                    objMo61redeemTokenmylZ20U = network3.mo61redeemTokenmylZ20U(list4, str4, str5, deviceVendorId2, (List) objInvoke4, strInvoke3, c27652);
                                    if (objMo61redeemTokenmylZ20U != objL) {
                                        webPaywallRedeemer3 = webPaywallRedeemer2;
                                        objInvoke4 = objMo61redeemTokenmylZ20U;
                                        either = (Either) objInvoke4;
                                        if (either instanceof Either.Success) {
                                            webRedemptionResponse = (WebRedemptionResponse) ((Either.Success) either).getValue();
                                            webPaywallRedeemer3.getStorage().write(LatestRedemptionResponse.INSTANCE, webRedemptionResponse);
                                            track2 = webPaywallRedeemer3.getTrack();
                                            redemptions3 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Complete.INSTANCE, redeemType3);
                                            c27652.L$0 = webPaywallRedeemer3;
                                            c27652.L$1 = redeemType3;
                                            c27652.L$2 = webRedemptionResponse;
                                            c27652.label = 6;
                                            if (track2.invoke(redemptions3, c27652) != objL) {
                                                if (redeemType3 instanceof RedeemType.Code) {
                                                    Logger logger2 = Logger.INSTANCE;
                                                    LogLevel logLevel2 = LogLevel.debug;
                                                    LogScope logScope2 = LogScope.webEntitlements;
                                                    if (redeemType3 != null) {
                                                        code2 = (RedeemType.Code) redeemType3;
                                                    } else {
                                                        code2 = code;
                                                    }
                                                    if (code2 != null) {
                                                        code3 = "";
                                                    } else {
                                                        code3 = "";
                                                    }
                                                    Logger.debug$default(logger2, logLevel2, logScope2, "Entitlement redemption done", MapsKt.mapOf(TuplesKt.to("code", code3)), null, 16, null);
                                                    codes = webRedemptionResponse.getCodes();
                                                    if (codes instanceof Collection) {
                                                        it = codes.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                if (redeemType3 != null) {
                                                                    code4 = (RedeemType.Code) redeemType3;
                                                                } else {
                                                                    code4 = code;
                                                                }
                                                                if (code4 != null) {
                                                                    str = code5;
                                                                }
                                                                codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                            } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                                codes2 = webRedemptionResponse.getCodes();
                                                            }
                                                        }
                                                    } else {
                                                        it = codes.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                if (redeemType3 != null) {
                                                                    code4 = (RedeemType.Code) redeemType3;
                                                                } else {
                                                                    code4 = code;
                                                                }
                                                                if (code4 != null) {
                                                                    str = code5;
                                                                }
                                                                codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                            } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                                codes2 = webRedemptionResponse.getCodes();
                                                            }
                                                        }
                                                    }
                                                    it2 = codes2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            next = it2.next();
                                                            if (Intrinsics.areEqual(((RedemptionResult) next).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                                obj = next;
                                                            }
                                                        } else {
                                                            obj = code;
                                                        }
                                                    }
                                                    if (((RedemptionResult) obj) != null) {
                                                        Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible3 = webPaywallRedeemer3.isPaywallVisible();
                                                        c27652.L$0 = webPaywallRedeemer3;
                                                        c27652.L$1 = redeemType3;
                                                        c27652.L$2 = webRedemptionResponse;
                                                        c27652.label = 7;
                                                        objInvoke2 = function1IsPaywallVisible3.invoke(c27652);
                                                        if (objInvoke2 != objL) {
                                                            if (((Boolean) objInvoke2).booleanValue()) {
                                                                if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                                                                    triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                                                                    c27652.L$0 = webPaywallRedeemer3;
                                                                    c27652.L$1 = redeemType3;
                                                                    c27652.L$2 = webRedemptionResponse;
                                                                    c27652.label = 8;
                                                                    if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                                                                        webPaywallRedeemer4 = webPaywallRedeemer3;
                                                                        webPaywallRedeemer3 = webPaywallRedeemer4;
                                                                    }
                                                                } else {
                                                                    webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                                                                }
                                                            }
                                                        }
                                                    }
                                                    startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                                    return Unit.f312394a;
                                                }
                                                if (!Intrinsics.areEqual(redeemType3, RedeemType.Existing.INSTANCE)) {
                                                    throw new k0();
                                                }
                                                webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                                                if (redeemType3 instanceof RedeemType.Code) {
                                                    while (r2.hasNext()) {
                                                        if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                            webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                                                        }
                                                    }
                                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                }
                                                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                                return Unit.f312394a;
                                            }
                                        } else {
                                            if (!(either instanceof Either.Failure)) {
                                                throw new k0();
                                            }
                                            networkError = (NetworkError) ((Either.Failure) either).getError();
                                            track = webPaywallRedeemer3.getTrack();
                                            redemptions2 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Fail.INSTANCE, redeemType3);
                                            c27652.L$0 = webPaywallRedeemer3;
                                            c27652.L$1 = redeemType3;
                                            c27652.L$2 = networkError;
                                            c27652.label = 9;
                                            if (track.invoke(redemptions2, c27652) != objL) {
                                                networkError2 = networkError;
                                                if (redeemType3 instanceof RedeemType.Code) {
                                                    localizedMessage = networkError2.getLocalizedMessage();
                                                    if (localizedMessage == null) {
                                                        localizedMessage = "Redemption failed, error unknown";
                                                    }
                                                    RedeemType.Code code8 = (RedeemType.Code) redeemType3;
                                                    Logger.INSTANCE.debug(LogLevel.error, LogScope.webEntitlements, "Failed to redeem purchase token", MapsKt.mapOf(TuplesKt.to("code", code8.getCode())), networkError2);
                                                    Function1<RedemptionResult, Unit> didRedeemLink2 = webPaywallRedeemer3.getDidRedeemLink();
                                                    String code9 = code8.getCode();
                                                    didRedeemLink2.invoke(new RedemptionResult.Error(code9 != null ? code9 : "", new ErrorInfo(localizedMessage)));
                                                    Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible4 = webPaywallRedeemer3.isPaywallVisible();
                                                    c27652.L$0 = webPaywallRedeemer3;
                                                    c27652.L$1 = localizedMessage;
                                                    c27652.L$2 = code;
                                                    c27652.label = 10;
                                                    objInvoke3 = function1IsPaywallVisible4.invoke(c27652);
                                                    if (objInvoke3 != objL) {
                                                        obj2 = objInvoke3;
                                                        webPaywallRedeemer5 = webPaywallRedeemer3;
                                                        if (((Boolean) obj2).booleanValue()) {
                                                            webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                                                        }
                                                        webPaywallRedeemer3 = webPaywallRedeemer5;
                                                    }
                                                }
                                                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                                return Unit.f312394a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    function3 = webPaywallRedeemer6.track;
                    redemptions = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Start.INSTANCE, redeemType4);
                    c27652.L$0 = webPaywallRedeemer6;
                    c27652.L$1 = redeemType4;
                    c27652.L$2 = arrayList;
                    c27652.label = 3;
                    if (function3.invoke(redemptions, c27652) != objL) {
                        webPaywallRedeemer = webPaywallRedeemer6;
                        list = arrayList;
                        redeemType2 = redeemType4;
                        network = webPaywallRedeemer.network;
                        userIdInvoke = webPaywallRedeemer.getUserId.invoke();
                        if (userIdInvoke != null) {
                            strM33unboximpl = userIdInvoke.m33unboximpl();
                        } else {
                            strM33unboximpl = null;
                        }
                        strInvoke = webPaywallRedeemer.getAliasId.invoke();
                        deviceVendorIdInvoke = webPaywallRedeemer.getDeviceId.invoke();
                        Function1<kotlin.coroutines.d<? super List<TransactionReceipt>>, Object> function6 = webPaywallRedeemer.receipts;
                        c27652.L$0 = webPaywallRedeemer;
                        c27652.L$1 = redeemType2;
                        c27652.L$2 = network;
                        c27652.L$3 = list;
                        c27652.L$4 = strM33unboximpl;
                        c27652.L$5 = strInvoke;
                        c27652.L$6 = deviceVendorIdInvoke;
                        c27652.label = 4;
                        objInvoke4 = function6.invoke(c27652);
                        if (objInvoke4 != objL) {
                            RedeemType redeemType7 = redeemType2;
                            DeviceVendorId deviceVendorId3 = deviceVendorIdInvoke;
                            List<Redeemable> list5 = list;
                            String str6 = strM33unboximpl;
                            Network network4 = network;
                            String str7 = strInvoke;
                            redeemType3 = redeemType7;
                            String strInvoke4 = webPaywallRedeemer.getExternalAccountId.invoke();
                            c27652.L$0 = webPaywallRedeemer;
                            c27652.L$1 = redeemType3;
                            c27652.L$2 = null;
                            c27652.L$3 = null;
                            c27652.L$4 = null;
                            c27652.L$5 = null;
                            c27652.L$6 = null;
                            c27652.label = 5;
                            webPaywallRedeemer2 = webPaywallRedeemer;
                            code = null;
                            objMo61redeemTokenmylZ20U = network4.mo61redeemTokenmylZ20U(list5, str6, str7, deviceVendorId3, (List) objInvoke4, strInvoke4, c27652);
                            if (objMo61redeemTokenmylZ20U != objL) {
                                webPaywallRedeemer3 = webPaywallRedeemer2;
                                objInvoke4 = objMo61redeemTokenmylZ20U;
                                either = (Either) objInvoke4;
                                if (either instanceof Either.Success) {
                                    webRedemptionResponse = (WebRedemptionResponse) ((Either.Success) either).getValue();
                                    webPaywallRedeemer3.getStorage().write(LatestRedemptionResponse.INSTANCE, webRedemptionResponse);
                                    track2 = webPaywallRedeemer3.getTrack();
                                    redemptions3 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Complete.INSTANCE, redeemType3);
                                    c27652.L$0 = webPaywallRedeemer3;
                                    c27652.L$1 = redeemType3;
                                    c27652.L$2 = webRedemptionResponse;
                                    c27652.label = 6;
                                    if (track2.invoke(redemptions3, c27652) != objL) {
                                        if (redeemType3 instanceof RedeemType.Code) {
                                            Logger logger3 = Logger.INSTANCE;
                                            LogLevel logLevel3 = LogLevel.debug;
                                            LogScope logScope3 = LogScope.webEntitlements;
                                            if (redeemType3 != null) {
                                                code2 = (RedeemType.Code) redeemType3;
                                            } else {
                                                code2 = code;
                                            }
                                            if (code2 != null) {
                                                code3 = "";
                                            } else {
                                                code3 = "";
                                            }
                                            Logger.debug$default(logger3, logLevel3, logScope3, "Entitlement redemption done", MapsKt.mapOf(TuplesKt.to("code", code3)), null, 16, null);
                                            codes = webRedemptionResponse.getCodes();
                                            if (codes instanceof Collection) {
                                                it = codes.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        if (redeemType3 != null) {
                                                            code4 = (RedeemType.Code) redeemType3;
                                                        } else {
                                                            code4 = code;
                                                        }
                                                        if (code4 != null) {
                                                            str = code5;
                                                        }
                                                        codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                    } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                        codes2 = webRedemptionResponse.getCodes();
                                                    }
                                                }
                                            } else {
                                                it = codes.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        if (redeemType3 != null) {
                                                            code4 = (RedeemType.Code) redeemType3;
                                                        } else {
                                                            code4 = code;
                                                        }
                                                        if (code4 != null) {
                                                            str = code5;
                                                        }
                                                        codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                    } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                        codes2 = webRedemptionResponse.getCodes();
                                                    }
                                                }
                                            }
                                            it2 = codes2.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next = it2.next();
                                                    if (Intrinsics.areEqual(((RedemptionResult) next).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                        obj = next;
                                                    }
                                                } else {
                                                    obj = code;
                                                }
                                            }
                                            if (((RedemptionResult) obj) != null) {
                                                Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible5 = webPaywallRedeemer3.isPaywallVisible();
                                                c27652.L$0 = webPaywallRedeemer3;
                                                c27652.L$1 = redeemType3;
                                                c27652.L$2 = webRedemptionResponse;
                                                c27652.label = 7;
                                                objInvoke2 = function1IsPaywallVisible5.invoke(c27652);
                                                if (objInvoke2 != objL) {
                                                    if (((Boolean) objInvoke2).booleanValue()) {
                                                        if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                                                            triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                                                            c27652.L$0 = webPaywallRedeemer3;
                                                            c27652.L$1 = redeemType3;
                                                            c27652.L$2 = webRedemptionResponse;
                                                            c27652.label = 8;
                                                            if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                                                                webPaywallRedeemer4 = webPaywallRedeemer3;
                                                                webPaywallRedeemer3 = webPaywallRedeemer4;
                                                            }
                                                        } else {
                                                            webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                                                        }
                                                    }
                                                }
                                            }
                                            startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                            return Unit.f312394a;
                                        }
                                        if (!Intrinsics.areEqual(redeemType3, RedeemType.Existing.INSTANCE)) {
                                            throw new k0();
                                        }
                                        webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                                        if (redeemType3 instanceof RedeemType.Code) {
                                            while (r2.hasNext()) {
                                                if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                    webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                        return Unit.f312394a;
                                    }
                                } else {
                                    if (!(either instanceof Either.Failure)) {
                                        throw new k0();
                                    }
                                    networkError = (NetworkError) ((Either.Failure) either).getError();
                                    track = webPaywallRedeemer3.getTrack();
                                    redemptions2 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Fail.INSTANCE, redeemType3);
                                    c27652.L$0 = webPaywallRedeemer3;
                                    c27652.L$1 = redeemType3;
                                    c27652.L$2 = networkError;
                                    c27652.label = 9;
                                    if (track.invoke(redemptions2, c27652) != objL) {
                                        networkError2 = networkError;
                                        if (redeemType3 instanceof RedeemType.Code) {
                                            localizedMessage = networkError2.getLocalizedMessage();
                                            if (localizedMessage == null) {
                                                localizedMessage = "Redemption failed, error unknown";
                                            }
                                            RedeemType.Code code10 = (RedeemType.Code) redeemType3;
                                            Logger.INSTANCE.debug(LogLevel.error, LogScope.webEntitlements, "Failed to redeem purchase token", MapsKt.mapOf(TuplesKt.to("code", code10.getCode())), networkError2);
                                            Function1<RedemptionResult, Unit> didRedeemLink3 = webPaywallRedeemer3.getDidRedeemLink();
                                            String code11 = code10.getCode();
                                            didRedeemLink3.invoke(new RedemptionResult.Error(code11 != null ? code11 : "", new ErrorInfo(localizedMessage)));
                                            Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible6 = webPaywallRedeemer3.isPaywallVisible();
                                            c27652.L$0 = webPaywallRedeemer3;
                                            c27652.L$1 = localizedMessage;
                                            c27652.L$2 = code;
                                            c27652.label = 10;
                                            objInvoke3 = function1IsPaywallVisible6.invoke(c27652);
                                            if (objInvoke3 != objL) {
                                                obj2 = objInvoke3;
                                                webPaywallRedeemer5 = webPaywallRedeemer3;
                                                if (((Boolean) obj2).booleanValue()) {
                                                    webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                                                }
                                                webPaywallRedeemer3 = webPaywallRedeemer5;
                                            }
                                        }
                                        startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                        return Unit.f312394a;
                                    }
                                }
                            }
                        }
                    }
                }
                return objL;
            case 1:
                List<Redeemable> list6 = (List) c27652.L$2;
                redeemType4 = (RedeemType) c27652.L$1;
                WebPaywallRedeemer webPaywallRedeemer7 = (WebPaywallRedeemer) c27652.L$0;
                ResultKt.m(objInvoke4);
                arrayList = list6;
                webPaywallRedeemer6 = webPaywallRedeemer7;
                objInvoke = objInvoke4;
                if (((Boolean) objInvoke).booleanValue()) {
                    function2 = webPaywallRedeemer6.track;
                    restore = new InternalSuperwallEvent.Restore(InternalSuperwallEvent.Restore.State.Start.INSTANCE, webPaywallRedeemer6.getPaywallInfo.invoke());
                    c27652.L$0 = webPaywallRedeemer6;
                    c27652.L$1 = redeemType4;
                    c27652.L$2 = arrayList;
                    c27652.label = 2;
                    if (function2.invoke(restore, c27652) != objL) {
                        function3 = webPaywallRedeemer6.track;
                        redemptions = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Start.INSTANCE, redeemType4);
                        c27652.L$0 = webPaywallRedeemer6;
                        c27652.L$1 = redeemType4;
                        c27652.L$2 = arrayList;
                        c27652.label = 3;
                        if (function3.invoke(redemptions, c27652) != objL) {
                            webPaywallRedeemer = webPaywallRedeemer6;
                            list = arrayList;
                            redeemType2 = redeemType4;
                            network = webPaywallRedeemer.network;
                            userIdInvoke = webPaywallRedeemer.getUserId.invoke();
                            if (userIdInvoke != null) {
                                strM33unboximpl = userIdInvoke.m33unboximpl();
                            } else {
                                strM33unboximpl = null;
                            }
                            strInvoke = webPaywallRedeemer.getAliasId.invoke();
                            deviceVendorIdInvoke = webPaywallRedeemer.getDeviceId.invoke();
                            Function1<kotlin.coroutines.d<? super List<TransactionReceipt>>, Object> function7 = webPaywallRedeemer.receipts;
                            c27652.L$0 = webPaywallRedeemer;
                            c27652.L$1 = redeemType2;
                            c27652.L$2 = network;
                            c27652.L$3 = list;
                            c27652.L$4 = strM33unboximpl;
                            c27652.L$5 = strInvoke;
                            c27652.L$6 = deviceVendorIdInvoke;
                            c27652.label = 4;
                            objInvoke4 = function7.invoke(c27652);
                            if (objInvoke4 != objL) {
                                RedeemType redeemType8 = redeemType2;
                                DeviceVendorId deviceVendorId4 = deviceVendorIdInvoke;
                                List<Redeemable> list7 = list;
                                String str8 = strM33unboximpl;
                                Network network5 = network;
                                String str9 = strInvoke;
                                redeemType3 = redeemType8;
                                String strInvoke5 = webPaywallRedeemer.getExternalAccountId.invoke();
                                c27652.L$0 = webPaywallRedeemer;
                                c27652.L$1 = redeemType3;
                                c27652.L$2 = null;
                                c27652.L$3 = null;
                                c27652.L$4 = null;
                                c27652.L$5 = null;
                                c27652.L$6 = null;
                                c27652.label = 5;
                                webPaywallRedeemer2 = webPaywallRedeemer;
                                code = null;
                                objMo61redeemTokenmylZ20U = network5.mo61redeemTokenmylZ20U(list7, str8, str9, deviceVendorId4, (List) objInvoke4, strInvoke5, c27652);
                                if (objMo61redeemTokenmylZ20U != objL) {
                                    webPaywallRedeemer3 = webPaywallRedeemer2;
                                    objInvoke4 = objMo61redeemTokenmylZ20U;
                                    either = (Either) objInvoke4;
                                    if (either instanceof Either.Success) {
                                        webRedemptionResponse = (WebRedemptionResponse) ((Either.Success) either).getValue();
                                        webPaywallRedeemer3.getStorage().write(LatestRedemptionResponse.INSTANCE, webRedemptionResponse);
                                        track2 = webPaywallRedeemer3.getTrack();
                                        redemptions3 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Complete.INSTANCE, redeemType3);
                                        c27652.L$0 = webPaywallRedeemer3;
                                        c27652.L$1 = redeemType3;
                                        c27652.L$2 = webRedemptionResponse;
                                        c27652.label = 6;
                                        if (track2.invoke(redemptions3, c27652) != objL) {
                                            if (redeemType3 instanceof RedeemType.Code) {
                                                Logger logger4 = Logger.INSTANCE;
                                                LogLevel logLevel4 = LogLevel.debug;
                                                LogScope logScope4 = LogScope.webEntitlements;
                                                if (redeemType3 != null) {
                                                    code2 = (RedeemType.Code) redeemType3;
                                                } else {
                                                    code2 = code;
                                                }
                                                if (code2 != null) {
                                                    code3 = "";
                                                } else {
                                                    code3 = "";
                                                }
                                                Logger.debug$default(logger4, logLevel4, logScope4, "Entitlement redemption done", MapsKt.mapOf(TuplesKt.to("code", code3)), null, 16, null);
                                                codes = webRedemptionResponse.getCodes();
                                                if (codes instanceof Collection) {
                                                    it = codes.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            if (redeemType3 != null) {
                                                                code4 = (RedeemType.Code) redeemType3;
                                                            } else {
                                                                code4 = code;
                                                            }
                                                            if (code4 != null) {
                                                                str = code5;
                                                            }
                                                            codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                        } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                            codes2 = webRedemptionResponse.getCodes();
                                                        }
                                                    }
                                                } else {
                                                    it = codes.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            if (redeemType3 != null) {
                                                                code4 = (RedeemType.Code) redeemType3;
                                                            } else {
                                                                code4 = code;
                                                            }
                                                            if (code4 != null) {
                                                                str = code5;
                                                            }
                                                            codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                        } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                            codes2 = webRedemptionResponse.getCodes();
                                                        }
                                                    }
                                                }
                                                it2 = codes2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        if (Intrinsics.areEqual(((RedemptionResult) next).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                            obj = next;
                                                        }
                                                    } else {
                                                        obj = code;
                                                    }
                                                }
                                                if (((RedemptionResult) obj) != null) {
                                                    Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible7 = webPaywallRedeemer3.isPaywallVisible();
                                                    c27652.L$0 = webPaywallRedeemer3;
                                                    c27652.L$1 = redeemType3;
                                                    c27652.L$2 = webRedemptionResponse;
                                                    c27652.label = 7;
                                                    objInvoke2 = function1IsPaywallVisible7.invoke(c27652);
                                                    if (objInvoke2 != objL) {
                                                        if (((Boolean) objInvoke2).booleanValue()) {
                                                            if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                                                                triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                                                                c27652.L$0 = webPaywallRedeemer3;
                                                                c27652.L$1 = redeemType3;
                                                                c27652.L$2 = webRedemptionResponse;
                                                                c27652.label = 8;
                                                                if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                                                                    webPaywallRedeemer4 = webPaywallRedeemer3;
                                                                    webPaywallRedeemer3 = webPaywallRedeemer4;
                                                                }
                                                            } else {
                                                                webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                                                            }
                                                        }
                                                    }
                                                }
                                                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                                return Unit.f312394a;
                                            }
                                            if (!Intrinsics.areEqual(redeemType3, RedeemType.Existing.INSTANCE)) {
                                                throw new k0();
                                            }
                                            webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                                            if (redeemType3 instanceof RedeemType.Code) {
                                                while (r2.hasNext()) {
                                                    if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                        webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                                                    }
                                                }
                                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                            }
                                            startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                            return Unit.f312394a;
                                        }
                                    } else {
                                        if (!(either instanceof Either.Failure)) {
                                            throw new k0();
                                        }
                                        networkError = (NetworkError) ((Either.Failure) either).getError();
                                        track = webPaywallRedeemer3.getTrack();
                                        redemptions2 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Fail.INSTANCE, redeemType3);
                                        c27652.L$0 = webPaywallRedeemer3;
                                        c27652.L$1 = redeemType3;
                                        c27652.L$2 = networkError;
                                        c27652.label = 9;
                                        if (track.invoke(redemptions2, c27652) != objL) {
                                            networkError2 = networkError;
                                            if (redeemType3 instanceof RedeemType.Code) {
                                                localizedMessage = networkError2.getLocalizedMessage();
                                                if (localizedMessage == null) {
                                                    localizedMessage = "Redemption failed, error unknown";
                                                }
                                                RedeemType.Code code12 = (RedeemType.Code) redeemType3;
                                                Logger.INSTANCE.debug(LogLevel.error, LogScope.webEntitlements, "Failed to redeem purchase token", MapsKt.mapOf(TuplesKt.to("code", code12.getCode())), networkError2);
                                                Function1<RedemptionResult, Unit> didRedeemLink4 = webPaywallRedeemer3.getDidRedeemLink();
                                                String code13 = code12.getCode();
                                                didRedeemLink4.invoke(new RedemptionResult.Error(code13 != null ? code13 : "", new ErrorInfo(localizedMessage)));
                                                Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible8 = webPaywallRedeemer3.isPaywallVisible();
                                                c27652.L$0 = webPaywallRedeemer3;
                                                c27652.L$1 = localizedMessage;
                                                c27652.L$2 = code;
                                                c27652.label = 10;
                                                objInvoke3 = function1IsPaywallVisible8.invoke(c27652);
                                                if (objInvoke3 != objL) {
                                                    obj2 = objInvoke3;
                                                    webPaywallRedeemer5 = webPaywallRedeemer3;
                                                    if (((Boolean) obj2).booleanValue()) {
                                                        webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                                                    }
                                                    webPaywallRedeemer3 = webPaywallRedeemer5;
                                                }
                                            }
                                            startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                            return Unit.f312394a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    function3 = webPaywallRedeemer6.track;
                    redemptions = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Start.INSTANCE, redeemType4);
                    c27652.L$0 = webPaywallRedeemer6;
                    c27652.L$1 = redeemType4;
                    c27652.L$2 = arrayList;
                    c27652.label = 3;
                    if (function3.invoke(redemptions, c27652) != objL) {
                        webPaywallRedeemer = webPaywallRedeemer6;
                        list = arrayList;
                        redeemType2 = redeemType4;
                        network = webPaywallRedeemer.network;
                        userIdInvoke = webPaywallRedeemer.getUserId.invoke();
                        if (userIdInvoke != null) {
                            strM33unboximpl = userIdInvoke.m33unboximpl();
                        } else {
                            strM33unboximpl = null;
                        }
                        strInvoke = webPaywallRedeemer.getAliasId.invoke();
                        deviceVendorIdInvoke = webPaywallRedeemer.getDeviceId.invoke();
                        Function1<kotlin.coroutines.d<? super List<TransactionReceipt>>, Object> function8 = webPaywallRedeemer.receipts;
                        c27652.L$0 = webPaywallRedeemer;
                        c27652.L$1 = redeemType2;
                        c27652.L$2 = network;
                        c27652.L$3 = list;
                        c27652.L$4 = strM33unboximpl;
                        c27652.L$5 = strInvoke;
                        c27652.L$6 = deviceVendorIdInvoke;
                        c27652.label = 4;
                        objInvoke4 = function8.invoke(c27652);
                        if (objInvoke4 != objL) {
                            RedeemType redeemType9 = redeemType2;
                            DeviceVendorId deviceVendorId5 = deviceVendorIdInvoke;
                            List<Redeemable> list8 = list;
                            String str10 = strM33unboximpl;
                            Network network6 = network;
                            String str11 = strInvoke;
                            redeemType3 = redeemType9;
                            String strInvoke6 = webPaywallRedeemer.getExternalAccountId.invoke();
                            c27652.L$0 = webPaywallRedeemer;
                            c27652.L$1 = redeemType3;
                            c27652.L$2 = null;
                            c27652.L$3 = null;
                            c27652.L$4 = null;
                            c27652.L$5 = null;
                            c27652.L$6 = null;
                            c27652.label = 5;
                            webPaywallRedeemer2 = webPaywallRedeemer;
                            code = null;
                            objMo61redeemTokenmylZ20U = network6.mo61redeemTokenmylZ20U(list8, str10, str11, deviceVendorId5, (List) objInvoke4, strInvoke6, c27652);
                            if (objMo61redeemTokenmylZ20U != objL) {
                                webPaywallRedeemer3 = webPaywallRedeemer2;
                                objInvoke4 = objMo61redeemTokenmylZ20U;
                                either = (Either) objInvoke4;
                                if (either instanceof Either.Success) {
                                    webRedemptionResponse = (WebRedemptionResponse) ((Either.Success) either).getValue();
                                    webPaywallRedeemer3.getStorage().write(LatestRedemptionResponse.INSTANCE, webRedemptionResponse);
                                    track2 = webPaywallRedeemer3.getTrack();
                                    redemptions3 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Complete.INSTANCE, redeemType3);
                                    c27652.L$0 = webPaywallRedeemer3;
                                    c27652.L$1 = redeemType3;
                                    c27652.L$2 = webRedemptionResponse;
                                    c27652.label = 6;
                                    if (track2.invoke(redemptions3, c27652) != objL) {
                                        if (redeemType3 instanceof RedeemType.Code) {
                                            Logger logger5 = Logger.INSTANCE;
                                            LogLevel logLevel5 = LogLevel.debug;
                                            LogScope logScope5 = LogScope.webEntitlements;
                                            if (redeemType3 != null) {
                                                code2 = (RedeemType.Code) redeemType3;
                                            } else {
                                                code2 = code;
                                            }
                                            if (code2 != null) {
                                                code3 = "";
                                            } else {
                                                code3 = "";
                                            }
                                            Logger.debug$default(logger5, logLevel5, logScope5, "Entitlement redemption done", MapsKt.mapOf(TuplesKt.to("code", code3)), null, 16, null);
                                            codes = webRedemptionResponse.getCodes();
                                            if (codes instanceof Collection) {
                                                it = codes.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        if (redeemType3 != null) {
                                                            code4 = (RedeemType.Code) redeemType3;
                                                        } else {
                                                            code4 = code;
                                                        }
                                                        if (code4 != null) {
                                                            str = code5;
                                                        }
                                                        codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                    } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                        codes2 = webRedemptionResponse.getCodes();
                                                    }
                                                }
                                            } else {
                                                it = codes.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        if (redeemType3 != null) {
                                                            code4 = (RedeemType.Code) redeemType3;
                                                        } else {
                                                            code4 = code;
                                                        }
                                                        if (code4 != null) {
                                                            str = code5;
                                                        }
                                                        codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                    } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                        codes2 = webRedemptionResponse.getCodes();
                                                    }
                                                }
                                            }
                                            it2 = codes2.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next = it2.next();
                                                    if (Intrinsics.areEqual(((RedemptionResult) next).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                        obj = next;
                                                    }
                                                } else {
                                                    obj = code;
                                                }
                                            }
                                            if (((RedemptionResult) obj) != null) {
                                                Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible9 = webPaywallRedeemer3.isPaywallVisible();
                                                c27652.L$0 = webPaywallRedeemer3;
                                                c27652.L$1 = redeemType3;
                                                c27652.L$2 = webRedemptionResponse;
                                                c27652.label = 7;
                                                objInvoke2 = function1IsPaywallVisible9.invoke(c27652);
                                                if (objInvoke2 != objL) {
                                                    if (((Boolean) objInvoke2).booleanValue()) {
                                                        if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                                                            triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                                                            c27652.L$0 = webPaywallRedeemer3;
                                                            c27652.L$1 = redeemType3;
                                                            c27652.L$2 = webRedemptionResponse;
                                                            c27652.label = 8;
                                                            if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                                                                webPaywallRedeemer4 = webPaywallRedeemer3;
                                                                webPaywallRedeemer3 = webPaywallRedeemer4;
                                                            }
                                                        } else {
                                                            webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                                                        }
                                                    }
                                                }
                                            }
                                            startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                            return Unit.f312394a;
                                        }
                                        if (!Intrinsics.areEqual(redeemType3, RedeemType.Existing.INSTANCE)) {
                                            throw new k0();
                                        }
                                        webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                                        if (redeemType3 instanceof RedeemType.Code) {
                                            while (r2.hasNext()) {
                                                if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                    webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                        return Unit.f312394a;
                                    }
                                } else {
                                    if (!(either instanceof Either.Failure)) {
                                        throw new k0();
                                    }
                                    networkError = (NetworkError) ((Either.Failure) either).getError();
                                    track = webPaywallRedeemer3.getTrack();
                                    redemptions2 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Fail.INSTANCE, redeemType3);
                                    c27652.L$0 = webPaywallRedeemer3;
                                    c27652.L$1 = redeemType3;
                                    c27652.L$2 = networkError;
                                    c27652.label = 9;
                                    if (track.invoke(redemptions2, c27652) != objL) {
                                        networkError2 = networkError;
                                        if (redeemType3 instanceof RedeemType.Code) {
                                            localizedMessage = networkError2.getLocalizedMessage();
                                            if (localizedMessage == null) {
                                                localizedMessage = "Redemption failed, error unknown";
                                            }
                                            RedeemType.Code code14 = (RedeemType.Code) redeemType3;
                                            Logger.INSTANCE.debug(LogLevel.error, LogScope.webEntitlements, "Failed to redeem purchase token", MapsKt.mapOf(TuplesKt.to("code", code14.getCode())), networkError2);
                                            Function1<RedemptionResult, Unit> didRedeemLink5 = webPaywallRedeemer3.getDidRedeemLink();
                                            String code15 = code14.getCode();
                                            didRedeemLink5.invoke(new RedemptionResult.Error(code15 != null ? code15 : "", new ErrorInfo(localizedMessage)));
                                            Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible10 = webPaywallRedeemer3.isPaywallVisible();
                                            c27652.L$0 = webPaywallRedeemer3;
                                            c27652.L$1 = localizedMessage;
                                            c27652.L$2 = code;
                                            c27652.label = 10;
                                            objInvoke3 = function1IsPaywallVisible10.invoke(c27652);
                                            if (objInvoke3 != objL) {
                                                obj2 = objInvoke3;
                                                webPaywallRedeemer5 = webPaywallRedeemer3;
                                                if (((Boolean) obj2).booleanValue()) {
                                                    webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                                                }
                                                webPaywallRedeemer3 = webPaywallRedeemer5;
                                            }
                                        }
                                        startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                        return Unit.f312394a;
                                    }
                                }
                            }
                        }
                    }
                }
                return objL;
            case 2:
                List<Redeemable> list9 = (List) c27652.L$2;
                redeemType4 = (RedeemType) c27652.L$1;
                WebPaywallRedeemer webPaywallRedeemer8 = (WebPaywallRedeemer) c27652.L$0;
                ResultKt.m(objInvoke4);
                arrayList = list9;
                webPaywallRedeemer6 = webPaywallRedeemer8;
                function3 = webPaywallRedeemer6.track;
                redemptions = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Start.INSTANCE, redeemType4);
                c27652.L$0 = webPaywallRedeemer6;
                c27652.L$1 = redeemType4;
                c27652.L$2 = arrayList;
                c27652.label = 3;
                if (function3.invoke(redemptions, c27652) != objL) {
                    webPaywallRedeemer = webPaywallRedeemer6;
                    list = arrayList;
                    redeemType2 = redeemType4;
                    network = webPaywallRedeemer.network;
                    userIdInvoke = webPaywallRedeemer.getUserId.invoke();
                    if (userIdInvoke != null) {
                        strM33unboximpl = userIdInvoke.m33unboximpl();
                    } else {
                        strM33unboximpl = null;
                    }
                    strInvoke = webPaywallRedeemer.getAliasId.invoke();
                    deviceVendorIdInvoke = webPaywallRedeemer.getDeviceId.invoke();
                    Function1<kotlin.coroutines.d<? super List<TransactionReceipt>>, Object> function9 = webPaywallRedeemer.receipts;
                    c27652.L$0 = webPaywallRedeemer;
                    c27652.L$1 = redeemType2;
                    c27652.L$2 = network;
                    c27652.L$3 = list;
                    c27652.L$4 = strM33unboximpl;
                    c27652.L$5 = strInvoke;
                    c27652.L$6 = deviceVendorIdInvoke;
                    c27652.label = 4;
                    objInvoke4 = function9.invoke(c27652);
                    if (objInvoke4 != objL) {
                        RedeemType redeemType10 = redeemType2;
                        DeviceVendorId deviceVendorId6 = deviceVendorIdInvoke;
                        List<Redeemable> list10 = list;
                        String str12 = strM33unboximpl;
                        Network network7 = network;
                        String str13 = strInvoke;
                        redeemType3 = redeemType10;
                        String strInvoke7 = webPaywallRedeemer.getExternalAccountId.invoke();
                        c27652.L$0 = webPaywallRedeemer;
                        c27652.L$1 = redeemType3;
                        c27652.L$2 = null;
                        c27652.L$3 = null;
                        c27652.L$4 = null;
                        c27652.L$5 = null;
                        c27652.L$6 = null;
                        c27652.label = 5;
                        webPaywallRedeemer2 = webPaywallRedeemer;
                        code = null;
                        objMo61redeemTokenmylZ20U = network7.mo61redeemTokenmylZ20U(list10, str12, str13, deviceVendorId6, (List) objInvoke4, strInvoke7, c27652);
                        if (objMo61redeemTokenmylZ20U != objL) {
                            webPaywallRedeemer3 = webPaywallRedeemer2;
                            objInvoke4 = objMo61redeemTokenmylZ20U;
                            either = (Either) objInvoke4;
                            if (either instanceof Either.Success) {
                                webRedemptionResponse = (WebRedemptionResponse) ((Either.Success) either).getValue();
                                webPaywallRedeemer3.getStorage().write(LatestRedemptionResponse.INSTANCE, webRedemptionResponse);
                                track2 = webPaywallRedeemer3.getTrack();
                                redemptions3 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Complete.INSTANCE, redeemType3);
                                c27652.L$0 = webPaywallRedeemer3;
                                c27652.L$1 = redeemType3;
                                c27652.L$2 = webRedemptionResponse;
                                c27652.label = 6;
                                if (track2.invoke(redemptions3, c27652) != objL) {
                                    if (redeemType3 instanceof RedeemType.Code) {
                                        Logger logger6 = Logger.INSTANCE;
                                        LogLevel logLevel6 = LogLevel.debug;
                                        LogScope logScope6 = LogScope.webEntitlements;
                                        if (redeemType3 != null) {
                                            code2 = (RedeemType.Code) redeemType3;
                                        } else {
                                            code2 = code;
                                        }
                                        if (code2 != null) {
                                            code3 = "";
                                        } else {
                                            code3 = "";
                                        }
                                        Logger.debug$default(logger6, logLevel6, logScope6, "Entitlement redemption done", MapsKt.mapOf(TuplesKt.to("code", code3)), null, 16, null);
                                        codes = webRedemptionResponse.getCodes();
                                        if (codes instanceof Collection) {
                                            it = codes.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    if (redeemType3 != null) {
                                                        code4 = (RedeemType.Code) redeemType3;
                                                    } else {
                                                        code4 = code;
                                                    }
                                                    if (code4 != null) {
                                                        str = code5;
                                                    }
                                                    codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                    codes2 = webRedemptionResponse.getCodes();
                                                }
                                            }
                                        } else {
                                            it = codes.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    if (redeemType3 != null) {
                                                        code4 = (RedeemType.Code) redeemType3;
                                                    } else {
                                                        code4 = code;
                                                    }
                                                    if (code4 != null) {
                                                        str = code5;
                                                    }
                                                    codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                                } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                    codes2 = webRedemptionResponse.getCodes();
                                                }
                                            }
                                        }
                                        it2 = codes2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                if (Intrinsics.areEqual(((RedemptionResult) next).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                    obj = next;
                                                }
                                            } else {
                                                obj = code;
                                            }
                                        }
                                        if (((RedemptionResult) obj) != null) {
                                            Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible11 = webPaywallRedeemer3.isPaywallVisible();
                                            c27652.L$0 = webPaywallRedeemer3;
                                            c27652.L$1 = redeemType3;
                                            c27652.L$2 = webRedemptionResponse;
                                            c27652.label = 7;
                                            objInvoke2 = function1IsPaywallVisible11.invoke(c27652);
                                            if (objInvoke2 != objL) {
                                                if (((Boolean) objInvoke2).booleanValue()) {
                                                    if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                                                        triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                                                        c27652.L$0 = webPaywallRedeemer3;
                                                        c27652.L$1 = redeemType3;
                                                        c27652.L$2 = webRedemptionResponse;
                                                        c27652.label = 8;
                                                        if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                                                            webPaywallRedeemer4 = webPaywallRedeemer3;
                                                            webPaywallRedeemer3 = webPaywallRedeemer4;
                                                        }
                                                    } else {
                                                        webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                                                    }
                                                }
                                            }
                                        }
                                        startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                        return Unit.f312394a;
                                    }
                                    if (!Intrinsics.areEqual(redeemType3, RedeemType.Existing.INSTANCE)) {
                                        throw new k0();
                                    }
                                    webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                                    if (redeemType3 instanceof RedeemType.Code) {
                                        while (r2.hasNext()) {
                                            if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                    return Unit.f312394a;
                                }
                            } else {
                                if (!(either instanceof Either.Failure)) {
                                    throw new k0();
                                }
                                networkError = (NetworkError) ((Either.Failure) either).getError();
                                track = webPaywallRedeemer3.getTrack();
                                redemptions2 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Fail.INSTANCE, redeemType3);
                                c27652.L$0 = webPaywallRedeemer3;
                                c27652.L$1 = redeemType3;
                                c27652.L$2 = networkError;
                                c27652.label = 9;
                                if (track.invoke(redemptions2, c27652) != objL) {
                                    networkError2 = networkError;
                                    if (redeemType3 instanceof RedeemType.Code) {
                                        localizedMessage = networkError2.getLocalizedMessage();
                                        if (localizedMessage == null) {
                                            localizedMessage = "Redemption failed, error unknown";
                                        }
                                        RedeemType.Code code16 = (RedeemType.Code) redeemType3;
                                        Logger.INSTANCE.debug(LogLevel.error, LogScope.webEntitlements, "Failed to redeem purchase token", MapsKt.mapOf(TuplesKt.to("code", code16.getCode())), networkError2);
                                        Function1<RedemptionResult, Unit> didRedeemLink6 = webPaywallRedeemer3.getDidRedeemLink();
                                        String code17 = code16.getCode();
                                        didRedeemLink6.invoke(new RedemptionResult.Error(code17 != null ? code17 : "", new ErrorInfo(localizedMessage)));
                                        Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible12 = webPaywallRedeemer3.isPaywallVisible();
                                        c27652.L$0 = webPaywallRedeemer3;
                                        c27652.L$1 = localizedMessage;
                                        c27652.L$2 = code;
                                        c27652.label = 10;
                                        objInvoke3 = function1IsPaywallVisible12.invoke(c27652);
                                        if (objInvoke3 != objL) {
                                            obj2 = objInvoke3;
                                            webPaywallRedeemer5 = webPaywallRedeemer3;
                                            if (((Boolean) obj2).booleanValue()) {
                                                webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                                            }
                                            webPaywallRedeemer3 = webPaywallRedeemer5;
                                        }
                                    }
                                    startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                    return Unit.f312394a;
                                }
                            }
                        }
                    }
                }
                return objL;
            case 3:
                List<Redeemable> list11 = (List) c27652.L$2;
                redeemType4 = (RedeemType) c27652.L$1;
                WebPaywallRedeemer webPaywallRedeemer9 = (WebPaywallRedeemer) c27652.L$0;
                ResultKt.m(objInvoke4);
                list = list11;
                webPaywallRedeemer = webPaywallRedeemer9;
                redeemType2 = redeemType4;
                network = webPaywallRedeemer.network;
                userIdInvoke = webPaywallRedeemer.getUserId.invoke();
                if (userIdInvoke != null) {
                    strM33unboximpl = userIdInvoke.m33unboximpl();
                } else {
                    strM33unboximpl = null;
                }
                strInvoke = webPaywallRedeemer.getAliasId.invoke();
                deviceVendorIdInvoke = webPaywallRedeemer.getDeviceId.invoke();
                Function1<kotlin.coroutines.d<? super List<TransactionReceipt>>, Object> function10 = webPaywallRedeemer.receipts;
                c27652.L$0 = webPaywallRedeemer;
                c27652.L$1 = redeemType2;
                c27652.L$2 = network;
                c27652.L$3 = list;
                c27652.L$4 = strM33unboximpl;
                c27652.L$5 = strInvoke;
                c27652.L$6 = deviceVendorIdInvoke;
                c27652.label = 4;
                objInvoke4 = function10.invoke(c27652);
                if (objInvoke4 != objL) {
                    RedeemType redeemType11 = redeemType2;
                    DeviceVendorId deviceVendorId7 = deviceVendorIdInvoke;
                    List<Redeemable> list12 = list;
                    String str14 = strM33unboximpl;
                    Network network8 = network;
                    String str15 = strInvoke;
                    redeemType3 = redeemType11;
                    String strInvoke8 = webPaywallRedeemer.getExternalAccountId.invoke();
                    c27652.L$0 = webPaywallRedeemer;
                    c27652.L$1 = redeemType3;
                    c27652.L$2 = null;
                    c27652.L$3 = null;
                    c27652.L$4 = null;
                    c27652.L$5 = null;
                    c27652.L$6 = null;
                    c27652.label = 5;
                    webPaywallRedeemer2 = webPaywallRedeemer;
                    code = null;
                    objMo61redeemTokenmylZ20U = network8.mo61redeemTokenmylZ20U(list12, str14, str15, deviceVendorId7, (List) objInvoke4, strInvoke8, c27652);
                    if (objMo61redeemTokenmylZ20U != objL) {
                        webPaywallRedeemer3 = webPaywallRedeemer2;
                        objInvoke4 = objMo61redeemTokenmylZ20U;
                        either = (Either) objInvoke4;
                        if (either instanceof Either.Success) {
                            webRedemptionResponse = (WebRedemptionResponse) ((Either.Success) either).getValue();
                            webPaywallRedeemer3.getStorage().write(LatestRedemptionResponse.INSTANCE, webRedemptionResponse);
                            track2 = webPaywallRedeemer3.getTrack();
                            redemptions3 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Complete.INSTANCE, redeemType3);
                            c27652.L$0 = webPaywallRedeemer3;
                            c27652.L$1 = redeemType3;
                            c27652.L$2 = webRedemptionResponse;
                            c27652.label = 6;
                            if (track2.invoke(redemptions3, c27652) != objL) {
                                if (redeemType3 instanceof RedeemType.Code) {
                                    Logger logger7 = Logger.INSTANCE;
                                    LogLevel logLevel7 = LogLevel.debug;
                                    LogScope logScope7 = LogScope.webEntitlements;
                                    if (redeemType3 != null) {
                                        code2 = (RedeemType.Code) redeemType3;
                                    } else {
                                        code2 = code;
                                    }
                                    if (code2 != null) {
                                        code3 = "";
                                    } else {
                                        code3 = "";
                                    }
                                    Logger.debug$default(logger7, logLevel7, logScope7, "Entitlement redemption done", MapsKt.mapOf(TuplesKt.to("code", code3)), null, 16, null);
                                    codes = webRedemptionResponse.getCodes();
                                    if (codes instanceof Collection) {
                                        it = codes.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                if (redeemType3 != null) {
                                                    code4 = (RedeemType.Code) redeemType3;
                                                } else {
                                                    code4 = code;
                                                }
                                                if (code4 != null) {
                                                    str = code5;
                                                }
                                                codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                            } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                codes2 = webRedemptionResponse.getCodes();
                                            }
                                        }
                                    } else {
                                        it = codes.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                if (redeemType3 != null) {
                                                    code4 = (RedeemType.Code) redeemType3;
                                                } else {
                                                    code4 = code;
                                                }
                                                if (code4 != null) {
                                                    str = code5;
                                                }
                                                codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                            } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                codes2 = webRedemptionResponse.getCodes();
                                            }
                                        }
                                    }
                                    it2 = codes2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (Intrinsics.areEqual(((RedemptionResult) next).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                                obj = next;
                                            }
                                        } else {
                                            obj = code;
                                        }
                                    }
                                    if (((RedemptionResult) obj) != null) {
                                        Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible13 = webPaywallRedeemer3.isPaywallVisible();
                                        c27652.L$0 = webPaywallRedeemer3;
                                        c27652.L$1 = redeemType3;
                                        c27652.L$2 = webRedemptionResponse;
                                        c27652.label = 7;
                                        objInvoke2 = function1IsPaywallVisible13.invoke(c27652);
                                        if (objInvoke2 != objL) {
                                            if (((Boolean) objInvoke2).booleanValue()) {
                                                if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                                                    triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                                                    c27652.L$0 = webPaywallRedeemer3;
                                                    c27652.L$1 = redeemType3;
                                                    c27652.L$2 = webRedemptionResponse;
                                                    c27652.label = 8;
                                                    if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                                                        webPaywallRedeemer4 = webPaywallRedeemer3;
                                                        webPaywallRedeemer3 = webPaywallRedeemer4;
                                                    }
                                                } else {
                                                    webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                                                }
                                            }
                                        }
                                    }
                                    startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                    return Unit.f312394a;
                                }
                                if (!Intrinsics.areEqual(redeemType3, RedeemType.Existing.INSTANCE)) {
                                    throw new k0();
                                }
                                webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                                if (redeemType3 instanceof RedeemType.Code) {
                                    while (r2.hasNext()) {
                                        if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                            webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                return Unit.f312394a;
                            }
                        } else {
                            if (!(either instanceof Either.Failure)) {
                                throw new k0();
                            }
                            networkError = (NetworkError) ((Either.Failure) either).getError();
                            track = webPaywallRedeemer3.getTrack();
                            redemptions2 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Fail.INSTANCE, redeemType3);
                            c27652.L$0 = webPaywallRedeemer3;
                            c27652.L$1 = redeemType3;
                            c27652.L$2 = networkError;
                            c27652.label = 9;
                            if (track.invoke(redemptions2, c27652) != objL) {
                                networkError2 = networkError;
                                if (redeemType3 instanceof RedeemType.Code) {
                                    localizedMessage = networkError2.getLocalizedMessage();
                                    if (localizedMessage == null) {
                                        localizedMessage = "Redemption failed, error unknown";
                                    }
                                    RedeemType.Code code18 = (RedeemType.Code) redeemType3;
                                    Logger.INSTANCE.debug(LogLevel.error, LogScope.webEntitlements, "Failed to redeem purchase token", MapsKt.mapOf(TuplesKt.to("code", code18.getCode())), networkError2);
                                    Function1<RedemptionResult, Unit> didRedeemLink7 = webPaywallRedeemer3.getDidRedeemLink();
                                    String code19 = code18.getCode();
                                    didRedeemLink7.invoke(new RedemptionResult.Error(code19 != null ? code19 : "", new ErrorInfo(localizedMessage)));
                                    Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible14 = webPaywallRedeemer3.isPaywallVisible();
                                    c27652.L$0 = webPaywallRedeemer3;
                                    c27652.L$1 = localizedMessage;
                                    c27652.L$2 = code;
                                    c27652.label = 10;
                                    objInvoke3 = function1IsPaywallVisible14.invoke(c27652);
                                    if (objInvoke3 != objL) {
                                        obj2 = objInvoke3;
                                        webPaywallRedeemer5 = webPaywallRedeemer3;
                                        if (((Boolean) obj2).booleanValue()) {
                                            webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                                        }
                                        webPaywallRedeemer3 = webPaywallRedeemer5;
                                    }
                                }
                                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                return Unit.f312394a;
                            }
                        }
                    }
                }
                return objL;
            case 4:
                deviceVendorIdInvoke = (DeviceVendorId) c27652.L$6;
                strInvoke = (String) c27652.L$5;
                strM33unboximpl = (String) c27652.L$4;
                list = (List) c27652.L$3;
                network = (Network) c27652.L$2;
                redeemType2 = (RedeemType) c27652.L$1;
                webPaywallRedeemer = (WebPaywallRedeemer) c27652.L$0;
                ResultKt.m(objInvoke4);
                RedeemType redeemType12 = redeemType2;
                DeviceVendorId deviceVendorId8 = deviceVendorIdInvoke;
                List<Redeemable> list13 = list;
                String str16 = strM33unboximpl;
                Network network9 = network;
                String str17 = strInvoke;
                redeemType3 = redeemType12;
                String strInvoke9 = webPaywallRedeemer.getExternalAccountId.invoke();
                c27652.L$0 = webPaywallRedeemer;
                c27652.L$1 = redeemType3;
                c27652.L$2 = null;
                c27652.L$3 = null;
                c27652.L$4 = null;
                c27652.L$5 = null;
                c27652.L$6 = null;
                c27652.label = 5;
                webPaywallRedeemer2 = webPaywallRedeemer;
                code = null;
                objMo61redeemTokenmylZ20U = network9.mo61redeemTokenmylZ20U(list13, str16, str17, deviceVendorId8, (List) objInvoke4, strInvoke9, c27652);
                if (objMo61redeemTokenmylZ20U != objL) {
                    webPaywallRedeemer3 = webPaywallRedeemer2;
                    objInvoke4 = objMo61redeemTokenmylZ20U;
                    either = (Either) objInvoke4;
                    if (either instanceof Either.Success) {
                        webRedemptionResponse = (WebRedemptionResponse) ((Either.Success) either).getValue();
                        webPaywallRedeemer3.getStorage().write(LatestRedemptionResponse.INSTANCE, webRedemptionResponse);
                        track2 = webPaywallRedeemer3.getTrack();
                        redemptions3 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Complete.INSTANCE, redeemType3);
                        c27652.L$0 = webPaywallRedeemer3;
                        c27652.L$1 = redeemType3;
                        c27652.L$2 = webRedemptionResponse;
                        c27652.label = 6;
                        if (track2.invoke(redemptions3, c27652) != objL) {
                            if (redeemType3 instanceof RedeemType.Code) {
                                Logger logger8 = Logger.INSTANCE;
                                LogLevel logLevel8 = LogLevel.debug;
                                LogScope logScope8 = LogScope.webEntitlements;
                                if (redeemType3 != null) {
                                    code2 = (RedeemType.Code) redeemType3;
                                } else {
                                    code2 = code;
                                }
                                if (code2 != null) {
                                    code3 = "";
                                } else {
                                    code3 = "";
                                }
                                Logger.debug$default(logger8, logLevel8, logScope8, "Entitlement redemption done", MapsKt.mapOf(TuplesKt.to("code", code3)), null, 16, null);
                                codes = webRedemptionResponse.getCodes();
                                if (codes instanceof Collection) {
                                    it = codes.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            if (redeemType3 != null) {
                                                code4 = (RedeemType.Code) redeemType3;
                                            } else {
                                                code4 = code;
                                            }
                                            if (code4 != null) {
                                                str = code5;
                                            }
                                            codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                        } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                            codes2 = webRedemptionResponse.getCodes();
                                        }
                                    }
                                } else {
                                    it = codes.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            if (redeemType3 != null) {
                                                code4 = (RedeemType.Code) redeemType3;
                                            } else {
                                                code4 = code;
                                            }
                                            if (code4 != null) {
                                                str = code5;
                                            }
                                            codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                        } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                            codes2 = webRedemptionResponse.getCodes();
                                        }
                                    }
                                }
                                it2 = codes2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (Intrinsics.areEqual(((RedemptionResult) next).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                            obj = next;
                                        }
                                    } else {
                                        obj = code;
                                    }
                                }
                                if (((RedemptionResult) obj) != null) {
                                    Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible15 = webPaywallRedeemer3.isPaywallVisible();
                                    c27652.L$0 = webPaywallRedeemer3;
                                    c27652.L$1 = redeemType3;
                                    c27652.L$2 = webRedemptionResponse;
                                    c27652.label = 7;
                                    objInvoke2 = function1IsPaywallVisible15.invoke(c27652);
                                    if (objInvoke2 != objL) {
                                        if (((Boolean) objInvoke2).booleanValue()) {
                                            if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                                                triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                                                c27652.L$0 = webPaywallRedeemer3;
                                                c27652.L$1 = redeemType3;
                                                c27652.L$2 = webRedemptionResponse;
                                                c27652.label = 8;
                                                if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                                                    webPaywallRedeemer4 = webPaywallRedeemer3;
                                                    webPaywallRedeemer3 = webPaywallRedeemer4;
                                                }
                                            } else {
                                                webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                                            }
                                        }
                                    }
                                }
                                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                                return Unit.f312394a;
                            }
                            if (!Intrinsics.areEqual(redeemType3, RedeemType.Existing.INSTANCE)) {
                                throw new k0();
                            }
                            webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                            if (redeemType3 instanceof RedeemType.Code) {
                                while (r2.hasNext()) {
                                    if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                        webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                            return Unit.f312394a;
                        }
                    } else {
                        if (!(either instanceof Either.Failure)) {
                            throw new k0();
                        }
                        networkError = (NetworkError) ((Either.Failure) either).getError();
                        track = webPaywallRedeemer3.getTrack();
                        redemptions2 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Fail.INSTANCE, redeemType3);
                        c27652.L$0 = webPaywallRedeemer3;
                        c27652.L$1 = redeemType3;
                        c27652.L$2 = networkError;
                        c27652.label = 9;
                        if (track.invoke(redemptions2, c27652) != objL) {
                            networkError2 = networkError;
                            if (redeemType3 instanceof RedeemType.Code) {
                                localizedMessage = networkError2.getLocalizedMessage();
                                if (localizedMessage == null) {
                                    localizedMessage = "Redemption failed, error unknown";
                                }
                                RedeemType.Code code110 = (RedeemType.Code) redeemType3;
                                Logger.INSTANCE.debug(LogLevel.error, LogScope.webEntitlements, "Failed to redeem purchase token", MapsKt.mapOf(TuplesKt.to("code", code110.getCode())), networkError2);
                                Function1<RedemptionResult, Unit> didRedeemLink8 = webPaywallRedeemer3.getDidRedeemLink();
                                String code111 = code110.getCode();
                                didRedeemLink8.invoke(new RedemptionResult.Error(code111 != null ? code111 : "", new ErrorInfo(localizedMessage)));
                                Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible16 = webPaywallRedeemer3.isPaywallVisible();
                                c27652.L$0 = webPaywallRedeemer3;
                                c27652.L$1 = localizedMessage;
                                c27652.L$2 = code;
                                c27652.label = 10;
                                objInvoke3 = function1IsPaywallVisible16.invoke(c27652);
                                if (objInvoke3 != objL) {
                                    obj2 = objInvoke3;
                                    webPaywallRedeemer5 = webPaywallRedeemer3;
                                    if (((Boolean) obj2).booleanValue()) {
                                        webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                                    }
                                    webPaywallRedeemer3 = webPaywallRedeemer5;
                                }
                            }
                            startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                            return Unit.f312394a;
                        }
                    }
                }
                return objL;
            case 5:
                RedeemType redeemType13 = (RedeemType) c27652.L$1;
                WebPaywallRedeemer webPaywallRedeemer10 = (WebPaywallRedeemer) c27652.L$0;
                ResultKt.m(objInvoke4);
                webPaywallRedeemer3 = webPaywallRedeemer10;
                redeemType3 = redeemType13;
                code = null;
                either = (Either) objInvoke4;
                if (either instanceof Either.Success) {
                    webRedemptionResponse = (WebRedemptionResponse) ((Either.Success) either).getValue();
                    webPaywallRedeemer3.getStorage().write(LatestRedemptionResponse.INSTANCE, webRedemptionResponse);
                    track2 = webPaywallRedeemer3.getTrack();
                    redemptions3 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Complete.INSTANCE, redeemType3);
                    c27652.L$0 = webPaywallRedeemer3;
                    c27652.L$1 = redeemType3;
                    c27652.L$2 = webRedemptionResponse;
                    c27652.label = 6;
                    if (track2.invoke(redemptions3, c27652) != objL) {
                        if (redeemType3 instanceof RedeemType.Code) {
                            Logger logger9 = Logger.INSTANCE;
                            LogLevel logLevel9 = LogLevel.debug;
                            LogScope logScope9 = LogScope.webEntitlements;
                            if (redeemType3 != null) {
                                code2 = (RedeemType.Code) redeemType3;
                            } else {
                                code2 = code;
                            }
                            if (code2 != null) {
                                code3 = "";
                            } else {
                                code3 = "";
                            }
                            Logger.debug$default(logger9, logLevel9, logScope9, "Entitlement redemption done", MapsKt.mapOf(TuplesKt.to("code", code3)), null, 16, null);
                            codes = webRedemptionResponse.getCodes();
                            if (codes instanceof Collection) {
                                it = codes.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        if (redeemType3 != null) {
                                            code4 = (RedeemType.Code) redeemType3;
                                        } else {
                                            code4 = code;
                                        }
                                        if (code4 != null) {
                                            str = code5;
                                        }
                                        codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                    } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                        codes2 = webRedemptionResponse.getCodes();
                                    }
                                }
                            } else {
                                it = codes.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        if (redeemType3 != null) {
                                            code4 = (RedeemType.Code) redeemType3;
                                        } else {
                                            code4 = code;
                                        }
                                        if (code4 != null) {
                                            str = code5;
                                        }
                                        codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                                    } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                        codes2 = webRedemptionResponse.getCodes();
                                    }
                                }
                            }
                            it2 = codes2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.areEqual(((RedemptionResult) next).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                        obj = next;
                                    }
                                } else {
                                    obj = code;
                                }
                            }
                            if (((RedemptionResult) obj) != null) {
                                Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible17 = webPaywallRedeemer3.isPaywallVisible();
                                c27652.L$0 = webPaywallRedeemer3;
                                c27652.L$1 = redeemType3;
                                c27652.L$2 = webRedemptionResponse;
                                c27652.label = 7;
                                objInvoke2 = function1IsPaywallVisible17.invoke(c27652);
                                if (objInvoke2 != objL) {
                                    if (((Boolean) objInvoke2).booleanValue()) {
                                        if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                                            triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                                            c27652.L$0 = webPaywallRedeemer3;
                                            c27652.L$1 = redeemType3;
                                            c27652.L$2 = webRedemptionResponse;
                                            c27652.label = 8;
                                            if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                                                webPaywallRedeemer4 = webPaywallRedeemer3;
                                                webPaywallRedeemer3 = webPaywallRedeemer4;
                                            }
                                        } else {
                                            webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                                        }
                                    }
                                }
                            }
                            startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                            return Unit.f312394a;
                        }
                        if (!Intrinsics.areEqual(redeemType3, RedeemType.Existing.INSTANCE)) {
                            throw new k0();
                        }
                        webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                        if (redeemType3 instanceof RedeemType.Code) {
                            while (r2.hasNext()) {
                                if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                    webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                        return Unit.f312394a;
                    }
                } else {
                    if (!(either instanceof Either.Failure)) {
                        throw new k0();
                    }
                    networkError = (NetworkError) ((Either.Failure) either).getError();
                    track = webPaywallRedeemer3.getTrack();
                    redemptions2 = new InternalSuperwallEvent.Redemptions(InternalSuperwallEvent.Redemptions.RedemptionState.Fail.INSTANCE, redeemType3);
                    c27652.L$0 = webPaywallRedeemer3;
                    c27652.L$1 = redeemType3;
                    c27652.L$2 = networkError;
                    c27652.label = 9;
                    if (track.invoke(redemptions2, c27652) != objL) {
                        networkError2 = networkError;
                        if (redeemType3 instanceof RedeemType.Code) {
                            localizedMessage = networkError2.getLocalizedMessage();
                            if (localizedMessage == null) {
                                localizedMessage = "Redemption failed, error unknown";
                            }
                            RedeemType.Code code112 = (RedeemType.Code) redeemType3;
                            Logger.INSTANCE.debug(LogLevel.error, LogScope.webEntitlements, "Failed to redeem purchase token", MapsKt.mapOf(TuplesKt.to("code", code112.getCode())), networkError2);
                            Function1<RedemptionResult, Unit> didRedeemLink9 = webPaywallRedeemer3.getDidRedeemLink();
                            String code113 = code112.getCode();
                            didRedeemLink9.invoke(new RedemptionResult.Error(code113 != null ? code113 : "", new ErrorInfo(localizedMessage)));
                            Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible18 = webPaywallRedeemer3.isPaywallVisible();
                            c27652.L$0 = webPaywallRedeemer3;
                            c27652.L$1 = localizedMessage;
                            c27652.L$2 = code;
                            c27652.label = 10;
                            objInvoke3 = function1IsPaywallVisible18.invoke(c27652);
                            if (objInvoke3 != objL) {
                                obj2 = objInvoke3;
                                webPaywallRedeemer5 = webPaywallRedeemer3;
                                if (((Boolean) obj2).booleanValue()) {
                                    webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                                }
                                webPaywallRedeemer3 = webPaywallRedeemer5;
                            }
                        }
                        startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                        return Unit.f312394a;
                    }
                }
                return objL;
            case 6:
                WebRedemptionResponse webRedemptionResponse3 = (WebRedemptionResponse) c27652.L$2;
                redeemType3 = (RedeemType) c27652.L$1;
                webPaywallRedeemer3 = (WebPaywallRedeemer) c27652.L$0;
                ResultKt.m(objInvoke4);
                webRedemptionResponse = webRedemptionResponse3;
                code = null;
                if (redeemType3 instanceof RedeemType.Code) {
                    Logger logger10 = Logger.INSTANCE;
                    LogLevel logLevel10 = LogLevel.debug;
                    LogScope logScope10 = LogScope.webEntitlements;
                    if (redeemType3 != null) {
                        code2 = (RedeemType.Code) redeemType3;
                    } else {
                        code2 = code;
                    }
                    if (code2 != null) {
                        code3 = "";
                    } else {
                        code3 = "";
                    }
                    Logger.debug$default(logger10, logLevel10, logScope10, "Entitlement redemption done", MapsKt.mapOf(TuplesKt.to("code", code3)), null, 16, null);
                    codes = webRedemptionResponse.getCodes();
                    if (codes instanceof Collection) {
                        it = codes.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                if (redeemType3 != null) {
                                    code4 = (RedeemType.Code) redeemType3;
                                } else {
                                    code4 = code;
                                }
                                if (code4 != null) {
                                    str = code5;
                                }
                                codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                            } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                codes2 = webRedemptionResponse.getCodes();
                            }
                        }
                    } else {
                        it = codes.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                if (redeemType3 != null) {
                                    code4 = (RedeemType.Code) redeemType3;
                                } else {
                                    code4 = code;
                                }
                                if (code4 != null) {
                                    str = code5;
                                }
                                codes2 = CollectionsKt.listOf(new RedemptionResult.Error(str, new ErrorInfo("Redemption failed, code not returned")));
                            } else if (Intrinsics.areEqual(((RedemptionResult) it.next()).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                codes2 = webRedemptionResponse.getCodes();
                            }
                        }
                    }
                    it2 = codes2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.areEqual(((RedemptionResult) next).getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                                obj = next;
                            }
                        } else {
                            obj = code;
                        }
                    }
                    if (((RedemptionResult) obj) != null) {
                        Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible19 = webPaywallRedeemer3.isPaywallVisible();
                        c27652.L$0 = webPaywallRedeemer3;
                        c27652.L$1 = redeemType3;
                        c27652.L$2 = webRedemptionResponse;
                        c27652.label = 7;
                        objInvoke2 = function1IsPaywallVisible19.invoke(c27652);
                        if (objInvoke2 != objL) {
                            if (((Boolean) objInvoke2).booleanValue()) {
                                if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                                    triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                                    c27652.L$0 = webPaywallRedeemer3;
                                    c27652.L$1 = redeemType3;
                                    c27652.L$2 = webRedemptionResponse;
                                    c27652.label = 8;
                                    if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                                        webPaywallRedeemer4 = webPaywallRedeemer3;
                                        webPaywallRedeemer3 = webPaywallRedeemer4;
                                    }
                                } else {
                                    webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                                }
                            }
                        }
                        return objL;
                    }
                    startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                    return Unit.f312394a;
                }
                if (!Intrinsics.areEqual(redeemType3, RedeemType.Existing.INSTANCE)) {
                    throw new k0();
                }
                webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                if (redeemType3 instanceof RedeemType.Code) {
                    while (r2.hasNext()) {
                        if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                            webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                return Unit.f312394a;
            case 7:
                WebRedemptionResponse webRedemptionResponse4 = (WebRedemptionResponse) c27652.L$2;
                redeemType3 = (RedeemType) c27652.L$1;
                webPaywallRedeemer3 = (WebPaywallRedeemer) c27652.L$0;
                ResultKt.m(objInvoke4);
                webRedemptionResponse = webRedemptionResponse4;
                code = null;
                objInvoke2 = objInvoke4;
                if (((Boolean) objInvoke2).booleanValue()) {
                    if (webRedemptionResponse.getEntitlements().containsAll(webPaywallRedeemer3.getCurrentPaywallEntitlements().invoke())) {
                        triggerRestoreInPaywall = webPaywallRedeemer3.getTriggerRestoreInPaywall();
                        c27652.L$0 = webPaywallRedeemer3;
                        c27652.L$1 = redeemType3;
                        c27652.L$2 = webRedemptionResponse;
                        c27652.label = 8;
                        if (triggerRestoreInPaywall.invoke(c27652) != objL) {
                            webPaywallRedeemer4 = webPaywallRedeemer3;
                            webPaywallRedeemer3 = webPaywallRedeemer4;
                        }
                        return objL;
                    }
                    webPaywallRedeemer3.getTrackRestorationFailed().invoke("Failed to restore subscriptions from the web");
                }
                webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                if (redeemType3 instanceof RedeemType.Code) {
                    while (r2.hasNext()) {
                        if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                            webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                return Unit.f312394a;
            case 8:
                WebRedemptionResponse webRedemptionResponse5 = (WebRedemptionResponse) c27652.L$2;
                redeemType3 = (RedeemType) c27652.L$1;
                webPaywallRedeemer4 = (WebPaywallRedeemer) c27652.L$0;
                ResultKt.m(objInvoke4);
                webRedemptionResponse = webRedemptionResponse5;
                code = null;
                webPaywallRedeemer3 = webPaywallRedeemer4;
                webPaywallRedeemer3.getInternallySetSubscriptionStatus().invoke(new SubscriptionStatus.Active(SetsKt.plus(CollectionsKt.toSet(webRedemptionResponse.getEntitlements()), (Iterable) webPaywallRedeemer3.getGetActiveDeviceEntitlements().invoke())));
                if (redeemType3 instanceof RedeemType.Code) {
                    while (r2.hasNext()) {
                        if (Intrinsics.areEqual(redemptionResult.getCode(), ((RedeemType.Code) redeemType3).getCode())) {
                            webPaywallRedeemer3.getDidRedeemLink().invoke(redemptionResult);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                return Unit.f312394a;
            case 9:
                NetworkError networkError3 = (NetworkError) c27652.L$2;
                redeemType3 = (RedeemType) c27652.L$1;
                webPaywallRedeemer3 = (WebPaywallRedeemer) c27652.L$0;
                ResultKt.m(objInvoke4);
                networkError2 = networkError3;
                code = null;
                if (redeemType3 instanceof RedeemType.Code) {
                    localizedMessage = networkError2.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = "Redemption failed, error unknown";
                    }
                    RedeemType.Code code114 = (RedeemType.Code) redeemType3;
                    Logger.INSTANCE.debug(LogLevel.error, LogScope.webEntitlements, "Failed to redeem purchase token", MapsKt.mapOf(TuplesKt.to("code", code114.getCode())), networkError2);
                    Function1<RedemptionResult, Unit> didRedeemLink10 = webPaywallRedeemer3.getDidRedeemLink();
                    String code115 = code114.getCode();
                    didRedeemLink10.invoke(new RedemptionResult.Error(code115 != null ? code115 : "", new ErrorInfo(localizedMessage)));
                    Function1<kotlin.coroutines.d<? super Boolean>, Object> function1IsPaywallVisible110 = webPaywallRedeemer3.isPaywallVisible();
                    c27652.L$0 = webPaywallRedeemer3;
                    c27652.L$1 = localizedMessage;
                    c27652.L$2 = code;
                    c27652.label = 10;
                    objInvoke3 = function1IsPaywallVisible110.invoke(c27652);
                    if (objInvoke3 != objL) {
                        obj2 = objInvoke3;
                        webPaywallRedeemer5 = webPaywallRedeemer3;
                        if (((Boolean) obj2).booleanValue()) {
                            webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                        }
                        webPaywallRedeemer3 = webPaywallRedeemer5;
                    }
                    return objL;
                }
                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                return Unit.f312394a;
            case 10:
                String str18 = (String) c27652.L$1;
                webPaywallRedeemer5 = (WebPaywallRedeemer) c27652.L$0;
                ResultKt.m(objInvoke4);
                obj2 = objInvoke4;
                localizedMessage = str18;
                code = null;
                if (((Boolean) obj2).booleanValue()) {
                    webPaywallRedeemer5.getTrackRestorationFailed().invoke(localizedMessage);
                }
                webPaywallRedeemer3 = webPaywallRedeemer5;
                startPolling$default(webPaywallRedeemer3, 0L, 1, code);
                return Unit.f312394a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ WebPaywallRedeemer(Context context, IOScope iOScope, CheckForReferral checkForReferral, Network network, Storage storage, Function0 function0, Function1 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, Function0 function6, Function2 function7, Function1 function8, Function1 function9, Function1 function10, Function0 function11, Function0 function12, Function1 function13, Function0 function14, Function1 function15, Function0 function16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iOScope, checkForReferral, network, storage, function0, function1, function2, (i10 & 256) != 0 ? new Function0() { // from class: com.superwall.sdk.web.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebPaywallRedeemer._init_$lambda$0();
            }
        } : function3, (i10 & 512) != 0 ? new Function0<UserId>() { // from class: com.superwall.sdk.web.WebPaywallRedeemer.2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ UserId invoke() {
                String strM83invokeP5Wmf0A = m83invokeP5Wmf0A();
                if (strM83invokeP5Wmf0A != null) {
                    return UserId.m27boximpl(strM83invokeP5Wmf0A);
                }
                return null;
            }

            /* JADX INFO: renamed from: invoke-P5Wmf0A, reason: not valid java name */
            public final String m83invokeP5Wmf0A() {
                String appUserId = Superwall.Companion.getInstance().getDependencyContainer$superwall_release().getIdentityManager().getAppUserId();
                if (appUserId != null) {
                    return UserId.m28constructorimpl(appUserId);
                }
                return null;
            }
        } : function4, (i10 & 1024) != 0 ? new Function0() { // from class: com.superwall.sdk.web.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebPaywallRedeemer._init_$lambda$1();
            }
        } : function5, (i10 & 2048) != 0 ? new Function0() { // from class: com.superwall.sdk.web.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebPaywallRedeemer._init_$lambda$2();
            }
        } : function6, (i10 & 4096) != 0 ? new AnonymousClass5(null) : function7, function8, (i10 & 16384) != 0 ? new AnonymousClass6(null) : function9, (i10 & 32768) != 0 ? new AnonymousClass7(null) : function10, function11, function12, function13, function14, function15, function16);
    }
}
