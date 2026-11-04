package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.l1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f124564j = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l1
    static final int[] f124565k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l1
    static final int f124566l = 429;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l1
    static final String f124567m = "_fot";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f124568n = "X-Firebase-RC-Fetch-Type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.installations.k f124569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z8.b<com.google.firebase.analytics.connector.a> f124570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f124571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f124572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Random f124573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f124574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f124575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f124576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, String> f124577i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Date f124578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f124579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f124580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private final String f124581d;

        /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.n$a$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC1183a {
            public static final int W2 = 0;
            public static final int X2 = 1;
            public static final int Y2 = 2;
        }

        private a(Date date, int i10, h hVar, @p0 String str) {
            this.f124578a = date;
            this.f124579b = i10;
            this.f124580c = hVar;
            this.f124581d = str;
        }

        public static a a(Date date, h hVar) {
            return new a(date, 1, hVar, null);
        }

        public static a b(h hVar, String str) {
            return new a(hVar.h(), 0, hVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        Date d() {
            return this.f124578a;
        }

        public h e() {
            return this.f124580c;
        }

        @p0
        String f() {
            return this.f124581d;
        }

        int g() {
            return this.f124579b;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f124585a;

        b(String str) {
            this.f124585a = str;
        }

        String l() {
            return this.f124585a;
        }
    }

    public n(com.google.firebase.installations.k kVar, z8.b<com.google.firebase.analytics.connector.a> bVar, Executor executor, com.google.android.gms.common.util.g gVar, Random random, g gVar2, ConfigFetchHttpClient configFetchHttpClient, u uVar, Map<String, String> map) {
        this.f124569a = kVar;
        this.f124570b = bVar;
        this.f124571c = executor;
        this.f124572d = gVar;
        this.f124573e = random;
        this.f124574f = gVar2;
        this.f124575g = configFetchHttpClient;
        this.f124576h = uVar;
        this.f124577i = map;
    }

    public static /* synthetic */ Task a(n nVar, Task task, Task task2, Date date, Map map, Task task3) {
        nVar.getClass();
        if (task.u()) {
            return !task2.u() ? com.google.android.gms.tasks.n.f(new com.google.firebase.remoteconfig.s("Firebase Installations failed to get installation auth token for fetch.", task2.p())) : nVar.l((String) task.q(), ((com.google.firebase.installations.p) task2.q()).b(), date, map);
        }
        return com.google.android.gms.tasks.n.f(new com.google.firebase.remoteconfig.s("Firebase Installations failed to get installation ID for fetch.", task.p()));
    }

    public static /* synthetic */ Task c(n nVar, Date date, Task task) {
        nVar.y(task, date);
        return task;
    }

    private boolean f(long j10, Date date) {
        Date dateH = this.f124576h.h();
        if (dateH.equals(u.f124655g)) {
            return false;
        }
        return date.before(new Date(dateH.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private com.google.firebase.remoteconfig.w g(com.google.firebase.remoteconfig.w wVar) throws com.google.firebase.remoteconfig.s {
        String str;
        int iB = wVar.b();
        if (iB == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iB == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iB == f124566l) {
                throw new com.google.firebase.remoteconfig.s("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iB != 500) {
                switch (iB) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new com.google.firebase.remoteconfig.w(wVar.b(), "Fetch failed: " + str, wVar);
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    @m1
    private a k(String str, String str2, Date date, Map<String, String> map) throws com.google.firebase.remoteconfig.t {
        Date date2;
        try {
            date2 = date;
            try {
                a aVarFetch = this.f124575g.fetch(this.f124575g.d(), str, str2, t(), this.f124576h.f(), map, q(), date2, this.f124576h.c());
                if (aVarFetch.e() != null) {
                    this.f124576h.s(aVarFetch.e().k());
                }
                if (aVarFetch.f() != null) {
                    this.f124576h.r(aVarFetch.f());
                }
                this.f124576h.l();
                return aVarFetch;
            } catch (com.google.firebase.remoteconfig.w e10) {
                e = e10;
                com.google.firebase.remoteconfig.w wVar = e;
                u.a aVarW = w(wVar.b(), date2);
                if (v(aVarW, wVar.b())) {
                    throw new com.google.firebase.remoteconfig.u(aVarW.a().getTime());
                }
                throw g(wVar);
            }
        } catch (com.google.firebase.remoteconfig.w e11) {
            e = e11;
            date2 = date;
        }
    }

    private Task<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a aVarK = k(str, str2, date, map);
            return aVarK.g() != 0 ? com.google.android.gms.tasks.n.g(aVarK) : this.f124574f.k(aVarK.e()).w(this.f124571c, new com.google.android.gms.tasks.k() { // from class: com.google.firebase.remoteconfig.internal.m
                @Override // com.google.android.gms.tasks.k
                public final Task a(Object obj) {
                    return com.google.android.gms.tasks.n.g(aVarK);
                }
            });
        } catch (com.google.firebase.remoteconfig.t e10) {
            return com.google.android.gms.tasks.n.f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<a> m(Task<h> task, long j10, final Map<String, String> map) {
        final n nVar;
        Task taskO;
        final Date date = new Date(this.f124572d.currentTimeMillis());
        if (task.u() && f(j10, date)) {
            return com.google.android.gms.tasks.n.g(a.c(date));
        }
        Date dateP = p(date);
        if (dateP != null) {
            taskO = com.google.android.gms.tasks.n.f(new com.google.firebase.remoteconfig.u(h(dateP.getTime() - date.getTime()), dateP.getTime()));
            nVar = this;
        } else {
            final Task<String> id2 = this.f124569a.getId();
            final Task<com.google.firebase.installations.p> taskB = this.f124569a.b(false);
            nVar = this;
            taskO = com.google.android.gms.tasks.n.m(id2, taskB).o(this.f124571c, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.remoteconfig.internal.j
                @Override // com.google.android.gms.tasks.c
                public final Object a(Task task2) {
                    return n.a(this.f124554a, id2, taskB, date, map, task2);
                }
            });
        }
        return taskO.o(nVar.f124571c, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task2) {
                return n.c(this.f124559a, date, task2);
            }
        });
    }

    @p0
    private Date p(Date date) {
        Date dateA = this.f124576h.b().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    @m1
    private Long q() {
        com.google.firebase.analytics.connector.a aVar = this.f124570b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.g(true).get(f124567m);
    }

    private long r(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f124565k;
        long millis = timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f124573e.nextInt((int) millis));
    }

    @m1
    private Map<String, String> t() {
        HashMap map = new HashMap();
        com.google.firebase.analytics.connector.a aVar = this.f124570b.get();
        if (aVar != null) {
            for (Map.Entry<String, Object> entry : aVar.g(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private boolean u(int i10) {
        return i10 == f124566l || i10 == 502 || i10 == 503 || i10 == 504;
    }

    private boolean v(u.a aVar, int i10) {
        return aVar.b() > 1 || i10 == f124566l;
    }

    private u.a w(int i10, Date date) {
        if (u(i10)) {
            x(date);
        }
        return this.f124576h.b();
    }

    private void x(Date date) {
        int iB = this.f124576h.b().b() + 1;
        this.f124576h.n(iB, new Date(date.getTime() + r(iB)));
    }

    private void y(Task<a> task, Date date) {
        if (task.u()) {
            this.f124576h.v(date);
            return;
        }
        Exception excP = task.p();
        if (excP == null) {
            return;
        }
        if (excP instanceof com.google.firebase.remoteconfig.u) {
            this.f124576h.w();
        } else {
            this.f124576h.u();
        }
    }

    public Task<a> i() {
        return j(this.f124576h.j());
    }

    public Task<a> j(final long j10) {
        final HashMap map = new HashMap(this.f124577i);
        map.put(f124568n, b.BASE.l() + "/1");
        return this.f124574f.f().o(this.f124571c, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.remoteconfig.internal.i
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task) {
                return this.f124551a.m(task, j10, map);
            }
        });
    }

    public Task<a> n(b bVar, int i10) {
        final HashMap map = new HashMap(this.f124577i);
        map.put(f124568n, bVar.l() + "/" + i10);
        return this.f124574f.f().o(this.f124571c, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.remoteconfig.internal.l
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task) {
                return this.f124561a.m(task, 0L, map);
            }
        });
    }

    @l1
    public z8.b<com.google.firebase.analytics.connector.a> o() {
        return this.f124570b;
    }

    public long s() {
        return this.f124576h.i();
    }
}
