package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f121281b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f121282c = "userId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f121283a;

    class a extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f121284a;

        a(String str) throws JSONException {
            this.f121284a = str;
            put("userId", str);
        }
    }

    public g(com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f121283a = gVar;
    }

    private static Map<String, String> e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, q(jSONObject, next));
        }
        return map;
    }

    private static List<j> f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(j.a(string));
            } catch (Exception e10) {
                com.google.firebase.crashlytics.internal.g.f().n("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    @p0
    private String g(String str) throws JSONException {
        return q(new JSONObject(str), "userId");
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String m(List<j> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(j.f121314b.a(list.get(i10))));
            } catch (JSONException e10) {
                com.google.firebase.crashlytics.internal.g.f().n("Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static void n(File file) {
        if (file.exists() && file.delete()) {
            com.google.firebase.crashlytics.internal.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void o(File file, String str) {
        if (file.exists() && file.delete()) {
            com.google.firebase.crashlytics.internal.g.f().g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    private static String p(String str) throws JSONException {
        return new a(str).toString();
    }

    private static String q(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @NonNull
    public File a(String str) {
        return this.f121283a.r(str, p.f121328j);
    }

    @NonNull
    public File b(String str) {
        return this.f121283a.r(str, p.f121327i);
    }

    @NonNull
    public File c(String str) {
        return this.f121283a.r(str, p.f121329k);
    }

    @NonNull
    public File d(String str) {
        return this.f121283a.r(str, p.f121326h);
    }

    public Map<String, String> i(String str) {
        return j(str, false);
    }

    Map<String, String> j(String str, boolean z10) throws Throwable {
        FileInputStream fileInputStream;
        Exception e10;
        File fileA = z10 ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            o(fileA, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(fileA);
            try {
                try {
                    Map<String, String> mapE = e(com.google.firebase.crashlytics.internal.common.i.E(fileInputStream));
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close user metadata file.");
                    return mapE;
                } catch (Exception e11) {
                    e10 = e11;
                    com.google.firebase.crashlytics.internal.g.f().n("Error deserializing user metadata.", e10);
                    n(fileA);
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public List<j> k(String str) throws Throwable {
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            o(fileC, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileC);
                try {
                    List<j> listF = f(com.google.firebase.crashlytics.internal.common.i.E(fileInputStream2));
                    com.google.firebase.crashlytics.internal.g.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Failed to close rollouts state file.");
                    return listF;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    com.google.firebase.crashlytics.internal.g.f().n("Error deserializing rollouts state.", e);
                    n(fileC);
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.EMPTY_LIST;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @p0
    public String l(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (fileD.exists() && fileD.length() != 0) {
            try {
                fileInputStream = new FileInputStream(fileD);
                try {
                    try {
                        String strG = g(com.google.firebase.crashlytics.internal.common.i.E(fileInputStream));
                        com.google.firebase.crashlytics.internal.g.f().b("Loaded userId " + strG + " for session " + str);
                        com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close user metadata file.");
                        return strG;
                    } catch (Exception e10) {
                        e = e10;
                        com.google.firebase.crashlytics.internal.g.f().n("Error deserializing user metadata.", e);
                        n(fileD);
                        com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        }
        com.google.firebase.crashlytics.internal.g.f().b("No userId set for session " + str);
        n(fileD);
        return null;
    }

    public void r(String str, Map<String, String> map) throws Throwable {
        s(str, map, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    public void s(String str, Map<String, String> map, boolean z10) throws Throwable {
        BufferedWriter bufferedWriter;
        Exception e10;
        File fileA = z10 != 0 ? a(str) : b(str);
        ?? r10 = 0;
        try {
            try {
                String strH = h(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f121281b));
                try {
                    bufferedWriter.write(strH);
                    bufferedWriter.flush();
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Exception e11) {
                    e10 = e11;
                    com.google.firebase.crashlytics.internal.g.f().n("Error serializing key/value metadata.", e10);
                    n(fileA);
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close key/value metadata file.");
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = z10;
                com.google.firebase.crashlytics.internal.common.i.f(r10, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.internal.common.i.f(r10, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void t(String str, List<j> list) throws Throwable {
        BufferedWriter bufferedWriter;
        Exception e10;
        File fileC = c(str);
        if (list.isEmpty()) {
            o(fileC, "Rollout state is empty for session: " + str);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            String strM = m(list);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f121281b));
            try {
                try {
                    bufferedWriter.write(strM);
                    bufferedWriter.flush();
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e11) {
                    e10 = e11;
                    com.google.firebase.crashlytics.internal.g.f().n("Error serializing rollouts state.", e10);
                    n(fileC);
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void u(String str, String str2) throws Throwable {
        File fileD = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strP = p(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f121281b));
                try {
                    bufferedWriter2.write(strP);
                    bufferedWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.g.f().n("Error serializing user metadata.", e);
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
