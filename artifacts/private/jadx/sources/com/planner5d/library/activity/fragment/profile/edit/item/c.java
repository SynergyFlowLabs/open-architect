package com.planner5d.library.activity.fragment.profile.edit.item;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import com.planner5d.library.activity.fragment.profile.edit.ProfileEditItem;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class c implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f134601a;

    @NonNull
    public static c b(@NonNull l1 l1Var) {
        c cVar = new c();
        if (!l1Var.c(com.google.firebase.messaging.e.f.f123534d)) {
            throw new IllegalArgumentException("Required argument \"label\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) l1Var.e(com.google.firebase.messaging.e.f.f123534d);
        num.intValue();
        cVar.f134601a.put(com.google.firebase.messaging.e.f.f123534d, num);
        if (!l1Var.c("itemType")) {
            throw new IllegalArgumentException("Required argument \"itemType\" is missing and does not have an android:defaultValue");
        }
        ProfileEditItem.ProfileEditItemType profileEditItemType = (ProfileEditItem.ProfileEditItemType) l1Var.e("itemType");
        if (profileEditItemType == null) {
            throw new IllegalArgumentException("Argument \"itemType\" is marked as non-null but was passed a null value.");
        }
        cVar.f134601a.put("itemType", profileEditItemType);
        return cVar;
    }

    @NonNull
    public static c fromBundle(@NonNull Bundle bundle) {
        c cVar = new c();
        bundle.setClassLoader(c.class.getClassLoader());
        if (!bundle.containsKey(com.google.firebase.messaging.e.f.f123534d)) {
            throw new IllegalArgumentException("Required argument \"label\" is missing and does not have an android:defaultValue");
        }
        cVar.f134601a.put(com.google.firebase.messaging.e.f.f123534d, Integer.valueOf(bundle.getInt(com.google.firebase.messaging.e.f.f123534d)));
        if (!bundle.containsKey("itemType")) {
            throw new IllegalArgumentException("Required argument \"itemType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ProfileEditItem.ProfileEditItemType.class) && !Serializable.class.isAssignableFrom(ProfileEditItem.ProfileEditItemType.class)) {
            throw new UnsupportedOperationException(ProfileEditItem.ProfileEditItemType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        ProfileEditItem.ProfileEditItemType profileEditItemType = (ProfileEditItem.ProfileEditItemType) bundle.get("itemType");
        if (profileEditItemType == null) {
            throw new IllegalArgumentException("Argument \"itemType\" is marked as non-null but was passed a null value.");
        }
        cVar.f134601a.put("itemType", profileEditItemType);
        return cVar;
    }

    @NonNull
    public ProfileEditItem.ProfileEditItemType c() {
        return (ProfileEditItem.ProfileEditItemType) this.f134601a.get("itemType");
    }

    public int d() {
        return ((Integer) this.f134601a.get(com.google.firebase.messaging.e.f.f123534d)).intValue();
    }

    @NonNull
    public Bundle e() {
        Bundle bundle = new Bundle();
        if (this.f134601a.containsKey(com.google.firebase.messaging.e.f.f123534d)) {
            bundle.putInt(com.google.firebase.messaging.e.f.f123534d, ((Integer) this.f134601a.get(com.google.firebase.messaging.e.f.f123534d)).intValue());
        }
        if (this.f134601a.containsKey("itemType")) {
            ProfileEditItem.ProfileEditItemType profileEditItemType = (ProfileEditItem.ProfileEditItemType) this.f134601a.get("itemType");
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f134601a.containsKey(com.google.firebase.messaging.e.f.f123534d) != cVar.f134601a.containsKey(com.google.firebase.messaging.e.f.f123534d) || d() != cVar.d() || this.f134601a.containsKey("itemType") != cVar.f134601a.containsKey("itemType")) {
            return false;
        }
        if (c() != null) {
            if (!c().equals(cVar.c())) {
            }
        }
        return cVar.c() == null;
    }

    @NonNull
    public l1 f() {
        l1 l1Var = new l1();
        if (this.f134601a.containsKey(com.google.firebase.messaging.e.f.f123534d)) {
            Integer num = (Integer) this.f134601a.get(com.google.firebase.messaging.e.f.f123534d);
            num.intValue();
            l1Var.n(com.google.firebase.messaging.e.f.f123534d, num);
        }
        if (this.f134601a.containsKey("itemType")) {
            ProfileEditItem.ProfileEditItemType profileEditItemType = (ProfileEditItem.ProfileEditItemType) this.f134601a.get("itemType");
            if (!Parcelable.class.isAssignableFrom(ProfileEditItem.ProfileEditItemType.class) && profileEditItemType != null) {
                if (Serializable.class.isAssignableFrom(ProfileEditItem.ProfileEditItemType.class)) {
                    l1Var.n("itemType", (Serializable) Serializable.class.cast(profileEditItemType));
                    return l1Var;
                }
                throw new UnsupportedOperationException(ProfileEditItem.ProfileEditItemType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            l1Var.n("itemType", (Parcelable) Parcelable.class.cast(profileEditItemType));
        }
        return l1Var;
    }

    public int hashCode() {
        return ((d() + 31) * 31) + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        return "ProfileEditItemFragmentArgs{label=" + d() + ", itemType=" + c() + "}";
    }

    private c() {
        this.f134601a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f134602a;

        public a(@NonNull c cVar) {
            HashMap map = new HashMap();
            this.f134602a = map;
            map.putAll(cVar.f134601a);
        }

        @NonNull
        public c a() {
            return new c(this.f134602a);
        }

        @NonNull
        public ProfileEditItem.ProfileEditItemType b() {
            return (ProfileEditItem.ProfileEditItemType) this.f134602a.get("itemType");
        }

        public int c() {
            return ((Integer) this.f134602a.get(com.google.firebase.messaging.e.f.f123534d)).intValue();
        }

        @NonNull
        public a d(@NonNull ProfileEditItem.ProfileEditItemType profileEditItemType) {
            if (profileEditItemType == null) {
                throw new IllegalArgumentException("Argument \"itemType\" is marked as non-null but was passed a null value.");
            }
            this.f134602a.put("itemType", profileEditItemType);
            return this;
        }

        @NonNull
        public a e(int i10) {
            this.f134602a.put(com.google.firebase.messaging.e.f.f123534d, Integer.valueOf(i10));
            return this;
        }

        public a(int i10, @NonNull ProfileEditItem.ProfileEditItemType profileEditItemType) {
            HashMap map = new HashMap();
            this.f134602a = map;
            map.put(com.google.firebase.messaging.e.f.f123534d, Integer.valueOf(i10));
            if (profileEditItemType == null) {
                throw new IllegalArgumentException("Argument \"itemType\" is marked as non-null but was passed a null value.");
            }
            map.put("itemType", profileEditItemType);
        }
    }

    private c(HashMap map) {
        HashMap map2 = new HashMap();
        this.f134601a = map2;
        map2.putAll(map);
    }
}
