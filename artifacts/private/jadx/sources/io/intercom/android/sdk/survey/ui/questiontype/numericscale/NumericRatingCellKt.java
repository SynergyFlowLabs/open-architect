package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import androidx.compose.foundation.b1;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.t0;
import androidx.compose.foundation.v;
import androidx.compose.material3.q50;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.v0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nNumericRatingCell.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumericRatingCell.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/NumericRatingCellKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,81:1\n113#2:82\n113#2:83\n113#2:84\n70#3:85\n67#3,9:86\n77#3:125\n80#4,6:95\n87#4,3:110\n90#4,2:119\n94#4:124\n391#5,9:101\n400#5,3:121\n4360#6,6:113\n*S KotlinDebug\n*F\n+ 1 NumericRatingCell.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/NumericRatingCellKt\n*L\n28#1:82\n43#1:83\n44#1:84\n35#1:85\n35#1:86,9\n35#1:125\n35#1:95,6\n35#1:110,3\n35#1:119,2\n35#1:124\n35#1:101,9\n35#1:121,3\n35#1:113,6\n*E\n"})
public final class NumericRatingCellKt {
    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void DarkFilledCell(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(477358395);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            m510NumericRatingCelljWvj134("1", null, 0L, 0.0f, q0.f38131b.a(), null, 0L, 0L, c0VarR, 24582, 238);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NumericRatingCellKt.DarkFilledCell$lambda$4(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DarkFilledCell$lambda$4(int i10, c0 c0Var, int i11) {
        DarkFilledCell(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void EmptyCell(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1361614452);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            m510NumericRatingCelljWvj134("1", null, 0L, 0.0f, 0L, null, 0L, 0L, c0VarR, 6, com.planner5d.library.engine.input.f.b.X1);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NumericRatingCellKt.EmptyCell$lambda$2(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyCell$lambda$2(int i10, c0 c0Var, int i11) {
        EmptyCell(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void FilledCell(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1860651045);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            m510NumericRatingCelljWvj134("1", null, 0L, 0.0f, q0.f38131b.y(), null, 0L, 0L, c0VarR, 24582, 238);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NumericRatingCellKt.FilledCell$lambda$3(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledCell$lambda$3(int i10, c0 c0Var, int i11) {
        FilledCell(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0154  */
    /* JADX WARN: Code duplicated, block: B:110:0x015b  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0167  */
    /* JADX WARN: Code duplicated, block: B:115:0x016e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0171  */
    /* JADX WARN: Code duplicated, block: B:120:0x017c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:124:0x0189  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:129:0x0213  */
    /* JADX WARN: Code duplicated, block: B:132:0x021f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0223  */
    /* JADX WARN: Code duplicated, block: B:136:0x0246  */
    /* JADX WARN: Code duplicated, block: B:138:0x0254  */
    /* JADX WARN: Code duplicated, block: B:142:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    /* JADX WARN: Code duplicated, block: B:96:0x012a  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: NumericRatingCell-jWvj134, reason: not valid java name */
    public static final void m510NumericRatingCelljWvj134(@NotNull final String content, @Nullable a0 a0Var, long j10, float f10, long j11, @Nullable v0 v0Var, long j12, long j13, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        a0 a0Var2;
        int i13;
        long j14;
        int i14;
        int i15;
        float fR;
        int i16;
        int i17;
        long j15;
        int i18;
        int i19;
        int i20;
        v0 v0VarM;
        int i21;
        long jA;
        long jW;
        long jM729generateTextColor8_81llA;
        long jX;
        a0 a0Var3;
        float f11;
        int i22;
        long j16;
        final v0 v0Var2;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        c0 c0Var2;
        final long j17;
        final long j18;
        final long j19;
        final a0 a0Var4;
        final float f12;
        final long j20;
        s5 s5VarT;
        int i23;
        Intrinsics.checkNotNullParameter(content, "content");
        c0 c0VarR = c0Var.R(-881315304);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(content) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    j14 = j10;
                    if (c0VarR.L(j14)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        fR = f10;
                        if (c0VarR.I(fR)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 57344) == 0) {
                            j15 = j11;
                            if (c0VarR.L(j15)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 32;
                        if (i19 != 0) {
                            i12 |= androidx.profileinstaller.n.c.f73814m;
                            i20 = 57344;
                            v0VarM = v0Var;
                        } else {
                            i20 = 57344;
                            v0VarM = v0Var;
                            if ((i10 & 458752) == 0) {
                                if (c0VarR.D(v0VarM)) {
                                    i21 = 131072;
                                } else {
                                    i21 = 65536;
                                }
                                i12 |= i21;
                            }
                        }
                        if ((i10 & 3670016) != 0) {
                            if ((i11 & 64) == 0 || !c0VarR.L(j12)) {
                                i23 = 524288;
                            } else {
                                i23 = 1048576;
                            }
                            i12 |= i23;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490 || !c0VarR.d()) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i24 != 0) {
                                    a0Var2 = a0.E;
                                }
                                if (i13 != 0) {
                                    jA = q0.f38131b.a();
                                } else {
                                    jA = j14;
                                }
                                if (i15 != 0) {
                                    fR = androidx.compose.ui.unit.h.r(1);
                                }
                                if (i17 != 0) {
                                    jW = q0.f38131b.w();
                                } else {
                                    jW = j15;
                                }
                                if (i19 != 0) {
                                    v0VarM = v0.f41742b.m();
                                }
                                if ((i11 & 64) != 0) {
                                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                    i12 &= -3670017;
                                } else {
                                    jM729generateTextColor8_81llA = j12;
                                }
                                if ((i11 & 128) != 0) {
                                    jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                    i12 &= -29360129;
                                } else {
                                    jX = j13;
                                }
                                a0Var3 = a0Var2;
                                f11 = fR;
                                i22 = i12;
                                j16 = jA;
                                v0Var2 = v0VarM;
                            } else {
                                c0VarR.u();
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                jX = j13;
                                a0Var3 = a0Var2;
                                f11 = fR;
                                i22 = i12;
                                j16 = j14;
                                v0Var2 = v0VarM;
                                jW = j15;
                                jM729generateTextColor8_81llA = j12;
                            }
                            c0VarR.Z();
                            androidx.compose.foundation.shape.e eVarM = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                            long j21 = jW;
                            float f13 = 44;
                            a0 a0VarI = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM), eVarM), j21, null, 2, null), androidx.compose.ui.unit.h.r(f13)), androidx.compose.ui.unit.h.r(f13));
                            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
                            a1 a1VarK = x.k(aVar.C(), false);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarI);
                            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                            a0 a0Var5 = a0Var3;
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
                            float f14 = f11;
                            y7.n(c0VarD, a1VarK, aVar2.e());
                            y7.n(c0VarD, b1VarK, aVar2.g());
                            function2B = aVar2.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar2.f());
                            c0Var2 = c0VarR;
                            long j22 = jM729generateTextColor8_81llA;
                            long j23 = jX;
                            q50.t(content, d0.f15956a.b(a0.E, aVar.i()), j22, null, j23, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                            c0Var2.o();
                            j17 = j22;
                            j18 = j23;
                            j19 = j21;
                            a0Var4 = a0Var5;
                            f12 = f14;
                            j20 = j16;
                        } else {
                            c0VarR.u();
                            c0Var2 = c0VarR;
                            a0Var4 = a0Var2;
                            j20 = j14;
                            f12 = fR;
                            v0Var2 = v0VarM;
                            j19 = j15;
                            j17 = j12;
                            j18 = j13;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    j15 = j11;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        i20 = 57344;
                        v0VarM = v0Var;
                    } else {
                        i20 = 57344;
                        v0VarM = v0Var;
                        if ((i10 & 458752) == 0) {
                            if (c0VarR.D(v0VarM)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                        }
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        } else {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        }
                        c0VarR.Z();
                        androidx.compose.foundation.shape.e eVarM2 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                        long j24 = jW;
                        float f15 = 44;
                        a0 a0VarI2 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM2), eVarM2), j24, null, 2, null), androidx.compose.ui.unit.h.r(f15)), androidx.compose.ui.unit.h.r(f15));
                        androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
                        a1 a1VarK2 = x.k(aVar3.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarI2);
                        androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                        a0 a0Var6 = a0Var3;
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
                        float f16 = f11;
                        y7.n(c0VarD, a1VarK2, aVar4.e());
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
                        c0Var2 = c0VarR;
                        long j25 = jM729generateTextColor8_81llA;
                        long j26 = jX;
                        q50.t(content, d0.f15956a.b(a0.E, aVar3.i()), j25, null, j26, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                        c0Var2.o();
                        j17 = j25;
                        j18 = j26;
                        j19 = j24;
                        a0Var4 = a0Var6;
                        f12 = f16;
                        j20 = j16;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        } else {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        }
                        c0VarR.Z();
                        androidx.compose.foundation.shape.e eVarM3 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                        long j27 = jW;
                        float f17 = 44;
                        a0 a0VarI3 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM3), eVarM3), j27, null, 2, null), androidx.compose.ui.unit.h.r(f17)), androidx.compose.ui.unit.h.r(f17));
                        androidx.compose.ui.e.a aVar5 = androidx.compose.ui.e.f37317a;
                        a1 a1VarK3 = x.k(aVar5.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarI3);
                        androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                        a0 a0Var7 = a0Var3;
                        function0A = aVar6.a();
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
                        float f18 = f11;
                        y7.n(c0VarD, a1VarK3, aVar6.e());
                        y7.n(c0VarD, b1VarK3, aVar6.g());
                        function2B = aVar6.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN3, aVar6.f());
                        c0Var2 = c0VarR;
                        long j28 = jM729generateTextColor8_81llA;
                        long j29 = jX;
                        q50.t(content, d0.f15956a.b(a0.E, aVar5.i()), j28, null, j29, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                        c0Var2.o();
                        j17 = j28;
                        j18 = j29;
                        j19 = j27;
                        a0Var4 = a0Var7;
                        f12 = f18;
                        j20 = j16;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                fR = f10;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        j15 = j11;
                        if (c0VarR.L(j15)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        i20 = 57344;
                        v0VarM = v0Var;
                    } else {
                        i20 = 57344;
                        v0VarM = v0Var;
                        if ((i10 & 458752) == 0) {
                            if (c0VarR.D(v0VarM)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                        }
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        } else {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        }
                        c0VarR.Z();
                        androidx.compose.foundation.shape.e eVarM4 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                        long j210 = jW;
                        float f19 = 44;
                        a0 a0VarI4 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM4), eVarM4), j210, null, 2, null), androidx.compose.ui.unit.h.r(f19)), androidx.compose.ui.unit.h.r(f19));
                        androidx.compose.ui.e.a aVar7 = androidx.compose.ui.e.f37317a;
                        a1 a1VarK4 = x.k(aVar7.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                        a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarI4);
                        androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                        a0 a0Var8 = a0Var3;
                        function0A = aVar8.a();
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
                        float f110 = f11;
                        y7.n(c0VarD, a1VarK4, aVar8.e());
                        y7.n(c0VarD, b1VarK4, aVar8.g());
                        function2B = aVar8.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN4, aVar8.f());
                        c0Var2 = c0VarR;
                        long j211 = jM729generateTextColor8_81llA;
                        long j212 = jX;
                        q50.t(content, d0.f15956a.b(a0.E, aVar7.i()), j211, null, j212, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                        c0Var2.o();
                        j17 = j211;
                        j18 = j212;
                        j19 = j210;
                        a0Var4 = a0Var8;
                        f12 = f110;
                        j20 = j16;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        } else {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        }
                        c0VarR.Z();
                        androidx.compose.foundation.shape.e eVarM5 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                        long j213 = jW;
                        float f111 = 44;
                        a0 a0VarI5 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM5), eVarM5), j213, null, 2, null), androidx.compose.ui.unit.h.r(f111)), androidx.compose.ui.unit.h.r(f111));
                        androidx.compose.ui.e.a aVar9 = androidx.compose.ui.e.f37317a;
                        a1 a1VarK5 = x.k(aVar9.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarI5);
                        androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                        a0 a0Var9 = a0Var3;
                        function0A = aVar10.a();
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
                        float f112 = f11;
                        y7.n(c0VarD, a1VarK5, aVar10.e());
                        y7.n(c0VarD, b1VarK5, aVar10.g());
                        function2B = aVar10.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN5, aVar10.f());
                        c0Var2 = c0VarR;
                        long j214 = jM729generateTextColor8_81llA;
                        long j215 = jX;
                        q50.t(content, d0.f15956a.b(a0.E, aVar9.i()), j214, null, j215, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                        c0Var2.o();
                        j17 = j214;
                        j18 = j215;
                        j19 = j213;
                        a0Var4 = a0Var9;
                        f12 = f112;
                        j20 = j16;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                j15 = j11;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    i20 = 57344;
                    v0VarM = v0Var;
                } else {
                    i20 = 57344;
                    v0VarM = v0Var;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.D(v0VarM)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM6 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j216 = jW;
                    float f113 = 44;
                    a0 a0VarI6 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM6), eVarM6), j216, null, 2, null), androidx.compose.ui.unit.h.r(f113)), androidx.compose.ui.unit.h.r(f113));
                    androidx.compose.ui.e.a aVar11 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK6 = x.k(aVar11.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarI6);
                    androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                    a0 a0Var10 = a0Var3;
                    function0A = aVar12.a();
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
                    float f114 = f11;
                    y7.n(c0VarD, a1VarK6, aVar12.e());
                    y7.n(c0VarD, b1VarK6, aVar12.g());
                    function2B = aVar12.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN6, aVar12.f());
                    c0Var2 = c0VarR;
                    long j217 = jM729generateTextColor8_81llA;
                    long j218 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar11.i()), j217, null, j218, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j217;
                    j18 = j218;
                    j19 = j216;
                    a0Var4 = a0Var10;
                    f12 = f114;
                    j20 = j16;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM7 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j219 = jW;
                    float f115 = 44;
                    a0 a0VarI7 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM7), eVarM7), j219, null, 2, null), androidx.compose.ui.unit.h.r(f115)), androidx.compose.ui.unit.h.r(f115));
                    androidx.compose.ui.e.a aVar13 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK7 = x.k(aVar13.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarI7);
                    androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                    a0 a0Var11 = a0Var3;
                    function0A = aVar14.a();
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
                    float f116 = f11;
                    y7.n(c0VarD, a1VarK7, aVar14.e());
                    y7.n(c0VarD, b1VarK7, aVar14.g());
                    function2B = aVar14.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN7, aVar14.f());
                    c0Var2 = c0VarR;
                    long j2110 = jM729generateTextColor8_81llA;
                    long j2111 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar13.i()), j2110, null, j2111, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j2110;
                    j18 = j2111;
                    j19 = j219;
                    a0Var4 = a0Var11;
                    f12 = f116;
                    j20 = j16;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            j14 = j10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    fR = f10;
                    if (c0VarR.I(fR)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        j15 = j11;
                        if (c0VarR.L(j15)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        i20 = 57344;
                        v0VarM = v0Var;
                    } else {
                        i20 = 57344;
                        v0VarM = v0Var;
                        if ((i10 & 458752) == 0) {
                            if (c0VarR.D(v0VarM)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                        }
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        } else {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        }
                        c0VarR.Z();
                        androidx.compose.foundation.shape.e eVarM8 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                        long j2112 = jW;
                        float f117 = 44;
                        a0 a0VarI8 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM8), eVarM8), j2112, null, 2, null), androidx.compose.ui.unit.h.r(f117)), androidx.compose.ui.unit.h.r(f117));
                        androidx.compose.ui.e.a aVar15 = androidx.compose.ui.e.f37317a;
                        a1 a1VarK8 = x.k(aVar15.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                        a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarI8);
                        androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
                        a0 a0Var12 = a0Var3;
                        function0A = aVar16.a();
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
                        float f118 = f11;
                        y7.n(c0VarD, a1VarK8, aVar16.e());
                        y7.n(c0VarD, b1VarK8, aVar16.g());
                        function2B = aVar16.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN8, aVar16.f());
                        c0Var2 = c0VarR;
                        long j2113 = jM729generateTextColor8_81llA;
                        long j2114 = jX;
                        q50.t(content, d0.f15956a.b(a0.E, aVar15.i()), j2113, null, j2114, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                        c0Var2.o();
                        j17 = j2113;
                        j18 = j2114;
                        j19 = j2112;
                        a0Var4 = a0Var12;
                        f12 = f118;
                        j20 = j16;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        } else {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        }
                        c0VarR.Z();
                        androidx.compose.foundation.shape.e eVarM9 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                        long j2115 = jW;
                        float f119 = 44;
                        a0 a0VarI9 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM9), eVarM9), j2115, null, 2, null), androidx.compose.ui.unit.h.r(f119)), androidx.compose.ui.unit.h.r(f119));
                        androidx.compose.ui.e.a aVar17 = androidx.compose.ui.e.f37317a;
                        a1 a1VarK9 = x.k(aVar17.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                        a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarI9);
                        androidx.compose.ui.node.g.a aVar18 = androidx.compose.ui.node.g.I;
                        a0 a0Var13 = a0Var3;
                        function0A = aVar18.a();
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
                        float f1110 = f11;
                        y7.n(c0VarD, a1VarK9, aVar18.e());
                        y7.n(c0VarD, b1VarK9, aVar18.g());
                        function2B = aVar18.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN9, aVar18.f());
                        c0Var2 = c0VarR;
                        long j2116 = jM729generateTextColor8_81llA;
                        long j2117 = jX;
                        q50.t(content, d0.f15956a.b(a0.E, aVar17.i()), j2116, null, j2117, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                        c0Var2.o();
                        j17 = j2116;
                        j18 = j2117;
                        j19 = j2115;
                        a0Var4 = a0Var13;
                        f12 = f1110;
                        j20 = j16;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                j15 = j11;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    i20 = 57344;
                    v0VarM = v0Var;
                } else {
                    i20 = 57344;
                    v0VarM = v0Var;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.D(v0VarM)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM10 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j2118 = jW;
                    float f1111 = 44;
                    a0 a0VarI10 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM10), eVarM10), j2118, null, 2, null), androidx.compose.ui.unit.h.r(f1111)), androidx.compose.ui.unit.h.r(f1111));
                    androidx.compose.ui.e.a aVar19 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK10 = x.k(aVar19.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                    a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarI10);
                    androidx.compose.ui.node.g.a aVar110 = androidx.compose.ui.node.g.I;
                    a0 a0Var14 = a0Var3;
                    function0A = aVar110.a();
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
                    float f1112 = f11;
                    y7.n(c0VarD, a1VarK10, aVar110.e());
                    y7.n(c0VarD, b1VarK10, aVar110.g());
                    function2B = aVar110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN10, aVar110.f());
                    c0Var2 = c0VarR;
                    long j2119 = jM729generateTextColor8_81llA;
                    long j21110 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar19.i()), j2119, null, j21110, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j2119;
                    j18 = j21110;
                    j19 = j2118;
                    a0Var4 = a0Var14;
                    f12 = f1112;
                    j20 = j16;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM11 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j21111 = jW;
                    float f1113 = 44;
                    a0 a0VarI11 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM11), eVarM11), j21111, null, 2, null), androidx.compose.ui.unit.h.r(f1113)), androidx.compose.ui.unit.h.r(f1113));
                    androidx.compose.ui.e.a aVar111 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK11 = x.k(aVar111.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                    a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarI11);
                    androidx.compose.ui.node.g.a aVar112 = androidx.compose.ui.node.g.I;
                    a0 a0Var15 = a0Var3;
                    function0A = aVar112.a();
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
                    float f1114 = f11;
                    y7.n(c0VarD, a1VarK11, aVar112.e());
                    y7.n(c0VarD, b1VarK11, aVar112.g());
                    function2B = aVar112.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11, aVar112.f());
                    c0Var2 = c0VarR;
                    long j21112 = jM729generateTextColor8_81llA;
                    long j21113 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar111.i()), j21112, null, j21113, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j21112;
                    j18 = j21113;
                    j19 = j21111;
                    a0Var4 = a0Var15;
                    f12 = f1114;
                    j20 = j16;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            fR = f10;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    j15 = j11;
                    if (c0VarR.L(j15)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    i20 = 57344;
                    v0VarM = v0Var;
                } else {
                    i20 = 57344;
                    v0VarM = v0Var;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.D(v0VarM)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM12 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j21114 = jW;
                    float f1115 = 44;
                    a0 a0VarI12 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM12), eVarM12), j21114, null, 2, null), androidx.compose.ui.unit.h.r(f1115)), androidx.compose.ui.unit.h.r(f1115));
                    androidx.compose.ui.e.a aVar113 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK12 = x.k(aVar113.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                    a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarI12);
                    androidx.compose.ui.node.g.a aVar114 = androidx.compose.ui.node.g.I;
                    a0 a0Var16 = a0Var3;
                    function0A = aVar114.a();
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
                    float f1116 = f11;
                    y7.n(c0VarD, a1VarK12, aVar114.e());
                    y7.n(c0VarD, b1VarK12, aVar114.g());
                    function2B = aVar114.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN12, aVar114.f());
                    c0Var2 = c0VarR;
                    long j21115 = jM729generateTextColor8_81llA;
                    long j21116 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar113.i()), j21115, null, j21116, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j21115;
                    j18 = j21116;
                    j19 = j21114;
                    a0Var4 = a0Var16;
                    f12 = f1116;
                    j20 = j16;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM13 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j21117 = jW;
                    float f1117 = 44;
                    a0 a0VarI13 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM13), eVarM13), j21117, null, 2, null), androidx.compose.ui.unit.h.r(f1117)), androidx.compose.ui.unit.h.r(f1117));
                    androidx.compose.ui.e.a aVar115 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK13 = x.k(aVar115.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarI13);
                    androidx.compose.ui.node.g.a aVar116 = androidx.compose.ui.node.g.I;
                    a0 a0Var17 = a0Var3;
                    function0A = aVar116.a();
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
                    float f1118 = f11;
                    y7.n(c0VarD, a1VarK13, aVar116.e());
                    y7.n(c0VarD, b1VarK13, aVar116.g());
                    function2B = aVar116.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN13, aVar116.f());
                    c0Var2 = c0VarR;
                    long j21118 = jM729generateTextColor8_81llA;
                    long j21119 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar115.i()), j21118, null, j21119, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j21118;
                    j18 = j21119;
                    j19 = j21117;
                    a0Var4 = a0Var17;
                    f12 = f1118;
                    j20 = j16;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            j15 = j11;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                i20 = 57344;
                v0VarM = v0Var;
            } else {
                i20 = 57344;
                v0VarM = v0Var;
                if ((i10 & 458752) == 0) {
                    if (c0VarR.D(v0VarM)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                } else {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                }
                c0VarR.Z();
                androidx.compose.foundation.shape.e eVarM14 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                long j211110 = jW;
                float f1119 = 44;
                a0 a0VarI14 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM14), eVarM14), j211110, null, 2, null), androidx.compose.ui.unit.h.r(f1119)), androidx.compose.ui.unit.h.r(f1119));
                androidx.compose.ui.e.a aVar117 = androidx.compose.ui.e.f37317a;
                a1 a1VarK14 = x.k(aVar117.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarI14);
                androidx.compose.ui.node.g.a aVar118 = androidx.compose.ui.node.g.I;
                a0 a0Var18 = a0Var3;
                function0A = aVar118.a();
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
                float f11110 = f11;
                y7.n(c0VarD, a1VarK14, aVar118.e());
                y7.n(c0VarD, b1VarK14, aVar118.g());
                function2B = aVar118.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN14, aVar118.f());
                c0Var2 = c0VarR;
                long j211111 = jM729generateTextColor8_81llA;
                long j211112 = jX;
                q50.t(content, d0.f15956a.b(a0.E, aVar117.i()), j211111, null, j211112, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                c0Var2.o();
                j17 = j211111;
                j18 = j211112;
                j19 = j211110;
                a0Var4 = a0Var18;
                f12 = f11110;
                j20 = j16;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                } else {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                }
                c0VarR.Z();
                androidx.compose.foundation.shape.e eVarM15 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                long j211113 = jW;
                float f11111 = 44;
                a0 a0VarI15 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM15), eVarM15), j211113, null, 2, null), androidx.compose.ui.unit.h.r(f11111)), androidx.compose.ui.unit.h.r(f11111));
                androidx.compose.ui.e.a aVar119 = androidx.compose.ui.e.f37317a;
                a1 a1VarK15 = x.k(aVar119.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarI15);
                androidx.compose.ui.node.g.a aVar1110 = androidx.compose.ui.node.g.I;
                a0 a0Var19 = a0Var3;
                function0A = aVar1110.a();
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
                float f11112 = f11;
                y7.n(c0VarD, a1VarK15, aVar1110.e());
                y7.n(c0VarD, b1VarK15, aVar1110.g());
                function2B = aVar1110.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN15, aVar1110.f());
                c0Var2 = c0VarR;
                long j211114 = jM729generateTextColor8_81llA;
                long j211115 = jX;
                q50.t(content, d0.f15956a.b(a0.E, aVar119.i()), j211114, null, j211115, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                c0Var2.o();
                j17 = j211114;
                j18 = j211115;
                j19 = j211113;
                a0Var4 = a0Var19;
                f12 = f11112;
                j20 = j16;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                j14 = j10;
                if (c0VarR.L(j14)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    fR = f10;
                    if (c0VarR.I(fR)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        j15 = j11;
                        if (c0VarR.L(j15)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        i20 = 57344;
                        v0VarM = v0Var;
                    } else {
                        i20 = 57344;
                        v0VarM = v0Var;
                        if ((i10 & 458752) == 0) {
                            if (c0VarR.D(v0VarM)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                        }
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i23 = 524288;
                        } else {
                            i23 = 524288;
                        }
                        i12 |= i23;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        } else {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        }
                        c0VarR.Z();
                        androidx.compose.foundation.shape.e eVarM16 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                        long j211116 = jW;
                        float f11113 = 44;
                        a0 a0VarI16 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM16), eVarM16), j211116, null, 2, null), androidx.compose.ui.unit.h.r(f11113)), androidx.compose.ui.unit.h.r(f11113));
                        androidx.compose.ui.e.a aVar1111 = androidx.compose.ui.e.f37317a;
                        a1 a1VarK16 = x.k(aVar1111.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                        a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarI16);
                        androidx.compose.ui.node.g.a aVar1112 = androidx.compose.ui.node.g.I;
                        a0 a0Var110 = a0Var3;
                        function0A = aVar1112.a();
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
                        float f11114 = f11;
                        y7.n(c0VarD, a1VarK16, aVar1112.e());
                        y7.n(c0VarD, b1VarK16, aVar1112.g());
                        function2B = aVar1112.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN16, aVar1112.f());
                        c0Var2 = c0VarR;
                        long j211117 = jM729generateTextColor8_81llA;
                        long j211118 = jX;
                        q50.t(content, d0.f15956a.b(a0.E, aVar1111.i()), j211117, null, j211118, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                        c0Var2.o();
                        j17 = j211117;
                        j18 = j211118;
                        j19 = j211116;
                        a0Var4 = a0Var110;
                        f12 = f11114;
                        j20 = j16;
                    } else {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        } else {
                            if (i24 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i13 != 0) {
                                jA = q0.f38131b.a();
                            } else {
                                jA = j14;
                            }
                            if (i15 != 0) {
                                fR = androidx.compose.ui.unit.h.r(1);
                            }
                            if (i17 != 0) {
                                jW = q0.f38131b.w();
                            } else {
                                jW = j15;
                            }
                            if (i19 != 0) {
                                v0VarM = v0.f41742b.m();
                            }
                            if ((i11 & 64) != 0) {
                                jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                                i12 &= -3670017;
                            } else {
                                jM729generateTextColor8_81llA = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                                i12 &= -29360129;
                            } else {
                                jX = j13;
                            }
                            a0Var3 = a0Var2;
                            f11 = fR;
                            i22 = i12;
                            j16 = jA;
                            v0Var2 = v0VarM;
                        }
                        c0VarR.Z();
                        androidx.compose.foundation.shape.e eVarM17 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                        long j211119 = jW;
                        float f11115 = 44;
                        a0 a0VarI17 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM17), eVarM17), j211119, null, 2, null), androidx.compose.ui.unit.h.r(f11115)), androidx.compose.ui.unit.h.r(f11115));
                        androidx.compose.ui.e.a aVar1113 = androidx.compose.ui.e.f37317a;
                        a1 a1VarK17 = x.k(aVar1113.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                        a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarI17);
                        androidx.compose.ui.node.g.a aVar1114 = androidx.compose.ui.node.g.I;
                        a0 a0Var111 = a0Var3;
                        function0A = aVar1114.a();
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
                        float f11116 = f11;
                        y7.n(c0VarD, a1VarK17, aVar1114.e());
                        y7.n(c0VarD, b1VarK17, aVar1114.g());
                        function2B = aVar1114.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN17, aVar1114.f());
                        c0Var2 = c0VarR;
                        long j2111110 = jM729generateTextColor8_81llA;
                        long j2111111 = jX;
                        q50.t(content, d0.f15956a.b(a0.E, aVar1113.i()), j2111110, null, j2111111, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                        c0Var2.o();
                        j17 = j2111110;
                        j18 = j2111111;
                        j19 = j211119;
                        a0Var4 = a0Var111;
                        f12 = f11116;
                        j20 = j16;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                j15 = j11;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    i20 = 57344;
                    v0VarM = v0Var;
                } else {
                    i20 = 57344;
                    v0VarM = v0Var;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.D(v0VarM)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM18 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j2111112 = jW;
                    float f11117 = 44;
                    a0 a0VarI18 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM18), eVarM18), j2111112, null, 2, null), androidx.compose.ui.unit.h.r(f11117)), androidx.compose.ui.unit.h.r(f11117));
                    androidx.compose.ui.e.a aVar1115 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK18 = x.k(aVar1115.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                    a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarI18);
                    androidx.compose.ui.node.g.a aVar1116 = androidx.compose.ui.node.g.I;
                    a0 a0Var112 = a0Var3;
                    function0A = aVar1116.a();
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
                    float f11118 = f11;
                    y7.n(c0VarD, a1VarK18, aVar1116.e());
                    y7.n(c0VarD, b1VarK18, aVar1116.g());
                    function2B = aVar1116.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN18, aVar1116.f());
                    c0Var2 = c0VarR;
                    long j2111113 = jM729generateTextColor8_81llA;
                    long j2111114 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar1115.i()), j2111113, null, j2111114, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j2111113;
                    j18 = j2111114;
                    j19 = j2111112;
                    a0Var4 = a0Var112;
                    f12 = f11118;
                    j20 = j16;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM19 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j2111115 = jW;
                    float f11119 = 44;
                    a0 a0VarI19 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM19), eVarM19), j2111115, null, 2, null), androidx.compose.ui.unit.h.r(f11119)), androidx.compose.ui.unit.h.r(f11119));
                    androidx.compose.ui.e.a aVar1117 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK19 = x.k(aVar1117.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                    a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarI19);
                    androidx.compose.ui.node.g.a aVar1118 = androidx.compose.ui.node.g.I;
                    a0 a0Var113 = a0Var3;
                    function0A = aVar1118.a();
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
                    float f111110 = f11;
                    y7.n(c0VarD, a1VarK19, aVar1118.e());
                    y7.n(c0VarD, b1VarK19, aVar1118.g());
                    function2B = aVar1118.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN19, aVar1118.f());
                    c0Var2 = c0VarR;
                    long j2111116 = jM729generateTextColor8_81llA;
                    long j2111117 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar1117.i()), j2111116, null, j2111117, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j2111116;
                    j18 = j2111117;
                    j19 = j2111115;
                    a0Var4 = a0Var113;
                    f12 = f111110;
                    j20 = j16;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            fR = f10;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    j15 = j11;
                    if (c0VarR.L(j15)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    i20 = 57344;
                    v0VarM = v0Var;
                } else {
                    i20 = 57344;
                    v0VarM = v0Var;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.D(v0VarM)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM110 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j2111118 = jW;
                    float f111111 = 44;
                    a0 a0VarI110 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM110), eVarM110), j2111118, null, 2, null), androidx.compose.ui.unit.h.r(f111111)), androidx.compose.ui.unit.h.r(f111111));
                    androidx.compose.ui.e.a aVar1119 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK110 = x.k(aVar1119.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                    a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarI110);
                    androidx.compose.ui.node.g.a aVar11110 = androidx.compose.ui.node.g.I;
                    a0 a0Var114 = a0Var3;
                    function0A = aVar11110.a();
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
                    float f111112 = f11;
                    y7.n(c0VarD, a1VarK110, aVar11110.e());
                    y7.n(c0VarD, b1VarK110, aVar11110.g());
                    function2B = aVar11110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN110, aVar11110.f());
                    c0Var2 = c0VarR;
                    long j2111119 = jM729generateTextColor8_81llA;
                    long j21111110 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar1119.i()), j2111119, null, j21111110, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j2111119;
                    j18 = j21111110;
                    j19 = j2111118;
                    a0Var4 = a0Var114;
                    f12 = f111112;
                    j20 = j16;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM111 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j21111111 = jW;
                    float f111113 = 44;
                    a0 a0VarI111 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM111), eVarM111), j21111111, null, 2, null), androidx.compose.ui.unit.h.r(f111113)), androidx.compose.ui.unit.h.r(f111113));
                    androidx.compose.ui.e.a aVar11111 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK111 = x.k(aVar11111.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                    a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarI111);
                    androidx.compose.ui.node.g.a aVar11112 = androidx.compose.ui.node.g.I;
                    a0 a0Var115 = a0Var3;
                    function0A = aVar11112.a();
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
                    float f111114 = f11;
                    y7.n(c0VarD, a1VarK111, aVar11112.e());
                    y7.n(c0VarD, b1VarK111, aVar11112.g());
                    function2B = aVar11112.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111, aVar11112.f());
                    c0Var2 = c0VarR;
                    long j21111112 = jM729generateTextColor8_81llA;
                    long j21111113 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar11111.i()), j21111112, null, j21111113, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j21111112;
                    j18 = j21111113;
                    j19 = j21111111;
                    a0Var4 = a0Var115;
                    f12 = f111114;
                    j20 = j16;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            j15 = j11;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                i20 = 57344;
                v0VarM = v0Var;
            } else {
                i20 = 57344;
                v0VarM = v0Var;
                if ((i10 & 458752) == 0) {
                    if (c0VarR.D(v0VarM)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                } else {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                }
                c0VarR.Z();
                androidx.compose.foundation.shape.e eVarM112 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                long j21111114 = jW;
                float f111115 = 44;
                a0 a0VarI112 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM112), eVarM112), j21111114, null, 2, null), androidx.compose.ui.unit.h.r(f111115)), androidx.compose.ui.unit.h.r(f111115));
                androidx.compose.ui.e.a aVar11113 = androidx.compose.ui.e.f37317a;
                a1 a1VarK112 = x.k(aVar11113.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
                a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarI112);
                androidx.compose.ui.node.g.a aVar11114 = androidx.compose.ui.node.g.I;
                a0 a0Var116 = a0Var3;
                function0A = aVar11114.a();
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
                float f111116 = f11;
                y7.n(c0VarD, a1VarK112, aVar11114.e());
                y7.n(c0VarD, b1VarK112, aVar11114.g());
                function2B = aVar11114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN112, aVar11114.f());
                c0Var2 = c0VarR;
                long j21111115 = jM729generateTextColor8_81llA;
                long j21111116 = jX;
                q50.t(content, d0.f15956a.b(a0.E, aVar11113.i()), j21111115, null, j21111116, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                c0Var2.o();
                j17 = j21111115;
                j18 = j21111116;
                j19 = j21111114;
                a0Var4 = a0Var116;
                f12 = f111116;
                j20 = j16;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                } else {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                }
                c0VarR.Z();
                androidx.compose.foundation.shape.e eVarM113 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                long j21111117 = jW;
                float f111117 = 44;
                a0 a0VarI113 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM113), eVarM113), j21111117, null, 2, null), androidx.compose.ui.unit.h.r(f111117)), androidx.compose.ui.unit.h.r(f111117));
                androidx.compose.ui.e.a aVar11115 = androidx.compose.ui.e.f37317a;
                a1 a1VarK113 = x.k(aVar11115.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
                a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarI113);
                androidx.compose.ui.node.g.a aVar11116 = androidx.compose.ui.node.g.I;
                a0 a0Var117 = a0Var3;
                function0A = aVar11116.a();
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
                float f111118 = f11;
                y7.n(c0VarD, a1VarK113, aVar11116.e());
                y7.n(c0VarD, b1VarK113, aVar11116.g());
                function2B = aVar11116.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN113, aVar11116.f());
                c0Var2 = c0VarR;
                long j21111118 = jM729generateTextColor8_81llA;
                long j21111119 = jX;
                q50.t(content, d0.f15956a.b(a0.E, aVar11115.i()), j21111118, null, j21111119, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                c0Var2.o();
                j17 = j21111118;
                j18 = j21111119;
                j19 = j21111117;
                a0Var4 = a0Var117;
                f12 = f111118;
                j20 = j16;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        j14 = j10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                fR = f10;
                if (c0VarR.I(fR)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    j15 = j11;
                    if (c0VarR.L(j15)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    i20 = 57344;
                    v0VarM = v0Var;
                } else {
                    i20 = 57344;
                    v0VarM = v0Var;
                    if ((i10 & 458752) == 0) {
                        if (c0VarR.D(v0VarM)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i23 = 524288;
                    } else {
                        i23 = 524288;
                    }
                    i12 |= i23;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM114 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j211111110 = jW;
                    float f111119 = 44;
                    a0 a0VarI114 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM114), eVarM114), j211111110, null, 2, null), androidx.compose.ui.unit.h.r(f111119)), androidx.compose.ui.unit.h.r(f111119));
                    androidx.compose.ui.e.a aVar11117 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK114 = x.k(aVar11117.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
                    a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarI114);
                    androidx.compose.ui.node.g.a aVar11118 = androidx.compose.ui.node.g.I;
                    a0 a0Var118 = a0Var3;
                    function0A = aVar11118.a();
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
                    float f1111110 = f11;
                    y7.n(c0VarD, a1VarK114, aVar11118.e());
                    y7.n(c0VarD, b1VarK114, aVar11118.g());
                    function2B = aVar11118.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN114, aVar11118.f());
                    c0Var2 = c0VarR;
                    long j211111111 = jM729generateTextColor8_81llA;
                    long j211111112 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar11117.i()), j211111111, null, j211111112, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j211111111;
                    j18 = j211111112;
                    j19 = j211111110;
                    a0Var4 = a0Var118;
                    f12 = f1111110;
                    j20 = j16;
                } else {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    } else {
                        if (i24 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i13 != 0) {
                            jA = q0.f38131b.a();
                        } else {
                            jA = j14;
                        }
                        if (i15 != 0) {
                            fR = androidx.compose.ui.unit.h.r(1);
                        }
                        if (i17 != 0) {
                            jW = q0.f38131b.w();
                        } else {
                            jW = j15;
                        }
                        if (i19 != 0) {
                            v0VarM = v0.f41742b.m();
                        }
                        if ((i11 & 64) != 0) {
                            jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                            i12 &= -3670017;
                        } else {
                            jM729generateTextColor8_81llA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                            i12 &= -29360129;
                        } else {
                            jX = j13;
                        }
                        a0Var3 = a0Var2;
                        f11 = fR;
                        i22 = i12;
                        j16 = jA;
                        v0Var2 = v0VarM;
                    }
                    c0VarR.Z();
                    androidx.compose.foundation.shape.e eVarM115 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                    long j211111113 = jW;
                    float f1111111 = 44;
                    a0 a0VarI115 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM115), eVarM115), j211111113, null, 2, null), androidx.compose.ui.unit.h.r(f1111111)), androidx.compose.ui.unit.h.r(f1111111));
                    androidx.compose.ui.e.a aVar11119 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK115 = x.k(aVar11119.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK115 = c0VarR.k();
                    a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0VarI115);
                    androidx.compose.ui.node.g.a aVar111110 = androidx.compose.ui.node.g.I;
                    a0 a0Var119 = a0Var3;
                    function0A = aVar111110.a();
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
                    float f1111112 = f11;
                    y7.n(c0VarD, a1VarK115, aVar111110.e());
                    y7.n(c0VarD, b1VarK115, aVar111110.g());
                    function2B = aVar111110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN115, aVar111110.f());
                    c0Var2 = c0VarR;
                    long j211111114 = jM729generateTextColor8_81llA;
                    long j211111115 = jX;
                    q50.t(content, d0.f15956a.b(a0.E, aVar11119.i()), j211111114, null, j211111115, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                    c0Var2.o();
                    j17 = j211111114;
                    j18 = j211111115;
                    j19 = j211111113;
                    a0Var4 = a0Var119;
                    f12 = f1111112;
                    j20 = j16;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            j15 = j11;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                i20 = 57344;
                v0VarM = v0Var;
            } else {
                i20 = 57344;
                v0VarM = v0Var;
                if ((i10 & 458752) == 0) {
                    if (c0VarR.D(v0VarM)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                } else {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                }
                c0VarR.Z();
                androidx.compose.foundation.shape.e eVarM116 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                long j211111116 = jW;
                float f1111113 = 44;
                a0 a0VarI116 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM116), eVarM116), j211111116, null, 2, null), androidx.compose.ui.unit.h.r(f1111113)), androidx.compose.ui.unit.h.r(f1111113));
                androidx.compose.ui.e.a aVar111111 = androidx.compose.ui.e.f37317a;
                a1 a1VarK116 = x.k(aVar111111.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK116 = c0VarR.k();
                a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarI116);
                androidx.compose.ui.node.g.a aVar111112 = androidx.compose.ui.node.g.I;
                a0 a0Var1110 = a0Var3;
                function0A = aVar111112.a();
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
                float f1111114 = f11;
                y7.n(c0VarD, a1VarK116, aVar111112.e());
                y7.n(c0VarD, b1VarK116, aVar111112.g());
                function2B = aVar111112.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN116, aVar111112.f());
                c0Var2 = c0VarR;
                long j211111117 = jM729generateTextColor8_81llA;
                long j211111118 = jX;
                q50.t(content, d0.f15956a.b(a0.E, aVar111111.i()), j211111117, null, j211111118, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                c0Var2.o();
                j17 = j211111117;
                j18 = j211111118;
                j19 = j211111116;
                a0Var4 = a0Var1110;
                f12 = f1111114;
                j20 = j16;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                } else {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                }
                c0VarR.Z();
                androidx.compose.foundation.shape.e eVarM117 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                long j211111119 = jW;
                float f1111115 = 44;
                a0 a0VarI117 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM117), eVarM117), j211111119, null, 2, null), androidx.compose.ui.unit.h.r(f1111115)), androidx.compose.ui.unit.h.r(f1111115));
                androidx.compose.ui.e.a aVar111113 = androidx.compose.ui.e.f37317a;
                a1 a1VarK117 = x.k(aVar111113.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK117 = c0VarR.k();
                a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarI117);
                androidx.compose.ui.node.g.a aVar111114 = androidx.compose.ui.node.g.I;
                a0 a0Var1111 = a0Var3;
                function0A = aVar111114.a();
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
                float f1111116 = f11;
                y7.n(c0VarD, a1VarK117, aVar111114.e());
                y7.n(c0VarD, b1VarK117, aVar111114.g());
                function2B = aVar111114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN117, aVar111114.f());
                c0Var2 = c0VarR;
                long j2111111110 = jM729generateTextColor8_81llA;
                long j2111111111 = jX;
                q50.t(content, d0.f15956a.b(a0.E, aVar111113.i()), j2111111110, null, j2111111111, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                c0Var2.o();
                j17 = j2111111110;
                j18 = j2111111111;
                j19 = j211111119;
                a0Var4 = a0Var1111;
                f12 = f1111116;
                j20 = j16;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        fR = f10;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 57344) == 0) {
                j15 = j11;
                if (c0VarR.L(j15)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                i20 = 57344;
                v0VarM = v0Var;
            } else {
                i20 = 57344;
                v0VarM = v0Var;
                if ((i10 & 458752) == 0) {
                    if (c0VarR.D(v0VarM)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i12 |= i23;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                } else {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                }
                c0VarR.Z();
                androidx.compose.foundation.shape.e eVarM118 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                long j2111111112 = jW;
                float f1111117 = 44;
                a0 a0VarI118 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM118), eVarM118), j2111111112, null, 2, null), androidx.compose.ui.unit.h.r(f1111117)), androidx.compose.ui.unit.h.r(f1111117));
                androidx.compose.ui.e.a aVar111115 = androidx.compose.ui.e.f37317a;
                a1 a1VarK118 = x.k(aVar111115.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK118 = c0VarR.k();
                a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarI118);
                androidx.compose.ui.node.g.a aVar111116 = androidx.compose.ui.node.g.I;
                a0 a0Var1112 = a0Var3;
                function0A = aVar111116.a();
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
                float f1111118 = f11;
                y7.n(c0VarD, a1VarK118, aVar111116.e());
                y7.n(c0VarD, b1VarK118, aVar111116.g());
                function2B = aVar111116.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN118, aVar111116.f());
                c0Var2 = c0VarR;
                long j2111111113 = jM729generateTextColor8_81llA;
                long j2111111114 = jX;
                q50.t(content, d0.f15956a.b(a0.E, aVar111115.i()), j2111111113, null, j2111111114, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                c0Var2.o();
                j17 = j2111111113;
                j18 = j2111111114;
                j19 = j2111111112;
                a0Var4 = a0Var1112;
                f12 = f1111118;
                j20 = j16;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                } else {
                    if (i24 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i13 != 0) {
                        jA = q0.f38131b.a();
                    } else {
                        jA = j14;
                    }
                    if (i15 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if (i17 != 0) {
                        jW = q0.f38131b.w();
                    } else {
                        jW = j15;
                    }
                    if (i19 != 0) {
                        v0VarM = v0.f41742b.m();
                    }
                    if ((i11 & 64) != 0) {
                        jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                        i12 &= -3670017;
                    } else {
                        jM729generateTextColor8_81llA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                        i12 &= -29360129;
                    } else {
                        jX = j13;
                    }
                    a0Var3 = a0Var2;
                    f11 = fR;
                    i22 = i12;
                    j16 = jA;
                    v0Var2 = v0VarM;
                }
                c0VarR.Z();
                androidx.compose.foundation.shape.e eVarM119 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
                long j2111111115 = jW;
                float f1111119 = 44;
                a0 a0VarI119 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM119), eVarM119), j2111111115, null, 2, null), androidx.compose.ui.unit.h.r(f1111119)), androidx.compose.ui.unit.h.r(f1111119));
                androidx.compose.ui.e.a aVar111117 = androidx.compose.ui.e.f37317a;
                a1 a1VarK119 = x.k(aVar111117.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK119 = c0VarR.k();
                a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, a0VarI119);
                androidx.compose.ui.node.g.a aVar111118 = androidx.compose.ui.node.g.I;
                a0 a0Var1113 = a0Var3;
                function0A = aVar111118.a();
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
                float f11111110 = f11;
                y7.n(c0VarD, a1VarK119, aVar111118.e());
                y7.n(c0VarD, b1VarK119, aVar111118.g());
                function2B = aVar111118.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN119, aVar111118.f());
                c0Var2 = c0VarR;
                long j2111111116 = jM729generateTextColor8_81llA;
                long j2111111117 = jX;
                q50.t(content, d0.f15956a.b(a0.E, aVar111117.i()), j2111111116, null, j2111111117, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
                c0Var2.o();
                j17 = j2111111116;
                j18 = j2111111117;
                j19 = j2111111115;
                a0Var4 = a0Var1113;
                f12 = f11111110;
                j20 = j16;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        j15 = j11;
        i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            i20 = 57344;
            v0VarM = v0Var;
        } else {
            i20 = 57344;
            v0VarM = v0Var;
            if ((i10 & 458752) == 0) {
                if (c0VarR.D(v0VarM)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            }
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i12 |= i23;
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !c0VarR.L(j13)) ? 4194304 : 8388608;
        }
        if ((i12 & 23967451) == 4793490) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    a0Var2 = a0.E;
                }
                if (i13 != 0) {
                    jA = q0.f38131b.a();
                } else {
                    jA = j14;
                }
                if (i15 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if (i17 != 0) {
                    jW = q0.f38131b.w();
                } else {
                    jW = j15;
                }
                if (i19 != 0) {
                    v0VarM = v0.f41742b.m();
                }
                if ((i11 & 64) != 0) {
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    i12 &= -3670017;
                } else {
                    jM729generateTextColor8_81llA = j12;
                }
                if ((i11 & 128) != 0) {
                    jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                    i12 &= -29360129;
                } else {
                    jX = j13;
                }
                a0Var3 = a0Var2;
                f11 = fR;
                i22 = i12;
                j16 = jA;
                v0Var2 = v0VarM;
            } else {
                if (i24 != 0) {
                    a0Var2 = a0.E;
                }
                if (i13 != 0) {
                    jA = q0.f38131b.a();
                } else {
                    jA = j14;
                }
                if (i15 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if (i17 != 0) {
                    jW = q0.f38131b.w();
                } else {
                    jW = j15;
                }
                if (i19 != 0) {
                    v0VarM = v0.f41742b.m();
                }
                if ((i11 & 64) != 0) {
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    i12 &= -3670017;
                } else {
                    jM729generateTextColor8_81llA = j12;
                }
                if ((i11 & 128) != 0) {
                    jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                    i12 &= -29360129;
                } else {
                    jX = j13;
                }
                a0Var3 = a0Var2;
                f11 = fR;
                i22 = i12;
                j16 = jA;
                v0Var2 = v0VarM;
            }
            c0VarR.Z();
            androidx.compose.foundation.shape.e eVarM1110 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
            long j2111111118 = jW;
            float f11111111 = 44;
            a0 a0VarI1110 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM1110), eVarM1110), j2111111118, null, 2, null), androidx.compose.ui.unit.h.r(f11111111)), androidx.compose.ui.unit.h.r(f11111111));
            androidx.compose.ui.e.a aVar111119 = androidx.compose.ui.e.f37317a;
            a1 a1VarK1110 = x.k(aVar111119.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK1110 = c0VarR.k();
            a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarI1110);
            androidx.compose.ui.node.g.a aVar1111110 = androidx.compose.ui.node.g.I;
            a0 a0Var1114 = a0Var3;
            function0A = aVar1111110.a();
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
            float f11111112 = f11;
            y7.n(c0VarD, a1VarK1110, aVar1111110.e());
            y7.n(c0VarD, b1VarK1110, aVar1111110.g());
            function2B = aVar1111110.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1110, aVar1111110.f());
            c0Var2 = c0VarR;
            long j2111111119 = jM729generateTextColor8_81llA;
            long j21111111110 = jX;
            q50.t(content, d0.f15956a.b(a0.E, aVar111119.i()), j2111111119, null, j21111111110, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
            c0Var2.o();
            j17 = j2111111119;
            j18 = j21111111110;
            j19 = j2111111118;
            a0Var4 = a0Var1114;
            f12 = f11111112;
            j20 = j16;
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    a0Var2 = a0.E;
                }
                if (i13 != 0) {
                    jA = q0.f38131b.a();
                } else {
                    jA = j14;
                }
                if (i15 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if (i17 != 0) {
                    jW = q0.f38131b.w();
                } else {
                    jW = j15;
                }
                if (i19 != 0) {
                    v0VarM = v0.f41742b.m();
                }
                if ((i11 & 64) != 0) {
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    i12 &= -3670017;
                } else {
                    jM729generateTextColor8_81llA = j12;
                }
                if ((i11 & 128) != 0) {
                    jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                    i12 &= -29360129;
                } else {
                    jX = j13;
                }
                a0Var3 = a0Var2;
                f11 = fR;
                i22 = i12;
                j16 = jA;
                v0Var2 = v0VarM;
            } else {
                if (i24 != 0) {
                    a0Var2 = a0.E;
                }
                if (i13 != 0) {
                    jA = q0.f38131b.a();
                } else {
                    jA = j14;
                }
                if (i15 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if (i17 != 0) {
                    jW = q0.f38131b.w();
                } else {
                    jW = j15;
                }
                if (i19 != 0) {
                    v0VarM = v0.f41742b.m();
                }
                if ((i11 & 64) != 0) {
                    jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(jW);
                    i12 &= -3670017;
                } else {
                    jM729generateTextColor8_81llA = j12;
                }
                if ((i11 & 128) != 0) {
                    jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04().x();
                    i12 &= -29360129;
                } else {
                    jX = j13;
                }
                a0Var3 = a0Var2;
                f11 = fR;
                i22 = i12;
                j16 = jA;
                v0Var2 = v0VarM;
            }
            c0VarR.Z();
            androidx.compose.foundation.shape.e eVarM1111 = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
            long j21111111111 = jW;
            float f11111113 = 44;
            a0 a0VarI1111 = i6.i(i6.B(v.d(androidx.compose.ui.draw.j.a(t0.g(a0Var3, b1.a(f11, j16), eVarM1111), eVarM1111), j21111111111, null, 2, null), androidx.compose.ui.unit.h.r(f11111113)), androidx.compose.ui.unit.h.r(f11111113));
            androidx.compose.ui.e.a aVar1111111 = androidx.compose.ui.e.f37317a;
            a1 a1VarK1111 = x.k(aVar1111111.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK1111 = c0VarR.k();
            a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarI1111);
            androidx.compose.ui.node.g.a aVar1111112 = androidx.compose.ui.node.g.I;
            a0 a0Var1115 = a0Var3;
            function0A = aVar1111112.a();
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
            float f11111114 = f11;
            y7.n(c0VarD, a1VarK1111, aVar1111112.e());
            y7.n(c0VarD, b1VarK1111, aVar1111112.g());
            function2B = aVar1111112.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1111, aVar1111112.f());
            c0Var2 = c0VarR;
            long j21111111112 = jM729generateTextColor8_81llA;
            long j21111111113 = jX;
            q50.t(content, d0.f15956a.b(a0.E, aVar1111111.i()), j21111111112, null, j21111111113, null, v0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, (i22 & 14) | ((i22 >> 12) & 896) | ((i22 >> 9) & i20) | ((i22 << 3) & 3670016), 0, 262056);
            c0Var2.o();
            j17 = j21111111112;
            j18 = j21111111113;
            j19 = j21111111111;
            a0Var4 = a0Var1115;
            f12 = f11111114;
            j20 = j16;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, a0Var4, j20, f12, j19, v0Var2, j17, j18, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumericRatingCell_jWvj134$lambda$1(String content, a0 a0Var, long j10, float f10, long j11, v0 v0Var, long j12, long j13, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(content, "$content");
        m510NumericRatingCelljWvj134(content, a0Var, j10, f10, j11, v0Var, j12, j13, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
