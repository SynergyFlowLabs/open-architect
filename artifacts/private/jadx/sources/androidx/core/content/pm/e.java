package androidx.core.content.pm;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.app.j0;
import androidx.core.content.c0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    private static final String C = "extraPersonCount";
    private static final String D = "extraPerson_";
    private static final String E = "extraLocusId";
    private static final String F = "extraLongLived";
    private static final String G = "extraSliceUri";
    public static final int H = 1;
    int A;
    int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f47564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f47565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f47566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Intent[] f47567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ComponentName f47568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    CharSequence f47569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    CharSequence f47570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    CharSequence f47571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    IconCompat f47572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f47573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    j0[] f47574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Set<String> f47575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    c0 f47576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f47577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f47578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    PersistableBundle f47579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Bundle f47580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f47581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    UserHandle f47582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f47583t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f47584u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f47585v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f47586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f47587x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f47588y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f47589z;

    @w0(33)
    private static class a {
        private a() {
        }

        static void a(@NonNull ShortcutInfo.Builder builder, int i10) {
            builder.setExcludedFromSurfaces(i10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    e() {
    }

    @w0(22)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    private PersistableBundle b() {
        if (this.f47579p == null) {
            this.f47579p = new PersistableBundle();
        }
        j0[] j0VarArr = this.f47574k;
        if (j0VarArr != null && j0VarArr.length > 0) {
            this.f47579p.putInt(C, j0VarArr.length);
            int i10 = 0;
            while (i10 < this.f47574k.length) {
                PersistableBundle persistableBundle = this.f47579p;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(D);
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f47574k[i10].n());
                i10 = i11;
            }
        }
        c0 c0Var = this.f47576m;
        if (c0Var != null) {
            this.f47579p.putString(E, c0Var.a());
        }
        this.f47579p.putBoolean(F, this.f47577n);
        return this.f47579p;
    }

    @w0(25)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    static List<e> c(@NonNull Context context, @NonNull List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, it.next()).c());
        }
        return arrayList;
    }

    @w0(25)
    @p0
    static c0 p(@NonNull ShortcutInfo shortcutInfo) {
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return c0.d(shortcutInfo.getLocusId());
    }

    @w0(25)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    private static c0 q(@p0 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(E)) == null) {
            return null;
        }
        return new c0(string);
    }

    @l1
    @w0(25)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    static boolean s(@p0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(F)) {
            return false;
        }
        return persistableBundle.getBoolean(F);
    }

    @l1
    @w0(25)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    static j0[] u(@NonNull PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(C)) {
            return null;
        }
        int i10 = persistableBundle.getInt(C);
        j0[] j0VarArr = new j0[i10];
        int i11 = 0;
        while (i11 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(D);
            int i12 = i11 + 1;
            sb2.append(i12);
            j0VarArr[i11] = j0.c(persistableBundle.getPersistableBundle(sb2.toString()));
            i11 = i12;
        }
        return j0VarArr;
    }

    public boolean A() {
        return this.f47583t;
    }

    public boolean B() {
        return this.f47586w;
    }

    public boolean C() {
        return this.f47584u;
    }

    public boolean D() {
        return this.f47588y;
    }

    public boolean E(int i10) {
        return (this.B & i10) != 0;
    }

    public boolean F() {
        return this.f47587x;
    }

    public boolean G() {
        return this.f47585v;
    }

    @w0(25)
    public ShortcutInfo H() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f47564a, this.f47565b).setShortLabel(this.f47569f).setIntents(this.f47567d);
        IconCompat iconCompat = this.f47572i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.N(this.f47564a));
        }
        if (!TextUtils.isEmpty(this.f47570g)) {
            intents.setLongLabel(this.f47570g);
        }
        if (!TextUtils.isEmpty(this.f47571h)) {
            intents.setDisabledMessage(this.f47571h);
        }
        ComponentName componentName = this.f47568e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f47575l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f47578o);
        PersistableBundle persistableBundle = this.f47579p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        j0[] j0VarArr = this.f47574k;
        if (j0VarArr != null && j0VarArr.length > 0) {
            int length = j0VarArr.length;
            Person[] personArr = new Person[length];
            for (int i10 = 0; i10 < length; i10++) {
                personArr[i10] = this.f47574k[i10].k();
            }
            intents.setPersons(personArr);
        }
        c0 c0Var = this.f47576m;
        if (c0Var != null) {
            intents.setLocusId(c0Var.c());
        }
        intents.setLongLived(this.f47577n);
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.B);
        }
        return intents.build();
    }

    Intent a(Intent intent) {
        Intent[] intentArr = this.f47567d;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f47569f.toString());
        if (this.f47572i != null) {
            Drawable activityIcon = null;
            if (this.f47573j) {
                PackageManager packageManager = this.f47564a.getPackageManager();
                ComponentName componentName = this.f47568e;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.f47564a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f47572i.j(intent, activityIcon, this.f47564a);
        }
        return intent;
    }

    @p0
    public ComponentName d() {
        return this.f47568e;
    }

    @p0
    public Set<String> e() {
        return this.f47575l;
    }

    @p0
    public CharSequence f() {
        return this.f47571h;
    }

    public int g() {
        return this.A;
    }

    public int h() {
        return this.B;
    }

    @p0
    public PersistableBundle i() {
        return this.f47579p;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public IconCompat j() {
        return this.f47572i;
    }

    @NonNull
    public String k() {
        return this.f47565b;
    }

    @NonNull
    public Intent l() {
        Intent[] intentArr = this.f47567d;
        return intentArr[intentArr.length - 1];
    }

    @NonNull
    public Intent[] m() {
        Intent[] intentArr = this.f47567d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long n() {
        return this.f47581r;
    }

    @p0
    public c0 o() {
        return this.f47576m;
    }

    @p0
    public CharSequence r() {
        return this.f47570g;
    }

    @NonNull
    public String t() {
        return this.f47566c;
    }

    public int v() {
        return this.f47578o;
    }

    @NonNull
    public CharSequence w() {
        return this.f47569f;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public Bundle x() {
        return this.f47580q;
    }

    @p0
    public UserHandle y() {
        return this.f47582s;
    }

    public boolean z() {
        return this.f47589z;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f47590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f47591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<String> f47592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map<String, Map<String, List<String>>> f47593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Uri f47594e;

        public b(@NonNull Context context, @NonNull String str) {
            e eVar = new e();
            this.f47590a = eVar;
            eVar.f47564a = context;
            eVar.f47565b = str;
        }

        @NonNull
        @e.a({"MissingGetterMatchingBuilder"})
        public b a(@NonNull String str) {
            if (this.f47592c == null) {
                this.f47592c = new HashSet();
            }
            this.f47592c.add(str);
            return this;
        }

        @NonNull
        @e.a({"MissingGetterMatchingBuilder"})
        public b b(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
            a(str);
            if (!list.isEmpty()) {
                if (this.f47593d == null) {
                    this.f47593d = new HashMap();
                }
                if (this.f47593d.get(str) == null) {
                    this.f47593d.put(str, new HashMap());
                }
                this.f47593d.get(str).put(str2, list);
            }
            return this;
        }

        @NonNull
        public e c() {
            if (TextUtils.isEmpty(this.f47590a.f47569f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            e eVar = this.f47590a;
            Intent[] intentArr = eVar.f47567d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f47591b) {
                if (eVar.f47576m == null) {
                    eVar.f47576m = new c0(eVar.f47565b);
                }
                this.f47590a.f47577n = true;
            }
            if (this.f47592c != null) {
                e eVar2 = this.f47590a;
                if (eVar2.f47575l == null) {
                    eVar2.f47575l = new HashSet();
                }
                this.f47590a.f47575l.addAll(this.f47592c);
            }
            if (this.f47593d != null) {
                e eVar3 = this.f47590a;
                if (eVar3.f47579p == null) {
                    eVar3.f47579p = new PersistableBundle();
                }
                for (String str : this.f47593d.keySet()) {
                    Map<String, List<String>> map = this.f47593d.get(str);
                    this.f47590a.f47579p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f47590a.f47579p.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f47594e != null) {
                e eVar4 = this.f47590a;
                if (eVar4.f47579p == null) {
                    eVar4.f47579p = new PersistableBundle();
                }
                this.f47590a.f47579p.putString(e.G, androidx.core.net.f.a(this.f47594e));
            }
            return this.f47590a;
        }

        @NonNull
        public b d(@NonNull ComponentName componentName) {
            this.f47590a.f47568e = componentName;
            return this;
        }

        @NonNull
        public b e() {
            this.f47590a.f47573j = true;
            return this;
        }

        @NonNull
        public b f(@NonNull Set<String> set) {
            androidx.collection.c cVar = new androidx.collection.c();
            cVar.addAll(set);
            this.f47590a.f47575l = cVar;
            return this;
        }

        @NonNull
        public b g(@NonNull CharSequence charSequence) {
            this.f47590a.f47571h = charSequence;
            return this;
        }

        @NonNull
        public b h(int i10) {
            this.f47590a.B = i10;
            return this;
        }

        @NonNull
        public b i(@NonNull PersistableBundle persistableBundle) {
            this.f47590a.f47579p = persistableBundle;
            return this;
        }

        @NonNull
        public b j(IconCompat iconCompat) {
            this.f47590a.f47572i = iconCompat;
            return this;
        }

        @NonNull
        public b k(@NonNull Intent intent) {
            return l(new Intent[]{intent});
        }

        @NonNull
        public b l(@NonNull Intent[] intentArr) {
            this.f47590a.f47567d = intentArr;
            return this;
        }

        @NonNull
        public b m() {
            this.f47591b = true;
            return this;
        }

        @NonNull
        public b n(@p0 c0 c0Var) {
            this.f47590a.f47576m = c0Var;
            return this;
        }

        @NonNull
        public b o(@NonNull CharSequence charSequence) {
            this.f47590a.f47570g = charSequence;
            return this;
        }

        @NonNull
        @Deprecated
        public b p() {
            this.f47590a.f47577n = true;
            return this;
        }

        @NonNull
        public b q(boolean z10) {
            this.f47590a.f47577n = z10;
            return this;
        }

        @NonNull
        public b r(@NonNull j0 j0Var) {
            return s(new j0[]{j0Var});
        }

        @NonNull
        public b s(@NonNull j0[] j0VarArr) {
            this.f47590a.f47574k = j0VarArr;
            return this;
        }

        @NonNull
        public b t(int i10) {
            this.f47590a.f47578o = i10;
            return this;
        }

        @NonNull
        public b u(@NonNull CharSequence charSequence) {
            this.f47590a.f47569f = charSequence;
            return this;
        }

        @NonNull
        @e.a({"MissingGetterMatchingBuilder"})
        public b v(@NonNull Uri uri) {
            this.f47594e = uri;
            return this;
        }

        @NonNull
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public b w(@NonNull Bundle bundle) {
            this.f47590a.f47580q = (Bundle) t.l(bundle);
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public b(@NonNull e eVar) {
            e eVar2 = new e();
            this.f47590a = eVar2;
            eVar2.f47564a = eVar.f47564a;
            eVar2.f47565b = eVar.f47565b;
            eVar2.f47566c = eVar.f47566c;
            Intent[] intentArr = eVar.f47567d;
            eVar2.f47567d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            eVar2.f47568e = eVar.f47568e;
            eVar2.f47569f = eVar.f47569f;
            eVar2.f47570g = eVar.f47570g;
            eVar2.f47571h = eVar.f47571h;
            eVar2.A = eVar.A;
            eVar2.f47572i = eVar.f47572i;
            eVar2.f47573j = eVar.f47573j;
            eVar2.f47582s = eVar.f47582s;
            eVar2.f47581r = eVar.f47581r;
            eVar2.f47583t = eVar.f47583t;
            eVar2.f47584u = eVar.f47584u;
            eVar2.f47585v = eVar.f47585v;
            eVar2.f47586w = eVar.f47586w;
            eVar2.f47587x = eVar.f47587x;
            eVar2.f47588y = eVar.f47588y;
            eVar2.f47576m = eVar.f47576m;
            eVar2.f47577n = eVar.f47577n;
            eVar2.f47589z = eVar.f47589z;
            eVar2.f47578o = eVar.f47578o;
            j0[] j0VarArr = eVar.f47574k;
            if (j0VarArr != null) {
                eVar2.f47574k = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
            }
            if (eVar.f47575l != null) {
                eVar2.f47575l = new HashSet(eVar.f47575l);
            }
            PersistableBundle persistableBundle = eVar.f47579p;
            if (persistableBundle != null) {
                eVar2.f47579p = persistableBundle;
            }
            eVar2.B = eVar.B;
        }

        @w0(25)
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public b(@NonNull Context context, @NonNull ShortcutInfo shortcutInfo) {
            e eVar = new e();
            this.f47590a = eVar;
            eVar.f47564a = context;
            eVar.f47565b = shortcutInfo.getId();
            eVar.f47566c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            eVar.f47567d = (Intent[]) Arrays.copyOf(intents, intents.length);
            eVar.f47568e = shortcutInfo.getActivity();
            eVar.f47569f = shortcutInfo.getShortLabel();
            eVar.f47570g = shortcutInfo.getLongLabel();
            eVar.f47571h = shortcutInfo.getDisabledMessage();
            int i10 = Build.VERSION.SDK_INT;
            eVar.A = shortcutInfo.getDisabledReason();
            eVar.f47575l = shortcutInfo.getCategories();
            eVar.f47574k = e.u(shortcutInfo.getExtras());
            eVar.f47582s = shortcutInfo.getUserHandle();
            eVar.f47581r = shortcutInfo.getLastChangedTimestamp();
            if (i10 >= 30) {
                eVar.f47583t = shortcutInfo.isCached();
            }
            eVar.f47584u = shortcutInfo.isDynamic();
            eVar.f47585v = shortcutInfo.isPinned();
            eVar.f47586w = shortcutInfo.isDeclaredInManifest();
            eVar.f47587x = shortcutInfo.isImmutable();
            eVar.f47588y = shortcutInfo.isEnabled();
            eVar.f47589z = shortcutInfo.hasKeyFieldsOnly();
            eVar.f47576m = e.p(shortcutInfo);
            eVar.f47578o = shortcutInfo.getRank();
            eVar.f47579p = shortcutInfo.getExtras();
        }
    }
}
