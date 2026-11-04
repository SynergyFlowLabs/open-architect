package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,393:1\n110#2:394\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n64#1:394\n*E\n"})
public final class l6 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20468a;

        static {
            int[] iArr = new int[androidx.compose.foundation.gestures.q3.values().length];
            try {
                iArr[androidx.compose.foundation.gestures.q3.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.gestures.q3.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20468a = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n1#1,110:1\n65#2,5:111\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s6 f20469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f20470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f20471c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s6 s6Var, androidx.compose.foundation.interaction.j jVar, boolean z10) {
            super(1);
            this.f20469a = s6Var;
            this.f20470b = jVar;
            this.f20471c = z10;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("textFieldScrollable");
            t2Var.b().c("scrollerPosition", this.f20469a);
            t2Var.b().c("interactionSource", this.f20470b);
            t2Var.b().c("enabled", Boolean.valueOf(this.f20471c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,393:1\n75#2:394\n1282#3,6:395\n1282#3,6:401\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n*L\n72#1:394\n74#1:395,6\n89#1:401,6\n*E\n"})
    static final class c implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s6 f20472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f20473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f20474c;

        @SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,393:1\n85#2:394\n85#2:395\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n*L\n91#1:394\n94#1:395\n*E\n"})
        public static final class a implements androidx.compose.foundation.gestures.v4 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ androidx.compose.foundation.gestures.v4 f20475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final androidx.compose.runtime.n7 f20476b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final androidx.compose.runtime.n7 f20477c;

            a(androidx.compose.foundation.gestures.v4 v4Var, final s6 s6Var) {
                this.f20475a = v4Var;
                this.f20476b = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.foundation.text.n6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(l6.c.a.p(s6Var));
                    }
                });
                this.f20477c = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.foundation.text.o6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(l6.c.a.o(s6Var));
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean o(s6 s6Var) {
                return s6Var.h() > 0.0f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean p(s6 s6Var) {
                return s6Var.h() < s6Var.g();
            }

            @Override // androidx.compose.foundation.gestures.v4
            public boolean a() {
                return this.f20475a.a();
            }

            @Override // androidx.compose.foundation.gestures.v4
            public float b(float f10) {
                return this.f20475a.b(f10);
            }

            @Override // androidx.compose.foundation.gestures.v4
            public Object c(androidx.compose.foundation.q3 q3Var, Function2<? super androidx.compose.foundation.gestures.z3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
                return this.f20475a.c(q3Var, function2, dVar);
            }

            @Override // androidx.compose.foundation.gestures.v4
            public boolean f() {
                return ((Boolean) this.f20476b.getValue()).booleanValue();
            }

            @Override // androidx.compose.foundation.gestures.v4
            public boolean g() {
                return this.f20475a.g();
            }

            @Override // androidx.compose.foundation.gestures.v4
            public boolean j() {
                return this.f20475a.j();
            }

            @Override // androidx.compose.foundation.gestures.v4
            public boolean k() {
                return ((Boolean) this.f20477c.getValue()).booleanValue();
            }
        }

        c(s6 s6Var, boolean z10, androidx.compose.foundation.interaction.j jVar) {
            this.f20472a = s6Var;
            this.f20473b = z10;
            this.f20474c = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float f(s6 s6Var, float f10) {
            float fH = s6Var.h() + f10;
            if (fH > s6Var.g()) {
                f10 = s6Var.g() - s6Var.h();
            } else if (fH < 0.0f) {
                f10 = -s6Var.h();
            }
            s6Var.n(s6Var.h() + f10);
            return f10;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(805428266);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(805428266, i10, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:71)");
            }
            boolean z10 = this.f20472a.j() == androidx.compose.foundation.gestures.q3.Vertical || !(c0Var.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl);
            boolean zD = c0Var.D(this.f20472a);
            final s6 s6Var = this.f20472a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.m6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Float.valueOf(l6.c.f(s6Var, ((Float) obj).floatValue()));
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.foundation.gestures.v4 v4VarC = androidx.compose.foundation.gestures.x4.c((Function1) objI0, c0Var, 0);
            boolean zD2 = c0Var.D(v4VarC) | c0Var.D(this.f20472a);
            s6 s6Var2 = this.f20472a;
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new a(v4VarC, s6Var2);
                c0Var.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarM = androidx.compose.foundation.gestures.n4.m(androidx.compose.ui.a0.E, (a) objI1, this.f20472a.j(), this.f20473b && this.f20472a.g() != 0.0f, z10, null, this.f20474c, 16, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarM;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return d(a0Var, c0Var, num.intValue());
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull s6 s6Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.j1 j1Var, @NotNull Function0<y6> function0) {
        androidx.compose.ui.a0 d8Var;
        androidx.compose.foundation.gestures.q3 q3VarJ = s6Var.j();
        int i10 = s6Var.i(y0Var.l());
        s6Var.p(y0Var.l());
        androidx.compose.ui.text.input.h1 h1VarC = b8.c(j1Var, y0Var.j());
        int i11 = a.f20468a[q3VarJ.ordinal()];
        if (i11 != 1) {
            int i12 = 0 | 2;
            if (i11 != 2) {
                throw new kotlin.k0();
            }
            d8Var = new o3(s6Var, i10, h1VarC, function0);
        } else {
            d8Var = new d8(s6Var, i10, h1VarC, function0);
        }
        return androidx.compose.ui.draw.j.b(a0Var).B2(d8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j c(androidx.compose.ui.unit.d dVar, int i10, androidx.compose.ui.text.input.h1 h1Var, androidx.compose.ui.text.p3 p3Var, boolean z10, int i11) {
        n0.j jVarA;
        if (p3Var == null || (jVarA = p3Var.e(h1Var.a().b(i10))) == null) {
            jVarA = n0.j.f332705e.a();
        }
        n0.j jVar = jVarA;
        int iG6 = dVar.g6(n5.a());
        return n0.j.h(jVar, z10 ? (i11 - jVar.t()) - iG6 : jVar.t(), 0.0f, z10 ? i11 - jVar.t() : iG6 + jVar.t(), 0.0f, 10, null);
    }

    @NotNull
    public static final androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull s6 s6Var, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z10) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new b(s6Var, jVar, z10) : androidx.compose.ui.platform.r2.b(), new c(s6Var, z10, jVar));
    }

    public static /* synthetic */ androidx.compose.ui.a0 e(androidx.compose.ui.a0 a0Var, s6 s6Var, androidx.compose.foundation.interaction.j jVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return d(a0Var, s6Var, jVar, z10);
    }
}
