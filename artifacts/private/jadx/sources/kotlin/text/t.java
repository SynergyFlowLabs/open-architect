package kotlin.text;

import java.io.IOException;
import kotlin.b1;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
public class t extends s {
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder A(StringBuilder sb2, float f10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(f10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder B(StringBuilder sb2, int i10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(i10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder C(StringBuilder sb2, long j10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(j10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder D(StringBuilder sb2, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder E(StringBuilder sb2, StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder F(StringBuilder sb2, short s10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) s10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder G(StringBuilder sb2, CharSequence value, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append(value, i10, i11);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder H(StringBuilder sb2, char[] value, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append(value, i10, i11 - i10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine()", imports = {}))
    @NotNull
    public static final Appendable I(@NotNull Appendable appendable) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(z.f313393b);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendableAppend;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final Appendable J(Appendable appendable, char c10) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c10);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return I(appendableAppend);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final Appendable K(Appendable appendable, CharSequence charSequence) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return I(appendableAppend);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine()", imports = {}))
    @NotNull
    public static final StringBuilder L(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(z.f313393b);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder M(StringBuilder sb2, byte b10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) b10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder N(StringBuilder sb2, char c10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(c10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder O(StringBuilder sb2, double d10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(d10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder P(StringBuilder sb2, float f10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(f10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder Q(StringBuilder sb2, int i10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(i10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder R(StringBuilder sb2, long j10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(j10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder S(StringBuilder sb2, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder T(StringBuilder sb2, Object obj) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(obj);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder U(StringBuilder sb2, String str) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(str);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder V(StringBuilder sb2, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder W(StringBuilder sb2, StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder X(StringBuilder sb2, short s10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) s10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder Y(StringBuilder sb2, boolean z10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(z10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder Z(StringBuilder sb2, char[] value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append(value);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return L(sb2);
    }

    @e1(version = "1.3")
    @NotNull
    public static StringBuilder a0(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder b0(StringBuilder sb2, int i10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder sbDeleteCharAt = sb2.deleteCharAt(i10);
        Intrinsics.checkNotNullExpressionValue(sbDeleteCharAt, "deleteCharAt(...)");
        return sbDeleteCharAt;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder c0(StringBuilder sb2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder sbDelete = sb2.delete(i10, i11);
        Intrinsics.checkNotNullExpressionValue(sbDelete, "delete(...)");
        return sbDelete;
    }

    @e1(version = "1.9")
    @kotlin.internal.f
    private static final StringBuilder d0(StringBuilder sb2, int i10, byte b10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder sbInsert = sb2.insert(i10, (int) b10);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    @e1(version = "1.9")
    @kotlin.internal.f
    private static final StringBuilder e0(StringBuilder sb2, int i10, short s10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder sbInsert = sb2.insert(i10, (int) s10);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder f0(StringBuilder sb2, int i10, CharSequence value, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbInsert = sb2.insert(i10, value, i11, i12);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder g0(StringBuilder sb2, int i10, char[] value, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbInsert = sb2.insert(i10, value, i11, i12 - i11);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    @kotlin.internal.f
    private static final void h0(StringBuilder sb2, int i10, char c10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.setCharAt(i10, c10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder i0(StringBuilder sb2, int i10, int i11, String value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sbReplace = sb2.replace(i10, i11, value);
        Intrinsics.checkNotNullExpressionValue(sbReplace, "replace(...)");
        return sbReplace;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final void j0(StringBuilder sb2, char[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        sb2.getChars(i11, i12, destination, i10);
    }

    static /* synthetic */ void k0(StringBuilder sb2, char[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sb2.length();
        }
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        sb2.getChars(i11, i12, destination, i10);
    }

    @e1(version = "1.9")
    @kotlin.internal.f
    private static final StringBuilder w(StringBuilder sb2, byte b10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) b10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.9")
    @kotlin.internal.f
    private static final StringBuilder x(StringBuilder sb2, short s10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) s10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder y(StringBuilder sb2, byte b10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append((int) b10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder z(StringBuilder sb2, double d10) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.append(d10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }
}
