package com.google.firebase.perf.application;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.annotation.l1;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.metrics.g;
import com.google.firebase.perf.util.f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f123861e = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123862f = "androidx.core.app.FrameMetricsAggregator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f123863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameMetricsAggregator f123864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Fragment, g.a> f123865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f123866d;

    public d(Activity activity) {
        this(activity, new FrameMetricsAggregator(), new HashMap());
    }

    static boolean a() {
        return true;
    }

    private f<g.a> b() {
        if (!this.f123866d) {
            f123861e.a("No recording has been started.");
            return f.a();
        }
        SparseIntArray[] sparseIntArrayArrB = this.f123864b.b();
        if (sparseIntArrayArrB == null) {
            f123861e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return f.a();
        }
        if (sparseIntArrayArrB[0] != null) {
            return f.e(g.a(sparseIntArrayArrB));
        }
        f123861e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return f.a();
    }

    public void c() {
        if (this.f123866d) {
            f123861e.b("FrameMetricsAggregator is already recording %s", this.f123863a.getClass().getSimpleName());
        } else {
            this.f123864b.a(this.f123863a);
            this.f123866d = true;
        }
    }

    public void d(Fragment fragment) {
        if (!this.f123866d) {
            f123861e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f123865c.containsKey(fragment)) {
            f123861e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        f<g.a> fVarB = b();
        if (fVarB.d()) {
            this.f123865c.put(fragment, fVarB.c());
        } else {
            f123861e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public f<g.a> e() {
        if (!this.f123866d) {
            f123861e.a("Cannot stop because no recording was started");
            return f.a();
        }
        if (!this.f123865c.isEmpty()) {
            f123861e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f123865c.clear();
        }
        f<g.a> fVarB = b();
        try {
            this.f123864b.c(this.f123863a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if (e10 instanceof NullPointerException) {
                throw e10;
            }
            f123861e.m("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            fVarB = f.a();
        }
        this.f123864b.d();
        this.f123866d = false;
        return fVarB;
    }

    public f<g.a> f(Fragment fragment) {
        if (!this.f123866d) {
            f123861e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return f.a();
        }
        if (!this.f123865c.containsKey(fragment)) {
            f123861e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return f.a();
        }
        g.a aVarRemove = this.f123865c.remove(fragment);
        f<g.a> fVarB = b();
        if (fVarB.d()) {
            return f.e(fVarB.c().a(aVarRemove));
        }
        f123861e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return f.a();
    }

    @l1
    d(Activity activity, FrameMetricsAggregator frameMetricsAggregator, Map<Fragment, g.a> map) {
        this.f123866d = false;
        this.f123863a = activity;
        this.f123864b = frameMetricsAggregator;
        this.f123865c = map;
    }
}
