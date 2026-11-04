package com.planner5d.library.spaces.view.loading;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.l1;
import androidx.navigation.g0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class m implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f230392a;

    @NonNull
    public static m b(@NonNull l1 savedStateHandle) {
        m mVar = new m();
        if (!savedStateHandle.c("address")) {
            throw new IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue");
        }
        String str = (String) savedStateHandle.e("address");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
        }
        mVar.f230392a.put("address", str);
        return mVar;
    }

    @NonNull
    public static m fromBundle(@NonNull Bundle bundle) {
        m mVar = new m();
        bundle.setClassLoader(m.class.getClassLoader());
        if (!bundle.containsKey("address")) {
            throw new IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("address");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
        }
        mVar.f230392a.put("address", string);
        return mVar;
    }

    @NonNull
    public String c() {
        return (String) this.f230392a.get("address");
    }

    @NonNull
    public Bundle d() {
        Bundle bundle = new Bundle();
        if (this.f230392a.containsKey("address")) {
            bundle.putString("address", (String) this.f230392a.get("address"));
        }
        return bundle;
    }

    @NonNull
    public l1 e() {
        l1 l1Var = new l1();
        if (this.f230392a.containsKey("address")) {
            l1Var.n("address", (String) this.f230392a.get("address"));
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
        m mVar = (m) object;
        if (this.f230392a.containsKey("address") != mVar.f230392a.containsKey("address")) {
            return false;
        }
        return c() == null ? mVar.c() == null : c().equals(mVar.c());
    }

    public int hashCode() {
        return 31 + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        return "SpacesLoadingFragmentArgs{address=" + c() + "}";
    }

    private m() {
        this.f230392a = new HashMap();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f230393a;

        public a(@NonNull m original) {
            HashMap map = new HashMap();
            this.f230393a = map;
            map.putAll(original.f230392a);
        }

        @NonNull
        public m a() {
            return new m(this.f230393a);
        }

        @NonNull
        public String b() {
            return (String) this.f230393a.get("address");
        }

        @NonNull
        public a c(@NonNull String address) {
            if (address == null) {
                throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
            }
            this.f230393a.put("address", address);
            return this;
        }

        public a(@NonNull String address) {
            HashMap map = new HashMap();
            this.f230393a = map;
            if (address != null) {
                map.put("address", address);
                return;
            }
            throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
        }
    }

    private m(HashMap argumentsMap) {
        HashMap map = new HashMap();
        this.f230392a = map;
        map.putAll(argumentsMap);
    }
}
