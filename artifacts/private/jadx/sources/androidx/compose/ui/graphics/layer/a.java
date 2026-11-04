package androidx.compose.ui.graphics.layer;

import androidx.collection.d3;
import androidx.collection.l2;
import androidx.compose.ui.graphics.w1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nChildLayerDependenciesTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,114:1\n1#2:115\n231#3,3:116\n200#3,7:119\n211#3,3:127\n214#3,9:131\n234#3:140\n231#3,3:145\n200#3,7:148\n211#3,3:156\n214#3,9:160\n234#3:169\n1399#4:126\n1270#4:130\n1399#4:155\n1270#4:159\n34#5,4:141\n*S KotlinDebug\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n*L\n63#1:116,3\n63#1:119,7\n63#1:127,3\n63#1:131,9\n63#1:140\n109#1:145,3\n109#1:148,7\n109#1:156,3\n109#1:160,9\n109#1:169\n63#1:126\n63#1:130\n109#1:155\n109#1:159\n71#1:141,4\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private c f37869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private c f37870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private l2<c> f37871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private l2<c> f37872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37873e;

    public final boolean i(@NotNull c cVar) {
        if (!this.f37873e) {
            w1.b("Only add dependencies during a tracking");
        }
        l2<c> l2Var = this.f37871c;
        if (l2Var != null) {
            Intrinsics.checkNotNull(l2Var);
            l2Var.C(cVar);
        } else if (this.f37869a != null) {
            l2<c> l2VarB = d3.b();
            c cVar2 = this.f37869a;
            Intrinsics.checkNotNull(cVar2);
            l2VarB.C(cVar2);
            l2VarB.C(cVar);
            this.f37871c = l2VarB;
            this.f37869a = null;
        } else {
            this.f37869a = cVar;
        }
        l2<c> l2Var2 = this.f37872d;
        if (l2Var2 != null) {
            Intrinsics.checkNotNull(l2Var2);
            return !l2Var2.g0(cVar);
        }
        if (this.f37870b != cVar) {
            return true;
        }
        this.f37870b = null;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x005b A[LOOP:0: B:10:0x001f->B:20:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[EDGE_INSN: B:24:0x005e->B:21:0x005e BREAK  A[LOOP:0: B:10:0x001f->B:20:0x005b], SYNTHETIC] */
    public final void j(@NotNull Function1<? super c, Unit> function1) {
        c cVar = this.f37869a;
        if (cVar != null) {
            function1.invoke(cVar);
            this.f37869a = null;
        }
        l2 l2Var = this.f37871c;
        if (l2Var != null) {
            Object[] objArr = l2Var.f12171b;
            long[] jArr = l2Var.f12170a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                function1.invoke(objArr[(i10 << 3) + i12]);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            l2Var.L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0088 A[LOOP:0: B:20:0x0050->B:30:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[EDGE_INSN: B:34:0x008b->B:31:0x008b BREAK  A[LOOP:0: B:20:0x0050->B:30:0x0088], SYNTHETIC] */
    public final void k(@NotNull Function1<? super c, Unit> function1, @NotNull Function0<Unit> function0) {
        this.f37870b = this.f37869a;
        l2 l2Var = this.f37871c;
        if (l2Var != null && l2Var.s()) {
            l2 l2VarB = this.f37872d;
            if (l2VarB == null) {
                l2VarB = d3.b();
                this.f37872d = l2VarB;
            }
            l2VarB.F(l2Var);
            l2Var.L();
        }
        this.f37873e = true;
        function0.invoke();
        this.f37873e = false;
        c cVar = this.f37870b;
        if (cVar != null) {
            function1.invoke(cVar);
        }
        l2 l2Var2 = this.f37872d;
        if (l2Var2 == null || !l2Var2.s()) {
            return;
        }
        Object[] objArr = l2Var2.f12171b;
        long[] jArr = l2Var2.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            function1.invoke(objArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        l2Var2.L();
    }
}
