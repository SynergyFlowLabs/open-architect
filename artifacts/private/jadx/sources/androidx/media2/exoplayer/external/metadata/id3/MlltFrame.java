package androidx.media2.exoplayer.external.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f55513g = "MLLT";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f55517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f55518f;

    class a implements Parcelable.Creator<MlltFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MlltFrame createFromParcel(Parcel in) {
            return new MlltFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MlltFrame[] newArray(int size) {
            return new MlltFrame[size];
        }
    }

    public MlltFrame(int mpegFramesBetweenReference, int bytesBetweenReference, int millisecondsBetweenReference, int[] bytesDeviations, int[] millisecondsDeviations) {
        super("MLLT");
        this.f55514b = mpegFramesBetweenReference;
        this.f55515c = bytesBetweenReference;
        this.f55516d = millisecondsBetweenReference;
        this.f55517e = bytesDeviations;
        this.f55518f = millisecondsDeviations;
    }

    @Override // androidx.media2.exoplayer.external.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MlltFrame.class == obj.getClass()) {
            MlltFrame mlltFrame = (MlltFrame) obj;
            if (this.f55514b == mlltFrame.f55514b && this.f55515c == mlltFrame.f55515c && this.f55516d == mlltFrame.f55516d && Arrays.equals(this.f55517e, mlltFrame.f55517e) && Arrays.equals(this.f55518f, mlltFrame.f55518f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f55514b) * 31) + this.f55515c) * 31) + this.f55516d) * 31) + Arrays.hashCode(this.f55517e)) * 31) + Arrays.hashCode(this.f55518f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f55514b);
        dest.writeInt(this.f55515c);
        dest.writeInt(this.f55516d);
        dest.writeIntArray(this.f55517e);
        dest.writeIntArray(this.f55518f);
    }

    MlltFrame(Parcel in) {
        super("MLLT");
        this.f55514b = in.readInt();
        this.f55515c = in.readInt();
        this.f55516d = in.readInt();
        this.f55517e = (int[]) q0.i(in.createIntArray());
        this.f55518f = (int[]) q0.i(in.createIntArray());
    }
}
