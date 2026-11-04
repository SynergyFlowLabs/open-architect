package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import gk.d;
import io.sentry.a8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@d
public final class TicketType implements Parcelable {

    @c("archived")
    private final boolean archived;

    @c(a8.b.f303905f)
    @NotNull
    private final List<TicketAttribute> attributes;

    @c("emoji")
    @NotNull
    private final String emoji;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @c("id")
    private final int f291543id;

    @c("name")
    @NotNull
    private final String name;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<TicketType> CREATOR = new Creator();

    @NotNull
    private static final TicketType NULL = new TicketType(-1, "", "", CollectionsKt.emptyList(), false);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TicketType getNULL() {
            return TicketType.NULL;
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<TicketType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(TicketAttribute.CREATOR.createFromParcel(parcel));
            }
            return new TicketType(i10, string, string2, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketType[] newArray(int i10) {
            return new TicketType[i10];
        }
    }

    public TicketType(int i10, @NotNull String name, @NotNull String emoji, @NotNull List<TicketAttribute> attributes, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f291543id = i10;
        this.name = name;
        this.emoji = emoji;
        this.attributes = attributes;
        this.archived = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketType copy$default(TicketType ticketType, int i10, String str, String str2, List list, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = ticketType.f291543id;
        }
        if ((i11 & 2) != 0) {
            str = ticketType.name;
        }
        if ((i11 & 4) != 0) {
            str2 = ticketType.emoji;
        }
        if ((i11 & 8) != 0) {
            list = ticketType.attributes;
        }
        if ((i11 & 16) != 0) {
            z10 = ticketType.archived;
        }
        boolean z11 = z10;
        String str3 = str2;
        return ticketType.copy(i10, str, str3, list, z11);
    }

    public final int component1() {
        return this.f291543id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.emoji;
    }

    @NotNull
    public final List<TicketAttribute> component4() {
        return this.attributes;
    }

    public final boolean component5() {
        return this.archived;
    }

    @NotNull
    public final TicketType copy(int i10, @NotNull String name, @NotNull String emoji, @NotNull List<TicketAttribute> attributes, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new TicketType(i10, name, emoji, attributes, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketType)) {
            return false;
        }
        TicketType ticketType = (TicketType) obj;
        return this.f291543id == ticketType.f291543id && Intrinsics.areEqual(this.name, ticketType.name) && Intrinsics.areEqual(this.emoji, ticketType.emoji) && Intrinsics.areEqual(this.attributes, ticketType.attributes) && this.archived == ticketType.archived;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    @NotNull
    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final String getEmoji() {
        return this.emoji;
    }

    public final int getId() {
        return this.f291543id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f291543id) * 31) + this.name.hashCode()) * 31) + this.emoji.hashCode()) * 31) + this.attributes.hashCode()) * 31) + Boolean.hashCode(this.archived);
    }

    @NotNull
    public String toString() {
        return "TicketType(id=" + this.f291543id + ", name=" + this.name + ", emoji=" + this.emoji + ", attributes=" + this.attributes + ", archived=" + this.archived + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f291543id);
        dest.writeString(this.name);
        dest.writeString(this.emoji);
        List<TicketAttribute> list = this.attributes;
        dest.writeInt(list.size());
        Iterator<TicketAttribute> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
        dest.writeInt(this.archived ? 1 : 0);
    }
}
