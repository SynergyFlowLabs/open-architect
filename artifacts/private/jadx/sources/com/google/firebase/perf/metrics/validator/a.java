package com.google.firebase.perf.metrics.validator;

/* JADX INFO: loaded from: classes5.dex */
public class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124038b = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.perf.v1.e f124039a;

    a(com.google.firebase.perf.v1.e eVar) {
        this.f124039a = eVar;
    }

    private boolean g() {
        com.google.firebase.perf.v1.e eVar = this.f124039a;
        if (eVar == null) {
            f124038b.l("ApplicationInfo is null");
            return false;
        }
        if (!eVar.u4()) {
            f124038b.l("GoogleAppId is null");
            return false;
        }
        if (!this.f124039a.Md()) {
            f124038b.l("AppInstanceId is null");
            return false;
        }
        if (!this.f124039a.Mk()) {
            f124038b.l("ApplicationProcessState is null");
            return false;
        }
        if (!this.f124039a.Mi()) {
            return true;
        }
        if (!this.f124039a.Og().ja()) {
            f124038b.l("AndroidAppInfo.packageName is null");
            return false;
        }
        if (this.f124039a.Og().G8()) {
            return true;
        }
        f124038b.l("AndroidAppInfo.sdkVersion is null");
        return false;
    }

    @Override // com.google.firebase.perf.metrics.validator.e
    public boolean c() {
        if (g()) {
            return true;
        }
        f124038b.l("ApplicationInfo is invalid");
        return false;
    }
}
