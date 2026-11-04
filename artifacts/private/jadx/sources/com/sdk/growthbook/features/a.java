package com.sdk.growthbook.features;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    @NotNull
    public static final C1846a Companion = new C1846a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f266228a = "api/features";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f266229b = "sub";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f266230c = "api/eval";

    /* JADX INFO: renamed from: com.sdk.growthbook.features.a$a, reason: collision with other inner class name */
    public static final class C1846a {
        public /* synthetic */ C1846a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1846a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f266231a;

        static {
            int[] iArr = new int[com.sdk.growthbook.utils.i.values().length];
            try {
                iArr[com.sdk.growthbook.utils.i.STALE_WHILE_REVALIDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.sdk.growthbook.utils.i.SERVER_SENT_EVENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.sdk.growthbook.utils.i.SERVER_SENT_REMOTE_FEATURE_EVAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f266231a = iArr;
        }
    }

    public static /* synthetic */ String b(a aVar, String str, String str2, com.sdk.growthbook.utils.i iVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            iVar = com.sdk.growthbook.utils.i.STALE_WHILE_REVALIDATE;
        }
        return aVar.a(str, str2, iVar);
    }

    @NotNull
    public final String a(@NotNull String baseUrl, @NotNull String apiKey, @NotNull com.sdk.growthbook.utils.i featureRefreshStrategy) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(featureRefreshStrategy, "featureRefreshStrategy");
        int i10 = b.f266231a[featureRefreshStrategy.ordinal()];
        if (i10 == 1) {
            str = f266228a;
        } else if (i10 == 2) {
            str = "sub";
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            str = f266230c;
        }
        if (StringsKt.a3(baseUrl, '/', false, 2, null)) {
            str2 = baseUrl + str;
        } else {
            str2 = baseUrl + "/" + str;
        }
        return str2 + "/" + apiKey;
    }
}
