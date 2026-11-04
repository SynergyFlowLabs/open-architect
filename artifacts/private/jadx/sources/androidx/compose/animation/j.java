package androidx.compose.animation;

import androidx.compose.ui.layout.i2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,862:1\n151#2,2:863\n35#2,5:865\n153#2:870\n345#2,7:875\n345#2,7:882\n345#2,7:889\n345#2,7:896\n30#3:871\n30#3:873\n80#4:872\n80#4:874\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n790#1:863,2\n790#1:865,5\n790#1:870\n810#1:875,7\n815#1:882,7\n820#1:889,7\n825#1:896,7\n799#1:871\n802#1:873\n799#1:872\n802#1:874\n*E\n"})
final class j implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f13538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13539b;

    @SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,862:1\n35#2,5:863\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n*L\n804#1:863,5\n*E\n"})
    static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<i2> f13540a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends i2> list) {
            super(1);
            this.f13540a = list;
        }

        public final void c(i2.a aVar) {
            List<i2> list = this.f13540a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = 5 & 0;
                i2.a.P(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public j(@NotNull m mVar) {
        this.f13538a = mVar;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i2 i2VarP0 = list.get(i10).P0(j10);
            iMax = Math.max(iMax, i2VarP0.h1());
            iMax2 = Math.max(iMax2, i2VarP0.c1());
            arrayList.add(i2VarP0);
        }
        if (c1Var.P5()) {
            this.f13539b = true;
            this.f13538a.a().setValue(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.e((((long) iMax2) & com.rabbitmq.client.k0.f265952a) | (((long) iMax) << 32))));
        } else if (!this.f13539b) {
            this.f13538a.a().setValue(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.e((((long) iMax2) & com.rabbitmq.client.k0.f265952a) | (((long) iMax) << 32))));
        }
        return androidx.compose.ui.layout.c1.h6(c1Var, iMax, iMax2, null, new a(arrayList), 4, null);
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD0 = list.get(0).D0(i10);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iD1 = list.get(i11).D0(i10);
                if (iD1 > iD0) {
                    iD0 = iD1;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return iD0;
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iL0 = list.get(0).L0(i10);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iL1 = list.get(i11).L0(i10);
                if (iL1 > iL0) {
                    iL0 = iL1;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return iL0;
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iP0 = list.get(0).p0(i10);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iP1 = list.get(i11).p0(i10);
                if (iP1 > iP0) {
                    iP0 = iP1;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return iP0;
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iM0 = list.get(0).M0(i10);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM1 = list.get(i11).M0(i10);
                if (iM1 > iM0) {
                    iM0 = iM1;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return iM0;
    }

    public final boolean f() {
        return this.f13539b;
    }

    @NotNull
    public final m g() {
        return this.f13538a;
    }

    public final void h(boolean z10) {
        this.f13539b = z10;
    }
}
