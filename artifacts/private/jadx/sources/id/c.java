package id;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.e0;
import com.planner5d.library.services.utility.k1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f287093g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f287094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final SocialAuthType f287095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f287096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f287097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f287098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f287099f;

    public c(@NotNull JSONObject json) {
        SocialAuthType socialAuthTypeValueOf;
        Intrinsics.checkNotNullParameter(json, "json");
        this.f287094a = json;
        try {
            r rVar = r.service;
            if (json.has(rVar.f224891a)) {
                String string = json.getString(rVar.f224891a);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                socialAuthTypeValueOf = SocialAuthType.valueOf(string);
            } else {
                socialAuthTypeValueOf = null;
            }
        } catch (Throwable unused) {
        }
        this.f287095b = socialAuthTypeValueOf;
        String strY = k1.y(this.f287094a, r.token, null, 4, null);
        this.f287096c = strY;
        String strY2 = k1.y(this.f287094a, r.id, null, 4, null);
        this.f287097d = strY2;
        String strH = e0.h(toString(), "MD5");
        Intrinsics.checkNotNullExpressionValue(strH, "hash(...)");
        this.f287098e = strH;
        this.f287099f = strY == null || (strY2 == null && socialAuthTypeValueOf == null);
    }

    @NotNull
    public final String a() {
        return this.f287098e;
    }

    @Nullable
    public final String b() {
        return this.f287097d;
    }

    @Nullable
    public final SocialAuthType c() {
        return this.f287095b;
    }

    @Nullable
    public final String d() {
        return this.f287096c;
    }

    public final boolean e() {
        return this.f287099f;
    }

    @NotNull
    public final JSONObject f() throws JSONException {
        return new JSONObject(toString());
    }

    @NotNull
    public String toString() {
        String string = this.f287094a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public c(@NotNull SocialAuthType service, @Nullable String str, @NotNull String token) throws JSONException {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(token, "token");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r.id.f224891a, str);
        jSONObject.put(r.service.f224891a, service.getService());
        jSONObject.put(r.token.f224891a, token);
        this(jSONObject);
    }

    public c(@Nullable a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (aVar != null) {
            jSONObject.put(r.id.f224891a, aVar.f287075a);
            jSONObject.put(r.token.f224891a, aVar.f287077c);
        }
        this(jSONObject);
    }
}
