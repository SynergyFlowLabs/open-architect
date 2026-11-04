package androidx.compose.ui.tooling.animation;

import androidx.annotation.l1;
import androidx.compose.animation.core.g3;
import androidx.compose.animation.core.l3;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPreviewAnimationClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewAnimationClock.android.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,360:1\n1#2:361\n1863#3,2:362\n1863#3,2:366\n1863#3,2:368\n216#4,2:364\n*S KotlinDebug\n*F\n+ 1 PreviewAnimationClock.android.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock\n*L\n334#1:362,2\n352#1:366,2\n353#1:368,2\n344#1:364,2\n*E\n"})
public class c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f42399l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f42400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f42401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f42402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<f0<?>, b1.f<?>> f42403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<c, b1.b> f42404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<a<?, ?>, b1.a<?, ?>> f42405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<s, b1.e> f42406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Map<b<?>, b1.f<?>> f42407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet<h0> f42408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet<Object> f42409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f42410k;

    /* JADX WARN: Multi-variable type inference failed */
    public c0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @l1
    public static /* synthetic */ void C() {
    }

    @l1
    public static /* synthetic */ void E() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(q.c cVar, c0 c0Var, Object obj) {
        a<?, ?> aVarB = a.f42376g.b(cVar);
        if (aVarB == null) {
            c0Var.k(cVar.f().o());
            return Unit.f312394a;
        }
        c0Var.f42405f.put(aVarB, new b1.a<>(aVarB));
        c0Var.G(aVarB);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(l3 l3Var, c0 c0Var, Object obj) {
        b<?> bVarB = b.f42387e.b(l3Var);
        if (bVarB == null) {
            c0Var.k(l3Var.s());
            return Unit.f312394a;
        }
        c0Var.f42407h.put(bVarB, new b1.f<>(bVarB));
        c0Var.G(bVarB);
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void Q(c0 c0Var, l3 l3Var, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAnimatedVisibility");
        }
        if ((i10 & 2) != 0) {
            function0 = new Function0() { // from class: androidx.compose.ui.tooling.animation.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c0.R();
                }
            };
        }
        c0Var.P(l3Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(l3 l3Var, Function0 function0, c0 c0Var, Object obj) {
        Intrinsics.checkNotNull(l3Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Boolean>");
        c cVarA = d.a(l3Var);
        function0.invoke();
        Map<c, b1.b> map = c0Var.f42404e;
        b1.b bVar = new b1.b(cVarA);
        bVar.a(0L);
        map.put(cVarA, bVar);
        c0Var.G(cVarA);
        return Unit.f312394a;
    }

    private final boolean T(Object obj, Function1<Object, Unit> function1) {
        synchronized (this.f42410k) {
            try {
                if (this.f42409j.contains(obj)) {
                    if (this.f42402c) {
                        Objects.toString(obj);
                    }
                    return false;
                }
                this.f42409j.add(obj);
                function1.invoke(obj);
                if (this.f42402c) {
                    Objects.toString(obj);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(q.h hVar, final c0 c0Var, Object obj) {
        s sVarB = s.f42472f.b(hVar);
        if (sVarB != null) {
            c0Var.f42406g.put(sVarB, new b1.e(sVarB, new Function0() { // from class: androidx.compose.ui.tooling.animation.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(c0.X(this.f42491a));
                }
            }));
            c0Var.G(sVarB);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long X(c0 c0Var) {
        Long lValueOf;
        Iterator<T> it = c0Var.o().iterator();
        Long lValueOf2 = null;
        if (it.hasNext()) {
            lValueOf = Long.valueOf(((b1.c) it.next()).h());
            while (it.hasNext()) {
                Long lValueOf3 = Long.valueOf(((b1.c) it.next()).h());
                if (lValueOf.compareTo(lValueOf3) < 0) {
                    lValueOf = lValueOf3;
                }
            }
        } else {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        Iterator<T> it2 = c0Var.f42406g.values().iterator();
        if (it2.hasNext()) {
            lValueOf2 = Long.valueOf(((b1.e) it2.next()).b());
            while (it2.hasNext()) {
                Long lValueOf4 = Long.valueOf(((b1.e) it2.next()).b());
                if (lValueOf2.compareTo(lValueOf4) < 0) {
                    lValueOf2 = lValueOf4;
                }
            }
        }
        return Math.max(jLongValue, lValueOf2 != null ? lValueOf2.longValue() : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(l3 l3Var, c0 c0Var, Object obj) {
        f0<?> f0VarA = g0.a(l3Var);
        if (f0VarA == null) {
            c0Var.k(l3Var.s());
            return Unit.f312394a;
        }
        c0Var.f42403d.put(f0VarA, new b1.f<>(f0VarA));
        c0Var.G(f0VarA);
        return Unit.f312394a;
    }

    private final void b0(Object obj, final String str) {
        T(obj, new Function1() { // from class: androidx.compose.ui.tooling.animation.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return c0.c0(this.f42489a, str, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(c0 c0Var, String str, Object obj) {
        c0Var.k(str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j() {
        return Unit.f312394a;
    }

    private final void k(String str) {
        h0 h0VarA = h0.f42421e.a(str);
        if (h0VarA != null) {
            this.f42408i.add(h0VarA);
            G(h0VarA);
        }
    }

    private final b1.c<?, ?> m(ComposeAnimation composeAnimation) {
        b1.f<?> fVar = this.f42403d.get(composeAnimation);
        if (fVar != null) {
            return fVar;
        }
        b1.b bVar = this.f42404e.get(composeAnimation);
        if (bVar != null) {
            return bVar;
        }
        b1.a<?, ?> aVar = this.f42405f.get(composeAnimation);
        if (aVar != null) {
            return aVar;
        }
        b1.e eVar = this.f42406g.get(composeAnimation);
        return eVar != null ? eVar : this.f42407h.get(composeAnimation);
    }

    private final List<b1.c<?, ?>> n() {
        return CollectionsKt.plus((Collection) o(), (Iterable) this.f42406g.values());
    }

    private final List<b1.c<?, ?>> o() {
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) this.f42403d.values(), (Iterable) this.f42404e.values()), (Iterable) this.f42405f.values()), (Iterable) this.f42407h.values());
    }

    @l1
    public static /* synthetic */ void q() {
    }

    @l1
    public static /* synthetic */ void s() {
    }

    @l1
    public static /* synthetic */ void v() {
    }

    @l1
    public static /* synthetic */ void y() {
    }

    public final long A() {
        Long l10;
        Iterator<T> it = n().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((b1.c) it.next()).b());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((b1.c) it.next()).b());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l10 = lValueOf;
        } else {
            l10 = null;
        }
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    @NotNull
    public final LinkedHashSet<h0> B() {
        return this.f42408i;
    }

    @NotNull
    public final Map<f0<?>, b1.f<?>> D() {
        return this.f42403d;
    }

    @NotNull
    public final List<TransitionInfo> F(@NotNull ComposeAnimation composeAnimation, long j10) {
        List<TransitionInfo> listD;
        b1.c<?, ?> cVarM = m(composeAnimation);
        if (cVarM != null && (listD = cVarM.d(j10)) != null) {
            return listD;
        }
        return CollectionsKt.emptyList();
    }

    @l1
    protected void G(@NotNull ComposeAnimation composeAnimation) {
    }

    @l1
    protected void H(@NotNull ComposeAnimation composeAnimation) {
    }

    public final void I(long j10) {
        long jR = b1.j.r(j10);
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            ((b1.c) it.next()).a(jR);
        }
        this.f42400a.invoke();
    }

    public final void J(@NotNull Map<ComposeAnimation, Long> map) {
        for (Map.Entry<ComposeAnimation, Long> entry : map.entrySet()) {
            ComposeAnimation key = entry.getKey();
            long jLongValue = entry.getValue().longValue();
            b1.c<?, ?> cVarM = m(key);
            if (cVarM != null) {
                cVarM.a(b1.j.r(jLongValue));
            }
        }
        this.f42400a.invoke();
    }

    public final void K(@NotNull Object obj) {
        b0(obj, "animateContentSize");
    }

    public final void L(@NotNull final q.c<?, ?> cVar) {
        T(cVar.f(), new Function1() { // from class: androidx.compose.ui.tooling.animation.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c0.M(cVar, this, obj);
            }
        });
    }

    public final void N(@NotNull final l3<?> l3Var) {
        T(l3Var, new Function1() { // from class: androidx.compose.ui.tooling.animation.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c0.O(l3Var, this, obj);
            }
        });
    }

    public final void P(@NotNull final l3<?> l3Var, @NotNull final Function0<Unit> function0) {
        if (l3Var.p() instanceof Boolean) {
            T(l3Var, new Function1() { // from class: androidx.compose.ui.tooling.animation.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c0.S(l3Var, function0, this, obj);
                }
            });
        }
    }

    public final void U(@NotNull androidx.compose.animation.core.f0<?, ?> f0Var) {
        b0(f0Var, "DecayAnimation");
    }

    public final void V(@NotNull final q.h hVar) {
        T(hVar.e(), new Function1() { // from class: androidx.compose.ui.tooling.animation.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c0.W(hVar, this, obj);
            }
        });
    }

    public final void Y(@NotNull g3<?, ?> g3Var) {
        b0(g3Var, "TargetBasedAnimation");
    }

    public final void Z(@NotNull final l3<?> l3Var) {
        T(l3Var, new Function1() { // from class: androidx.compose.ui.tooling.animation.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c0.a0(l3Var, this, obj);
            }
        });
    }

    public final void d0(@NotNull ComposeAnimation composeAnimation, @NotNull Object obj) {
        b1.b bVar = this.f42404e.get(composeAnimation);
        if (bVar != null) {
            b1.c.f(bVar, obj, null, 2, null);
        }
    }

    public final void e0(@NotNull ComposeAnimation composeAnimation, @NotNull Object obj, @NotNull Object obj2) {
        b1.c<?, ?> cVarM = m(composeAnimation);
        if (cVarM != null) {
            cVarM.e(obj, obj2);
        }
    }

    public final void l() {
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            H(((b1.c) it.next()).i());
        }
        Iterator<T> it2 = this.f42408i.iterator();
        while (it2.hasNext()) {
            H((h0) it2.next());
        }
        this.f42408i.clear();
        this.f42403d.clear();
        this.f42404e.clear();
        this.f42409j.clear();
    }

    @NotNull
    public final Map<a<?, ?>, b1.a<?, ?>> p() {
        return this.f42405f;
    }

    @NotNull
    public final Map<b<?>, b1.f<?>> r() {
        return this.f42407h;
    }

    @NotNull
    public final List<ComposeAnimatedProperty> t(@NotNull ComposeAnimation composeAnimation) {
        List<ComposeAnimatedProperty> listC;
        b1.c<?, ?> cVarM = m(composeAnimation);
        return (cVarM == null || (listC = cVarM.c()) == null) ? CollectionsKt.emptyList() : listC;
    }

    @NotNull
    public final Map<c, b1.b> u() {
        return this.f42404e;
    }

    @NotNull
    public final String w(@NotNull ComposeAnimation composeAnimation) {
        b1.b bVar = this.f42404e.get(composeAnimation);
        return bVar != null ? bVar.k() : c1.a.f82371b.a();
    }

    @NotNull
    public final Map<s, b1.e> x() {
        return this.f42406g;
    }

    public final long z() {
        Long l10;
        Iterator<T> it = n().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((b1.c) it.next()).h());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((b1.c) it.next()).h());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l10 = lValueOf;
        } else {
            l10 = null;
        }
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public c0(@NotNull Function0<Unit> function0) {
        this.f42400a = function0;
        this.f42401b = "PreviewAnimationClock";
        this.f42403d = new LinkedHashMap();
        this.f42404e = new LinkedHashMap();
        this.f42405f = new LinkedHashMap();
        this.f42406g = new LinkedHashMap();
        this.f42407h = new LinkedHashMap();
        this.f42408i = new LinkedHashSet<>();
        this.f42409j = new LinkedHashSet<>();
        this.f42410k = new Object();
    }

    public /* synthetic */ c0(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: androidx.compose.ui.tooling.animation.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c0.j();
            }
        } : function0);
    }
}
