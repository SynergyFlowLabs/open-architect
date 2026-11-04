package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.b1;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
class f extends e {
    private static final boolean B = false;
    private static final String C = "VersionedParcelParcel";
    private int A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SparseIntArray f76005t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Parcel f76006u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f76007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f76008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f76009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f76010y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f76011z;

    f(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.e
    public void C0(double d10) {
        this.f76006u.writeDouble(d10);
    }

    @Override // androidx.versionedparcelable.e
    public boolean F(int i10) {
        while (this.f76011z < this.f76008w) {
            int i11 = this.A;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f76006u.setDataPosition(this.f76011z);
            int i12 = this.f76006u.readInt();
            this.A = this.f76006u.readInt();
            this.f76011z += i12;
        }
        return this.A == i10;
    }

    @Override // androidx.versionedparcelable.e
    public float G() {
        return this.f76006u.readFloat();
    }

    @Override // androidx.versionedparcelable.e
    public void H0(float f10) {
        this.f76006u.writeFloat(f10);
    }

    @Override // androidx.versionedparcelable.e
    public int L() {
        return this.f76006u.readInt();
    }

    @Override // androidx.versionedparcelable.e
    public void L0(int i10) {
        this.f76006u.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.e
    public long Q() {
        return this.f76006u.readLong();
    }

    @Override // androidx.versionedparcelable.e
    public void Q0(long j10) {
        this.f76006u.writeLong(j10);
    }

    @Override // androidx.versionedparcelable.e
    public <T extends Parcelable> T V() {
        return (T) this.f76006u.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.e
    public void W0(Parcelable parcelable) {
        this.f76006u.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.e
    public void a() {
        int i10 = this.f76010y;
        if (i10 >= 0) {
            int i11 = this.f76005t.get(i10);
            int iDataPosition = this.f76006u.dataPosition();
            this.f76006u.setDataPosition(i11);
            this.f76006u.writeInt(iDataPosition - i11);
            this.f76006u.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.e
    protected e c() {
        Parcel parcel = this.f76006u;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f76011z;
        if (i10 == this.f76007v) {
            i10 = this.f76008w;
        }
        return new f(parcel, iDataPosition, i10, this.f76009x + "  ", this.f76001a, this.f76002b, this.f76003c);
    }

    @Override // androidx.versionedparcelable.e
    public String c0() {
        return this.f76006u.readString();
    }

    @Override // androidx.versionedparcelable.e
    public IBinder e0() {
        return this.f76006u.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.e
    public void e1(String str) {
        this.f76006u.writeString(str);
    }

    @Override // androidx.versionedparcelable.e
    public void g1(IBinder iBinder) {
        this.f76006u.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.e
    public void i0(int i10) {
        a();
        this.f76010y = i10;
        this.f76005t.put(i10, this.f76006u.dataPosition());
        L0(0);
        L0(i10);
    }

    @Override // androidx.versionedparcelable.e
    public void i1(IInterface iInterface) {
        this.f76006u.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.e
    public boolean l() {
        return this.f76006u.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.e
    public void m0(boolean z10) {
        this.f76006u.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.e
    public Bundle p() {
        return this.f76006u.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.e
    public void q0(Bundle bundle) {
        this.f76006u.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.e
    public byte[] s() {
        int i10 = this.f76006u.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f76006u.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.e
    public void t0(byte[] bArr) {
        if (bArr == null) {
            this.f76006u.writeInt(-1);
        } else {
            this.f76006u.writeInt(bArr.length);
            this.f76006u.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.e
    protected CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f76006u);
    }

    @Override // androidx.versionedparcelable.e
    public void v0(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            this.f76006u.writeInt(-1);
        } else {
            this.f76006u.writeInt(bArr.length);
            this.f76006u.writeByteArray(bArr, i10, i11);
        }
    }

    @Override // androidx.versionedparcelable.e
    public double y() {
        return this.f76006u.readDouble();
    }

    @Override // androidx.versionedparcelable.e
    protected void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f76006u, 0);
    }

    private f(Parcel parcel, int i10, int i11, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f76005t = new SparseIntArray();
        this.f76010y = -1;
        this.A = -1;
        this.f76006u = parcel;
        this.f76007v = i10;
        this.f76008w = i11;
        this.f76011z = i10;
        this.f76009x = str;
    }
}
