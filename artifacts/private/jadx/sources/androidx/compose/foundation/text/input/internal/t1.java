package androidx.compose.foundation.text.input.internal;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private char[] f20064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20066d;

    public t1(@NotNull char[] cArr, int i10, int i11) {
        this.f20063a = cArr.length;
        this.f20064b = cArr;
        this.f20065c = i10;
        this.f20066d = i11;
    }

    private final void b(int i10, int i11) {
        int i12 = this.f20065c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f20064b;
            ArraysKt.copyInto(cArr, cArr, this.f20066d - i13, i11, i12);
            this.f20065c = i10;
            this.f20066d -= i13;
            return;
        }
        if (i10 < i12 && i11 >= i12) {
            this.f20066d = i11 + c();
            this.f20065c = i10;
            return;
        }
        int iC = i10 + c();
        int iC2 = i11 + c();
        int i14 = this.f20066d;
        char[] cArr2 = this.f20064b;
        ArraysKt.copyInto(cArr2, cArr2, this.f20065c, i14, iC);
        this.f20065c += iC - i14;
        this.f20066d = iC2;
    }

    private final int c() {
        return this.f20066d - this.f20065c;
    }

    private final void f(int i10) {
        if (i10 <= c()) {
            return;
        }
        int iC = i10 - c();
        int i11 = this.f20063a;
        do {
            i11 *= 2;
        } while (i11 - this.f20063a < iC);
        char[] cArr = new char[i11];
        ArraysKt.copyInto(this.f20064b, cArr, 0, 0, this.f20065c);
        int i12 = this.f20063a;
        int i13 = this.f20066d;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        ArraysKt.copyInto(this.f20064b, cArr, i15, i13, i14 + i13);
        this.f20064b = cArr;
        this.f20063a = i11;
        this.f20066d = i15;
    }

    public static /* synthetic */ void h(t1 t1Var, int i10, int i11, CharSequence charSequence, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        int i15 = i12;
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        t1Var.g(i10, i11, charSequence, i15, i13);
    }

    public final void a(@NotNull StringBuilder sb2) {
        sb2.append(this.f20064b, 0, this.f20065c);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        char[] cArr = this.f20064b;
        int i10 = this.f20066d;
        sb2.append(cArr, i10, this.f20063a - i10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
    }

    public final char d(int i10) {
        int i11 = this.f20065c;
        return i10 < i11 ? this.f20064b[i10] : this.f20064b[(i10 - i11) + this.f20066d];
    }

    public final int e() {
        return this.f20063a - c();
    }

    public final void g(int i10, int i11, @NotNull CharSequence charSequence, int i12, int i13) {
        int i14 = i13 - i12;
        f(i14 - (i11 - i10));
        b(i10, i11);
        s6.a(charSequence, this.f20064b, this.f20065c, i12, i13);
        this.f20065c += i14;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        return sb2.toString();
    }
}
