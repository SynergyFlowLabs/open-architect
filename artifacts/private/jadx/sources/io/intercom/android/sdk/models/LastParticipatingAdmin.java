package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.l1;
import androidx.annotation.p0;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class LastParticipatingAdmin implements Parcelable {
    private static final String LINKED_IN = "linkedin";
    private static final String TWITTER = "twitter";
    private final Avatar avatar;
    private final String firstName;
    private final String intro;
    private final boolean isActive;
    private final boolean isBot;
    private final String jobTitle;
    private final long lastActiveAt;
    private final SocialAccount linkedIn;
    private final Location location;
    private final SocialAccount twitter;
    public static final Parcelable.Creator<LastParticipatingAdmin> CREATOR = new Parcelable.Creator<LastParticipatingAdmin>() { // from class: io.intercom.android.sdk.models.LastParticipatingAdmin.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LastParticipatingAdmin createFromParcel(Parcel parcel) {
            return new LastParticipatingAdmin(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LastParticipatingAdmin[] newArray(int i10) {
            return new LastParticipatingAdmin[i10];
        }
    };
    public static final LastParticipatingAdmin NULL = new LastParticipatingAdmin(new Builder());
    public static final LastParticipatingAdmin NONE = new LastParticipatingAdmin(new Builder());

    public static final class Builder {

        @p0
        Avatar.Builder avatar;

        @p0
        String first_name;

        @p0
        String intro;
        boolean is_active;
        boolean is_bot;

        @p0
        String job_title;
        long last_active_at;

        @p0
        Location.Builder location;

        @p0
        List<SocialAccount.Builder> social_accounts;

        public LastParticipatingAdmin build() {
            return new LastParticipatingAdmin(this);
        }

        @l1
        public Builder withAvatar(Avatar.Builder builder) {
            this.avatar = builder;
            return this;
        }

        @l1
        public Builder withFirstName(String str) {
            this.first_name = str;
            return this;
        }

        @l1
        public Builder withIntro(String str) {
            this.intro = str;
            return this;
        }

        @l1
        public Builder withIsBot(Boolean bool) {
            this.is_bot = bool.booleanValue();
            return this;
        }

        @l1
        public Builder withJobTitle(String str) {
            this.job_title = str;
            return this;
        }
    }

    public LastParticipatingAdmin(Builder builder) {
        SocialAccount socialAccount;
        Avatar.Builder builder2 = builder.avatar;
        this.avatar = (builder2 == null ? new Avatar.Builder() : builder2).build();
        this.firstName = NullSafety.valueOrEmpty(builder.first_name);
        this.intro = NullSafety.valueOrEmpty(builder.intro);
        this.jobTitle = NullSafety.valueOrEmpty(builder.job_title);
        Location.Builder builder3 = builder.location;
        this.location = (builder3 == null ? new Location.Builder() : builder3).build();
        this.lastActiveAt = builder.last_active_at;
        this.isActive = builder.is_active;
        this.isBot = builder.is_bot;
        SocialAccount socialAccount2 = SocialAccount.NULL;
        List<SocialAccount.Builder> list = builder.social_accounts;
        if (list != null) {
            Iterator<SocialAccount.Builder> it = list.iterator();
            socialAccount = socialAccount2;
            while (it.hasNext()) {
                SocialAccount socialAccountBuild = it.next().build();
                if (TWITTER.equals(socialAccountBuild.getProvider())) {
                    socialAccount2 = socialAccountBuild;
                } else if (LINKED_IN.equals(socialAccountBuild.getProvider())) {
                    socialAccount = socialAccountBuild;
                }
            }
        } else {
            socialAccount = socialAccount2;
        }
        this.twitter = socialAccount2;
        this.linkedIn = socialAccount;
    }

    public static boolean isNull(@p0 LastParticipatingAdmin lastParticipatingAdmin) {
        return lastParticipatingAdmin != NONE && (NULL.equals(lastParticipatingAdmin) || lastParticipatingAdmin == null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Avatar getAvatar() {
        return this.avatar;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getIntro() {
        return this.intro;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public long getLastActiveAt() {
        return this.lastActiveAt;
    }

    public SocialAccount getLinkedIn() {
        return this.linkedIn;
    }

    public Location getLocation() {
        return this.location;
    }

    public SocialAccount getTwitter() {
        return this.twitter;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean isBot() {
        return this.isBot;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.lastActiveAt);
        parcel.writeByte(this.isActive ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.avatar);
        parcel.writeString(this.firstName);
        parcel.writeString(this.intro);
        parcel.writeString(this.jobTitle);
        parcel.writeValue(this.location);
        parcel.writeValue(this.twitter);
        parcel.writeValue(this.linkedIn);
        parcel.writeByte(this.isBot ? (byte) 1 : (byte) 0);
    }

    LastParticipatingAdmin(Parcel parcel) {
        this.lastActiveAt = parcel.readLong();
        this.isActive = parcel.readByte() != 0;
        this.avatar = (Avatar) parcel.readValue(Avatar.class.getClassLoader());
        this.firstName = parcel.readString();
        this.intro = parcel.readString();
        this.jobTitle = parcel.readString();
        this.location = (Location) parcel.readValue(Location.class.getClassLoader());
        this.twitter = (SocialAccount) parcel.readValue(SocialAccount.class.getClassLoader());
        this.linkedIn = (SocialAccount) parcel.readValue(SocialAccount.class.getClassLoader());
        this.isBot = parcel.readByte() != 0;
    }
}
