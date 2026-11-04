package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class t implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f131910a;

    @NonNull
    public static t b(@NonNull l1 l1Var) {
        t tVar = new t();
        if (!l1Var.c("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) l1Var.e("id");
        num.intValue();
        tVar.f131910a.put("id", num);
        if (!l1Var.c("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String str = (String) l1Var.e("email");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        tVar.f131910a.put("email", str);
        if (!l1Var.c("fromProfile")) {
            throw new IllegalArgumentException("Required argument \"fromProfile\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) l1Var.e("fromProfile");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
        }
        tVar.f131910a.put("fromProfile", bool);
        if (!l1Var.c("signup")) {
            throw new IllegalArgumentException("Required argument \"signup\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) l1Var.e("signup");
        if (bool2 == null) {
            throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
        }
        tVar.f131910a.put("signup", bool2);
        return tVar;
    }

    @NonNull
    public static t fromBundle(@NonNull Bundle bundle) {
        t tVar = new t();
        bundle.setClassLoader(t.class.getClassLoader());
        if (!bundle.containsKey("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        tVar.f131910a.put("id", Integer.valueOf(bundle.getInt("id")));
        if (!bundle.containsKey("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("email");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        tVar.f131910a.put("email", string);
        if (!bundle.containsKey("fromProfile")) {
            throw new IllegalArgumentException("Required argument \"fromProfile\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Boolean.class) && !Serializable.class.isAssignableFrom(Boolean.class)) {
            throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Boolean bool = (Boolean) bundle.get("fromProfile");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
        }
        tVar.f131910a.put("fromProfile", bool);
        if (!bundle.containsKey("signup")) {
            throw new IllegalArgumentException("Required argument \"signup\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Boolean.class) && !Serializable.class.isAssignableFrom(Boolean.class)) {
            throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Boolean bool2 = (Boolean) bundle.get("signup");
        if (bool2 == null) {
            throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
        }
        tVar.f131910a.put("signup", bool2);
        return tVar;
    }

    @NonNull
    public String c() {
        return (String) this.f131910a.get("email");
    }

    @NonNull
    public Boolean d() {
        return (Boolean) this.f131910a.get("fromProfile");
    }

    public int e() {
        return ((Integer) this.f131910a.get("id")).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f131910a.containsKey("id") != tVar.f131910a.containsKey("id") || e() != tVar.e() || this.f131910a.containsKey("email") != tVar.f131910a.containsKey("email")) {
                return false;
            }
            if (c() == null ? tVar.c() != null : !c().equals(tVar.c())) {
                return false;
            }
            if (this.f131910a.containsKey("fromProfile") != tVar.f131910a.containsKey("fromProfile")) {
                return false;
            }
            if (d() == null ? tVar.d() != null : !d().equals(tVar.d())) {
                return false;
            }
            if (this.f131910a.containsKey("signup") != tVar.f131910a.containsKey("signup")) {
                return false;
            }
            return f() == null ? tVar.f() == null : f().equals(tVar.f());
        }
        return false;
    }

    @NonNull
    public Boolean f() {
        return (Boolean) this.f131910a.get("signup");
    }

    @NonNull
    public Bundle g() {
        Bundle bundle = new Bundle();
        if (this.f131910a.containsKey("id")) {
            bundle.putInt("id", ((Integer) this.f131910a.get("id")).intValue());
        }
        if (this.f131910a.containsKey("email")) {
            bundle.putString("email", (String) this.f131910a.get("email"));
        }
        if (this.f131910a.containsKey("fromProfile")) {
            Boolean bool = (Boolean) this.f131910a.get("fromProfile");
            if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
            } else {
                if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
            }
        }
        if (this.f131910a.containsKey("signup")) {
            Boolean bool2 = (Boolean) this.f131910a.get("signup");
            if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool2 != null) {
                if (Serializable.class.isAssignableFrom(Boolean.class)) {
                    bundle.putSerializable("signup", (Serializable) Serializable.class.cast(bool2));
                    return bundle;
                }
                throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("signup", (Parcelable) Parcelable.class.cast(bool2));
        }
        return bundle;
    }

    @NonNull
    public l1 h() {
        l1 l1Var = new l1();
        if (this.f131910a.containsKey("id")) {
            Integer num = (Integer) this.f131910a.get("id");
            num.intValue();
            l1Var.n("id", num);
        }
        if (this.f131910a.containsKey("email")) {
            l1Var.n("email", (String) this.f131910a.get("email"));
        }
        if (this.f131910a.containsKey("fromProfile")) {
            Boolean bool = (Boolean) this.f131910a.get("fromProfile");
            if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                l1Var.n("fromProfile", (Parcelable) Parcelable.class.cast(bool));
            } else {
                if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                l1Var.n("fromProfile", (Serializable) Serializable.class.cast(bool));
            }
        }
        if (this.f131910a.containsKey("signup")) {
            Boolean bool2 = (Boolean) this.f131910a.get("signup");
            if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool2 != null) {
                if (Serializable.class.isAssignableFrom(Boolean.class)) {
                    l1Var.n("signup", (Serializable) Serializable.class.cast(bool2));
                    return l1Var;
                }
                throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            l1Var.n("signup", (Parcelable) Parcelable.class.cast(bool2));
        }
        return l1Var;
    }

    public int hashCode() {
        return ((((((e() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + (f() != null ? f().hashCode() : 0);
    }

    public String toString() {
        return "AuthenticationSignInEnterCodeArgs{id=" + e() + ", email=" + c() + ", fromProfile=" + d() + ", signup=" + f() + "}";
    }

    private t() {
        this.f131910a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131911a;

        public a(@NonNull t tVar) {
            HashMap map = new HashMap();
            this.f131911a = map;
            map.putAll(tVar.f131910a);
        }

        @NonNull
        public t a() {
            return new t(this.f131911a);
        }

        @NonNull
        public String b() {
            return (String) this.f131911a.get("email");
        }

        @NonNull
        public Boolean c() {
            return (Boolean) this.f131911a.get("fromProfile");
        }

        public int d() {
            return ((Integer) this.f131911a.get("id")).intValue();
        }

        @NonNull
        public Boolean e() {
            return (Boolean) this.f131911a.get("signup");
        }

        @NonNull
        public a f(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
            }
            this.f131911a.put("email", str);
            return this;
        }

        @NonNull
        public a g(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f131911a.put("fromProfile", bool);
            return this;
        }

        @NonNull
        public a h(int i10) {
            this.f131911a.put("id", Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public a i(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
            }
            this.f131911a.put("signup", bool);
            return this;
        }

        public a(int i10, @NonNull String str, @NonNull Boolean bool, @NonNull Boolean bool2) {
            HashMap map = new HashMap();
            this.f131911a = map;
            map.put("id", Integer.valueOf(i10));
            if (str == null) {
                throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
            }
            map.put("email", str);
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            map.put("fromProfile", bool);
            if (bool2 == null) {
                throw new IllegalArgumentException("Argument \"signup\" is marked as non-null but was passed a null value.");
            }
            map.put("signup", bool2);
        }
    }

    private t(HashMap map) {
        HashMap map2 = new HashMap();
        this.f131910a = map2;
        map2.putAll(map);
    }
}
