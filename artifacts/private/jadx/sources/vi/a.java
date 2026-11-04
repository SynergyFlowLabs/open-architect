package vi;

import kotlin.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCharArraySequence.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharArraySequence.kt\nio/ktor/utils/io/core/internal/CharArraySequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class a implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final char[] f385766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f385767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f385768c;

    public a(@NotNull char[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f385766a = array;
        this.f385767b = i10;
        this.f385768c = i11;
    }

    private final Void c(int i10) {
        throw new IndexOutOfBoundsException("String index out of bounds: " + i10 + " > " + this.f385768c);
    }

    public final char a(int i10) {
        if (i10 < this.f385768c) {
            return this.f385766a[i10 + this.f385767b];
        }
        c(i10);
        throw new a0();
    }

    public final int b() {
        return this.f385768c;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.f385768c;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public final CharSequence subSequence(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex shouldn't be negative: " + i10).toString());
        }
        int i12 = this.f385768c;
        if (i10 > i12) {
            throw new IllegalArgumentException(("startIndex is too large: " + i10 + " > " + this.f385768c).toString());
        }
        if (i10 + i11 > i12) {
            throw new IllegalArgumentException(("endIndex is too large: " + i11 + " > " + this.f385768c).toString());
        }
        if (i11 >= i10) {
            return new a(this.f385766a, this.f385767b + i10, i11 - i10);
        }
        throw new IllegalArgumentException(("endIndex should be greater or equal to startIndex: " + i10 + " > " + i11).toString());
    }
}
