package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class c0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f131862a;

    @NonNull
    public static c0 b(@NonNull l1 l1Var) {
        c0 c0Var = new c0();
        if (!l1Var.c("fromProfile")) {
            c0Var.f131862a.put("fromProfile", null);
            return c0Var;
        }
        c0Var.f131862a.put("fromProfile", (Boolean) l1Var.e("fromProfile"));
        return c0Var;
    }

    @NonNull
    public static c0 fromBundle(@NonNull Bundle bundle) {
        c0 c0Var = new c0();
        bundle.setClassLoader(c0.class.getClassLoader());
        if (!bundle.containsKey("fromProfile")) {
            c0Var.f131862a.put("fromProfile", null);
            return c0Var;
        }
        if (!Parcelable.class.isAssignableFrom(Boolean.class) && !Serializable.class.isAssignableFrom(Boolean.class)) {
            throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        c0Var.f131862a.put("fromProfile", (Boolean) bundle.get("fromProfile"));
        return c0Var;
    }

    @p0
    public Boolean c() {
        return (Boolean) this.f131862a.get("fromProfile");
    }

    @NonNull
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (!this.f131862a.containsKey("fromProfile")) {
            bundle.putSerializable("fromProfile", null);
            return bundle;
        }
        Boolean bool = (Boolean) this.f131862a.get("fromProfile");
        if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool != null) {
            if (Serializable.class.isAssignableFrom(Boolean.class)) {
                bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
                return bundle;
            }
            throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
        return bundle;
    }

    @NonNull
    public l1 e() {
        l1 l1Var = new l1();
        if (!this.f131862a.containsKey("fromProfile")) {
            l1Var.n("fromProfile", null);
            return l1Var;
        }
        Boolean bool = (Boolean) this.f131862a.get("fromProfile");
        if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
            l1Var.n("fromProfile", (Parcelable) Parcelable.class.cast(bool));
            return l1Var;
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            l1Var.n("fromProfile", (Serializable) Serializable.class.cast(bool));
            return l1Var;
        }
        throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f131862a.containsKey("fromProfile") != c0Var.f131862a.containsKey("fromProfile")) {
            return false;
        }
        return c() == null ? c0Var.c() == null : c().equals(c0Var.c());
    }

    public int hashCode() {
        return 31 + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        return "AuthenticationSignInWithLinkArgs{fromProfile=" + c() + "}";
    }

    private c0() {
        this.f131862a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131863a;

        public a(@NonNull c0 c0Var) {
            HashMap map = new HashMap();
            this.f131863a = map;
            map.putAll(c0Var.f131862a);
        }

        @NonNull
        public c0 a() {
            return new c0(this.f131863a);
        }

        @p0
        public Boolean b() {
            return (Boolean) this.f131863a.get("fromProfile");
        }

        @NonNull
        public a c(@p0 Boolean bool) {
            this.f131863a.put("fromProfile", bool);
            return this;
        }

        public a() {
            this.f131863a = new HashMap();
        }
    }

    private c0(HashMap map) {
        HashMap map2 = new HashMap();
        this.f131862a = map2;
        map2.putAll(map);
    }
}
