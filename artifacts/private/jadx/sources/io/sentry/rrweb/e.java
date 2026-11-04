package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends d implements k2, m2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f306654l = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private b f306655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f306656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f306657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f306658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f306659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f306660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306662k;

    public static final class a implements a2<e> {
        private void c(@NotNull e eVar, @NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            d.a aVar = new d.a();
            y3Var.m1();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "x":
                        eVar.f306657f = y3Var.nextFloat();
                        break;
                    case "y":
                        eVar.f306658g = y3Var.nextFloat();
                        break;
                    case "id":
                        eVar.f306656e = y3Var.nextInt();
                        break;
                    case "type":
                        eVar.f306655d = (b) y3Var.i4(iLogger, new b.a());
                        break;
                    case "pointerType":
                        eVar.f306659h = y3Var.nextInt();
                        break;
                    case "pointerId":
                        eVar.f306660i = y3Var.nextInt();
                        break;
                    default:
                        if (!aVar.a(eVar, strNa, y3Var, iLogger)) {
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
            eVar.A(map);
            y3Var.F1();
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            e eVar = new e();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("data")) {
                    c(eVar, y3Var, iLogger);
                } else if (!aVar.a(eVar, strNa, y3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            eVar.setUnknown(map);
            y3Var.F1();
            return eVar;
        }
    }

    public enum b implements k2 {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        public static final class a implements a2<b> {
            @Override // io.sentry.a2
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
                return b.values()[y3Var.nextInt()];
            }
        }

        @Override // io.sentry.k2
        public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
            z3Var.c(ordinal());
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306663a = "data";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306664b = "type";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306665c = "id";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306666d = "x";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f306667e = "y";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f306668f = "pointerType";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f306669g = "pointerId";
    }

    public e() {
        super(d.b.MouseInteraction);
        this.f306659h = 2;
    }

    private void z(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        new d.C2233d().a(this, z3Var, iLogger);
        z3Var.f("type").j(iLogger, this.f306655d);
        z3Var.f("id").c(this.f306656e);
        z3Var.f("x").d(this.f306657f);
        z3Var.f("y").d(this.f306658g);
        z3Var.f(c.f306668f).c(this.f306659h);
        z3Var.f("pointerId").c(this.f306660i);
        Map<String, Object> map = this.f306662k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306662k.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    public void A(@Nullable Map<String, Object> map) {
        this.f306662k = map;
    }

    public void B(int i10) {
        this.f306656e = i10;
    }

    public void C(@Nullable b bVar) {
        this.f306655d = bVar;
    }

    public void D(int i10) {
        this.f306660i = i10;
    }

    public void E(int i10) {
        this.f306659h = i10;
    }

    public void F(float f10) {
        this.f306657f = f10;
    }

    public void G(float f10) {
        this.f306658g = f10;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306661j;
    }

    @Nullable
    public Map<String, Object> s() {
        return this.f306662k;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        new io.sentry.rrweb.b.c().a(this, z3Var, iLogger);
        z3Var.f("data");
        z(z3Var, iLogger);
        Map<String, Object> map = this.f306661j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306661j.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306661j = map;
    }

    public int t() {
        return this.f306656e;
    }

    @Nullable
    public b u() {
        return this.f306655d;
    }

    public int v() {
        return this.f306660i;
    }

    public int w() {
        return this.f306659h;
    }

    public float x() {
        return this.f306657f;
    }

    public float y() {
        return this.f306658g;
    }
}
