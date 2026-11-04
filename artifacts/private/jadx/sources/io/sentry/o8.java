package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class o8 extends z5 implements m2, k2 {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final long f305969h3 = 10485760;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final String f305970i3 = "replay_event";
    private int Y;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305971g3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private Date f305972p0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private File f305975t;

    @Nullable
    private io.sentry.protocol.v X = new io.sentry.protocol.v();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private String f305976v = f305970i3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private c f305977w = c.SESSION;

    @Nullable
    private List<String> H1 = new ArrayList();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private List<String> f305974p2 = new ArrayList();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private List<String> f305973p1 = new ArrayList();

    @NotNull
    private Date Z = p.d();

    public static final class a implements a2<o8> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o8 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            z5.a aVar = new z5.a();
            o8 o8Var = new o8();
            y3Var.m1();
            String strN6 = null;
            c cVar = null;
            Integer numRc = null;
            Date dateZ3 = null;
            HashMap map = null;
            io.sentry.protocol.v vVar = null;
            Date dateZ4 = null;
            List<String> list = null;
            List<String> list2 = null;
            List<String> list3 = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "replay_id":
                        vVar = (io.sentry.protocol.v) y3Var.i4(iLogger, new io.sentry.protocol.v.a());
                        break;
                    case "replay_start_timestamp":
                        dateZ4 = y3Var.z3(iLogger);
                        break;
                    case "type":
                        strN6 = y3Var.n6();
                        break;
                    case "urls":
                        list = (List) y3Var.re();
                        break;
                    case "timestamp":
                        dateZ3 = y3Var.z3(iLogger);
                        break;
                    case "error_ids":
                        list2 = (List) y3Var.re();
                        break;
                    case "trace_ids":
                        list3 = (List) y3Var.re();
                        break;
                    case "replay_type":
                        cVar = (c) y3Var.i4(iLogger, new c.a());
                        break;
                    case "segment_id":
                        numRc = y3Var.rc();
                        break;
                    default:
                        if (!aVar.a(o8Var, strNa, y3Var, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            y3Var.gd(iLogger, map, strNa);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            y3Var.F1();
            if (strN6 != null) {
                o8Var.E0(strN6);
            }
            if (cVar != null) {
                o8Var.A0(cVar);
            }
            if (numRc != null) {
                o8Var.B0(numRc.intValue());
            }
            if (dateZ3 != null) {
                o8Var.C0(dateZ3);
            }
            o8Var.y0(vVar);
            o8Var.z0(dateZ4);
            o8Var.F0(list);
            o8Var.x0(list2);
            o8Var.D0(list3);
            o8Var.setUnknown(map);
            return o8Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305978a = "type";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305979b = "replay_type";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305980c = "replay_id";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305981d = "segment_id";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305982e = "timestamp";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305983f = "replay_start_timestamp";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305984g = "urls";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f305985h = "error_ids";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f305986i = "trace_ids";
    }

    public enum c implements k2 {
        SESSION,
        BUFFER;

        public static final class a implements a2<c> {
            @Override // io.sentry.a2
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
                return c.valueOf(y3Var.jc().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.k2
        public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
            z3Var.b(name().toLowerCase(Locale.ROOT));
        }
    }

    public void A0(@NotNull c cVar) {
        this.f305977w = cVar;
    }

    public void B0(int i10) {
        this.Y = i10;
    }

    public void C0(@NotNull Date date) {
        this.Z = date;
    }

    public void D0(@Nullable List<String> list) {
        this.f305974p2 = list;
    }

    public void E0(@NotNull String str) {
        this.f305976v = str;
    }

    public void F0(@Nullable List<String> list) {
        this.f305973p1 = list;
    }

    public void G0(@Nullable File file) {
        this.f305975t = file;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o8.class == obj.getClass()) {
            o8 o8Var = (o8) obj;
            if (this.Y == o8Var.Y && io.sentry.util.y.a(this.f305976v, o8Var.f305976v) && this.f305977w == o8Var.f305977w && io.sentry.util.y.a(this.X, o8Var.X) && io.sentry.util.y.a(this.f305973p1, o8Var.f305973p1) && io.sentry.util.y.a(this.H1, o8Var.H1) && io.sentry.util.y.a(this.f305974p2, o8Var.f305974p2)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305971g3;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f305976v, this.f305977w, this.X, Integer.valueOf(this.Y), this.f305973p1, this.H1, this.f305974p2);
    }

    @Nullable
    public List<String> n0() {
        return this.H1;
    }

    @Nullable
    public io.sentry.protocol.v o0() {
        return this.X;
    }

    @Nullable
    public Date p0() {
        return this.f305972p0;
    }

    @NotNull
    public c q0() {
        return this.f305977w;
    }

    public int r0() {
        return this.Y;
    }

    @NotNull
    public Date s0() {
        return this.Z;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("type").b(this.f305976v);
        z3Var.f(b.f305979b).j(iLogger, this.f305977w);
        z3Var.f("segment_id").c(this.Y);
        z3Var.f("timestamp").j(iLogger, this.Z);
        if (this.X != null) {
            z3Var.f("replay_id").j(iLogger, this.X);
        }
        if (this.f305972p0 != null) {
            z3Var.f(b.f305983f).j(iLogger, this.f305972p0);
        }
        if (this.f305973p1 != null) {
            z3Var.f(b.f305984g).j(iLogger, this.f305973p1);
        }
        if (this.H1 != null) {
            z3Var.f(b.f305985h).j(iLogger, this.H1);
        }
        if (this.f305974p2 != null) {
            z3Var.f(b.f305986i).j(iLogger, this.f305974p2);
        }
        new z5.c().a(this, z3Var, iLogger);
        Map<String, Object> map = this.f305971g3;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f305971g3.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305971g3 = map;
    }

    @Nullable
    public List<String> t0() {
        return this.f305974p2;
    }

    @NotNull
    public String u0() {
        return this.f305976v;
    }

    @Nullable
    public List<String> v0() {
        return this.f305973p1;
    }

    @Nullable
    public File w0() {
        return this.f305975t;
    }

    public void x0(@Nullable List<String> list) {
        this.H1 = list;
    }

    public void y0(@Nullable io.sentry.protocol.v vVar) {
        this.X = vVar;
    }

    public void z0(@Nullable Date date) {
        this.f305972p0 = date;
    }
}
