package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPlatformFontVariationSettings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformFontVariationSettings.android.kt\nandroidx/compose/ui/text/font/PlatformFontVariationSettings_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,130:1\n71#2,5:131\n*S KotlinDebug\n*F\n+ 1 PlatformFontVariationSettings.android.kt\nandroidx/compose/ui/text/font/PlatformFontVariationSettings_androidKt\n*L\n41#1:131,5\n*E\n"})
public final class f1 {
    private static final float b(float f10) {
        return kotlin.ranges.r.H(f10, 1.0f, 1000.0f);
    }

    public static final int c(@Nullable Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 31 && context.getResources().getConfiguration().fontWeightAdjustment != Integer.MAX_VALUE) {
            return context.getResources().getConfiguration().fontWeightAdjustment;
        }
        return 0;
    }

    @androidx.annotation.w0(26)
    @NotNull
    public static final FontVariationAxis[] d(@NotNull u0.e eVar, @NotNull androidx.compose.ui.unit.d dVar, int i10) {
        int size;
        FontVariationAxis fontVariationAxis;
        int i11 = 0;
        if (i10 == 0) {
            int size2 = eVar.b().size();
            FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[size2];
            while (i11 < size2) {
                fontVariationAxisArr[i11] = new FontVariationAxis(eVar.b().get(i11).a(), eVar.b().get(i11).c(dVar));
                i11++;
            }
            return fontVariationAxisArr;
        }
        int size3 = eVar.b().size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                size = eVar.b().size() + 1;
                break;
            }
            if (Intrinsics.areEqual(eVar.b().get(i12).a(), "wght")) {
                size = eVar.b().size();
                break;
            }
            i12++;
        }
        FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[size];
        while (i11 < size) {
            if (i11 == eVar.b().size()) {
                fontVariationAxis = new FontVariationAxis("wght", b(i10 + 400.0f));
            } else {
                fontVariationAxis = Intrinsics.areEqual(eVar.b().get(i11).a(), "wght") ? new FontVariationAxis("wght", b(eVar.b().get(i11).c(dVar) + i10)) : new FontVariationAxis(eVar.b().get(i11).a(), eVar.b().get(i11).c(dVar));
            }
            fontVariationAxisArr2[i11] = fontVariationAxis;
            i11++;
        }
        return fontVariationAxisArr2;
    }

    @NotNull
    public static final String e(@NotNull u0.e eVar, @NotNull Context context) {
        return f(eVar, androidx.compose.ui.unit.a.a(context), c(context));
    }

    @androidx.annotation.l1
    @NotNull
    public static final String f(@NotNull u0.e eVar, @NotNull final androidx.compose.ui.unit.d dVar, int i10) {
        boolean z10;
        float fC;
        if (i10 == 0) {
            return androidx.compose.ui.util.d.r(eVar.b(), null, null, null, 0, null, new Function1() { // from class: androidx.compose.ui.text.font.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f1.g(dVar, (u0.a) obj);
                }
            }, 31, null);
        }
        List<u0.a> listB = eVar.b();
        int size = listB.size();
        int i11 = 0;
        String str = "";
        boolean z11 = false;
        while (i11 < size) {
            u0.a aVar = listB.get(i11);
            if (Intrinsics.areEqual(aVar.a(), "wght")) {
                fC = b(aVar.c(dVar) + i10);
                z10 = true;
            } else {
                z10 = z11;
                fC = aVar.c(dVar);
            }
            if (i11 != 0) {
                str = str + AbstractJsonLexerKt.COMMA;
            }
            str = str + '\'' + aVar.a() + "' " + fC;
            i11++;
            z11 = z10;
        }
        if (z11) {
            return str;
        }
        float fB = b(i10 + 400.0f);
        if (!eVar.b().isEmpty()) {
            str = str + AbstractJsonLexerKt.COMMA;
        }
        return str + "'wght' " + fB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(androidx.compose.ui.unit.d dVar, u0.a aVar) {
        return '\'' + aVar.a() + "' " + aVar.c(dVar);
    }
}
