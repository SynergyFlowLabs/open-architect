package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f55090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f55092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55093e;

    public t(int targetType, int initialCapacity) {
        this.f55089a = targetType;
        byte[] bArr = new byte[initialCapacity + 3];
        this.f55092d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] data, int offset, int limit) {
        if (this.f55090b) {
            int i10 = limit - offset;
            byte[] bArr = this.f55092d;
            int length = bArr.length;
            int i11 = this.f55093e;
            if (length < i11 + i10) {
                this.f55092d = Arrays.copyOf(bArr, (i11 + i10) * 2);
            }
            System.arraycopy(data, offset, this.f55092d, this.f55093e, i10);
            this.f55093e += i10;
        }
    }

    public boolean b(int discardPadding) {
        if (!this.f55090b) {
            return false;
        }
        this.f55093e -= discardPadding;
        this.f55090b = false;
        this.f55091c = true;
        return true;
    }

    public boolean c() {
        return this.f55091c;
    }

    public void d() {
        this.f55090b = false;
        this.f55091c = false;
    }

    public void e(int type) {
        boolean z10 = true;
        androidx.media2.exoplayer.external.util.a.i(!this.f55090b);
        if (type != this.f55089a) {
            z10 = false;
        }
        this.f55090b = z10;
        if (z10) {
            this.f55093e = 3;
            this.f55091c = false;
        }
    }
}
