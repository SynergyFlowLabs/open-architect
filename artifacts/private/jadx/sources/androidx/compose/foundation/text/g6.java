package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class g6 {

    @SourceDebugExtension({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,274:1\n1282#2,6:275\n1282#2,6:281\n1282#2,6:287\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n*L\n256#1:275,6\n257#1:281,6\n272#1:287,6\n*E\n"})
    static final class a implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g4 f19303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.u3 f19304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.y0 f19305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f19306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f19307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.m0 f19308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ x7 f19309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.text.input.y0, Unit> f19310h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f19311i;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.g6$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0130a extends kotlin.jvm.internal.g0 implements Function1<androidx.compose.ui.input.key.c, Boolean> {
            C0130a(Object obj) {
                super(1, obj, e6.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public final Boolean X(KeyEvent keyEvent) {
                return Boolean.valueOf(((e6) this.receiver).w(keyEvent));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
                return X(cVar.h());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(g4 g4Var, androidx.compose.foundation.text.selection.u3 u3Var, androidx.compose.ui.text.input.y0 y0Var, boolean z10, boolean z11, androidx.compose.ui.text.input.m0 m0Var, x7 x7Var, Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, int i10) {
            this.f19303a = g4Var;
            this.f19304b = u3Var;
            this.f19305c = y0Var;
            this.f19306d = z10;
            this.f19307e = z11;
            this.f19308f = m0Var;
            this.f19309g = x7Var;
            this.f19310h = function1;
            this.f19311i = i10;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(851809892);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(851809892, i10, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:255)");
            }
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new androidx.compose.foundation.text.selection.v4();
                c0Var.Y(objI0);
            }
            androidx.compose.foundation.text.selection.v4 v4Var = (androidx.compose.foundation.text.selection.v4) objI0;
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = new h3();
                c0Var.Y(objI1);
            }
            e6 e6Var = new e6(this.f19303a, this.f19304b, this.f19305c, this.f19306d, this.f19307e, v4Var, this.f19308f, this.f19309g, (h3) objI1, null, this.f19310h, this.f19311i, 512, null);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            boolean zK0 = c0Var.k0(e6Var);
            Object objI2 = c0Var.i0();
            if (zK0 || objI2 == aVar.a()) {
                objI2 = new C0130a(e6Var);
                c0Var.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.input.key.f.a(aVar2, (Function1) ((kotlin.reflect.i) objI2));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarA;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull g4 g4Var, @NotNull androidx.compose.foundation.text.selection.u3 u3Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, boolean z10, boolean z11, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull x7 x7Var, int i10) {
        return androidx.compose.ui.m.k(a0Var, null, new a(g4Var, u3Var, y0Var, z10, z11, m0Var, x7Var, function1, i10), 1, null);
    }

    public static /* synthetic */ androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, g4 g4Var, androidx.compose.foundation.text.selection.u3 u3Var, androidx.compose.ui.text.input.y0 y0Var, Function1 function1, boolean z10, boolean z11, androidx.compose.ui.text.input.m0 m0Var, x7 x7Var, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.foundation.text.f6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return g6.d((androidx.compose.ui.text.input.y0) obj2);
                }
            };
        }
        return b(a0Var, g4Var, u3Var, y0Var, function1, z10, z11, m0Var, x7Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(androidx.compose.ui.text.input.y0 y0Var) {
        return Unit.f312394a;
    }
}
