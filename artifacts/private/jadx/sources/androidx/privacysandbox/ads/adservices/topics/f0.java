package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import androidx.annotation.a1;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
@e.a({"NewApi"})
@b1({b1.a.LIBRARY})
@SourceDebugExtension({"SMAP\nTopicsManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,62:1\n314#2,11:63\n*S KotlinDebug\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n*L\n46#1:63,11\n*E\n"})
public class f0 extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final TopicsManager f73687b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", i = {}, l = {40}, m = "getTopics$suspendImpl", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f73688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f73689b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f73691d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f73689b = obj;
            this.f73691d |= Integer.MIN_VALUE;
            return f0.g(f0.this, null, this);
        }
    }

    public f0(@NotNull TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.f73687b = mTopicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @a1("android.permission.ACCESS_ADSERVICES_TOPICS")
    @androidx.annotation.u
    static /* synthetic */ Object g(f0 f0Var, b bVar, kotlin.coroutines.d<? super h> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f73691d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f73691d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = f0Var.new a(dVar);
            }
        } else {
            aVar = f0Var.new a(dVar);
        }
        Object objH = aVar.f73689b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f73691d;
        if (i11 == 0) {
            ResultKt.m(objH);
            GetTopicsRequest getTopicsRequestE = f0Var.e(bVar);
            aVar.f73688a = f0Var;
            aVar.f73691d = 1;
            objH = f0Var.h(getTopicsRequestE, aVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = (f0) aVar.f73688a;
            ResultKt.m(objH);
        }
        return f0Var.f(d0.a(objH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @a1("android.permission.ACCESS_ADSERVICES_TOPICS")
    public final Object h(GetTopicsRequest getTopicsRequest, kotlin.coroutines.d<? super GetTopicsResponse> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        this.f73687b.getTopics(getTopicsRequest, new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.u
    @a1("android.permission.ACCESS_ADSERVICES_TOPICS")
    @androidx.annotation.u
    @Nullable
    public Object a(@NotNull b bVar, @NotNull kotlin.coroutines.d<? super h> dVar) {
        return g(this, bVar, dVar);
    }

    @NotNull
    public GetTopicsRequest e(@NotNull b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return g.f73692a.b(request);
    }

    @NotNull
    public h f(@NotNull GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return s.f73695a.a(response);
    }
}
