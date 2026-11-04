package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9650e;

    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel in) {
            return new ParcelableVolumeInfo(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int size) {
            return new ParcelableVolumeInfo[size];
        }
    }

    public ParcelableVolumeInfo(int volumeType, int audioStream, int controlType, int maxVolume, int currentVolume) {
        this.f9646a = volumeType;
        this.f9647b = audioStream;
        this.f9648c = controlType;
        this.f9649d = maxVolume;
        this.f9650e = currentVolume;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f9646a);
        dest.writeInt(this.f9648c);
        dest.writeInt(this.f9649d);
        dest.writeInt(this.f9650e);
        dest.writeInt(this.f9647b);
    }

    public ParcelableVolumeInfo(Parcel from) {
        this.f9646a = from.readInt();
        this.f9648c = from.readInt();
        this.f9649d = from.readInt();
        this.f9650e = from.readInt();
        this.f9647b = from.readInt();
    }
}
