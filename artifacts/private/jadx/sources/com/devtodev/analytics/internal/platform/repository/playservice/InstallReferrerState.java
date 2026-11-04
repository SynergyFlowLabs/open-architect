package com.devtodev.analytics.internal.platform.repository.playservice;

import h4.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstallReferrerState {

    public static final class DeadObjectException extends InstallReferrerState {

        @NotNull
        public static final DeadObjectException INSTANCE = new DeadObjectException();

        private DeadObjectException() {
            super(null);
        }
    }

    public static final class FeatureNotSupported extends InstallReferrerState {

        @NotNull
        public static final FeatureNotSupported INSTANCE = new FeatureNotSupported();

        private FeatureNotSupported() {
            super(null);
        }
    }

    public static final class InstallReferrerData extends InstallReferrerState {
        private final boolean googlePlayInstantParam;
        private final long installBeginTimeStampSeconds;

        @NotNull
        private final String installReferrer;
        private final long referrerClickTimestampSeconds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstallReferrerData(@NotNull String installReferrer, boolean z10, long j10, long j11) {
            super(null);
            Intrinsics.checkNotNullParameter(installReferrer, "installReferrer");
            this.installReferrer = installReferrer;
            this.googlePlayInstantParam = z10;
            this.installBeginTimeStampSeconds = j10;
            this.referrerClickTimestampSeconds = j11;
        }

        public static /* synthetic */ InstallReferrerData copy$default(InstallReferrerData installReferrerData, String str, boolean z10, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = installReferrerData.installReferrer;
            }
            if ((i10 & 2) != 0) {
                z10 = installReferrerData.googlePlayInstantParam;
            }
            if ((i10 & 4) != 0) {
                j10 = installReferrerData.installBeginTimeStampSeconds;
            }
            if ((i10 & 8) != 0) {
                j11 = installReferrerData.referrerClickTimestampSeconds;
            }
            long j12 = j11;
            return installReferrerData.copy(str, z10, j10, j12);
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
        public final InstallReferrerData copy(@NotNull String installReferrer, boolean z10, long j10, long j11) {
            Intrinsics.checkNotNullParameter(installReferrer, "installReferrer");
            return new InstallReferrerData(installReferrer, z10, j10, j11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstallReferrerData)) {
                return false;
            }
            InstallReferrerData installReferrerData = (InstallReferrerData) obj;
            return Intrinsics.areEqual(this.installReferrer, installReferrerData.installReferrer) && this.googlePlayInstantParam == installReferrerData.googlePlayInstantParam && this.installBeginTimeStampSeconds == installReferrerData.installBeginTimeStampSeconds && this.referrerClickTimestampSeconds == installReferrerData.referrerClickTimestampSeconds;
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
            return "InstallReferrerData(installReferrer=" + this.installReferrer + ", googlePlayInstantParam=" + this.googlePlayInstantParam + ", installBeginTimeStampSeconds=" + this.installBeginTimeStampSeconds + ", referrerClickTimestampSeconds=" + this.referrerClickTimestampSeconds + ")";
        }
    }

    public static final class NoInstallReferrerImplementation extends InstallReferrerState {

        @NotNull
        public static final NoInstallReferrerImplementation INSTANCE = new NoInstallReferrerImplementation();

        private NoInstallReferrerImplementation() {
            super(null);
        }
    }

    public static final class ReceiveStateFail extends InstallReferrerState {

        @NotNull
        public static final ReceiveStateFail INSTANCE = new ReceiveStateFail();

        private ReceiveStateFail() {
            super(null);
        }
    }

    public static final class SecurityException extends InstallReferrerState {

        @NotNull
        public static final SecurityException INSTANCE = new SecurityException();

        private SecurityException() {
            super(null);
        }
    }

    public static final class ServiceUnavailable extends InstallReferrerState {

        @NotNull
        public static final ServiceUnavailable INSTANCE = new ServiceUnavailable();

        private ServiceUnavailable() {
            super(null);
        }
    }

    public /* synthetic */ InstallReferrerState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InstallReferrerState() {
    }
}
