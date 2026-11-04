package io.intercom.android.sdk.m5.conversation.ui.components;

import android.net.Uri;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.z2;
import androidx.compose.material3.gt;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import io.intercom.android.sdk.ui.component.MediaType;
import java.util.List;
import java.util.Set;
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
@SourceDebugExtension({"SMAP\nMediaInputSheetContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaInputSheetContent.kt\nio/intercom/android/sdk/m5/conversation/ui/components/MediaInputSheetContentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,142:1\n87#2:143\n84#2,9:144\n94#2:243\n80#3,6:153\n87#3,3:168\n90#3,2:177\n94#3:242\n80#3,6:255\n87#3,3:270\n90#3,2:279\n94#3:286\n391#4,9:159\n400#4:179\n401#4,2:240\n391#4,9:261\n400#4:281\n401#4,2:284\n4360#5,6:171\n4360#5,6:273\n1282#6,6:180\n1282#6,6:186\n1282#6,6:192\n1282#6,6:198\n1282#6,6:204\n1282#6,6:210\n1282#6,6:216\n1282#6,6:222\n1282#6,6:228\n1282#6,6:234\n113#7:244\n113#7:282\n113#7:283\n99#8:245\n96#8,9:246\n106#8:287\n*S KotlinDebug\n*F\n+ 1 MediaInputSheetContent.kt\nio/intercom/android/sdk/m5/conversation/ui/components/MediaInputSheetContentKt\n*L\n38#1:143\n38#1:144,9\n38#1:243\n38#1:153,6\n38#1:168,3\n38#1:177,2\n38#1:242\n126#1:255,6\n126#1:270,3\n126#1:279,2\n126#1:286\n38#1:159,9\n38#1:179\n38#1:240,2\n126#1:261,9\n126#1:281\n126#1:284,2\n38#1:171,6\n126#1:273,6\n43#1:180,6\n46#1:186,6\n49#1:192,6\n61#1:198,6\n64#1:204,6\n67#1:210,6\n82#1:216,6\n87#1:222,6\n102#1:228,6\n107#1:234,6\n128#1:244\n134#1:282\n138#1:283\n126#1:245\n126#1:246,9\n126#1:287\n*E\n"})
public final class MediaInputSheetContentKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MediaInputSheetContent(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final Function1<? super List<? extends Uri>, Unit> onMediaSelected, @NotNull final Function0<Unit> dismissSheet, @NotNull final Function1<? super String, Unit> trackClickedInput, @NotNull final InputTypeState inputTypeState, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final Function0<Unit> function0;
        boolean z10;
        int i12;
        Intrinsics.checkNotNullParameter(onMediaSelected, "onMediaSelected");
        Intrinsics.checkNotNullParameter(dismissSheet, "dismissSheet");
        Intrinsics.checkNotNullParameter(trackClickedInput, "trackClickedInput");
        Intrinsics.checkNotNullParameter(inputTypeState, "inputTypeState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-842940445);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
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
        y7.n(c0VarD, a1VarB, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        c0VarR.E(-1878694694);
        c0VarR.E(-1878695438);
        boolean z11 = true;
        if (inputTypeState.getCameraInputEnabled()) {
            CameraInputType cameraInputType = CameraInputType.PHOTO;
            c0VarR.E(2017624231);
            int i13 = (i10 & com.planner5d.library.engine.input.f.b.B) ^ 48;
            boolean z12 = (i13 > 32 && c0VarR.D(onMediaSelected)) || (i10 & 48) == 32;
            Object objI0 = c0VarR.i0();
            if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.f1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0(onMediaSelected, (Uri) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            Function1 function1 = (Function1) objI0;
            c0VarR.A();
            c0VarR.E(2017628249);
            int i14 = (i10 & 7168) ^ 3072;
            boolean z13 = (i14 > 2048 && c0VarR.D(trackClickedInput)) || (i10 & 3072) == 2048;
            Object objI1 = c0VarR.i0();
            if (z13 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2(trackClickedInput);
                    }
                };
                c0VarR.Y(objI1);
            }
            Function0 function2 = (Function0) objI1;
            c0VarR.A();
            c0VarR.E(2017632787);
            int i15 = (i10 & 896) ^ a5.S0;
            boolean z14 = (i15 > 256 && c0VarR.D(dismissSheet)) || (i10 & a5.S0) == 256;
            Object objI2 = c0VarR.i0();
            if (z14 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4(dismissSheet);
                    }
                };
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            ComposableSingletons$MediaInputSheetContentKt composableSingletons$MediaInputSheetContentKt = ComposableSingletons$MediaInputSheetContentKt.INSTANCE;
            i12 = 32;
            z10 = false;
            CameraInputButtonKt.CameraInputButton(null, cameraInputType, function1, function2, (Function0) objI2, composableSingletons$MediaInputSheetContentKt.m209getLambda1$intercom_sdk_base_release(), c0VarR, 196656, 1);
            CameraInputType cameraInputType2 = CameraInputType.VIDEO;
            c0VarR.E(2017647079);
            boolean z15 = (i13 > 32 && c0VarR.D(onMediaSelected)) || (i10 & 48) == 32;
            Object objI3 = c0VarR.i0();
            if (z15 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.j1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6(onMediaSelected, (Uri) obj);
                    }
                };
                c0VarR.Y(objI3);
            }
            Function1 function3 = (Function1) objI3;
            c0VarR.A();
            c0VarR.E(2017651097);
            boolean z16 = (i14 > 2048 && c0VarR.D(trackClickedInput)) || (i10 & 3072) == 2048;
            Object objI4 = c0VarR.i0();
            if (z16 || objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                objI4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.k1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8(trackClickedInput);
                    }
                };
                c0VarR.Y(objI4);
            }
            Function0 function4 = (Function0) objI4;
            c0VarR.A();
            c0VarR.E(2017655635);
            function0 = dismissSheet;
            boolean z17 = (i15 > 256 && c0VarR.D(function0)) || (i10 & a5.S0) == 256;
            Object objI5 = c0VarR.i0();
            if (z17 || objI5 == androidx.compose.runtime.c0.f35327a.a()) {
                objI5 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10(function0);
                    }
                };
                c0VarR.Y(objI5);
            }
            c0VarR.A();
            CameraInputButtonKt.CameraInputButton(null, cameraInputType2, function3, function4, (Function0) objI5, composableSingletons$MediaInputSheetContentKt.m210getLambda2$intercom_sdk_base_release(), c0VarR, 196656, 1);
        } else {
            function0 = dismissSheet;
            z10 = false;
            i12 = 32;
        }
        c0VarR.A();
        c0VarR.E(-1878648653);
        if (inputTypeState.getMediaInputEnabled()) {
            MediaType mediaType = MediaType.ImageAndVideo;
            Set<String> trustedFileExtensions = inputTypeState.getTrustedFileExtensions();
            MediaPickerButtonCTAStyle.TopBarButton topBarButton = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
            z2 z2VarE = gt.e(true, 0.0f, 0L, 6, null);
            c0VarR.E(2017674808);
            boolean z18 = ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= i12 || !c0VarR.D(onMediaSelected)) && (i10 & 48) != i12) ? z10 : true;
            Object objI6 = c0VarR.i0();
            if (z18 || objI6 == androidx.compose.runtime.c0.f35327a.a()) {
                objI6 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.m1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(onMediaSelected, (List) obj);
                    }
                };
                c0VarR.Y(objI6);
            }
            Function1 function5 = (Function1) objI6;
            c0VarR.A();
            c0VarR.E(2017682648);
            boolean z19 = ((((i10 & 7168) ^ 3072) <= 2048 || !c0VarR.D(trackClickedInput)) && (i10 & 3072) != 2048) ? z10 : true;
            Object objI7 = c0VarR.i0();
            if (z19 || objI7 == androidx.compose.runtime.c0.f35327a.a()) {
                objI7 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14(trackClickedInput);
                    }
                };
                c0VarR.Y(objI7);
            }
            c0VarR.A();
            MediaPickerButtonKt.MediaPickerButton(1, z2VarE, mediaType, trustedFileExtensions, function5, topBarButton, (Function0) objI7, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m211getLambda3$intercom_sdk_base_release(), c0VarR, (MediaPickerButtonCTAStyle.TopBarButton.$stable << 15) | 12587446, 0);
            c0VarR = c0VarR;
        }
        c0VarR.A();
        c0VarR.E(-1878620614);
        if (inputTypeState.getFileInputEnabled()) {
            MediaType mediaType2 = MediaType.DocumentOnly;
            Set<String> trustedFileExtensions2 = inputTypeState.getTrustedFileExtensions();
            MediaPickerButtonCTAStyle.TopBarButton topBarButton2 = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
            z2 z2VarE2 = gt.e(true, 0.0f, 0L, 6, null);
            c0VarR.E(2017704824);
            boolean z20 = ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= i12 || !c0VarR.D(onMediaSelected)) && (i10 & 48) != i12) ? z10 : true;
            Object objI8 = c0VarR.i0();
            if (z20 || objI8 == androidx.compose.runtime.c0.f35327a.a()) {
                objI8 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.d1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(onMediaSelected, (List) obj);
                    }
                };
                c0VarR.Y(objI8);
            }
            Function1 function6 = (Function1) objI8;
            c0VarR.A();
            c0VarR.E(2017712663);
            if ((((i10 & 7168) ^ 3072) <= 2048 || !c0VarR.D(trackClickedInput)) && (i10 & 3072) != 2048) {
                z11 = z10;
            }
            Object objI9 = c0VarR.i0();
            if (z11 || objI9 == androidx.compose.runtime.c0.f35327a.a()) {
                objI9 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.e1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18(trackClickedInput);
                    }
                };
                c0VarR.Y(objI9);
            }
            c0VarR.A();
            androidx.compose.runtime.c0 c0Var2 = c0VarR;
            MediaPickerButtonKt.MediaPickerButton(1, z2VarE2, mediaType2, trustedFileExtensions2, function6, topBarButton2, (Function0) objI9, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m212getLambda4$intercom_sdk_base_release(), c0Var2, (MediaPickerButtonCTAStyle.TopBarButton.$stable << 15) | 12587446, 0);
            c0VarR = c0Var2;
        }
        c0VarR.A();
        Unit unit = Unit.f312394a;
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Function0<Unit> function7 = function0;
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.g1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MediaInputSheetContentKt.MediaInputSheetContent$lambda$22(a0Var3, onMediaSelected, function7, trackClickedInput, inputTypeState, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0(Function1 onMediaSelected, Uri uri) {
        Intrinsics.checkNotNullParameter(onMediaSelected, "$onMediaSelected");
        onMediaSelected.invoke(CollectionsKt.listOfNotNull(uri));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10(Function0 dismissSheet) {
        Intrinsics.checkNotNullParameter(dismissSheet, "$dismissSheet");
        dismissSheet.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(Function1 onMediaSelected, List it) {
        Intrinsics.checkNotNullParameter(onMediaSelected, "$onMediaSelected");
        Intrinsics.checkNotNullParameter(it, "it");
        onMediaSelected.invoke(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14(Function1 trackClickedInput) {
        Intrinsics.checkNotNullParameter(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.IMAGE_INPUT);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(Function1 onMediaSelected, List it) {
        Intrinsics.checkNotNullParameter(onMediaSelected, "$onMediaSelected");
        Intrinsics.checkNotNullParameter(it, "it");
        onMediaSelected.invoke(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18(Function1 trackClickedInput) {
        Intrinsics.checkNotNullParameter(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.FILE_INPUT);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2(Function1 trackClickedInput) {
        Intrinsics.checkNotNullParameter(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.CAMERA_INPUT);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4(Function0 dismissSheet) {
        Intrinsics.checkNotNullParameter(dismissSheet, "$dismissSheet");
        dismissSheet.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6(Function1 onMediaSelected, Uri uri) {
        Intrinsics.checkNotNullParameter(onMediaSelected, "$onMediaSelected");
        onMediaSelected.invoke(CollectionsKt.listOfNotNull(uri));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8(Function1 trackClickedInput) {
        Intrinsics.checkNotNullParameter(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.CAMERA_INPUT);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$22(androidx.compose.ui.a0 a0Var, Function1 onMediaSelected, Function0 dismissSheet, Function1 trackClickedInput, InputTypeState inputTypeState, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(onMediaSelected, "$onMediaSelected");
        Intrinsics.checkNotNullParameter(dismissSheet, "$dismissSheet");
        Intrinsics.checkNotNullParameter(trackClickedInput, "$trackClickedInput");
        Intrinsics.checkNotNullParameter(inputTypeState, "$inputTypeState");
        MediaInputSheetContent(a0Var, onMediaSelected, dismissSheet, trackClickedInput, inputTypeState, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MediaInputSheetContentItem(final String str, @androidx.annotation.v final int i10, androidx.compose.runtime.c0 c0Var, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-181831684);
        if ((i11 & 14) == 0) {
            i12 = i11 | (c0VarR.D(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.K(i10) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
        } else {
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarH = i6.h(i6.i(aVar, androidx.compose.ui.unit.h.r(56)), 0.0f, 1, null);
            androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
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
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            ni.o(u0.e.c(i10, c0VarR, (i12 >> 3) & 14), null, i6.w(aVar, androidx.compose.ui.unit.h.r(24)), 0L, c0VarR, 440, 8);
            l6.a(i6.B(aVar, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            c0Var2 = c0VarR;
            q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, i12 & 14, 0, 262142);
            c0Var2.o();
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.c1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MediaInputSheetContentKt.MediaInputSheetContentItem$lambda$24(str, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContentItem$lambda$24(String text, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        MediaInputSheetContentItem(text, i10, c0Var, t4.a(i11 | 1));
        return Unit.f312394a;
    }
}
