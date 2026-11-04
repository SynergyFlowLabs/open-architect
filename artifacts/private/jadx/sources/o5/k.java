package o5;

import androidx.annotation.b1;
import com.facebook.GraphRequest;
import com.facebook.g0;
import com.facebook.internal.e1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f333571a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f333572b = "analysis_log_";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f333573c = "anr_log_";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f333574d = "crash_log_";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f333575e = "shield_log_";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f333576f = "thread_check_log_";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f333577g = "error_log_";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f333578h = "com.facebook";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f333579i = "com.meta";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f333580j = "com.facebook.appevents.codeless";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f333581k = "com.facebook.appevents.suggestedevents";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f333582l = "instrument";

    private k() {
    }

    @n
    public static final boolean d(@Nullable String str) {
        File fileF = f();
        if (fileF == null || str == null) {
            return false;
        }
        return new File(fileF, str).delete();
    }

    @n
    @Nullable
    public static final String e(@Nullable Throwable th2) {
        if (th2 == null) {
            return null;
        }
        return th2.getCause() == null ? th2.toString() : String.valueOf(th2.getCause());
    }

    @n
    @Nullable
    public static final File f() {
        g0 g0Var = g0.f99617a;
        File file = new File(g0.n().getCacheDir(), f333582l);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @n
    @Nullable
    public static final String g(@NotNull Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            i10++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    @n
    @Nullable
    public static final String h(@Nullable Throwable th2) {
        Throwable th3 = null;
        if (th2 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                jSONArray.put(stackTraceElement.toString());
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return jSONArray.toString();
    }

    @n
    public static final boolean i(@NotNull StackTraceElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        if (!StringsKt.u2(className, f333578h, false, 2, null)) {
            String className2 = element.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "element.className");
            if (!StringsKt.u2(className2, f333579i, false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    @n
    public static final boolean j(@Nullable Throwable th2) {
        if (th2 == null) {
            return false;
        }
        Throwable th3 = null;
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement element = stackTrace[i10];
                i10++;
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (i(element)) {
                    return true;
                }
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return false;
    }

    @n
    public static final boolean k(@Nullable Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (i(element)) {
                    String className = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    if (!StringsKt.u2(className, f333580j, false, 2, null)) {
                        String className2 = element.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                        if (!StringsKt.u2(className2, f333581k, false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    if (StringsKt.u2(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        if (StringsKt.u2(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            if (!StringsKt.u2(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @n
    @NotNull
    public static final File[] l() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: o5.i
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return k.m(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        q1 q1Var = q1.f312784a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{f333573c}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return new Regex(str).k(name);
    }

    @n
    @NotNull
    public static final File[] n() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: o5.j
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return k.o(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        q1 q1Var = q1.f312784a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{f333572b}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return new Regex(str).k(name);
    }

    @n
    @NotNull
    public static final File[] p() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: o5.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return k.q(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        q1 q1Var = q1.f312784a;
        String str = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{f333574d, f333575e, f333576f}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return new Regex(str).k(name);
    }

    @n
    @Nullable
    public static final JSONObject r(@Nullable String str, boolean z10) {
        File fileF = f();
        if (fileF != null && str != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(fileF, str));
                e1 e1Var = e1.f99794a;
                return new JSONObject(e1.r0(fileInputStream));
            } catch (Exception unused) {
                if (z10) {
                    d(str);
                }
            }
        }
        return null;
    }

    @n
    public static final void s(@Nullable String str, @NotNull JSONArray reports, @Nullable GraphRequest.b bVar) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            e1 e1Var = e1.f99794a;
            JSONObject jSONObjectA = e1.A();
            if (jSONObjectA != null) {
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
            GraphRequest.c cVar = GraphRequest.f98518n;
            q1 q1Var = q1.f312784a;
            g0 g0Var = g0.f99617a;
            String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{g0.o()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
            cVar.N(null, str2, jSONObject, bVar).n();
        } catch (JSONException unused) {
        }
    }

    @n
    public static final void t(@Nullable String str, @Nullable String str2) {
        File fileF = f();
        if (fileF == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileF, str));
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
