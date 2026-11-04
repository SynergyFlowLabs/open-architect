package r5;

import androidx.annotation.b1;
import com.facebook.GraphRequest;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.q0;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.Regex;
import o5.k;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f359063a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f359064b = 1000;

    private e() {
    }

    @n
    public static final void d() {
        g0 g0Var = g0.f99617a;
        if (g0.s()) {
            h();
        }
    }

    @n
    @NotNull
    public static final File[] e() {
        k kVar = k.f333571a;
        File fileF = k.f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: r5.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return e.f(file, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        q1 q1Var = q1.f312784a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{k.f333577g}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return new Regex(str).k(name);
    }

    @n
    public static final void g(@Nullable String str) {
        try {
            new a(str).e();
        } catch (Exception unused) {
        }
    }

    @n
    public static final void h() {
        e1 e1Var = e1.f99794a;
        if (e1.W()) {
            return;
        }
        File[] fileArrE = e();
        final ArrayList arrayList = new ArrayList();
        int length = fileArrE.length;
        int i10 = 0;
        while (i10 < length) {
            File file = fileArrE[i10];
            i10++;
            a aVar = new a(file);
            if (aVar.d()) {
                arrayList.add(aVar);
            }
        }
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: r5.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.i((a) obj, (a) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < arrayList.size() && i11 < 1000; i11++) {
            jSONArray.put(arrayList.get(i11));
        }
        k kVar = k.f333571a;
        k.s("error_reports", jSONArray, new GraphRequest.b() { // from class: r5.d
            @Override // com.facebook.GraphRequest.b
            public final void a(q0 q0Var) {
                e.j(arrayList, q0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(a aVar, a o10) {
        Intrinsics.checkNotNullExpressionValue(o10, "o2");
        return aVar.b(o10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ArrayList validReports, q0 response) {
        Intrinsics.checkNotNullParameter(validReports, "$validReports");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.g() == null) {
                JSONObject jSONObjectK = response.k();
                if (Intrinsics.areEqual(jSONObjectK == null ? null : Boolean.valueOf(jSONObjectK.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
