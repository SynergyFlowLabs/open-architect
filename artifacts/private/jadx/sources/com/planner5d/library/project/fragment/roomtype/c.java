package com.planner5d.library.project.fragment.roomtype;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class c implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f223823a;

    @NonNull
    public static c b(@NonNull l1 l1Var) {
        c cVar = new c();
        if (!l1Var.c("autoStyleId")) {
            cVar.f223823a.put("autoStyleId", 0L);
            return cVar;
        }
        Long l10 = (Long) l1Var.e("autoStyleId");
        l10.longValue();
        cVar.f223823a.put("autoStyleId", l10);
        return cVar;
    }

    @NonNull
    public static c fromBundle(@NonNull Bundle bundle) {
        c cVar = new c();
        bundle.setClassLoader(c.class.getClassLoader());
        if (!bundle.containsKey("autoStyleId")) {
            cVar.f223823a.put("autoStyleId", 0L);
            return cVar;
        }
        cVar.f223823a.put("autoStyleId", Long.valueOf(bundle.getLong("autoStyleId")));
        return cVar;
    }

    public long c() {
        return ((Long) this.f223823a.get("autoStyleId")).longValue();
    }

    @NonNull
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f223823a.containsKey("autoStyleId")) {
            bundle.putLong("autoStyleId", ((Long) this.f223823a.get("autoStyleId")).longValue());
            return bundle;
        }
        bundle.putLong("autoStyleId", 0L);
        return bundle;
    }

    @NonNull
    public l1 e() {
        l1 l1Var = new l1();
        if (!this.f223823a.containsKey("autoStyleId")) {
            l1Var.n("autoStyleId", 0L);
            return l1Var;
        }
        Long l10 = (Long) this.f223823a.get("autoStyleId");
        l10.longValue();
        l1Var.n("autoStyleId", l10);
        return l1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f223823a.containsKey("autoStyleId") == cVar.f223823a.containsKey("autoStyleId") && c() == cVar.c();
    }

    public int hashCode() {
        return 31 + ((int) (c() ^ (c() >>> 32)));
    }

    public String toString() {
        return "RoomTypeFragmentArgs{autoStyleId=" + c() + "}";
    }

    private c() {
        this.f223823a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f223824a;

        public a(@NonNull c cVar) {
            HashMap map = new HashMap();
            this.f223824a = map;
            map.putAll(cVar.f223823a);
        }

        @NonNull
        public c a() {
            return new c(this.f223824a);
        }

        public long b() {
            return ((Long) this.f223824a.get("autoStyleId")).longValue();
        }

        @NonNull
        public a c(long j10) {
            this.f223824a.put("autoStyleId", Long.valueOf(j10));
            return this;
        }

        public a() {
            this.f223824a = new HashMap();
        }
    }

    private c(HashMap map) {
        HashMap map2 = new HashMap();
        this.f223823a = map2;
        map2.putAll(map);
    }
}
