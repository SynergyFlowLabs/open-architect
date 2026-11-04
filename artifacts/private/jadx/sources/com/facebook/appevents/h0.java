package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.e1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f98880f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f98881g = h0.class.getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f98882h = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.facebook.internal.c f98883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f98884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private List<e> f98885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<e> f98886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f98887e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h0(@NotNull com.facebook.internal.c attributionIdentifiers, @NotNull String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f98883a = attributionIdentifiers;
        this.f98884b = anonymousAppDeviceGUID;
        this.f98885c = new ArrayList();
        this.f98886d = new ArrayList();
    }

    private final void g(GraphRequest graphRequest, Context context, int i10, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                try {
                    com.facebook.appevents.internal.h hVar = com.facebook.appevents.internal.h.f99013a;
                    jSONObject = com.facebook.appevents.internal.h.a(com.facebook.appevents.internal.h.a.CUSTOM_APP_EVENTS, this.f98883a, this.f98884b, z10, context);
                    if (this.f98887e > 0) {
                        jSONObject.put("num_skipped_events", i10);
                    }
                } catch (JSONException unused) {
                    jSONObject = new JSONObject();
                }
                graphRequest.o0(jSONObject);
                Bundle bundleK = graphRequest.K();
                String string = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(string, "events.toString()");
                bundleK.putString("custom_events", string);
                graphRequest.s0(string);
                graphRequest.r0(bundleK);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final synchronized void a(@NotNull List<e> events) {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(events, "events");
                this.f98885c.addAll(events);
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(@NotNull e event) {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(event, "event");
                if (this.f98885c.size() + this.f98886d.size() >= f98882h) {
                    this.f98887e++;
                } else {
                    this.f98885c.add(event);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void c(boolean z10) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        if (z10) {
            try {
                this.f98885c.addAll(this.f98886d);
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return;
            }
        }
        this.f98886d.clear();
        this.f98887e = 0;
    }

    public final synchronized int d() {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return 0;
            }
            try {
                return this.f98885c.size();
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return 0;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @NotNull
    public final synchronized List<e> e() {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                List<e> list = this.f98885c;
                this.f98885c = new ArrayList();
                return list;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final int f(@NotNull GraphRequest request, @NotNull Context applicationContext, boolean z10, boolean z11) {
        Throwable th2;
        Throwable th3;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            try {
                synchronized (this) {
                    try {
                        int i10 = this.f98887e;
                        g5.a aVar = g5.a.f275403a;
                        g5.a.d(this.f98885c);
                        this.f98886d.addAll(this.f98885c);
                        this.f98885c.clear();
                        JSONArray jSONArray = new JSONArray();
                        for (e eVar : this.f98886d) {
                            try {
                                if (!eVar.g()) {
                                    e1 e1Var = e1.f99794a;
                                    e1.g0(f98881g, Intrinsics.stringPlus("Event with invalid checksum: ", eVar));
                                } else if (z10 || !eVar.h()) {
                                    jSONArray.put(eVar.f());
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            Unit unit = Unit.f312394a;
                            g(request, applicationContext, i10, jSONArray, z11);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th5) {
                            th2 = th5;
                            com.facebook.internal.instrument.crashshield.b.c(th2, this);
                            return 0;
                        }
                    } catch (Throwable th6) {
                        th3 = th6;
                    }
                    throw th3;
                }
            } catch (Throwable th7) {
                th = th7;
                th2 = th;
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return 0;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }
}
