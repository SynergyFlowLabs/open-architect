package androidx.paging.compose;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"BanParcelableUsage"})
final class PagingPlaceholderKey implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f71643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f71642b = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<PagingPlaceholderKey> CREATOR = new a();

    public static final class a implements Parcelable.Creator<PagingPlaceholderKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PagingPlaceholderKey createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PagingPlaceholderKey(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PagingPlaceholderKey[] newArray(int i10) {
            return new PagingPlaceholderKey[i10];
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

    public PagingPlaceholderKey(int i10) {
        this.f71643a = i10;
    }

    private final int a() {
        return this.f71643a;
    }

    public static /* synthetic */ PagingPlaceholderKey c(PagingPlaceholderKey pagingPlaceholderKey, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = pagingPlaceholderKey.f71643a;
        }
        return pagingPlaceholderKey.b(i10);
    }

    @NotNull
    public final PagingPlaceholderKey b(int i10) {
        return new PagingPlaceholderKey(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagingPlaceholderKey) && this.f71643a == ((PagingPlaceholderKey) obj).f71643a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f71643a);
    }

    @NotNull
    public String toString() {
        return "PagingPlaceholderKey(index=" + this.f71643a + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.f71643a);
    }
}
