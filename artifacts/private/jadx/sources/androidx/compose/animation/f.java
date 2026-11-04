package androidx.compose.animation;

import androidx.compose.ui.layout.i2;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n71#2,3:960\n75#2:965\n71#2,5:966\n321#2,7:1005\n321#2,7:1012\n321#2,7:1019\n321#2,7:1026\n30#3:963\n30#3:1003\n80#4:964\n85#4:972\n90#4:988\n80#4:1004\n54#5:971\n59#5:987\n13996#6,14:973\n13996#6,14:989\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n*L\n888#1:960,3\n888#1:965\n901#1:966,5\n942#1:1005,7\n947#1:1012,7\n952#1:1019,7\n957#1:1026,7\n895#1:963\n920#1:1003\n895#1:964\n908#1:972\n914#1:988\n920#1:1004\n908#1:971\n914#1:987\n910#1:973,14\n916#1:989,14\n*E\n"})
final class f implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AnimatedContentTransitionScopeImpl<?> f13488a;

    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,959:1\n13409#2:960\n13410#2:965\n30#3:961\n30#3:963\n80#4:962\n80#4:964\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n*L\n925#1:960\n925#1:965\n929#1:961\n930#1:963\n929#1:962\n930#1:964\n*E\n"})
    static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2[] f13489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f13490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13492d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i2[] i2VarArr, f fVar, int i10, int i11) {
            super(1);
            this.f13489a = i2VarArr;
            this.f13490b = fVar;
            this.f13491c = i10;
            this.f13492d = i11;
        }

        public final void c(i2.a aVar) {
            i2[] i2VarArr = this.f13489a;
            f fVar = this.f13490b;
            int i10 = this.f13491c;
            int i11 = this.f13492d;
            for (i2 i2Var : i2VarArr) {
                if (i2Var != null) {
                    long jA = fVar.f().g().a(androidx.compose.ui.unit.u.e((((long) i2Var.h1()) << 32) | (((long) i2Var.c1()) & com.rabbitmq.client.k0.f265952a)), androidx.compose.ui.unit.u.e((((long) i10) << 32) | (((long) i11) & com.rabbitmq.client.k0.f265952a)), androidx.compose.ui.unit.w.Ltr);
                    i2.a.P(aVar, i2Var, androidx.compose.ui.unit.q.n(jA), androidx.compose.ui.unit.q.p(jA), 0.0f, 4, null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public f(@NotNull AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.f13488a = animatedContentTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        i2 i2Var;
        int i10;
        i2 i2Var2;
        int iH1;
        int iC1;
        int size = list.size();
        i2[] i2VarArr = new i2[size];
        long jA = androidx.compose.ui.unit.u.f42720b.a();
        List<? extends androidx.compose.ui.layout.z0> list2 = list;
        int size2 = list2.size();
        int i11 = 0;
        while (true) {
            i2Var = null;
            i10 = 1;
            if (i11 >= size2) {
                break;
            }
            androidx.compose.ui.layout.z0 z0Var = list.get(i11);
            Object objC = z0Var.c();
            AnimatedContentTransitionScopeImpl.a aVar = objC instanceof AnimatedContentTransitionScopeImpl.a ? (AnimatedContentTransitionScopeImpl.a) objC : null;
            if (aVar != null && aVar.a()) {
                i2 i2VarP0 = z0Var.P0(j10);
                long jE = androidx.compose.ui.unit.u.e((((long) i2VarP0.h1()) << 32) | (((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a));
                Unit unit = Unit.f312394a;
                i2VarArr[i11] = i2VarP0;
                jA = jE;
            }
            i11++;
        }
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            androidx.compose.ui.layout.z0 z0Var2 = list.get(i12);
            if (i2VarArr[i12] == null) {
                i2VarArr[i12] = z0Var2.P0(j10);
            }
        }
        if (c1Var.P5()) {
            iH1 = (int) (jA >> 32);
        } else {
            if (size != 0) {
                i2Var2 = i2VarArr[0];
                int lastIndex = ArraysKt.getLastIndex(i2VarArr);
                if (lastIndex != 0) {
                    int iH2 = i2Var2 != null ? i2Var2.h1() : 0;
                    if (1 <= lastIndex) {
                        int i13 = 1;
                        while (true) {
                            i2 i2Var3 = i2VarArr[i13];
                            int iH3 = i2Var3 != null ? i2Var3.h1() : 0;
                            if (iH2 < iH3) {
                                i2Var2 = i2Var3;
                                iH2 = iH3;
                            }
                            if (i13 == lastIndex) {
                                break;
                            }
                            i13++;
                        }
                    }
                }
            } else {
                i2Var2 = null;
            }
            iH1 = i2Var2 != null ? i2Var2.h1() : 0;
        }
        if (c1Var.P5()) {
            iC1 = (int) (jA & com.rabbitmq.client.k0.f265952a);
        } else {
            if (size != 0) {
                i2Var = i2VarArr[0];
                int lastIndex2 = ArraysKt.getLastIndex(i2VarArr);
                if (lastIndex2 != 0) {
                    int iC2 = i2Var != null ? i2Var.c1() : 0;
                    if (1 <= lastIndex2) {
                        while (true) {
                            i2 i2Var4 = i2VarArr[i10];
                            int iC3 = i2Var4 != null ? i2Var4.c1() : 0;
                            if (iC2 < iC3) {
                                i2Var = i2Var4;
                                iC2 = iC3;
                            }
                            if (i10 == lastIndex2) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
            iC1 = i2Var != null ? i2Var.c1() : 0;
        }
        if (!c1Var.P5()) {
            this.f13488a.D(androidx.compose.ui.unit.u.e((((long) iH1) << 32) | (((long) iC1) & com.rabbitmq.client.k0.f265952a)));
        }
        return androidx.compose.ui.layout.c1.h6(c1Var, iH1, iC1, null, new a(i2VarArr, this, iH1, iC1), 4, null);
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).D0(i10));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).D0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).L0(i10));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).L0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).p0(i10));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).p0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).M0(i10));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).M0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @NotNull
    public final AnimatedContentTransitionScopeImpl<?> f() {
        return this.f13488a;
    }
}
