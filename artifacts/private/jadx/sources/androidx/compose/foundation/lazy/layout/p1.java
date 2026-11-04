package androidx.compose.foundation.lazy.layout;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutScrollScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,297:1\n42#1,4:303\n42#1,4:307\n42#1,4:311\n42#1,4:315\n42#1,4:319\n42#1,4:323\n42#1,4:327\n42#1,4:331\n42#1,4:335\n42#1,4:339\n42#1,4:343\n42#1,4:347\n42#1,4:351\n42#1,4:355\n97#2,4:298\n1#3:302\n113#4:359\n113#4:360\n113#4:361\n*S KotlinDebug\n*F\n+ 1 LazyLayoutScrollScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt\n*L\n169#1:303,4\n263#1:307,4\n179#1:311,4\n189#1:315,4\n195#1:319,4\n198#1:323,4\n206#1:327,4\n211#1:331,4\n221#1:335,4\n229#1:339,4\n239#1:343,4\n250#1:347,4\n275#1:351,4\n280#1:355,4\n116#1:298,4\n35#1:359\n36#1:360\n37#1:361\n*E\n"})
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f17508a = androidx.compose.ui.unit.h.r(2500);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f17509b = androidx.compose.ui.unit.h.r(1500);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f17510c = androidx.compose.ui.unit.h.r(50);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f17511d = false;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", f = "LazyLayoutScrollScope.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {177, 264}, m = "animateScrollToItem", n = {"$this$animateScrollToItem", "loop", "anim", "loops", FirebaseAnalytics.d.f120644b0, "scrollOffset", "numOfItemsForTeleport", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$animateScrollToItem", FirebaseAnalytics.d.f120644b0, "scrollOffset"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "F$0", "F$1", "F$2", "I$3", "L$0", "I$0", "I$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f17514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f17517f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17518g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17519h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f17520i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f17521j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f17522k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f17523l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f17524m;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17523l = obj;
            this.f17524m |= Integer.MIN_VALUE;
            return p1.c(null, 0, 0, 0, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fc A[Catch: o -> 0x0217, TryCatch #9 {o -> 0x0217, blocks: (B:35:0x00f8, B:37:0x00fc, B:39:0x0102, B:53:0x0136, B:57:0x0174, B:61:0x017c), top: B:123:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0171  */
    /* JADX WARN: Code duplicated, block: B:56:0x0173  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177  */
    /* JADX WARN: Code duplicated, block: B:60:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, androidx.compose.animation.core.q] */
    /* JADX WARN: Type inference failed for: r8v17, types: [T, androidx.compose.animation.core.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01d6 -> B:18:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.layout.m1 r37, int r38, int r39, int r40, @org.jetbrains.annotations.NotNull androidx.compose.ui.unit.d r41, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r42) {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.p1.c(androidx.compose.foundation.lazy.layout.m1, int, int, int, androidx.compose.ui.unit.d, kotlin.coroutines.d):java.lang.Object");
    }

    private static final boolean d(boolean z10, m1 m1Var, int i10, int i11) {
        if (z10) {
            if (m1Var.c() > i10) {
                return true;
            }
            return m1Var.c() == i10 && m1Var.i() > i11;
        }
        if (m1Var.c() < i10) {
            return true;
        }
        return m1Var.c() == i10 && m1Var.i() < i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit e(m1 m1Var, int i10, float f10, kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.a aVar, boolean z10, float f11, kotlin.jvm.internal.i1.f fVar, int i11, int i12, kotlin.jvm.internal.i1.h hVar, androidx.compose.animation.core.n nVar) {
        if (!h(m1Var, i10)) {
            float fA = (f10 > 0.0f ? kotlin.ranges.r.A(((Number) nVar.g()).floatValue(), f10) : kotlin.ranges.r.t(((Number) nVar.g()).floatValue(), f10)) - eVar.f312748a;
            float f12 = m1Var.f(fA);
            if (!h(m1Var, i10) && !d(z10, m1Var, i10, i12)) {
                if (fA != f12) {
                    nVar.a();
                    aVar.f312744a = false;
                    return Unit.f312394a;
                }
                eVar.f312748a += fA;
                if (z10) {
                    if (((Number) nVar.g()).floatValue() > f11) {
                        nVar.a();
                    }
                } else if (((Number) nVar.g()).floatValue() < (-f11)) {
                    nVar.a();
                }
                if (z10) {
                    if (fVar.f312749a >= 2 && i10 - m1Var.d() > i11) {
                        m1Var.e(i10 - i11, 0);
                    }
                } else if (fVar.f312749a >= 2 && m1Var.c() - i10 > i11) {
                    m1Var.e(i11 + i10, 0);
                }
            }
        }
        if (!d(z10, m1Var, i10, i12)) {
            if (h(m1Var, i10)) {
                throw new o(m1.b(m1Var, i10, 0, 2, null), (androidx.compose.animation.core.q) hVar.f312751a);
            }
            return Unit.f312394a;
        }
        m1Var.e(i10, i12);
        aVar.f312744a = false;
        nVar.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(float f10, kotlin.jvm.internal.i1.e eVar, m1 m1Var, androidx.compose.animation.core.n nVar) {
        float fT = 0.0f;
        if (f10 > 0.0f) {
            fT = kotlin.ranges.r.A(((Number) nVar.g()).floatValue(), f10);
        } else if (f10 < 0.0f) {
            fT = kotlin.ranges.r.t(((Number) nVar.g()).floatValue(), f10);
        }
        float f11 = fT - eVar.f312748a;
        if (f11 != m1Var.f(f11) || fT != ((Number) nVar.g()).floatValue()) {
            nVar.a();
        }
        eVar.f312748a += f11;
        return Unit.f312394a;
    }

    private static final void g(Function0<String> function0) {
    }

    public static final boolean h(@NotNull m1 m1Var, int i10) {
        return i10 <= m1Var.d() && m1Var.c() <= i10;
    }
}
