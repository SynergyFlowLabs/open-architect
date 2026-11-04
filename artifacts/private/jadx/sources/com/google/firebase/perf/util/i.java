package com.google.firebase.perf.util;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124243a = com.google.firebase.perf.logging.a.e();

    public static Trace a(Trace trace, com.google.firebase.perf.metrics.g.a aVar) {
        if (aVar.d() > 0) {
            trace.putMetric(b.a.FRAMES_TOTAL.toString(), aVar.d());
        }
        if (aVar.c() > 0) {
            trace.putMetric(b.a.FRAMES_SLOW.toString(), aVar.c());
        }
        if (aVar.b() > 0) {
            trace.putMetric(b.a.FRAMES_FROZEN.toString(), aVar.b());
        }
        f124243a.a("Screen trace: " + trace.g() + " _fr_tot:" + aVar.d() + " _fr_slo:" + aVar.c() + " _fr_fzn:" + aVar.b());
        return trace;
    }
}
