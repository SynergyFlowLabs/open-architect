package androidx.compose.foundation.text;

import java.text.BreakIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class b5 {
    private static final int a(CharSequence charSequence, int i10, int i11) {
        return i10 <= 0 ? i11 : Character.offsetByCodePoints(charSequence, i10, -1);
    }

    public static final int b(@NotNull String str, int i10, int i11) {
        int iH;
        if (i10 <= 0) {
            return i11;
        }
        androidx.emoji2.text.f fVarE = e();
        if (fVarE != null && (iH = fVarE.h(str, i10 - 1)) >= 0) {
            return iH;
        }
        return a(str, i10, i11);
    }

    public static final int c(@NotNull String str, int i10) {
        androidx.emoji2.text.f fVarE = e();
        Integer num = null;
        int i11 = 7 | 0;
        if (fVarE != null) {
            Integer numValueOf = Integer.valueOf(fVarE.e(str, i10));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    public static final int d(@NotNull String str, int i10) {
        androidx.emoji2.text.f fVarE = e();
        Integer num = null;
        if (fVarE != null) {
            Integer numValueOf = Integer.valueOf(fVarE.h(str, Math.max(0, i10 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    private static final androidx.emoji2.text.f e() {
        if (androidx.emoji2.text.f.q()) {
            androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
            if (fVarC.i() == 1) {
                return fVarC;
            }
        }
        return null;
    }
}
