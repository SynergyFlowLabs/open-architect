package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import androidx.annotation.a1;
import androidx.annotation.b1;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
@e.a({"NewApi", "ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
@SourceDebugExtension({"SMAP\nCustomAudienceManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,148:1\n314#2,11:149\n314#2,11:160\n*S KotlinDebug\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon\n*L\n44#1:149,11\n67#1:160,11\n*E\n"})
public class g0 extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CustomAudienceManager f73524b;

    @x0.a({@x0(extension = 1000000, version = 10), @x0(extension = 31, version = 10)})
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0706a f73525a = new C0706a(null);

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.customaudience.g0$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCustomAudienceManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,148:1\n314#2,11:149\n*S KotlinDebug\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl$Companion\n*L\n137#1:149,11\n*E\n"})
        public static final class C0706a {
            public /* synthetic */ C0706a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @androidx.annotation.u
            @Nullable
            public final Object a(@NotNull CustomAudienceManager customAudienceManager, @NotNull o0 o0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
                pVar.p0();
                customAudienceManager.fetchAndJoinCustomAudience(o0Var.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
                Object objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
            }

            private C0706a() {
            }
        }

        private a() {
        }
    }

    public g0(@NotNull CustomAudienceManager customAudienceManager) {
        Intrinsics.checkNotNullParameter(customAudienceManager, "customAudienceManager");
        this.f73524b = customAudienceManager;
    }

    private final List<AdData> g(List<androidx.privacysandbox.ads.adservices.common.h> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.privacysandbox.ads.adservices.common.h> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    private final CustomAudience h(androidx.privacysandbox.ads.adservices.customaudience.a aVar) {
        CustomAudience.Builder trustedBiddingData = w.a().setActivationTime(aVar.a()).setAds(g(aVar.b())).setBiddingLogicUri(aVar.c()).setBuyer(aVar.d().a()).setDailyUpdateUri(aVar.e()).setExpirationTime(aVar.f()).setName(aVar.g()).setTrustedBiddingData(k(aVar.h()));
        androidx.privacysandbox.ads.adservices.common.n nVarI = aVar.i();
        CustomAudience customAudienceBuild = trustedBiddingData.setUserBiddingSignals(nVarI != null ? nVarI.a() : null).build();
        Intrinsics.checkNotNullExpressionValue(customAudienceBuild, "Builder()\n            .s…s())\n            .build()");
        return customAudienceBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JoinCustomAudienceRequest i(p0 p0Var) {
        JoinCustomAudienceRequest joinCustomAudienceRequestBuild = v.a().setCustomAudience(h(p0Var.a())).build();
        Intrinsics.checkNotNullExpressionValue(joinCustomAudienceRequestBuild, "Builder()\n            .s…ce))\n            .build()");
        return joinCustomAudienceRequestBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LeaveCustomAudienceRequest j(q0 q0Var) {
        LeaveCustomAudienceRequest leaveCustomAudienceRequestBuild = t.a().setBuyer(q0Var.a().a()).setName(q0Var.b()).build();
        Intrinsics.checkNotNullExpressionValue(leaveCustomAudienceRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return leaveCustomAudienceRequestBuild;
    }

    private final TrustedBiddingData k(r0 r0Var) {
        if (r0Var == null) {
            return null;
        }
        return u.a().setTrustedBiddingKeys(r0Var.a()).setTrustedBiddingUri(r0Var.b()).build();
    }

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    static /* synthetic */ Object l(g0 g0Var, o0 o0Var, kotlin.coroutines.d<? super Unit> dVar) {
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
        if (aVar.a() < 10 && aVar.b() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        Object objA = a.f73525a.a(g0Var.f73524b, o0Var, dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    static /* synthetic */ Object n(g0 g0Var, p0 p0Var, kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        g0Var.m().joinCustomAudience(g0Var.i(p0Var), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    static /* synthetic */ Object o(g0 g0Var, q0 q0Var, kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        g0Var.m().leaveCustomAudience(g0Var.j(q0Var), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.b
    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    @Nullable
    public Object a(@NotNull o0 o0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return l(this, o0Var, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.b
    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    @Nullable
    public Object b(@NotNull p0 p0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return n(this, p0Var, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.b
    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.u
    @Nullable
    public Object c(@NotNull q0 q0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return o(this, q0Var, dVar);
    }

    @NotNull
    protected final CustomAudienceManager m() {
        return this.f73524b;
    }
}
