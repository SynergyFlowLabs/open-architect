package com.planner5d.library.dgenerator.fragment.gallery;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class f implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f160159a;

    @NonNull
    public static f b(@NonNull l1 l1Var) {
        f fVar = new f();
        if (!l1Var.c("toolbarTitle")) {
            throw new IllegalArgumentException("Required argument \"toolbarTitle\" is missing and does not have an android:defaultValue");
        }
        String str = (String) l1Var.e("toolbarTitle");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
        }
        fVar.f160159a.put("toolbarTitle", str);
        if (!l1Var.c("autoStyleId")) {
            throw new IllegalArgumentException("Required argument \"autoStyleId\" is missing and does not have an android:defaultValue");
        }
        Long l10 = (Long) l1Var.e("autoStyleId");
        l10.longValue();
        fVar.f160159a.put("autoStyleId", l10);
        return fVar;
    }

    @NonNull
    public static f fromBundle(@NonNull Bundle bundle) {
        f fVar = new f();
        bundle.setClassLoader(f.class.getClassLoader());
        if (!bundle.containsKey("toolbarTitle")) {
            throw new IllegalArgumentException("Required argument \"toolbarTitle\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("toolbarTitle");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
        }
        fVar.f160159a.put("toolbarTitle", string);
        if (!bundle.containsKey("autoStyleId")) {
            throw new IllegalArgumentException("Required argument \"autoStyleId\" is missing and does not have an android:defaultValue");
        }
        fVar.f160159a.put("autoStyleId", Long.valueOf(bundle.getLong("autoStyleId")));
        return fVar;
    }

    public long c() {
        return ((Long) this.f160159a.get("autoStyleId")).longValue();
    }

    @NonNull
    public String d() {
        return (String) this.f160159a.get("toolbarTitle");
    }

    @NonNull
    public Bundle e() {
        Bundle bundle = new Bundle();
        if (this.f160159a.containsKey("toolbarTitle")) {
            bundle.putString("toolbarTitle", (String) this.f160159a.get("toolbarTitle"));
        }
        if (this.f160159a.containsKey("autoStyleId")) {
            bundle.putLong("autoStyleId", ((Long) this.f160159a.get("autoStyleId")).longValue());
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f160159a.containsKey("toolbarTitle") != fVar.f160159a.containsKey("toolbarTitle")) {
            return false;
        }
        if (d() == null ? fVar.d() == null : d().equals(fVar.d())) {
            return this.f160159a.containsKey("autoStyleId") == fVar.f160159a.containsKey("autoStyleId") && c() == fVar.c();
        }
        return false;
    }

    @NonNull
    public l1 f() {
        l1 l1Var = new l1();
        if (this.f160159a.containsKey("toolbarTitle")) {
            l1Var.n("toolbarTitle", (String) this.f160159a.get("toolbarTitle"));
        }
        if (this.f160159a.containsKey("autoStyleId")) {
            Long l10 = (Long) this.f160159a.get("autoStyleId");
            l10.longValue();
            l1Var.n("autoStyleId", l10);
        }
        return l1Var;
    }

    public int hashCode() {
        return (((d() != null ? d().hashCode() : 0) + 31) * 31) + ((int) (c() ^ (c() >>> 32)));
    }

    public String toString() {
        return "GalleryFragmentArgs{toolbarTitle=" + d() + ", autoStyleId=" + c() + "}";
    }

    private f() {
        this.f160159a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f160160a;

        public a(@NonNull f fVar) {
            HashMap map = new HashMap();
            this.f160160a = map;
            map.putAll(fVar.f160159a);
        }

        @NonNull
        public f a() {
            return new f(this.f160160a);
        }

        public long b() {
            return ((Long) this.f160160a.get("autoStyleId")).longValue();
        }

        @NonNull
        public String c() {
            return (String) this.f160160a.get("toolbarTitle");
        }

        @NonNull
        public a d(long j10) {
            this.f160160a.put("autoStyleId", Long.valueOf(j10));
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
            }
            this.f160160a.put("toolbarTitle", str);
            return this;
        }

        public a(@NonNull String str, long j10) {
            HashMap map = new HashMap();
            this.f160160a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
            }
            map.put("toolbarTitle", str);
            map.put("autoStyleId", Long.valueOf(j10));
        }
    }

    private f(HashMap map) {
        HashMap map2 = new HashMap();
        this.f160159a = map2;
        map2.putAll(map);
    }
}
