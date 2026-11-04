package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.e6;
import io.sentry.e8;
import io.sentry.p;
import lm.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f304466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f304467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f304468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f304469d;

    public void D() {
        this.f304466a = null;
        this.f304468c = 0L;
        this.f304469d = 0L;
        this.f304467b = 0L;
    }

    public void E(@Nullable String str) {
        this.f304466a = str;
    }

    @n
    public void H(long j10) {
        this.f304467b = j10;
    }

    public void I(long j10) {
        this.f304468c = j10;
        this.f304467b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f304468c);
    }

    public void L(long j10) {
        this.f304469d = j10;
    }

    public void M(@Nullable String str, long j10, long j11, long j12) {
        this.f304466a = str;
        this.f304467b = j10;
        this.f304468c = j11;
        this.f304469d = j12;
    }

    public void N() {
        this.f304468c = SystemClock.uptimeMillis();
        this.f304467b = System.currentTimeMillis();
    }

    public void O() {
        this.f304469d = SystemClock.uptimeMillis();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull i iVar) {
        return Long.compare(this.f304467b, iVar.f304467b);
    }

    @Nullable
    public String k() {
        return this.f304466a;
    }

    public long l() {
        if (z()) {
            return this.f304469d - this.f304468c;
        }
        return 0L;
    }

    @Nullable
    public e6 n() {
        if (z()) {
            return new e8(p.i(o()));
        }
        return null;
    }

    public long o() {
        if (x()) {
            return this.f304467b + l();
        }
        return 0L;
    }

    public double p() {
        return p.j(o());
    }

    @Nullable
    public e6 q() {
        if (x()) {
            return new e8(p.i(r()));
        }
        return null;
    }

    public long r() {
        return this.f304467b;
    }

    public double s() {
        return p.j(this.f304467b);
    }

    public long t() {
        return this.f304468c;
    }

    public boolean v() {
        return this.f304468c == 0;
    }

    public boolean w() {
        return this.f304469d == 0;
    }

    public boolean x() {
        return this.f304468c != 0;
    }

    public boolean z() {
        return this.f304469d != 0;
    }
}
