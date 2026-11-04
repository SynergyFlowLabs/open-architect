package r5;

import androidx.annotation.b1;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o5.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C2469a f359056d = new C2469a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f359057e = "error_message";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f359058f = "timestamp";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f359059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f359060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Long f359061c;

    /* JADX INFO: renamed from: r5.a$a, reason: collision with other inner class name */
    public static final class C2469a {
        public /* synthetic */ C2469a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2469a() {
        }
    }

    public a(@Nullable String str) {
        this.f359061c = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f359060b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(k.f333577g);
        Long l10 = this.f359061c;
        if (l10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f359059a = string;
    }

    public final void a() {
        k kVar = k.f333571a;
        k.d(this.f359059a);
    }

    public final int b(@NotNull a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l10 = this.f359061c;
        if (l10 == null) {
            return -1;
        }
        long jLongValue = l10.longValue();
        Long l11 = data.f359061c;
        if (l11 == null) {
            return 1;
        }
        return Intrinsics.compare(l11.longValue(), jLongValue);
    }

    @Nullable
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f359061c;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            jSONObject.put("error_message", this.f359060b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        if (this.f359060b == null || this.f359061c == null) {
            return false;
        }
        int i10 = 3 & 1;
        return true;
    }

    public final void e() {
        if (d()) {
            k kVar = k.f333571a;
            k.t(this.f359059a, toString());
        }
    }

    @NotNull
    public String toString() {
        JSONObject jSONObjectC = c();
        if (jSONObjectC == null) {
            return super.toString();
        }
        String string = jSONObjectC.toString();
        Intrinsics.checkNotNullExpressionValue(string, "params.toString()");
        return string;
    }

    public a(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f359059a = name;
        k kVar = k.f333571a;
        JSONObject jSONObjectR = k.r(name, true);
        if (jSONObjectR != null) {
            this.f359061c = Long.valueOf(jSONObjectR.optLong("timestamp", 0L));
            this.f359060b = jSONObjectR.optString("error_message", null);
        }
    }
}
