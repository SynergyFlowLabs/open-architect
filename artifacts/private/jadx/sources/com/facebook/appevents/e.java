package com.facebook.appevents;

import android.os.Bundle;
import androidx.annotation.b1;
import com.facebook.internal.e1;
import com.facebook.internal.t0;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f98848g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f98850i = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f98851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f98852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f98853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f98854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f98855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f98847f = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final HashSet<String> f98849h = new HashSet<>();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest.digest()");
                com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
                return com.facebook.appevents.internal.g.c(bArrDigest);
            } catch (UnsupportedEncodingException e10) {
                e1 e1Var = e1.f99794a;
                e1.f0("Failed to generate checksum: ", e10);
                return "1";
            } catch (NoSuchAlgorithmException e11) {
                e1 e1Var2 = e1.f99794a;
                e1.f0("Failed to generate checksum: ", e11);
                return p.f99189d0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            boolean zContains;
            if (str != null && str.length() != 0 && str.length() <= 40) {
                synchronized (e.f98849h) {
                    zContains = e.f98849h.contains(str);
                    Unit unit = Unit.f312394a;
                }
                if (zContains) {
                    return;
                }
                if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").k(str)) {
                    synchronized (e.f98849h) {
                        e.f98849h.add(str);
                    }
                    return;
                } else {
                    q1 q1Var = q1.f312784a;
                    String str2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                    throw new com.facebook.u(str2);
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            q1 q1Var2 = q1.f312784a;
            String str3 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(locale, format, *args)");
            throw new com.facebook.u(str3);
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f98856e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f98857f = 20160803001L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f98858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f98859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f98860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final String f98861d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(@NotNull String jsonString, boolean z10, boolean z11, @Nullable String str) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            this.f98858a = jsonString;
            this.f98859b = z10;
            this.f98860c = z11;
            this.f98861d = str;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new e(this.f98858a, this.f98859b, this.f98860c, this.f98861d, null);
        }
    }

    public /* synthetic */ e(String str, boolean z10, boolean z11, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, z11, str2);
    }

    private final String b() {
        a aVar = f98847f;
        String string = this.f98851a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return aVar.c(string);
    }

    private final JSONObject e(String str, String str2, Double d10, Bundle bundle, UUID uuid) throws JSONException {
        a aVar = f98847f;
        aVar.d(str2);
        JSONObject jSONObject = new JSONObject();
        j5.a aVar2 = j5.a.f307366a;
        String strE = j5.a.e(str2);
        jSONObject.put(com.facebook.appevents.internal.j.f99027c, strE);
        jSONObject.put(com.facebook.appevents.internal.j.f99028d, aVar.c(strE));
        jSONObject.put(com.facebook.appevents.internal.j.f99026b, System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> mapI = i(bundle);
            for (String str3 : mapI.keySet()) {
                jSONObject.put(str3, mapI.get(str3));
            }
        }
        if (d10 != null) {
            jSONObject.put(p.f99195g0, d10.doubleValue());
        }
        if (this.f98853c) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f98852b) {
            jSONObject.put("_implicitlyLogged", "1");
            return jSONObject;
        }
        t0.a aVar3 = t0.f100109e;
        com.facebook.t0 t0Var = com.facebook.t0.APP_EVENTS;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "eventObject.toString()");
        aVar3.e(t0Var, "AppEvents", "Created app event '%s'", string);
        return jSONObject;
    }

    private final Map<String, String> i(Bundle bundle) {
        HashMap map = new HashMap();
        for (String key : bundle.keySet()) {
            a aVar = f98847f;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            aVar.d(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                q1 q1Var = q1.f312784a;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                throw new com.facebook.u(str);
            }
            map.put(key, obj.toString());
        }
        h5.a aVar2 = h5.a.f280367a;
        h5.a.c(map);
        j5.a aVar3 = j5.a.f307366a;
        j5.a.f(map, this.f98854d);
        g5.a aVar4 = g5.a.f275403a;
        g5.a.c(map, this.f98854d);
        return map;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.f98851a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return new b(string, this.f98852b, this.f98853c, this.f98855e);
    }

    public final boolean c() {
        return this.f98852b;
    }

    @NotNull
    public final JSONObject d() {
        return this.f98851a;
    }

    @NotNull
    public final JSONObject f() {
        return this.f98851a;
    }

    public final boolean g() {
        if (this.f98855e == null) {
            return true;
        }
        return Intrinsics.areEqual(b(), this.f98855e);
    }

    @NotNull
    public final String getName() {
        return this.f98854d;
    }

    public final boolean h() {
        return this.f98852b;
    }

    @NotNull
    public String toString() {
        q1 q1Var = q1.f312784a;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f98851a.optString(com.facebook.appevents.internal.j.f99027c), Boolean.valueOf(this.f98852b), this.f98851a.toString()}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public e(@NotNull String contextName, @NotNull String eventName, @Nullable Double d10, @Nullable Bundle bundle, boolean z10, boolean z11, @Nullable UUID uuid) throws JSONException, com.facebook.u {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f98852b = z10;
        this.f98853c = z11;
        this.f98854d = eventName;
        this.f98851a = e(contextName, eventName, d10, bundle, uuid);
        this.f98855e = b();
    }

    private e(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f98851a = jSONObject;
        this.f98852b = z10;
        String strOptString = jSONObject.optString(com.facebook.appevents.internal.j.f99027c);
        Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f98854d = strOptString;
        this.f98855e = str2;
        this.f98853c = z11;
    }
}
