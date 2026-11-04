package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    protected static final class a extends com.google.firebase.perf.config.c<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f123872a;

        private a() {
        }

        protected static synchronized a g() {
            try {
                if (f123872a == null) {
                    f123872a = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123872a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String d() {
            return "firebase_performance_collection_deactivated";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.config.b$b, reason: collision with other inner class name */
    protected static final class C1178b extends com.google.firebase.perf.config.c<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static C1178b f123873a;

        private C1178b() {
        }

        protected static synchronized C1178b g() {
            try {
                if (f123873a == null) {
                    f123873a = new C1178b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123873a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return com.google.firebase.perf.util.b.f124189b;
        }

        @Override // com.google.firebase.perf.config.c
        protected String d() {
            return "firebase_performance_collection_enabled";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.TRUE;
        }
    }

    protected static final class c extends com.google.firebase.perf.config.c<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static c f123874a;

        private c() {
        }

        protected static synchronized c g() {
            try {
                if (f123874a == null) {
                    f123874a = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123874a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.ExperimentTTID";
        }

        @Override // com.google.firebase.perf.config.c
        protected String d() {
            return "experiment_app_start_ttid";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_experiment_app_start_ttid";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.FALSE;
        }
    }

    protected static final class d extends com.google.firebase.perf.config.c<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static d f123875a;

        private d() {
        }

        protected static synchronized d g() {
            try {
                if (f123875a == null) {
                    f123875a = new d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123875a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.FragmentSamplingRate";
        }

        @Override // com.google.firebase.perf.config.c
        protected String d() {
            return "fragment_sampling_percentage";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_vc_fragment_sampling_rate";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Double a() {
            return Double.valueOf(0.0d);
        }
    }

    protected static final class e extends com.google.firebase.perf.config.c<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static e f123876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Map<Long, String> f123877b = Collections.unmodifiableMap(new a());

        class a extends HashMap<Long, String> {
            a() {
                put(461L, "FIREPERF_AUTOPUSH");
                put(462L, "FIREPERF");
                put(675L, "FIREPERF_INTERNAL_LOW");
                put(676L, "FIREPERF_INTERNAL_HIGH");
            }
        }

        private e() {
        }

        public static synchronized e g() {
            try {
                if (f123876a == null) {
                    f123876a = new e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123876a;
        }

        protected static String h(long j10) {
            return f123877b.get(Long.valueOf(j10));
        }

        protected static boolean i(long j10) {
            return f123877b.containsKey(Long.valueOf(j10));
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.LogSourceName";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_log_source";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String a() {
            return com.google.firebase.perf.a.f123834f;
        }
    }

    protected static final class f extends com.google.firebase.perf.config.c<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static f f123878a;

        private f() {
        }

        public static synchronized f g() {
            try {
                if (f123878a == null) {
                    f123878a = new f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123878a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.NetworkEventCountBackground";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_rl_network_event_count_bg";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return 70L;
        }
    }

    protected static final class g extends com.google.firebase.perf.config.c<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static g f123879a;

        private g() {
        }

        public static synchronized g g() {
            try {
                if (f123879a == null) {
                    f123879a = new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123879a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.NetworkEventCountForeground";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_rl_network_event_count_fg";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return 700L;
        }
    }

    protected static final class h extends com.google.firebase.perf.config.c<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static h f123880a;

        private h() {
        }

        protected static synchronized h h() {
            try {
                if (f123880a == null) {
                    f123880a = new h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123880a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.NetworkRequestSamplingRate";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_vc_network_request_sampling_rate";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Double a() {
            return Double.valueOf(1.0d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Double b() {
            return Double.valueOf(a().doubleValue() / 1000.0d);
        }
    }

    protected static final class i extends com.google.firebase.perf.config.c<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static i f123881a;

        private i() {
        }

        public static synchronized i g() {
            try {
                if (f123881a == null) {
                    f123881a = new i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123881a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.TimeLimitSec";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_rl_time_limit_sec";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return 600L;
        }
    }

    protected static final class j extends com.google.firebase.perf.config.c<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static j f123882a;

        protected j() {
        }

        protected static synchronized j g() {
            try {
                if (f123882a == null) {
                    f123882a = new j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123882a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.SdkDisabledVersions";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_disabled_android_versions";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String a() {
            return "";
        }
    }

    protected static final class k extends com.google.firebase.perf.config.c<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static k f123883a;

        protected k() {
        }

        protected static synchronized k g() {
            try {
                if (f123883a == null) {
                    f123883a = new k();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123883a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.SdkEnabled";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_enabled";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.TRUE;
        }
    }

    protected static final class l extends com.google.firebase.perf.config.c<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static l f123884a;

        private l() {
        }

        public static synchronized l g() {
            try {
                if (f123884a == null) {
                    f123884a = new l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123884a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
        }

        @Override // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_cpu_capture_frequency_bg_ms";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return 0L;
        }
    }

    protected static final class m extends com.google.firebase.perf.config.c<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static m f123885a;

        private m() {
        }

        public static synchronized m h() {
            try {
                if (f123885a == null) {
                    f123885a = new m();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123885a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
        }

        @Override // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return 100L;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long b() {
            return Long.valueOf(a().longValue() * 3);
        }
    }

    protected static final class n extends com.google.firebase.perf.config.c<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static n f123886a;

        private n() {
        }

        public static synchronized n g() {
            try {
                if (f123886a == null) {
                    f123886a = new n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123886a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.SessionsMaxDurationMinutes";
        }

        @Override // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_max_length_minutes";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_session_max_duration_min";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return 240L;
        }
    }

    protected static final class o extends com.google.firebase.perf.config.c<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static o f123887a;

        private o() {
        }

        public static synchronized o g() {
            try {
                if (f123887a == null) {
                    f123887a = new o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123887a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
        }

        @Override // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return 0L;
        }
    }

    protected static final class p extends com.google.firebase.perf.config.c<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static p f123888a;

        private p() {
        }

        public static synchronized p h() {
            try {
                if (f123888a == null) {
                    f123888a = new p();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123888a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
        }

        @Override // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_memory_capture_frequency_fg_ms";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_session_gauge_memory_capture_frequency_fg_ms";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return 100L;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long b() {
            return Long.valueOf(a().longValue() * 3);
        }
    }

    protected static final class q extends com.google.firebase.perf.config.c<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static q f123889a;

        private q() {
        }

        public static synchronized q h() {
            try {
                if (f123889a == null) {
                    f123889a = new q();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123889a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.SessionSamplingRate";
        }

        @Override // com.google.firebase.perf.config.c
        protected String d() {
            return "sessions_sampling_percentage";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_vc_session_sampling_rate";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Double a() {
            return Double.valueOf(0.01d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Double b() {
            return Double.valueOf(a().doubleValue() / 1000.0d);
        }
    }

    protected static final class r extends com.google.firebase.perf.config.c<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static r f123890a;

        private r() {
        }

        public static synchronized r g() {
            try {
                if (f123890a == null) {
                    f123890a = new r();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123890a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.TraceEventCountBackground";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_rl_trace_event_count_bg";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return 30L;
        }
    }

    protected static final class s extends com.google.firebase.perf.config.c<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static s f123891a;

        private s() {
        }

        public static synchronized s g() {
            try {
                if (f123891a == null) {
                    f123891a = new s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f123891a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.TraceEventCountForeground";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_rl_trace_event_count_fg";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return 300L;
        }
    }

    protected static final class t extends com.google.firebase.perf.config.c<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static t f123892a;

        private t() {
        }

        protected static synchronized t h() {
            try {
                if (f123892a == null) {
                    f123892a = new t();
                }
            } finally {
            }
            return f123892a;
        }

        @Override // com.google.firebase.perf.config.c
        protected String c() {
            return "com.google.firebase.perf.TraceSamplingRate";
        }

        @Override // com.google.firebase.perf.config.c
        protected String e() {
            return "fpr_vc_trace_sampling_rate";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Double a() {
            return Double.valueOf(1.0d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.firebase.perf.config.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Double b() {
            return Double.valueOf(a().doubleValue() / 1000.0d);
        }
    }

    b() {
    }
}
