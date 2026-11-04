package com.planner5d.library.activity.fragment.profile;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.navigation.c2;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class q {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f134847a;

        @NonNull
        public String a() {
            return (String) this.f134847a.get("user");
        }

        @NonNull
        public a b(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
            }
            this.f134847a.put("user", str);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f134847a.containsKey("user")) {
                bundle.putString("user", (String) this.f134847a.get("user"));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.Wv;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f134847a.containsKey("user") != aVar.f134847a.containsKey("user")) {
                    return false;
                }
                if (a() == null ? aVar.a() == null : a().equals(aVar.a())) {
                    return e() == aVar.e();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((a() != null ? a().hashCode() : 0) + 31) * 31) + e();
        }

        public String toString() {
            return "ToPrivacyAgreement(actionId=" + e() + "){user=" + a() + "}";
        }

        private a(@NonNull String str) {
            HashMap map = new HashMap();
            this.f134847a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
            }
            map.put("user", str);
        }
    }

    public static class b implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f134848a;

        @p0
        public Boolean a() {
            return (Boolean) this.f134848a.get("fromProfile");
        }

        @NonNull
        public b b(@p0 Boolean bool) {
            this.f134848a.put("fromProfile", bool);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (!this.f134848a.containsKey("fromProfile")) {
                bundle.putSerializable("fromProfile", null);
                return bundle;
            }
            Boolean bool = (Boolean) this.f134848a.get("fromProfile");
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

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.lw;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f134848a.containsKey("fromProfile") != bVar.f134848a.containsKey("fromProfile")) {
                return false;
            }
            if (a() == null ? bVar.a() == null : a().equals(bVar.a())) {
                return e() == bVar.e();
            }
            return false;
        }

        public int hashCode() {
            return (((a() != null ? a().hashCode() : 0) + 31) * 31) + e();
        }

        public String toString() {
            return "ToSignInWithLink(actionId=" + e() + "){fromProfile=" + a() + "}";
        }

        private b() {
            this.f134848a = new HashMap();
        }
    }

    private q() {
    }

    @NonNull
    @androidx.annotation.j
    public static c2 a() {
        return new androidx.navigation.a(com.planner5d.library.f.j.Gv);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 b() {
        return new androidx.navigation.a(com.planner5d.library.f.j.Iv);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 c() {
        return new androidx.navigation.a(com.planner5d.library.f.j.Sv);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 d() {
        return new androidx.navigation.a(com.planner5d.library.f.j.Uv);
    }

    @NonNull
    @androidx.annotation.j
    public static a e(@NonNull String str) {
        return new a(str);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 f() {
        return new androidx.navigation.a(com.planner5d.library.f.j.Yv);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 g() {
        return new androidx.navigation.a(com.planner5d.library.f.j.cw);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 h() {
        return new androidx.navigation.a(com.planner5d.library.f.j.ew);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 i() {
        return new androidx.navigation.a(com.planner5d.library.f.j.fw);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 j() {
        return new androidx.navigation.a(com.planner5d.library.f.j.gw);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 k() {
        return new androidx.navigation.a(com.planner5d.library.f.j.kw);
    }

    @NonNull
    @androidx.annotation.j
    public static b l() {
        return new b();
    }

    @NonNull
    @androidx.annotation.j
    public static c2 m() {
        return new androidx.navigation.a(com.planner5d.library.f.j.ow);
    }
}
