package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f36671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36672b;

    public b0(@NotNull String str) {
        this.f36671a = str;
    }

    public static /* synthetic */ void b(b0 b0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        b0Var.a(i10);
    }

    public final void a(int i10) {
        this.f36672b += i10;
    }

    public final boolean c() {
        return this.f36672b >= this.f36671a.length();
    }

    public final char d() {
        return this.f36671a.charAt(this.f36672b);
    }

    public final void e(char c10) throws z {
        if (h(c10)) {
            return;
        }
        n("expected " + c10);
        throw new kotlin.a0();
    }

    @NotNull
    public final String f() {
        return this.f36671a;
    }

    public final int g() {
        return this.f36672b;
    }

    public final boolean h(char c10) {
        return this.f36672b < this.f36671a.length() && this.f36671a.charAt(this.f36672b) == c10;
    }

    public final void i(int i10) {
        this.f36672b = i10;
    }

    public final void j(@NotNull String str) {
        while (this.f36672b < this.f36671a.length() && !StringsKt.U2(str, this.f36671a.charAt(this.f36672b), false, 2, null)) {
            this.f36672b++;
        }
    }

    public final int k(@NotNull String str) throws z {
        Integer intOrNull = StringsKt.toIntOrNull(l(str));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        n("expected int");
        throw new kotlin.a0();
    }

    @NotNull
    public final String l(@NotNull String str) {
        int i10 = this.f36672b;
        j(str);
        int i11 = this.f36672b;
        if (i11 <= i10) {
            return "";
        }
        String strSubstring = this.f36671a.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public final String m() {
        String str = this.f36671a;
        String strSubstring = str.substring(this.f36672b, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public final Void n(@NotNull String str) throws z {
        int iMin = Math.min(this.f36672b, this.f36671a.length());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while parsing source information: ");
        sb2.append(str);
        sb2.append(" at ");
        String strSubstring = this.f36671a.substring(0, iMin);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append('|');
        String strSubstring2 = this.f36671a.substring(iMin);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        throw new z(sb2.toString());
    }
}
