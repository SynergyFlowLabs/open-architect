package io.intercom.android.sdk.models.carousel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.utilities.NullSafety;
import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class ScreenAction implements Parcelable {
    private static final String PERMISSION_TYPE_SUFFIX = "permission";
    public static ScreenAction NULL = new Builder().build();
    public static final Parcelable.Creator<ScreenAction> CREATOR = new Parcelable.Creator<ScreenAction>() { // from class: io.intercom.android.sdk.models.carousel.ScreenAction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScreenAction createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, String.class.getClassLoader());
            return ScreenAction.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScreenAction[] newArray(int i10) {
            return new ScreenAction[i10];
        }
    };

    public static final class Builder {

        @p0
        List<String> android_permissions;

        @p0
        String background_color;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @p0
        String f293130id;

        @p0
        String text_color;

        @p0
        String title;

        @p0
        String type;

        @p0
        String uri;

        public ScreenAction build() {
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.android_permissions));
            List<String> list = this.android_permissions;
            if (list != null) {
                for (String str : list) {
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            }
            return ScreenAction.create(NullSafety.valueOrEmpty(this.f293130id), NullSafety.valueOrEmpty(this.type), NullSafety.valueOrEmpty(this.title), NullSafety.valueOrEmpty(this.text_color), NullSafety.valueOrEmpty(this.background_color), NullSafety.valueOrEmpty(this.uri), arrayList);
        }

        public Builder withBackgroundColor(String str) {
            this.background_color = str;
            return this;
        }

        public Builder withId(String str) {
            this.f293130id = str;
            return this;
        }

        public Builder withPermissions(List<String> list) {
            this.android_permissions = list;
            return this;
        }

        public Builder withTextColor(String str) {
            this.text_color = str;
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withUri(String str) {
            this.uri = str;
            return this;
        }
    }

    public static ScreenAction create(String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        return new AutoValue_ScreenAction(str, str2, str3, str4, str5, str6, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract List<String> getAndroidPermissions();

    public abstract String getBackgroundColor();

    public abstract String getId();

    public abstract String getTextColor();

    public abstract String getTitle();

    public abstract String getType();

    public abstract String getUri();

    public List<String> getValidPermissions(PermissionManager permissionManager) {
        return permissionManager.permissionsExistInManifest(getAndroidPermissions());
    }

    public boolean isPermissionAction() {
        return getType().contains(PERMISSION_TYPE_SUFFIX);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(getAndroidPermissions());
        parcel.writeString(getId());
        parcel.writeString(getType());
        parcel.writeString(getTitle());
        parcel.writeString(getTextColor());
        parcel.writeString(getBackgroundColor());
        parcel.writeString(getUri());
    }
}
