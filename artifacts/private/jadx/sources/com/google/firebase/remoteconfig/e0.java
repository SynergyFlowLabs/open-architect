package com.google.firebase.remoteconfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f124447a = "https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f124448b = "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations";

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* JADX INFO: renamed from: j2, reason: collision with root package name */
        public static final String f124449j2 = "experimentId";

        /* JADX INFO: renamed from: k2, reason: collision with root package name */
        public static final String f124450k2 = "variantId";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        /* JADX INFO: renamed from: l2, reason: collision with root package name */
        public static final String f124451l2 = "appInstanceId";

        /* JADX INFO: renamed from: m2, reason: collision with root package name */
        public static final String f124452m2 = "appInstanceIdToken";

        /* JADX INFO: renamed from: n2, reason: collision with root package name */
        public static final String f124453n2 = "appId";

        /* JADX INFO: renamed from: o2, reason: collision with root package name */
        public static final String f124454o2 = "countryCode";

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        public static final String f124455p2 = "languageCode";

        /* JADX INFO: renamed from: q2, reason: collision with root package name */
        public static final String f124456q2 = "platformVersion";

        /* JADX INFO: renamed from: r2, reason: collision with root package name */
        public static final String f124457r2 = "timeZone";

        /* JADX INFO: renamed from: s2, reason: collision with root package name */
        public static final String f124458s2 = "appVersion";

        /* JADX INFO: renamed from: t2, reason: collision with root package name */
        public static final String f124459t2 = "appBuild";

        /* JADX INFO: renamed from: u2, reason: collision with root package name */
        public static final String f124460u2 = "packageName";

        /* JADX INFO: renamed from: v2, reason: collision with root package name */
        public static final String f124461v2 = "sdkVersion";

        /* JADX INFO: renamed from: w2, reason: collision with root package name */
        public static final String f124462w2 = "analyticsUserProperties";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final String f124463x2 = "firstOpenTime";

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        public static final String f124464y2 = "customSignals";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
        public static final String A2 = "experimentDescriptions";
        public static final String B2 = "personalizationMetadata";
        public static final String C2 = "state";
        public static final String D2 = "templateVersion";
        public static final String E2 = "rolloutMetadata";

        /* JADX INFO: renamed from: z2, reason: collision with root package name */
        public static final String f124465z2 = "entries";
    }

    private e0() {
    }
}
