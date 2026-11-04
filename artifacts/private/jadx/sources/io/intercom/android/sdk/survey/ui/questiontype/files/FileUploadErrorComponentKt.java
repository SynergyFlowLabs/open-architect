package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.annotation.f1;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFileUploadErrorComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUploadErrorComponent.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/FileUploadErrorComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,163:1\n87#2:164\n84#2,9:165\n94#2:208\n80#3,6:174\n87#3,3:189\n90#3,2:198\n94#3:207\n80#3,6:223\n87#3,3:238\n90#3,2:247\n94#3:252\n391#4,9:180\n400#4:200\n401#4,2:205\n391#4,9:229\n400#4,3:249\n4360#5,6:192\n4360#5,6:241\n113#6:201\n113#6:202\n113#6:203\n113#6:204\n113#6:215\n113#6:216\n1282#7,6:209\n99#8,6:217\n106#8:253\n*S KotlinDebug\n*F\n+ 1 FileUploadErrorComponent.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/FileUploadErrorComponentKt\n*L\n40#1:164\n40#1:165,9\n40#1:208\n40#1:174,6\n40#1:189,3\n40#1:198,2\n40#1:207\n111#1:223,6\n111#1:238,3\n111#1:247,2\n111#1:252\n40#1:180,9\n40#1:200\n40#1:205,2\n111#1:229,9\n111#1:249,3\n40#1:192,6\n111#1:241,6\n48#1:201\n55#1:202\n61#1:203\n88#1:204\n117#1:215\n119#1:216\n114#1:209,6\n111#1:217,6\n111#1:253\n*E\n"})
public final class FileUploadErrorComponentKt {
    /* JADX WARN: Code duplicated, block: B:100:0x013c  */
    /* JADX WARN: Code duplicated, block: B:103:0x019a  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:116:0x025e  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x012c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0134  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: ActionRow-FHprtrg, reason: not valid java name */
    public static final void m507ActionRowFHprtrg(@Nullable androidx.compose.ui.a0 a0Var, @androidx.annotation.v final int i10, @f1 final int i11, @f1 int i12, long j10, @NotNull final Function0<Unit> onClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i13, final int i14) {
        final androidx.compose.ui.a0 a0Var2;
        int i15;
        int i16;
        long jM714getPrimaryText0d7_KjU;
        int i17;
        androidx.compose.ui.a0 a0Var3;
        boolean z10;
        Object objI0;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        final int i18;
        final long j11;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1845655864);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            a0Var2 = a0Var;
        } else if ((i13 & 14) == 0) {
            a0Var2 = a0Var;
            i15 = (c0VarR.D(a0Var2) ? 4 : 2) | i13;
        } else {
            a0Var2 = a0Var;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i15 |= c0VarR.K(i10) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= a5.S0;
        } else if ((i13 & 896) == 0) {
            i15 |= c0VarR.K(i11) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            if ((i14 & 8) == 0) {
                i16 = i12;
                int i20 = c0VarR.K(i16) ? 2048 : 1024;
                i15 |= i20;
            } else {
                i16 = i12;
            }
            i15 |= i20;
        } else {
            i16 = i12;
        }
        if ((57344 & i13) == 0) {
            if ((i14 & 16) == 0) {
                jM714getPrimaryText0d7_KjU = j10;
                int i21 = c0VarR.L(jM714getPrimaryText0d7_KjU) ? 16384 : 8192;
                i15 |= i21;
            } else {
                jM714getPrimaryText0d7_KjU = j10;
            }
            i15 |= i21;
        } else {
            jM714getPrimaryText0d7_KjU = j10;
        }
        if ((i14 & 32) == 0) {
            if ((i13 & 458752) == 0) {
                i17 = c0VarR.k0(onClick) ? 131072 : 65536;
            }
            if ((374491 & i15) == 74898 || !c0VarR.d()) {
                c0VarR.l0();
                if ((i13 & 1) != 0 || c0VarR.y()) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        i16 = i11;
                    }
                    if ((i14 & 16) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        i15 &= -57345;
                    }
                } else {
                    c0VarR.u();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    if ((i14 & 16) != 0) {
                        i15 &= -57345;
                    }
                    a0Var3 = a0Var2;
                }
                c0VarR.Z();
                androidx.compose.ui.a0 a0VarH = i6.h(a0Var3, 0.0f, 1, null);
                c0VarR.E(1130566626);
                z10 = (i15 & 458752) == 131072;
                objI0 = c0VarR.i0();
                if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$3$lambda$2(onClick);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                float f10 = 16;
                androidx.compose.ui.a0 a0VarS = d5.s(i1.j(a0VarH, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10));
                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarS);
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
                androidx.compose.ui.a0 a0Var4 = a0Var3;
                y7.n(c0VarD, a1VarE, aVar.e());
                y7.n(c0VarD, b1VarK, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar.f());
                y5 y5Var = y5.f16577a;
                int i22 = i15 >> 3;
                long j12 = jM714getPrimaryText0d7_KjU;
                ni.o(u0.e.c(i10, c0VarR, i22 & 14), u0.i.d(i16, c0VarR, (i15 >> 9) & 14), null, j12, c0VarR, (i22 & 7168) | 8, 4);
                int i23 = i15 >> 6;
                q50.t(u0.i.d(i11, c0VarR, i23 & 14), null, j12, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04(), c0VarR, i23 & 896, 0, 131066);
                c0VarR = c0VarR;
                c0VarR.o();
                a0Var2 = a0Var4;
                i18 = i16;
                j11 = j12;
            } else {
                c0VarR.u();
                i18 = i16;
                j11 = jM714getPrimaryText0d7_KjU;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$5(a0Var2, i10, i11, i18, j11, onClick, i13, i14, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 = androidx.profileinstaller.n.c.f73814m;
        i15 |= i17;
        if ((374491 & i15) == 74898) {
            c0VarR.l0();
            if ((i13 & 1) != 0) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    i16 = i11;
                }
                if ((i14 & 16) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    i15 &= -57345;
                }
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    i16 = i11;
                }
                if ((i14 & 16) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    i15 &= -57345;
                }
            }
            c0VarR.Z();
            androidx.compose.ui.a0 a0VarH2 = i6.h(a0Var3, 0.0f, 1, null);
            c0VarR.E(1130566626);
            if ((i15 & 458752) == 131072) {
            }
            objI0 = c0VarR.i0();
            if (z10) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$3$lambda$2(onClick);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$3$lambda$2(onClick);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            float f11 = 16;
            androidx.compose.ui.a0 a0VarS2 = d5.s(i1.j(a0VarH2, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(f11));
            a1 a1VarE2 = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f11)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarS2);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            function0A = aVar2.a();
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
            androidx.compose.ui.a0 a0Var5 = a0Var3;
            y7.n(c0VarD, a1VarE2, aVar2.e());
            y7.n(c0VarD, b1VarK2, aVar2.g());
            function2B = aVar2.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN2, aVar2.f());
            y5 y5Var2 = y5.f16577a;
            int i24 = i15 >> 3;
            long j13 = jM714getPrimaryText0d7_KjU;
            ni.o(u0.e.c(i10, c0VarR, i24 & 14), u0.i.d(i16, c0VarR, (i15 >> 9) & 14), null, j13, c0VarR, (i24 & 7168) | 8, 4);
            int i25 = i15 >> 6;
            q50.t(u0.i.d(i11, c0VarR, i25 & 14), null, j13, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04(), c0VarR, i25 & 896, 0, 131066);
            c0VarR = c0VarR;
            c0VarR.o();
            a0Var2 = a0Var5;
            i18 = i16;
            j11 = j13;
        } else {
            c0VarR.l0();
            if ((i13 & 1) != 0) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    i16 = i11;
                }
                if ((i14 & 16) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    i15 &= -57345;
                }
            } else {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    i16 = i11;
                }
                if ((i14 & 16) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    i15 &= -57345;
                }
            }
            c0VarR.Z();
            androidx.compose.ui.a0 a0VarH3 = i6.h(a0Var3, 0.0f, 1, null);
            c0VarR.E(1130566626);
            if ((i15 & 458752) == 131072) {
            }
            objI0 = c0VarR.i0();
            if (z10) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$3$lambda$2(onClick);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$3$lambda$2(onClick);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            float f12 = 16;
            androidx.compose.ui.a0 a0VarS3 = d5.s(i1.j(a0VarH3, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(f12), androidx.compose.ui.unit.h.r(f12));
            a1 a1VarE3 = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f12)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarS3);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            function0A = aVar3.a();
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
            androidx.compose.ui.a0 a0Var6 = a0Var3;
            y7.n(c0VarD, a1VarE3, aVar3.e());
            y7.n(c0VarD, b1VarK3, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar3.f());
            y5 y5Var3 = y5.f16577a;
            int i26 = i15 >> 3;
            long j14 = jM714getPrimaryText0d7_KjU;
            ni.o(u0.e.c(i10, c0VarR, i26 & 14), u0.i.d(i16, c0VarR, (i15 >> 9) & 14), null, j14, c0VarR, (i26 & 7168) | 8, 4);
            int i27 = i15 >> 6;
            q50.t(u0.i.d(i11, c0VarR, i27 & 14), null, j14, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04(), c0VarR, i27 & 896, 0, 131066);
            c0VarR = c0VarR;
            c0VarR.o();
            a0Var2 = a0Var6;
            i18 = i16;
            j11 = j14;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$5(a0Var2, i10, i11, i18, j11, onClick, i13, i14, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionRow_FHprtrg$lambda$3$lambda$2(Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionRow_FHprtrg$lambda$5(androidx.compose.ui.a0 a0Var, int i10, int i11, int i12, long j10, Function0 onClick, int i13, int i14, androidx.compose.runtime.c0 c0Var, int i15) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        m507ActionRowFHprtrg(a0Var, i10, i11, i12, j10, onClick, c0Var, t4.a(i13 | 1), i14);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ErrorActionSheetContentPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2121321299);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadErrorComponentKt.INSTANCE.m500getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileUploadErrorComponentKt.ErrorActionSheetContentPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorActionSheetContentPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ErrorActionSheetContentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void FileUploadErrorComponent(@NotNull final String title, @NotNull final Answer.MediaAnswer.FileUploadError error, @NotNull final Function0<Unit> onRetryClick, @NotNull final Function0<Unit> onDeleteClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(725182893);
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarH = i6.h(aVar, 0.0f, 1, null);
        a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
        y7.n(c0VarD, a1VarB, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        n0 n0Var = n0.f16227a;
        float f10 = 16;
        q50.t(title, d5.v(i6.h(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10), 0.0f, 8, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04(), c0VarR, i10 & 14, 0, 131068);
        ErrorMessageLayoutKt.ErrorMessageLayout(d5.s(i6.h(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(8)), error.getErrorMessages(), c0VarR, 70, 0);
        float f11 = 4;
        IntercomDividerKt.IntercomDivider(d5.t(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(f11), 1, null), c0VarR, 6, 0);
        if ((error instanceof Answer.MediaAnswer.FileUploadError.FileLimitExceeded) || (error instanceof Answer.MediaAnswer.FileUploadError.UnsupportedFileType) || (error instanceof Answer.MediaAnswer.FileUploadError.FileTooLarge)) {
            c0VarR.E(157589913);
            m507ActionRowFHprtrg(null, R.drawable.intercom_ic_delete, io.intercom.android.sdk.R.string.intercom_delete_attachment, 0, 0L, onDeleteClick, c0VarR, (i10 << 6) & 458752, 25);
            c0VarR.A();
        } else {
            if (!(error instanceof Answer.MediaAnswer.FileUploadError.UploadFailed)) {
                c0VarR.E(-549109013);
                c0VarR.A();
                throw new kotlin.k0();
            }
            c0VarR.E(157902703);
            m507ActionRowFHprtrg(null, io.intercom.android.sdk.R.drawable.intercom_ic_reload, io.intercom.android.sdk.R.string.intercom_try_again, 0, 0L, onRetryClick, c0VarR, (i10 << 9) & 458752, 25);
            IntercomDividerKt.IntercomDivider(d5.t(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(f11), 1, null), c0VarR, 6, 0);
            m507ActionRowFHprtrg(null, R.drawable.intercom_ic_delete, io.intercom.android.sdk.R.string.intercom_delete_attachment, 0, 0L, onDeleteClick, c0VarR, (i10 << 6) & 458752, 25);
            c0VarR.A();
        }
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileUploadErrorComponentKt.FileUploadErrorComponent$lambda$1(title, error, onRetryClick, onDeleteClick, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileUploadErrorComponent$lambda$1(String title, Answer.MediaAnswer.FileUploadError error, Function0 onRetryClick, Function0 onDeleteClick, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(onRetryClick, "$onRetryClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
        FileUploadErrorComponent(title, error, onRetryClick, onDeleteClick, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void UploadFailedErrorActionSheetPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2130831888);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadErrorComponentKt.INSTANCE.m502getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FileUploadErrorComponentKt.UploadFailedErrorActionSheetPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadFailedErrorActionSheetPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        UploadFailedErrorActionSheetPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
