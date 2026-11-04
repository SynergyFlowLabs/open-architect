package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class j0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f47046g = "name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f47047h = "icon";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f47048i = "uri";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f47049j = "key";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f47050k = "isBot";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f47051l = "isImportant";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    CharSequence f47052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    IconCompat f47053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    String f47054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    String f47055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f47056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f47057f;

    @w0(22)
    static class a {
        private a() {
        }

        static j0 a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString(j0.f47049j)).b(persistableBundle.getBoolean(j0.f47050k)).d(persistableBundle.getBoolean(j0.f47051l)).a();
        }

        static PersistableBundle b(j0 j0Var) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = j0Var.f47052a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", j0Var.f47054c);
            persistableBundle.putString(j0.f47049j, j0Var.f47055d);
            persistableBundle.putBoolean(j0.f47050k, j0Var.f47056e);
            persistableBundle.putBoolean(j0.f47051l, j0Var.f47057f);
            return persistableBundle;
        }
    }

    @w0(28)
    static class b {
        private b() {
        }

        static j0 a(Person person) {
            return new c().f(person.getName()).c(person.getIcon() != null ? IconCompat.n(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(j0 j0Var) {
            return new Person.Builder().setName(j0Var.f()).setIcon(j0Var.d() != null ? j0Var.d().M() : null).setUri(j0Var.g()).setKey(j0Var.e()).setBot(j0Var.h()).setImportant(j0Var.i()).build();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        CharSequence f47058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        IconCompat f47059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        String f47060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        String f47061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f47062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f47063f;

        public c() {
        }

        @NonNull
        public j0 a() {
            return new j0(this);
        }

        @NonNull
        public c b(boolean z10) {
            this.f47062e = z10;
            return this;
        }

        @NonNull
        public c c(@androidx.annotation.p0 IconCompat iconCompat) {
            this.f47059b = iconCompat;
            return this;
        }

        @NonNull
        public c d(boolean z10) {
            this.f47063f = z10;
            return this;
        }

        @NonNull
        public c e(@androidx.annotation.p0 String str) {
            this.f47061d = str;
            return this;
        }

        @NonNull
        public c f(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47058a = charSequence;
            return this;
        }

        @NonNull
        public c g(@androidx.annotation.p0 String str) {
            this.f47060c = str;
            return this;
        }

        c(j0 j0Var) {
            this.f47058a = j0Var.f47052a;
            this.f47059b = j0Var.f47053b;
            this.f47060c = j0Var.f47054c;
            this.f47061d = j0Var.f47055d;
            this.f47062e = j0Var.f47056e;
            this.f47063f = j0Var.f47057f;
        }
    }

    j0(c cVar) {
        this.f47052a = cVar.f47058a;
        this.f47053b = cVar.f47059b;
        this.f47054c = cVar.f47060c;
        this.f47055d = cVar.f47061d;
        this.f47056e = cVar.f47062e;
        this.f47057f = cVar.f47063f;
    }

    @NonNull
    @w0(28)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static j0 a(@NonNull Person person) {
        return b.a(person);
    }

    @NonNull
    public static j0 b(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f47047h);
        return new c().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.l(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString(f47049j)).b(bundle.getBoolean(f47050k)).d(bundle.getBoolean(f47051l)).a();
    }

    @NonNull
    @w0(22)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static j0 c(@NonNull PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    @androidx.annotation.p0
    public IconCompat d() {
        return this.f47053b;
    }

    @androidx.annotation.p0
    public String e() {
        return this.f47055d;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        String strE = e();
        String strE2 = j0Var.e();
        if (strE == null && strE2 == null) {
            return Objects.equals(Objects.toString(f()), Objects.toString(j0Var.f())) && Objects.equals(g(), j0Var.g()) && Boolean.valueOf(h()).equals(Boolean.valueOf(j0Var.h())) && Boolean.valueOf(i()).equals(Boolean.valueOf(j0Var.i()));
        }
        return Objects.equals(strE, strE2);
    }

    @androidx.annotation.p0
    public CharSequence f() {
        return this.f47052a;
    }

    @androidx.annotation.p0
    public String g() {
        return this.f47054c;
    }

    public boolean h() {
        return this.f47056e;
    }

    public int hashCode() {
        String strE = e();
        return strE != null ? strE.hashCode() : Objects.hash(f(), g(), Boolean.valueOf(h()), Boolean.valueOf(i()));
    }

    public boolean i() {
        return this.f47057f;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public String j() {
        String str = this.f47054c;
        if (str != null) {
            return str;
        }
        if (this.f47052a == null) {
            return "";
        }
        return "name:" + ((Object) this.f47052a);
    }

    @NonNull
    @w0(28)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public Person k() {
        return b.b(this);
    }

    @NonNull
    public c l() {
        return new c(this);
    }

    @NonNull
    public Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f47052a);
        IconCompat iconCompat = this.f47053b;
        bundle.putBundle(f47047h, iconCompat != null ? iconCompat.L() : null);
        bundle.putString("uri", this.f47054c);
        bundle.putString(f47049j, this.f47055d);
        bundle.putBoolean(f47050k, this.f47056e);
        bundle.putBoolean(f47051l, this.f47057f);
        return bundle;
    }

    @NonNull
    @w0(22)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public PersistableBundle n() {
        return a.b(this);
    }
}
