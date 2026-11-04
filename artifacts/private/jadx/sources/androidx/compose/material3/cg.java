package androidx.compose.material3;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1537:1\n1#2:1538\n54#3:1539\n59#3:1541\n54#3:1545\n54#3:1547\n54#3:1549\n59#3:1551\n59#3:1553\n59#3:1555\n85#4:1540\n90#4:1542\n80#4:1544\n85#4:1546\n85#4:1548\n85#4:1550\n90#4:1552\n90#4:1554\n90#4:1556\n80#4:1558\n30#5:1543\n32#6:1557\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuPositionProvider\n*L\n1313#1:1539\n1313#1:1541\n1319#1:1545\n1331#1:1547\n1336#1:1549\n1347#1:1551\n1359#1:1553\n1363#1:1555\n1313#1:1540\n1313#1:1542\n1313#1:1544\n1319#1:1546\n1331#1:1548\n1336#1:1550\n1347#1:1552\n1359#1:1554\n1363#1:1556\n1370#1:1558\n1313#1:1543\n1370#1:1557\n*E\n"})
public final class cg implements androidx.compose.ui.window.s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f26754n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f26755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.runtime.n7<Unit> f26757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, Unit> f26759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.a3.a f26760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.a3.a f26761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.a3.a f26762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.a3.a f26763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.a3.b f26764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.a3.b f26765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.a3.b f26766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.a3.b f26767m;

    /* JADX WARN: Multi-variable type inference failed */
    public cg(@NotNull androidx.compose.ui.unit.d dVar, int i10, @Nullable androidx.compose.runtime.n7<Unit> n7Var, int i11, @NotNull Function2<? super androidx.compose.ui.unit.s, ? super androidx.compose.ui.unit.s, Unit> function2) {
        this.f26755a = dVar;
        this.f26756b = i10;
        this.f26757c = n7Var;
        this.f26758d = i11;
        this.f26759e = function2;
        androidx.compose.material3.internal.a3 a3Var = androidx.compose.material3.internal.a3.f28661a;
        this.f26760f = androidx.compose.material3.internal.a3.n(a3Var, 0, 1, null);
        this.f26761g = androidx.compose.material3.internal.a3.h(a3Var, 0, 1, null);
        this.f26762h = androidx.compose.material3.internal.a3.j(a3Var, 0, 1, null);
        this.f26763i = androidx.compose.material3.internal.a3.l(a3Var, 0, 1, null);
        this.f26764j = androidx.compose.material3.internal.a3.p(a3Var, 0, 1, null);
        this.f26765k = androidx.compose.material3.internal.a3.b(a3Var, 0, 1, null);
        this.f26766l = a3Var.q(i11);
        this.f26767m = a3Var.c(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.unit.s sVar, androidx.compose.ui.unit.s sVar2) {
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.window.s
    public long a(@NotNull androidx.compose.ui.unit.s sVar, long j10, @NotNull androidx.compose.ui.unit.w wVar, long j11) {
        androidx.compose.ui.unit.s sVar2;
        char c10;
        long j12;
        int iA;
        androidx.compose.runtime.n7<Unit> n7Var = this.f26757c;
        if (n7Var != null) {
            n7Var.getValue();
        }
        char c11 = ' ';
        long j13 = com.rabbitmq.client.k0.f265952a;
        long jE = androidx.compose.ui.unit.u.e((((long) (((int) (j10 & com.rabbitmq.client.k0.f265952a)) + this.f26756b)) & com.rabbitmq.client.k0.f265952a) | (((long) ((int) (j10 >> 32))) << 32));
        int i10 = (int) (jE >> 32);
        int i11 = 0;
        List listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.material3.internal.a3.a[]{this.f26760f, this.f26761g, androidx.compose.ui.unit.q.n(sVar.o()) < i10 / 2 ? this.f26762h : this.f26763i});
        int size = listListOf.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                sVar2 = sVar;
                c10 = c11;
                j12 = j13;
                iA = 0;
                break;
            }
            c10 = c11;
            j12 = j13;
            int i13 = (int) (j11 >> c10);
            int i14 = size;
            int i15 = i12;
            sVar2 = sVar;
            List list = listListOf;
            iA = ((androidx.compose.material3.internal.a3.a) listListOf.get(i12)).a(sVar2, jE, i13, wVar);
            if (i15 == CollectionsKt.getLastIndex(list) || (iA >= 0 && i13 + iA <= i10)) {
                break;
            }
            i12 = i15 + 1;
            listListOf = list;
            size = i14;
            c11 = c10;
            j13 = j12;
        }
        int i16 = (int) (jE & j12);
        List listListOf2 = CollectionsKt.listOf((Object[]) new androidx.compose.material3.internal.a3.b[]{this.f26764j, this.f26765k, androidx.compose.ui.unit.q.p(sVar2.o()) < i16 / 2 ? this.f26766l : this.f26767m});
        int size2 = listListOf2.size();
        for (int i17 = 0; i17 < size2; i17++) {
            int i18 = (int) (j11 & j12);
            int iA2 = ((androidx.compose.material3.internal.a3.b) listListOf2.get(i17)).a(sVar2, jE, i18);
            if (i17 == CollectionsKt.getLastIndex(listListOf2) || (iA2 >= 0 && i18 + iA2 <= i16)) {
                i11 = iA2;
                break;
            }
        }
        long jF = androidx.compose.ui.unit.q.f((((long) iA) << c10) | (((long) i11) & j12));
        this.f26759e.invoke(sVar2, androidx.compose.ui.unit.t.b(jF, j11));
        return jF;
    }

    @NotNull
    public final androidx.compose.ui.unit.d d() {
        return this.f26755a;
    }

    @Nullable
    public final androidx.compose.runtime.n7<Unit> e() {
        return this.f26757c;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, Unit> f() {
        return this.f26759e;
    }

    public final int g() {
        return this.f26756b;
    }

    public final int h() {
        return this.f26758d;
    }

    public /* synthetic */ cg(androidx.compose.ui.unit.d dVar, int i10, androidx.compose.runtime.n7 n7Var, int i11, Function2 function2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i10, (i12 & 4) != 0 ? null : n7Var, (i12 & 8) != 0 ? dVar.g6(bk.n()) : i11, (i12 & 16) != 0 ? new Function2() { // from class: androidx.compose.material3.bg
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return cg.c((androidx.compose.ui.unit.s) obj, (androidx.compose.ui.unit.s) obj2);
            }
        } : function2);
    }
}
