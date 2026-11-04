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
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@d
public final class EventData implements Parcelable {

    @c("eventAsPlainText")
    @Nullable
    private final String _eventAsPlainText;

    @c("eventContent")
    @Nullable
    private final List<EventContent> _eventContent;

    @c("participant")
    @Nullable
    private final EventParticipant.Builder _participant;

    @c("status")
    @Nullable
    private final String _status;

    @c("customStateLabel")
    @Nullable
    private final String customStateLabel;

    @c("customStatePrefix")
    @Nullable
    private final String customStatePrefix;

    @Nullable
    private final String description;

    @Nullable
    private final String mergedConversationId;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<EventData> CREATOR = new Creator();

    @f
    @NotNull
    public static final EventData NULL = new EventData(null, null, null, null, null, null, null, null, 255, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<EventData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            EventParticipant.Builder builder = (EventParticipant.Builder) parcel.readValue(EventData.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(EventContent.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new EventData(builder, string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventData[] newArray(int i10) {
            return new EventData[i10];
        }
    }

    public EventData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    private final EventParticipant.Builder component1() {
        return this._participant;
    }

    private final String component2() {
        return this._eventAsPlainText;
    }

    private final List<EventContent> component3() {
        return this._eventContent;
    }

    private final String component4() {
        return this._status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventData copy$default(EventData eventData, EventParticipant.Builder builder, String str, List list, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            builder = eventData._participant;
        }
        if ((i10 & 2) != 0) {
            str = eventData._eventAsPlainText;
        }
        if ((i10 & 4) != 0) {
            list = eventData._eventContent;
        }
        if ((i10 & 8) != 0) {
            str2 = eventData._status;
        }
        if ((i10 & 16) != 0) {
            str3 = eventData.customStateLabel;
        }
        if ((i10 & 32) != 0) {
            str4 = eventData.customStatePrefix;
        }
        if ((i10 & 64) != 0) {
            str5 = eventData.mergedConversationId;
        }
        if ((i10 & 128) != 0) {
            str6 = eventData.description;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return eventData.copy(builder, str, list, str2, str9, str10, str7, str8);
    }

    @Nullable
    public final String component5() {
        return this.customStateLabel;
    }

    @Nullable
    public final String component6() {
        return this.customStatePrefix;
    }

    @Nullable
    public final String component7() {
        return this.mergedConversationId;
    }

    @Nullable
    public final String component8() {
        return this.description;
    }

    @NotNull
    public final EventData copy(@Nullable EventParticipant.Builder builder, @Nullable String str, @Nullable List<EventContent> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new EventData(builder, str, list, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) obj;
        return Intrinsics.areEqual(this._participant, eventData._participant) && Intrinsics.areEqual(this._eventAsPlainText, eventData._eventAsPlainText) && Intrinsics.areEqual(this._eventContent, eventData._eventContent) && Intrinsics.areEqual(this._status, eventData._status) && Intrinsics.areEqual(this.customStateLabel, eventData.customStateLabel) && Intrinsics.areEqual(this.customStatePrefix, eventData.customStatePrefix) && Intrinsics.areEqual(this.mergedConversationId, eventData.mergedConversationId) && Intrinsics.areEqual(this.description, eventData.description);
    }

    @Nullable
    public final String getCustomStateLabel() {
        return this.customStateLabel;
    }

    @Nullable
    public final String getCustomStatePrefix() {
        return this.customStatePrefix;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getEventAsPlainText() {
        String str = this._eventAsPlainText;
        if (str == null) {
            str = "";
        }
        return str;
    }

    @NotNull
    public final List<EventContent> getEventContent() {
        List<EventContent> listEmptyList = this._eventContent;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    @Nullable
    public final String getMergedConversationId() {
        return this.mergedConversationId;
    }

    @NotNull
    public final EventParticipant getParticipant() {
        EventParticipant eventParticipantBuild;
        EventParticipant.Builder builder = this._participant;
        if (builder != null && (eventParticipantBuild = builder.build()) != null) {
            return eventParticipantBuild;
        }
        EventParticipant NULL2 = EventParticipant.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL2, "NULL");
        return NULL2;
    }

    @NotNull
    public final String getStatus() {
        String str = this._status;
        return str == null ? "" : str;
    }

    public int hashCode() {
        EventParticipant.Builder builder = this._participant;
        int iHashCode = (builder == null ? 0 : builder.hashCode()) * 31;
        String str = this._eventAsPlainText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<EventContent> list = this._eventContent;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this._status;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customStateLabel;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customStatePrefix;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mergedConversationId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EventData(_participant=" + this._participant + ", _eventAsPlainText=" + this._eventAsPlainText + ", _eventContent=" + this._eventContent + ", _status=" + this._status + ", customStateLabel=" + this.customStateLabel + ", customStatePrefix=" + this.customStatePrefix + ", mergedConversationId=" + this.mergedConversationId + ", description=" + this.description + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeValue(this._participant);
        dest.writeString(this._eventAsPlainText);
        List<EventContent> list = this._eventContent;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<EventContent> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, i10);
            }
        }
        dest.writeString(this._status);
        dest.writeString(this.customStateLabel);
        dest.writeString(this.customStatePrefix);
        dest.writeString(this.mergedConversationId);
        dest.writeString(this.description);
    }

    public EventData(@Nullable EventParticipant.Builder builder, @Nullable String str, @Nullable List<EventContent> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this._participant = builder;
        this._eventAsPlainText = str;
        this._eventContent = list;
        this._status = str2;
        this.customStateLabel = str3;
        this.customStatePrefix = str4;
        this.mergedConversationId = str5;
        this.description = str6;
    }

    public /* synthetic */ EventData(EventParticipant.Builder builder, String str, List list, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : builder, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : str6);
    }
}
