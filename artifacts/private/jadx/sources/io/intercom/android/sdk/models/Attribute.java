package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.core.motion.utils.v;
import com.google.gson.annotations.c;
import gk.d;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.rrweb.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@d
public final class Attribute implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Attribute> CREATOR = new Creator();

    @c("custom_bot_control_id")
    @Nullable
    private final String customBotControlId;

    @c("identifier")
    @NotNull
    private final String identifier;

    @c("multiline")
    @Nullable
    private final Boolean multiline;

    @c("name")
    @NotNull
    private final String name;

    @c(h.f306695g)
    @Nullable
    private final List<String> options;

    @c(MetricTracker.Action.SUBMITTED)
    private final boolean submitted;

    @c("type")
    @NotNull
    private final String type;

    @c("value")
    @Nullable
    private final String value;

    public static final class Creator implements Parcelable.Creator<Attribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute createFromParcel(Parcel parcel) {
            boolean z10;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
                z10 = true;
            } else {
                z10 = true;
            }
            String string4 = parcel.readString();
            boolean z12 = z10;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z12 : false);
            }
            return new Attribute(string, string2, string3, z11, string4, arrayListCreateStringArrayList, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute[] newArray(int i10) {
            return new Attribute[i10];
        }
    }

    public Attribute(@NotNull String identifier, @NotNull String name, @NotNull String type, boolean z10, @Nullable String str, @Nullable List<String> list, @Nullable Boolean bool, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.identifier = identifier;
        this.name = name;
        this.type = type;
        this.submitted = z10;
        this.customBotControlId = str;
        this.options = list;
        this.multiline = bool;
        this.value = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, String str2, String str3, boolean z10, String str4, List list, Boolean bool, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = attribute.identifier;
        }
        if ((i10 & 2) != 0) {
            str2 = attribute.name;
        }
        if ((i10 & 4) != 0) {
            str3 = attribute.type;
        }
        if ((i10 & 8) != 0) {
            z10 = attribute.submitted;
        }
        if ((i10 & 16) != 0) {
            str4 = attribute.customBotControlId;
        }
        if ((i10 & 32) != 0) {
            list = attribute.options;
        }
        if ((i10 & 64) != 0) {
            bool = attribute.multiline;
        }
        if ((i10 & 128) != 0) {
            str5 = attribute.value;
        }
        Boolean bool2 = bool;
        String str6 = str5;
        String str7 = str4;
        List list2 = list;
        return attribute.copy(str, str2, str3, z10, str7, list2, bool2, str6);
    }

    @NotNull
    public final String component1() {
        return this.identifier;
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
        return this.submitted;
    }

    @Nullable
    public final String component5() {
        return this.customBotControlId;
    }

    @Nullable
    public final List<String> component6() {
        return this.options;
    }

    @Nullable
    public final Boolean component7() {
        return this.multiline;
    }

    @Nullable
    public final String component8() {
        return this.value;
    }

    @NotNull
    public final Attribute copy(@NotNull String identifier, @NotNull String name, @NotNull String type, boolean z10, @Nullable String str, @Nullable List<String> list, @Nullable Boolean bool, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Attribute(identifier, name, type, z10, str, list, bool, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        return Intrinsics.areEqual(this.identifier, attribute.identifier) && Intrinsics.areEqual(this.name, attribute.name) && Intrinsics.areEqual(this.type, attribute.type) && this.submitted == attribute.submitted && Intrinsics.areEqual(this.customBotControlId, attribute.customBotControlId) && Intrinsics.areEqual(this.options, attribute.options) && Intrinsics.areEqual(this.multiline, attribute.multiline) && Intrinsics.areEqual(this.value, attribute.value);
    }

    @Nullable
    public final String getCustomBotControlId() {
        return this.customBotControlId;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final Boolean getMultiline() {
        return this.multiline;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<String> getOptions() {
        return this.options;
    }

    @NotNull
    public final String getRenderType() {
        String str = this.type;
        switch (str.hashCode()) {
            case -891985903:
                if (!str.equals(v.b.f43988e)) {
                    return "unknown";
                }
                List<String> list = this.options;
                if (list != null && !list.isEmpty()) {
                    return AttributeType.LIST;
                }
                String str2 = this.identifier;
                int iHashCode = str2.hashCode();
                if (iHashCode != 75849770) {
                    if (iHashCode != 96619420) {
                        if (iHashCode != 106642798) {
                            return "text";
                        }
                        if (!str2.equals("phone")) {
                            return "text";
                        }
                    } else if (!str2.equals("email")) {
                        return "text";
                    }
                } else if (!str2.equals(AttributeType.WEBSITE)) {
                    return "text";
                }
                return this.identifier;
            case 3076014:
                return !str.equals(AttributeType.DATE) ? "unknown" : AttributeType.DATE;
            case 64711720:
                return !str.equals("boolean") ? "unknown" : "boolean";
            case 97526364:
                return !str.equals("float") ? "unknown" : "float";
            case 1958052158:
                return !str.equals("integer") ? "unknown" : AttributeType.NUMBER;
            default:
                return "unknown";
        }
    }

    public final boolean getSubmitted() {
        return this.submitted;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final boolean hasValue() {
        String str = this.value;
        return !(str == null || str.length() == 0);
    }

    public int hashCode() {
        int iHashCode = ((((((this.identifier.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.submitted)) * 31;
        String str = this.customBotControlId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.options;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.multiline;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.value;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Attribute(identifier=" + this.identifier + ", name=" + this.name + ", type=" + this.type + ", submitted=" + this.submitted + ", customBotControlId=" + this.customBotControlId + ", options=" + this.options + ", multiline=" + this.multiline + ", value=" + this.value + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.identifier);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeInt(this.submitted ? 1 : 0);
        dest.writeString(this.customBotControlId);
        dest.writeStringList(this.options);
        Boolean bool = this.multiline;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeString(this.value);
    }

    public /* synthetic */ Attribute(String str, String str2, String str3, boolean z10, String str4, List list, Boolean bool, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z10, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : str5);
    }
}
