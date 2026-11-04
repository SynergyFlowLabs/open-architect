package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
final class DefaultLazyKey implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f17224b = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new a();

    public static final class a implements Parcelable.Creator<DefaultLazyKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey createFromParcel(Parcel parcel) {
            return new DefaultLazyKey(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey[] newArray(int i10) {
            return new DefaultLazyKey[i10];
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

    public DefaultLazyKey(int i10) {
        this.f17225a = i10;
    }

    private final int a() {
        return this.f17225a;
    }

    public static /* synthetic */ DefaultLazyKey c(DefaultLazyKey defaultLazyKey, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = defaultLazyKey.f17225a;
        }
        return defaultLazyKey.b(i10);
    }

    @NotNull
    public final DefaultLazyKey b(int i10) {
        return new DefaultLazyKey(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f17225a == ((DefaultLazyKey) obj).f17225a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f17225a);
    }

    @NotNull
    public String toString() {
        return "DefaultLazyKey(index=" + this.f17225a + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        parcel.writeInt(this.f17225a);
    }
}
