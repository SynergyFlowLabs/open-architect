package androidx.media2.exoplayer.external.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.x;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f55549c;

    class a implements Parcelable.Creator<PrivateCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivateCommand createFromParcel(Parcel in) {
            return new PrivateCommand(in, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivateCommand[] newArray(int size) {
            return new PrivateCommand[size];
        }
    }

    /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    static PrivateCommand a(x sectionData, int commandLength, long ptsAdjustment) {
        long jF = sectionData.F();
        int i10 = commandLength - 4;
        byte[] bArr = new byte[i10];
        sectionData.i(bArr, 0, i10);
        return new PrivateCommand(jF, bArr, ptsAdjustment);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.f55547a);
        dest.writeLong(this.f55548b);
        dest.writeInt(this.f55549c.length);
        dest.writeByteArray(this.f55549c);
    }

    private PrivateCommand(long identifier, byte[] commandBytes, long ptsAdjustment) {
        this.f55547a = ptsAdjustment;
        this.f55548b = identifier;
        this.f55549c = commandBytes;
    }

    private PrivateCommand(Parcel in) {
        this.f55547a = in.readLong();
        this.f55548b = in.readLong();
        byte[] bArr = new byte[in.readInt()];
        this.f55549c = bArr;
        in.readByteArray(bArr);
    }
}
