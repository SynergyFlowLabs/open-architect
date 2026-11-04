package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import gk.d;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@d
public final class TicketAttribute implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<TicketAttribute> CREATOR = new Creator();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f291542id;

    @Nullable
    private final String identifier;

    @NotNull
    private final String name;

    @NotNull
    private final List<String> options;
    private final boolean required;

    @NotNull
    private final String type;

    public static final class Creator implements Parcelable.Creator<TicketAttribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketAttribute createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TicketAttribute(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketAttribute[] newArray(int i10) {
            return new TicketAttribute[i10];
        }
    }

    public TicketAttribute(int i10, @NotNull String name, @NotNull String type, boolean z10, @Nullable String str, @NotNull List<String> options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f291542id = i10;
        this.name = name;
        this.type = type;
        this.required = z10;
        this.identifier = str;
        this.options = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketAttribute copy$default(TicketAttribute ticketAttribute, int i10, String str, String str2, boolean z10, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = ticketAttribute.f291542id;
        }
        if ((i11 & 2) != 0) {
            str = ticketAttribute.name;
        }
        if ((i11 & 4) != 0) {
            str2 = ticketAttribute.type;
        }
        if ((i11 & 8) != 0) {
            z10 = ticketAttribute.required;
        }
        if ((i11 & 16) != 0) {
            str3 = ticketAttribute.identifier;
        }
        if ((i11 & 32) != 0) {
            list = ticketAttribute.options;
        }
        String str4 = str3;
        List list2 = list;
        return ticketAttribute.copy(i10, str, str2, z10, str4, list2);
    }

    public final int component1() {
        return this.f291542id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    public final boolean component4() {
        return this.required;
    }

    @Nullable
    public final String component5() {
        return this.identifier;
    }

    @NotNull
    public final List<String> component6() {
        return this.options;
    }

    @NotNull
    public final TicketAttribute copy(int i10, @NotNull String name, @NotNull String type, boolean z10, @Nullable String str, @NotNull List<String> options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(options, "options");
        return new TicketAttribute(i10, name, type, z10, str, options);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketAttribute)) {
            return false;
        }
        TicketAttribute ticketAttribute = (TicketAttribute) obj;
        return this.f291542id == ticketAttribute.f291542id && Intrinsics.areEqual(this.name, ticketAttribute.name) && Intrinsics.areEqual(this.type, ticketAttribute.type) && this.required == ticketAttribute.required && Intrinsics.areEqual(this.identifier, ticketAttribute.identifier) && Intrinsics.areEqual(this.options, ticketAttribute.options);
    }

    public final int getId() {
        return this.f291542id;
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<String> getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.f291542id) * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.required)) * 31;
        String str = this.identifier;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.options.hashCode();
    }

    @NotNull
    public String toString() {
        return "TicketAttribute(id=" + this.f291542id + ", name=" + this.name + ", type=" + this.type + ", required=" + this.required + ", identifier=" + this.identifier + ", options=" + this.options + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f291542id);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeInt(this.required ? 1 : 0);
        dest.writeString(this.identifier);
        dest.writeStringList(this.options);
    }

    public /* synthetic */ TicketAttribute(int i10, String str, String str2, boolean z10, String str3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, z10, str3, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list);
    }
}
