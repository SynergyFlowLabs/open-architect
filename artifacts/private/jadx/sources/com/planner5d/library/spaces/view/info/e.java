package com.planner5d.library.spaces.view.info;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class e implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f230322a;

    @NonNull
    public static e b(@NonNull l1 savedStateHandle) {
        e eVar = new e();
        if (!savedStateHandle.c("spacesProjectData")) {
            throw new IllegalArgumentException("Required argument \"spacesProjectData\" is missing and does not have an android:defaultValue");
        }
        SpacesProjectData spacesProjectData = (SpacesProjectData) savedStateHandle.e("spacesProjectData");
        if (spacesProjectData == null) {
            throw new IllegalArgumentException("Argument \"spacesProjectData\" is marked as non-null but was passed a null value.");
        }
        eVar.f230322a.put("spacesProjectData", spacesProjectData);
        return eVar;
    }

    @NonNull
    public static e fromBundle(@NonNull Bundle bundle) {
        e eVar = new e();
        bundle.setClassLoader(e.class.getClassLoader());
        if (!bundle.containsKey("spacesProjectData")) {
            throw new IllegalArgumentException("Required argument \"spacesProjectData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(SpacesProjectData.class) && !Serializable.class.isAssignableFrom(SpacesProjectData.class)) {
            throw new UnsupportedOperationException(SpacesProjectData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        SpacesProjectData spacesProjectData = (SpacesProjectData) bundle.get("spacesProjectData");
        if (spacesProjectData == null) {
            throw new IllegalArgumentException("Argument \"spacesProjectData\" is marked as non-null but was passed a null value.");
        }
        eVar.f230322a.put("spacesProjectData", spacesProjectData);
        return eVar;
    }

    @NonNull
    public SpacesProjectData c() {
        return (SpacesProjectData) this.f230322a.get("spacesProjectData");
    }

    @NonNull
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f230322a.containsKey("spacesProjectData")) {
            SpacesProjectData spacesProjectData = (SpacesProjectData) this.f230322a.get("spacesProjectData");
            if (!Parcelable.class.isAssignableFrom(SpacesProjectData.class) && spacesProjectData != null) {
                if (Serializable.class.isAssignableFrom(SpacesProjectData.class)) {
                    bundle.putSerializable("spacesProjectData", (Serializable) Serializable.class.cast(spacesProjectData));
                    return bundle;
                }
                throw new UnsupportedOperationException(SpacesProjectData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("spacesProjectData", (Parcelable) Parcelable.class.cast(spacesProjectData));
        }
        return bundle;
    }

    @NonNull
    public l1 e() {
        l1 l1Var = new l1();
        if (this.f230322a.containsKey("spacesProjectData")) {
            SpacesProjectData spacesProjectData = (SpacesProjectData) this.f230322a.get("spacesProjectData");
            if (!Parcelable.class.isAssignableFrom(SpacesProjectData.class) && spacesProjectData != null) {
                if (Serializable.class.isAssignableFrom(SpacesProjectData.class)) {
                    l1Var.n("spacesProjectData", (Serializable) Serializable.class.cast(spacesProjectData));
                    return l1Var;
                }
                throw new UnsupportedOperationException(SpacesProjectData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            l1Var.n("spacesProjectData", (Parcelable) Parcelable.class.cast(spacesProjectData));
        }
        return l1Var;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        e eVar = (e) object;
        if (this.f230322a.containsKey("spacesProjectData") != eVar.f230322a.containsKey("spacesProjectData")) {
            return false;
        }
        return c() == null ? eVar.c() == null : c().equals(eVar.c());
    }

    public int hashCode() {
        return 31 + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        return "SpacesInfoFragmentArgs{spacesProjectData=" + c() + "}";
    }

    private e() {
        this.f230322a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f230323a;

        public a(@NonNull e original) {
            HashMap map = new HashMap();
            this.f230323a = map;
            map.putAll(original.f230322a);
        }

        @NonNull
        public e a() {
            return new e(this.f230323a);
        }

        @NonNull
        public SpacesProjectData b() {
            return (SpacesProjectData) this.f230323a.get("spacesProjectData");
        }

        @NonNull
        public a c(@NonNull SpacesProjectData spacesProjectData) {
            if (spacesProjectData == null) {
                throw new IllegalArgumentException("Argument \"spacesProjectData\" is marked as non-null but was passed a null value.");
            }
            this.f230323a.put("spacesProjectData", spacesProjectData);
            return this;
        }

        public a(@NonNull SpacesProjectData spacesProjectData) {
            HashMap map = new HashMap();
            this.f230323a = map;
            if (spacesProjectData != null) {
                map.put("spacesProjectData", spacesProjectData);
                return;
            }
            throw new IllegalArgumentException("Argument \"spacesProjectData\" is marked as non-null but was passed a null value.");
        }
    }

    private e(HashMap argumentsMap) {
        HashMap map = new HashMap();
        this.f230322a = map;
        map.putAll(argumentsMap);
    }
}
