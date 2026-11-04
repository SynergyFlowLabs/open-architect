package io.ably.lib.types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class k0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String[] f288056o = {"yyyy-MM-dd:hh:mm", "yyyy-MM-dd:hh", "yyyy-MM-dd", "yyyy-MM"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f288057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f288058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f288059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f288060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f288061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f288062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f288063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f288064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f288065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f288066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f288067k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f288068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f288069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f288070n;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f288071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f288072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k f288073c;
    }

    public enum b {
        minute,
        hour,
        day,
        month
    }

    public static class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, d> f288079d;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f288080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f288081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f288082c;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f288083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f288084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f288085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f288086d;
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f288087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f288088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f288089c;
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f288090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f288091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f288092c;
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<String, g> f288093a;
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f288094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, Integer> f288095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f288096c;
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f288097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f288098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f288099c;
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f288100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f288101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f288102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f288103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f288104e;
    }

    public static long a(String str) {
        try {
            return new SimpleDateFormat(f288056o[0].substring(0, str.length())).parse(str).getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static String b(long j10, b bVar) {
        return new SimpleDateFormat(f288056o[bVar.ordinal()]).format(new Date(j10));
    }
}
