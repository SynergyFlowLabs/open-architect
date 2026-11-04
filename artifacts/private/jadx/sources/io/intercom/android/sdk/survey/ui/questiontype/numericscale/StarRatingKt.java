package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import androidx.compose.foundation.f1;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import androidx.media3.exoplayer.a5;
import com.rabbitmq.client.k0;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nStarRating.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StarRating.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/StarRatingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,99:1\n113#2:100\n113#2:107\n113#2:108\n113#2:109\n113#2:110\n1282#3,6:101\n57#4:111\n61#4:114\n60#5:112\n70#5:115\n53#5,3:118\n22#6:113\n22#6:116\n30#7:117\n172#8:121\n249#8,14:122\n*S KotlinDebug\n*F\n+ 1 StarRating.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/StarRatingKt\n*L\n25#1:100\n65#1:107\n66#1:108\n76#1:109\n77#1:110\n30#1:101,6\n31#1:111\n32#1:114\n31#1:112\n32#1:115\n40#1:118,3\n31#1:113\n32#1:116\n40#1:117\n40#1:121\n40#1:122,14\n*E\n"})
public final class StarRatingKt {
    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SelectedStar(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-596392123);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            float f10 = 44;
            m511StarRatingtAjK0ZQ(i6.i(i6.B(a0.E, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10)), q0.f38131b.y(), 0.0f, 0L, c0VarR, 54, 12);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StarRatingKt.SelectedStar$lambda$4(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedStar$lambda$4(int i10, c0 c0Var, int i11) {
        SelectedStar(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0097, please report this as an issue */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: StarRating-tAjK0ZQ, reason: not valid java name */
    public static final void m511StarRatingtAjK0ZQ(@Nullable a0 a0Var, long j10, float f10, long j11, @Nullable c0 c0Var, final int i10, final int i11) {
        a0 a0Var2;
        int i12;
        long jW;
        float fR;
        long jM730getAccessibleBorderColor8_81llA;
        final a0 a0Var3;
        boolean z10;
        boolean z11;
        Object objI0;
        final long j12;
        final float f11;
        final long j13;
        s5 s5VarT;
        int i13;
        c0 c0VarR = c0Var.R(-1509251218);
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
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
            jW = j10;
        } else {
            jW = j10;
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                i12 |= c0VarR.L(jW) ? 32 : 16;
            }
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & 896) == 0) {
                fR = f10;
                i12 |= c0VarR.I(fR) ? 256 : 128;
            }
            if ((i10 & 7168) == 0) {
                jM730getAccessibleBorderColor8_81llA = j11;
                if ((i11 & 8) == 0 || !c0VarR.L(jM730getAccessibleBorderColor8_81llA)) {
                    i13 = 1024;
                } else {
                    i13 = 2048;
                }
                i12 |= i13;
            } else {
                jM730getAccessibleBorderColor8_81llA = j11;
            }
            if ((i12 & 5851) == 1170 || !c0VarR.d()) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i14 != 0) {
                        a0Var3 = a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i15 != 0) {
                        jW = q0.f38131b.w();
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(1);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM730getAccessibleBorderColor8_81llA = ColorExtensionsKt.m730getAccessibleBorderColor8_81llA(jW);
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    a0Var3 = a0Var2;
                }
                c0VarR.Z();
                c0VarR.E(-1036119505);
                boolean z12 = (((i12 & 7168) ^ 3072) <= 2048 && c0VarR.L(jM730getAccessibleBorderColor8_81llA)) || (i12 & 3072) == 2048;
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z12 | z10 | ((i12 & com.planner5d.library.engine.input.f.b.B) == 32);
                objI0 = c0VarR.i0();
                if (z11 || objI0 == c0.f35327a.a()) {
                    final long j14 = jW;
                    final float f12 = fR;
                    final long j15 = jM730getAccessibleBorderColor8_81llA;
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j15, f12, j14, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                f1.e(a0Var3, (Function1) objI0, c0VarR, i12 & 14);
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            j12 = jW;
            f11 = fR;
            j13 = jM730getAccessibleBorderColor8_81llA;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$3(a0Var3, j12, f11, j13, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        fR = f10;
        if ((i10 & 7168) == 0) {
            jM730getAccessibleBorderColor8_81llA = j11;
            if ((i11 & 8) == 0) {
                i13 = 1024;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        } else {
            jM730getAccessibleBorderColor8_81llA = j11;
        }
        if ((i12 & 5851) == 1170) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    jW = q0.f38131b.w();
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM730getAccessibleBorderColor8_81llA = ColorExtensionsKt.m730getAccessibleBorderColor8_81llA(jW);
                }
            } else {
                if (i14 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    jW = q0.f38131b.w();
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM730getAccessibleBorderColor8_81llA = ColorExtensionsKt.m730getAccessibleBorderColor8_81llA(jW);
                }
            }
            c0VarR.Z();
            c0VarR.E(-1036119505);
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z12 | z10 | ((i12 & com.planner5d.library.engine.input.f.b.B) == 32);
            objI0 = c0VarR.i0();
            if (z11) {
                final long j16 = jW;
                final float f13 = fR;
                final long j17 = jM730getAccessibleBorderColor8_81llA;
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j17, f13, j16, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                final long j18 = jW;
                final float f14 = fR;
                final long j19 = jM730getAccessibleBorderColor8_81llA;
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j19, f14, j18, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            f1.e(a0Var3, (Function1) objI0, c0VarR, i12 & 14);
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    jW = q0.f38131b.w();
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM730getAccessibleBorderColor8_81llA = ColorExtensionsKt.m730getAccessibleBorderColor8_81llA(jW);
                }
            } else {
                if (i14 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    jW = q0.f38131b.w();
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(1);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM730getAccessibleBorderColor8_81llA = ColorExtensionsKt.m730getAccessibleBorderColor8_81llA(jW);
                }
            }
            c0VarR.Z();
            c0VarR.E(-1036119505);
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z12 | z10 | ((i12 & com.planner5d.library.engine.input.f.b.B) == 32);
            objI0 = c0VarR.i0();
            if (z11) {
                final long j110 = jW;
                final float f15 = fR;
                final long j111 = jM730getAccessibleBorderColor8_81llA;
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j111, f15, j110, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                final long j112 = jW;
                final float f16 = fR;
                final long j113 = jM730getAccessibleBorderColor8_81llA;
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j113, f16, j112, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            f1.e(a0Var3, (Function1) objI0, c0VarR, i12 & 14);
        }
        j12 = jW;
        f11 = fR;
        j13 = jM730getAccessibleBorderColor8_81llA;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StarRatingKt.StarRating_tAjK0ZQ$lambda$3(a0Var3, j12, f11, j13, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StarRating_tAjK0ZQ$lambda$2$lambda$1(long j10, float f10, long j11, androidx.compose.ui.graphics.drawscope.f Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 33.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.d() & k0.f265952a)) / 32.0f;
        k2 starPath = getStarPath();
        long jG = n0.g.g((((long) Float.floatToRawIntBits(0.0f)) & k0.f265952a) | (Float.floatToRawIntBits(0.0f) << 32));
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = Canvas.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().g(fIntBitsToFloat, fIntBitsToFloat2, jG);
            androidx.compose.ui.graphics.drawscope.f.K1(Canvas, starPath, j10, 0.0f, new androidx.compose.ui.graphics.drawscope.n(Canvas.S7(f10), 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
            androidx.compose.ui.graphics.drawscope.f.K1(Canvas, starPath, j11, 0.0f, androidx.compose.ui.graphics.drawscope.m.f37744a, r0.f38151b.c(j11, d0.f37693b.z()), 0, 36, null);
            return Unit.f312394a;
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StarRating_tAjK0ZQ$lambda$3(a0 a0Var, long j10, float f10, long j11, int i10, int i11, c0 c0Var, int i12) {
        m511StarRatingtAjK0ZQ(a0Var, j10, f10, j11, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void UnSelectedStar(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(843558828);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            float f10 = 44;
            m511StarRatingtAjK0ZQ(i6.i(i6.B(a0.E, androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.unit.h.r(f10)), 0L, 0.0f, 0L, c0VarR, 6, 14);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StarRatingKt.UnSelectedStar$lambda$5(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnSelectedStar$lambda$5(int i10, c0 c0Var, int i11) {
        UnSelectedStar(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @NotNull
    public static final k2 getStarPath() {
        k2 k2VarA = androidx.compose.ui.graphics.u.a();
        k2VarA.A(31.9f, 11.25f);
        k2VarA.V(32.95f, 11.39f, 33.38f, 12.71f, 32.6f, 13.46f);
        k2VarA.F(25.33f, 20.47f);
        k2VarA.F(27.16f, 30.48f);
        k2VarA.V(27.35f, 31.54f, 26.25f, 32.36f, 25.31f, 31.84f);
        k2VarA.F(16.5f, 26.98f);
        k2VarA.F(7.69f, 31.84f);
        k2VarA.V(6.75f, 32.36f, 5.65f, 31.54f, 5.84f, 30.48f);
        k2VarA.F(7.67f, 20.47f);
        k2VarA.F(0.4f, 13.46f);
        k2VarA.V(-0.38f, 12.71f, 0.05f, 11.39f, 1.1f, 11.25f);
        k2VarA.F(11.04f, 9.92f);
        k2VarA.F(15.36f, 0.73f);
        k2VarA.V(15.82f, -0.24f, 17.18f, -0.24f, 17.64f, 0.73f);
        k2VarA.F(21.96f, 9.92f);
        k2VarA.F(31.9f, 11.25f);
        return k2VarA;
    }
}
