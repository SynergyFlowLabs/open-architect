package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f73137o = "_has_set_default_values";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f73138p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f73139q = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f73140a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private SharedPreferences f73142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private i f73143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private SharedPreferences.Editor f73144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f73145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f73146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f73147h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PreferenceScreen f73149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f73150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f73151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f73152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f73153n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f73141b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f73148i = 0;

    public interface a {
        void h(@NonNull Preference preference);
    }

    public interface b {
        void k(@NonNull PreferenceScreen preferenceScreen);
    }

    public interface c {
        boolean i(@NonNull Preference preference);
    }

    public static abstract class d {
        public abstract boolean a(@NonNull Preference preference, @NonNull Preference preference2);

        public abstract boolean b(@NonNull Preference preference, @NonNull Preference preference2);
    }

    public static class e extends d {
        @Override // androidx.preference.s.d
        public boolean a(@NonNull Preference preference, @NonNull Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.C1()) || !TextUtils.equals(preference.d0(), preference2.d0()) || !TextUtils.equals(preference.a0(), preference2.a0())) {
                return false;
            }
            Drawable drawableX = preference.x();
            Drawable drawableX2 = preference2.x();
            if ((drawableX == drawableX2 || (drawableX != null && drawableX.equals(drawableX2))) && preference.h0() == preference2.h0() && preference.k0() == preference2.k0()) {
                if (!(preference instanceof TwoStatePreference) || ((TwoStatePreference) preference).G1() == ((TwoStatePreference) preference2).G1()) {
                    return !(preference instanceof DropDownPreference) || preference == preference2;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.preference.s.d
        public boolean b(@NonNull Preference preference, @NonNull Preference preference2) {
            return preference.z() == preference2.z();
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public s(@NonNull Context context) {
        this.f73140a = context;
        E(f(context));
    }

    public static SharedPreferences d(@NonNull Context context) {
        return context.getSharedPreferences(f(context), e());
    }

    private static int e() {
        return 0;
    }

    private static String f(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static void u(@NonNull Context context, int i10, boolean z10) {
        v(context, f(context), e(), i10, z10);
    }

    public static void v(@NonNull Context context, String str, int i10, int i11, boolean z10) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f73137o, 0);
        if (!z10 && sharedPreferences.getBoolean(f73137o, false)) {
            return;
        }
        s sVar = new s(context);
        sVar.E(str);
        sVar.D(i10);
        sVar.r(context, i11, null);
        sharedPreferences.edit().putBoolean(f73137o, true).apply();
    }

    private void w(boolean z10) {
        SharedPreferences.Editor editor;
        if (!z10 && (editor = this.f73144e) != null) {
            editor.apply();
        }
        this.f73145f = z10;
    }

    public void A(@p0 d dVar) {
        this.f73150k = dVar;
    }

    public void B(@p0 i iVar) {
        this.f73143d = iVar;
    }

    public boolean C(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f73149j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.x0();
        }
        this.f73149j = preferenceScreen;
        return true;
    }

    public void D(int i10) {
        this.f73147h = i10;
        this.f73142c = null;
    }

    public void E(String str) {
        this.f73146g = str;
        this.f73142c = null;
    }

    public void F() {
        this.f73148i = 0;
        this.f73142c = null;
    }

    public void G() {
        this.f73148i = 1;
        this.f73142c = null;
    }

    boolean H() {
        return !this.f73145f;
    }

    public void I(@NonNull Preference preference) {
        a aVar = this.f73152m;
        if (aVar != null) {
            aVar.h(preference);
        }
    }

    @NonNull
    public PreferenceScreen a(@NonNull Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.s0(this);
        return preferenceScreen;
    }

    @p0
    public <T extends Preference> T b(@NonNull CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f73149j;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.F1(charSequence);
    }

    @NonNull
    public Context c() {
        return this.f73140a;
    }

    @p0
    SharedPreferences.Editor g() {
        if (this.f73143d != null) {
            return null;
        }
        if (!this.f73145f) {
            return o().edit();
        }
        if (this.f73144e == null) {
            this.f73144e = o().edit();
        }
        return this.f73144e;
    }

    long h() {
        long j10;
        synchronized (this) {
            try {
                j10 = this.f73141b;
                this.f73141b = 1 + j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    @p0
    public a i() {
        return this.f73152m;
    }

    @p0
    public b j() {
        return this.f73153n;
    }

    @p0
    public c k() {
        return this.f73151l;
    }

    @p0
    public d l() {
        return this.f73150k;
    }

    @p0
    public i m() {
        return this.f73143d;
    }

    public PreferenceScreen n() {
        return this.f73149j;
    }

    @p0
    public SharedPreferences o() {
        if (m() != null) {
            return null;
        }
        if (this.f73142c == null) {
            this.f73142c = (this.f73148i != 1 ? this.f73140a : androidx.core.content.d.c(this.f73140a)).getSharedPreferences(this.f73146g, this.f73147h);
        }
        return this.f73142c;
    }

    public int p() {
        return this.f73147h;
    }

    public String q() {
        return this.f73146g;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen r(@NonNull Context context, int i10, @p0 PreferenceScreen preferenceScreen) {
        w(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new r(context, this).e(i10, preferenceScreen);
        preferenceScreen2.s0(this);
        w(false);
        return preferenceScreen2;
    }

    public boolean s() {
        return this.f73148i == 0;
    }

    public boolean t() {
        return this.f73148i == 1;
    }

    public void x(@p0 a aVar) {
        this.f73152m = aVar;
    }

    public void y(@p0 b bVar) {
        this.f73153n = bVar;
    }

    public void z(@p0 c cVar) {
        this.f73151l = cVar;
    }
}
