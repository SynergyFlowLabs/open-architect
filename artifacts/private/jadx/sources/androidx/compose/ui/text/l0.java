package androidx.compose.ui.text;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1227:1\n1092#1,11:1232\n1092#1,11:1247\n1092#1,11:1258\n118#2,4:1228\n118#2,4:1243\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1022#1:1232,11\n1048#1:1247,11\n1082#1:1258,11\n1018#1:1228,4\n1029#1:1243,4\n*E\n"})
public final class l0 {
    private static final <T> int b(List<? extends T> list, Function1<? super T, Integer> function1) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iIntValue = function1.invoke(list.get(i11)).intValue();
            if (iIntValue < 0) {
                i10 = i11 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int c(@NotNull List<o0> list, int i10) {
        int i11;
        byte b10;
        int iK = ((o0) CollectionsKt.last((List) list)).k();
        boolean z10 = false;
        if (!(i10 <= ((o0) CollectionsKt.last((List) list)).k())) {
            x0.a.e("Index " + i10 + " should be less or equal than last line's end " + iK);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                i11 = -(i12 + 1);
                break;
            }
            i11 = (i12 + size) >>> 1;
            o0 o0Var = list.get(i11);
            if (o0Var.o() > i10) {
                b10 = 1;
            } else {
                b10 = o0Var.k() <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 >= 0) {
                if (b10 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i12 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            z10 = true;
        }
        if (!z10) {
            x0.a.e("Found paragraph index " + i11 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i10 + ", paragraphs=[" + androidx.compose.ui.util.d.r(list, null, null, null, 0, null, new Function1() { // from class: androidx.compose.ui.text.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l0.d((o0) obj);
                }
            }, 31, null) + AbstractJsonLexerKt.END_LIST);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(o0 o0Var) {
        return AbstractJsonLexerKt.BEGIN_LIST + o0Var.o() + ", " + o0Var.k() + ')';
    }

    public static final int e(@NotNull List<o0> list, int i10) {
        byte b10;
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            o0 o0Var = list.get(i12);
            if (o0Var.p() > i10) {
                b10 = 1;
            } else {
                b10 = o0Var.l() <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int f(@NotNull List<o0> list, float f10) {
        byte b10;
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((o0) CollectionsKt.last((List) list)).j()) {
            return CollectionsKt.getLastIndex(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            o0 o0Var = list.get(i11);
            if (o0Var.q() > f10) {
                b10 = 1;
            } else {
                b10 = o0Var.j() <= f10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void g(@NotNull List<o0> list, long j10, @NotNull Function1<? super o0, Unit> function1) {
        int size = list.size();
        for (int iC = c(list, w3.l(j10)); iC < size; iC++) {
            o0 o0Var = list.get(iC);
            if (o0Var.o() >= w3.k(j10)) {
                return;
            }
            if (o0Var.o() != o0Var.k()) {
                function1.invoke(o0Var);
            }
        }
    }
}
