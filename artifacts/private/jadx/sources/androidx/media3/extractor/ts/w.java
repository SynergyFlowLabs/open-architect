package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f69522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f69524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69525e;

    public w(int i10, int i11) {
        this.f69521a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f69524d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f69522b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f69524d;
            int length = bArr2.length;
            int i13 = this.f69525e;
            if (length < i13 + i12) {
                this.f69524d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f69524d, this.f69525e, i12);
            this.f69525e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f69522b) {
            return false;
        }
        this.f69525e -= i10;
        this.f69522b = false;
        this.f69523c = true;
        return true;
    }

    public boolean c() {
        return this.f69523c;
    }

    public void d() {
        this.f69522b = false;
        this.f69523c = false;
    }

    public void e(int i10) {
        boolean z10 = true;
        androidx.media3.common.util.a.i(!this.f69522b);
        if (i10 != this.f69521a) {
            z10 = false;
        }
        this.f69522b = z10;
        if (z10) {
            this.f69525e = 3;
            this.f69523c = false;
        }
    }
}
