package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.n8;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private o f306172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private List<DebugImage> f306173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306174c;

    public static final class a implements a2<d> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            d dVar = new d();
            y3Var.m1();
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals(b.f306176b)) {
                    dVar.f306173b = y3Var.p8(iLogger, new DebugImage.a());
                } else if (strNa.equals(b.f306175a)) {
                    dVar.f306172a = (o) y3Var.i4(iLogger, new o.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            y3Var.F1();
            dVar.setUnknown(map);
            return dVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306175a = "sdk_info";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306176b = "images";
    }

    @lm.a.c
    @Nullable
    public static d c(@Nullable d dVar, @NotNull n8 n8Var) {
        ArrayList arrayList = new ArrayList();
        if (n8Var.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(n8Var.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : n8Var.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (dVar == null) {
            dVar = new d();
        }
        if (dVar.d() == null) {
            dVar.f(arrayList);
            return dVar;
        }
        dVar.d().addAll(arrayList);
        return dVar;
    }

    @Nullable
    public List<DebugImage> d() {
        return this.f306173b;
    }

    @Nullable
    public o e() {
        return this.f306172a;
    }

    public void f(@Nullable List<DebugImage> list) {
        this.f306173b = list != null ? new ArrayList(list) : null;
    }

    public void g(@Nullable o oVar) {
        this.f306172a = oVar;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306174c;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306172a != null) {
            z3Var.f(b.f306175a).j(iLogger, this.f306172a);
        }
        if (this.f306173b != null) {
            z3Var.f(b.f306176b).j(iLogger, this.f306173b);
        }
        Map<String, Object> map = this.f306174c;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306174c.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306174c = map;
    }
}
