package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
final class ParcelableSnapshotMutableFloatState extends n6 implements Parcelable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f35281e = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new a();

    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableFloatState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableFloatState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableFloatState[] newArray(int i10) {
            return new ParcelableSnapshotMutableFloatState[i10];
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

    public ParcelableSnapshotMutableFloatState(float f10) {
        super(f10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        parcel.writeFloat(V0());
    }
}
