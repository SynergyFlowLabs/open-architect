package io.intercom.android.sdk.m5.components.avatar;

import android.content.Context;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.v;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.t;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.m5.shapes.CutAvatarWithIndicatorShape;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAvatarIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarIcon.kt\nio/intercom/android/sdk/m5/components/avatar/AvatarIconKt$DefaultAvatar$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,454:1\n113#2:455\n70#3:456\n67#3,9:457\n77#3:515\n80#4,6:466\n87#4,3:481\n90#4,2:490\n94#4:514\n391#5,9:472\n400#5:492\n401#5,2:512\n4360#6,6:484\n75#7:493\n1282#8,6:494\n1282#8,6:500\n1282#8,6:506\n*S KotlinDebug\n*F\n+ 1 AvatarIcon.kt\nio/intercom/android/sdk/m5/components/avatar/AvatarIconKt$DefaultAvatar$1\n*L\n165#1:455\n171#1:456\n171#1:457,9\n171#1:515\n171#1:466,6\n171#1:481,3\n171#1:490,2\n171#1:514\n171#1:472,9\n171#1:492\n171#1:512,2\n171#1:484,6\n184#1:493\n195#1:494,6\n205#1:500,6\n200#1:506,6\n*E\n"})
final class AvatarIconKt$DefaultAvatar$1 implements pj.n<h0, c0, Integer, Unit> {
    final /* synthetic */ AvatarWrapper $avatarWrapper;
    final /* synthetic */ n3<q0> $backgroundColor$delegate;
    final /* synthetic */ q0 $customBackgroundColor;
    final /* synthetic */ n3<q3> $cutShape$delegate;
    final /* synthetic */ long $defaultBackgroundColor;
    final /* synthetic */ n3<androidx.compose.ui.unit.h> $indicatorSize$delegate;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ long $placeHolderTextSize;
    final /* synthetic */ q3 $shape;
    final /* synthetic */ boolean $shouldDrawBorder;
    final /* synthetic */ long $textColor;

