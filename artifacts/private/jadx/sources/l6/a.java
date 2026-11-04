package l6;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum a {
    REGISTER("u2f_register_request"),
    SIGN("u2f_sign_request");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f317251a;

    /* JADX INFO: renamed from: l6.a$a, reason: collision with other inner class name */
    public static class C2323a extends Exception {
        public C2323a(@NonNull String str) {
            super("Unsupported request type ".concat(String.valueOf(str)));
        }
    }

    a(String str) {
        this.f317251a = str;
    }

    @NonNull
    public static a b(@NonNull String str) throws C2323a {
        int i10 = 1 >> 0;
        for (a aVar : values()) {
            if (str.equals(aVar.f317251a)) {
                return aVar;
            }
        }
        throw new C2323a(str);
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f317251a;
    }
}
