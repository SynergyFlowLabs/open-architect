package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f114815a;

    /* synthetic */ g(f fVar) {
    }

    public final e a() {
        n nVar = this.f114815a;
        if (nVar != null) {
            return new e0(nVar, null);
        }
        throw new IllegalStateException(String.valueOf(n.class.getCanonicalName()).concat(" must be set"));
    }

    public final g b(n nVar) {
        this.f114815a = nVar;
        return this;
    }

    private g() {
    }
}
