package androidx.core.content;

import android.content.LocusId;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocusId f47485b;

    @w0(29)
    private static class a {
        private a() {
        }

        @NonNull
        static LocusId a(@NonNull String str) {
            return new LocusId(str);
        }

        @NonNull
        static String b(@NonNull LocusId locusId) {
            return locusId.getId();
        }
    }

    public c0(@NonNull String str) {
        this.f47484a = (String) androidx.core.util.t.q(str, "id cannot be empty");
        this.f47485b = a.a(str);
    }

    @NonNull
    private String b() {
        return this.f47484a.length() + "_chars";
    }

    @NonNull
    @w0(29)
    public static c0 d(@NonNull LocusId locusId) {
        androidx.core.util.t.m(locusId, "locusId cannot be null");
        return new c0((String) androidx.core.util.t.q(a.b(locusId), "id cannot be empty"));
    }

    @NonNull
    public String a() {
        return this.f47484a;
    }

    @NonNull
    @w0(29)
    public LocusId c() {
        return this.f47485b;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        String str = this.f47484a;
        if (str == null) {
            return c0Var.f47484a == null;
        }
        return str.equals(c0Var.f47484a);
    }

    public int hashCode() {
        String str = this.f47484a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
