package k6;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final String f307584a = "RESPONSE_EXTRA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final String f307585b = "FIDO2_RESPONSE_EXTRA";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @Deprecated
    public static final String f307586c = "FIDO2_ERROR_EXTRA";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final String f307587d = "FIDO2_CREDENTIAL_EXTRA";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final com.google.android.gms.common.api.a.g f307588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public static final com.google.android.gms.common.api.a f307589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.gms.internal.fido.b f307590g;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f307588e = gVar;
        f307589f = new com.google.android.gms.common.api.a("Fido.U2F_ZERO_PARTY_API", new com.google.android.gms.internal.fido.c(), gVar);
        f307590g = new com.google.android.gms.internal.fido.b();
    }

    private a() {
    }

    @NonNull
    public static com.google.android.gms.fido.fido2.a a(@NonNull Activity activity) {
        return new com.google.android.gms.fido.fido2.a(activity);
    }

    @NonNull
    public static com.google.android.gms.fido.fido2.a b(@NonNull Context context) {
        return new com.google.android.gms.fido.fido2.a(context);
    }

    @NonNull
    public static com.google.android.gms.fido.fido2.c c(@NonNull Activity activity) {
        return new com.google.android.gms.fido.fido2.c(activity);
    }

    @NonNull
    public static com.google.android.gms.fido.fido2.c d(@NonNull Context context) {
        return new com.google.android.gms.fido.fido2.c(context);
    }

    @NonNull
    public static com.google.android.gms.fido.u2f.a e(@NonNull Activity activity) {
        return new com.google.android.gms.fido.u2f.a(activity);
    }

    @NonNull
    public static com.google.android.gms.fido.u2f.a f(@NonNull Context context) {
        return new com.google.android.gms.fido.u2f.a(context);
    }
}
