package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.util.Patterns;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.s2;
import androidx.compose.material3.os;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.t0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nVideoFileBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoFileBlock.kt\nio/intercom/android/sdk/survey/block/VideoFileBlockKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,91:1\n75#2:92\n70#3:93\n67#3,9:94\n77#3:136\n80#4,6:103\n87#4,3:118\n90#4,2:127\n94#4:135\n391#5,9:109\n400#5:129\n401#5,2:133\n4360#6,6:121\n113#7:130\n113#7:131\n113#7:132\n*S KotlinDebug\n*F\n+ 1 VideoFileBlock.kt\nio/intercom/android/sdk/survey/block/VideoFileBlockKt\n*L\n34#1:92\n46#1:93\n46#1:94,9\n46#1:136\n46#1:103,6\n46#1:118,3\n46#1:127,2\n46#1:135\n46#1:109,9\n46#1:129\n46#1:133,2\n46#1:121,6\n58#1:130\n72#1:131\n83#1:132\n*E\n"})
public final class VideoFileBlockKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void VideoFileBlock(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String videoUrl, @Nullable final String str, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-224511788);
        int i13 = i11 & 1;
        if (i13 != 0) {
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
            i12 |= c0VarR.D(videoUrl) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.D(str) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0 a0Var3 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            coil.request.i.a aVarJ = new coil.request.i.a(context).j((str == null || str.length() == 0) ? videoUrl : str);
            aVarJ.i(true);
            aVarJ.r(R.drawable.intercom_image_load_failed);
            AsyncImagePainter asyncImagePainterC = coil.compose.g.c(aVarJ.f(), IntercomImageLoaderKt.getImageLoader(context), null, null, null, 0, null, c0VarR, 72, 124);
            androidx.compose.ui.a0 a0VarJ = i1.j(a0Var3, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.block.r0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VideoFileBlockKt.VideoFileBlock$lambda$1(videoUrl, context);
                }
            }, 15, null);
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            float[] fArrC = t0.c(null, 1, null);
            t0.r(fArrC, 0.0f);
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarY = i6.y(aVar3, androidx.compose.ui.unit.h.r(640), androidx.compose.ui.unit.h.r(180));
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarB = d0Var.b(androidx.compose.foundation.v.d(a0VarY, intercomTheme.getColors(c0VarR, i14).m693getBubbleBackground0d7_KjU(), null, 2, null), aVar.i());
            androidx.compose.ui.layout.l.a aVar4 = androidx.compose.ui.layout.l.f39405a;
            s2.d(asyncImagePainterC, "Video Thumbnail", a0VarB, aVar.i(), aVar4.a(), 0.0f, isRemoteUrl(videoUrl) ? null : androidx.compose.ui.graphics.r0.f38151b.a(fArrC), c0VarR, 27696, 32);
            if (isRemoteUrl(videoUrl)) {
                c0VarR.E(1592327165);
                s2.d(u0.e.c(R.drawable.intercom_play_arrow, c0VarR, 0), "Play Video", androidx.compose.foundation.v.c(i6.w(d0Var.b(aVar3, aVar.i()), androidx.compose.ui.unit.h.r(48)), intercomTheme.getColors(c0VarR, i14).m690getBackground0d7_KjU(), androidx.compose.foundation.shape.o.c(50)), null, aVar4.m(), 0.0f, androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, intercomTheme.getColors(c0VarR, i14).m685getActionContrastWhite0d7_KjU(), 0, 2, null), c0VarR, 24632, 40);
                c0VarR.A();
            } else {
                c0VarR.E(1592846880);
                os.F(i6.w(d0Var.b(aVar3, aVar.i()), androidx.compose.ui.unit.h.r(32)), intercomTheme.getColors(c0VarR, i14).m690getBackground0d7_KjU(), 0.0f, 0L, 0, 0.0f, c0VarR, 0, 60);
                c0VarR = c0VarR;
                c0VarR.A();
            }
            c0VarR.o();
            a0Var2 = a0Var3;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.s0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VideoFileBlockKt.VideoFileBlock$lambda$3(a0Var2, videoUrl, str, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoFileBlock$lambda$1(String videoUrl, Context context) {
        Intrinsics.checkNotNullParameter(videoUrl, "$videoUrl");
        Intrinsics.checkNotNullParameter(context, "$context");
        if (isRemoteUrl(videoUrl)) {
            LinkOpener.handleUrl(videoUrl, context, Injector.get().getApi());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoFileBlock$lambda$3(androidx.compose.ui.a0 a0Var, String videoUrl, String str, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(videoUrl, "$videoUrl");
        VideoFileBlock(a0Var, videoUrl, str, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final boolean isRemoteUrl(String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }
}
