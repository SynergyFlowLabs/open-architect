package com.planner5d.library.services.utility;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f225292a = new k();

    private k() {
    }

    private final boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return ((obj instanceof Bundle) && (obj2 instanceof Bundle)) ? b((Bundle) obj, (Bundle) obj2) : Intrinsics.areEqual(obj, obj2);
    }

    @oj.n
    public static final boolean b(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null || bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str) || !f225292a.a(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }
}
