package com.planner5d.library.activity.fragment.dialog.authentication;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class w {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f132015a;

        @NonNull
        public String a() {
            return (String) this.f132015a.get("user");
        }

        @NonNull
        public a b(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
            }
            this.f132015a.put("user", str);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f132015a.containsKey("user")) {
                bundle.putString("user", (String) this.f132015a.get("user"));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.f168256nc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f132015a.containsKey("user") != aVar.f132015a.containsKey("user")) {
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
            return "ExternalServicesToAgreements(actionId=" + e() + "){user=" + a() + "}";
        }

        private a(@NonNull String str) {
            HashMap map = new HashMap();
            this.f132015a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
            }
            map.put("user", str);
        }
    }

    public static class b implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f132016a;

        @NonNull
        public ErrorMessageException a() {
            return (ErrorMessageException) this.f132016a.get("error");
        }

        @NonNull
        public Boolean b() {
            return (Boolean) this.f132016a.get("fromProfile");
        }

        @NonNull
        public b c(@NonNull ErrorMessageException errorMessageException) {
            if (errorMessageException == null) {
                throw new IllegalArgumentException("Argument \"error\" is marked as non-null but was passed a null value.");
            }
            this.f132016a.put("error", errorMessageException);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f132016a.containsKey("error")) {
                ErrorMessageException errorMessageException = (ErrorMessageException) this.f132016a.get("error");
                if (Parcelable.class.isAssignableFrom(ErrorMessageException.class) || errorMessageException == null) {
                    bundle.putParcelable("error", (Parcelable) Parcelable.class.cast(errorMessageException));
                } else {
                    if (!Serializable.class.isAssignableFrom(ErrorMessageException.class)) {
                        throw new UnsupportedOperationException(ErrorMessageException.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("error", (Serializable) Serializable.class.cast(errorMessageException));
                }
            }
            if (this.f132016a.containsKey("fromProfile")) {
                Boolean bool = (Boolean) this.f132016a.get("fromProfile");
                if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool != null) {
                    if (Serializable.class.isAssignableFrom(Boolean.class)) {
                        bundle.putSerializable("fromProfile", (Serializable) Serializable.class.cast(bool));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("fromProfile", (Parcelable) Parcelable.class.cast(bool));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.f168280oc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f132016a.containsKey("error") != bVar.f132016a.containsKey("error")) {
                    return false;
                }
                if (a() == null ? bVar.a() != null : !a().equals(bVar.a())) {
                    return false;
                }
                if (this.f132016a.containsKey("fromProfile") != bVar.f132016a.containsKey("fromProfile")) {
                    return false;
                }
                if (b() == null ? bVar.b() == null : b().equals(bVar.b())) {
                    return e() == bVar.e();
                }
                return false;
            }
            return false;
        }

        @NonNull
        public b f(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f132016a.put("fromProfile", bool);
            return this;
        }

        public int hashCode() {
            return (((((a() != null ? a().hashCode() : 0) + 31) * 31) + (b() != null ? b().hashCode() : 0)) * 31) + e();
        }

        public String toString() {
            return "ExternalServicesToError(actionId=" + e() + "){error=" + a() + ", fromProfile=" + b() + "}";
        }

        private b(@NonNull ErrorMessageException errorMessageException, @NonNull Boolean bool) {
            HashMap map = new HashMap();
            this.f132016a = map;
            if (errorMessageException == null) {
                throw new IllegalArgumentException("Argument \"error\" is marked as non-null but was passed a null value.");
            }
            map.put("error", errorMessageException);
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            map.put("fromProfile", bool);
        }
    }

    private w() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(@NonNull String str) {
        return new a(str);
    }

    @NonNull
    @androidx.annotation.j
    public static b b(@NonNull ErrorMessageException errorMessageException, @NonNull Boolean bool) {
        return new b(errorMessageException, bool);
    }
}
