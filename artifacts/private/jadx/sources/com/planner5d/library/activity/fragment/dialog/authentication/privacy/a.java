package com.planner5d.library.activity.fragment.dialog.authentication.privacy;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f131978a;

    @NonNull
    public static a b(@NonNull l1 l1Var) {
        a aVar = new a();
        if (!l1Var.c("user")) {
            throw new IllegalArgumentException("Required argument \"user\" is missing and does not have an android:defaultValue");
        }
        String str = (String) l1Var.e("user");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
        }
        aVar.f131978a.put("user", str);
        return aVar;
    }

    @NonNull
    public static a fromBundle(@NonNull Bundle bundle) {
        a aVar = new a();
        bundle.setClassLoader(a.class.getClassLoader());
        if (!bundle.containsKey("user")) {
            throw new IllegalArgumentException("Required argument \"user\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("user");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
        }
        aVar.f131978a.put("user", string);
        return aVar;
    }

    @NonNull
    public String c() {
        return (String) this.f131978a.get("user");
    }

    @NonNull
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f131978a.containsKey("user")) {
            bundle.putString("user", (String) this.f131978a.get("user"));
        }
        return bundle;
    }

    @NonNull
    public l1 e() {
        l1 l1Var = new l1();
        if (this.f131978a.containsKey("user")) {
            l1Var.n("user", (String) this.f131978a.get("user"));
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
        a aVar = (a) obj;
        if (this.f131978a.containsKey("user") != aVar.f131978a.containsKey("user")) {
            return false;
        }
        return c() == null ? aVar.c() == null : c().equals(aVar.c());
    }

    public int hashCode() {
        return 31 + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        return "AuthenticationPrivacyAgreementArgs{user=" + c() + "}";
    }

    private a() {
        this.f131978a = new HashMap();
    }

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.authentication.privacy.a$a, reason: collision with other inner class name */
    public static final class C1451a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131979a;

        public C1451a(@NonNull a aVar) {
            HashMap map = new HashMap();
            this.f131979a = map;
            map.putAll(aVar.f131978a);
        }

        @NonNull
        public a a() {
            return new a(this.f131979a);
        }

        @NonNull
        public String b() {
            return (String) this.f131979a.get("user");
        }

        @NonNull
        public C1451a c(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
            }
            this.f131979a.put("user", str);
            return this;
        }

        public C1451a(@NonNull String str) {
            HashMap map = new HashMap();
            this.f131979a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
            }
            map.put("user", str);
        }
    }

    private a(HashMap map) {
        HashMap map2 = new HashMap();
        this.f131978a = map2;
        map2.putAll(map);
    }
}
