package coil.compose;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.z0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nConstraintsSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintsSizeResolver.kt\ncoil/compose/ConstraintsSizeResolver\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,45:1\n56#2:46\n59#2:50\n46#3:47\n51#3:49\n105#4:48\n*S KotlinDebug\n*F\n+ 1 ConstraintsSizeResolver.kt\ncoil/compose/ConstraintsSizeResolver\n*L\n23#1:46\n23#1:50\n23#1:47\n23#1:49\n23#1:48\n*E\n"})
public final class k implements coil.size.j, o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f87059b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k0<androidx.compose.ui.unit.b> f87060a = b1.a(androidx.compose.ui.unit.b.a(g0.i()));

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.i<coil.size.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f87061a;

        /* JADX INFO: renamed from: coil.compose.k$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConstraintsSizeResolver.kt\ncoil/compose/ConstraintsSizeResolver\n*L\n1#1,218:1\n57#2:219\n58#2:221\n23#3:220\n*E\n"})
        public static final class C0811a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f87062a;

            /* JADX INFO: renamed from: coil.compose.k$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "ConstraintsSizeResolver.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
            public static final class C0812a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f87063a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f87064b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f87065c;

                public C0812a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f87063a = obj;
                    this.f87064b |= Integer.MIN_VALUE;
                    return C0811a.this.emit(null, this);
                }
            }

            public C0811a(kotlinx.coroutines.flow.j jVar) {
                this.f87062a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            @Override // kotlinx.coroutines.flow.j
            @Nullable
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0812a c0812a;
                if (dVar instanceof C0812a) {
                    c0812a = (C0812a) dVar;
                    int i10 = c0812a.f87064b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0812a.f87064b = i10 - Integer.MIN_VALUE;
                    } else {
                        c0812a = new C0812a(dVar);
                    }
                } else {
                    c0812a = new C0812a(dVar);
                }
                Object obj2 = c0812a.f87063a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0812a.f87064b;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f87062a;
                    coil.size.i iVarR = g0.r(((androidx.compose.ui.unit.b) obj).x());
                    if (iVarR != null) {
                        c0812a.f87064b = 1;
                        if (jVar.emit(iVarR, c0812a) == objL) {
                            return objL;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj2);
                }
                return Unit.f312394a;
            }
        }

        public a(kotlinx.coroutines.flow.i iVar) {
            this.f87061a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j<? super coil.size.i> jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f87061a.collect(new C0811a(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(i2 i2Var, i2.a aVar) {
        int i10 = 1 << 0;
        i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    @Override // coil.size.j
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super coil.size.i> dVar) {
        return kotlinx.coroutines.flow.k.w0(new a(this.f87060a), dVar);
    }

    @Override // androidx.compose.ui.layout.o0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        this.f87060a.setValue(androidx.compose.ui.unit.b.a(j10));
        final i2 i2VarP0 = z0Var.P0(j10);
        return c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: coil.compose.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.l(i2VarP0, (i2.a) obj);
            }
        }, 4, null);
    }

    public final void m(long j10) {
        this.f87060a.setValue(androidx.compose.ui.unit.b.a(j10));
    }
}
