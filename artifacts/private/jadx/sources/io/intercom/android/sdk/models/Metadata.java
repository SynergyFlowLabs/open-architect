package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import gk.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@d
@SourceDebugExtension({"SMAP\nMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Metadata.kt\nio/intercom/android/sdk/models/Metadata\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1557#2:25\n1628#2,3:26\n*S KotlinDebug\n*F\n+ 1 Metadata.kt\nio/intercom/android/sdk/models/Metadata\n*L\n22#1:25\n22#1:26,3\n*E\n"})
public final class Metadata implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Metadata> CREATOR = new Creator();

    @c("avatars")
    @Nullable
    private final List<Avatar.Builder> _avatars;

    @c("suffix")
    @Nullable
    private final String suffix;

    @c("timestamp")
    @Nullable
    private final Long timestamp;

    @c("title")
    @NotNull
    private final String title;

    public static final class Creator implements Parcelable.Creator<Metadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Metadata(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), null, 8, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata() {
        this(null, null, null, null, 15, null);
    }

    private final List<Avatar.Builder> component4() {
        return this._avatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, Long l10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = metadata.title;
        }
        if ((i10 & 2) != 0) {
            str2 = metadata.suffix;
        }
        if ((i10 & 4) != 0) {
            l10 = metadata.timestamp;
        }
        if ((i10 & 8) != 0) {
            list = metadata._avatars;
        }
        return metadata.copy(str, str2, l10, list);
    }

    private static /* synthetic */ void get_avatars$annotations() {
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.suffix;
    }

    @Nullable
    public final Long component3() {
        return this.timestamp;
    }

    @NotNull
    public final Metadata copy(@NotNull String title, @Nullable String str, @Nullable Long l10, @Nullable List<Avatar.Builder> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new Metadata(title, str, l10, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Intrinsics.areEqual(this.title, metadata.title) && Intrinsics.areEqual(this.suffix, metadata.suffix) && Intrinsics.areEqual(this.timestamp, metadata.timestamp) && Intrinsics.areEqual(this._avatars, metadata._avatars);
    }

    @NotNull
    public final List<Avatar> getAvatars() {
        List<Avatar.Builder> list = this._avatars;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        List<Avatar.Builder> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Avatar.Builder) it.next()).build());
        }
        return arrayList;
    }

    @Nullable
    public final String getSuffix() {
        return this.suffix;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.suffix;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.timestamp;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        List<Avatar.Builder> list = this._avatars;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Metadata(title=" + this.title + ", suffix=" + this.suffix + ", timestamp=" + this.timestamp + ", _avatars=" + this._avatars + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.suffix);
        Long l10 = this.timestamp;
        if (l10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l10.longValue());
        }
    }

    public Metadata(@NotNull String title, @Nullable String str, @Nullable Long l10, @Nullable List<Avatar.Builder> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.suffix = str;
        this.timestamp = l10;
        this._avatars = list;
    }

    public /* synthetic */ Metadata(String str, String str2, Long l10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : list);
    }
}
