package com.planner5d.library.spaces.view.loading;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f230380a;

    @NonNull
    public static d b(@NonNull l1 savedStateHandle) {
        d dVar = new d();
        if (!savedStateHandle.c("address")) {
            throw new IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue");
        }
        String str = (String) savedStateHandle.e("address");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
        }
        dVar.f230380a.put("address", str);
        return dVar;
    }

    @NonNull
    public static d fromBundle(@NonNull Bundle bundle) {
        d dVar = new d();
        bundle.setClassLoader(d.class.getClassLoader());
        if (!bundle.containsKey("address")) {
            throw new IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("address");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
        }
        dVar.f230380a.put("address", string);
        return dVar;
    }

    @NonNull
    public String c() {
        return (String) this.f230380a.get("address");
    }

    @NonNull
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f230380a.containsKey("address")) {
            bundle.putString("address", (String) this.f230380a.get("address"));
        }
        return bundle;
    }

    @NonNull
    public l1 e() {
        l1 l1Var = new l1();
        if (this.f230380a.containsKey("address")) {
            l1Var.n("address", (String) this.f230380a.get("address"));
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
        d dVar = (d) object;
        if (this.f230380a.containsKey("address") != dVar.f230380a.containsKey("address")) {
            return false;
        }
        return c() == null ? dVar.c() == null : c().equals(dVar.c());
    }

    public int hashCode() {
        return 31 + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        return "SpacesFakeLoadingFragmentArgs{address=" + c() + "}";
    }

    private d() {
        this.f230380a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f230381a;

        public a(@NonNull d original) {
            HashMap map = new HashMap();
            this.f230381a = map;
            map.putAll(original.f230380a);
        }

        @NonNull
        public d a() {
            return new d(this.f230381a);
        }

        @NonNull
        public String b() {
            return (String) this.f230381a.get("address");
        }

        @NonNull
        public a c(@NonNull String address) {
            if (address == null) {
                throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
            }
            this.f230381a.put("address", address);
            return this;
        }

        public a(@NonNull String address) {
            HashMap map = new HashMap();
            this.f230381a = map;
            if (address == null) {
                throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
            }
            map.put("address", address);
        }
    }

    private d(HashMap argumentsMap) {
        HashMap map = new HashMap();
        this.f230380a = map;
        map.putAll(argumentsMap);
    }
}
