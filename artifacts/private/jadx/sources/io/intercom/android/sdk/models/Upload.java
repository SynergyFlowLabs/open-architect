package io.intercom.android.sdk.models;

import androidx.annotation.p0;
import io.intercom.android.sdk.utilities.NullSafety;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class Upload {

    public static final class Builder {

        @p0
        String acl;

        @p0
        String aws_access_key;

        @p0
        String content_type;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        int f293126id;

        @p0
        String key;

        @p0
        UploadMetadata metadata;

        @p0
        String policy;

        @p0
        String public_url;

        @p0
        String signature;

        @p0
        String success_action_status;

        @p0
        String upload_destination;

        private UploadMetadata defaultMetadataBuilder() {
            UploadMetadata uploadMetadata = this.metadata;
            return uploadMetadata != null ? uploadMetadata : new UploadMetadata("");
        }

        public Upload build() {
            return new AutoValue_Upload(this.f293126id, NullSafety.valueOrEmpty(this.acl), NullSafety.valueOrEmpty(this.aws_access_key), NullSafety.valueOrEmpty(this.content_type), NullSafety.valueOrEmpty(this.key), NullSafety.valueOrEmpty(this.policy), NullSafety.valueOrEmpty(this.public_url), NullSafety.valueOrEmpty(this.signature), NullSafety.valueOrEmpty(this.success_action_status), NullSafety.valueOrEmpty(this.upload_destination), defaultMetadataBuilder());
        }
    }

    public abstract String getAcl();

    public abstract String getAwsAccessKey();

    public abstract String getContentType();

    public abstract int getId();

    public abstract String getKey();

    public abstract UploadMetadata getMetadata();

    public abstract String getPolicy();

    public abstract String getPublicUrl();

    public abstract String getSignature();

    public abstract String getSuccessActionStatus();

    public abstract String getUploadDestination();
}
