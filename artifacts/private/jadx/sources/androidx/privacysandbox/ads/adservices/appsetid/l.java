package androidx.privacysandbox.ads.adservices.appsetid;

import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdManager;
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
@SourceDebugExtension({"SMAP\nAppSetIdManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AppSetIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon\n*L\n42#1:54,11\n*E\n"})
public class l extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AppSetIdManager f73476b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", f = "AppSetIdManagerImplCommon.kt", i = {}, l = {38}, m = "getAppSetId$suspendImpl", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f73477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f73478b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f73480d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f73478b = obj;
            this.f73480d |= Integer.MIN_VALUE;
            return l.f(l.this, this);
        }
    }

    public l(@NotNull AppSetIdManager mAppSetIdManager) {
        Intrinsics.checkNotNullParameter(mAppSetIdManager, "mAppSetIdManager");
        this.f73476b = mAppSetIdManager;
    }

    private final androidx.privacysandbox.ads.adservices.appsetid.a e(AppSetId appSetId) {
        if (appSetId.getScope() == 1) {
            String id2 = appSetId.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "response.id");
            return new androidx.privacysandbox.ads.adservices.appsetid.a(id2, 1);
        }
        String id3 = appSetId.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "response.id");
        return new androidx.privacysandbox.ads.adservices.appsetid.a(id3, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @u
    static /* synthetic */ Object f(l lVar, kotlin.coroutines.d<? super androidx.privacysandbox.ads.adservices.appsetid.a> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f73480d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f73480d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = lVar.new a(dVar);
            }
        } else {
            aVar = lVar.new a(dVar);
        }
        Object objG = aVar.f73478b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f73480d;
        if (i11 == 0) {
            ResultKt.m(objG);
            aVar.f73477a = lVar;
            aVar.f73480d = 1;
            objG = lVar.g(aVar);
            if (objG == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (l) aVar.f73477a;
            ResultKt.m(objG);
        }
        return lVar.e(i.a(objG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(kotlin.coroutines.d<? super AppSetId> dVar) {
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        this.f73476b.getAppSetId(new androidx.media3.exoplayer.offline.b(), w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @Override // androidx.privacysandbox.ads.adservices.appsetid.b
    @u
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super androidx.privacysandbox.ads.adservices.appsetid.a> dVar) {
        return f(this, dVar);
    }
}
