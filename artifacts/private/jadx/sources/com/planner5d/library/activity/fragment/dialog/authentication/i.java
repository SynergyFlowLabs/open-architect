package com.planner5d.library.activity.fragment.dialog.authentication;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131792a;

        @NonNull
        public Boolean a() {
            return (Boolean) this.f131792a.get("fromProfile");
        }

        @NonNull
        public Boolean b() {
            return (Boolean) this.f131792a.get("signUp");
        }

        @NonNull
        public SocialAuthType c() {
            return (SocialAuthType) this.f131792a.get("type");
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f131792a.containsKey("type")) {
                SocialAuthType socialAuthType = (SocialAuthType) this.f131792a.get("type");
                if (Parcelable.class.isAssignableFrom(SocialAuthType.class) || socialAuthType == null) {
                    bundle.putParcelable("type", (Parcelable) Parcelable.class.cast(socialAuthType));
                } else {
                    if (!Serializable.class.isAssignableFrom(SocialAuthType.class)) {
                        throw new UnsupportedOperationException(SocialAuthType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("type", (Serializable) Serializable.class.cast(socialAuthType));
                }
            }
            if (this.f131792a.containsKey("fromProfile")) {
                Boolean bool = (Boolean) this.f131792a.get("fromProfile");
                if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                    bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
                } else {
                    if (!Serializable.class.isAssignableFrom(Boolean.class)) {
                        throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
                }
            }
            if (this.f131792a.containsKey("signUp")) {
                Boolean bool2 = (Boolean) this.f131792a.get("signUp");
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

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.ls;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f131792a.containsKey("type") != aVar.f131792a.containsKey("type")) {
                    return false;
                }
                if (c() == null ? aVar.c() != null : !c().equals(aVar.c())) {
                    return false;
                }
                if (this.f131792a.containsKey("fromProfile") != aVar.f131792a.containsKey("fromProfile")) {
                    return false;
                }
                if (a() == null ? aVar.a() != null : !a().equals(aVar.a())) {
                    return false;
                }
                if (this.f131792a.containsKey("signUp") != aVar.f131792a.containsKey("signUp")) {
                    return false;
                }
                if (b() == null ? aVar.b() == null : b().equals(aVar.b())) {
                    return e() == aVar.e();
                }
                return false;
            }
            return false;
        }

        @NonNull
        public a f(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f131792a.put("fromProfile", bool);
            return this;
        }

        @NonNull
        public a g(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"signUp\" is marked as non-null but was passed a null value.");
            }
            this.f131792a.put("signUp", bool);
            return this;
        }

        @NonNull
        public a h(@NonNull SocialAuthType socialAuthType) {
            if (socialAuthType == null) {
                throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
            }
            this.f131792a.put("type", socialAuthType);
            return this;
        }

        public int hashCode() {
            return (((((((c() != null ? c().hashCode() : 0) + 31) * 31) + (a() != null ? a().hashCode() : 0)) * 31) + (b() != null ? b().hashCode() : 0)) * 31) + e();
        }

        public String toString() {
            return "SignUpOptionsToExternalServices(actionId=" + e() + "){type=" + c() + ", fromProfile=" + a() + ", signUp=" + b() + "}";
        }

        private a(@NonNull SocialAuthType socialAuthType, @NonNull Boolean bool, @NonNull Boolean bool2) {
            HashMap map = new HashMap();
            this.f131792a = map;
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

    private i() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(@NonNull SocialAuthType socialAuthType, @NonNull Boolean bool, @NonNull Boolean bool2) {
        return new a(socialAuthType, bool, bool2);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 b() {
        return new androidx.navigation.a(com.planner5d.library.f.j.ms);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 c() {
        return new androidx.navigation.a(com.planner5d.library.f.j.ns);
    }
}
