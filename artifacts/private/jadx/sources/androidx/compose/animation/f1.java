package androidx.compose.animation;

import androidx.compose.animation.core.t4;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.ui.layout.i2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,269:1\n85#2:270\n117#2,2:271\n30#3:273\n30#3:281\n80#4:274\n85#4:277\n90#4:280\n80#4:282\n61#5:275\n54#5:276\n63#5:278\n59#5:279\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n*L\n168#1:270\n168#1:271,2\n196#1:273\n238#1:281\n196#1:274\n197#1:277\n197#1:280\n238#1:282\n197#1:275\n197#1:276\n197#1:278\n197#1:279\n*E\n"})
final class f1 extends o0 {
    private long X;
    private long Y;
    private boolean Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final n3 f13497p0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.o<androidx.compose.ui.unit.u> f13498t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.e f13499v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, Unit> f13500w;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f13501c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.animation.core.c<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> f13502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f13503b;

        public /* synthetic */ a(androidx.compose.animation.core.c cVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a d(a aVar, androidx.compose.animation.core.c cVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f13502a;
            }
            if ((i10 & 2) != 0) {
                j10 = aVar.f13503b;
            }
            return aVar.c(cVar, j10);
        }

        @NotNull
        public final androidx.compose.animation.core.c<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> a() {
            return this.f13502a;
        }

        public final long b() {
            return this.f13503b;
        }

        @NotNull
        public final a c(@NotNull androidx.compose.animation.core.c<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> cVar, long j10) {
            return new a(cVar, j10, null);
        }

