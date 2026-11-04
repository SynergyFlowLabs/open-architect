package androidx.compose.foundation.text.contextmenu.internal;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(28)
@SourceDebugExtension({"SMAP\nDefaultTextContextMenuDropdownProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultTextContextMenuDropdownProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/TextContextMenuHelperApi28\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,286:1\n1#2:287\n75#3:288\n1282#4,6:289\n1282#4,6:295\n233#5:301\n57#6:302\n61#6:305\n60#7:303\n70#7:306\n22#8:304\n*S KotlinDebug\n*F\n+ 1 DefaultTextContextMenuDropdownProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/TextContextMenuHelperApi28\n*L\n269#1:288\n270#1:289,6\n277#1:295,6\n278#1:301\n279#1:302\n279#1:305\n279#1:303\n279#1:306\n279#1:304\n*E\n"})
final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x0 f18959a = new x0();

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextClassification f18960a;

        a(TextClassification textClassification) {
            this.f18960a = textClassification;
        }

        @androidx.compose.runtime.o
        public final String c(androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(950061013);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(950061013, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:246)");
            }
            String strValueOf = String.valueOf(this.f18960a.getLabel());
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return strValueOf;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ String invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(c0Var, num.intValue());
        }
    }

    static final class b implements pj.n<androidx.compose.ui.graphics.q0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Drawable f18961a;

        b(Drawable drawable) {
            this.f18961a = drawable;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(long j10, androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1123224187, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:247)");
            }
            x0.f18959a.g(this.f18961a, c0Var, 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.q0 q0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(q0Var.M(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RemoteAction f18962a;

        c(RemoteAction remoteAction) {
            this.f18962a = remoteAction;
        }

        @androidx.compose.runtime.o
        public final String c(androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1376593684);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1376593684, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:254)");
            }
            String string = this.f18962a.getTitle().toString();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return string;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ String invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(c0Var, num.intValue());
        }
    }

    static final class d implements pj.n<androidx.compose.ui.graphics.q0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RemoteAction f18963a;

        d(RemoteAction remoteAction) {
            this.f18963a = remoteAction;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(long j10, androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1261173016, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:257)");
            }
            x0.f18959a.h(this.f18963a.getIcon(), c0Var, 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.q0 q0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(q0Var.M(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    private x0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void g(final Drawable drawable, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(257732500);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(drawable) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(257732500, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:274)");
            }
            androidx.compose.ui.a0 a0VarW = i6.w(androidx.compose.ui.a0.E, androidx.compose.foundation.contextmenu.q.f14065a.i());
            boolean zK0 = c0VarR.k0(drawable);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.v0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return x0.k(drawable, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.ui.draw.n.b(a0VarW, (Function1) objI0), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.w0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x0.l(this.f18953a, drawable, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void h(final Icon icon, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        s5 s5VarT;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2116504409);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(icon) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(this) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2116504409, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:267)");
            }
            Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            boolean zD = c0VarR.D(icon) | c0VarR.D(context);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = icon.loadDrawable(context);
                c0VarR.Y(objI0);
            }
            Drawable drawable = (Drawable) objI0;
            if (drawable == null) {
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                s5VarT = c0VarR.T();
                if (s5VarT == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.r0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return x0.i(this.f18926a, icon, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            } else {
                g(drawable, c0VarR, i11 & com.planner5d.library.engine.input.f.b.B);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }
            s5VarT.a(function2);
        }
        c0VarR.u();
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            function2 = new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.s0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x0.j(this.f18936a, icon, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            };
            s5VarT.a(function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(x0 x0Var, Icon icon, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        x0Var.h(icon, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(x0 x0Var, Icon icon, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        x0Var.h(icon, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Drawable drawable, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.k0 k0VarF = fVar.Z3().f();
        drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (fVar.d() >> 32)), (int) Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)));
        drawable.draw(androidx.compose.ui.graphics.c.d(k0VarF));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(x0 x0Var, Drawable drawable, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        x0Var.g(drawable, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        q0.f18920a.a(context, textClassification);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        q0.f18920a.b(remoteAction.getActionIntent());
        return Unit.f312394a;
    }

    public final void o(@NotNull androidx.compose.foundation.contextmenu.p pVar, @Nullable final Context context, @NotNull b0.h hVar) {
        if (context == null) {
            return;
        }
        int iB = hVar.b();
        final TextClassification textClassificationC = hVar.c();
        if (iB < 0) {
            a aVar = new a(textClassificationC);
            Drawable icon = textClassificationC.getIcon();
            androidx.compose.foundation.contextmenu.p.f(pVar, aVar, null, false, icon != null ? androidx.compose.runtime.internal.w.c(-1123224187, true, new b(icon)) : null, new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.t0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x0.p(context, textClassificationC);
                }
            }, 6, null);
        } else {
            final RemoteAction remoteAction = textClassificationC.getActions().get(iB);
            androidx.compose.foundation.contextmenu.p.f(pVar, new c(remoteAction), null, false, ((iB == 0) || remoteAction.shouldShowIcon()) ? androidx.compose.runtime.internal.w.c(-1261173016, true, new d(remoteAction)) : null, new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x0.q(remoteAction);
                }
            }, 6, null);
        }
    }
}
