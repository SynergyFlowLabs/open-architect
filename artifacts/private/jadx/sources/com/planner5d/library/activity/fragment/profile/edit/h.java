package com.planner5d.library.activity.fragment.profile.edit;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.c2;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    public static class a implements c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f134589a;

        @NonNull
        public ProfileEditItem.ProfileEditItemType a() {
            return (ProfileEditItem.ProfileEditItemType) this.f134589a.get("itemType");
        }

        public int b() {
            return ((Integer) this.f134589a.get(com.google.firebase.messaging.e.f.f123534d)).intValue();
        }

        @NonNull
        public a c(@NonNull ProfileEditItem.ProfileEditItemType profileEditItemType) {
            if (profileEditItemType == null) {
                throw new IllegalArgumentException("Argument \"itemType\" is marked as non-null but was passed a null value.");
            }
            this.f134589a.put("itemType", profileEditItemType);
            return this;
        }

        @Override // androidx.navigation.c2
        @NonNull
        public Bundle d() {
            Bundle bundle = new Bundle();
            if (this.f134589a.containsKey(com.google.firebase.messaging.e.f.f123534d)) {
                bundle.putInt(com.google.firebase.messaging.e.f.f123534d, ((Integer) this.f134589a.get(com.google.firebase.messaging.e.f.f123534d)).intValue());
            }
            if (this.f134589a.containsKey("itemType")) {
                ProfileEditItem.ProfileEditItemType profileEditItemType = (ProfileEditItem.ProfileEditItemType) this.f134589a.get("itemType");
                if (!Parcelable.class.isAssignableFrom(ProfileEditItem.ProfileEditItemType.class) && profileEditItemType != null) {
                    if (Serializable.class.isAssignableFrom(ProfileEditItem.ProfileEditItemType.class)) {
                        bundle.putSerializable("itemType", (Serializable) Serializable.class.cast(profileEditItemType));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(ProfileEditItem.ProfileEditItemType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("itemType", (Parcelable) Parcelable.class.cast(profileEditItemType));
            }
            return bundle;
        }

        @Override // androidx.navigation.c2
        public int e() {
            return com.planner5d.library.f.j.Zv;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        
            if (r7.a() != null) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 2
                r0 = 1
                r5 = 1
                if (r6 != r7) goto L6
                return r0
            L6:
                r1 = 0
                if (r7 == 0) goto L79
                java.lang.Class r2 = r6.getClass()
                java.lang.Class r3 = r7.getClass()
                if (r2 == r3) goto L15
                r5 = 6
                goto L79
            L15:
                com.planner5d.library.activity.fragment.profile.edit.h$a r7 = (com.planner5d.library.activity.fragment.profile.edit.h.a) r7
                r5 = 6
                java.util.HashMap r2 = r6.f134589a
                r5 = 4
                java.lang.String r3 = "laeml"
                java.lang.String r3 = "label"
                boolean r2 = r2.containsKey(r3)
                java.util.HashMap r4 = r7.f134589a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L2c
                return r1
            L2c:
                int r2 = r6.b()
                r5 = 1
                int r3 = r7.b()
                if (r2 == r3) goto L38
                return r1
            L38:
                java.util.HashMap r2 = r6.f134589a
                java.lang.String r3 = "itemType"
                boolean r2 = r2.containsKey(r3)
                r5 = 2
                java.util.HashMap r4 = r7.f134589a
                boolean r3 = r4.containsKey(r3)
                if (r2 == r3) goto L4a
                return r1
            L4a:
                com.planner5d.library.activity.fragment.profile.edit.ProfileEditItem$ProfileEditItemType r2 = r6.a()
                if (r2 == 0) goto L62
                com.planner5d.library.activity.fragment.profile.edit.ProfileEditItem$ProfileEditItemType r2 = r6.a()
                r5 = 1
                com.planner5d.library.activity.fragment.profile.edit.ProfileEditItem$ProfileEditItemType r3 = r7.a()
                r5 = 6
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L6b
                r5 = 2
                goto L6a
            L62:
                r5 = 4
                com.planner5d.library.activity.fragment.profile.edit.ProfileEditItem$ProfileEditItemType r2 = r7.a()
                r5 = 4
                if (r2 == 0) goto L6b
            L6a:
                return r1
            L6b:
                r5 = 4
                int r6 = r6.e()
                r5 = 4
                int r7 = r7.e()
                if (r6 == r7) goto L78
                return r1
            L78:
                return r0
            L79:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.profile.edit.h.a.equals(java.lang.Object):boolean");
        }

        @NonNull
        public a f(int i10) {
            this.f134589a.put(com.google.firebase.messaging.e.f.f123534d, Integer.valueOf(i10));
            return this;
        }

        public int hashCode() {
            return ((((b() + 31) * 31) + (a() != null ? a().hashCode() : 0)) * 31) + e();
        }

        public String toString() {
            return "ToProfileEditItem(actionId=" + e() + "){label=" + b() + ", itemType=" + a() + "}";
        }

        private a(int i10, @NonNull ProfileEditItem.ProfileEditItemType profileEditItemType) {
            HashMap map = new HashMap();
            this.f134589a = map;
            map.put(com.google.firebase.messaging.e.f.f123534d, Integer.valueOf(i10));
            if (profileEditItemType == null) {
                throw new IllegalArgumentException("Argument \"itemType\" is marked as non-null but was passed a null value.");
            }
            map.put("itemType", profileEditItemType);
        }
    }

    private h() {
    }

    @NonNull
    @androidx.annotation.j
    public static a a(int i10, @NonNull ProfileEditItem.ProfileEditItemType profileEditItemType) {
        return new a(i10, profileEditItemType);
    }

    @NonNull
    @androidx.annotation.j
    public static c2 b() {
        return new androidx.navigation.a(com.planner5d.library.f.j.aw);
    }
}
