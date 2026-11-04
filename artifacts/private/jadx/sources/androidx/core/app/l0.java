package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f47070h = "android.remoteinput.results";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f47071i = "android.remoteinput.resultsData";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f47072j = "android.remoteinput.dataTypeResultsData";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f47073k = "android.remoteinput.resultsSource";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f47074l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f47075m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f47076n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f47077o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f47078p = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f47080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f47081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f47082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f47083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f47084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<String> f47085g;

    @w0(20)
    static class a {
        private a() {
        }

        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(l0 l0Var) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(l0Var.o()).setLabel(l0Var.n()).setChoices(l0Var.h()).setAllowFreeFormInput(l0Var.f()).addExtras(l0Var.m());
            Set<String> setG = l0Var.g();
            if (setG != null) {
                Iterator<String> it = setG.iterator();
                while (it.hasNext()) {
                    b.d(builderAddExtras, it.next(), true);
                }
            }
            d.b(builderAddExtras, l0Var.k());
            return builderAddExtras.build();
        }

        static l0 c(Object obj) {
            RemoteInput remoteInput = (RemoteInput) obj;
            e eVarA = new e(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            Set<String> setB = b.b(remoteInput);
            if (setB != null) {
                Iterator<String> it = setB.iterator();
                while (it.hasNext()) {
                    eVarA.d(it.next(), true);
                }
            }
            eVarA.g(d.a(remoteInput));
            return eVarA.b();
        }

        static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    @w0(26)
    static class b {
        private b() {
        }

        static void a(l0 l0Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(l0.c(l0Var), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    @w0(28)
    static class c {
        private c() {
        }

        static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        static void b(Intent intent, int i10) {
            RemoteInput.setResultsSource(intent, i10);
        }
    }

    @w0(29)
    static class d {
        private d() {
        }

        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f47086a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f47089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence[] f47090e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<String> f47087b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f47088c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f47091f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f47092g = 0;

        public e(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f47086a = str;
        }

        @NonNull
        public e a(@NonNull Bundle bundle) {
            if (bundle != null) {
                this.f47088c.putAll(bundle);
            }
            return this;
        }

        @NonNull
        public l0 b() {
            return new l0(this.f47086a, this.f47089d, this.f47090e, this.f47091f, this.f47092g, this.f47088c, this.f47087b);
        }

        @NonNull
        public Bundle c() {
            return this.f47088c;
        }

        @NonNull
        public e d(@NonNull String str, boolean z10) {
            if (z10) {
                this.f47087b.add(str);
                return this;
            }
            this.f47087b.remove(str);
            return this;
        }

        @NonNull
        public e e(boolean z10) {
            this.f47091f = z10;
            return this;
        }

        @NonNull
        public e f(@androidx.annotation.p0 CharSequence[] charSequenceArr) {
            this.f47090e = charSequenceArr;
            return this;
        }

        @NonNull
        public e g(int i10) {
            this.f47092g = i10;
            return this;
        }

        @NonNull
        public e h(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47089d = charSequence;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface g {
    }

    l0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f47079a = str;
        this.f47080b = charSequence;
        this.f47081c = charSequenceArr;
        this.f47082d = z10;
        this.f47083e = i10;
        this.f47084f = bundle;
        this.f47085g = set;
        if (k() == 2 && !f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(@NonNull l0 l0Var, @NonNull Intent intent, @NonNull Map<String, Uri> map) {
        b.a(l0Var, intent, map);
    }

    public static void b(@NonNull l0[] l0VarArr, @NonNull Intent intent, @NonNull Bundle bundle) {
        a.a(d(l0VarArr), intent, bundle);
    }

    @w0(20)
    static RemoteInput c(l0 l0Var) {
        return a.b(l0Var);
    }

    @w0(20)
    static RemoteInput[] d(l0[] l0VarArr) {
        if (l0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[l0VarArr.length];
        for (int i10 = 0; i10 < l0VarArr.length; i10++) {
            remoteInputArr[i10] = c(l0VarArr[i10]);
        }
        return remoteInputArr;
    }

    @w0(20)
    static l0 e(RemoteInput remoteInput) {
        return a.c(remoteInput);
    }

    private static Intent i(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f47070h)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    @androidx.annotation.p0
    public static Map<String, Uri> j(@NonNull Intent intent, @NonNull String str) {
        return b.c(intent, str);
    }

    private static String l(String str) {
        return f47072j + str;
    }

    @androidx.annotation.p0
    public static Bundle p(@NonNull Intent intent) {
        return a.d(intent);
    }

    public static int q(@NonNull Intent intent) {
        return c.a(intent);
    }

    public static void s(@NonNull Intent intent, int i10) {
        c.b(intent, i10);
    }

    public boolean f() {
        return this.f47082d;
    }

    @androidx.annotation.p0
    public Set<String> g() {
        return this.f47085g;
    }

    @androidx.annotation.p0
    public CharSequence[] h() {
        return this.f47081c;
    }

    public int k() {
        return this.f47083e;
    }

    @NonNull
    public Bundle m() {
        return this.f47084f;
    }

    @androidx.annotation.p0
    public CharSequence n() {
        return this.f47080b;
    }

    @NonNull
    public String o() {
        return this.f47079a;
    }

    public boolean r() {
        if (f()) {
            return false;
        }
        return ((h() != null && h().length != 0) || g() == null || g().isEmpty()) ? false : true;
    }
}
