package io.intercom.android.sdk.models.carousel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.utilities.NullSafety;
import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class CarouselScreen implements Parcelable {
    public static CarouselScreen NULL = new Builder().build();
    public static final Parcelable.Creator<CarouselScreen> CREATOR = new Parcelable.Creator<CarouselScreen>() { // from class: io.intercom.android.sdk.models.carousel.CarouselScreen.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarouselScreen createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, ScreenAction.class.getClassLoader());
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, ScreenAction.class.getClassLoader());
            return CarouselScreen.create(parcel.readString(), parcel.readString(), parcel.readString(), arrayList, arrayList2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarouselScreen[] newArray(int i10) {
            return new CarouselScreen[i10];
        }
    };

    public static final class Builder {

        @p0
        List<ScreenAction.Builder> actions;

        @p0
        String background_color;

        @p0
        List<Block.Builder> blocks;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @p0
        String f293129id;

        @p0
        String text_color;

        @p0
        String vertical_alignment;

        public CarouselScreen build() {
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.actions));
            List<ScreenAction.Builder> list = this.actions;
            if (list != null) {
                for (ScreenAction.Builder builder : list) {
                    if (builder != null) {
                        arrayList.add(builder.build());
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionUtils.capacityFor(this.blocks));
            List<Block.Builder> list2 = this.blocks;
            if (list2 != null) {
                for (Block.Builder builder2 : list2) {
                    if (builder2 != null) {
                        arrayList2.add(builder2.build());
                    }
                }
            }
            return CarouselScreen.create(NullSafety.valueOrEmpty(this.f293129id), NullSafety.valueOrEmpty(this.background_color), NullSafety.valueOrEmpty(this.text_color), arrayList2, arrayList, NullSafety.valueOrEmpty(this.vertical_alignment));
        }

        public Builder withActions(List<ScreenAction.Builder> list) {
            this.actions = list;
            return this;
        }

        public Builder withBackgroundColor(String str) {
            this.background_color = str;
            return this;
        }

        public Builder withBlocks(List<Block.Builder> list) {
            this.blocks = list;
            return this;
        }

        public Builder withId(String str) {
            this.f293129id = str;
            return this;
        }

        public Builder withTextColor(String str) {
            this.text_color = str;
            return this;
        }

        public Builder withVerticalAlignment(String str) {
            this.vertical_alignment = str;
            return this;
        }
    }

    public static CarouselScreen create(String str, String str2, String str3, List<Block> list, List<ScreenAction> list2, String str4) {
        return new AutoValue_CarouselScreen(str, str2, str3, list, list2, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract List<ScreenAction> getActions();

    public abstract String getBackgroundColor();

    public abstract List<Block> getBlocks();

    public int getGravity() {
        if (VerticalAlignment.BOTTOM.equals(getVerticalAlignment())) {
            return 80;
        }
        return "center".equals(getVerticalAlignment()) ? 16 : 48;
    }

    public abstract String getId();

    public ScreenAction getPermissionAction() {
        for (ScreenAction screenAction : getActions()) {
            if (screenAction.isPermissionAction()) {
                return screenAction;
            }
        }
        return ScreenAction.NULL;
    }

    public abstract String getTextColor();

    public abstract String getVerticalAlignment();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(getBlocks());
        parcel.writeList(getActions());
        parcel.writeString(getId());
        parcel.writeString(getBackgroundColor());
        parcel.writeString(getTextColor());
        parcel.writeString(getVerticalAlignment());
    }
}
