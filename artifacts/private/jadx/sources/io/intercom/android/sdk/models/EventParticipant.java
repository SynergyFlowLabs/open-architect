package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: loaded from: classes13.dex */
public class EventParticipant implements Parcelable {
    private final Avatar avatar;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f293116id;
    private final String initial;
    private final String label;
    private final String type;
    public static final EventParticipant NULL = new EventParticipant(new Builder());
    public static final Parcelable.Creator<EventParticipant> CREATOR = new Parcelable.Creator<EventParticipant>() { // from class: io.intercom.android.sdk.models.EventParticipant.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventParticipant createFromParcel(Parcel parcel) {
            return new EventParticipant(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventParticipant[] newArray(int i10) {
            return new EventParticipant[i10];
        }
    };

    public static final class Builder {

        @p0
        Avatar.Builder avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @p0
        String f293117id;

        @p0
        String initial;

        @p0
        String label;

        @p0
        String type;

        public EventParticipant build() {
            return new EventParticipant(this);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Avatar getAvatar() {
        return this.avatar;
    }

    public String getId() {
        return this.f293116id;
    }

    public String getInitial() {
        return this.initial;
    }

    public String getLabel() {
        return this.label;
    }

    public String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f293116id);
        parcel.writeString(this.initial);
        parcel.writeString(this.label);
        parcel.writeString(this.type);
        parcel.writeValue(this.avatar);
    }

    private EventParticipant(Builder builder) {
        this.f293116id = NullSafety.valueOrEmpty(builder.f293117id);
        this.initial = NullSafety.valueOrEmpty(builder.initial);
        this.label = NullSafety.valueOrEmpty(builder.label);
        this.type = NullSafety.valueOrEmpty(builder.type);
        Avatar.Builder builder2 = builder.avatar;
        this.avatar = (builder2 == null ? new Avatar.Builder() : builder2).build();
    }

    protected EventParticipant(Parcel parcel) {
        this.f293116id = parcel.readString();
        this.initial = parcel.readString();
        this.label = parcel.readString();
        this.type = parcel.readString();
        this.avatar = (Avatar) parcel.readValue(Avatar.class.getClassLoader());
    }
}
