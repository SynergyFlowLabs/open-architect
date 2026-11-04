package androidx.media2.exoplayer.external.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f55566a;

    class a implements Parcelable.Creator<SpliceScheduleCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel in) {
            return new SpliceScheduleCommand(in, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int size) {
            return new SpliceScheduleCommand[size];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f55568b;

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel in) {
            return new b(in.readInt(), in.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel dest) {
            dest.writeInt(this.f55567a);
            dest.writeLong(this.f55568b);
        }

        private b(int componentTag, long utcSpliceTime) {
            this.f55567a = componentTag;
            this.f55568b = utcSpliceTime;
        }
    }

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    static SpliceScheduleCommand a(x sectionData) {
        int iD = sectionData.D();
        ArrayList arrayList = new ArrayList(iD);
        for (int i10 = 0; i10 < iD; i10++) {
            arrayList.add(c.e(sectionData));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        int size = this.f55566a.size();
        dest.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.f55566a.get(i10).f(dest);
        }
    }

    private SpliceScheduleCommand(List<c> events) {
        this.f55566a = Collections.unmodifiableList(events);
    }

    private SpliceScheduleCommand(Parcel in) {
        int i10 = in.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.d(in));
        }
        this.f55566a = Collections.unmodifiableList(arrayList);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f55569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f55570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f55571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f55572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f55573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f55574f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f55575g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f55576h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f55577i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f55578j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f55579k;

        private c(long spliceEventId, boolean spliceEventCancelIndicator, boolean outOfNetworkIndicator, boolean programSpliceFlag, List<b> componentSpliceList, long utcSpliceTime, boolean autoReturn, long breakDurationUs, int uniqueProgramId, int availNum, int availsExpected) {
            this.f55569a = spliceEventId;
            this.f55570b = spliceEventCancelIndicator;
            this.f55571c = outOfNetworkIndicator;
            this.f55572d = programSpliceFlag;
            this.f55574f = Collections.unmodifiableList(componentSpliceList);
            this.f55573e = utcSpliceTime;
            this.f55575g = autoReturn;
            this.f55576h = breakDurationUs;
            this.f55577i = uniqueProgramId;
            this.f55578j = availNum;
            this.f55579k = availsExpected;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel in) {
            return new c(in);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(x sectionData) {
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            long j10;
            boolean z12;
            long j11;
            int i10;
            int i11;
            int iD;
            boolean z13;
            long jF;
            long jF2 = sectionData.F();
            boolean z14 = true;
            if ((sectionData.D() & 128) == 0) {
                z14 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                z11 = false;
                j10 = -9223372036854775807L;
                z12 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iD = 0;
            } else {
                int iD2 = sectionData.D();
                boolean z15 = (iD2 & 128) != 0 ? z14 : false;
                boolean z16 = (iD2 & 64) != 0 ? z14 : false;
                boolean z17 = (iD2 & 32) != 0 ? z14 : false;
                long jF3 = z16 ? sectionData.F() : -9223372036854775807L;
                if (!z16) {
                    int iD3 = sectionData.D();
                    ArrayList arrayList3 = new ArrayList(iD3);
                    int i12 = 0;
                    while (i12 < iD3) {
                        arrayList3.add(new b(sectionData.D(), sectionData.F(), null));
                        i12++;
                        iD3 = iD3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jD = sectionData.D();
                    boolean z18 = (128 & jD) != 0;
                    jF = ((((jD & 1) << 32) | sectionData.F()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    jF = -9223372036854775807L;
                }
                int iJ = sectionData.J();
                int iD4 = sectionData.D();
                boolean z19 = z15;
                z12 = z13;
                z10 = z19;
                iD = sectionData.D();
                long j12 = jF3;
                i10 = iJ;
                i11 = iD4;
                long j13 = jF;
                arrayList = arrayList2;
                z11 = z16;
                j10 = j12;
                j11 = j13;
            }
            return new c(jF2, z14, z10, z11, arrayList, j10, z12, j11, i10, i11, iD);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f55569a);
            parcel.writeByte(this.f55570b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f55571c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f55572d ? (byte) 1 : (byte) 0);
            int size = this.f55574f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f55574f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f55573e);
            parcel.writeByte(this.f55575g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f55576h);
            parcel.writeInt(this.f55577i);
            parcel.writeInt(this.f55578j);
            parcel.writeInt(this.f55579k);
        }

        private c(Parcel in) {
            this.f55569a = in.readLong();
            boolean z10 = false | true;
            this.f55570b = in.readByte() == 1;
            this.f55571c = in.readByte() == 1;
            this.f55572d = in.readByte() == 1;
            int i10 = in.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.c(in));
            }
            this.f55574f = Collections.unmodifiableList(arrayList);
            this.f55573e = in.readLong();
            this.f55575g = in.readByte() == 1;
            this.f55576h = in.readLong();
            this.f55577i = in.readInt();
            this.f55578j = in.readInt();
            this.f55579k = in.readInt();
        }
    }
}
