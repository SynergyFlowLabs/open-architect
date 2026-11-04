package kotlinx.io.bytestring;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nByteStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteStringBuilder.kt\nkotlinx/io/bytestring/ByteStringBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private byte[] f315751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f315752b;

    public d() {
        this(0, 1, null);
    }

    public static /* synthetic */ void c(d dVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        dVar.b(bArr, i10, i11);
    }

    private final void d(int i10) {
        byte[] bArr = this.f315751a;
        if (bArr.length >= i10) {
            return;
        }
        byte[] bArr2 = new byte[Math.max(bArr.length == 0 ? 16 : (int) (((double) bArr.length) * 1.5d), i10)];
        ArraysKt.copyInto$default(this.f315751a, bArr2, 0, 0, 0, 14, (Object) null);
        this.f315751a = bArr2;
    }

    public final void a(byte b10) {
        d(f() + 1);
        byte[] bArr = this.f315751a;
        int i10 = this.f315752b;
        this.f315752b = i10 + 1;
        bArr[i10] = b10;
    }

    public final void b(@NotNull byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i10 > i11) {
            throw new IllegalArgumentException(("startIndex (" + i10 + ") > endIndex (" + i11 + ')').toString());
        }
        if (i10 >= 0 && i11 <= array.length) {
            d((this.f315752b + i11) - i10);
            ArraysKt.copyInto(array, this.f315751a, this.f315752b, i10, i11);
            this.f315752b += i11 - i10;
            return;
        }
        throw new IndexOutOfBoundsException("startIndex (" + i10 + ") and endIndex (" + i11 + ") represents an interval out of array's bounds [0.." + array.length + ").");
    }

    public final int e() {
        return this.f315751a.length;
    }

    public final int f() {
        return this.f315752b;
    }

    @NotNull
    public final c g() {
        if (f() == 0) {
            return g.a();
        }
        return this.f315751a.length == f() ? c.f315746c.b(this.f315751a) : new c(this.f315751a, 0, f());
    }

    public d(int i10) {
        this.f315751a = new byte[i10];
    }

    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
