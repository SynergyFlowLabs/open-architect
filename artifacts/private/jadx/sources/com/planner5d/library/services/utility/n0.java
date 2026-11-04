package com.planner5d.library.services.utility;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f225333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f225334d;

    public n0(long j10) {
        this.f225333c = j10;
    }

    @Override // com.planner5d.library.services.utility.m0
    protected boolean a() {
        return super.a() && c() - this.f225334d >= this.f225333c * 1000;
    }

    @Override // com.planner5d.library.services.utility.m0
    protected void b() {
        super.b();
        this.f225334d = c();
    }

    @lm.n
    public final long c() {
        return System.currentTimeMillis();
    }
}
