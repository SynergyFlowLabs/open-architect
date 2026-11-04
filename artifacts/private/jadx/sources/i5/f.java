package i5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.b1;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.k;
import com.facebook.appevents.p;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.internal.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY})
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f287007c = "com.facebook.internal.MODEL_STORE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f287008d = "models";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f287009e = "MTML";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f287010f = "use_case";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f287011g = "version_id";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f287012h = "asset_uri";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f287013i = "rules_uri";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f287014j = "thresholds";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f287015k = "model_request_timestamp";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f287016l = 259200000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f287005a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<String, b> f287006b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final List<String> f287017m = CollectionsKt.listOf((Object[]) new String[]{"other", p.f99192f, p.f99204l, p.f99212p, p.f99208n});

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final List<String> f287018n = CollectionsKt.listOf((Object[]) new String[]{"none", "address", h5.a.f280370d});

    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* JADX INFO: renamed from: i5.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1922a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f287022a;

            static {
                int[] iArr = new int[a.valuesCustom().length];
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                f287022a = iArr;
            }
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }

        @NotNull
        public final String l() {
            int i10 = C1922a.f287022a[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new k0();
        }

        @NotNull
        public final String n() {
            int i10 = C1922a.f287022a[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new k0();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final a f287023i = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f287024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private String f287025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f287026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f287027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private float[] f287028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private File f287029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private i5.b f287030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private Runnable f287031h;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final void d(String str, int i10) {
                File[] fileArrListFiles;
                j jVar = j.f287037a;
                File fileA = j.a();
                if (fileA != null && (fileArrListFiles = fileA.listFiles()) != null && fileArrListFiles.length != 0) {
                    String str2 = str + '_' + i10;
                    int length = fileArrListFiles.length;
                    int i11 = 0;
                    while (i11 < length) {
                        File file = fileArrListFiles[i11];
                        i11++;
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        if (StringsKt.u2(name, str, false, 2, null) && !StringsKt.u2(name, str2, false, 2, null)) {
                            file.delete();
                        }
                    }
                }
            }

            private final void e(String str, String str2, k.a aVar) {
                j jVar = j.f287037a;
                File file = new File(j.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new k(str, file, aVar).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void h(List slaves, File file) {
                Intrinsics.checkNotNullParameter(slaves, "$slaves");
                Intrinsics.checkNotNullParameter(file, "file");
                final i5.b bVarA = i5.b.f286990m.a(file);
                if (bVarA != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final b bVar = (b) it.next();
                        b.f287023i.e(bVar.e(), bVar.g() + '_' + bVar.h() + "_rule", new k.a() { // from class: i5.g
                            @Override // com.facebook.appevents.internal.k.a
                            public final void a(File file2) {
                                f.b.a.i(bVar, bVarA, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void i(b slave, i5.b bVar, File file) {
                Intrinsics.checkNotNullParameter(slave, "$slave");
                Intrinsics.checkNotNullParameter(file, "file");
                slave.j(bVar);
                slave.l(file);
                Runnable runnable = slave.f287031h;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            @Nullable
            public final b c(@Nullable JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String useCase = jSONObject.getString(f.f287010f);
                    String assetUri = jSONObject.getString(f.f287012h);
                    String strOptString = jSONObject.optString(f.f287013i, null);
                    int i10 = jSONObject.getInt(f.f287011g);
                    float[] fArrD = f.d(f.f287005a, jSONObject.getJSONArray(f.f287014j));
                    Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                    Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    return new b(useCase, assetUri, strOptString, i10, fArrD);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void f(@NotNull b handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                g(handler, CollectionsKt.listOf(handler));
            }

            public final void g(@NotNull b master, @NotNull final List<b> slaves) {
                Intrinsics.checkNotNullParameter(master, "master");
                Intrinsics.checkNotNullParameter(slaves, "slaves");
                d(master.g(), master.h());
                e(master.b(), master.g() + '_' + master.h(), new k.a() { // from class: i5.h
                    @Override // com.facebook.appevents.internal.k.a
                    public final void a(File file) {
                        f.b.a.h(slaves, file);
                    }
                });
            }

            private a() {
            }
        }

        public b(@NotNull String useCase, @NotNull String assetUri, @Nullable String str, int i10, @Nullable float[] fArr) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(assetUri, "assetUri");
            this.f287024a = useCase;
            this.f287025b = assetUri;
            this.f287026c = str;
            this.f287027d = i10;
            this.f287028e = fArr;
        }

        @NotNull
        public final String b() {
            return this.f287025b;
        }

        @Nullable
        public final i5.b c() {
            return this.f287030g;
        }

        @Nullable
        public final File d() {
            return this.f287029f;
        }

        @Nullable
        public final String e() {
            return this.f287026c;
        }

        @Nullable
        public final float[] f() {
            return this.f287028e;
        }

        @NotNull
        public final String g() {
            return this.f287024a;
        }

        public final int h() {
            return this.f287027d;
        }

        public final void i(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f287025b = str;
        }

        public final void j(@Nullable i5.b bVar) {
            this.f287030g = bVar;
        }

        @NotNull
        public final b k(@Nullable Runnable runnable) {
            this.f287031h = runnable;
            return this;
        }

        public final void l(@Nullable File file) {
            this.f287029f = file;
        }

        public final void m(@Nullable String str) {
            this.f287026c = str;
        }

        public final void n(@Nullable float[] fArr) {
            this.f287028e = fArr;
        }

        public final void o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f287024a = str;
        }

        public final void p(int i10) {
            this.f287027d = i10;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f287032a;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            f287032a = iArr;
        }
    }

    private f() {
    }

    public static final /* synthetic */ float[] d(f fVar, JSONArray jSONArray) {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return null;
        }
        try {
            return fVar.o(jSONArray);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
            return null;
        }
    }

    private final void e(JSONObject jSONObject) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        b bVarC = b.f287023i.c(jSONObject.getJSONObject(itKeys.next()));
                        if (bVarC != null) {
                            f287006b.put(bVarC.g(), bVarC);
                        }
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    @n
    public static final void f() {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            e1 e1Var = e1.f99794a;
            e1.A0(new Runnable() { // from class: i5.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.g();
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g() {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            g0 g0Var = g0.f99617a;
            SharedPreferences sharedPreferences = g0.n().getSharedPreferences(f287007c, 0);
            String string = sharedPreferences.getString(f287008d, null);
            JSONObject jSONObject = (string == null || string.length() == 0) ? new JSONObject() : new JSONObject(string);
            long j10 = sharedPreferences.getLong(f287015k, 0L);
            t tVar = t.f100072a;
            if (!t.g(t.b.ModelRequest) || jSONObject.length() == 0 || !f287005a.n(j10)) {
                jSONObject = f287005a.k();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString(f287008d, jSONObject.toString()).putLong(f287015k, System.currentTimeMillis()).apply();
                }
            }
            f fVar = f287005a;
            fVar.e(jSONObject);
            fVar.h();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }

    private final void h() {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                ArrayList arrayList = new ArrayList();
                String strB = null;
                int iMax = 0;
                for (Map.Entry<String, b> entry : f287006b.entrySet()) {
                    String key = entry.getKey();
                    b value = entry.getValue();
                    if (Intrinsics.areEqual(key, a.MTML_APP_EVENT_PREDICTION.n())) {
                        String strB2 = value.b();
                        int iMax2 = Math.max(iMax, value.h());
                        t tVar = t.f100072a;
                        if (t.g(t.b.SuggestedEvents) && m()) {
                            arrayList.add(value.k(new Runnable() { // from class: i5.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    f.i();
                                }
                            }));
                        }
                        strB = strB2;
                        iMax = iMax2;
                    }
                    if (Intrinsics.areEqual(key, a.MTML_INTEGRITY_DETECT.n())) {
                        strB = value.b();
                        iMax = Math.max(iMax, value.h());
                        t tVar2 = t.f100072a;
                        if (t.g(t.b.IntelligentIntegrity)) {
                            arrayList.add(value.k(new Runnable() { // from class: i5.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    f.j();
                                }
                            }));
                        }
                    }
                }
                if (strB != null && iMax > 0 && !arrayList.isEmpty()) {
                    int i10 = 5 >> 0;
                    b.f287023i.g(new b(f287009e, strB, null, iMax, null), arrayList);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i() {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            k5.e eVar = k5.e.f307557a;
            k5.e.b();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            h5.a aVar = h5.a.f280367a;
            h5.a.a();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }

    private final JSONObject k() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            String[] strArr = {f287010f, f287011g, f287012h, f287013i, f287014j};
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.f98513a0, TextUtils.join(",", strArr));
            GraphRequest graphRequestH = GraphRequest.f98518n.H(null, "app/model_asset", null);
            graphRequestH.r0(bundle);
            JSONObject jSONObjectI = graphRequestH.l().i();
            if (jSONObjectI == null) {
                return null;
            }
            return p(jSONObjectI);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @n
    @Nullable
    public static final File l(@NotNull a task) {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            b bVar = f287006b.get(task.n());
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
            return null;
        }
    }

    private final boolean m() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            e1 e1Var = e1.f99794a;
            Locale localeJ = e1.J();
            if (localeJ == null) {
                return true;
            }
            String language = localeJ.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "locale.language");
            return StringsKt.V2(language, "en", false, 2, null);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final boolean n(long j10) {
        if (com.facebook.internal.instrument.crashshield.b.e(this) || j10 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j10 < 259200000;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final float[] o(JSONArray jSONArray) {
        if (com.facebook.internal.instrument.crashshield.b.e(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        String string = jSONArray.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                        fArr[i10] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return fArr;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final JSONObject p(JSONObject jSONObject) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(f287011g, jSONObject3.getString(f287011g));
                        jSONObject4.put(f287010f, jSONObject3.getString(f287010f));
                        jSONObject4.put(f287014j, jSONObject3.getJSONArray(f287014j));
                        jSONObject4.put(f287012h, jSONObject3.getString(f287012h));
                        if (jSONObject3.has(f287013i)) {
                            jSONObject4.put(f287013i, jSONObject3.getString(f287013i));
                        }
                        jSONObject2.put(jSONObject3.getString(f287010f), jSONObject4);
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @n
    @Nullable
    public static final String[] q(@NotNull a task, @NotNull float[][] denses, @NotNull String[] texts) {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            b bVar = f287006b.get(task.n());
            i5.b bVarC = bVar == null ? null : bVar.c();
            if (bVarC == null) {
                return null;
            }
            float[] fArrF = bVar.f();
            int length = texts.length;
            int length2 = denses[0].length;
            i5.a aVar = new i5.a(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(denses[i10], 0, aVar.a(), i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            i5.a aVarB = bVarC.b(aVar, texts, task.l());
            if (aVarB != null && fArrF != null && aVarB.a().length != 0 && fArrF.length != 0) {
                int i12 = c.f287032a[task.ordinal()];
                if (i12 == 1) {
                    return f287005a.s(aVarB, fArrF);
                }
                if (i12 == 2) {
                    return f287005a.r(aVarB, fArrF);
                }
                throw new k0();
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
            return null;
        }
    }

    private final String[] r(i5.a aVar, float[] fArr) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            float[] fArrA = aVar.a();
            if (iB2 != fArr.length) {
                return null;
            }
            IntRange intRangeW1 = r.W1(0, iB);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
            Iterator<Integer> it = intRangeW1.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                String str = "none";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (fArrA[(iNextInt * iB2) + i11] >= fArr[i10]) {
                        str = f287018n.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final String[] s(i5.a aVar, float[] fArr) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            float[] fArrA = aVar.a();
            if (iB2 != fArr.length) {
                return null;
            }
            IntRange intRangeW1 = r.W1(0, iB);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
            Iterator<Integer> it = intRangeW1.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                String str = "other";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (fArrA[(iNextInt * iB2) + i11] >= fArr[i10]) {
                        str = f287017m.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }
}
