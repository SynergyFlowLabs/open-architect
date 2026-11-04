package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import android.content.Context;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.s2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.t0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEmojiRating.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiRating.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/EmojiRatingKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ImagePainter.kt\ncoil/compose/ImagePainterKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,60:1\n75#2:61\n74#2:63\n67#3:62\n68#3:64\n66#3:65\n1#4:66\n113#5:67\n113#5:68\n*S KotlinDebug\n*F\n+ 1 EmojiRating.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/EmojiRatingKt\n*L\n24#1:61\n22#1:63\n22#1:62\n22#1:64\n22#1:65\n46#1:67\n57#1:68\n*E\n"})
public final class EmojiRatingKt {
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void EmojiRating(@NotNull final String emojiUrl, @NotNull final String contentDescription, boolean z10, @NotNull final a0 modifier, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        c0 c0Var2;
        float f10;
        final boolean z13;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(emojiUrl, "emojiUrl");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        c0 c0VarR = c0Var.R(-538688650);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(emojiUrl) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(contentDescription) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                i12 |= c0VarR.G(z11) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c0VarR.D(modifier)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 5851) == 1170 || !c0VarR.d()) {
                if (i14 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                coil.j imageLoader = IntercomImageLoaderKt.getImageLoader((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()));
                c0VarR.h0(1750824323);
                coil.request.i.a aVarJ = new coil.request.i.a((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())).j(emojiUrl);
                aVarJ.i(true);
                c0Var2 = c0VarR;
                AsyncImagePainter asyncImagePainterC = coil.compose.g.c(aVarJ.f(), imageLoader, null, null, null, 0, null, c0Var2, 72, 124);
                c0Var2.w0();
                r0.a aVar = r0.f38151b;
                float[] fArrC = t0.c(null, 1, null);
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                t0.r(fArrC, f10);
                Unit unit = Unit.f312394a;
                s2.d(asyncImagePainterC, contentDescription, modifier, null, null, 0.0f, aVar.a(fArrC), c0Var2, (i12 & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 3) & 896), 56);
                z13 = z12;
            } else {
                c0VarR.u();
                z13 = z11;
                c0Var2 = c0VarR;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EmojiRatingKt.EmojiRating$lambda$2(emojiUrl, contentDescription, z13, modifier, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        z11 = z10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c0VarR.D(modifier)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170) {
            if (i14 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            coil.j imageLoader2 = IntercomImageLoaderKt.getImageLoader((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()));
            c0VarR.h0(1750824323);
            coil.request.i.a aVarJ2 = new coil.request.i.a((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())).j(emojiUrl);
            aVarJ2.i(true);
            c0Var2 = c0VarR;
            AsyncImagePainter asyncImagePainterC2 = coil.compose.g.c(aVarJ2.f(), imageLoader2, null, null, null, 0, null, c0Var2, 72, 124);
            c0Var2.w0();
            r0.a aVar2 = r0.f38151b;
            float[] fArrC2 = t0.c(null, 1, null);
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            t0.r(fArrC2, f10);
            Unit unit2 = Unit.f312394a;
            s2.d(asyncImagePainterC2, contentDescription, modifier, null, null, 0.0f, aVar2.a(fArrC2), c0Var2, (i12 & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 3) & 896), 56);
            z13 = z12;
        } else {
            if (i14 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            coil.j imageLoader3 = IntercomImageLoaderKt.getImageLoader((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()));
            c0VarR.h0(1750824323);
            coil.request.i.a aVarJ3 = new coil.request.i.a((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g())).j(emojiUrl);
            aVarJ3.i(true);
            c0Var2 = c0VarR;
            AsyncImagePainter asyncImagePainterC3 = coil.compose.g.c(aVarJ3.f(), imageLoader3, null, null, null, 0, null, c0Var2, 72, 124);
            c0Var2.w0();
            r0.a aVar3 = r0.f38151b;
            float[] fArrC3 = t0.c(null, 1, null);
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            t0.r(fArrC3, f10);
            Unit unit3 = Unit.f312394a;
            s2.d(asyncImagePainterC3, contentDescription, modifier, null, null, 0.0f, aVar3.a(fArrC3), c0Var2, (i12 & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 3) & 896), 56);
            z13 = z12;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmojiRatingKt.EmojiRating$lambda$2(emojiUrl, contentDescription, z13, modifier, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmojiRating$lambda$2(String emojiUrl, String contentDescription, boolean z10, a0 modifier, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(emojiUrl, "$emojiUrl");
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        Intrinsics.checkNotNullParameter(modifier, "$modifier");
        EmojiRating(emojiUrl, contentDescription, z10, modifier, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SelectedEmoji(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1230381561);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            EmojiRating("https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩", true, i6.w(a0.E, androidx.compose.ui.unit.h.r(44)), c0VarR, 3510, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmojiRatingKt.SelectedEmoji$lambda$3(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedEmoji$lambda$3(int i10, c0 c0Var, int i11) {
        SelectedEmoji(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void UnSelectedEmoji(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(2043776160);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            EmojiRating("https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩", false, i6.w(a0.E, androidx.compose.ui.unit.h.r(44)), c0VarR, 3510, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmojiRatingKt.UnSelectedEmoji$lambda$4(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnSelectedEmoji$lambda$4(int i10, c0 c0Var, int i11) {
        UnSelectedEmoji(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
