package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final a f100221t = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f100222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f100223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f100224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f100225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final EnumSet<a1> f100226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<String, Map<String, b>> f100227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f100228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final p f100229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f100230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final String f100231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f100232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f100233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final JSONArray f100234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final String f100235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f100236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f100237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private final String f100238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private final String f100239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f100240s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @Nullable
        public final b a(@NotNull String applicationId, @NotNull String actionName, @NotNull String featureName) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            if (actionName.length() == 0 || featureName.length() == 0) {
                return null;
            }
            b0 b0Var = b0.f99725a;
            x xVarF = b0.f(applicationId);
            Map<String, b> map = xVarF == null ? null : xVarF.c().get(actionName);
            if (map != null) {
                return map.get(featureName);
            }
            return null;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f100241e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final String f100242f = "|";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final String f100243g = "name";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final String f100244h = "versions";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final String f100245i = "url";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f100246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f100247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Uri f100248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final int[] f100249d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        int i12 = -1;
                        int iOptInt = jSONArray.optInt(i10, -1);
                        if (iOptInt == -1) {
                            String versionString = jSONArray.optString(i10);
                            e1 e1Var = e1.f99794a;
                            if (!e1.Z(versionString)) {
                                try {
                                    Intrinsics.checkNotNullExpressionValue(versionString, "versionString");
                                    i12 = Integer.parseInt(versionString);
                                } catch (NumberFormatException e10) {
                                    e1 e1Var2 = e1.f99794a;
                                    e1.f0(e1.f99795b, e10);
                                }
                                iOptInt = i12;
                            }
                        }
                        iArr[i10] = iOptInt;
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return iArr;
            }

            @Nullable
            public final b a(@NotNull JSONObject dialogConfigJSON) {
                Intrinsics.checkNotNullParameter(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                e1 e1Var = e1.f99794a;
                if (e1.Z(dialogNameWithFeature)) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(dialogNameWithFeature, "dialogNameWithFeature");
                List listSplit$default = StringsKt.split$default(dialogNameWithFeature, new String[]{b.f100242f}, false, 0, 6, null);
                if (listSplit$default.size() != 2) {
                    return null;
                }
                String str = (String) CollectionsKt.first(listSplit$default);
                String str2 = (String) CollectionsKt.last(listSplit$default);
                if (e1.Z(str) || e1.Z(str2)) {
                    return null;
                }
                String strOptString = dialogConfigJSON.optString("url");
                return new b(str, str2, e1.Z(strOptString) ? null : Uri.parse(strOptString), b(dialogConfigJSON.optJSONArray(b.f100244h)), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        @NotNull
        public final String a() {
            return this.f100246a;
        }

        @Nullable
        public final Uri b() {
            return this.f100248c;
        }

        @NotNull
        public final String c() {
            return this.f100247b;
        }

        @Nullable
        public final int[] d() {
            return this.f100249d;
        }

        private b(String str, String str2, Uri uri, int[] iArr) {
            this.f100246a = str;
            this.f100247b = str2;
            this.f100248c = uri;
            this.f100249d = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(boolean z10, @NotNull String nuxContent, boolean z11, int i10, @NotNull EnumSet<a1> smartLoginOptions, @NotNull Map<String, ? extends Map<String, b>> dialogConfigurations, boolean z12, @NotNull p errorClassification, @NotNull String smartLoginBookmarkIconURL, @NotNull String smartLoginMenuIconURL, boolean z13, boolean z14, @Nullable JSONArray jSONArray, @NotNull String sdkUpdateMessage, boolean z15, boolean z16, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.f100222a = z10;
        this.f100223b = nuxContent;
        this.f100224c = z11;
        this.f100225d = i10;
        this.f100226e = smartLoginOptions;
        this.f100227f = dialogConfigurations;
        this.f100228g = z12;
        this.f100229h = errorClassification;
        this.f100230i = smartLoginBookmarkIconURL;
        this.f100231j = smartLoginMenuIconURL;
        this.f100232k = z13;
        this.f100233l = z14;
        this.f100234m = jSONArray;
        this.f100235n = sdkUpdateMessage;
        this.f100236o = z15;
        this.f100237p = z16;
        this.f100238q = str;
        this.f100239r = str2;
        this.f100240s = str3;
    }

    @oj.n
    @Nullable
    public static final b d(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return f100221t.a(str, str2, str3);
    }

    public final boolean a() {
        return this.f100228g;
    }

    public final boolean b() {
        return this.f100233l;
    }

    @NotNull
    public final Map<String, Map<String, b>> c() {
        return this.f100227f;
    }

    @NotNull
    public final p e() {
        return this.f100229h;
    }

    @Nullable
    public final JSONArray f() {
        return this.f100234m;
    }

    public final boolean g() {
        return this.f100232k;
    }

    public final boolean h() {
        return this.f100237p;
    }

    @NotNull
    public final String i() {
        return this.f100223b;
    }

    public final boolean j() {
        return this.f100224c;
    }

    @Nullable
    public final String k() {
        return this.f100238q;
    }

    @Nullable
    public final String l() {
        return this.f100240s;
    }

    @NotNull
    public final String m() {
        return this.f100235n;
    }

    public final int n() {
        return this.f100225d;
    }

    @NotNull
    public final String o() {
        return this.f100230i;
    }

    @NotNull
    public final String p() {
        return this.f100231j;
    }

    @NotNull
    public final EnumSet<a1> q() {
        return this.f100226e;
    }

    @Nullable
    public final String r() {
        return this.f100239r;
    }

    public final boolean s() {
        return this.f100236o;
    }

    public final boolean t() {
        return this.f100222a;
    }
}
