package androidx.compose.foundation.text.selection;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21056g = androidx.compose.ui.text.p3.f42048g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.p3 f21062f;

    public f0(long j10, int i10, int i11, int i12, int i13, @NotNull androidx.compose.ui.text.p3 p3Var) {
        this.f21057a = j10;
        this.f21058b = i10;
        this.f21059c = i11;
        this.f21060d = i12;
        this.f21061e = i13;
        this.f21062f = p3Var;
    }

    private final androidx.compose.ui.text.style.i b() {
        return n1.a(this.f21062f, this.f21060d);
    }

    private final androidx.compose.ui.text.style.i j() {
        return n1.a(this.f21062f, this.f21059c);
    }

    @NotNull
    public final h0.a a(int i10) {
        return new h0.a(n1.a(this.f21062f, i10), i10, this.f21057a);
    }

    @NotNull
    public final String c() {
        return this.f21062f.l().n().m();
    }

    @NotNull
    public final m d() {
        int i10 = this.f21059c;
        int i11 = this.f21060d;
        if (i10 < i11) {
            return m.NOT_CROSSED;
        }
        return i10 > i11 ? m.CROSSED : m.COLLAPSED;
    }

    public final int e() {
        return this.f21060d;
    }

    public final int f() {
        return this.f21061e;
    }

    public final int g() {
        return this.f21059c;
    }

    public final long h() {
        return this.f21057a;
    }

    public final int i() {
        return this.f21058b;
    }

    @NotNull
    public final androidx.compose.ui.text.p3 k() {
        return this.f21062f;
    }

    public final int l() {
        return c().length();
    }

    @NotNull
    public final h0 m(int i10, int i11) {
        return new h0(a(i10), a(i11), i10 > i11);
    }

    public final boolean n(@NotNull f0 f0Var) {
        return (this.f21057a == f0Var.f21057a && this.f21059c == f0Var.f21059c && this.f21060d == f0Var.f21060d) ? false : true;
    }

    @NotNull
    public String toString() {
        return "SelectionInfo(id=" + this.f21057a + ", range=(" + this.f21059c + org.apache.commons.codec.language.l.f335457d + j() + AbstractJsonLexerKt.COMMA + this.f21060d + org.apache.commons.codec.language.l.f335457d + b() + "), prevOffset=" + this.f21061e + ')';
    }
}
