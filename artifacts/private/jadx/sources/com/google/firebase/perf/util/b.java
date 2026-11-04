package com.google.firebase.perf.util;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f124188a = "FirebasePerfSharedPrefs";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f124189b = "isEnabled";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f124190c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f124191d = 1.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f124192e = 2000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f124193f = 255;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f124194g = 128;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f124195h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f124196i = 100;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f124197j = 100;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f124198k = 40;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f124199l = 100;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f124200m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f124201n = 100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f124202o = 500;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f124203p = "_st_";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f124204q = "Parent_fragment";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f124205r = "Hosting_activity";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f124206s = "No parent";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f124207t = 16;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f124208u = 700;

    public enum a {
        TRACE_EVENT_RATE_LIMITED("_fstec"),
        NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
        TRACE_STARTED_NOT_STOPPED("_tsns"),
        FRAMES_TOTAL("_fr_tot"),
        FRAMES_SLOW("_fr_slo"),
        FRAMES_FROZEN("_fr_fzn");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f124216a;

        a(String str) {
            this.f124216a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f124216a;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.util.b$b, reason: collision with other inner class name */
    public enum EnumC1180b {
        APP_START_TRACE_NAME("_as"),
        ON_CREATE_TRACE_NAME("_astui"),
        ON_START_TRACE_NAME("_astfd"),
        ON_RESUME_TRACE_NAME("_asti"),
        FOREGROUND_TRACE_NAME("_fs"),
        BACKGROUND_TRACE_NAME("_bs");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f124224a;

        static {
            int i10 = 7 & 0;
            int i11 = (4 | 4) ^ 5;
        }

        EnumC1180b(String str) {
            this.f124224a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f124224a;
        }
    }
}
