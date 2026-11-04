package io.intercom.android.sdk.ui.coil;

import coil.size.b;
import coil.size.c;
import coil.size.h;
import coil.size.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPdfDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PdfDecoder.kt\nio/intercom/android/sdk/ui/coil/PdfDecoderKt\n+ 2 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,118:1\n57#2:119\n*S KotlinDebug\n*F\n+ 1 PdfDecoder.kt\nio/intercom/android/sdk/ui/coil/PdfDecoderKt\n*L\n112#1:119\n*E\n"})
public final class PdfDecoderKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final int heightPx(i iVar, h hVar, Function0<Integer> function0) {
        return b.f(iVar) ? function0.invoke().intValue() : toPx(iVar.e(), hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toPx(c cVar, h hVar) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f87767a;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new k0();
    }

    private static final int widthPx(i iVar, h hVar, Function0<Integer> function0) {
        return b.f(iVar) ? function0.invoke().intValue() : toPx(iVar.f(), hVar);
    }
}
