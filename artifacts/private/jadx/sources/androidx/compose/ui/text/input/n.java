package androidx.compose.ui.text.input;

import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,382:1\n118#2,4:383\n118#2,4:387\n*S KotlinDebug\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n*L\n50#1:383,4\n59#1:387,4\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f41906f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f41907g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41908h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n0 f41909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41913e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ n(androidx.compose.ui.text.f fVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, j10);
    }

    private final void s(int i10) {
        if (!(i10 >= 0)) {
            x0.a.e("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.f41911c = i10;
    }

    private final void t(int i10) {
        if (!(i10 >= 0)) {
            x0.a.e("Cannot set selectionStart to a negative value: " + i10);
        }
        this.f41910b = i10;
    }

    public final void a() {
        o(this.f41912d, this.f41913e, "");
        this.f41912d = -1;
        this.f41913e = -1;
    }

    public final void b() {
        this.f41912d = -1;
        this.f41913e = -1;
    }

    public final void c(int i10, int i11) {
        long jB = x3.b(i10, i11);
        this.f41909a.d(i10, i11, "");
        long jA = o.a(x3.b(this.f41910b, this.f41911c), jB);
        t(w3.l(jA));
        s(w3.k(jA));
        if (m()) {
            long jA2 = o.a(x3.b(this.f41912d, this.f41913e), jB);
            if (w3.h(jA2)) {
                b();
            } else {
                this.f41912d = w3.l(jA2);
                this.f41913e = w3.k(jA2);
            }
        }
    }

    public final char d(int i10) {
        return this.f41909a.a(i10);
    }

    @Nullable
    public final w3 e() {
        if (m()) {
            return w3.b(x3.b(this.f41912d, this.f41913e));
        }
        return null;
    }

    public final int f() {
        return this.f41913e;
    }

    public final int g() {
        return this.f41912d;
    }

    public final int h() {
        int i10 = this.f41910b;
        int i11 = this.f41911c;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int i() {
        return this.f41909a.b();
    }

    public final long j() {
        return x3.b(this.f41910b, this.f41911c);
    }

    public final int k() {
        return this.f41911c;
    }

    public final int l() {
        return this.f41910b;
    }

    public final boolean m() {
        return this.f41912d != -1;
    }

    public final void n(int i10, int i11, @NotNull androidx.compose.ui.text.f fVar) {
        o(i10, i11, fVar.m());
    }

    public final void o(int i10, int i11, @NotNull String str) {
        if (i10 < 0 || i10 > this.f41909a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f41909a.b());
        }
        if (i11 < 0 || i11 > this.f41909a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f41909a.b());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
        }
        this.f41909a.d(i10, i11, str);
        t(str.length() + i10);
        s(i10 + str.length());
        int i12 = 4 | (-1);
        this.f41912d = -1;
        this.f41913e = -1;
    }

    public final void p(int i10, int i11) {
        if (i10 < 0 || i10 > this.f41909a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f41909a.b());
        }
        if (i11 < 0 || i11 > this.f41909a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f41909a.b());
        }
        if (i10 < i11) {
            this.f41912d = i10;
            this.f41913e = i11;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i10 + " > " + i11);
    }

    public final void q(int i10) {
        r(i10, i10);
    }

    public final void r(int i10, int i11) {
        if (i10 < 0 || i10 > this.f41909a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f41909a.b());
        }
        if (i11 < 0 || i11 > this.f41909a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f41909a.b());
        }
        if (i10 <= i11) {
            t(i10);
            s(i11);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
    }

    @NotNull
    public String toString() {
        return this.f41909a.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final androidx.compose.ui.text.f u() {
        return new androidx.compose.ui.text.f(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ n(String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10);
    }

    private n(androidx.compose.ui.text.f fVar, long j10) {
        this.f41909a = new n0(fVar.m());
        this.f41910b = w3.l(j10);
        this.f41911c = w3.k(j10);
        this.f41912d = -1;
        this.f41913e = -1;
        int iL = w3.l(j10);
        int iK = w3.k(j10);
        if (iL < 0 || iL > fVar.length()) {
            throw new IndexOutOfBoundsException("start (" + iL + ") offset is outside of text region " + fVar.length());
        }
        if (iK < 0 || iK > fVar.length()) {
            throw new IndexOutOfBoundsException("end (" + iK + ") offset is outside of text region " + fVar.length());
        }
        if (iL <= iK) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iL + " > " + iK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n(String str, long j10) {
        this(new androidx.compose.ui.text.f(str, null, 2, 0 == true ? 1 : 0), j10, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