        @NotNull
        public final androidx.compose.animation.core.c<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> e() {
            return this.f13502a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f13502a, aVar.f13502a) && androidx.compose.ui.unit.u.h(this.f13503b, aVar.f13503b);
        }

        public final long f() {
            return this.f13503b;
        }

        public final void g(long j10) {
            this.f13503b = j10;
        }

        public int hashCode() {
            return (this.f13502a.hashCode() * 31) + androidx.compose.ui.unit.u.n(this.f13503b);
        }

        @NotNull
        public String toString() {
            return "AnimData(anim=" + this.f13502a + ", startSize=" + ((Object) androidx.compose.ui.unit.u.p(this.f13503b)) + ')';
        }

        private a(androidx.compose.animation.core.c<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> cVar, long j10) {
            this.f13502a = cVar;
            this.f13503b = j10;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f13505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1 f13507d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, long j10, f1 f1Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f13505b = aVar;
            this.f13506c = j10;
            this.f13507d = f1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f13505b, this.f13506c, this.f13507d, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, Unit> function2Z9;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13504a;
            int i11 = 5 | 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> cVarE = this.f13505b.e();
                androidx.compose.ui.unit.u uVarB = androidx.compose.ui.unit.u.b(this.f13506c);
                androidx.compose.animation.core.o<androidx.compose.ui.unit.u> oVarY9 = this.f13507d.y9();
                this.f13504a = 1;
                int i12 = (6 << 0) | 0;
                bVar = this;
                obj = androidx.compose.animation.core.c.i(cVarE, uVarB, oVarY9, null, null, bVar, 12, null);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                bVar = this;
            }
            androidx.compose.animation.core.m mVar = (androidx.compose.animation.core.m) obj;
            if (mVar.a() == androidx.compose.animation.core.i.Finished && (function2Z9 = bVar.f13507d.z9()) != 0) {
                function2Z9.invoke(androidx.compose.ui.unit.u.b(bVar.f13505b.f()), mVar.b().getValue());
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode$measure$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,269:1\n30#2:270\n80#3:271\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode$measure$2\n*L\n212#1:270\n212#1:271\n*E\n"})
    static final class c extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f13509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.c1 f13512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i2 f13513f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, int i10, int i11, androidx.compose.ui.layout.c1 c1Var, i2 i2Var) {
            super(1);
            this.f13509b = j10;
            this.f13510c = i10;
            this.f13511d = i11;
            this.f13512e = c1Var;
            this.f13513f = i2Var;
        }

        public final void c(i2.a aVar) {
            i2.a.V(aVar, this.f13513f, f1.this.w9().a(this.f13509b, androidx.compose.ui.unit.u.e((((long) this.f13510c) << 32) | (((long) this.f13511d) & com.rabbitmq.client.k0.f265952a)), this.f13512e.getLayoutDirection()), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ f1(androidx.compose.animation.core.o oVar, androidx.compose.ui.e eVar, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, (i10 & 2) != 0 ? androidx.compose.ui.e.f37317a.C() : eVar, (i10 & 4) != 0 ? null : function2);
    }

    private final void E9(long j10) {
        this.Y = j10;
        this.Z = true;
    }

    private final long F9(long j10) {
        return this.Z ? this.Y : j10;
    }

    public final void A9(@NotNull androidx.compose.ui.e eVar) {
        this.f13499v = eVar;
    }

    public final void B9(@Nullable a aVar) {
        this.f13497p0.setValue(aVar);
    }

    public final void C9(@NotNull androidx.compose.animation.core.o<androidx.compose.ui.unit.u> oVar) {
        this.f13498t = oVar;
    }

    public final void D9(@Nullable Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, Unit> function2) {
        this.f13500w = function2;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        i2 i2VarP0;
        long jF;
        if (c1Var.P5()) {
            E9(j10);
            i2VarP0 = z0Var.P0(j10);
        } else {
            i2VarP0 = z0Var.P0(F9(j10));
        }
        i2 i2Var = i2VarP0;
        long jE = androidx.compose.ui.unit.u.e((((long) i2Var.h1()) << 32) | (((long) i2Var.c1()) & com.rabbitmq.client.k0.f265952a));
        if (c1Var.P5()) {
            this.X = jE;
            jF = jE;
        } else {
            jF = androidx.compose.ui.unit.c.f(j10, v9(n.f(this.X) ? this.X : jE));
        }
        int i10 = (int) (jF >> 32);
        int i11 = (int) (jF & com.rabbitmq.client.k0.f265952a);
        return androidx.compose.ui.layout.c1.h6(c1Var, i10, i11, null, new c(jE, i10, i11, c1Var, i2Var), 4, null);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        super.e9();
        this.X = n.e();
        this.Z = false;
    }

    @Override // androidx.compose.ui.a0.d
    public void g9() {
        super.g9();
        B9(null);
    }

    public final long v9(long j10) {
        a aVarX9 = x9();
        if (aVarX9 != null) {
            boolean z10 = (androidx.compose.ui.unit.u.h(j10, aVarX9.e().v().q()) || aVarX9.e().y()) ? false : true;
            if (!androidx.compose.ui.unit.u.h(j10, aVarX9.e().s().q()) || z10) {
                aVarX9.g(aVarX9.e().v().q());
                kotlinx.coroutines.k.f(Q8(), null, null, new b(aVarX9, j10, this, null), 3, null);
            }
        } else {
            long j11 = 1;
            aVarX9 = new a(new androidx.compose.animation.core.c(androidx.compose.ui.unit.u.b(j10), t4.O(androidx.compose.ui.unit.u.f42720b), androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.e((j11 & com.rabbitmq.client.k0.f265952a) | (j11 << 32))), null, 8, null), j10, null);
        }
        B9(aVarX9);
        return aVarX9.e().v().q();
    }

    @NotNull
    public final androidx.compose.ui.e w9() {
        return this.f13499v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final a x9() {
        return (a) this.f13497p0.getValue();
    }

    @NotNull
    public final androidx.compose.animation.core.o<androidx.compose.ui.unit.u> y9() {
        return this.f13498t;
    }

    @Nullable
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, Unit> z9() {
        return this.f13500w;
    }

    public f1(@NotNull androidx.compose.animation.core.o<androidx.compose.ui.unit.u> oVar, @NotNull androidx.compose.ui.e eVar, @Nullable Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, Unit> function2) {
        this.f13498t = oVar;
        this.f13499v = eVar;
        this.f13500w = function2;
        this.X = n.e();
        this.Y = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);
        this.f13497p0 = d7.g(null, null, 2, null);
    }
}
