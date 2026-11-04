package androidx.media2.exoplayer.external.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.x;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55581b;

    class a implements Parcelable.Creator<TimeSignalCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel in) {
            return new TimeSignalCommand(in.readLong(), in.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int size) {
            return new TimeSignalCommand[size];
        }
    }

    /* synthetic */ TimeSignalCommand(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    static TimeSignalCommand a(x sectionData, long ptsAdjustment, k0 timestampAdjuster) {
        long jB = b(sectionData, ptsAdjustment);
        return new TimeSignalCommand(jB, timestampAdjuster.b(jB));
    }

    static long b(x sectionData, long ptsAdjustment) {
        long jD = sectionData.D();
        if ((128 & jD) != 0) {
            return 8589934591L & ((((jD & 1) << 32) | sectionData.F()) + ptsAdjustment);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.f55580a);
        dest.writeLong(this.f55581b);
    }

    private TimeSignalCommand(long ptsTime, long playbackPositionUs) {
        this.f55580a = ptsTime;
        this.f55581b = playbackPositionUs;
    }
}
