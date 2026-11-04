package kotlin.text;

import kotlin.Unit;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,844:1\n1088#2,2:845\n*S KotlinDebug\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n*L\n843#1:845,2\n*E\n"})
public final class i {
    @kotlin.s
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final h a(Function1<? super h.a, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        h.a aVar = new h.a();
        builderAction.invoke(aVar);
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.compare((int) cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
