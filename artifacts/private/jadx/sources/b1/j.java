package b1;

import androidx.compose.animation.core.g1;
import androidx.compose.animation.core.g2;
import androidx.compose.animation.core.i1;
import androidx.compose.animation.core.l2;
import androidx.compose.animation.core.l3;
import androidx.compose.animation.core.o;
import androidx.compose.animation.core.q1;
import androidx.compose.animation.core.t2;
import androidx.compose.animation.core.u2;
import androidx.compose.animation.core.w;
import androidx.compose.animation.core.x4;
import androidx.compose.animation.core.y3;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import com.rabbitmq.client.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.android.kt\nandroidx/compose/ui/tooling/animation/clock/Utils_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,255:1\n1368#2:256\n1454#2,5:257\n30#3:262\n30#3:264\n80#4:263\n80#4:265\n80#4:267\n80#4:269\n53#4,3:271\n53#4,3:275\n53#4,3:279\n53#4,3:283\n32#5:266\n32#5:268\n33#6:270\n33#6:274\n30#7:278\n30#7:282\n123#8:286\n118#8:287\n113#8:288\n*S KotlinDebug\n*F\n+ 1 Utils.android.kt\nandroidx/compose/ui/tooling/animation/clock/Utils_androidKt\n*L\n56#1:256\n56#1:257,5\n189#1:262\n190#1:264\n189#1:263\n190#1:265\n194#1:267\n195#1:269\n199#1:271,3\n200#1:275,3\n204#1:279,3\n205#1:283,3\n194#1:266\n195#1:268\n199#1:270\n200#1:274\n204#1:278\n205#1:282\n161#1:286\n161#1:287\n161#1:288\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<String> f77527a = CollectionsKt.listOf("TransformOriginInterruptionHandling");

    @NotNull
    public static final List<l3<?>.d<?, ?>> d(@NotNull l3<?> l3Var) {
        List<l3<?>> listA = l3Var.A();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, d((l3) it.next()));
        }
        return CollectionsKt.plus((Collection) l3Var.o(), (Iterable) arrayList);
    }

    @NotNull
    public static final <T, V extends w> TransitionInfo e(@NotNull final androidx.compose.animation.core.g<T, V> gVar, @NotNull String str, @NotNull final o<T> oVar, final long j10) {
        final long jS = s(gVar.e());
        final f0 f0VarC = g0.c(new Function0() { // from class: b1.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(j.k(oVar));
            }
        });
        return new TransitionInfo(str, oVar.getClass().getName(), l(f0VarC), jS, n(g0.c(new Function0() { // from class: b1.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.m(gVar, jS, j10, f0VarC);
            }
        })));
    }

    @NotNull
    public static final <T, V extends w> TransitionInfo f(@NotNull final i1.a<T, V> aVar, final long j10, final long j11) {
        final long j12 = 0;
        return new TransitionInfo(aVar.g(), aVar.b().getClass().getName(), 0L, j11, p(g0.c(new Function0() { // from class: b1.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.o(j12, aVar, j11, j10);
            }
        })));
    }

    @NotNull
    public static final <T, V extends w, S> TransitionInfo g(@NotNull l3<S>.d<T, V> dVar, long j10) {
        return e(dVar.b(), dVar.p(), dVar.d(), j10);
    }

    public static /* synthetic */ TransitionInfo h(androidx.compose.animation.core.g gVar, String str, o oVar, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 1;
        }
        return e(gVar, str, oVar, j10);
    }

    public static /* synthetic */ TransitionInfo i(i1.a aVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        return f(aVar, j10, j11);
    }

    public static /* synthetic */ TransitionInfo j(l3.d dVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        return g(dVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(o oVar) {
        Number numberValueOf = 0L;
        if (oVar instanceof y3) {
            numberValueOf = Integer.valueOf(((y3) oVar).h());
        } else if (oVar instanceof l2) {
            numberValueOf = Integer.valueOf(((l2) oVar).h());
        } else if (oVar instanceof q1) {
            numberValueOf = Integer.valueOf(((q1) oVar).h().d());
        } else if (oVar instanceof g2) {
            g2 g2Var = (g2) oVar;
            if (u2.f(t2.h(g2Var.i()), u2.f13317b.a())) {
                numberValueOf = Integer.valueOf(t2.g(g2Var.i()));
            }
        } else if (oVar instanceof g1) {
            g1 g1Var = (g1) oVar;
            if (u2.f(t2.h(g1Var.i()), u2.f13317b.a())) {
                numberValueOf = Integer.valueOf(t2.g(g1Var.i()));
            }
        } else if (oVar instanceof x4) {
            numberValueOf = Integer.valueOf(((x4) oVar).k());
        }
        return numberValueOf.longValue();
    }

    private static final long l(f0<Long> f0Var) {
        return f0Var.getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map m(androidx.compose.animation.core.g gVar, long j10, long j11, f0 f0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Long.valueOf(l(f0Var)), gVar.g(r(l(f0Var))));
        linkedHashMap.put(Long.valueOf(j10), gVar.g(r(j10)));
        long jL = l(f0Var);
        while (jL <= j10) {
            linkedHashMap.put(Long.valueOf(jL), gVar.g(r(jL)));
            jL += j11;
        }
        return linkedHashMap;
    }

    private static final <T> Map<Long, T> n(f0<? extends Map<Long, T>> f0Var) {
        return f0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map o(long j10, i1.a aVar, long j11, long j12) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Long.valueOf(j10), aVar.a().g(r(j10)));
        linkedHashMap.put(Long.valueOf(j11), aVar.a().g(r(j11)));
        while (j10 <= j11) {
            linkedHashMap.put(Long.valueOf(j10), aVar.a().g(r(j10)));
            j10 += j12;
        }
        return linkedHashMap;
    }

    private static final <T> Map<Long, T> p(f0<? extends Map<Long, T>> f0Var) {
        return f0Var.getValue();
    }

    @NotNull
    public static final List<String> q() {
        return f77527a;
    }

    public static final long r(long j10) {
        return j10 * 1000000;
    }

    public static final long s(long j10) {
        return (j10 + ((long) 999999)) / ((long) 1000000);
    }

    @Nullable
    public static final <T> c1.c<T> t(T t10, @NotNull Object obj, @Nullable Object obj2) {
        c1.c<T> cVar;
        if (t10 == null) {
            return null;
        }
        c1.c<T> cVar2 = (c1.c<T>) x(t10, obj, obj2);
        if (cVar2 != null) {
            return cVar2;
        }
        if (!v(obj, obj2)) {
            return null;
        }
        Intrinsics.checkNotNull(obj2);
        if (w(t10, obj, obj2)) {
            return new c1.c<>(obj, obj2);
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            try {
                if (t10 instanceof u) {
                    Object obj3 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj3).intValue();
                    Object obj4 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    u uVarB = u.b(u.e((((long) iIntValue) << 32) | (((long) ((Integer) obj4).intValue()) & k0.f265952a)));
                    Object obj5 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue2 = ((Integer) obj5).intValue();
                    Object obj6 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
                    cVar = new c1.c<>(uVarB, u.b(u.e((((long) ((Integer) obj6).intValue()) & k0.f265952a) | (((long) iIntValue2) << 32))));
                } else if (t10 instanceof q) {
                    Object obj7 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue3 = ((Integer) obj7).intValue();
                    Object obj8 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
                    q qVarC = q.c(q.f((((long) iIntValue3) << 32) | (((long) ((Integer) obj8).intValue()) & k0.f265952a)));
                    Object obj9 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue4 = ((Integer) obj9).intValue();
                    Object obj10 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Int");
                    cVar = new c1.c<>(qVarC, q.c(q.f((((long) ((Integer) obj10).intValue()) & k0.f265952a) | (((long) iIntValue4) << 32))));
                } else if (t10 instanceof n) {
                    Object obj11 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue = ((Float) obj11).floatValue();
                    Object obj12 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Float");
                    n nVarC = n.c(n.f((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(((Float) obj12).floatValue())) & k0.f265952a)));
                    Object obj13 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue2 = ((Float) obj13).floatValue();
                    Object obj14 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Float");
                    cVar = new c1.c<>(nVarC, n.c(n.f((((long) Float.floatToRawIntBits(((Float) obj14).floatValue())) & k0.f265952a) | (Float.floatToRawIntBits(fFloatValue2) << 32))));
                } else if (t10 instanceof n0.g) {
                    Object obj15 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue3 = ((Float) obj15).floatValue();
                    Object obj16 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Float");
                    n0.g gVarD = n0.g.d(n0.g.g((((long) Float.floatToRawIntBits(fFloatValue3)) << 32) | (((long) Float.floatToRawIntBits(((Float) obj16).floatValue())) & k0.f265952a)));
                    Object obj17 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue4 = ((Float) obj17).floatValue();
                    Object obj18 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Float");
                    cVar = new c1.c<>(gVarD, n0.g.d(n0.g.g((((long) Float.floatToRawIntBits(((Float) obj18).floatValue())) & k0.f265952a) | (Float.floatToRawIntBits(fFloatValue4) << 32))));
                } else if (t10 instanceof n0.j) {
                    Object obj19 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue5 = ((Float) obj19).floatValue();
                    Object obj20 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue6 = ((Float) obj20).floatValue();
                    Object obj21 = ((List) obj).get(2);
                    Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue7 = ((Float) obj21).floatValue();
                    Object obj22 = ((List) obj).get(3);
                    Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Float");
                    n0.j jVar = new n0.j(fFloatValue5, fFloatValue6, fFloatValue7, ((Float) obj22).floatValue());
                    Object obj23 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue8 = ((Float) obj23).floatValue();
                    Object obj24 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue9 = ((Float) obj24).floatValue();
                    Object obj25 = ((List) obj2).get(2);
                    Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue10 = ((Float) obj25).floatValue();
                    Object obj26 = ((List) obj2).get(3);
                    Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Float");
                    cVar = new c1.c<>(jVar, new n0.j(fFloatValue8, fFloatValue9, fFloatValue10, ((Float) obj26).floatValue()));
                } else if (t10 instanceof q0) {
                    Object obj27 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue11 = ((Float) obj27).floatValue();
                    Object obj28 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue12 = ((Float) obj28).floatValue();
                    Object obj29 = ((List) obj).get(2);
                    Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue13 = ((Float) obj29).floatValue();
                    Object obj30 = ((List) obj).get(3);
                    Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type kotlin.Float");
                    q0 q0VarN = q0.n(s0.e(fFloatValue11, fFloatValue12, fFloatValue13, ((Float) obj30).floatValue(), null, 16, null));
                    Object obj31 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue14 = ((Float) obj31).floatValue();
                    Object obj32 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue15 = ((Float) obj32).floatValue();
                    Object obj33 = ((List) obj2).get(2);
                    Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue16 = ((Float) obj33).floatValue();
                    Object obj34 = ((List) obj2).get(3);
                    Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type kotlin.Float");
                    cVar = new c1.c<>(q0VarN, q0.n(s0.e(fFloatValue14, fFloatValue15, fFloatValue16, ((Float) obj34).floatValue(), null, 16, null)));
                } else if (t10 instanceof androidx.compose.ui.unit.h) {
                    Object obj35 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj35);
                    Object obj36 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj36);
                    cVar = (c1.c<T>) x(t10, obj35, obj36);
                } else if (v(((List) obj).get(0), ((List) obj2).get(0))) {
                    Object obj37 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj37);
                    Object obj38 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj38);
                    if (w(t10, obj37, obj38)) {
                        cVar = new c1.c<>(((List) obj).get(0), ((List) obj2).get(0));
                    }
                }
                Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                return cVar;
            } catch (ClassCastException | IllegalArgumentException | IndexOutOfBoundsException | NullPointerException unused) {
            }
        }
        return null;
    }

    private static final androidx.compose.ui.unit.h u(Object obj) {
        androidx.compose.ui.unit.h hVarO = obj instanceof androidx.compose.ui.unit.h ? (androidx.compose.ui.unit.h) obj : null;
        if (hVarO == null) {
            Float f10 = obj instanceof Float ? (Float) obj : null;
            hVarO = f10 != null ? androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(f10.floatValue())) : null;
            if (hVarO == null) {
                Double d10 = obj instanceof Double ? (Double) obj : null;
                hVarO = d10 != null ? androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r((float) d10.doubleValue())) : null;
                if (hVarO == null) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    if (num != null) {
                        return androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(num.intValue()));
                    }
                    return null;
                }
            }
        }
        return hVarO;
    }

    private static final boolean v(Object obj, Object obj2) {
        return (obj == null || obj2 == null || obj.getClass() != obj2.getClass()) ? false : true;
    }

    private static final boolean w(Object obj, Object obj2, Object obj3) {
        return obj.getClass() == obj2.getClass() && obj.getClass() == obj3.getClass();
    }

    private static final <T> c1.c<androidx.compose.ui.unit.h> x(T t10, Object obj, Object obj2) {
        if ((t10 instanceof androidx.compose.ui.unit.h) && obj2 != null) {
            if ((obj instanceof androidx.compose.ui.unit.h) && (obj2 instanceof androidx.compose.ui.unit.h)) {
                return new c1.c<>(obj, obj2);
            }
            androidx.compose.ui.unit.h hVarU = u(obj);
            androidx.compose.ui.unit.h hVarU2 = u(obj2);
            if (hVarU != null && hVarU2 != null) {
                return new c1.c<>(hVarU, hVarU2);
            }
        }
        return null;
    }
}
