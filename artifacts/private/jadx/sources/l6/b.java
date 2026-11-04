package l6;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum b {
    REGISTER("u2f_register_response"),
    SIGN("u2f_sign_response");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f317255a;

    b(String str) {
        this.f317255a = str;
    }

    @NonNull
    public static b b(@NonNull a aVar) throws a.C2323a {
        if (aVar == null) {
            throw new a.C2323a(null);
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return REGISTER;
        }
        if (iOrdinal == 1) {
            return SIGN;
        }
        throw new a.C2323a(aVar.toString());
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f317255a;
    }
}
