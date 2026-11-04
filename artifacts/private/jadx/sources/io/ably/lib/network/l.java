package io.ably.lib.network;

import lombok.Generated;

/* JADX INFO: loaded from: classes13.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f287436a;

    @Generated
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Generated
        private r f287437a;

        @Generated
        a() {
        }

        @Generated
        public l a() {
            return new l(this.f287437a);
        }

        @Generated
        public a b(r rVar) {
            this.f287437a = rVar;
            return this;
        }

        @Generated
        public String toString() {
            return "HttpEngineConfig.HttpEngineConfigBuilder(proxy=" + this.f287437a + ")";
        }
    }

    @Generated
    public l(r rVar) {
        this.f287436a = rVar;
    }

    @Generated
    public static a a() {
        return new a();
    }

    @Generated
    protected boolean b(Object obj) {
        return obj instanceof l;
    }

    @Generated
    public r c() {
        return this.f287436a;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!lVar.b(this)) {
            return false;
        }
        r rVarC = c();
        r rVarC2 = lVar.c();
        if (rVarC == null) {
            if (rVarC2 != null) {
            }
        }
        return rVarC.equals(rVarC2);
    }

    @Generated
    public int hashCode() {
        r rVarC = c();
        return 59 + (rVarC == null ? 43 : rVarC.hashCode());
    }

    @Generated
    public String toString() {
        return "HttpEngineConfig(proxy=" + c() + ")";
    }
}
