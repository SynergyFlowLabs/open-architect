package androidx.compose.ui.graphics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nIntervalTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,381:1\n153#1,16:382\n153#1,16:398\n153#1,16:414\n*S KotlinDebug\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n111#1:382,16\n138#1:398,16\n146#1:414,16\n*E\n"})
public final class y1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final y1<T>.a f38695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public y1<T>.a f38696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final ArrayList<y1<T>.a> f38697c;

    public final class a extends x1<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f38698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f38699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f38700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private y1<T>.a f38701g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private y1<T>.a f38702h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private y1<T>.a f38703i;

        public a(float f10, @Nullable float f11, T t10, int i10) {
            super(f10, f11, t10);
            this.f38698d = i10;
            this.f38699e = f10;
            this.f38700f = f11;
            y1<T>.a aVar = y1.this.f38695a;
            this.f38701g = aVar;
            this.f38702h = aVar;
            this.f38703i = aVar;
        }

        public final int g() {
            return this.f38698d;
        }

        @NotNull
        public final y1<T>.a h() {
            return this.f38701g;
        }

        public final float i() {
            return this.f38700f;
        }

        public final float j() {
            return this.f38699e;
        }

        @NotNull
        public final y1<T>.a k() {
            return this.f38703i;
        }

        @NotNull
        public final y1<T>.a l() {
            return this.f38702h;
        }

        @NotNull
        public final y1<T>.a m() {
            a aVar = this;
            while (true) {
                y1<T>.a aVar2 = aVar.f38701g;
                if (aVar2 == y1.this.f38695a) {
                    return aVar;
                }
                aVar = aVar2;
            }
        }

        @NotNull
        public final y1<T>.a n() {
            y1<T>.a aVar = this.f38702h;
            if (aVar != y1.this.f38695a) {
                return aVar.m();
            }
            y1<T>.a aVar2 = this.f38703i;
            a aVar3 = this;
            while (aVar2 != y1.this.f38695a && aVar3 == aVar2.f38702h) {
                aVar3 = aVar2;
                aVar2 = aVar2.f38703i;
            }
            return aVar2;
        }

        public final void o(int i10) {
            this.f38698d = i10;
        }

        public final void p(@NotNull y1<T>.a aVar) {
            this.f38701g = aVar;
        }

        public final void q(float f10) {
            this.f38700f = f10;
        }

        public final void r(float f10) {
            this.f38699e = f10;
        }

        public final void s(@NotNull y1<T>.a aVar) {
            this.f38703i = aVar;
        }

        public final void t(@NotNull y1<T>.a aVar) {
            this.f38702h = aVar;
        }
    }

    public static final class b implements Iterator<x1<T>>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y1<T>.a f38705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1<T> f38706b;

        b(y1<T> y1Var) {
            this.f38706b = y1Var;
            this.f38705a = y1Var.f38696b.m();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x1<T> next() {
            y1<T>.a aVar = this.f38705a;
            this.f38705a = aVar.n();
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38705a != this.f38706b.f38695a;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y1() {
        y1<T>.a aVar = new a(Float.MAX_VALUE, Float.MIN_VALUE, null, 1);
        this.f38695a = aVar;
        this.f38696b = aVar;
        this.f38697c = new ArrayList<>();
    }

    public static /* synthetic */ x1 g(y1 y1Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return y1Var.e(f10, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List j(y1 y1Var, float f10, float f11, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        if ((i10 & 4) != 0) {
            list = new ArrayList();
        }
        return y1Var.h(f10, f11, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List k(y1 y1Var, kotlin.ranges.f fVar, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = new ArrayList();
        }
        return y1Var.i(fVar, list);
    }

    public static /* synthetic */ void n(y1 y1Var, float f10, float f11, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        y1<T>.a aVar = y1Var.f38696b;
        if (aVar != y1Var.f38695a) {
            ArrayList<y1<T>.a> arrayList = y1Var.f38697c;
            arrayList.add(aVar);
            while (arrayList.size() > 0) {
                y1<T>.a aVarRemove = arrayList.remove(arrayList.size() - 1);
                if (aVarRemove.e(f10, f11)) {
                    function1.invoke(aVarRemove);
                }
                if (aVarRemove.h() != y1Var.f38695a && aVarRemove.h().i() >= f10) {
                    arrayList.add(aVarRemove.h());
                }
                if (aVarRemove.l() != y1Var.f38695a && aVarRemove.l().j() <= f11) {
                    arrayList.add(aVarRemove.l());
                }
            }
            arrayList.clear();
        }
    }

    private final void q(y1<T>.a aVar) {
        while (aVar != this.f38696b && aVar.k().g() == 0) {
            y1<T>.a aVarK = aVar.k().k();
            if (aVar.k() == aVarK.h()) {
                y1<T>.a aVarL = aVarK.l();
                if (aVarL.g() == 0) {
                    aVarL.o(1);
                    aVar.k().o(1);
                    aVarK.o(0);
                    aVar = aVarK;
                } else {
                    if (aVar == aVar.k().l()) {
                        aVar = aVar.k();
                        r(aVar);
                    }
                    aVar.k().o(1);
                    aVarK.o(0);
                    s(aVarK);
                }
            } else {
                y1<T>.a aVarH = aVarK.h();
                if (aVarH.g() == 0) {
                    aVarH.o(1);
                    aVar.k().o(1);
                    aVarK.o(0);
                    aVar = aVarK;
                } else {
                    if (aVar == aVar.k().h()) {
                        aVar = aVar.k();
                        s(aVar);
                    }
                    aVar.k().o(1);
                    aVarK.o(0);
                    r(aVarK);
                }
            }
        }
        this.f38696b.o(1);
    }

    private final void r(y1<T>.a aVar) {
        y1<T>.a aVarL = aVar.l();
        aVar.t(aVarL.h());
        if (aVarL.h() != this.f38695a) {
            aVarL.h().s(aVar);
        }
        aVarL.s(aVar.k());
        if (aVar.k() == this.f38695a) {
            this.f38696b = aVarL;
        } else if (aVar.k().h() == aVar) {
            aVar.k().p(aVarL);
        } else {
            aVar.k().t(aVarL);
        }
        aVarL.p(aVar);
        aVar.s(aVarL);
        t(aVar);
    }

    private final void s(y1<T>.a aVar) {
        y1<T>.a aVarH = aVar.h();
        aVar.p(aVarH.l());
        if (aVarH.l() != this.f38695a) {
            aVarH.l().s(aVar);
        }
        aVarH.s(aVar.k());
        if (aVar.k() == this.f38695a) {
            this.f38696b = aVarH;
        } else if (aVar.k().l() == aVar) {
            aVar.k().t(aVarH);
        } else {
            aVar.k().p(aVarH);
        }
        aVarH.t(aVar);
        aVar.s(aVarH);
        t(aVar);
    }

    private final void t(y1<T>.a aVar) {
        while (aVar != this.f38695a) {
            aVar.r(Math.min(aVar.d(), Math.min(aVar.h().j(), aVar.l().j())));
            aVar.q(Math.max(aVar.c(), Math.max(aVar.h().i(), aVar.l().i())));
            aVar = aVar.k();
        }
    }

    public final void a(float f10, float f11, @Nullable T t10) {
        y1<T>.a aVar = new a(f10, f11, t10, 0);
        y1<T>.a aVar2 = this.f38695a;
        for (y1<T>.a aVarH = this.f38696b; aVarH != this.f38695a; aVarH = aVar.d() <= aVarH.d() ? aVarH.h() : aVarH.l()) {
            aVar2 = aVarH;
        }
        aVar.s(aVar2);
        if (aVar2 == this.f38695a) {
            this.f38696b = aVar;
        } else if (aVar.d() <= aVar2.d()) {
            aVar2.p(aVar);
        } else {
            aVar2.t(aVar);
        }
        t(aVar);
        q(aVar);
    }

    public final void b() {
        this.f38696b = this.f38695a;
    }

    public final boolean c(float f10) {
        return e(f10, f10) != z1.a();
    }

    public final boolean d(@NotNull kotlin.ranges.f<Float> fVar) {
        return e(fVar.u().floatValue(), fVar.i().floatValue()) != z1.a();
    }

    @NotNull
    public final x1<T> e(float f10, float f11) {
        y1<T>.a aVar = this.f38696b;
        y1<T>.a aVar2 = this.f38695a;
        if (aVar != aVar2 && aVar != aVar2) {
            ArrayList<y1<T>.a> arrayList = this.f38697c;
            arrayList.add(aVar);
            while (arrayList.size() > 0) {
                y1<T>.a aVarRemove = arrayList.remove(arrayList.size() - 1);
                if (aVarRemove.e(f10, f11)) {
                    return aVarRemove;
                }
                if (aVarRemove.h() != this.f38695a && aVarRemove.h().i() >= f10) {
                    arrayList.add(aVarRemove.h());
                }
                if (aVarRemove.l() != this.f38695a && aVarRemove.l().j() <= f11) {
                    arrayList.add(aVarRemove.l());
                }
            }
            arrayList.clear();
        }
        x1<T> x1Var = (x1<T>) z1.a();
        Intrinsics.checkNotNull(x1Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return x1Var;
    }

    @NotNull
    public final x1<T> f(@NotNull kotlin.ranges.f<Float> fVar) {
        return e(fVar.u().floatValue(), fVar.i().floatValue());
    }

    @NotNull
    public final List<x1<T>> h(float f10, float f11, @NotNull List<x1<T>> list) {
        y1<T>.a aVar = this.f38696b;
        if (aVar != this.f38695a) {
            ArrayList<y1<T>.a> arrayList = this.f38697c;
            arrayList.add(aVar);
            while (arrayList.size() > 0) {
                y1<T>.a aVarRemove = arrayList.remove(arrayList.size() - 1);
                if (aVarRemove.e(f10, f11)) {
                    list.add(aVarRemove);
                }
                if (aVarRemove.h() != this.f38695a && aVarRemove.h().i() >= f10) {
                    arrayList.add(aVarRemove.h());
                }
                if (aVarRemove.l() != this.f38695a && aVarRemove.l().j() <= f11) {
                    arrayList.add(aVarRemove.l());
                }
            }
            arrayList.clear();
        }
        return list;
    }

    @NotNull
    public final List<x1<T>> i(@NotNull kotlin.ranges.f<Float> fVar, @NotNull List<x1<T>> list) {
        return h(fVar.u().floatValue(), fVar.i().floatValue(), list);
    }

    public final void l(float f10, float f11, @NotNull Function1<? super x1<T>, Unit> function1) {
        y1<T>.a aVar = this.f38696b;
        if (aVar != this.f38695a) {
            ArrayList<y1<T>.a> arrayList = this.f38697c;
            arrayList.add(aVar);
            while (arrayList.size() > 0) {
                y1<T>.a aVarRemove = arrayList.remove(arrayList.size() - 1);
                if (aVarRemove.e(f10, f11)) {
                    function1.invoke(aVarRemove);
                }
                if (aVarRemove.h() != this.f38695a && aVarRemove.h().i() >= f10) {
                    arrayList.add(aVarRemove.h());
                }
                if (aVarRemove.l() != this.f38695a && aVarRemove.l().j() <= f11) {
                    arrayList.add(aVarRemove.l());
                }
            }
            arrayList.clear();
        }
    }

    public final void m(@NotNull kotlin.ranges.f<Float> fVar, @NotNull Function1<? super x1<T>, Unit> function1) {
        float fFloatValue = fVar.u().floatValue();
        float fFloatValue2 = fVar.i().floatValue();
        y1<T>.a aVar = this.f38696b;
        if (aVar != this.f38695a) {
            ArrayList<y1<T>.a> arrayList = this.f38697c;
            arrayList.add(aVar);
            while (arrayList.size() > 0) {
                y1<T>.a aVarRemove = arrayList.remove(arrayList.size() - 1);
                if (aVarRemove.e(fFloatValue, fFloatValue2)) {
                    function1.invoke(aVarRemove);
                }
                if (aVarRemove.h() != this.f38695a && aVarRemove.h().i() >= fFloatValue) {
                    arrayList.add(aVarRemove.h());
                }
                if (aVarRemove.l() != this.f38695a && aVarRemove.l().j() <= fFloatValue2) {
                    arrayList.add(aVarRemove.l());
                }
            }
            arrayList.clear();
        }
    }

    @NotNull
    public final Iterator<x1<T>> o() {
        return new b(this);
    }

    public final void p(@NotNull x1<T> x1Var) {
        a(x1Var.d(), x1Var.c(), x1Var.b());
    }
}
