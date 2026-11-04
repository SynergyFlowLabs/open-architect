package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,848:1\n150#2,3:849\n34#2,6:852\n153#2:858\n168#2,13:859\n150#2,3:872\n34#2,6:875\n153#2:881\n168#2,13:882\n168#2,13:895\n34#2,6:909\n34#2,6:915\n1#3:908\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n*L\n419#1:849,3\n419#1:852,6\n419#1:858\n420#1:859,13\n421#1:872,3\n421#1:875,6\n421#1:881\n422#1:882,13\n423#1:895,13\n447#1:909,6\n454#1:915,6\n*E\n"})
public final class fw implements androidx.compose.ui.layout.h1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27756e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f27757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Integer> f27758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.c<Integer, androidx.compose.animation.core.s> f27759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Integer f27760d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$1", f = "SegmentedButton.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Integer, androidx.compose.animation.core.s> f27762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ fw f27764d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.animation.core.c<Integer, androidx.compose.animation.core.s> cVar, int i10, fw fwVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f27762b = cVar;
            this.f27763c = i10;
            this.f27764d = fwVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f27762b, this.f27763c, this.f27764d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f27761a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<Integer, androidx.compose.animation.core.s> cVar = this.f27762b;
                Integer numF = kotlin.coroutines.jvm.internal.b.f(this.f27763c);
                androidx.compose.animation.core.o<Integer> oVarH = this.f27764d.h();
                this.f27761a = 1;
                if (androidx.compose.animation.core.c.i(cVar, numF, oVarH, null, null, this, 12, null) == objL) {
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
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public fw(@NotNull kotlinx.coroutines.s0 s0Var, @NotNull androidx.compose.animation.core.o<Integer> oVar) {
        this.f27757a = s0Var;
        this.f27758b = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(List list, androidx.compose.ui.layout.c1 c1Var, fw fwVar, int i10, List list2, int i11, androidx.compose.ui.layout.i2.a aVar) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) list.get(i12);
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, (i11 - i2Var.c1()) / 2, 0.0f, 4, null);
        }
        int iG6 = c1Var.g6(iw.f29388a.o()) + c1Var.g6(tw.f33256b);
        androidx.compose.animation.core.c<Integer, androidx.compose.animation.core.s> cVar = fwVar.f27759c;
        int iIntValue = iG6 + (cVar != null ? cVar.v().intValue() : i10);
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.layout.i2 i2Var2 = (androidx.compose.ui.layout.i2) list2.get(i13);
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var2, iIntValue, (i11 - i2Var2.c1()) / 2, 0.0f, 4, null);
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.h1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull final androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends List<? extends androidx.compose.ui.layout.z0>> list, long j10) {
        Object obj;
        Object obj2;
        Object obj3;
        List<? extends androidx.compose.ui.layout.z0> list2 = list.get(0);
        int i10 = 1;
        List<? extends androidx.compose.ui.layout.z0> list3 = list.get(1);
        final ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(list2.get(i11).P0(j10));
        }
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int iH1 = ((androidx.compose.ui.layout.i2) obj).h1();
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i12 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i12);
                    int iH2 = ((androidx.compose.ui.layout.i2) obj4).h1();
                    if (iH1 < iH2) {
                        obj = obj4;
                        iH1 = iH2;
                    }
                    if (i12 == lastIndex) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            obj = null;
        }
        androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) obj;
        int iH3 = i2Var != null ? i2Var.h1() : 0;
        final ArrayList arrayList2 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList2.add(list3.get(i13).P0(j10));
        }
        if (!arrayList2.isEmpty()) {
            obj2 = arrayList2.get(0);
            int iH4 = ((androidx.compose.ui.layout.i2) obj2).h1();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex2) {
                int i14 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i14);
                    int iH5 = ((androidx.compose.ui.layout.i2) obj5).h1();
                    if (iH4 < iH5) {
                        obj2 = obj5;
                        iH4 = iH5;
                    }
                    if (i14 == lastIndex2) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            obj2 = null;
        }
        androidx.compose.ui.layout.i2 i2Var2 = (androidx.compose.ui.layout.i2) obj2;
        Integer numValueOf = i2Var2 != null ? Integer.valueOf(i2Var2.h1()) : null;
        if (!arrayList2.isEmpty()) {
            obj3 = arrayList2.get(0);
            int iC1 = ((androidx.compose.ui.layout.i2) obj3).c1();
            int lastIndex3 = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex3) {
                while (true) {
                    Object obj6 = arrayList2.get(i10);
                    int iC2 = ((androidx.compose.ui.layout.i2) obj6).c1();
                    if (iC1 < iC2) {
                        obj3 = obj6;
                        iC1 = iC2;
                    }
                    if (i10 == lastIndex3) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            obj3 = null;
        }
        androidx.compose.ui.layout.i2 i2Var3 = (androidx.compose.ui.layout.i2) obj3;
        int iC3 = i2Var3 != null ? i2Var3.c1() : 0;
        iw iwVar = iw.f29388a;
        int iMax = Math.max(c1Var.g6(iwVar.o()), iH3) + c1Var.g6(tw.f33256b) + (numValueOf != null ? numValueOf.intValue() : 0);
        int i15 = iH3 == 0 ? (-(c1Var.g6(iwVar.o()) + c1Var.g6(tw.f33256b))) / 2 : 0;
        if (this.f27760d == null) {
            this.f27760d = Integer.valueOf(i15);
        } else {
            androidx.compose.animation.core.c<Integer, androidx.compose.animation.core.s> cVar = this.f27759c;
            if (cVar == null) {
                Integer num = this.f27760d;
                Intrinsics.checkNotNull(num);
                androidx.compose.animation.core.c<Integer, androidx.compose.animation.core.s> cVar2 = new androidx.compose.animation.core.c<>(num, androidx.compose.animation.core.t4.Q(kotlin.jvm.internal.i0.f312739a), null, null, 12, null);
                this.f27759c = cVar2;
                cVar = cVar2;
            }
            if (cVar.s().intValue() != i15) {
                kotlinx.coroutines.k.f(this.f27757a, null, null, new a(cVar, i15, this, null), 3, null);
            }
        }
        final int i16 = iC3;
        final int i17 = i15;
        return androidx.compose.ui.layout.c1.h6(c1Var, iMax, i16, null, new Function1() { // from class: androidx.compose.material3.ew
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj7) {
                return fw.j(arrayList, c1Var, this, i17, arrayList2, i16, (androidx.compose.ui.layout.i2.a) obj7);
            }
        }, 4, null);
    }

    @Nullable
    public final androidx.compose.animation.core.c<Integer, androidx.compose.animation.core.s> g() {
        return this.f27759c;
    }

    @NotNull
    public final androidx.compose.animation.core.o<Integer> h() {
        return this.f27758b;
    }

    @NotNull
    public final kotlinx.coroutines.s0 i() {
        return this.f27757a;
    }

    public final void k(@Nullable androidx.compose.animation.core.c<Integer, androidx.compose.animation.core.s> cVar) {
        this.f27759c = cVar;
    }
}
