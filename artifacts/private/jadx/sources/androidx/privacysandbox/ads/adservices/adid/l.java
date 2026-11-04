package androidx.privacysandbox.ads.adservices.adid;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import androidx.annotation.a1;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.core.os.w;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
@e.a({"ClassVerificationFailure", "NewApi"})
@b1({b1.a.LIBRARY})
@SourceDebugExtension({"SMAP\nAdIdManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AdIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon\n*L\n45#1:54,11\n*E\n"})
public class l extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AdIdManager f73398b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", f = "AdIdManagerImplCommon.kt", i = {}, l = {40}, m = "getAdId$suspendImpl", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f73399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f73400b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f73402d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f73400b = obj;
            this.f73402d |= Integer.MIN_VALUE;
            return l.f(l.this, this);
        }
    }

    public l(@NotNull AdIdManager mAdIdManager) {
        Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
        this.f73398b = mAdIdManager;
    }

    private final androidx.privacysandbox.ads.adservices.adid.a e(AdId adId) {
        String adId2 = adId.getAdId();
        Intrinsics.checkNotNullExpressionValue(adId2, "response.adId");
        return new androidx.privacysandbox.ads.adservices.adid.a(adId2, adId.isLimitAdTrackingEnabled());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @a1("android.permission.ACCESS_ADSERVICES_AD_ID")
    @u
    static /* synthetic */ Object f(l lVar, kotlin.coroutines.d<? super androidx.privacysandbox.ads.adservices.adid.a> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f73402d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f73402d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = lVar.new a(dVar);
            }
        } else {
            aVar = lVar.new a(dVar);
        }
        Object objG = aVar.f73400b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f73402d;
        if (i11 == 0) {
            ResultKt.m(objG);
            aVar.f73399a = lVar;
            aVar.f73402d = 1;
            objG = lVar.g(aVar);
            if (objG == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (l) aVar.f73399a;
            ResultKt.m(objG);
        }
        return lVar.e(h.a(objG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @a1("android.permission.ACCESS_ADSERVICES_AD_ID")
    public final Object g(kotlin.coroutines.d<? super AdId> dVar) {
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        this.f73398b.getAdId(new androidx.media3.exoplayer.offline.b(), w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @Override // androidx.privacysandbox.ads.adservices.adid.b
    @a1("android.permission.ACCESS_ADSERVICES_AD_ID")
    @u
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super androidx.privacysandbox.ads.adservices.adid.a> dVar) {
        return f(this, dVar);
    }
}
