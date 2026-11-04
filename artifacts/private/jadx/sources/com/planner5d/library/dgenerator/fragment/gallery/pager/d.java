package com.planner5d.library.dgenerator.fragment.gallery.pager;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f160200a;

    @NonNull
    public static d b(@NonNull l1 l1Var) {
        d dVar = new d();
        if (!l1Var.c("toolbarTitle")) {
            throw new IllegalArgumentException("Required argument \"toolbarTitle\" is missing and does not have an android:defaultValue");
        }
        String str = (String) l1Var.e("toolbarTitle");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
        }
        dVar.f160200a.put("toolbarTitle", str);
        if (!l1Var.c("autoStyleId")) {
            throw new IllegalArgumentException("Required argument \"autoStyleId\" is missing and does not have an android:defaultValue");
        }
        Long l10 = (Long) l1Var.e("autoStyleId");
        l10.longValue();
        dVar.f160200a.put("autoStyleId", l10);
        if (!l1Var.c("imageIndex")) {
            throw new IllegalArgumentException("Required argument \"imageIndex\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) l1Var.e("imageIndex");
        num.intValue();
        dVar.f160200a.put("imageIndex", num);
        return dVar;
    }

    @NonNull
    public static d fromBundle(@NonNull Bundle bundle) {
        d dVar = new d();
        bundle.setClassLoader(d.class.getClassLoader());
        if (!bundle.containsKey("toolbarTitle")) {
            throw new IllegalArgumentException("Required argument \"toolbarTitle\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("toolbarTitle");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
        }
        dVar.f160200a.put("toolbarTitle", string);
        if (!bundle.containsKey("autoStyleId")) {
            throw new IllegalArgumentException("Required argument \"autoStyleId\" is missing and does not have an android:defaultValue");
        }
        dVar.f160200a.put("autoStyleId", Long.valueOf(bundle.getLong("autoStyleId")));
        if (!bundle.containsKey("imageIndex")) {
            throw new IllegalArgumentException("Required argument \"imageIndex\" is missing and does not have an android:defaultValue");
        }
        dVar.f160200a.put("imageIndex", Integer.valueOf(bundle.getInt("imageIndex")));
        return dVar;
    }

    public long c() {
        return ((Long) this.f160200a.get("autoStyleId")).longValue();
    }

    public int d() {
        return ((Integer) this.f160200a.get("imageIndex")).intValue();
    }

    @NonNull
    public String e() {
        return (String) this.f160200a.get("toolbarTitle");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f160200a.containsKey("toolbarTitle") != dVar.f160200a.containsKey("toolbarTitle")) {
                return false;
            }
            if (e() == null ? dVar.e() == null : e().equals(dVar.e())) {
                return this.f160200a.containsKey("autoStyleId") == dVar.f160200a.containsKey("autoStyleId") && c() == dVar.c() && this.f160200a.containsKey("imageIndex") == dVar.f160200a.containsKey("imageIndex") && d() == dVar.d();
            }
            return false;
        }
        return false;
    }

    @NonNull
    public Bundle f() {
        Bundle bundle = new Bundle();
        if (this.f160200a.containsKey("toolbarTitle")) {
            bundle.putString("toolbarTitle", (String) this.f160200a.get("toolbarTitle"));
        }
        if (this.f160200a.containsKey("autoStyleId")) {
            bundle.putLong("autoStyleId", ((Long) this.f160200a.get("autoStyleId")).longValue());
        }
        if (this.f160200a.containsKey("imageIndex")) {
            bundle.putInt("imageIndex", ((Integer) this.f160200a.get("imageIndex")).intValue());
        }
        return bundle;
    }

    @NonNull
    public l1 g() {
        l1 l1Var = new l1();
        if (this.f160200a.containsKey("toolbarTitle")) {
            l1Var.n("toolbarTitle", (String) this.f160200a.get("toolbarTitle"));
        }
        if (this.f160200a.containsKey("autoStyleId")) {
            Long l10 = (Long) this.f160200a.get("autoStyleId");
            l10.longValue();
            l1Var.n("autoStyleId", l10);
        }
        if (this.f160200a.containsKey("imageIndex")) {
            Integer num = (Integer) this.f160200a.get("imageIndex");
            num.intValue();
            l1Var.n("imageIndex", num);
        }
        return l1Var;
    }

    public int hashCode() {
        return (((((e() != null ? e().hashCode() : 0) + 31) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d();
    }

    public String toString() {
        return "GalleryPagerFragmentArgs{toolbarTitle=" + e() + ", autoStyleId=" + c() + ", imageIndex=" + d() + "}";
    }

    private d() {
        this.f160200a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f160201a;

        public a(@NonNull d dVar) {
            HashMap map = new HashMap();
            this.f160201a = map;
            map.putAll(dVar.f160200a);
        }

        @NonNull
        public d a() {
            return new d(this.f160201a);
        }

        public long b() {
            return ((Long) this.f160201a.get("autoStyleId")).longValue();
        }

        public int c() {
            return ((Integer) this.f160201a.get("imageIndex")).intValue();
        }

        @NonNull
        public String d() {
            return (String) this.f160201a.get("toolbarTitle");
        }

        @NonNull
        public a e(long j10) {
            this.f160201a.put("autoStyleId", Long.valueOf(j10));
            return this;
        }

        @NonNull
        public a f(int i10) {
            this.f160201a.put("imageIndex", Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public a g(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
            }
            this.f160201a.put("toolbarTitle", str);
            return this;
        }

        public a(@NonNull String str, long j10, int i10) {
            HashMap map = new HashMap();
            this.f160201a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"toolbarTitle\" is marked as non-null but was passed a null value.");
            }
            map.put("toolbarTitle", str);
            map.put("autoStyleId", Long.valueOf(j10));
            map.put("imageIndex", Integer.valueOf(i10));
        }
    }

    private d(HashMap map) {
        HashMap map2 = new HashMap();
        this.f160200a = map2;
        map2.putAll(map);
    }
}
