package androidx.compose.animation.core;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,115:1\n32#2:116\n80#3:117\n53#3,3:119\n53#3,3:124\n53#3,3:128\n80#3:132\n30#4:118\n123#5:122\n188#5:123\n33#6:127\n30#7:131\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n40#1:116\n40#1:117\n48#1:119,3\n72#1:124,3\n80#1:128,3\n88#1:132\n48#1:118\n64#1:122\n72#1:123\n80#1:127\n88#1:131\n*E\n"})
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f13054a = 0.1f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f13055b = 0.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final n0.j f13056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Map<z3<?, ?>, Float> f13057d;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f13056c = new n0.j(0.5f, 0.5f, 0.5f, 0.5f);
        z3<Integer, s> z3VarQ = t4.Q(kotlin.jvm.internal.i0.f312739a);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pair = TuplesKt.to(z3VarQ, fValueOf2);
        Pair pair2 = TuplesKt.to(t4.O(androidx.compose.ui.unit.u.f42720b), fValueOf2);
        Pair pair3 = TuplesKt.to(t4.N(androidx.compose.ui.unit.q.f42709b), fValueOf2);
        Pair pair4 = TuplesKt.to(t4.P(kotlin.jvm.internal.z.f312833a), Float.valueOf(0.01f));
        Pair pair5 = TuplesKt.to(t4.S(n0.j.f332705e), fValueOf);
        Pair pair6 = TuplesKt.to(t4.T(n0.n.f332724b), fValueOf);
        Pair pair7 = TuplesKt.to(t4.R(n0.g.f332700b), fValueOf);
        z3<androidx.compose.ui.unit.h, s> z3VarL = t4.L(androidx.compose.ui.unit.h.f42689b);
        Float fValueOf3 = Float.valueOf(0.1f);
        f13057d = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, TuplesKt.to(z3VarL, fValueOf3), TuplesKt.to(t4.M(androidx.compose.ui.unit.j.f42694b), fValueOf3));
    }

    public static final float a(@NotNull androidx.compose.ui.unit.h.a aVar) {
        return androidx.compose.ui.unit.h.r(0.1f);
    }

    public static final int b(@NotNull kotlin.jvm.internal.i0 i0Var) {
        return 1;
    }

    public static final long c(@NotNull androidx.compose.ui.unit.j.a aVar) {
        androidx.compose.ui.unit.h.a aVar2 = androidx.compose.ui.unit.h.f42689b;
        float fA = a(aVar2);
        float fA2 = a(aVar2);
        return androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & com.rabbitmq.client.k0.f265952a));
    }

    public static final long d(@NotNull androidx.compose.ui.unit.q.a aVar) {
        long j10 = 1;
        return androidx.compose.ui.unit.q.f((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
    }

    public static final long e(@NotNull androidx.compose.ui.unit.u.a aVar) {
        long j10 = 1;
        return androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
    }

    public static final long f(@NotNull n0.g.a aVar) {
        return n0.g.g((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & com.rabbitmq.client.k0.f265952a));
    }

    public static final long g(@NotNull n0.n.a aVar) {
        return n0.n.f((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & com.rabbitmq.client.k0.f265952a));
    }

    @NotNull
    public static final n0.j h(@NotNull n0.j.a aVar) {
        return f13056c;
    }

    @NotNull
    public static final Map<z3<?, ?>, Float> i() {
        return f13057d;
    }

    public static /* synthetic */ void j() {
    }
}
