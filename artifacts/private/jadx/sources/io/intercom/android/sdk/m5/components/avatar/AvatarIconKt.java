package io.intercom.android.sdk.m5.components.avatar;

import android.content.Context;
import androidx.compose.foundation.f1;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g0;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.s2;
import androidx.compose.foundation.t0;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.b0;
import androidx.compose.ui.semantics.e0;
import androidx.media3.exoplayer.a5;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAvatarIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarIcon.kt\nio/intercom/android/sdk/m5/components/avatar/AvatarIconKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,454:1\n1282#2,6:455\n1282#2,3:461\n1285#2,3:465\n1282#2,6:468\n1282#2,6:518\n1282#2,6:560\n113#3:464\n113#3:511\n118#3:516\n113#3:517\n113#3:566\n113#3:580\n75#4:474\n70#5:475\n68#5,8:476\n77#5:515\n70#5:524\n68#5,8:525\n77#5:570\n80#6,6:484\n87#6,3:499\n90#6,2:508\n94#6:514\n80#6,6:533\n87#6,3:548\n90#6,2:557\n94#6:569\n391#7,9:490\n400#7:510\n401#7,2:512\n391#7,9:539\n400#7:559\n401#7,2:567\n4360#8,6:502\n4360#8,6:551\n85#9:571\n117#9,2:572\n85#9:574\n117#9,2:575\n85#9:577\n117#9,2:578\n*S KotlinDebug\n*F\n+ 1 AvatarIcon.kt\nio/intercom/android/sdk/m5/components/avatar/AvatarIconKt\n*L\n134#1:455,6\n138#1:461,3\n138#1:465,3\n139#1:468,6\n317#1:518,6\n334#1:560,6\n138#1:464\n272#1:511\n302#1:516\n316#1:517\n347#1:566\n147#1:580\n234#1:474\n267#1:475\n267#1:476,8\n267#1:515\n331#1:524\n331#1:525,8\n331#1:570\n267#1:484,6\n267#1:499,3\n267#1:508,2\n267#1:514\n331#1:533,6\n331#1:548,3\n331#1:557,2\n331#1:569\n267#1:490,9\n267#1:510\n267#1:512,2\n331#1:539,9\n331#1:559\n331#1:567,2\n267#1:502,6\n331#1:551,6\n134#1:571\n134#1:572,2\n138#1:574\n138#1:575,2\n139#1:577\n139#1:578,2\n*E\n"})
public final class AvatarIconKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarShape.values().length];
            try {
                iArr[AvatarShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarShape.SQUIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void AvatarActiveIndicator(final a0 a0Var, c0 c0Var, final int i10, final int i11) {
        int i12;
        c0 c0VarR = c0Var.R(-1051352444);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                a0Var = a0.E;
            }
            final long jM686getActive0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m686getActive0d7_KjU();
            a0 a0VarW = i6.w(a0Var, androidx.compose.ui.unit.h.r(8));
            c0VarR.E(821186808);
            boolean zL = c0VarR.L(jM686getActive0d7_KjU);
            Object objI0 = c0VarR.i0();
            if (zL || objI0 == c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AvatarIconKt.AvatarActiveIndicator$lambda$16$lambda$15(jM686getActive0d7_KjU, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            f1.e(a0VarW, (Function1) objI0, c0VarR, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.AvatarActiveIndicator$lambda$17(a0Var, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarActiveIndicator$lambda$16$lambda$15(long j10, androidx.compose.ui.graphics.drawscope.f Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        androidx.compose.ui.graphics.drawscope.f.B4(Canvas, j10, 0.0f, 0L, 0.0f, null, null, 0, okhttp3.internal.ws.g.f334652s, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarActiveIndicator$lambda$17(a0 a0Var, int i10, int i11, c0 c0Var, int i12) {
        AvatarActiveIndicator(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: AvatarIcon-Rd90Nhg, reason: not valid java name */
    public static final void m173AvatarIconRd90Nhg(@Nullable a0 a0Var, @NotNull final AvatarWrapper avatarWrapper, @Nullable q3 q3Var, boolean z10, long j10, @Nullable q0 q0Var, @Nullable c0 c0Var, int i10, final int i11) {
        int i12;
        q3 composeShape;
        int i13;
        final long jX;
        Intrinsics.checkNotNullParameter(avatarWrapper, "avatarWrapper");
        c0 c0VarR = c0Var.R(462320907);
        final a0 a0Var2 = (i11 & 1) != 0 ? a0.E : a0Var;
        if ((i11 & 4) != 0) {
            AvatarShape shape = avatarWrapper.getAvatar().getShape();
            Intrinsics.checkNotNullExpressionValue(shape, "getShape(...)");
            i12 = i10;
            composeShape = getComposeShape(shape);
            i13 = i12 & (-897);
        } else {
            i12 = i10;
            composeShape = q3Var;
            i13 = i12;
        }
        boolean z11 = (i11 & 8) != 0 ? false : z10;
        if ((i11 & 16) != 0) {
            i13 &= -57345;
            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5().x();
        } else {
            jX = j10;
        }
        q0 q0Var2 = (i11 & 32) != 0 ? null : q0Var;
        if (Intrinsics.areEqual(composeShape, getComposeShape(AvatarShape.SQUIRCLE))) {
            c0VarR.E(1816789334);
            FinAvatar(a0Var2, avatarWrapper, composeShape, c0VarR, (i13 & 896) | (i13 & 14) | 64, 0);
            c0VarR.A();
        } else {
            c0VarR.E(1816937855);
            long j11 = jX;
            q0 q0Var3 = q0Var2;
            m175DefaultAvatarRd90Nhg(avatarWrapper, a0Var2, composeShape, z11, j11, q0Var3, c0VarR, ((i13 << 3) & com.planner5d.library.engine.input.f.b.B) | 8 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
            q0Var2 = q0Var3;
            jX = j11;
            c0VarR.A();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final q0 q0Var4 = q0Var2;
            final int i14 = i12;
            final boolean z12 = z11;
            final q3 q3Var2 = composeShape;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.AvatarIcon_Rd90Nhg$lambda$0(a0Var2, avatarWrapper, q3Var2, z12, jX, q0Var4, i14, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void AvatarIconActivePreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-382759013);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m177getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.AvatarIconActivePreview$lambda$23(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarIconActivePreview$lambda$23(int i10, c0 c0Var, int i11) {
        AvatarIconActivePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void AvatarIconCutPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1591864993);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m179getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.AvatarIconCutPreview$lambda$25(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarIconCutPreview$lambda$25(int i10, c0 c0Var, int i11) {
        AvatarIconCutPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void AvatarIconPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1461886463);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 4 ^ 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m176getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.AvatarIconPreview$lambda$22(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarIconPreview$lambda$22(int i10, c0 c0Var, int i11) {
        AvatarIconPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void AvatarIconSquirclePreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1626854011);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m178getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.AvatarIconSquirclePreview$lambda$24(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarIconSquirclePreview$lambda$24(int i10, c0 c0Var, int i11) {
        AvatarIconSquirclePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarIcon_Rd90Nhg$lambda$0(a0 a0Var, AvatarWrapper avatarWrapper, q3 q3Var, boolean z10, long j10, q0 q0Var, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "$avatarWrapper");
        m173AvatarIconRd90Nhg(a0Var, avatarWrapper, q3Var, z10, j10, q0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0150  */
    /* JADX WARN: Code duplicated, block: B:80:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:0x0159  */
    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: AvatarPlaceholder-jxWH9Kg, reason: not valid java name */
    private static final void m174AvatarPlaceholderjxWH9Kg(a0 a0Var, final String str, final long j10, final long j11, final String str2, c0 c0Var, final int i10, final int i11) {
        final a0 a0Var2;
        int i12;
        String str3;
        long j12;
        long j13;
        int i13;
        int i14;
        a0 a0Var3;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean z10;
        Object objI0;
        s5 s5VarT;
        c0 c0VarR = c0Var.R(-99590848);
        int i15 = i11 & 1;
        if (i15 != 0) {
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
            str3 = str;
        } else {
            str3 = str;
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                i12 |= c0VarR.D(str3) ? 32 : 16;
            }
        }
        if ((i11 & 4) == 0) {
            if ((i10 & 896) == 0) {
                j12 = j10;
                i12 |= c0VarR.L(j12) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
                j13 = j11;
            } else {
                j13 = j11;
                if ((i10 & 7168) == 0) {
                    if (c0VarR.L(j13)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i12 |= i13;
                }
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (c0VarR.D(str2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((46811 & i12) == 9362 || !c0VarR.d()) {
                if (i15 != 0) {
                    a0Var3 = a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                a1 a1VarK = x.k(androidx.compose.ui.e.f37317a.i(), false);
                iHashCode = Long.hashCode(v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                function0A = aVar.a();
                if (c0VarR.S() == null) {
                    v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK, aVar.e());
                y7.n(c0VarD, b1VarK, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar.f());
                d0 d0Var = d0.f15956a;
                if (StringsKt.w3(str3)) {
                    c0VarR.E(-2026212151);
                    ni.o(u0.e.c(R.drawable.intercom_ic_avatar_person, c0VarR, 0), str2, d5.r(a0Var3, androidx.compose.ui.unit.h.r(8)), j10, c0VarR, 8 | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | ((i12 << 3) & 7168), 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(-2026561893);
                    a0.a aVar2 = a0.E;
                    c0VarR.E(-758107778);
                    if ((i12 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10 || objI0 == c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(str2, (e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    q50.t(str3, androidx.compose.ui.semantics.t.f(aVar2, false, (Function1) objI0, 1, null), j12, null, j13, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5(), c0VarR, ((i12 >> 3) & 14) | (i12 & 896) | ((i12 << 3) & 57344), 0, 131048);
                    c0VarR.A();
                }
                c0VarR.o();
                a0Var2 = a0Var3;
            } else {
                c0VarR.u();
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$21(a0Var2, str, j10, j11, str2, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        j12 = j10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
            j13 = j11;
        } else {
            j13 = j11;
            if ((i10 & 7168) == 0) {
                if (c0VarR.L(j13)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (c0VarR.D(str2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
        }
        if ((46811 & i12) == 9362) {
            if (i15 != 0) {
                a0Var3 = a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            a1 a1VarK2 = x.k(androidx.compose.ui.e.f37317a.i(), false);
            iHashCode = Long.hashCode(v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0Var3);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            function0A = aVar3.a();
            if (c0VarR.S() == null) {
                v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK2, aVar3.e());
            y7.n(c0VarD, b1VarK2, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN2, aVar3.f());
            d0 d0Var2 = d0.f15956a;
            if (StringsKt.w3(str3)) {
                c0VarR.E(-2026561893);
                a0.a aVar4 = a0.E;
                c0VarR.E(-758107778);
                if ((i12 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(str2, (e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(str2, (e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                q50.t(str3, androidx.compose.ui.semantics.t.f(aVar4, false, (Function1) objI0, 1, null), j12, null, j13, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5(), c0VarR, ((i12 >> 3) & 14) | (i12 & 896) | ((i12 << 3) & 57344), 0, 131048);
                c0VarR.A();
            } else {
                c0VarR.E(-2026212151);
                ni.o(u0.e.c(R.drawable.intercom_ic_avatar_person, c0VarR, 0), str2, d5.r(a0Var3, androidx.compose.ui.unit.h.r(8)), j10, c0VarR, 8 | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | ((i12 << 3) & 7168), 0);
                c0VarR.A();
            }
            c0VarR.o();
            a0Var2 = a0Var3;
        } else {
            if (i15 != 0) {
                a0Var3 = a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            a1 a1VarK3 = x.k(androidx.compose.ui.e.f37317a.i(), false);
            iHashCode = Long.hashCode(v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var3);
            androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
            function0A = aVar5.a();
            if (c0VarR.S() == null) {
                v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK3, aVar5.e());
            y7.n(c0VarD, b1VarK3, aVar5.g());
            function2B = aVar5.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar5.f());
            d0 d0Var3 = d0.f15956a;
            if (StringsKt.w3(str3)) {
                c0VarR.E(-2026561893);
                a0.a aVar6 = a0.E;
                c0VarR.E(-758107778);
                if ((i12 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(str2, (e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(str2, (e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                q50.t(str3, androidx.compose.ui.semantics.t.f(aVar6, false, (Function1) objI0, 1, null), j12, null, j13, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5(), c0VarR, ((i12 >> 3) & 14) | (i12 & 896) | ((i12 << 3) & 57344), 0, 131048);
                c0VarR.A();
            } else {
                c0VarR.E(-2026212151);
                ni.o(u0.e.c(R.drawable.intercom_ic_avatar_person, c0VarR, 0), str2, d5.r(a0Var3, androidx.compose.ui.unit.h.r(8)), j10, c0VarR, 8 | ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | ((i12 << 3) & 7168), 0);
                c0VarR.A();
            }
            c0VarR.o();
            a0Var2 = a0Var3;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$21(a0Var2, str, j10, j11, str2, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(String contentDescription, e0 semantics) {
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        b0.v1(semantics, contentDescription);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarPlaceholder_jxWH9Kg$lambda$21(a0 a0Var, String avatarInitials, long j10, long j11, String contentDescription, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatarInitials, "$avatarInitials");
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        m174AvatarPlaceholderjxWH9Kg(a0Var, avatarInitials, j10, j11, contentDescription, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void BotAvatarPlaceholder(final AvatarWrapper avatarWrapper, a0 a0Var, float f10, c0 c0Var, final int i10, final int i11) {
        c0 c0VarR = c0Var.R(1859249921);
        if ((i11 & 2) != 0) {
            a0Var = a0.E;
        }
        final a0 a0Var2 = a0Var;
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        final float f11 = f10;
        s2.d(u0.e.c(R.drawable.intercom_default_avatar_icon, c0VarR, 0), avatarWrapper.getAvatar().getLabel(), a0Var2, null, null, f11, null, c0VarR, ((i10 << 3) & 896) | 8 | ((i10 << 9) & 458752), 88);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.BotAvatarPlaceholder$lambda$14(avatarWrapper, a0Var2, f11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotAvatarPlaceholder$lambda$14(AvatarWrapper avatarWrapper, a0 a0Var, float f10, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "$avatarWrapper");
        BotAvatarPlaceholder(avatarWrapper, a0Var, f10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void BotAvatarPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1158049743);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m180getLambda5$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.BotAvatarPreview$lambda$26(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotAvatarPreview$lambda$26(int i10, c0 c0Var, int i11) {
        BotAvatarPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: DefaultAvatar-Rd90Nhg, reason: not valid java name */
    private static final void m175DefaultAvatarRd90Nhg(final AvatarWrapper avatarWrapper, a0 a0Var, q3 q3Var, boolean z10, long j10, q0 q0Var, c0 c0Var, int i10, final int i11) {
        final int i12;
        q3 composeShape;
        int i13;
        final long jX;
        c0 c0VarR = c0Var.R(386725315);
        final a0 a0Var2 = (i11 & 2) != 0 ? a0.E : a0Var;
        if ((i11 & 4) != 0) {
            i12 = i10;
            i13 = i12 & (-897);
            composeShape = getComposeShape(AvatarShape.CIRCLE);
        } else {
            i12 = i10;
            composeShape = q3Var;
            i13 = i12;
        }
        final boolean z11 = (i11 & 8) != 0 ? false : z10;
        if ((i11 & 16) != 0) {
            jX = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5().x();
            i13 &= -57345;
        } else {
            jX = j10;
        }
        final q0 q0Var2 = (i11 & 32) != 0 ? null : q0Var;
        long jM684getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m684getAction0d7_KjU();
        c0VarR.E(870365600);
        Object objI0 = c0VarR.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(q0.n(q0Var2 != null ? q0Var2.M() : ColorExtensionsKt.m728darken8_81llA(jM684getAction0d7_KjU)), null, 2, null);
            c0VarR.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        c0VarR.A();
        long jM729generateTextColor8_81llA = ColorExtensionsKt.m729generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(n3Var));
        boolean zM735isDarkColor8_81llA = ColorExtensionsKt.m735isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(n3Var));
        c0VarR.E(870372748);
        Object objI1 = c0VarR.i0();
        if (objI1 == aVar.a()) {
            objI1 = d7.g(androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(8)), null, 2, null);
            c0VarR.Y(objI1);
        }
        n3 n3Var2 = (n3) objI1;
        c0VarR.A();
        c0VarR.E(870374477);
        Object objI2 = c0VarR.i0();
        if (objI2 == aVar.a()) {
            objI2 = d7.g(composeShape, null, 2, null);
            c0VarR.Y(objI2);
        }
        c0VarR.A();
        g0.c(a0Var2, null, false, w.e(-1891463123, true, new AvatarIconKt$DefaultAvatar$1(z11, composeShape, zM735isDarkColor8_81llA, n3Var2, (n3) objI2, n3Var, avatarWrapper, jM684getAction0d7_KjU, q0Var2, jM729generateTextColor8_81llA, jX), c0VarR, 54), c0VarR, ((i13 >> 3) & 14) | 3072, 6);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final q3 q3Var2 = composeShape;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(avatarWrapper, a0Var2, q3Var2, z11, jX, q0Var2, i12, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void DefaultAvatar_Rd90Nhg$Placeholder(AvatarWrapper avatarWrapper, long j10, long j11, a0 a0Var, c0 c0Var, int i10, int i11) {
        c0Var.E(1593692287);
        if ((i11 & 1) != 0) {
            a0Var = a0.E;
        }
        a0 a0Var2 = a0Var;
        if (avatarWrapper.isBot()) {
            c0Var.E(-730785003);
            BotAvatarPlaceholder(avatarWrapper, d5.r(a0Var2, androidx.compose.ui.unit.h.r(8)), 0.0f, c0Var, 8, 4);
            c0Var.A();
        } else {
            c0Var.E(-730619029);
            m174AvatarPlaceholderjxWH9Kg(a0Var2, avatarWrapper.getInitials(), j10, j11, avatarWrapper.getLabel(), c0Var, i10 & 14, 0);
            c0Var.A();
        }
        c0Var.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultAvatar_Rd90Nhg$lambda$10(AvatarWrapper avatarWrapper, a0 a0Var, q3 q3Var, boolean z10, long j10, q0 q0Var, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "$avatarWrapper");
        m175DefaultAvatarRd90Nhg(avatarWrapper, a0Var, q3Var, z10, j10, q0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long DefaultAvatar_Rd90Nhg$lambda$2(n3<q0> n3Var) {
        return n3Var.getValue().M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$3(n3<q0> n3Var, long j10) {
        n3Var.setValue(q0.n(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DefaultAvatar_Rd90Nhg$lambda$5(n3<androidx.compose.ui.unit.h> n3Var) {
        return n3Var.getValue().O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$6(n3<androidx.compose.ui.unit.h> n3Var, float f10) {
        n3Var.setValue(androidx.compose.ui.unit.h.o(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q3 DefaultAvatar_Rd90Nhg$lambda$8(n3<q3> n3Var) {
        return n3Var.getValue();
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void FinAvatar(a0 a0Var, final AvatarWrapper avatarWrapper, q3 q3Var, c0 c0Var, final int i10, final int i11) {
        q3 q3Var2;
        a0 a0Var2;
        c0 c0VarR = c0Var.R(-1375245291);
        a0 a0Var3 = (i11 & 1) != 0 ? a0.E : a0Var;
        q3 composeShape = (i11 & 4) != 0 ? getComposeShape(AvatarShape.SQUIRCLE) : q3Var;
        final a0 a0VarB2 = a0Var3.B2(androidx.compose.ui.draw.j.a(a0.E, composeShape));
        String imageUrl = avatarWrapper.getImageUrl(c0VarR, 8);
        if (StringsKt.w3(imageUrl)) {
            q3Var2 = composeShape;
            c0VarR.E(-445746825);
            a0Var2 = a0Var3;
            FinAvatarPlaceholder(avatarWrapper, a0VarB2, 0.0f, c0VarR, 8, 4);
            c0VarR.A();
        } else {
            c0VarR.E(-446445875);
            q3Var2 = composeShape;
            coil.compose.a0.f(imageUrl, avatarWrapper.getAvatar().getLabel(), IntercomImageLoaderKt.getImageLoader((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())), a0VarB2, null, w.e(-1294140715, true, new pj.o<coil.compose.c0, AsyncImagePainter.State.Loading, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.FinAvatar.1
                @Override // pj.o
                public /* bridge */ /* synthetic */ Unit invoke(coil.compose.c0 c0Var2, AsyncImagePainter.State.Loading loading, c0 c0Var3, Integer num) {
                    invoke(c0Var2, loading, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(coil.compose.c0 SubcomposeAsyncImage, AsyncImagePainter.State.Loading it, c0 c0Var2, int i12) {
                    Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i12 & 641) == 128 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        AvatarIconKt.FinAvatarPlaceholder(avatarWrapper, a0VarB2, 0.0f, c0Var2, 8, 4);
                    }
                }
            }, c0VarR, 54), null, w.e(-818047861, true, new pj.o<coil.compose.c0, AsyncImagePainter.State.Error, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.FinAvatar.2
                @Override // pj.o
                public /* bridge */ /* synthetic */ Unit invoke(coil.compose.c0 c0Var2, AsyncImagePainter.State.Error error, c0 c0Var3, Integer num) {
                    invoke(c0Var2, error, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(coil.compose.c0 SubcomposeAsyncImage, AsyncImagePainter.State.Error it, c0 c0Var2, int i12) {
                    Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i12 & 641) == 128 && c0Var2.d()) {
                        c0Var2.u();
                    } else {
                        AvatarIconKt.FinAvatarPlaceholder(avatarWrapper, a0VarB2, 0.0f, c0Var2, 8, 4);
                    }
                }
            }, c0VarR, 54), null, null, null, null, null, 0.0f, null, 0, false, null, c0VarR, 12780032, 0, 261968);
            c0VarR = c0VarR;
            c0VarR.A();
            a0Var2 = a0Var3;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final a0 a0Var4 = a0Var2;
            final q3 q3Var3 = q3Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.FinAvatar$lambda$11(a0Var4, avatarWrapper, q3Var3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAvatar$lambda$11(a0 a0Var, AvatarWrapper avatarWrapper, q3 q3Var, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "$avatarWrapper");
        FinAvatar(a0Var, avatarWrapper, q3Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void FinAvatarPlaceholder(final AvatarWrapper avatarWrapper, a0 a0Var, float f10, c0 c0Var, final int i10, final int i11) {
        c0 c0VarR = c0Var.R(-427803587);
        if ((i11 & 2) != 0) {
            a0Var = a0.E;
        }
        final a0 a0Var2 = a0Var;
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        final float f11 = f10;
        a0 a0VarD = androidx.compose.foundation.v.d(a0Var2, ColorExtensionsKt.m728darken8_81llA(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m684getAction0d7_KjU()), null, 2, null);
        a1 a1VarK = x.k(androidx.compose.ui.e.f37317a.i(), false);
        int iHashCode = Long.hashCode(v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        if (c0VarR.S() == null) {
            v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarK, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        d0 d0Var = d0.f15956a;
        BotAvatarPlaceholder(avatarWrapper, d5.r(a0.E, androidx.compose.ui.unit.h.r(4)), f11, c0VarR, (i10 & 896) | 56, 0);
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AvatarIconKt.FinAvatarPlaceholder$lambda$13(avatarWrapper, a0Var2, f11, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAvatarPlaceholder$lambda$13(AvatarWrapper avatarWrapper, a0 a0Var, float f10, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "$avatarWrapper");
        FinAvatarPlaceholder(avatarWrapper, a0Var, f10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @NotNull
    public static final a0 avatarBorder(@NotNull a0 a0Var, boolean z10, @NotNull q3 shape) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(shape, "shape");
        if (z10) {
            int i10 = 4 | 0;
            boolean z11 = true | false;
            a0Var = t0.k(a0Var, androidx.compose.ui.unit.h.r((float) 0.5d), i0.a.d(i0.f37796b, CollectionsKt.listOf((Object[]) new q0[]{q0.n(s0.b(androidx.media3.ui.f.F3)), q0.n(s0.b(androidx.media3.ui.f.F3))}), 0.0f, 0.0f, 0, 14, null), shape);
        }
        return a0Var;
    }

    @NotNull
    public static final androidx.compose.foundation.shape.n getComposeShape(@NotNull AvatarShape avatarShape) {
        Intrinsics.checkNotNullParameter(avatarShape, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[avatarShape.ordinal()];
        if (i10 == 1) {
            return androidx.compose.foundation.shape.o.c(50);
        }
        if (i10 == 2) {
            return androidx.compose.foundation.shape.o.c(16);
        }
        throw new k0();
    }
}
