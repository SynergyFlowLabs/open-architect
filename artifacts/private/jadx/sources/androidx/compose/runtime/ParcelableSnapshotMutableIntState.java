package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
final class ParcelableSnapshotMutableIntState extends p6 implements Parcelable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f35282e = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new a();

    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableIntState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState[] newArray(int i10) {
            return new ParcelableSnapshotMutableIntState[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        private b() {
        }
    }

    public ParcelableSnapshotMutableIntState(int i10) {
        super(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        parcel.writeInt(m1());
    }
}
