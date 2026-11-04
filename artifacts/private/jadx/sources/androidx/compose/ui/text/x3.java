package androidx.compose.ui.text;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n101#2,10:124\n101#2,10:134\n118#3,4:144\n80#4:148\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n109#1:124,10\n110#1:134,10\n118#1:144,4\n121#1:148\n*E\n"})
public final class x3 {
    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        return w3.c(d(i10, i11));
    }

    public static final long c(long j10, int i10, int i11) {
        int iN = w3.n(j10);
        if (iN < i10) {
            iN = i10;
        }
        if (iN > i11) {
            iN = i11;
        }
        int i12 = w3.i(j10);
        if (i12 >= i10) {
            i10 = i12;
        }
        if (i10 <= i11) {
            i11 = i10;
        }
        return (iN == w3.n(j10) && i11 == w3.i(j10)) ? j10 : b(iN, i11);
    }

    private static final long d(int i10, int i11) {
        if (!(i10 >= 0 && i11 >= 0)) {
            x0.a.e("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + AbstractJsonLexerKt.END_LIST);
        }
        return (((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32);
    }

    @NotNull
    public static final String e(@NotNull CharSequence charSequence, long j10) {
        return charSequence.subSequence(w3.l(j10), w3.k(j10)).toString();
    }
}
