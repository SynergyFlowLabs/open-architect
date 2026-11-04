package com.planner5d.library.spaces.view.survey.style;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class j {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f230623a;

        @NonNull
        public SpacesProjectData a() {
            return (SpacesProjectData) this.f230623a.get("spacesProjectData");
        }

        @NonNull
        public a b(@NonNull SpacesProjectData spacesProjectData) {
            if (spacesProjectData == null) {
                throw new IllegalArgumentException("Argument \"spacesProjectData\" is marked as non-null but was passed a null value.");
            }
            this.f230623a.put("spacesProjectData", spacesProjectData);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f230623a.containsKey("spacesProjectData")) {
                SpacesProjectData spacesProjectData = (SpacesProjectData) this.f230623a.get("spacesProjectData");
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

        @Override // androidx.navigation.c2
        public int e() {
            return de.b.i.f272140db;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && getClass() == object.getClass()) {
                a aVar = (a) object;
                if (this.f230623a.containsKey("spacesProjectData") != aVar.f230623a.containsKey("spacesProjectData")) {
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
            return "ToInfo(actionId=" + e() + "){spacesProjectData=" + a() + "}";
        }

        private a(@NonNull SpacesProjectData spacesProjectData) {
            HashMap map = new HashMap();
            this.f230623a = map;
            if (spacesProjectData == null) {
                throw new IllegalArgumentException("Argument \"spacesProjectData\" is marked as non-null but was passed a null value.");
            }
            map.put("spacesProjectData", spacesProjectData);
        }
    }

    private j() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(@NonNull SpacesProjectData spacesProjectData) {
        return new a(spacesProjectData);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 b() {
        return new androidx.navigation.a(de.b.i.f272168fb);
    }
}
