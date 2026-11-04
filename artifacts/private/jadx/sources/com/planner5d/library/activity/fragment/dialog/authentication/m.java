package com.planner5d.library.activity.fragment.dialog.authentication;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class m implements androidx.navigation.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f131817a;

    @NonNull
    public static m b(@NonNull androidx.lifecycle.l1 l1Var) {
        m mVar = new m();
        if (!l1Var.c("error")) {
            throw new IllegalArgumentException("Required argument \"error\" is missing and does not have an android:defaultValue");
        }
        ErrorMessageException errorMessageException = (ErrorMessageException) l1Var.e("error");
        if (errorMessageException == null) {
            throw new IllegalArgumentException("Argument \"error\" is marked as non-null but was passed a null value.");
        }
        mVar.f131817a.put("error", errorMessageException);
        if (!l1Var.c("fromProfile")) {
            throw new IllegalArgumentException("Required argument \"fromProfile\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) l1Var.e("fromProfile");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
        }
        mVar.f131817a.put("fromProfile", bool);
        return mVar;
    }

    @NonNull
    public static m fromBundle(@NonNull Bundle bundle) {
        m mVar = new m();
        bundle.setClassLoader(m.class.getClassLoader());
        if (!bundle.containsKey("error")) {
            throw new IllegalArgumentException("Required argument \"error\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ErrorMessageException.class) && !Serializable.class.isAssignableFrom(ErrorMessageException.class)) {
            throw new UnsupportedOperationException(ErrorMessageException.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        ErrorMessageException errorMessageException = (ErrorMessageException) bundle.get("error");
        if (errorMessageException == null) {
            throw new IllegalArgumentException("Argument \"error\" is marked as non-null but was passed a null value.");
        }
        mVar.f131817a.put("error", errorMessageException);
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
        mVar.f131817a.put("fromProfile", bool);
        return mVar;
    }

    @NonNull
    public ErrorMessageException c() {
        return (ErrorMessageException) this.f131817a.get("error");
    }

    @NonNull
    public Boolean d() {
        return (Boolean) this.f131817a.get("fromProfile");
    }

    @NonNull
    public Bundle e() {
        Bundle bundle = new Bundle();
        if (this.f131817a.containsKey("error")) {
            ErrorMessageException errorMessageException = (ErrorMessageException) this.f131817a.get("error");
            if (Parcelable.class.isAssignableFrom(ErrorMessageException.class) || errorMessageException == null) {
                bundle.putParcelable("error", (Parcelable) Parcelable.class.cast(errorMessageException));
            } else {
                if (!Serializable.class.isAssignableFrom(ErrorMessageException.class)) {
                    throw new UnsupportedOperationException(ErrorMessageException.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("error", (Serializable) Serializable.class.cast(errorMessageException));
            }
        }
        if (this.f131817a.containsKey("fromProfile")) {
            Boolean bool = (Boolean) this.f131817a.get("fromProfile");
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f131817a.containsKey("error") != mVar.f131817a.containsKey("error")) {
            return false;
        }
        if (c() == null ? mVar.c() != null : !c().equals(mVar.c())) {
            return false;
        }
        if (this.f131817a.containsKey("fromProfile") != mVar.f131817a.containsKey("fromProfile")) {
            return false;
        }
        return d() == null ? mVar.d() == null : d().equals(mVar.d());
    }

    @NonNull
    public androidx.lifecycle.l1 f() {
        androidx.lifecycle.l1 l1Var = new androidx.lifecycle.l1();
        if (this.f131817a.containsKey("error")) {
            ErrorMessageException errorMessageException = (ErrorMessageException) this.f131817a.get("error");
            if (Parcelable.class.isAssignableFrom(ErrorMessageException.class) || errorMessageException == null) {
                l1Var.n("error", (Parcelable) Parcelable.class.cast(errorMessageException));
            } else {
                if (!Serializable.class.isAssignableFrom(ErrorMessageException.class)) {
                    throw new UnsupportedOperationException(ErrorMessageException.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                l1Var.n("error", (Serializable) Serializable.class.cast(errorMessageException));
            }
        }
        if (this.f131817a.containsKey("fromProfile")) {
            Boolean bool = (Boolean) this.f131817a.get("fromProfile");
            if (!Parcelable.class.isAssignableFrom(Boolean.class) && bool != null) {
                if (Serializable.class.isAssignableFrom(Boolean.class)) {
                    l1Var.n("fromProfile", (Serializable) Serializable.class.cast(bool));
                    return l1Var;
                }
                throw new UnsupportedOperationException(Boolean.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            l1Var.n("fromProfile", (Parcelable) Parcelable.class.cast(bool));
        }
        return l1Var;
    }

    public int hashCode() {
        return (((c() != null ? c().hashCode() : 0) + 31) * 31) + (d() != null ? d().hashCode() : 0);
    }

    public String toString() {
        return "AuthenticationErrorArgs{error=" + c() + ", fromProfile=" + d() + "}";
    }

    private m() {
        this.f131817a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f131818a;

        public a(@NonNull m mVar) {
            HashMap map = new HashMap();
            this.f131818a = map;
            map.putAll(mVar.f131817a);
        }

        @NonNull
        public m a() {
            return new m(this.f131818a);
        }

        @NonNull
        public ErrorMessageException b() {
            return (ErrorMessageException) this.f131818a.get("error");
        }

        @NonNull
        public Boolean c() {
            return (Boolean) this.f131818a.get("fromProfile");
        }

        @NonNull
        public a d(@NonNull ErrorMessageException errorMessageException) {
            if (errorMessageException == null) {
                throw new IllegalArgumentException("Argument \"error\" is marked as non-null but was passed a null value.");
            }
            this.f131818a.put("error", errorMessageException);
            return this;
        }

        @NonNull
        public a e(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromProfile\" is marked as non-null but was passed a null value.");
            }
            this.f131818a.put("fromProfile", bool);
            return this;
        }

        public a(@NonNull ErrorMessageException errorMessageException, @NonNull Boolean bool) {
            HashMap map = new HashMap();
            this.f131818a = map;
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

    private m(HashMap map) {
        HashMap map2 = new HashMap();
        this.f131817a = map2;
        map2.putAll(map);
    }
}
