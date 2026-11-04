package o5;

import android.os.Build;
import androidx.annotation.b1;
import com.facebook.internal.e1;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f333543h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f333544i = "Unknown";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f333545j = "timestamp";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f333546k = "app_version";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f333547l = "device_os_version";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f333548m = "device_model";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f333549n = "reason";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f333550o = "callstack";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f333551p = "type";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f333552q = "feature_names";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f333553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private EnumC2344c f333554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private JSONArray f333555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f333556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f333557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f333558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Long f333559g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f333560a = new a();

        private a() {
        }

        @n
        @NotNull
        public static final c a(@Nullable String str, @Nullable String str2) {
            return new c(str, str2, (DefaultConstructorMarker) null);
        }

        @n
        @NotNull
        public static final c b(@Nullable Throwable th2, @NotNull EnumC2344c t10) {
            Intrinsics.checkNotNullParameter(t10, "t");
            return new c(th2, t10, (DefaultConstructorMarker) null);
        }

        @n
        @NotNull
        public static final c c(@NotNull JSONArray features) {
            Intrinsics.checkNotNullParameter(features, "features");
            return new c(features, (DefaultConstructorMarker) null);
        }

        @n
        @NotNull
        public static final c d(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new c(file, (DefaultConstructorMarker) null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EnumC2344c b(String str) {
            if (StringsKt.u2(str, k.f333574d, false, 2, null)) {
                return EnumC2344c.CrashReport;
            }
            if (StringsKt.u2(str, k.f333575e, false, 2, null)) {
                return EnumC2344c.CrashShield;
            }
            if (StringsKt.u2(str, k.f333576f, false, 2, null)) {
                return EnumC2344c.ThreadCheck;
            }
            if (StringsKt.u2(str, k.f333572b, false, 2, null)) {
                return EnumC2344c.Analysis;
            }
            return StringsKt.u2(str, k.f333573c, false, 2, null) ? EnumC2344c.AnrReport : EnumC2344c.Unknown;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: o5.c$c, reason: collision with other inner class name */
    public enum EnumC2344c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* JADX INFO: renamed from: o5.c$c$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f333568a;

            static {
                int[] iArr = new int[EnumC2344c.valuesCustom().length];
                iArr[EnumC2344c.Analysis.ordinal()] = 1;
                iArr[EnumC2344c.AnrReport.ordinal()] = 2;
                iArr[EnumC2344c.CrashReport.ordinal()] = 3;
                iArr[EnumC2344c.CrashShield.ordinal()] = 4;
                iArr[EnumC2344c.ThreadCheck.ordinal()] = 5;
                f333568a = iArr;
            }
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC2344c[] valuesCustom() {
            EnumC2344c[] enumC2344cArrValuesCustom = values();
            return (EnumC2344c[]) Arrays.copyOf(enumC2344cArrValuesCustom, enumC2344cArrValuesCustom.length);
        }

        @NotNull
        public final String l() {
            int i10 = a.f333568a[ordinal()];
            int i11 = 3 >> 1;
            if (i10 == 1) {
                return k.f333572b;
            }
            if (i10 == 2) {
                return k.f333573c;
            }
            if (i10 == 3) {
                return k.f333574d;
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : k.f333576f;
            }
            return k.f333575e;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            int i10 = a.f333568a[ordinal()];
            if (i10 == 1) {
                return "Analysis";
            }
            if (i10 == 2) {
                return "AnrReport";
            }
            if (i10 == 3) {
                return "CrashReport";
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f333569a;

        static {
            int[] iArr = new int[EnumC2344c.valuesCustom().length];
            iArr[EnumC2344c.Analysis.ordinal()] = 1;
            int i10 = 0 >> 2;
            iArr[EnumC2344c.AnrReport.ordinal()] = 2;
            iArr[EnumC2344c.CrashReport.ordinal()] = 3;
            iArr[EnumC2344c.CrashShield.ordinal()] = 4;
            iArr[EnumC2344c.ThreadCheck.ordinal()] = 5;
            f333569a = iArr;
        }
    }

    public /* synthetic */ c(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    private final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f333555c;
            if (jSONArray != null) {
                jSONObject.put(f333552q, jSONArray);
            }
            Long l10 = this.f333559g;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f333556d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l10 = this.f333559g;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            String str2 = this.f333557e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f333558f;
            if (str3 != null) {
                jSONObject.put(f333550o, str3);
            }
            EnumC2344c enumC2344c = this.f333554b;
            if (enumC2344c != null) {
                jSONObject.put("type", enumC2344c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject e() {
        EnumC2344c enumC2344c = this.f333554b;
        int i10 = enumC2344c == null ? -1 : d.f333569a[enumC2344c.ordinal()];
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return d();
        }
        return null;
    }

    public final void a() {
        k kVar = k.f333571a;
        k.d(this.f333553a);
    }

    public final int b(@NotNull c data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l10 = this.f333559g;
        if (l10 == null) {
            return -1;
        }
        long jLongValue = l10.longValue();
        Long l11 = data.f333559g;
        if (l11 == null) {
            return 1;
        }
        return Intrinsics.compare(l11.longValue(), jLongValue);
    }

    public final boolean f() {
        EnumC2344c enumC2344c = this.f333554b;
        int i10 = enumC2344c == null ? -1 : d.f333569a[enumC2344c.ordinal()];
        if (i10 == 1) {
            return (this.f333555c == null || this.f333559g == null) ? false : true;
        }
        if (i10 != 2) {
            return ((i10 != 3 && i10 != 4 && i10 != 5) || this.f333558f == null || this.f333559g == null) ? false : true;
        }
        return (this.f333558f == null || this.f333557e == null || this.f333559g == null) ? false : true;
    }

    public final void g() {
        if (f()) {
            k kVar = k.f333571a;
            k.t(this.f333553a, toString());
        }
    }

    @NotNull
    public String toString() {
        JSONObject jSONObjectE = e();
        if (jSONObjectE == null) {
            String string = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObjectE.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "params.toString()");
        return string2;
    }

    public /* synthetic */ c(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ c(Throwable th2, EnumC2344c enumC2344c, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, enumC2344c);
    }

    public /* synthetic */ c(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private c(JSONArray jSONArray) {
        this.f333554b = EnumC2344c.Analysis;
        this.f333559g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f333555c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(k.f333572b);
        stringBuffer.append(String.valueOf(this.f333559g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f333553a = string;
    }

    private c(Throwable th2, EnumC2344c enumC2344c) {
        this.f333554b = enumC2344c;
        e1 e1Var = e1.f99794a;
        this.f333556d = e1.v();
        k kVar = k.f333571a;
        this.f333557e = k.e(th2);
        this.f333558f = k.h(th2);
        this.f333559g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC2344c.l());
        stringBuffer.append(String.valueOf(this.f333559g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.f333553a = string;
    }

    private c(String str, String str2) {
        this.f333554b = EnumC2344c.AnrReport;
        e1 e1Var = e1.f99794a;
        this.f333556d = e1.v();
        this.f333557e = str;
        this.f333558f = str2;
        this.f333559g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(k.f333573c);
        stringBuffer.append(String.valueOf(this.f333559g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f333553a = string;
    }

    private c(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f333553a = name;
        this.f333554b = f333543h.b(name);
        k kVar = k.f333571a;
        JSONObject jSONObjectR = k.r(this.f333553a, true);
        if (jSONObjectR != null) {
            this.f333559g = Long.valueOf(jSONObjectR.optLong("timestamp", 0L));
            this.f333556d = jSONObjectR.optString("app_version", null);
            this.f333557e = jSONObjectR.optString("reason", null);
            this.f333558f = jSONObjectR.optString(f333550o, null);
            this.f333555c = jSONObjectR.optJSONArray(f333552q);
        }
    }
}
