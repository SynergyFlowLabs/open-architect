package androidx.media2.exoplayer.external.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f55485b;

    class a implements Parcelable.Creator<BinaryFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BinaryFrame createFromParcel(Parcel in) {
            return new BinaryFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BinaryFrame[] newArray(int size) {
            return new BinaryFrame[size];
        }
    }

    public BinaryFrame(String id2, byte[] data) {
        super(id2);
        this.f55485b = data;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryFrame.class == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.f55508a.equals(binaryFrame.f55508a) && Arrays.equals(this.f55485b, binaryFrame.f55485b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f55508a.hashCode()) * 31) + Arrays.hashCode(this.f55485b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55508a);
        dest.writeByteArray(this.f55485b);
    }

    BinaryFrame(Parcel in) {
        super((String) q0.i(in.readString()));
        this.f55485b = (byte[]) q0.i(in.createByteArray());
    }
}
