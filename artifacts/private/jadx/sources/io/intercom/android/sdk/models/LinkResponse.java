package io.intercom.android.sdk.models;

/* JADX INFO: loaded from: classes13.dex */
public class LinkResponse extends BaseResponse {
    private final Link link;

    public static final class Builder extends BaseResponse.Builder {
        Link.Builder article;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public LinkResponse build() {
            return new LinkResponse(this);
        }
    }

    LinkResponse(Builder builder) {
        super(builder);
        Link.Builder builder2 = builder.article;
        this.link = builder2 == null ? new Link.Builder().build() : builder2.build();
    }

    public Link getLink() {
        return this.link;
    }
}
