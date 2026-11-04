package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
final class ParcelableSnapshotMutableDoubleState extends l6 implements Parcelable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f35280e = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new a();

    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableDoubleState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableDoubleState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableDoubleState[] newArray(int i10) {
            return new ParcelableSnapshotMutableDoubleState[i10];
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

    public ParcelableSnapshotMutableDoubleState(double d10) {
        super(d10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        parcel.writeDouble(X());
    }
}
