package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f121021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f121022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f121023i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f121024j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f121025k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f121026l = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f121027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f121028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f121029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g8.d f121030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.k f121031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.j f121032f = com.google.firebase.crashlytics.internal.j.f121254a;

    static {
        HashMap map = new HashMap();
        f121021g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f121022h = String.format(Locale.US, "Crashlytics Android SDK/%s", "20.0.1");
    }

    public e0(Context context, n0 n0Var, a aVar, g8.d dVar, com.google.firebase.crashlytics.internal.settings.k kVar) {
        this.f121027a = context;
        this.f121028b = n0Var;
        this.f121029c = aVar;
        this.f121030d = dVar;
        this.f121031e = kVar;
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a.c A(com.google.firebase.crashlytics.internal.model.f0.a aVar) {
        return this.f121032f.c(aVar.e(), aVar.d(), aVar.c());
    }

    private com.google.firebase.crashlytics.internal.model.f0.a a(com.google.firebase.crashlytics.internal.model.f0.a aVar) {
        List<com.google.firebase.crashlytics.internal.model.f0.a.AbstractC1129a> listUnmodifiableList;
        if (!this.f121031e.a().f121861b.f121870c || this.f121029c.f120967c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f121029c.f120967c) {
                arrayList.add(com.google.firebase.crashlytics.internal.model.f0.a.AbstractC1129a.a().d(fVar.c()).b(fVar.a()).c(fVar.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return com.google.firebase.crashlytics.internal.model.f0.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.c b() {
        return com.google.firebase.crashlytics.internal.model.f0.b().l("20.0.1").h(this.f121029c.f120965a).i(this.f121028b.a().c()).g(this.f121028b.a().e()).f(this.f121028b.a().d()).d(this.f121029c.f120970f).e(this.f121029c.f120971g).k(4);
    }

    private static long f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f121021g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a h() {
        return com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a.a().b(0L).d(0L).c(this.f121029c.f120969e).e(this.f121029c.f120966b).a();
    }

    private List<com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1134a> i() {
        return Collections.singletonList(h());
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a j(int i10, com.google.firebase.crashlytics.internal.model.f0.a aVar) {
        return com.google.firebase.crashlytics.internal.model.f0.f.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i10).f(o(aVar)).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a k(int i10, g8.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean boolValueOf;
        com.google.firebase.crashlytics.internal.model.f0.f.d.a.c cVarG = this.f121032f.g(this.f121027a);
        if (cVarG.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarG.b() != 100);
        } else {
            boolValueOf = null;
        }
        return com.google.firebase.crashlytics.internal.model.f0.f.d.a.a().c(boolValueOf).d(cVarG).b(this.f121032f.f(this.f121027a)).h(i10).f(p(eVar, thread, i11, i12, z10)).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.c l(int i10) {
        e eVarA = e.a(this.f121027a);
        Float fB = eVarA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = eVarA.c();
        boolean zO = i.o(this.f121027a);
        return com.google.firebase.crashlytics.internal.model.f0.f.d.c.a().b(dValueOf).c(iC).f(zO).e(i10).g(f(i.b(this.f121027a) - i.a(this.f121027a))).d(i.c(Environment.getDataDirectory().getPath())).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c m(g8.e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c n(g8.e eVar, int i10, int i11, int i12) {
        String str = eVar.f275417b;
        String str2 = eVar.f275416a;
        StackTraceElement[] stackTraceElementArr = eVar.f275418c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        g8.e eVar2 = eVar.f275419d;
        if (i12 >= i11) {
            g8.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f275419d;
                i13++;
            }
        }
        com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC1137a abstractC1137aD = com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            abstractC1137aD.b(n(eVar2, i10, i11, i12 + 1));
        }
        return abstractC1137aD.a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a.b o(com.google.firebase.crashlytics.internal.model.f0.a aVar) {
        return com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a.b p(g8.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.a().f(z(eVar, thread, i10, z10)).d(m(eVar, i10, i11)).e(w()).c(i()).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b q(StackTraceElement stackTraceElement, com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a abstractC1142a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC1142a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private List<com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b> r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC1141b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.a s() {
        return com.google.firebase.crashlytics.internal.model.f0.f.a.a().e(this.f121028b.f()).h(this.f121029c.f120970f).d(this.f121029c.f120971g).f(this.f121028b.a().c()).b(this.f121029c.f120972h.d()).c(this.f121029c.f120972h.e()).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f t(String str, long j10) {
        return com.google.firebase.crashlytics.internal.model.f0.f.a().m(j10).j(str).h(f121022h).b(s()).l(v()).e(u()).i(3).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = i.b(this.f121027a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zY = i.y();
        int iL = i.l();
        String str = Build.MANUFACTURER;
        return com.google.firebase.crashlytics.internal.model.f0.f.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zY).j(iL).e(str).g(Build.PRODUCT).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.e v() {
        return com.google.firebase.crashlytics.internal.model.f0.f.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(i.A()).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1138d w() {
        return com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC1138d.a().d("0").c("0").b(0L).a();
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    private List<com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e> z(g8.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f275418c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f121030d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public com.google.firebase.crashlytics.internal.model.f0.f.d c(com.google.firebase.crashlytics.internal.model.f0.a aVar) {
        int i10 = this.f121027a.getResources().getConfiguration().orientation;
        return com.google.firebase.crashlytics.internal.model.f0.f.d.a().g("anr").f(aVar.i()).b(j(i10, a(aVar))).c(l(i10)).a();
    }

    public com.google.firebase.crashlytics.internal.model.f0.f.d d(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f121027a.getResources().getConfiguration().orientation;
        return com.google.firebase.crashlytics.internal.model.f0.f.d.a().g(str).f(j10).b(k(i12, g8.e.a(th2, this.f121030d), thread, i10, i11, z10)).c(l(i12)).a();
    }

    public com.google.firebase.crashlytics.internal.model.f0 e(String str, long j10) {
        return b().m(t(str, j10)).a();
    }
}
