package f5;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f274977i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f274978j = "class_name";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f274979k = "index";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f274980l = "id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f274981m = "text";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f274982n = "tag";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f274983o = "description";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f274984p = "hint";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f274985q = "match_bitmask";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f274986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f274987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f274988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f274989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f274990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f274991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f274992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f274993h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f275000a;

        b(int i10) {
            this.f275000a = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            return (b[]) Arrays.copyOf(bVarArrValuesCustom, bVarArrValuesCustom.length);
        }

        public final int l() {
            return this.f275000a;
        }
    }

    public d(@NotNull JSONObject component) throws JSONException {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f274986a = string;
        this.f274987b = component.optInt("index", -1);
        this.f274988c = component.optInt("id");
        String strOptString = component.optString("text");
        Intrinsics.checkNotNullExpressionValue(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.f274989d = strOptString;
        String strOptString2 = component.optString("tag");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "component.optString(PATH_TAG_KEY)");
        this.f274990e = strOptString2;
        String strOptString3 = component.optString("description");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f274991f = strOptString3;
        String strOptString4 = component.optString("hint");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.f274992g = strOptString4;
        this.f274993h = component.optInt(f274985q);
    }

    @NotNull
    public final String a() {
        return this.f274986a;
    }

    @NotNull
    public final String b() {
        return this.f274991f;
    }

    @NotNull
    public final String c() {
        return this.f274992g;
    }

    public final int d() {
        return this.f274988c;
    }

    public final int e() {
        return this.f274987b;
    }

    public final int f() {
        return this.f274993h;
    }

    @NotNull
    public final String g() {
        return this.f274990e;
    }

    @NotNull
    public final String h() {
        return this.f274989d;
    }
}
