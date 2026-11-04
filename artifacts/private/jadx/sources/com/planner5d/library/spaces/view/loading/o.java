package com.planner5d.library.spaces.view.loading;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class o {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f230394a;

        @NonNull
        public SpacesProjectData a() {
            return (SpacesProjectData) this.f230394a.get("spacesProjectData");
        }

        @NonNull
        public a b(@NonNull SpacesProjectData spacesProjectData) {
            if (spacesProjectData == null) {
                throw new IllegalArgumentException("Argument \"spacesProjectData\" is marked as non-null but was passed a null value.");
            }
            this.f230394a.put("spacesProjectData", spacesProjectData);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f230394a.containsKey("spacesProjectData")) {
                SpacesProjectData spacesProjectData = (SpacesProjectData) this.f230394a.get("spacesProjectData");
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

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            if (r7.a() != null) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 1
                r5 = 2
                if (r6 != r7) goto L5
                return r0
            L5:
                r1 = 0
                if (r7 == 0) goto L59
                r5 = 5
                java.lang.Class r2 = r6.getClass()
                r5 = 0
                java.lang.Class r3 = r7.getClass()
                r5 = 3
                if (r2 == r3) goto L16
                goto L59
            L16:
                r5 = 6
                com.planner5d.library.spaces.view.loading.o$a r7 = (com.planner5d.library.spaces.view.loading.o.a) r7
                java.util.HashMap r2 = r6.f230394a
                java.lang.String r3 = "spacesProjectData"
                r5 = 1
                boolean r2 = r2.containsKey(r3)
                java.util.HashMap r4 = r7.f230394a
                boolean r3 = r4.containsKey(r3)
                r5 = 3
                if (r2 == r3) goto L2c
                return r1
            L2c:
                r5 = 4
                com.planner5d.library.spaces.entity.SpacesProjectData r2 = r6.a()
                if (r2 == 0) goto L43
                com.planner5d.library.spaces.entity.SpacesProjectData r2 = r6.a()
                com.planner5d.library.spaces.entity.SpacesProjectData r3 = r7.a()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4c
                r5 = 7
                goto L4a
            L43:
                com.planner5d.library.spaces.entity.SpacesProjectData r2 = r7.a()
                r5 = 5
                if (r2 == 0) goto L4c
            L4a:
                r5 = 1
                return r1
            L4c:
                int r6 = r6.e()
                r5 = 2
                int r7 = r7.e()
                if (r6 == r7) goto L58
                return r1
            L58:
                return r0
            L59:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.view.loading.o.a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((a() != null ? a().hashCode() : 0) + 31) * 31) + e();
        }

        public String toString() {
            return "ToInfo(actionId=" + e() + "){spacesProjectData=" + a() + "}";
        }

        private a(@NonNull SpacesProjectData spacesProjectData) {
            HashMap map = new HashMap();
            this.f230394a = map;
            if (spacesProjectData == null) {
                throw new IllegalArgumentException("Argument \"spacesProjectData\" is marked as non-null but was passed a null value.");
            }
            map.put("spacesProjectData", spacesProjectData);
        }
    }

    private o() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(@NonNull SpacesProjectData spacesProjectData) {
        return new a(spacesProjectData);
    }
}
