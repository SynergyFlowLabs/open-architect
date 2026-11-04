package androidx.privacysandbox.ads.adservices.signals;

import android.adservices.signals.ProtectedSignalsManager;
import android.adservices.signals.UpdateSignalsRequest;
import androidx.annotation.a1;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.core.os.w;
import androidx.privacysandbox.ads.adservices.common.q;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q.c
@e.a({"NewApi", "ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
@x0(extension = 1000000, version = 12)
@SourceDebugExtension({"SMAP\nProtectedSignalsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtectedSignalsManagerImpl.kt\nandroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,55:1\n314#2,11:56\n*S KotlinDebug\n*F\n+ 1 ProtectedSignalsManagerImpl.kt\nandroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl\n*L\n40#1:56,11\n*E\n"})
public class g extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ProtectedSignalsManager f73678c;

    public g(@NotNull ProtectedSignalsManager protectedSignalsManager) {
        Intrinsics.checkNotNullParameter(protectedSignalsManager, "protectedSignalsManager");
        this.f73678c = protectedSignalsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateSignalsRequest e(h hVar) {
        f.a();
        UpdateSignalsRequest updateSignalsRequestBuild = e.a(hVar.a()).build();
        Intrinsics.checkNotNullExpressionValue(updateSignalsRequestBuild, "Builder(request.updateUri).build()");
        return updateSignalsRequestBuild;
    }

    @a1("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    @u
    static /* synthetic */ Object f(g gVar, h hVar, kotlin.coroutines.d<? super Unit> dVar) {
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        gVar.f73678c.updateSignals(gVar.e(hVar), new androidx.media3.exoplayer.offline.b(), w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @Override // androidx.privacysandbox.ads.adservices.signals.b
    @a1("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    @u
    @Nullable
    public Object b(@NotNull h hVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return f(this, hVar, dVar);
    }
}
