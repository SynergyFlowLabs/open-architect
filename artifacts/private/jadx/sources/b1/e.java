package b1;

import androidx.compose.animation.core.f2;
import androidx.compose.animation.core.g1;
import androidx.compose.animation.core.i1;
import androidx.compose.animation.core.o;
import androidx.compose.animation.core.w;
import androidx.compose.animation.core.x4;
import androidx.compose.animation.core.z3;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.tooling.animation.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nInfiniteTransitionClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1611#2,9:89\n1863#2:98\n1864#2:100\n1620#2:101\n774#2:102\n865#2,2:103\n1557#2:106\n1628#2,3:107\n774#2:110\n865#2,2:111\n1#3:99\n1#3:105\n*S KotlinDebug\n*F\n+ 1 InfiniteTransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock\n*L\n47#1:89,9\n47#1:98\n47#1:100\n47#1:101\n52#1:102\n52#1:103,2\n70#1:106\n70#1:107,3\n71#1:110\n71#1:111,2\n47#1:99\n*E\n"})
public final class e implements c<s, c1.c<Object>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f77511d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s f77512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Long> f77513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private c1.c<Object> f77514c;

    public e(@NotNull s sVar, @NotNull Function0<Long> function0) {
        this.f77512a = sVar;
        this.f77513b = function0;
        this.f77514c = new c1.c<>(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k() {
        return 0L;
    }

    private final <T, V extends w> long m(i1.a<T, V> aVar) {
        o<T> oVarB = aVar.b();
        Intrinsics.checkNotNull(oVarB, "null cannot be cast to non-null type androidx.compose.animation.core.InfiniteRepeatableSpec<T of androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock.getIterationDuration>");
        g1 g1Var = (g1) oVarB;
        int i10 = g1Var.j() == f2.Reverse ? 2 : 1;
        x4<V> x4VarA = g1Var.h().a((z3) aVar.p());
        return j.r(((long) x4VarA.k()) + ((long) (x4VarA.a() * i10)));
    }

    @Override // b1.c
    public void a(long j10) {
        i().h(j10);
    }

    @Override // b1.c
    public long b() {
        Long l10;
        Iterator<T> it = i().d().h().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(m((i1.a) it.next()));
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(m((i1.a) it.next()));
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l10 = lValueOf;
        } else {
            l10 = null;
        }
        return j.s(l10 != null ? l10.longValue() : 0L);
    }

    @Override // b1.c
    @NotNull
    public List<ComposeAnimatedProperty> c() {
        List<i1.a<?, ?>> listH = i().d().h();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            i1.a aVar = (i1.a) it.next();
            Object value = aVar.getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(aVar.g(), value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!j.q().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // b1.c
    @NotNull
    public List<TransitionInfo> d(long j10) {
        List<i1.a<?, ?>> listH = i().d().h();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listH, 10));
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(j.f((i1.a) it.next(), j10, h()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!j.q().contains(((TransitionInfo) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.toList(arrayList2);
    }

    @Override // b1.c
    public void e(@NotNull Object obj, @Nullable Object obj2) {
    }

    @Override // b1.c
    public long h() {
        return Math.max(b(), this.f77513b.invoke().longValue());
    }

    @Override // b1.c
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public s i() {
        return this.f77512a;
    }

    @Override // b1.c
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public c1.c<Object> getState() {
        return this.f77514c;
    }

    @Override // b1.c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void g(@NotNull c1.c<Object> cVar) {
        this.f77514c = cVar;
    }

    public /* synthetic */ e(s sVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, (i10 & 2) != 0 ? new Function0() { // from class: b1.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(e.k());
            }
        } : function0);
    }
}
