package androidx.compose.material3.internal;

import androidx.compose.material3.bk;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nMenuPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/internal/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,394:1\n1#2:395\n54#3:396\n54#3:398\n54#3:400\n59#3:402\n59#3:404\n59#3:406\n85#4:397\n85#4:399\n85#4:401\n90#4:403\n90#4:405\n90#4:407\n80#4:409\n32#5:408\n*S KotlinDebug\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/internal/DropdownMenuPositionProvider\n*L\n333#1:396\n345#1:398\n350#1:400\n362#1:402\n374#1:404\n379#1:406\n333#1:397\n345#1:399\n350#1:401\n362#1:403\n374#1:405\n379#1:407\n386#1:409\n386#1:408\n*E\n"})
public final class l2 implements androidx.compose.ui.window.s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f28996n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f28998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, Unit> f29000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final a3.a f29001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final a3.a f29002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final a3.a f29003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final a3.a f29004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final a3.b f29005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final a3.b f29006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final a3.b f29007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final a3.b f29008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final a3.b f29009m;

    public /* synthetic */ l2(long j10, androidx.compose.ui.unit.d dVar, int i10, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar, i10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.unit.s sVar, androidx.compose.ui.unit.s sVar2) {
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l2 i(l2 l2Var, long j10, androidx.compose.ui.unit.d dVar, int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = l2Var.f28997a;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            dVar = l2Var.f28998b;
        }
        androidx.compose.ui.unit.d dVar2 = dVar;
        if ((i11 & 4) != 0) {
            i10 = l2Var.f28999c;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            function2 = l2Var.f29000d;
        }
        return l2Var.h(j11, dVar2, i12, function2);
    }

    @Override // androidx.compose.ui.window.s
    public long a(@NotNull androidx.compose.ui.unit.s sVar, long j10, @NotNull androidx.compose.ui.unit.w wVar, long j11) {
        androidx.compose.ui.unit.s sVar2;
        long j12;
        char c10;
        int iA;
        int i10;
        int i11;
        char c11 = ' ';
        int i12 = (int) (j10 >> 32);
        List listListOf = CollectionsKt.listOf((Object[]) new a3.a[]{this.f29001e, this.f29002f, androidx.compose.ui.unit.q.n(sVar.o()) < i12 / 2 ? this.f29003g : this.f29004h});
        int size = listListOf.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                sVar2 = sVar;
                j12 = j10;
                c10 = c11;
                iA = 0;
                break;
            }
            a3.a aVar = (a3.a) listListOf.get(i13);
            int i14 = (int) (j11 >> c11);
            int i15 = size;
            c10 = c11;
            j12 = j10;
            int i16 = i13;
            sVar2 = sVar;
            iA = aVar.a(sVar2, j12, i14, wVar);
            if (i16 == CollectionsKt.getLastIndex(listListOf) || (iA >= 0 && i14 + iA <= i12)) {
                break;
            }
            i13 = i16 + 1;
            size = i15;
            c11 = c10;
        }
        a3.b bVar = this.f29005i;
        a3.b bVar2 = this.f29006j;
        a3.b bVar3 = this.f29007k;
        int iP = androidx.compose.ui.unit.q.p(sVar2.o());
        int i17 = (int) (j12 & com.rabbitmq.client.k0.f265952a);
        List listListOf2 = CollectionsKt.listOf((Object[]) new a3.b[]{bVar, bVar2, bVar3, iP < i17 / 2 ? this.f29008l : this.f29009m});
        int size2 = listListOf2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            a3.b bVar4 = (a3.b) listListOf2.get(i18);
            int i19 = (int) (j11 & com.rabbitmq.client.k0.f265952a);
            int iA2 = bVar4.a(sVar2, j12, i19);
            if (i18 == CollectionsKt.getLastIndex(listListOf2) || (iA2 >= (i11 = this.f28999c) && i19 + iA2 <= i17 - i11)) {
                i10 = iA2;
                long jF = androidx.compose.ui.unit.q.f((((long) iA) << c10) | (((long) i10) & com.rabbitmq.client.k0.f265952a));
                this.f29000d.invoke(sVar2, androidx.compose.ui.unit.t.b(jF, j11));
                return jF;
            }
        }
        i10 = 0;
        long jF2 = androidx.compose.ui.unit.q.f((((long) iA) << c10) | (((long) i10) & com.rabbitmq.client.k0.f265952a));
        this.f29000d.invoke(sVar2, androidx.compose.ui.unit.t.b(jF2, j11));
        return jF2;
    }

    public final long d() {
        return this.f28997a;
    }

    @NotNull
    public final androidx.compose.ui.unit.d e() {
        return this.f28998b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return androidx.compose.ui.unit.j.h(this.f28997a, l2Var.f28997a) && Intrinsics.areEqual(this.f28998b, l2Var.f28998b) && this.f28999c == l2Var.f28999c && Intrinsics.areEqual(this.f29000d, l2Var.f29000d);
    }

    public final int f() {
        return this.f28999c;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, Unit> g() {
        return this.f29000d;
    }

    @NotNull
    public final l2 h(long j10, @NotNull androidx.compose.ui.unit.d dVar, int i10, @NotNull Function2<? super androidx.compose.ui.unit.s, ? super androidx.compose.ui.unit.s, Unit> function2) {
        return new l2(j10, dVar, i10, function2, null);
    }

    public int hashCode() {
        return (((((androidx.compose.ui.unit.j.n(this.f28997a) * 31) + this.f28998b.hashCode()) * 31) + Integer.hashCode(this.f28999c)) * 31) + this.f29000d.hashCode();
    }

    public final long j() {
        return this.f28997a;
    }

    @NotNull
    public final androidx.compose.ui.unit.d k() {
        return this.f28998b;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, Unit> l() {
        return this.f29000d;
    }

    public final int m() {
        return this.f28999c;
    }

    @NotNull
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) androidx.compose.ui.unit.j.q(this.f28997a)) + ", density=" + this.f28998b + ", verticalMargin=" + this.f28999c + ", onPositionCalculated=" + this.f29000d + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l2(long j10, androidx.compose.ui.unit.d dVar, int i10, Function2<? super androidx.compose.ui.unit.s, ? super androidx.compose.ui.unit.s, Unit> function2) {
        this.f28997a = j10;
        this.f28998b = dVar;
        this.f28999c = i10;
        this.f29000d = function2;
        int iG6 = dVar.g6(androidx.compose.ui.unit.j.j(j10));
        a3 a3Var = a3.f28661a;
        this.f29001e = a3Var.m(iG6);
        this.f29002f = a3Var.g(iG6);
        this.f29003g = a3Var.i(0);
        this.f29004h = a3Var.k(0);
        int iG7 = dVar.g6(androidx.compose.ui.unit.j.l(j10));
        this.f29005i = a3Var.o(iG7);
        this.f29006j = a3Var.a(iG7);
        this.f29007k = a3Var.e(iG7);
        this.f29008l = a3Var.q(i10);
        this.f29009m = a3Var.c(i10);
    }

    public /* synthetic */ l2(long j10, androidx.compose.ui.unit.d dVar, int i10, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar, (i11 & 4) != 0 ? dVar.g6(bk.n()) : i10, (i11 & 8) != 0 ? new Function2() { // from class: androidx.compose.material3.internal.k2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l2.c((androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
            }
        } : function2, null);
    }
}
