package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipPositionProviderImpl\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1654:1\n54#2:1655\n59#2:1657\n54#2:1661\n54#2:1663\n59#2:1665\n54#2:1669\n54#2:1671\n54#2:1673\n59#2:1675\n54#2:1679\n54#2:1681\n54#2:1683\n59#2:1685\n59#2:1687\n85#3:1656\n90#3:1658\n80#3:1660\n85#3:1662\n85#3:1664\n90#3:1666\n80#3:1668\n85#3:1670\n85#3:1672\n85#3:1674\n90#3:1676\n80#3:1678\n85#3:1680\n85#3:1682\n85#3:1684\n90#3:1686\n90#3:1688\n80#3:1690\n32#4:1659\n32#4:1667\n32#4:1677\n32#4:1689\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipPositionProviderImpl\n*L\n1027#1:1655\n1036#1:1657\n1051#1:1661\n1054#1:1663\n1058#1:1665\n1071#1:1669\n1077#1:1671\n1080#1:1673\n1086#1:1675\n1100#1:1679\n1106#1:1681\n1109#1:1683\n1116#1:1685\n1117#1:1687\n1027#1:1656\n1036#1:1658\n1037#1:1660\n1051#1:1662\n1054#1:1664\n1058#1:1666\n1059#1:1668\n1071#1:1670\n1077#1:1672\n1080#1:1674\n1086#1:1676\n1088#1:1678\n1100#1:1680\n1106#1:1682\n1109#1:1684\n1116#1:1686\n1117#1:1688\n1119#1:1690\n1037#1:1659\n1059#1:1667\n1088#1:1677\n1119#1:1689\n*E\n"})
final class j90 implements androidx.compose.ui.window.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29720b;

    public /* synthetic */ j90(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    @Override // androidx.compose.ui.window.s
    public long a(@NotNull androidx.compose.ui.unit.s sVar, long j10, @NotNull androidx.compose.ui.unit.w wVar, long j11) {
        int i10 = this.f29719a;
        s80.a aVar = s80.f32838b;
        if (s80.j(i10, aVar.d())) {
            return g(sVar, j11);
        }
        if (s80.j(i10, aVar.e())) {
            return h(sVar, j11, j10);
        }
        if (s80.j(i10, aVar.a())) {
            return b(sVar, j11, j10);
        }
        if (s80.j(i10, aVar.b())) {
            return c(sVar, j11, j10);
        }
        if (s80.j(i10, aVar.f())) {
            return i(wVar, sVar, j11, j10);
        }
        return s80.j(i10, aVar.c()) ? d(wVar, sVar, j11, j10) : b(sVar, j11, j10);
    }

    public final long b(@NotNull androidx.compose.ui.unit.s sVar, long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int iT = sVar.t() + ((sVar.G() - i10) / 2);
        if (iT < 0) {
            iT = sVar.t();
        } else if (iT + i10 > ((int) (j11 >> 32))) {
            iT = sVar.x() - i10;
        }
        int iB = (sVar.B() - ((int) (j10 & com.rabbitmq.client.k0.f265952a))) - this.f29720b;
        if (iB < 0) {
            iB = sVar.j() + this.f29720b;
        }
        return androidx.compose.ui.unit.q.f((((long) iT) << 32) | (((long) iB) & com.rabbitmq.client.k0.f265952a));
    }

    public final long c(@NotNull androidx.compose.ui.unit.s sVar, long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int iT = sVar.t() + ((sVar.G() - i10) / 2);
        if (iT < 0) {
            iT = sVar.t();
        } else if (iT + i10 > ((int) (j11 >> 32))) {
            iT = sVar.x() - i10;
        }
        int iJ = sVar.j() + this.f29720b;
        int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        if (iJ + i11 > ((int) (j11 & com.rabbitmq.client.k0.f265952a))) {
            iJ = (sVar.B() - i11) - this.f29720b;
        }
        return androidx.compose.ui.unit.q.f((((long) iT) << 32) | (((long) iJ) & com.rabbitmq.client.k0.f265952a));
    }

    public final long d(@NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.s sVar, long j10, long j11) {
        return wVar == androidx.compose.ui.unit.w.Ltr ? h(sVar, j10, j11) : g(sVar, j10);
    }

    public final int e() {
        return this.f29720b;
    }

    public final int f() {
        return this.f29719a;
    }

    public final long g(@NotNull androidx.compose.ui.unit.s sVar, long j10) {
        int iT = sVar.t() - (((int) (j10 >> 32)) + this.f29720b);
        if (iT < 0) {
            iT = sVar.x() + this.f29720b;
        }
        return androidx.compose.ui.unit.q.f((((long) iT) << 32) | (((long) (((sVar.B() + sVar.j()) - ((int) (j10 & com.rabbitmq.client.k0.f265952a))) / 2)) & com.rabbitmq.client.k0.f265952a));
    }

    public final long h(@NotNull androidx.compose.ui.unit.s sVar, long j10, long j11) {
        int iX = sVar.x() + this.f29720b;
        int i10 = (int) (j10 >> 32);
        if (iX + i10 > ((int) (j11 >> 32))) {
            iX = sVar.t() - (i10 + this.f29720b);
        }
        return androidx.compose.ui.unit.q.f((((long) iX) << 32) | (((long) (((sVar.B() + sVar.j()) - ((int) (j10 & com.rabbitmq.client.k0.f265952a))) / 2)) & com.rabbitmq.client.k0.f265952a));
    }

    public final long i(@NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.s sVar, long j10, long j11) {
        return wVar == androidx.compose.ui.unit.w.Ltr ? g(sVar, j10) : h(sVar, j10, j11);
    }

    private j90(int i10, int i11) {
        this.f29719a = i10;
        this.f29720b = i11;
    }
}
