package com.planner5d.library.model.manager.builtin;

/* JADX INFO: loaded from: classes7.dex */
class d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f180963c = {com.planner5d.library.api.f.a().f142268f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f180964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.h
    private final String f180965b;

    d1(@fj.g String str, @fj.h String str2) {
        this.f180964a = str;
        this.f180965b = str2;
    }

    @fj.h
    public String a() {
        return this.f180965b;
    }

    public String b() {
        return this.f180964a;
    }

    public String c() {
        return "datafile/materials/" + this.f180964a;
    }

    public com.planner5d.library.services.download.g[] d(com.planner5d.library.model.d dVar, boolean z10) {
        String str;
        com.planner5d.library.services.download.o oVar = com.planner5d.library.services.download.o.f224287a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f180964a);
        if (!z10 || this.f180965b == null) {
            str = "";
        } else {
            str = "?hash=" + this.f180965b;
        }
        sb2.append(str);
        return oVar.d(dVar, sb2.toString(), f180963c);
    }
}
