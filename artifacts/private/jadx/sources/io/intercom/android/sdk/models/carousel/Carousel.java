package io.intercom.android.sdk.models.carousel;

import androidx.annotation.p0;
import io.intercom.android.sdk.utilities.NullSafety;
import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class Carousel {
    public static final int ENTITY_TYPE = 44;
    public static final Carousel NULL;
    public static final Builder NULL_BUILDER;

    public static final class Builder {

        @p0
        Boolean dismissible;

        @p0
        String instance_id;

        @p0
        List<CarouselScreen.Builder> screens;

        public Carousel build() {
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.screens));
            List<CarouselScreen.Builder> list = this.screens;
            if (list != null) {
                for (CarouselScreen.Builder builder : list) {
                    if (builder != null) {
                        arrayList.add(builder.build());
                    }
                }
            }
            return Carousel.create(arrayList, NullSafety.valueOrDefault(this.dismissible, true), NullSafety.valueOrEmpty(this.instance_id));
        }

        public Builder withDismissible(Boolean bool) {
            this.dismissible = bool;
            return this;
        }

        public Builder withInstanceId(String str) {
            this.instance_id = str;
            return this;
        }

        public Builder withScreens(List<CarouselScreen.Builder> list) {
            this.screens = list;
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        NULL_BUILDER = builder;
        NULL = builder.build();
    }

    static Carousel create(List<CarouselScreen> list, boolean z10, String str) {
        return new AutoValue_Carousel(list, z10, str);
    }

    public abstract String getInstanceId();

    public abstract List<CarouselScreen> getScreens();

    public abstract boolean isDismissible();
}
