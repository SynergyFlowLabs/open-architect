package rm;

/* JADX INFO: loaded from: classes14.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f366672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f366673b;

    public a(byte[] bArr) {
        a(bArr);
    }

    public void a(byte[] bArr) {
        this.f366672a = bArr;
        this.f366673b = 0;
    }

    @Override // rm.d
    public void read(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f366673b;
        int i11 = i10 + length;
        byte[] bArr2 = this.f366672a;
        if (i11 > bArr2.length) {
            length = bArr2.length - i10;
            System.arraycopy(bArr2, i10, bArr, 0, length);
            for (int i12 = length; i12 < bArr.length; i12++) {
                bArr[i12] = 0;
            }
        } else {
            System.arraycopy(bArr2, i10, bArr, 0, length);
        }
        this.f366673b += length;
    }
}
