package androidx.media2.exoplayer.external.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f55554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f55555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f55556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f55557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f55558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f55559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f55560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f55561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f55562m;

    class a implements Parcelable.Creator<SpliceInsertCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel in) {
            return new SpliceInsertCommand(in, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int size) {
            return new SpliceInsertCommand[size];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f55564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f55565c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel in) {
            return new b(in.readInt(), in.readLong(), in.readLong());
        }

        public void b(Parcel dest) {
            dest.writeInt(this.f55563a);
            dest.writeLong(this.f55564b);
            dest.writeLong(this.f55565c);
        }

        private b(int componentTag, long componentSplicePts, long componentSplicePlaybackPositionUs) {
            this.f55563a = componentTag;
            this.f55564b = componentSplicePts;
            this.f55565c = componentSplicePlaybackPositionUs;
        }
    }

    /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    static SpliceInsertCommand a(x sectionData, long ptsAdjustment, k0 timestampAdjuster) {
        List list;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iD;
        int iD2;
        boolean z14;
        long jF = sectionData.F();
        boolean z15 = (sectionData.D() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jF2 = -9223372036854775807L;
        if (z15) {
            list = list2;
            j10 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iD = 0;
            iD2 = 0;
        } else {
            int iD3 = sectionData.D();
            boolean z16 = (iD3 & 128) != 0;
            boolean z17 = (iD3 & 64) != 0;
            boolean z18 = (iD3 & 32) != 0;
            boolean z19 = (iD3 & 16) != 0;
            long jB = (!z17 || z19) ? -9223372036854775807L : TimeSignalCommand.b(sectionData, ptsAdjustment);
            if (!z17) {
                int iD4 = sectionData.D();
                ArrayList arrayList = new ArrayList(iD4);
                int i11 = 0;
                while (i11 < iD4) {
                    int iD5 = sectionData.D();
                    long jB2 = !z19 ? TimeSignalCommand.b(sectionData, ptsAdjustment) : -9223372036854775807L;
                    arrayList.add(new b(iD5, jB2, timestampAdjuster.b(jB2), null));
                    i11++;
                    iD4 = iD4;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jD = sectionData.D();
                boolean z20 = (128 & jD) != 0;
                jF2 = ((((jD & 1) << 32) | sectionData.F()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iJ = sectionData.J();
            long j11 = jB;
            j10 = jF2;
            jF2 = j11;
            iD = sectionData.D();
            iD2 = sectionData.D();
            i10 = iJ;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new SpliceInsertCommand(jF, z15, z10, z11, z12, jF2, timestampAdjuster.b(jF2), list, z13, j10, i10, iD, iD2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f55550a);
        parcel.writeByte(this.f55551b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f55552c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f55553d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f55554e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f55555f);
        parcel.writeLong(this.f55556g);
        int size = this.f55557h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f55557h.get(i11).b(parcel);
        }
        parcel.writeByte(this.f55558i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f55559j);
        parcel.writeInt(this.f55560k);
        parcel.writeInt(this.f55561l);
        parcel.writeInt(this.f55562m);
    }

    private SpliceInsertCommand(long spliceEventId, boolean spliceEventCancelIndicator, boolean outOfNetworkIndicator, boolean programSpliceFlag, boolean spliceImmediateFlag, long programSplicePts, long programSplicePlaybackPositionUs, List<b> componentSpliceList, boolean autoReturn, long breakDurationUs, int uniqueProgramId, int availNum, int availsExpected) {
        this.f55550a = spliceEventId;
        this.f55551b = spliceEventCancelIndicator;
        this.f55552c = outOfNetworkIndicator;
        this.f55553d = programSpliceFlag;
        this.f55554e = spliceImmediateFlag;
        this.f55555f = programSplicePts;
        this.f55556g = programSplicePlaybackPositionUs;
        this.f55557h = Collections.unmodifiableList(componentSpliceList);
        this.f55558i = autoReturn;
        this.f55559j = breakDurationUs;
        this.f55560k = uniqueProgramId;
        this.f55561l = availNum;
        this.f55562m = availsExpected;
    }

    private SpliceInsertCommand(Parcel in) {
        this.f55550a = in.readLong();
        this.f55551b = in.readByte() == 1;
        this.f55552c = in.readByte() == 1;
        this.f55553d = in.readByte() == 1;
        this.f55554e = in.readByte() == 1;
        this.f55555f = in.readLong();
        this.f55556g = in.readLong();
        int i10 = in.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.a(in));
        }
        this.f55557h = Collections.unmodifiableList(arrayList);
        this.f55558i = in.readByte() == 1;
        this.f55559j = in.readLong();
        this.f55560k = in.readInt();
        this.f55561l = in.readInt();
        this.f55562m = in.readInt();
    }
}
