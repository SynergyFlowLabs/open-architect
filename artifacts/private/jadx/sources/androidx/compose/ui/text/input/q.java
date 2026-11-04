package androidx.compose.ui.text.input;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private char[] f41929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41931d;

    public q(@NotNull char[] cArr, int i10, int i11) {
        this.f41928a = cArr.length;
        this.f41929b = cArr;
        this.f41930c = i10;
        this.f41931d = i11;
    }

    private final void b(int i10, int i11) {
        int i12 = this.f41930c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f41929b;
            ArraysKt.copyInto(cArr, cArr, this.f41931d - i13, i11, i12);
            this.f41930c = i10;
            this.f41931d -= i13;
            return;
        }
        if (i10 < i12 && i11 >= i12) {
            this.f41931d = i11 + c();
            this.f41930c = i10;
            return;
        }
        int iC = i10 + c();
        int iC2 = i11 + c();
        int i14 = this.f41931d;
        char[] cArr2 = this.f41929b;
        ArraysKt.copyInto(cArr2, cArr2, this.f41930c, i14, iC);
        this.f41930c += iC - i14;
        this.f41931d = iC2;
    }

    private final int c() {
        return this.f41931d - this.f41930c;
    }

    private final void f(int i10) {
        if (i10 <= c()) {
            return;
        }
        int iC = i10 - c();
        int i11 = this.f41928a;
        do {
            i11 *= 2;
        } while (i11 - this.f41928a < iC);
        char[] cArr = new char[i11];
        ArraysKt.copyInto(this.f41929b, cArr, 0, 0, this.f41930c);
        int i12 = this.f41928a;
        int i13 = this.f41931d;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        ArraysKt.copyInto(this.f41929b, cArr, i15, i13, i14 + i13);
        this.f41929b = cArr;
        this.f41928a = i11;
        this.f41931d = i15;
    }

    public final void a(@NotNull StringBuilder sb2) {
        sb2.append(this.f41929b, 0, this.f41930c);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        char[] cArr = this.f41929b;
        int i10 = this.f41931d;
        sb2.append(cArr, i10, this.f41928a - i10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
    }

    public final char d(int i10) {
        int i11 = this.f41930c;
        return i10 < i11 ? this.f41929b[i10] : this.f41929b[(i10 - i11) + this.f41931d];
    }

    public final int e() {
        return this.f41928a - c();
    }

    public final void g(int i10, int i11, @NotNull String str) {
        f(str.length() - (i11 - i10));
        b(i10, i11);
        r.b(str, this.f41929b, this.f41930c);
        this.f41930c += str.length();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        return sb2.toString();
    }
}
