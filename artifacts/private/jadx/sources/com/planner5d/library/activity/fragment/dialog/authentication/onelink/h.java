package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class h implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f131868a;

    @NonNull
    public static h b(@NonNull l1 l1Var) {
        h hVar = new h();
        if (!l1Var.c("signup")) {
            throw new IllegalArgumentException("Required argument \"signup\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) l1Var.e("signup");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
        }
        hVar.f131868a.put("signup", bool);
        if (!l1Var.c("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) l1Var.e("title");
        num.intValue();
        hVar.f131868a.put("title", num);
        if (!l1Var.c("fromProfile")) {
            throw new IllegalArgumentException("Required argument \"fromProfile\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) l1Var.e("fromProfile");
        if (bool2 == null) {
            throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
        }
        hVar.f131868a.put("fromProfile", bool2);
        return hVar;
    }

    @NonNull
    public static h fromBundle(@NonNull Bundle bundle) {
        h hVar = new h();
        bundle.setClassLoader(h.class.getClassLoader());
        if (!bundle.containsKey("signup")) {
            throw new IllegalArgumentException("Required argument \"signup\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Boolean.class) && !Serializable.class.isAssignableFrom(Boolean.class)) {
            throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Boolean bool = (Boolean) bundle.get("signup");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
        }
        hVar.f131868a.put("signup", bool);
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        hVar.f131868a.put("title", Integer.valueOf(bundle.getInt("title")));
        if (!bundle.containsKey("fromProfile")) {
            throw new IllegalArgumentException("Required argument \"fromProfile\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Boolean.class) && !Serializable.class.isAssignableFrom(Boolean.class)) {
            throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Boolean bool2 = (Boolean) bundle.get("fromProfile");
        if (bool2 == null) {
            throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
        }
        hVar.f131868a.put("fromProfile", bool2);
        return hVar;
    }

    @NonNull
    public Boolean c() {
        return (Boolean) this.f131868a.get("fromProfile");
    }

    @NonNull
    public Boolean d() {
        return (Boolean) this.f131868a.get("signup");
    }

    public int e() {
        return ((Integer) this.f131868a.get("title")).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f131868a.containsKey("signup") != hVar.f131868a.containsKey("signup")) {
            return false;
        }
        if (d() == null ? hVar.d() != null : !d().equals(hVar.d())) {
            return false;
        }
        if (this.f131868a.containsKey("title") == hVar.f131868a.containsKey("title") && e() == hVar.e() && this.f131868a.containsKey("fromProfile") == hVar.f131868a.containsKey("fromProfile")) {
            return c() == null ? hVar.c() == null : c().equals(hVar.c());
        }
        return false;
    }

    @NonNull
    public Bundle f() {
        Bundle bundle = new Bundle();
        if (this.f131868a.containsKey("signup")) {
            Boolean bool = (Boolean) this.f131868a.get("signup");
            if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                bundle.putParcelable("signup", (Parcelable) Parcelable.class.cast(bool));
            } else {
                if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("signup", (Serializable) Serializable.class.cast(bool));
            }
        }
        if (this.f131868a.containsKey("title")) {
            bundle.putInt("title", ((Integer) this.f131868a.get("title")).intValue());
        }
        if (this.f131868a.containsKey("fromProfile")) {
            Boolean bool2 = (Boolean) this.f131868a.get("fromProfile");
            if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool2 != null) {
                if (Serializable.class.isAssignableFrom(Boolean.class)) {
                    bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool2));
                    return bundle;
                }
                throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool2));
        }
        return bundle;
    }

    @NonNull
    public l1 g() {
        l1 l1Var = new l1();
        if (this.f131868a.containsKey("signup")) {
            Boolean bool = (Boolean) this.f131868a.get("signup");
            if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                l1Var.n("signup", (Parcelable) Parcelable.class.cast(bool));
            } else {
                if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                l1Var.n("signup", (Serializable) Serializable.class.cast(bool));
            }
        }
        if (this.f131868a.containsKey("title")) {
            Integer num = (Integer) this.f131868a.get("title");
            num.intValue();
            l1Var.n("title", num);
        }
        if (this.f131868a.containsKey("fromProfile")) {
            Boolean bool2 = (Boolean) this.f131868a.get("fromProfile");
            if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool2 != null) {
                if (Serializable.class.isAssignableFrom(Boolean.class)) {
                    l1Var.n("fromProfile", (Serializable) Serializable.class.cast(bool2));
                    return l1Var;
                }
                throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            l1Var.n("fromProfile", (Parcelable) Parcelable.class.cast(bool2));
        }
        return l1Var;
    }

    public int hashCode() {
        return (((((d() != null ? d().hashCode() : 0) + 31) * 31) + e()) * 31) + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        return "AuthenticationSignInConfirmationArgs{signup=" + d() + ", title=" + e() + ", fromProfile=" + c() + "}";
    }

    private h() {
        this.f131868a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131869a;

        public a(@NonNull h hVar) {
            HashMap map = new HashMap();
            this.f131869a = map;
            map.putAll(hVar.f131868a);
        }

        @NonNull
        public h a() {
            return new h(this.f131869a);
        }

        @NonNull
        public Boolean b() {
            return (Boolean) this.f131869a.get("fromProfile");
        }

        @NonNull
        public Boolean c() {
            return (Boolean) this.f131869a.get("signup");
        }

        public int d() {
            return ((Integer) this.f131869a.get("title")).intValue();
        }

        @NonNull
        public a e(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f131869a.put("fromProfile", bool);
            return this;
        }

        @NonNull
        public a f(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
            }
            this.f131869a.put("signup", bool);
            return this;
        }

        @NonNull
        public a g(int i10) {
            this.f131869a.put("title", Integer.valueOf(i10));
            return this;
        }

        public a(@NonNull Boolean bool, int i10, @NonNull Boolean bool2) {
            HashMap map = new HashMap();
            this.f131869a = map;
            if (bool != null) {
                map.put("signup", bool);
                map.put("title", Integer.valueOf(i10));
                if (bool2 == null) {
                    throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
                }
                map.put("fromProfile", bool2);
                return;
            }
            throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
        }
    }

    private h(HashMap map) {
        HashMap map2 = new HashMap();
        this.f131868a = map2;
        map2.putAll(map);
    }
}
