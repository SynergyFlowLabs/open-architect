package androidx.activity.compose;

import androidx.activity.j0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.e1;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.o0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,200:1\n481#2:201\n480#2,4:202\n484#2,2:209\n488#2:215\n1225#3,3:206\n1228#3,3:212\n1225#3,6:216\n1225#3,6:222\n1225#3,6:228\n1225#3,6:235\n480#4:211\n77#5:234\n81#6:241\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n80#1:201\n80#1:202,4\n80#1:209,2\n80#1:215\n80#1:206,3\n80#1:212,3\n82#1:216,6\n87#1:222,6\n92#1:228,6\n103#1:235,6\n80#1:211\n101#1:234\n79#1:241\n*E\n"})
public final class n {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f9848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, boolean z10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f9848b = mVar;
            this.f9849c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f9848b, this.f9849c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f9847a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f9848b.g(this.f9849c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,200:1\n64#2,5:201\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3$1\n*L\n106#1:201,5\n*E\n"})
    static final class b extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0 f9850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f9851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f9852c;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3$1\n*L\n1#1,490:1\n106#2:491\n*E\n"})
        public static final class a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f9853a;

            public a(m mVar) {
                this.f9853a = mVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f9853a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0 j0Var, o0 o0Var, m mVar) {
            super(1);
            this.f9850a = j0Var;
            this.f9851b = o0Var;
            this.f9852c = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(v1 v1Var) {
            this.f9850a.i(this.f9851b, this.f9852c);
            return new a(this.f9852c);
        }
    }

    static final class c extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.flow.i<androidx.activity.d>, kotlin.coroutines.d<Unit>, Object> f9855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9857d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z10, Function2<kotlinx.coroutines.flow.i<androidx.activity.d>, ? super kotlin.coroutines.d<Unit>, ? extends Object> function2, int i10, int i11) {
            super(2);
            this.f9854a = z10;
            this.f9855b = function2;
            this.f9856c = i10;
            this.f9857d = i11;
        }

        public final void c(c0 c0Var, int i10) {
            n.a(this.f9854a, this.f9855b, c0Var, t4.a(this.f9856c | 1), this.f9857d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @e.a({"RememberReturnType"})
    public static final void a(boolean z10, @NotNull Function2<kotlinx.coroutines.flow.i<androidx.activity.d>, ? super kotlin.coroutines.d<Unit>, ? extends Object> function2, @Nullable c0 c0Var, int i10, int i11) {
        int i12;
        c0 c0VarR = c0Var.R(-642000585);
        int i13 = i11 & 1;
        int i14 = 0 & 4;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            if (m0.l0()) {
                m0.A0(-642000585, i12, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)");
            }
            n7 n7VarW = w6.w(function2, c0VarR, (i12 >> 3) & 14);
            Object objI0 = c0VarR.i0();
            c0.a aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                e1 e1Var = new e1(b2.o(kotlin.coroutines.h.f312451a, c0VarR));
                c0VarR.Y(e1Var);
                objI0 = e1Var;
            }
            s0 s0VarA = ((e1) objI0).a();
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new m(z10, s0VarA, b(n7VarW));
                c0VarR.Y(objI1);
            }
            m mVar = (m) objI1;
            boolean zD = c0VarR.D(b(n7VarW)) | c0VarR.D(s0VarA);
            Object objI2 = c0VarR.i0();
            if (zD || objI2 == aVar.a()) {
                mVar.f(b(n7VarW));
                mVar.h(s0VarA);
                c0VarR.Y(Unit.f312394a);
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            int i15 = i12 & 14;
            boolean zK0 = c0VarR.k0(mVar) | (i15 == 4);
            Object objI3 = c0VarR.i0();
            if (zK0 || objI3 == aVar.a()) {
                objI3 = new a(mVar, z10, null);
                c0VarR.Y(objI3);
            }
            b2.i(boolValueOf, (Function2) objI3, c0VarR, i15);
            androidx.activity.m0 m0VarA = j.f9826a.a(c0VarR, 6);
            if (m0VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            j0 onBackPressedDispatcher = m0VarA.getOnBackPressedDispatcher();
            o0 o0Var = (o0) c0VarR.W(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zK1 = c0VarR.k0(onBackPressedDispatcher) | c0VarR.k0(o0Var) | c0VarR.k0(mVar);
            Object objI4 = c0VarR.i0();
            if (zK1 || objI4 == aVar.a()) {
                objI4 = new b(onBackPressedDispatcher, o0Var, mVar);
                c0VarR.Y(objI4);
            }
            b2.c(o0Var, onBackPressedDispatcher, (Function1) objI4, c0VarR, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new c(z10, function2, i10, i11));
        }
    }

    private static final Function2<kotlinx.coroutines.flow.i<androidx.activity.d>, kotlin.coroutines.d<Unit>, Object> b(n7<? extends Function2<kotlinx.coroutines.flow.i<androidx.activity.d>, ? super kotlin.coroutines.d<Unit>, ? extends Object>> n7Var) {
        return (Function2) n7Var.getValue();
    }
}
