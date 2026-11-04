package kotlin.text;

import java.io.IOException;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class p {
    @NotNull
    public static final <T extends Appendable> T a(@NotNull T t10, @NotNull CharSequence... value) throws IOException {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (CharSequence charSequence : value) {
            t10.append(charSequence);
        }
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(@NotNull Appendable appendable, T t10, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (function1 != null) {
            appendable.append(function1.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable c(Appendable appendable) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendableAppend;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable d(Appendable appendable, char c10) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c10);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendableAppend2, "append(...)");
        return appendableAppend2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable e(Appendable appendable, CharSequence charSequence) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendableAppend2, "append(...)");
        return appendableAppend2;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <T extends Appendable> T f(@NotNull T t10, @NotNull CharSequence value, int i10, int i11) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        T t11 = (T) t10.append(value, i10, i11);
        Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t11;
    }
}
