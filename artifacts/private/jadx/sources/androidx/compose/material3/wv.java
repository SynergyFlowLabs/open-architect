package androidx.compose.material3;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@af
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2758:1\n85#2:2759\n117#2,2:2760\n85#2:2762\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarState\n*L\n731#1:2759\n731#1:2760,2\n759#1:2762\n*E\n"})
public final class wv {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f34301f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34302g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f34303h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f34304i = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f34305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f34306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f34307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f34308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7 f34309e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(androidx.compose.runtime.saveable.g0 g0Var, wv wvVar) {
            return CollectionsKt.listOf(Float.valueOf(wvVar.g()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wv e(androidx.compose.animation.core.o oVar, androidx.compose.animation.core.o oVar2, List list) {
            return new wv(new androidx.compose.animation.core.c(list.get(0), androidx.compose.animation.core.t4.P(kotlin.jvm.internal.z.f312833a), null, null, 12, null), oVar, oVar2, null);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<wv, ?> c(@NotNull final androidx.compose.animation.core.o<Float> oVar, @NotNull final androidx.compose.animation.core.o<Float> oVar2) {
            return androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.material3.uv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return wv.a.d((androidx.compose.runtime.saveable.g0) obj, (wv) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.vv
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return wv.a.e(oVar, oVar2, (List) obj);
                }
            });
        }

        private a() {
        }
    }

    public /* synthetic */ wv(androidx.compose.animation.core.c cVar, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.o oVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this((androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s>) cVar, (androidx.compose.animation.core.o<Float>) oVar, (androidx.compose.animation.core.o<Float>) oVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xv d(wv wvVar) {
        return wvVar.f34305a.v().floatValue() == 0.0f ? xv.Collapsed : xv.Expanded;
    }

    @Nullable
    public final Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 3 >> 0;
        Object objI = androidx.compose.animation.core.c.i(this.f34305a, kotlin.coroutines.jvm.internal.b.e(0.0f), this.f34307c, null, null, dVar, 12, null);
        return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
    }

    @Nullable
    public final Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 5 | 0;
        Object objI = androidx.compose.animation.core.c.i(this.f34305a, kotlin.coroutines.jvm.internal.b.e(1.0f), this.f34306b, null, null, dVar, 12, null);
        return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
    }

    @Nullable
    public final androidx.compose.ui.layout.g0 e() {
        return (androidx.compose.ui.layout.g0) this.f34308d.getValue();
    }

    @NotNull
    public final xv f() {
        return (xv) this.f34309e.getValue();
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float g() {
        int i10 = 4 & 0;
        return kotlin.ranges.r.H(this.f34305a.v().floatValue(), 0.0f, 1.0f);
    }

    @NotNull
    public final xv h() {
        return this.f34305a.s().floatValue() == 1.0f ? xv.Expanded : xv.Collapsed;
    }

    public final boolean i() {
        return this.f34305a.y();
    }

    public final void j(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f34308d.setValue(g0Var);
    }

    @Nullable
    public final Object k(float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = this.f34305a.C(kotlin.coroutines.jvm.internal.b.e(f10), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    private wv(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, androidx.compose.animation.core.o<Float> oVar, androidx.compose.animation.core.o<Float> oVar2) {
        this.f34305a = cVar;
        this.f34306b = oVar;
        this.f34307c = oVar2;
        this.f34308d = androidx.compose.runtime.d7.g(null, null, 2, null);
        this.f34309e = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.tv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return wv.d(this.f33254a);
            }
        });
    }

    public wv(@NotNull xv xvVar, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull androidx.compose.animation.core.o<Float> oVar2) {
        this((androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s>) androidx.compose.animation.core.d.b(xvVar == xv.Expanded ? 1.0f : 0.0f, 0.0f, 2, null), oVar, oVar2);
    }
}
