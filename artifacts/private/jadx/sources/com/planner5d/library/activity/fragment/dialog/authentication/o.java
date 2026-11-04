package com.planner5d.library.activity.fragment.dialog.authentication;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131828a;

        @androidx.annotation.p0
        public Boolean a() {
            return (Boolean) this.f131828a.get("fromProfile");
        }

        @NonNull
        public a b(@androidx.annotation.p0 Boolean bool) {
            this.f131828a.put("fromProfile", bool);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (!this.f131828a.containsKey("fromProfile")) {
                bundle.putSerializable("fromProfile", null);
                return bundle;
            }
            Boolean bool = (Boolean) this.f131828a.get("fromProfile");
            if (Parcelable.class.isAssignableFrom(Boolean.class) || bool == null) {
                bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
                return bundle;
            }
            if (Serializable.class.isAssignableFrom(Boolean.class)) {
                bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
                return bundle;
            }
            throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
            a aVar = (a) obj;
            if (this.f131828a.containsKey("fromProfile") != aVar.f131828a.containsKey("fromProfile")) {
                return false;
            }
            if (a() == null ? aVar.a() == null : a().equals(aVar.a())) {
                return e() == aVar.e();
            }
            return false;
        }

        public int hashCode() {
            return (((a() != null ? a().hashCode() : 0) + 31) * 31) + e();
        }

        public String toString() {
            return "ToSignInWithLink(actionId=" + e() + "){fromProfile=" + a() + "}";
        }

        private a() {
            this.f131828a = new HashMap();
        }
    }

    private o() {
    }

    @NonNull
    @androidx.annotation.j
    public static c2 a() {
        return new androidx.navigation.a(com.planner5d.library.f.j.E3);
    }

    @NonNull
    @androidx.annotation.j
    public static a b() {
        return new a();
    }
}
