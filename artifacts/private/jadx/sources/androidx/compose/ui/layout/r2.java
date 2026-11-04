package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,65:1\n151#2,2:66\n35#2,5:68\n153#2:73\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n*L\n49#1:66,2\n49#1:68,5\n49#1:73\n*E\n"})
public final class r2 extends androidx.compose.ui.node.l0.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final r2 f39474c = new r2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39475d = 0;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39476a = new a();

        a() {
            super(1);
        }

        public final void c(i2.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f39477a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i2 i2Var) {
            super(1);
            this.f39477a = i2Var;
        }

        public final void c(i2.a aVar) {
            i2.a.p0(aVar, this.f39477a, 0, 0, 0.0f, null, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy$measure$3\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,65:1\n35#2,5:66\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy$measure$3\n*L\n59#1:66,5\n*E\n"})
    static final class c extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<i2> f39478a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends i2> list) {
            super(1);
            this.f39478a = list;
        }

        public final void c(i2.a aVar) {
            List<i2> list = this.f39478a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                i2.a.p0(aVar, list.get(i10), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    private r2() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public b1 a(@NotNull c1 c1Var, @NotNull List<? extends z0> list, long j10) {
        int size = list.size();
        if (size == 0) {
            return c1.h6(c1Var, androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.q(j10), null, a.f39476a, 4, null);
        }
        if (size == 1) {
            i2 i2VarP0 = list.get(0).P0(j10);
            return c1.h6(c1Var, androidx.compose.ui.unit.c.i(j10, i2VarP0.h1()), androidx.compose.ui.unit.c.h(j10, i2VarP0.c1()), null, new b(i2VarP0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            i2 i2VarP1 = list.get(i10).P0(j10);
            iMax = Math.max(i2VarP1.h1(), iMax);
            iMax2 = Math.max(i2VarP1.c1(), iMax2);
            arrayList.add(i2VarP1);
        }
        return c1.h6(c1Var, androidx.compose.ui.unit.c.i(j10, iMax), androidx.compose.ui.unit.c.h(j10, iMax2), null, new c(arrayList), 4, null);
    }
}
