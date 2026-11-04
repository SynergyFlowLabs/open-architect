package androidx.browser.trusted.sharing;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e.a({"IntentName"})
    public static final String f12038e = "androidx.browser.trusted.sharing.KEY_ACTION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f12039f = "androidx.browser.trusted.sharing.KEY_METHOD";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f12040g = "androidx.browser.trusted.sharing.KEY_ENCTYPE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f12041h = "androidx.browser.trusted.sharing.KEY_PARAMS";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f12042i = "GET";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f12043j = "POST";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f12044k = "application/x-www-form-urlencoded";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f12045l = "multipart/form-data";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f12046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f12047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f12048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final c f12049d;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: renamed from: androidx.browser.trusted.sharing.b$b, reason: collision with other inner class name */
    public static final class C0044b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f12050c = "androidx.browser.trusted.sharing.KEY_FILE_NAME";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f12051d = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f12052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final List<String> f12053b;

        public C0044b(@NonNull String str, @NonNull List<String> list) {
            this.f12052a = str;
            this.f12053b = Collections.unmodifiableList(list);
        }

        @p0
        static C0044b a(@p0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(f12050c);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f12051d);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new C0044b(string, stringArrayList);
        }

        @NonNull
        Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(f12050c, this.f12052a);
            bundle.putStringArrayList(f12051d, new ArrayList<>(this.f12053b));
            return bundle;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f12054d = "androidx.browser.trusted.sharing.KEY_TITLE";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f12055e = "androidx.browser.trusted.sharing.KEY_TEXT";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f12056f = "androidx.browser.trusted.sharing.KEY_FILES";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public final String f12057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public final String f12058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final List<C0044b> f12059c;

        public c(@p0 String str, @p0 String str2, @p0 List<C0044b> list) {
            this.f12057a = str;
            this.f12058b = str2;
            this.f12059c = list;
        }

        @p0
        static c a(@p0 Bundle bundle) {
            ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f12056f);
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C0044b.a((Bundle) it.next()));
                }
            }
            return new c(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }

        @NonNull
        Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f12057a);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f12058b);
            if (this.f12059c != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator<C0044b> it = this.f12059c.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b());
                }
                bundle.putParcelableArrayList(f12056f, arrayList);
            }
            return bundle;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface d {
    }

    public b(@NonNull String str, @p0 String str2, @p0 String str3, @NonNull c cVar) {
        this.f12046a = str;
        this.f12047b = str2;
        this.f12048c = str3;
        this.f12049d = cVar;
    }

    @p0
    public static b a(@NonNull Bundle bundle) {
        String string = bundle.getString(f12038e);
        String string2 = bundle.getString(f12039f);
        String string3 = bundle.getString(f12040g);
        c cVarA = c.a(bundle.getBundle(f12041h));
        if (string != null && cVarA != null) {
            return new b(string, string2, string3, cVarA);
        }
        return null;
    }

    @NonNull
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f12038e, this.f12046a);
        bundle.putString(f12039f, this.f12047b);
        bundle.putString(f12040g, this.f12048c);
        bundle.putBundle(f12041h, this.f12049d.b());
        return bundle;
    }
}
