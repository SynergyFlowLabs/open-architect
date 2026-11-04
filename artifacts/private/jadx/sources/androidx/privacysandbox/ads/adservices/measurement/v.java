package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.a1;
import androidx.annotation.b1;
import androidx.annotation.x0;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@x0.a({@x0(extension = 1000000, version = 5), @x0(extension = 31, version = 9)})
@e.a({"NewApi", "ClassVerificationFailure"})
@b1({b1.a.LIBRARY})
@SourceDebugExtension({"SMAP\nMeasurementManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,130:1\n314#2,11:131\n314#2,11:142\n314#2,11:153\n314#2,11:164\n314#2,11:175\n314#2,11:186\n*S KotlinDebug\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon\n*L\n44#1:131,11\n56#1:142,11\n69#1:153,11\n81#1:164,11\n111#1:175,11\n123#1:186,11\n*E\n"})
public class v extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final MeasurementManager f73660d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMeasurementManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon$registerSource$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1855#2,2:131\n*S KotlinDebug\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon$registerSource$4\n*L\n94#1:131,2\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f73661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f73662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f73663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f73664d;

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.v$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nMeasurementManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon$registerSource$4$1$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,130:1\n314#2,11:131\n*S KotlinDebug\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon$registerSource$4$1$1\n*L\n96#1:131,11\n*E\n"})
        static final class C0724a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f73665a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f73666b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f73667c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f73668d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ v f73669e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Uri f73670f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ w f73671g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0724a(v vVar, Uri uri, w wVar, kotlin.coroutines.d<? super C0724a> dVar) {
                super(2, dVar);
                this.f73669e = vVar;
                this.f73670f = uri;
                this.f73671g = wVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0724a(this.f73669e, this.f73670f, this.f73671g, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73668d;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    v vVar = this.f73669e;
                    Uri uri = this.f73670f;
                    w wVar = this.f73671g;
                    this.f73665a = vVar;
                    this.f73666b = uri;
                    this.f73667c = wVar;
                    this.f73668d = 1;
                    kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(this), 1);
                    pVar.p0();
                    vVar.j().registerSource(uri, wVar.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
                    Object objU = pVar.u();
                    if (objU == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(this);
                    }
                    if (objU == objL) {
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
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0724a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w wVar, v vVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f73663c = wVar;
            this.f73664d = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f73663c, this.f73664d, dVar);
            aVar.f73662b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f73661a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f73662b;
            List<Uri> listB = this.f73663c.b();
            v vVar = this.f73664d;
            w wVar = this.f73663c;
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.k.f(s0Var, null, null, new C0724a(vVar, (Uri) it.next(), wVar, null), 3, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public v(@NotNull MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f73660d = mMeasurementManager;
    }

    @androidx.annotation.u
    static /* synthetic */ Object i(v vVar, i iVar, kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        vVar.j().deleteRegistrations(iVar.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    static /* synthetic */ Object k(v vVar, kotlin.coroutines.d<? super Integer> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        vVar.j().getMeasurementApiStatus(new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    static /* synthetic */ Object l(v vVar, Uri uri, InputEvent inputEvent, kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        vVar.j().registerSource(uri, inputEvent, new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    @androidx.privacysandbox.ads.adservices.common.q.e
    static /* synthetic */ Object m(v vVar, w wVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = t0.g(new a(wVar, vVar, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    static /* synthetic */ Object n(v vVar, Uri uri, kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        vVar.j().registerTrigger(uri, new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    static /* synthetic */ Object o(v vVar, j0 j0Var, kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        vVar.j().registerWebSource(j0Var.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    static /* synthetic */ Object p(v vVar, s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        vVar.j().registerWebTrigger(s0Var.a(), new androidx.media3.exoplayer.offline.b(), androidx.core.os.w.a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.j
    @androidx.annotation.u
    @Nullable
    public Object a(@NotNull i iVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return i(this, iVar, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.j
    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super Integer> dVar) {
        return k(this, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.j
    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    @Nullable
    public Object d(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return l(this, uri, inputEvent, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.j
    @androidx.privacysandbox.ads.adservices.common.q.e
    @Nullable
    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    public Object e(@NotNull w wVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return m(this, wVar, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.j
    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    @Nullable
    public Object f(@NotNull Uri uri, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return n(this, uri, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.j
    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    @Nullable
    public Object g(@NotNull j0 j0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return o(this, j0Var, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.j
    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.annotation.u
    @Nullable
    public Object h(@NotNull s0 s0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return p(this, s0Var, dVar);
    }

    @NotNull
    protected final MeasurementManager j() {
        return this.f73660d;
    }
}
