package androidx.compose.material;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,386:1\n1#2:387\n54#3:388\n54#3:390\n54#3:392\n54#3:395\n59#3:398\n59#3:400\n59#3:402\n59#3:405\n54#3:408\n59#3:410\n85#4:389\n85#4:391\n85#4:393\n85#4:396\n90#4:399\n90#4:401\n90#4:403\n90#4:406\n85#4:409\n90#4:411\n80#4:413\n183#5:394\n184#5:397\n183#5:404\n184#5:407\n32#6:412\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/DropdownMenuPositionProvider\n*L\n336#1:388\n337#1:390\n355#1:392\n359#1:395\n364#1:398\n365#1:400\n366#1:402\n376#1:405\n381#1:408\n381#1:410\n336#1:389\n337#1:391\n355#1:393\n359#1:396\n364#1:399\n365#1:401\n366#1:403\n376#1:406\n381#1:409\n381#1:411\n383#1:413\n359#1:394\n359#1:397\n374#1:404\n374#1:407\n383#1:412\n*E\n"})
public final class n7 implements androidx.compose.ui.window.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23928d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f23930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, Unit> f23931c;

    public /* synthetic */ n7(long j10, androidx.compose.ui.unit.d dVar, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.unit.s sVar, androidx.compose.ui.unit.s sVar2) {
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n7 h(n7 n7Var, long j10, androidx.compose.ui.unit.d dVar, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = n7Var.f23929a;
        }
        if ((i10 & 2) != 0) {
            dVar = n7Var.f23930b;
        }
        if ((i10 & 4) != 0) {
            function2 = n7Var.f23931c;
        }
        return n7Var.g(j10, dVar, function2);
    }

    @Override // androidx.compose.ui.window.s
    public long a(@NotNull androidx.compose.ui.unit.s sVar, long j10, @NotNull androidx.compose.ui.unit.w wVar, long j11) {
        Sequence sequenceQ;
        Object obj;
        Object next;
        int iG6 = this.f23930b.g6(ga.n());
        int iG7 = this.f23930b.g6(androidx.compose.ui.unit.j.j(this.f23929a));
        androidx.compose.ui.unit.w wVar2 = androidx.compose.ui.unit.w.Ltr;
        int i10 = iG7 * (wVar == wVar2 ? 1 : -1);
        int iG8 = this.f23930b.g6(androidx.compose.ui.unit.j.l(this.f23929a));
        int iT = sVar.t() + i10;
        int i11 = (int) (j11 >> 32);
        int iX = (sVar.x() - i11) + i10;
        int i12 = (int) (j10 >> 32);
        int i13 = i12 - i11;
        if (wVar == wVar2) {
            Integer numValueOf = Integer.valueOf(iT);
            Integer numValueOf2 = Integer.valueOf(iX);
            if (sVar.t() < 0) {
                i13 = 0;
            }
            sequenceQ = kotlin.sequences.o.q(numValueOf, numValueOf2, Integer.valueOf(i13));
        } else {
            Integer numValueOf3 = Integer.valueOf(iX);
            Integer numValueOf4 = Integer.valueOf(iT);
            if (sVar.x() <= i12) {
                i13 = 0;
            }
            sequenceQ = kotlin.sequences.o.q(numValueOf3, numValueOf4, Integer.valueOf(i13));
        }
        Iterator it = sequenceQ.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && iIntValue + i11 <= i12) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iX = num.intValue();
        }
        int iMax = Math.max(sVar.j() + iG8, iG6);
        int iB = sVar.B();
        int i14 = (int) (j11 & com.rabbitmq.client.k0.f265952a);
        int iIntValue2 = (iB - i14) + iG8;
        int iB2 = (sVar.B() - (i14 / 2)) + iG8;
        int i15 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        for (Object obj2 : kotlin.sequences.o.q(Integer.valueOf(iMax), Integer.valueOf(iIntValue2), Integer.valueOf(iB2), Integer.valueOf((i15 - i14) - iG6))) {
            int iIntValue3 = ((Number) obj2).intValue();
            if (iIntValue3 >= iG6 && iIntValue3 + i14 <= i15 - iG6) {
                obj = obj2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        this.f23931c.invoke(sVar, new androidx.compose.ui.unit.s(iX, iIntValue2, i11 + iX, i14 + iIntValue2));
        return androidx.compose.ui.unit.q.f((((long) iX) << 32) | (((long) iIntValue2) & com.rabbitmq.client.k0.f265952a));
    }

    public final long d() {
        return this.f23929a;
    }

    @NotNull
    public final androidx.compose.ui.unit.d e() {
        return this.f23930b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj;
        if (androidx.compose.ui.unit.j.h(this.f23929a, n7Var.f23929a) && Intrinsics.areEqual(this.f23930b, n7Var.f23930b) && Intrinsics.areEqual(this.f23931c, n7Var.f23931c)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, Unit> f() {
        return this.f23931c;
    }

    @NotNull
    public final n7 g(long j10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull Function2<? super androidx.compose.ui.unit.s, ? super androidx.compose.ui.unit.s, Unit> function2) {
        return new n7(j10, dVar, function2, null);
    }

    public int hashCode() {
        return (((androidx.compose.ui.unit.j.n(this.f23929a) * 31) + this.f23930b.hashCode()) * 31) + this.f23931c.hashCode();
    }

    public final long i() {
        return this.f23929a;
    }

    @NotNull
    public final androidx.compose.ui.unit.d j() {
        return this.f23930b;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, Unit> k() {
        return this.f23931c;
    }

    @NotNull
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) androidx.compose.ui.unit.j.q(this.f23929a)) + ", density=" + this.f23930b + ", onPositionCalculated=" + this.f23931c + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n7(long j10, androidx.compose.ui.unit.d dVar, Function2<? super androidx.compose.ui.unit.s, ? super androidx.compose.ui.unit.s, Unit> function2) {
        this.f23929a = j10;
        this.f23930b = dVar;
        this.f23931c = function2;
    }

    public /* synthetic */ n7(long j10, androidx.compose.ui.unit.d dVar, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar, (i10 & 4) != 0 ? new Function2() { // from class: androidx.compose.material.m7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return n7.c((androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
            }
        } : function2, null);
    }
}
