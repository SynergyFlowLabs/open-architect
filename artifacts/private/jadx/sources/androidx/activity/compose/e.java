package androidx.activity.compose;

import androidx.activity.i0;
import androidx.activity.j0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n1225#2,6:110\n1225#2,6:116\n1225#2,6:123\n77#3:122\n81#4:129\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n*L\n86#1:110,6\n94#1:116,6\n102#1:123,6\n101#1:122\n84#1:129\n*E\n"})
public final class e {

    static final class a extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f9804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9805b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, boolean z10) {
            super(0);
            this.f9804a = dVar;
            this.f9805b = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f9804a.setEnabled(this.f9805b);
        }
    }

    @SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,109:1\n64#2,5:110\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2$1\n*L\n106#1:110,5\n*E\n"})
    static final class b extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0 f9806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f9807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f9808c;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2$1\n*L\n1#1,490:1\n106#2:491\n*E\n"})
        public static final class a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f9809a;

            public a(d dVar) {
                this.f9809a = dVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f9809a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0 j0Var, o0 o0Var, d dVar) {
            super(1);
            this.f9806a = j0Var;
            this.f9807b = o0Var;
            this.f9808c = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(v1 v1Var) {
            this.f9806a.i(this.f9807b, this.f9808c);
            return new a(this.f9808c);
        }
    }

    static final class c extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f9811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9813d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f9810a = z10;
            this.f9811b = function0;
            this.f9812c = i10;
            this.f9813d = i11;
        }

        public final void c(c0 c0Var, int i10) {
            e.a(this.f9810a, this.f9811b, c0Var, t4.a(this.f9812c | 1), this.f9813d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public static final class d extends i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n7<Function0<Unit>> f9814a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, n7<? extends Function0<Unit>> n7Var) {
            super(z10);
            this.f9814a = n7Var;
        }

        @Override // androidx.activity.i0
        public void handleOnBackPressed() {
            e.b(this.f9814a).invoke();
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
    public static final void a(boolean z10, @NotNull Function0<Unit> function0, @Nullable c0 c0Var, int i10, int i11) {
        int i12;
        c0 c0VarR = c0Var.R(-361453782);
        int i13 = i11 & 1;
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
            i12 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            if (m0.l0()) {
                m0.A0(-361453782, i12, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:81)");
            }
            n7 n7VarW = w6.w(function0, c0VarR, (i12 >> 3) & 14);
            Object objI0 = c0VarR.i0();
            c0.a aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new d(z10, n7VarW);
                c0VarR.Y(objI0);
            }
            d dVar = (d) objI0;
            boolean z11 = (i12 & 14) == 4;
            Object objI1 = c0VarR.i0();
            if (z11 || objI1 == aVar.a()) {
                objI1 = new a(dVar, z10);
                c0VarR.Y(objI1);
            }
            b2.m((Function0) objI1, c0VarR, 0);
            androidx.activity.m0 m0VarA = j.f9826a.a(c0VarR, 6);
            if (m0VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            j0 onBackPressedDispatcher = m0VarA.getOnBackPressedDispatcher();
            o0 o0Var = (o0) c0VarR.W(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zK0 = c0VarR.k0(onBackPressedDispatcher) | c0VarR.k0(o0Var);
            Object objI2 = c0VarR.i0();
            if (zK0 || objI2 == aVar.a()) {
                objI2 = new b(onBackPressedDispatcher, o0Var, dVar);
                c0VarR.Y(objI2);
            }
            b2.c(o0Var, onBackPressedDispatcher, (Function1) objI2, c0VarR, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new c(z10, function0, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> b(n7<? extends Function0<Unit>> n7Var) {
        return n7Var.getValue();
    }
}
