package com.devtodev.analytics.internal.platform.repository.playservice;

import h4.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReferrerState {

    public static final class BindNotAllowed extends ReferrerState {

        @NotNull
        public static final BindNotAllowed INSTANCE = new BindNotAllowed();

        private BindNotAllowed() {
            super(null);
        }
    }

    public static final class FeatureNotSupported extends ReferrerState {

        @NotNull
        public static final FeatureNotSupported INSTANCE = new FeatureNotSupported();

        private FeatureNotSupported() {
            super(null);
        }
    }

    public static final class NoInstallReferrerImplementation extends ReferrerState {

        @NotNull
        public static final NoInstallReferrerImplementation INSTANCE = new NoInstallReferrerImplementation();

        private NoInstallReferrerImplementation() {
            super(null);
        }
    }

    public static final class ReceiveStateFail extends ReferrerState {

        @NotNull
        public static final ReceiveStateFail INSTANCE = new ReceiveStateFail();

        private ReceiveStateFail() {
            super(null);
        }
    }

    public static final class ReferrerData extends ReferrerState {
        private final boolean googlePlayInstantParam;
        private final long installBeginTimeStampSeconds;

        @NotNull
        private final String installReferrer;
        private final long referrerClickTimestampSeconds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReferrerData(@NotNull String installReferrer, boolean z10, long j10, long j11) {
            super(null);
            Intrinsics.checkNotNullParameter(installReferrer, "installReferrer");
            this.installReferrer = installReferrer;
            this.googlePlayInstantParam = z10;
            this.installBeginTimeStampSeconds = j10;
            this.referrerClickTimestampSeconds = j11;
        }

        public static /* synthetic */ ReferrerData copy$default(ReferrerData referrerData, String str, boolean z10, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = referrerData.installReferrer;
            }
            if ((i10 & 2) != 0) {
                z10 = referrerData.googlePlayInstantParam;
            }
            if ((i10 & 4) != 0) {
                j10 = referrerData.installBeginTimeStampSeconds;
            }
            if ((i10 & 8) != 0) {
                j11 = referrerData.referrerClickTimestampSeconds;
            }
            long j12 = j11;
            return referrerData.copy(str, z10, j10, j12);
        }

        @NotNull
        public final String component1() {
            return this.installReferrer;
        }

        public final boolean component2() {
            return this.googlePlayInstantParam;
        }

        public final long component3() {
            return this.installBeginTimeStampSeconds;
        }

        public final long component4() {
            return this.referrerClickTimestampSeconds;
        }

        @NotNull
        public final ReferrerData copy(@NotNull String installReferrer, boolean z10, long j10, long j11) {
            Intrinsics.checkNotNullParameter(installReferrer, "installReferrer");
            return new ReferrerData(installReferrer, z10, j10, j11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReferrerData)) {
                return false;
            }
            ReferrerData referrerData = (ReferrerData) obj;
            return Intrinsics.areEqual(this.installReferrer, referrerData.installReferrer) && this.googlePlayInstantParam == referrerData.googlePlayInstantParam && this.installBeginTimeStampSeconds == referrerData.installBeginTimeStampSeconds && this.referrerClickTimestampSeconds == referrerData.referrerClickTimestampSeconds;
        }

        public final boolean getGooglePlayInstantParam() {
            return this.googlePlayInstantParam;
        }

        public final long getInstallBeginTimeStampSeconds() {
            return this.installBeginTimeStampSeconds;
        }

        @NotNull
        public final String getInstallReferrer() {
            return this.installReferrer;
        }

        public final long getReferrerClickTimestampSeconds() {
            return this.referrerClickTimestampSeconds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public int hashCode() {
            int iHashCode = this.installReferrer.hashCode() * 31;
            boolean z10 = this.googlePlayInstantParam;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return Long.hashCode(this.referrerClickTimestampSeconds) + a.a(this.installBeginTimeStampSeconds, (iHashCode + r10) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "ReferrerData(installReferrer=" + this.installReferrer + ", googlePlayInstantParam=" + this.googlePlayInstantParam + ", installBeginTimeStampSeconds=" + this.installBeginTimeStampSeconds + ", referrerClickTimestampSeconds=" + this.referrerClickTimestampSeconds + ")";
        }
    }

    public static final class ServiceConnectionEnded extends ReferrerState {

        @NotNull
        public static final ServiceConnectionEnded INSTANCE = new ServiceConnectionEnded();

        private ServiceConnectionEnded() {
            super(null);
        }
    }

    public static final class ServiceDisconnected extends ReferrerState {

        @NotNull
        public static final ServiceDisconnected INSTANCE = new ServiceDisconnected();

        private ServiceDisconnected() {
            super(null);
        }
    }

    public static final class ServiceUnavailable extends ReferrerState {

        @NotNull
        public static final ServiceUnavailable INSTANCE = new ServiceUnavailable();

        private ServiceUnavailable() {
            super(null);
        }
    }

    public /* synthetic */ ReferrerState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ReferrerState() {
    }
}
