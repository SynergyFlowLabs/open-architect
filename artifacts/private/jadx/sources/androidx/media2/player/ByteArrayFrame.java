package androidx.media2.player;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
final class ByteArrayFrame implements Metadata.Entry {
    public static final Parcelable.Creator<ByteArrayFrame> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f57971b;

    class a implements Parcelable.Creator<ByteArrayFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteArrayFrame createFromParcel(Parcel parcel) {
            return new ByteArrayFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ByteArrayFrame[] newArray(int i10) {
            return new ByteArrayFrame[i10];
        }
    }

    ByteArrayFrame(long j10, byte[] bArr) {
        this.f57970a = j10;
        this.f57971b = bArr;
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    @p0
    public Format O0() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    @p0
    public byte[] Y() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ByteArrayFrame.class == obj.getClass()) {
            ByteArrayFrame byteArrayFrame = (ByteArrayFrame) obj;
            if (q0.b(Long.valueOf(this.f57970a), Long.valueOf(byteArrayFrame.f57970a)) && Arrays.equals(this.f57971b, byteArrayFrame.f57971b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + ((int) this.f57970a)) * 31) + Arrays.hashCode(this.f57971b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f57970a);
        parcel.writeByteArray(this.f57971b);
    }

    ByteArrayFrame(Parcel parcel) {
        this.f57970a = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        this.f57971b = bArr;
    }
}
