package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class u {

    @g6.a
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f106650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f106651b;

        /* synthetic */ a(Object obj, o1 o1Var) {
            w.r(obj);
            this.f106651b = obj;
            this.f106650a = new ArrayList();
        }

        @NonNull
        @g6.a
        public a a(@NonNull String str, @androidx.annotation.p0 Object obj) {
            w.r(str);
            this.f106650a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        @NonNull
        @g6.a
        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f106651b.getClass().getSimpleName());
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            int size = this.f106650a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f106650a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            return sb2.toString();
        }
    }

    private u() {
        throw new AssertionError("Uninstantiable");
    }

    @g6.a
    public static boolean a(@NonNull Bundle bundle, @NonNull Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    @g6.a
    public static boolean b(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @g6.a
    public static int c(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    @g6.a
    public static a d(@NonNull Object obj) {
        return new a(obj, null);
    }
}
