package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.animation.core.t2;
import androidx.compose.animation.core.u2;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTypingIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypingIndicator.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/TypingIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,167:1\n113#2:168\n113#2:169\n113#2:207\n113#2:208\n113#2:215\n113#2:216\n113#2:251\n99#3,6:170\n106#3:206\n99#3,6:217\n106#3:262\n80#4,6:176\n87#4,3:191\n90#4,2:200\n94#4:205\n80#4,6:223\n87#4,3:238\n90#4,2:247\n94#4:261\n391#5,9:182\n400#5,3:202\n391#5,9:229\n400#5:249\n401#5,2:259\n4360#6,6:194\n4360#6,6:241\n1282#7,6:209\n1282#7,6:252\n1863#8:250\n1864#8:258\n85#9:263\n*S KotlinDebug\n*F\n+ 1 TypingIndicator.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/TypingIndicatorKt\n*L\n45#1:168\n50#1:169\n65#1:207\n66#1:208\n80#1:215\n82#1:216\n88#1:251\n47#1:170,6\n47#1:206\n69#1:217,6\n69#1:262\n47#1:176,6\n47#1:191,3\n47#1:200,2\n47#1:205\n69#1:223,6\n69#1:238,3\n69#1:247,2\n69#1:261\n47#1:182,9\n47#1:202,3\n69#1:229,9\n69#1:249\n69#1:259,2\n47#1:194,6\n69#1:241,6\n75#1:209,6\n88#1:252,6\n85#1:250\n85#1:258\n86#1:263\n*E\n"})
public final class TypingIndicatorKt {
    private static final int AnimateDuration = 600;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void TeammateTypingIndicator(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(349650241);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.foundation.shape.n nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(20));
            float fR = androidx.compose.ui.unit.h.r(1);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            final TypingIndicatorStyle typingIndicatorStyle = new TypingIndicatorStyle(nVarH, androidx.compose.foundation.b1.a(fR, intercomTheme.getColors(c0VarR, i11).m688getAdminBorder0d7_KjU()), intercomTheme.getColors(c0VarR, i11).m687getAdminBackground0d7_KjU(), null);
            androidx.compose.ui.a0 a0VarC = androidx.compose.foundation.v.c(androidx.compose.ui.a0.E, typingIndicatorStyle.m325getColor0d7_KjU(), typingIndicatorStyle.getShape());
            boolean z10 = typingIndicatorStyle.getBorderStroke() != null;
            c0VarR.E(-676457367);
            boolean zD = c0VarR.D(typingIndicatorStyle);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.e2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TypingIndicatorKt.TeammateTypingIndicator$lambda$4$lambda$3(typingIndicatorStyle, (androidx.compose.ui.a0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarS = d5.s(ModifierExtensionsKt.ifTrue(a0VarC, z10, (Function1) objI0), androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(18));
            androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(4)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarS);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            y5 y5Var = y5.f16577a;
            List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{0, 200, 400});
            c0VarR.E(-2125336505);
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                final n7<Float> n7VarAnimateDotAlpha = animateDotAlpha(((Number) it.next()).intValue(), c0VarR, 0);
                final long jM725isTyping0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m725isTyping0d7_KjU();
                androidx.compose.ui.a0 a0VarW = i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8));
                c0VarR.E(-1598002378);
                boolean zL = c0VarR.L(jM725isTyping0d7_KjU) | c0VarR.D(n7VarAnimateDotAlpha);
                Object objI1 = c0VarR.i0();
                if (zL || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.f2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TypingIndicatorKt.TeammateTypingIndicator$lambda$9$lambda$8$lambda$7$lambda$6(jM725isTyping0d7_KjU, n7VarAnimateDotAlpha, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                androidx.compose.foundation.f1.e(a0VarW, (Function1) objI1, c0VarR, 6);
            }
            c0VarR.A();
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.g2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TypingIndicatorKt.TeammateTypingIndicator$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeammateTypingIndicator$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TeammateTypingIndicator(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0 TeammateTypingIndicator$lambda$4$lambda$3(TypingIndicatorStyle style, androidx.compose.ui.a0 ifTrue) {
        androidx.compose.ui.a0 a0VarG;
        Intrinsics.checkNotNullParameter(style, "$style");
        Intrinsics.checkNotNullParameter(ifTrue, "$this$ifTrue");
        androidx.compose.foundation.a1 borderStroke = style.getBorderStroke();
        return (borderStroke == null || (a0VarG = androidx.compose.foundation.t0.g(ifTrue, borderStroke, style.getShape())) == null) ? ifTrue : a0VarG;
    }

    private static final float TeammateTypingIndicator$lambda$9$lambda$8$lambda$5(n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeammateTypingIndicator$lambda$9$lambda$8$lambda$7$lambda$6(long j10, n7 alpha$delegate, androidx.compose.ui.graphics.drawscope.f Canvas) {
        Intrinsics.checkNotNullParameter(alpha$delegate, "$alpha$delegate");
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        androidx.compose.ui.graphics.drawscope.f.B4(Canvas, androidx.compose.ui.graphics.q0.w(j10, TeammateTypingIndicator$lambda$9$lambda$8$lambda$5(alpha$delegate), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0L, 0.0f, null, null, 0, okhttp3.internal.ws.g.f334652s, null);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: TypingIndicator-6a0pyJM, reason: not valid java name */
    public static final void m321TypingIndicator6a0pyJM(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final CurrentlyTypingState typingIndicatorData, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(typingIndicatorData, "typingIndicatorData");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1574154580);
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        float fR = (i11 & 4) != 0 ? androidx.compose.ui.unit.h.r(36) : f10;
        androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(8)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarE, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        y5 y5Var = y5.f16577a;
        c0VarR.E(-1949038310);
        if (typingIndicatorData.getShowAvatar()) {
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(androidx.compose.ui.a0.E, fR), typingIndicatorData.getAvatarWrapper(), null, false, 0L, null, c0VarR, 64, 60);
        }
        c0VarR.A();
        TeammateTypingIndicator(c0VarR, 0);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final float f11 = fR;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.c2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TypingIndicatorKt.TypingIndicator_6a0pyJM$lambda$1(a0Var2, typingIndicatorData, f11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TypingIndicatorPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-955207145);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m309getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.b2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TypingIndicatorKt.TypingIndicatorPreview$lambda$11(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TypingIndicatorPreview$lambda$11(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TypingIndicatorPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TypingIndicatorWithoutAvatarPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-544244118);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m311getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.d2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TypingIndicatorKt.TypingIndicatorWithoutAvatarPreview$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TypingIndicatorWithoutAvatarPreview$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TypingIndicatorWithoutAvatarPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TypingIndicator_6a0pyJM$lambda$1(androidx.compose.ui.a0 a0Var, CurrentlyTypingState typingIndicatorData, float f10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(typingIndicatorData, "$typingIndicatorData");
        m321TypingIndicator6a0pyJM(a0Var, typingIndicatorData, f10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private static final n7<Float> animateDotAlpha(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        c0Var.E(-1913274997);
        n7<Float> n7VarD = androidx.compose.animation.core.n1.d(androidx.compose.animation.core.n1.j("IsTypingInfiniteTransition", c0Var, 6, 0), 1.0f, 0.1f, androidx.compose.animation.core.p.f(androidx.compose.animation.core.p.t(600, 0, null, 6, null), androidx.compose.animation.core.f2.Reverse, t2.b(i10, u2.f13317b.a())), "IsTypingAnimation", c0Var, androidx.compose.animation.core.i1.f13005f | 25008 | (androidx.compose.animation.core.g1.f12967d << 9), 0);
        c0Var.A();
        return n7VarD;
    }
}
