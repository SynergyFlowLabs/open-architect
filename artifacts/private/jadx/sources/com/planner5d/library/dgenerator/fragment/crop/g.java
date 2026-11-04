package com.planner5d.library.dgenerator.fragment.crop;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class g implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f160118a;

    @NonNull
    public static g b(@NonNull l1 l1Var) {
        g gVar = new g();
        if (!l1Var.c("autoStyleId")) {
            throw new IllegalArgumentException("Required argument \"autoStyleId\" is missing and does not have an android:defaultValue");
        }
        Long l10 = (Long) l1Var.e("autoStyleId");
        l10.longValue();
        gVar.f160118a.put("autoStyleId", l10);
        return gVar;
    }

    @NonNull
    public static g fromBundle(@NonNull Bundle bundle) {
        g gVar = new g();
        bundle.setClassLoader(g.class.getClassLoader());
        if (!bundle.containsKey("autoStyleId")) {
            throw new IllegalArgumentException("Required argument \"autoStyleId\" is missing and does not have an android:defaultValue");
        }
        gVar.f160118a.put("autoStyleId", Long.valueOf(bundle.getLong("autoStyleId")));
        return gVar;
    }

    public long c() {
        return ((Long) this.f160118a.get("autoStyleId")).longValue();
    }

    @NonNull
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f160118a.containsKey("autoStyleId")) {
            bundle.putLong("autoStyleId", ((Long) this.f160118a.get("autoStyleId")).longValue());
        }
        return bundle;
    }

    @NonNull
    public l1 e() {
        l1 l1Var = new l1();
        if (this.f160118a.containsKey("autoStyleId")) {
            Long l10 = (Long) this.f160118a.get("autoStyleId");
            l10.longValue();
            l1Var.n("autoStyleId", l10);
        }
        return l1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f160118a.containsKey("autoStyleId") == gVar.f160118a.containsKey("autoStyleId") && c() == gVar.c();
    }

    public int hashCode() {
        return 31 + ((int) (c() ^ (c() >>> 32)));
    }

    public String toString() {
        return "AutoStyleImageCropFragmentArgs{autoStyleId=" + c() + "}";
    }

    private g() {
        this.f160118a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f160119a;

        public a(@NonNull g gVar) {
            HashMap map = new HashMap();
            this.f160119a = map;
            map.putAll(gVar.f160118a);
        }

        @NonNull
        public g a() {
            return new g(this.f160119a);
        }

        public long b() {
            return ((Long) this.f160119a.get("autoStyleId")).longValue();
        }

        @NonNull
        public a c(long j10) {
            this.f160119a.put("autoStyleId", Long.valueOf(j10));
            return this;
        }

        public a(long j10) {
            HashMap map = new HashMap();
            this.f160119a = map;
            map.put("autoStyleId", Long.valueOf(j10));
        }
    }

    private g(HashMap map) {
        HashMap map2 = new HashMap();
        this.f160118a = map2;
        map2.putAll(map);
    }
}
