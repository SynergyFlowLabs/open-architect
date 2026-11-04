package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e.a({"UnknownNullness"})
    public View f75776b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f75775a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<g0> f75777c = new ArrayList<>();

    @Deprecated
    public u0() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            if (this.f75776b == u0Var.f75776b && this.f75775a.equals(u0Var.f75775a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f75776b.hashCode() * 31) + this.f75775a.hashCode();
    }

    @NonNull
    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f75776b + "\n") + "    values:";
        for (String str2 : this.f75775a.keySet()) {
            str = str + "    " + str2 + ": " + this.f75775a.get(str2) + "\n";
        }
        return str;
    }

    public u0(@NonNull View view) {
        this.f75776b = view;
    }
}
