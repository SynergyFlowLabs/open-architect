package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.g4;
import androidx.compose.runtime.h6;
import androidx.compose.runtime.k3;
import androidx.compose.runtime.m3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSoundWaveVisualization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoundWaveVisualization.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/SoundWaveVisualizationKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 10 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 13 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,549:1\n75#2:550\n75#2:552\n113#3:551\n113#3:557\n113#3:558\n113#3:559\n113#3:613\n1#4:553\n1282#5,3:554\n1285#5,3:560\n1282#5,6:563\n1282#5,6:569\n1282#5,6:575\n1282#5,6:581\n1282#5,6:587\n1282#5,6:593\n1282#5,6:599\n1282#5,3:605\n1285#5,3:610\n1863#6,2:608\n1863#6:618\n1864#6:631\n33#7:614\n53#8,3:615\n53#8,3:620\n53#8,3:624\n53#8,3:628\n60#8:649\n60#8:652\n70#8:655\n30#9:619\n30#9:623\n33#10:627\n85#11:632\n81#12:633\n114#12,2:634\n81#12:642\n114#12,2:643\n81#12:645\n114#12,2:646\n79#13:636\n112#13,2:637\n79#13:639\n112#13,2:640\n57#14:648\n57#14:651\n61#14:654\n22#15:650\n22#15:653\n22#15:656\n*S KotlinDebug\n*F\n+ 1 SoundWaveVisualization.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/SoundWaveVisualizationKt\n*L\n279#1:550\n287#1:552\n286#1:551\n296#1:557\n297#1:558\n298#1:559\n420#1:613\n294#1:554,3\n294#1:560,3\n306#1:563,6\n309#1:569,6\n310#1:575,6\n311#1:581,6\n325#1:587,6\n326#1:593,6\n329#1:599,6\n390#1:605,3\n390#1:610,3\n396#1:608,2\n467#1:618\n467#1:631\n465#1:614\n465#1:615,3\n486#1:620,3\n498#1:624,3\n499#1:628,3\n423#1:649\n429#1:652\n430#1:655\n486#1:619\n498#1:623\n499#1:627\n278#1:632\n309#1:633\n309#1:634,2\n325#1:642\n325#1:643,2\n326#1:645\n326#1:646,2\n310#1:636\n310#1:637,2\n311#1:639\n311#1:640,2\n423#1:648\n429#1:651\n430#1:654\n423#1:650\n429#1:653\n430#1:656\n*E\n"})
public final class SoundWaveVisualizationKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
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
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: SoundWaveVisualization-FNF3uiM, reason: not valid java name */
    public static final void m269SoundWaveVisualizationFNF3uiM(@NotNull final kotlinx.coroutines.flow.z0<Float> amplitudeLevel, @Nullable androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Object soundWaveVisualizationKt$SoundWaveVisualization$2$1;
        DrawingConstants drawingConstants;
        k3 k3Var;
        long j11;
        DrawingConstants drawingConstants2;
        List listEmptyList;
        Intrinsics.checkNotNullParameter(amplitudeLevel, "amplitudeLevel");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2042015142);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        long jM699getDescriptionText0d7_KjU = (i11 & 4) != 0 ? IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU() : j10;
        n7 n7VarB = w6.b(amplitudeLevel, null, c0VarR, 8, 1);
        final androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) c0VarR.W(androidx.compose.ui.platform.q1.u());
        float fS7 = ((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(androidx.compose.ui.unit.h.r(4));
        float f10 = fS7 / 150;
        c0VarR.E(-1478395137);
        Object objI0 = c0VarR.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            DrawingConstants drawingConstants3 = new DrawingConstants(androidx.compose.ui.unit.h.r(2), androidx.compose.ui.unit.h.r(1), androidx.compose.ui.unit.h.r(3), 0.05f, 0.02f, 0.3f, null);
            c0VarR.Y(drawingConstants3);
            objI0 = drawingConstants3;
        }
        DrawingConstants drawingConstants4 = (DrawingConstants) objI0;
        c0VarR.A();
        c0VarR.E(-1478380880);
        Object objI1 = c0VarR.i0();
        if (objI1 == aVar.a()) {
            objI1 = new WaveformBuffer(0, 1, null);
            c0VarR.Y(objI1);
        }
        WaveformBuffer waveformBuffer = (WaveformBuffer) objI1;
        c0VarR.A();
        c0VarR.E(-1478377801);
        Object objI2 = c0VarR.i0();
        if (objI2 == aVar.a()) {
            objI2 = g4.b(0.0f);
            c0VarR.Y(objI2);
        }
        final k3 k3Var2 = (k3) objI2;
        c0VarR.A();
        c0VarR.E(-1478375434);
        Object objI3 = c0VarR.i0();
        if (objI3 == aVar.a()) {
            objI3 = h6.b(0L);
            c0VarR.Y(objI3);
        }
        m3 m3Var = (m3) objI3;
        c0VarR.A();
        c0VarR.E(-1478373226);
        Object objI4 = c0VarR.i0();
        if (objI4 == aVar.a()) {
            objI4 = h6.b(0L);
            c0VarR.Y(objI4);
        }
        m3 m3Var2 = (m3) objI4;
        c0VarR.A();
        androidx.compose.runtime.b2.i(Float.valueOf(k3Var2.V0()), new SoundWaveVisualizationKt$SoundWaveVisualization$1(fS7, waveformBuffer, k3Var2, null), c0VarR, 64);
        c0VarR.E(-1478357257);
        Object objI5 = c0VarR.i0();
        if (objI5 == aVar.a()) {
            objI5 = g4.b(0.0f);
            c0VarR.Y(objI5);
        }
        k3 k3Var3 = (k3) objI5;
        c0VarR.A();
        c0VarR.E(-1478355177);
        Object objI6 = c0VarR.i0();
        if (objI6 == aVar.a()) {
            objI6 = g4.b(0.0f);
            c0VarR.Y(objI6);
        }
        k3 k3Var4 = (k3) objI6;
        c0VarR.A();
        Float fValueOf = Float.valueOf(SoundWaveVisualization_FNF3uiM$lambda$0(n7VarB));
        c0VarR.E(-1478350126);
        boolean zD = c0VarR.D(n7VarB);
        Object objI7 = c0VarR.i0();
        if (zD || objI7 == aVar.a()) {
            drawingConstants = drawingConstants4;
            k3Var = k3Var3;
            j11 = 150;
            soundWaveVisualizationKt$SoundWaveVisualization$2$1 = new SoundWaveVisualizationKt$SoundWaveVisualization$2$1(drawingConstants, n7VarB, k3Var4, k3Var, null);
            c0VarR.Y(soundWaveVisualizationKt$SoundWaveVisualization$2$1);
        } else {
            drawingConstants = drawingConstants4;
            k3Var = k3Var3;
            j11 = 150;
            soundWaveVisualizationKt$SoundWaveVisualization$2$1 = objI7;
        }
        c0VarR.A();
        androidx.compose.runtime.b2.i(fValueOf, (Function2) soundWaveVisualizationKt$SoundWaveVisualization$2$1, c0VarR, 64);
        Unit unit = Unit.f312394a;
        androidx.compose.runtime.b2.i(unit, new SoundWaveVisualizationKt$SoundWaveVisualization$3(j11, waveformBuffer, k3Var2, m3Var, k3Var, null), c0VarR, 70);
        androidx.compose.runtime.b2.i(unit, new SoundWaveVisualizationKt$SoundWaveVisualization$4(fS7, f10, waveformBuffer, 16L, k3Var2, m3Var2, null), c0VarR, 70);
        float fV0 = k3Var2.V0();
        long jE = m3Var2.e();
        c0VarR.E(-1478260980);
        boolean zI = c0VarR.I(fV0) | c0VarR.L(jE);
        Object objI8 = c0VarR.i0();
        if (zI || objI8 == aVar.a()) {
            if (k3Var2.V0() > r28) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                listEmptyList = new ArrayList();
                for (WaveformElement waveformElement : waveformBuffer.getAllElements()) {
                    DrawingConstants drawingConstants5 = drawingConstants;
                    float timestamp = (jCurrentTimeMillis - waveformElement.getTimestamp()) * f10;
                    if (timestamp <= k3Var2.V0() + fS7) {
                        listEmptyList.add(WaveformElement.copy$default(waveformElement, timestamp, 0.0f, 0L, 6, null));
                    }
                    drawingConstants = drawingConstants5;
                }
                drawingConstants2 = drawingConstants;
            } else {
                drawingConstants2 = drawingConstants;
                listEmptyList = CollectionsKt.emptyList();
            }
            objI8 = listEmptyList;
            c0VarR.Y(objI8);
        } else {
            drawingConstants2 = drawingConstants;
        }
        final List list = (List) objI8;
        c0VarR.A();
        final DrawingConstants drawingConstants6 = drawingConstants2;
        final long j12 = jM699getDescriptionText0d7_KjU;
        androidx.compose.foundation.f1.e(i6.i(i6.h(a0Var2, 0.0f, 1, null), androidx.compose.ui.unit.h.r(24)), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.l2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$22(list, j12, drawingConstants6, wVar, k3Var2, (androidx.compose.ui.graphics.drawscope.f) obj);
            }
        }, c0VarR, 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.m2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$23(amplitudeLevel, a0Var2, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void SoundWaveVisualizationLowAmplitudePreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1762579162);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SoundWaveVisualizationKt.INSTANCE.m256getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.k2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SoundWaveVisualizationKt.SoundWaveVisualizationLowAmplitudePreview$lambda$26(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoundWaveVisualizationLowAmplitudePreview$lambda$26(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SoundWaveVisualizationLowAmplitudePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void SoundWaveVisualizationPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(888011189);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SoundWaveVisualizationKt.INSTANCE.m255getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.n2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SoundWaveVisualizationKt.SoundWaveVisualizationPreview$lambda$25(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoundWaveVisualizationPreview$lambda$25(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SoundWaveVisualizationPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void SoundWaveVisualizationRtlPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-436763649);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SoundWaveVisualizationKt.INSTANCE.m257getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.o2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SoundWaveVisualizationKt.SoundWaveVisualizationRtlPreview$lambda$27(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoundWaveVisualizationRtlPreview$lambda$27(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SoundWaveVisualizationRtlPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SoundWaveVisualization_FNF3uiM$lambda$0(n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoundWaveVisualization_FNF3uiM$lambda$22(List currentElements, long j10, DrawingConstants drawingConstants, androidx.compose.ui.unit.w layoutDirection, k3 canvasWidth$delegate, androidx.compose.ui.graphics.drawscope.f Canvas) {
        Intrinsics.checkNotNullParameter(currentElements, "$currentElements");
        Intrinsics.checkNotNullParameter(drawingConstants, "$drawingConstants");
        Intrinsics.checkNotNullParameter(layoutDirection, "$layoutDirection");
        Intrinsics.checkNotNullParameter(canvasWidth$delegate, "$canvasWidth$delegate");
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        canvasWidth$delegate.q(Float.intBitsToFloat((int) (Canvas.d() >> 32)));
        m270drawWaveformElementscf5BqRc(Canvas, currentElements, j10, drawingConstants, Float.intBitsToFloat((int) (Canvas.d() >> 32)), Float.intBitsToFloat((int) (Canvas.d() & com.rabbitmq.client.k0.f265952a)), layoutDirection);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoundWaveVisualization_FNF3uiM$lambda$23(kotlinx.coroutines.flow.z0 amplitudeLevel, androidx.compose.ui.a0 a0Var, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(amplitudeLevel, "$amplitudeLevel");
        m269SoundWaveVisualizationFNF3uiM(amplitudeLevel, a0Var, j10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    public static final int calculateOptimalBufferSize(float f10, float f11) {
        if (f10 <= 0.0f || f11 <= 0.0f) {
            return 70;
        }
        return kotlin.ranges.r.I((int) (((int) (f10 / f11)) * 1.5f), 50, 200);
    }

    /* JADX INFO: renamed from: drawWaveformElements-cf5BqRc, reason: not valid java name */
    private static final void m270drawWaveformElementscf5BqRc(androidx.compose.ui.graphics.drawscope.f fVar, List<WaveformElement> list, long j10, DrawingConstants drawingConstants, float f10, float f11, androidx.compose.ui.unit.w wVar) {
        float x10;
        if (list.isEmpty()) {
            return;
        }
        DrawingConstantsPx px = drawingConstants.toPx(fVar.getDensity());
        float f12 = f11 * 0.5f;
        float barWidth = px.getBarWidth() * 0.5f;
        long jE = n0.a.e((((long) Float.floatToRawIntBits(px.getBarWidth() * 0.5f)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(barWidth) << 32));
        for (WaveformElement waveformElement : list) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[wVar.ordinal()];
            if (i10 == 1) {
                x10 = f10 - waveformElement.getX();
            } else {
                if (i10 != 2) {
                    throw new kotlin.k0();
                }
                x10 = waveformElement.getX();
            }
            if (x10 >= (-px.getBarWidth()) && x10 <= f10 + px.getBarWidth()) {
                if (waveformElement.getAmplitude() < px.getAmplitudeThreshold()) {
                    androidx.compose.ui.graphics.drawscope.f.B4(fVar, j10, px.getDotRadius(), n0.g.g((((long) Float.floatToRawIntBits(x10)) << 32) | (((long) Float.floatToRawIntBits(f12)) & com.rabbitmq.client.k0.f265952a)), 0.0f, null, null, 0, 120, null);
                } else {
                    float fMax = Math.max(px.getMinBarHeight(), Math.min(f11, waveformElement.getAmplitude() * f11));
                    androidx.compose.ui.graphics.drawscope.f.y8(fVar, j10, n0.g.g((((long) Float.floatToRawIntBits(f12 - (fMax * 0.5f))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(x10 - (px.getBarWidth() * 0.5f)) << 32)), n0.n.f((((long) Float.floatToRawIntBits(px.getBarWidth())) << 32) | (((long) Float.floatToRawIntBits(fMax)) & com.rabbitmq.client.k0.f265952a)), jE, null, 0.0f, null, 0, 240, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scaleAmplitudeForVisualization(float f10) {
        float f11 = f10 * f10;
        return Math.min(1.0f, (f11 / (0.2f + f11)) * 1.6f);
    }
}
