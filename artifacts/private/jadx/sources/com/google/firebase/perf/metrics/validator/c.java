package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.perf.util.k;
import com.google.firebase.perf.v1.q;
import java.net.URI;

/* JADX INFO: loaded from: classes5.dex */
final class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124041c = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f124042d = "http";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f124043e = "https";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f124044f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f124045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f124046b;

    c(q qVar, Context context) {
        this.f124046b = context;
        this.f124045a = qVar;
    }

    @p0
    private URI g(@p0 String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f124041c.m("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    private boolean h(@p0 URI uri, @NonNull Context context) {
        if (uri == null) {
            return false;
        }
        return k.a(uri, context);
    }

    private boolean i(@p0 String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(@p0 String str) {
        return i(str);
    }

    private boolean k(@p0 String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    private boolean m(int i10) {
        return i10 > 0;
    }

    private boolean n(long j10) {
        return j10 >= 0;
    }

    private boolean o(int i10) {
        return i10 == -1 || i10 > 0;
    }

    private boolean p(@p0 String str) {
        if (str == null) {
            return false;
        }
        return f124042d.equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    private boolean q(long j10) {
        return j10 >= 0;
    }

    private boolean r(@p0 String str) {
        return str == null;
    }

    @Override // com.google.firebase.perf.metrics.validator.e
    public boolean c() {
        if (j(this.f124045a.getUrl())) {
            f124041c.l("URL is missing:" + this.f124045a.getUrl());
            return false;
        }
        URI uriG = g(this.f124045a.getUrl());
        if (uriG == null) {
            f124041c.l("URL cannot be parsed");
            return false;
        }
        if (!h(uriG, this.f124046b)) {
            f124041c.l("URL fails allowlist rule: " + uriG);
            return false;
        }
        if (!k(uriG.getHost())) {
            f124041c.l("URL host is null or invalid");
            return false;
        }
        if (!p(uriG.getScheme())) {
            f124041c.l("URL scheme is null or invalid");
            return false;
        }
        if (!r(uriG.getUserInfo())) {
            f124041c.l("URL user info is null");
            return false;
        }
        if (!o(uriG.getPort())) {
            f124041c.l("URL port is less than or equal to 0");
            return false;
        }
        if (!l(this.f124045a.C9() ? this.f124045a.sc() : null)) {
            f124041c.l("HTTP Method is null or invalid: " + this.f124045a.sc());
            return false;
        }
        if (this.f124045a.pf() && !m(this.f124045a.vg())) {
            f124041c.l("HTTP ResponseCode is a negative value:" + this.f124045a.vg());
            return false;
        }
        if (this.f124045a.Uh() && !n(this.f124045a.r9())) {
            f124041c.l("Request Payload is a negative value:" + this.f124045a.r9());
            return false;
        }
        if (this.f124045a.wb() && !n(this.f124045a.b9())) {
            f124041c.l("Response Payload is a negative value:" + this.f124045a.b9());
            return false;
        }
        if (!this.f124045a.H7() || this.f124045a.X7() <= 0) {
            f124041c.l("Start time of the request is null, or zero, or a negative value:" + this.f124045a.X7());
            return false;
        }
        if (this.f124045a.R9() && !q(this.f124045a.p8())) {
            f124041c.l("Time to complete the request is a negative value:" + this.f124045a.p8());
            return false;
        }
        if (this.f124045a.w9() && !q(this.f124045a.Gj())) {
            f124041c.l("Time from the start of the request to the start of the response is null or a negative value:" + this.f124045a.Gj());
            return false;
        }
        if (this.f124045a.dd() && this.f124045a.s8() > 0) {
            if (this.f124045a.pf()) {
                return true;
            }
            f124041c.l("Did not receive a HTTP Response Code");
            return false;
        }
        f124041c.l("Time from the start of the request to the end of the response is null, negative or zero:" + this.f124045a.s8());
        return false;
    }

    boolean l(@p0 q.d dVar) {
        if (dVar == null || dVar == q.d.HTTP_METHOD_UNKNOWN) {
            return false;
        }
        int i10 = 3 << 1;
        return true;
    }
}
