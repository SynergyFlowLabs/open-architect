package io.intercom.android.sdk.models.carousel;

import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class CarouselResponse {

    public static final class Builder {
        Carousel.Builder carousel;

        public CarouselResponse build() {
            Carousel.Builder builder = this.carousel;
            if (builder == null) {
                builder = Carousel.NULL_BUILDER;
            }
            return CarouselResponse.create(builder);
        }

        public Builder withCarousel(Carousel.Builder builder) {
            this.carousel = builder;
            return this;
        }
    }

    static CarouselResponse create(Carousel.Builder builder) {
        return new AutoValue_CarouselResponse(builder);
    }

    public abstract Carousel.Builder carousel();
}
