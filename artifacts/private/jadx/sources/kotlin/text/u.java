package kotlin.text;

import kotlin.Unit;
import kotlin.b1;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
class u extends t {
    @kotlin.l(level = kotlin.n.WARNING, message = "Use append(value: Any?) instead", replaceWith = @b1(expression = "append(value = obj)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder l0(StringBuilder sb2, Object obj) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(obj);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use appendRange instead.", replaceWith = @b1(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder m0(StringBuilder sb2, char[] str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        throw new l0(null, 1, null);
    }

    @NotNull
    public static final StringBuilder n0(@NotNull StringBuilder sb2, @NotNull Object... value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = 0 >> 0;
        for (Object obj : value) {
            sb2.append(obj);
        }
        return sb2;
    }

    @NotNull
    public static final StringBuilder o0(@NotNull StringBuilder sb2, @NotNull String... value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (String str : value) {
            sb2.append(str);
        }
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder p0(StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder q0(StringBuilder sb2, char c10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(c10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder r0(StringBuilder sb2, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder s0(StringBuilder sb2, Object obj) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(obj);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder t0(StringBuilder sb2, String str) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(str);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder u0(StringBuilder sb2, boolean z10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(z10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder v0(StringBuilder sb2, char[] value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append(value);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final String w0(int i10, Function1<? super StringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        StringBuilder sb2 = new StringBuilder(i10);
        builderAction.invoke(sb2);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @kotlin.internal.f
    private static final String x0(Function1<? super StringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        StringBuilder sb2 = new StringBuilder();
        builderAction.invoke(sb2);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
