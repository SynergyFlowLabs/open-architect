package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nMergedConversationRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MergedConversationRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/MergedConversationRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n113#2:61\n113#2:99\n87#3:62\n84#3,9:63\n94#3:109\n80#4,6:72\n87#4,3:87\n90#4,2:96\n94#4:108\n391#5,9:78\n400#5:98\n401#5,2:106\n4360#6,6:90\n1282#7,6:100\n*S KotlinDebug\n*F\n+ 1 MergedConversationRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/MergedConversationRowKt\n*L\n28#1:61\n37#1:99\n27#1:62\n27#1:63,9\n27#1:109\n27#1:72,6\n27#1:87,3\n27#1:96,2\n27#1:108\n27#1:78,9\n27#1:98\n27#1:106,2\n27#1:90,6\n39#1:100,6\n*E\n"})
public final class MergedConversationRowKt {
    /* JADX WARN: Code duplicated, block: B:50:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0202  */
    /* JADX WARN: Code duplicated, block: B:85:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MergedConversationRow(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String description, @NotNull final String conversationId, @Nullable Function1<? super String, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        Function1<? super String, Unit> function2;
        androidx.compose.ui.a0 a0Var3;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        Function1<? super String, Unit> function3;
        int i13;
        boolean z10;
        boolean z11;
        Object objI0;
        final Function1<? super String, Unit> function4;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var4;
        final Function1<? super String, Unit> function5;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-635122177);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(description) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(conversationId) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 7168) == 0) {
                function2 = function1;
                i12 |= c0VarR.k0(function2) ? 2048 : 1024;
            }
            if ((i12 & 5851) == 1170 || !c0VarR.d()) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    function2 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.y0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MergedConversationRowKt.MergedConversationRow$lambda$0((String) obj);
                        }
                    };
                }
                androidx.compose.ui.a0 a0VarT = d5.t(a0Var3, androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
                androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                function0A = aVar.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarB, aVar.e());
                y7.n(c0VarD, b1VarK, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i16 = IntercomTheme.$stable;
                y3 type04Point5 = intercomTheme.getTypography(c0VarR, i16).getType04Point5();
                androidx.compose.ui.text.style.j.a aVar2 = androidx.compose.ui.text.style.j.f42206b;
                androidx.compose.ui.a0 a0Var5 = a0Var3;
                function3 = function2;
                i13 = i12;
                q50.t(description, null, intercomTheme.getColors(c0VarR, i16).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar2.a()), 0L, 0, false, 0, 0, null, type04Point5, c0VarR, (i12 >> 3) & 14, 0, 130042);
                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
                c0VarR.E(-1680452062);
                if ((i13 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z10 | ((i13 & 896) == 256);
                objI0 = c0VarR.i0();
                if (!z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    function4 = function3;
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.z0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MergedConversationRowKt.MergedConversationRow$lambda$3$lambda$2$lambda$1(function4, conversationId);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    function4 = function3;
                }
                c0VarR.A();
                q50.t(u0.i.d(R.string.intercom_view_conversation, c0VarR, 0), androidx.compose.foundation.i1.j(aVar3, false, null, null, null, (Function0) objI0, 15, null), intercomTheme.getColors(c0VarR, i16).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar2.a()), 0L, 0, false, 0, 0, null, y3.m(intercomTheme.getTypography(c0VarR, i16).getType04Point5(), 0L, 0L, androidx.compose.ui.text.font.v0.f41742b.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), c0VarR, 0, 0, 130040);
                c0Var2 = c0VarR;
                c0Var2.o();
                a0Var4 = a0Var5;
                function5 = function4;
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
                a0Var4 = a0Var2;
                function5 = function2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MergedConversationRowKt.MergedConversationRow$lambda$4(a0Var4, description, conversationId, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function2 = function1;
        if ((i12 & 5851) == 1170) {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i15 != 0) {
                function2 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MergedConversationRowKt.MergedConversationRow$lambda$0((String) obj);
                    }
                };
            }
            androidx.compose.ui.a0 a0VarT2 = d5.t(a0Var3, androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
            androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarT2);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
            function0A = aVar4.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarB2, aVar4.e());
            y7.n(c0VarD, b1VarK2, aVar4.g());
            function2B = aVar4.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN2, aVar4.f());
            androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            y3 type04Point6 = intercomTheme2.getTypography(c0VarR, i17).getType04Point5();
            androidx.compose.ui.text.style.j.a aVar5 = androidx.compose.ui.text.style.j.f42206b;
            androidx.compose.ui.a0 a0Var6 = a0Var3;
            function3 = function2;
            i13 = i12;
            q50.t(description, null, intercomTheme2.getColors(c0VarR, i17).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar5.a()), 0L, 0, false, 0, 0, null, type04Point6, c0VarR, (i12 >> 3) & 14, 0, 130042);
            androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
            l6.a(i6.i(aVar6, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
            c0VarR.E(-1680452062);
            if ((i13 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z10 | ((i13 & 896) == 256);
            objI0 = c0VarR.i0();
            if (z11) {
                function4 = function3;
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.z0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MergedConversationRowKt.MergedConversationRow$lambda$3$lambda$2$lambda$1(function4, conversationId);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                function4 = function3;
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.z0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MergedConversationRowKt.MergedConversationRow$lambda$3$lambda$2$lambda$1(function4, conversationId);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            q50.t(u0.i.d(R.string.intercom_view_conversation, c0VarR, 0), androidx.compose.foundation.i1.j(aVar6, false, null, null, null, (Function0) objI0, 15, null), intercomTheme2.getColors(c0VarR, i17).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar5.a()), 0L, 0, false, 0, 0, null, y3.m(intercomTheme2.getTypography(c0VarR, i17).getType04Point5(), 0L, 0L, androidx.compose.ui.text.font.v0.f41742b.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), c0VarR, 0, 0, 130040);
            c0Var2 = c0VarR;
            c0Var2.o();
            a0Var4 = a0Var6;
            function5 = function4;
        } else {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i15 != 0) {
                function2 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MergedConversationRowKt.MergedConversationRow$lambda$0((String) obj);
                    }
                };
            }
            androidx.compose.ui.a0 a0VarT3 = d5.t(a0Var3, androidx.compose.ui.unit.h.r(16), 0.0f, 2, null);
            androidx.compose.ui.layout.a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarT3);
            androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
            function0A = aVar7.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarB3, aVar7.e());
            y7.n(c0VarD, b1VarK3, aVar7.g());
            function2B = aVar7.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar7.f());
            androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i18 = IntercomTheme.$stable;
            y3 type04Point7 = intercomTheme3.getTypography(c0VarR, i18).getType04Point5();
            androidx.compose.ui.text.style.j.a aVar8 = androidx.compose.ui.text.style.j.f42206b;
            androidx.compose.ui.a0 a0Var7 = a0Var3;
            function3 = function2;
            i13 = i12;
            q50.t(description, null, intercomTheme3.getColors(c0VarR, i18).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar8.a()), 0L, 0, false, 0, 0, null, type04Point7, c0VarR, (i12 >> 3) & 14, 0, 130042);
            androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
            l6.a(i6.i(aVar9, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
            c0VarR.E(-1680452062);
            if ((i13 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z10 | ((i13 & 896) == 256);
            objI0 = c0VarR.i0();
            if (z11) {
                function4 = function3;
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.z0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MergedConversationRowKt.MergedConversationRow$lambda$3$lambda$2$lambda$1(function4, conversationId);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                function4 = function3;
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.z0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MergedConversationRowKt.MergedConversationRow$lambda$3$lambda$2$lambda$1(function4, conversationId);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            q50.t(u0.i.d(R.string.intercom_view_conversation, c0VarR, 0), androidx.compose.foundation.i1.j(aVar9, false, null, null, null, (Function0) objI0, 15, null), intercomTheme3.getColors(c0VarR, i18).m685getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar8.a()), 0L, 0, false, 0, 0, null, y3.m(intercomTheme3.getTypography(c0VarR, i18).getType04Point5(), 0L, 0L, androidx.compose.ui.text.font.v0.f41742b.c(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), c0VarR, 0, 0, 130040);
            c0Var2 = c0VarR;
            c0Var2.o();
            a0Var4 = a0Var7;
            function5 = function4;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MergedConversationRowKt.MergedConversationRow$lambda$4(a0Var4, description, conversationId, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MergedConversationRow$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MergedConversationRow$lambda$3$lambda$2$lambda$1(Function1 function1, String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "$conversationId");
        function1.invoke(conversationId);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MergedConversationRow$lambda$4(androidx.compose.ui.a0 a0Var, String description, String conversationId, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(description, "$description");
        Intrinsics.checkNotNullParameter(conversationId, "$conversationId");
        MergedConversationRow(a0Var, description, conversationId, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void MergedConversationRowPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-243500111);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MergedConversationRowKt.INSTANCE.m294getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.b1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MergedConversationRowKt.MergedConversationRowPreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MergedConversationRowPreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        MergedConversationRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
