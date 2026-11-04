package com.planner5d.library.activity.fragment.dialog.authentication;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class u implements androidx.navigation.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f132001a;

    @NonNull
    public static u b(@NonNull androidx.lifecycle.l1 l1Var) {
        u uVar = new u();
        if (!l1Var.c("type")) {
            throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
        }
        SocialAuthType socialAuthType = (SocialAuthType) l1Var.e("type");
        if (socialAuthType == null) {
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
        uVar.f132001a.put("type", socialAuthType);
        if (!l1Var.c("fromProfile")) {
            throw new IllegalArgumentException("Required argument \"fromProfile\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) l1Var.e("fromProfile");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
        }
        uVar.f132001a.put("fromProfile", bool);
        if (!l1Var.c("signUp")) {
            throw new IllegalArgumentException("Required argument \"signUp\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) l1Var.e("signUp");
        if (bool2 == null) {
            throw new IllegalArgumentException("Argument \"signUp\" is marked as non-null but was passed a null value.");
        }
        uVar.f132001a.put("signUp", bool2);
        return uVar;
    }

    @NonNull
    public static u fromBundle(@NonNull Bundle bundle) {
        u uVar = new u();
        bundle.setClassLoader(u.class.getClassLoader());
        if (!bundle.containsKey("type")) {
            throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(SocialAuthType.class) && !Serializable.class.isAssignableFrom(SocialAuthType.class)) {
            throw new UnsupportedOperationException(SocialAuthType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        SocialAuthType socialAuthType = (SocialAuthType) bundle.get("type");
        if (socialAuthType == null) {
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
        uVar.f132001a.put("type", socialAuthType);
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
        uVar.f132001a.put("fromProfile", bool);
        if (!bundle.containsKey("signUp")) {
            throw new IllegalArgumentException("Required argument \"signUp\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Boolean.class) && !Serializable.class.isAssignableFrom(Boolean.class)) {
            throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Boolean bool2 = (Boolean) bundle.get("signUp");
        if (bool2 == null) {
            throw new IllegalArgumentException("Argument \"signUp\" is marked as non-null but was passed a null value.");
        }
        uVar.f132001a.put("signUp", bool2);
        return uVar;
    }

    @NonNull
    public Boolean c() {
        return (Boolean) this.f132001a.get("fromProfile");
    }

    @NonNull
    public Boolean d() {
        return (Boolean) this.f132001a.get("signUp");
    }

    @NonNull
    public SocialAuthType e() {
        return (SocialAuthType) this.f132001a.get("type");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f132001a.containsKey("type") != uVar.f132001a.containsKey("type")) {
                return false;
            }
            if (e() == null ? uVar.e() != null : !e().equals(uVar.e())) {
                return false;
            }
            if (this.f132001a.containsKey("fromProfile") != uVar.f132001a.containsKey("fromProfile")) {
                return false;
            }
            if (c() == null ? uVar.c() != null : !c().equals(uVar.c())) {
                return false;
            }
            if (this.f132001a.containsKey("signUp") != uVar.f132001a.containsKey("signUp")) {
                return false;
            }
            return d() == null ? uVar.d() == null : d().equals(uVar.d());
        }
        return false;
    }

    @NonNull
    public Bundle f() {
        Bundle bundle = new Bundle();
        if (this.f132001a.containsKey("type")) {
            SocialAuthType socialAuthType = (SocialAuthType) this.f132001a.get("type");
            if (Parcelable.class.isAssignableFrom(SocialAuthType.class) || socialAuthType == null) {
                bundle.putParcelable("type", (Parcelable) Parcelable.class.cast(socialAuthType));
            } else {
                if (!Serializable.class.isAssignableFrom(SocialAuthType.class)) {
                    throw new UnsupportedOperationException(SocialAuthType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("type", (Serializable) Serializable.class.cast(socialAuthType));
            }
        }
        if (this.f132001a.containsKey("fromProfile")) {
            Boolean bool = (Boolean) this.f132001a.get("fromProfile");
            if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
            } else {
                if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
            }
        }
        if (this.f132001a.containsKey("signUp")) {
            Boolean bool2 = (Boolean) this.f132001a.get("signUp");
            if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool2 != null) {
                if (Serializable.class.isAssignableFrom(Boolean.class)) {
                    bundle.putSerializable("signUp", (Serializable) Serializable.class.cast(bool2));
                    return bundle;
                }
                throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("signUp", (Parcelable) Parcelable.class.cast(bool2));
        }
        return bundle;
    }

    @NonNull
    public androidx.lifecycle.l1 g() {
        androidx.lifecycle.l1 l1Var = new androidx.lifecycle.l1();
        if (this.f132001a.containsKey("type")) {
            SocialAuthType socialAuthType = (SocialAuthType) this.f132001a.get("type");
            if (Parcelable.class.isAssignableFrom(SocialAuthType.class) || socialAuthType == null) {
                l1Var.n("type", (Parcelable) Parcelable.class.cast(socialAuthType));
            } else {
                if (!Serializable.class.isAssignableFrom(SocialAuthType.class)) {
                    throw new UnsupportedOperationException(SocialAuthType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                l1Var.n("type", (Serializable) Serializable.class.cast(socialAuthType));
            }
        }
        if (this.f132001a.containsKey("fromProfile")) {
            Boolean bool = (Boolean) this.f132001a.get("fromProfile");
            if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                l1Var.n("fromProfile", (Parcelable) Parcelable.class.cast(bool));
            } else {
                if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                l1Var.n("fromProfile", (Serializable) Serializable.class.cast(bool));
            }
        }
        if (this.f132001a.containsKey("signUp")) {
            Boolean bool2 = (Boolean) this.f132001a.get("signUp");
            if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool2 != null) {
                if (Serializable.class.isAssignableFrom(Boolean.class)) {
                    l1Var.n("signUp", (Serializable) Serializable.class.cast(bool2));
                    return l1Var;
                }
                throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            l1Var.n("signUp", (Parcelable) Parcelable.class.cast(bool2));
        }
        return l1Var;
    }

    public int hashCode() {
        return (((((e() != null ? e().hashCode() : 0) + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (d() != null ? d().hashCode() : 0);
    }

    public String toString() {
        return "AuthenticationExternalServiceArgs{type=" + e() + ", fromProfile=" + c() + ", signUp=" + d() + "}";
    }

    private u() {
        this.f132001a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f132002a;

        public a(@NonNull u uVar) {
            HashMap map = new HashMap();
            this.f132002a = map;
            map.putAll(uVar.f132001a);
        }

        @NonNull
        public u a() {
            return new u(this.f132002a);
        }

        @NonNull
        public Boolean b() {
            return (Boolean) this.f132002a.get("fromProfile");
        }

        @NonNull
        public Boolean c() {
            return (Boolean) this.f132002a.get("signUp");
        }

        @NonNull
        public SocialAuthType d() {
            return (SocialAuthType) this.f132002a.get("type");
        }

        @NonNull
        public a e(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f132002a.put("fromProfile", bool);
            return this;
        }

        @NonNull
        public a f(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"signUp\" is marked as non-null but was passed a null value.");
            }
            this.f132002a.put("signUp", bool);
            return this;
        }

        @NonNull
        public a g(@NonNull SocialAuthType socialAuthType) {
            if (socialAuthType == null) {
                throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
            }
            this.f132002a.put("type", socialAuthType);
            return this;
        }

        public a(@NonNull SocialAuthType socialAuthType, @NonNull Boolean bool, @NonNull Boolean bool2) {
            HashMap map = new HashMap();
            this.f132002a = map;
            if (socialAuthType == null) {
                throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
            }
            map.put("type", socialAuthType);
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            map.put("fromProfile", bool);
            if (bool2 == null) {
                throw new IllegalArgumentException("Argument \"signUp\" is marked as non-null but was passed a null value.");
            }
            map.put("signUp", bool2);
        }
    }

    private u(HashMap map) {
        HashMap map2 = new HashMap();
        this.f132001a = map2;
        map2.putAll(map);
    }
}