    AvatarIconKt$DefaultAvatar$1(boolean z10, q3 q3Var, boolean z11, n3<androidx.compose.ui.unit.h> n3Var, n3<q3> n3Var2, n3<q0> n3Var3, AvatarWrapper avatarWrapper, long j10, q0 q0Var, long j11, long j12) {
        this.$isActive = z10;
        this.$shape = q3Var;
        this.$shouldDrawBorder = z11;
        this.$indicatorSize$delegate = n3Var;
        this.$cutShape$delegate = n3Var2;
        this.$backgroundColor$delegate = n3Var3;
        this.$avatarWrapper = avatarWrapper;
        this.$defaultBackgroundColor = j10;
        this.$customBackgroundColor = q0Var;
        this.$textColor = j11;
        this.$placeHolderTextSize = j12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$1$lambda$0(long j10, n3 backgroundColor$delegate, AsyncImagePainter.State.Loading it) {
        Intrinsics.checkNotNullParameter(backgroundColor$delegate, "$backgroundColor$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        if (q0.y(AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(backgroundColor$delegate), q0.f38131b.s())) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(backgroundColor$delegate, j10);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$3$lambda$2(q0 q0Var, long j10, n3 backgroundColor$delegate, AsyncImagePainter.State.Success it) {
        Intrinsics.checkNotNullParameter(backgroundColor$delegate, "$backgroundColor$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(backgroundColor$delegate, q0Var != null ? q0Var.M() : ColorExtensionsKt.m728darken8_81llA(j10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(long j10, n3 backgroundColor$delegate, AsyncImagePainter.State.Error it) {
        Intrinsics.checkNotNullParameter(backgroundColor$delegate, "$backgroundColor$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        if (q0.y(AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(backgroundColor$delegate), q0.f38131b.s())) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$3(backgroundColor$delegate, j10);
        }
        return Unit.f312394a;
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Unit invoke(h0 h0Var, c0 c0Var, Integer num) {
        invoke(h0Var, c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(h0 BoxWithConstraints, c0 c0Var, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = i10 | (c0Var.D(BoxWithConstraints) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) == 18 && c0Var.d()) {
            c0Var.u();
            return;
        }
        if (this.$isActive) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$6(this.$indicatorSize$delegate, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.q(BoxWithConstraints.c(), androidx.compose.ui.unit.h.r((float) 36)) > 0 ? 16 : 8));
            this.$cutShape$delegate.setValue(new CutAvatarWithIndicatorShape(this.$shape, AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$5(this.$indicatorSize$delegate), null));
        } else {
            this.$cutShape$delegate.setValue(this.$shape);
        }
        a0.a aVar = a0.E;
        a0 a0VarA = androidx.compose.ui.draw.j.a(AvatarIconKt.avatarBorder(v.c(BoxWithConstraints.j(aVar), AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$2(this.$backgroundColor$delegate), AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate)), this.$shouldDrawBorder, AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate)), AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$8(this.$cutShape$delegate));
        final AvatarWrapper avatarWrapper = this.$avatarWrapper;
        final long j10 = this.$defaultBackgroundColor;
        final q0 q0Var = this.$customBackgroundColor;
        final long j11 = this.$textColor;
        final long j12 = this.$placeHolderTextSize;
        final n3<q0> n3Var = this.$backgroundColor$delegate;
        androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
        a1 a1VarK = x.k(aVar2.C(), false);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        b1 b1VarK = c0Var.k();
        a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
        if (c0Var.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var.q();
        if (c0Var.P()) {
            c0Var.q0(function0A);
        } else {
            c0Var.l();
        }
        c0 c0VarD = y7.d(c0Var);
        y7.n(c0VarD, a1VarK, aVar3.e());
        y7.n(c0VarD, b1VarK, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar3.f());
        d0 d0Var = d0.f15956a;
        String imageUrl = avatarWrapper.getImageUrl(c0Var, 8);
        a0 a0VarF = i6.f(d0Var.b(aVar, aVar2.i()), 0.0f, 1, null);
        String label = avatarWrapper.getLabel();
        coil.j imageLoader = IntercomImageLoaderKt.getImageLoader((Context) c0Var.W(AndroidCompositionLocals_androidKt.g()));
        androidx.compose.ui.layout.l lVarA = androidx.compose.ui.layout.l.f39405a.a();
        androidx.compose.runtime.internal.c cVarE = w.e(-1513639009, true, new pj.o<coil.compose.c0, AsyncImagePainter.State.Loading, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$1
            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(coil.compose.c0 c0Var2, AsyncImagePainter.State.Loading loading, c0 c0Var3, Integer num) {
                invoke(c0Var2, loading, c0Var3, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(coil.compose.c0 SubcomposeAsyncImage, AsyncImagePainter.State.Loading it, c0 c0Var2, int i12) {
                int i13;
                Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i12 & 14) == 0) {
                    if (c0Var2.D(SubcomposeAsyncImage)) {
                        i13 = 4;
                        int i14 = 7 << 4;
                    } else {
                        i13 = 2;
                    }
                    i12 |= i13;
                }
                if ((i12 & 651) == 130 && c0Var2.d()) {
                    c0Var2.u();
                } else {
                    AvatarIconKt.DefaultAvatar_Rd90Nhg$Placeholder(avatarWrapper, j11, j12, SubcomposeAsyncImage.b(a0.E, androidx.compose.ui.e.f37317a.i()), c0Var2, 0, 0);
                }
            }
        }, c0Var, 54);
        androidx.compose.runtime.internal.c cVarE2 = w.e(427755177, true, new pj.o<coil.compose.c0, AsyncImagePainter.State.Error, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$DefaultAvatar$1$1$2
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
                if ((i12 & 14) == 0) {
                    i12 |= c0Var2.D(SubcomposeAsyncImage) ? 4 : 2;
                }
                if ((i12 & 651) == 130 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                AvatarIconKt.DefaultAvatar_Rd90Nhg$Placeholder(avatarWrapper, j11, j12, SubcomposeAsyncImage.b(a0.E, androidx.compose.ui.e.f37317a.i()), c0Var2, 0, 0);
            }
        }, c0Var, 54);
        c0Var.E(1981535699);
        boolean zL = c0Var.L(j10);
        Object objI0 = c0Var.i0();
        if (zL || objI0 == c0.f35327a.a()) {
            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$1$lambda$0(j10, n3Var, (AsyncImagePainter.State.Loading) obj);
                }
            };
            c0Var.Y(objI0);
        }
        Function1 function1 = (Function1) objI0;
        c0Var.A();
        c0Var.E(1981548379);
        boolean zD = c0Var.D(q0Var) | c0Var.L(j10);
        Object objI1 = c0Var.i0();
        if (zD || objI1 == c0.f35327a.a()) {
            objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$3$lambda$2(q0Var, j10, n3Var, (AsyncImagePainter.State.Success) obj);
                }
            };
            c0Var.Y(objI1);
        }
        Function1 function2 = (Function1) objI1;
        c0Var.A();
        c0Var.E(1981542035);
        boolean zL2 = c0Var.L(j10);
        Object objI2 = c0Var.i0();
        if (zL2 || objI2 == c0.f35327a.a()) {
            objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AvatarIconKt$DefaultAvatar$1.invoke$lambda$6$lambda$5$lambda$4(j10, n3Var, (AsyncImagePainter.State.Error) obj);
                }
            };
            c0Var.Y(objI2);
        }
        c0Var.A();
        coil.compose.a0.f(imageUrl, label, imageLoader, a0VarF, null, cVarE, null, cVarE2, function1, function2, (Function1) objI2, null, lVarA, 0.0f, null, 0, false, null, c0Var, 12780032, a5.S0, 256080);
        c0Var.o();
        if (this.$isActive) {
            AvatarIconKt.AvatarActiveIndicator(BoxWithConstraints.b(i6.w(aVar, AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$5(this.$indicatorSize$delegate)), aVar2.e()), c0Var, 0, 0);
        }
    }
}
