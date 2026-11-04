package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f47098a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f47099b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f47100c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f47101d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f47102e = ".sharecompat_";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final Context f47103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final Intent f47104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f47105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList<String> f47106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList<String> f47107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList<String> f47108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList<Uri> f47109g;

        public a(@NonNull Context context) {
            Activity activity;
            this.f47103a = (Context) androidx.core.util.t.l(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f47104b = action;
            action.putExtra(n0.f47098a, context.getPackageName());
            action.putExtra(n0.f47099b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f47104b.putExtra(n0.f47100c, componentName);
                this.f47104b.putExtra(n0.f47101d, componentName);
            }
        }

        private void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f47104b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f47104b.putExtra(str, strArr);
        }

        private void i(@androidx.annotation.p0 String str, @NonNull String[] strArr) {
            Intent intentM = m();
            String[] stringArrayExtra = intentM.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intentM.putExtra(str, strArr2);
        }

        @NonNull
        @Deprecated
        public static a k(@NonNull Activity activity) {
            return new a(activity);
        }

        @NonNull
        public a a(@NonNull String str) {
            if (this.f47108f == null) {
                this.f47108f = new ArrayList<>();
            }
            this.f47108f.add(str);
            return this;
        }

        @NonNull
        public a b(@NonNull String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            if (this.f47107e == null) {
                this.f47107e = new ArrayList<>();
            }
            this.f47107e.add(str);
            return this;
        }

        @NonNull
        public a d(@NonNull String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            if (this.f47106d == null) {
                this.f47106d = new ArrayList<>();
            }
            this.f47106d.add(str);
            return this;
        }

        @NonNull
        public a f(@NonNull String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @NonNull
        public a g(@NonNull Uri uri) {
            if (this.f47109g == null) {
                this.f47109g = new ArrayList<>();
            }
            this.f47109g.add(uri);
            return this;
        }

        @NonNull
        public Intent j() {
            return Intent.createChooser(m(), this.f47105c);
        }

        @NonNull
        Context l() {
            return this.f47103a;
        }

        @NonNull
        public Intent m() {
            ArrayList<String> arrayList = this.f47106d;
            if (arrayList != null) {
                h("android.intent.extra.EMAIL", arrayList);
                this.f47106d = null;
            }
            ArrayList<String> arrayList2 = this.f47107e;
            if (arrayList2 != null) {
                h("android.intent.extra.CC", arrayList2);
                this.f47107e = null;
            }
            ArrayList<String> arrayList3 = this.f47108f;
            if (arrayList3 != null) {
                h("android.intent.extra.BCC", arrayList3);
                this.f47108f = null;
            }
            ArrayList<Uri> arrayList4 = this.f47109g;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                this.f47104b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f47109g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f47104b.removeExtra("android.intent.extra.STREAM");
                    this.f47104b.setClipData(null);
                    Intent intent = this.f47104b;
                    intent.setFlags(intent.getFlags() & (-2));
                } else {
                    this.f47104b.putExtra("android.intent.extra.STREAM", this.f47109g.get(0));
                    n0.g(this.f47104b, this.f47109g);
                }
            } else {
                this.f47104b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f47104b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f47109g);
                n0.g(this.f47104b, this.f47109g);
            }
            return this.f47104b;
        }

        @NonNull
        public a n(@f1 int i10) {
            return o(this.f47103a.getText(i10));
        }

        @NonNull
        public a o(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47105c = charSequence;
            return this;
        }

        @NonNull
        public a p(@androidx.annotation.p0 String[] strArr) {
            this.f47104b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @NonNull
        public a q(@androidx.annotation.p0 String[] strArr) {
            this.f47104b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @NonNull
        public a r(@androidx.annotation.p0 String[] strArr) {
            if (this.f47106d != null) {
                this.f47106d = null;
            }
            this.f47104b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @NonNull
        public a s(@androidx.annotation.p0 String str) {
            this.f47104b.putExtra(androidx.core.content.f.f47494b, str);
            if (!this.f47104b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @NonNull
        public a t(@androidx.annotation.p0 Uri uri) {
            this.f47109g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @NonNull
        public a u(@androidx.annotation.p0 String str) {
            this.f47104b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @NonNull
        public a v(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47104b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @NonNull
        public a w(@androidx.annotation.p0 String str) {
            this.f47104b.setType(str);
            return this;
        }

        public void x() {
            this.f47103a.startActivity(j());
        }
    }

    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f47110f = "IntentReader";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final Context f47111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final Intent f47112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private final String f47113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private final ComponentName f47114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList<Uri> f47115e;

        public b(@NonNull Activity activity) {
            this((Context) androidx.core.util.t.l(activity), activity.getIntent());
        }

        @NonNull
        @Deprecated
        public static b a(@NonNull Activity activity) {
            return new b(activity);
        }

        @androidx.annotation.p0
        public ComponentName b() {
            return this.f47114d;
        }

        @androidx.annotation.p0
        public Drawable c() {
            if (this.f47114d == null) {
                return null;
            }
            try {
                return this.f47111a.getPackageManager().getActivityIcon(this.f47114d);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @androidx.annotation.p0
        public Drawable d() {
            if (this.f47113c == null) {
                return null;
            }
            try {
                return this.f47111a.getPackageManager().getApplicationIcon(this.f47113c);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @androidx.annotation.p0
        public CharSequence e() {
            if (this.f47113c == null) {
                return null;
            }
            PackageManager packageManager = this.f47111a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f47113c, 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @androidx.annotation.p0
        public String f() {
            return this.f47113c;
        }

        @androidx.annotation.p0
        public String[] g() {
            return this.f47112b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @androidx.annotation.p0
        public String[] h() {
            return this.f47112b.getStringArrayExtra("android.intent.extra.CC");
        }

        @androidx.annotation.p0
        public String[] i() {
            return this.f47112b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @androidx.annotation.p0
        public String j() {
            String stringExtra = this.f47112b.getStringExtra(androidx.core.content.f.f47494b);
            if (stringExtra == null) {
                CharSequence charSequenceO = o();
                if (charSequenceO instanceof Spanned) {
                    return Html.toHtml((Spanned) charSequenceO);
                }
                if (charSequenceO != null) {
                    return Html.escapeHtml(charSequenceO);
                }
            }
            return stringExtra;
        }

        @androidx.annotation.p0
        public Uri k() {
            return (Uri) this.f47112b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @androidx.annotation.p0
        public Uri l(int i10) {
            if (this.f47115e == null && q()) {
                this.f47115e = this.f47112b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f47115e;
            if (arrayList != null) {
                return arrayList.get(i10);
            }
            if (i10 == 0) {
                return (Uri) this.f47112b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i10);
        }

        public int m() {
            if (this.f47115e == null && q()) {
                this.f47115e = this.f47112b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f47115e;
            return arrayList != null ? arrayList.size() : this.f47112b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @androidx.annotation.p0
        public String n() {
            return this.f47112b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @androidx.annotation.p0
        public CharSequence o() {
            return this.f47112b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @androidx.annotation.p0
        public String p() {
            return this.f47112b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f47112b.getAction());
        }

        public boolean r() {
            String action = this.f47112b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.f47112b.getAction());
        }

        public b(@NonNull Context context, @NonNull Intent intent) {
            this.f47111a = (Context) androidx.core.util.t.l(context);
            this.f47112b = (Intent) androidx.core.util.t.l(intent);
            this.f47113c = n0.f(intent);
            this.f47114d = n0.d(intent);
        }
    }

    private n0() {
    }

    @Deprecated
    public static void a(@NonNull Menu menu, @androidx.annotation.d0 int i10, @NonNull a aVar) {
        MenuItem menuItemFindItem = menu.findItem(i10);
        if (menuItemFindItem != null) {
            b(menuItemFindItem, aVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i10 + " in the supplied menu");
    }

    @Deprecated
    public static void b(@NonNull MenuItem menuItem, @NonNull a aVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(aVar.l()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f47102e + aVar.l().getClass().getName());
        shareActionProvider.setShareIntent(aVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @androidx.annotation.p0
    public static ComponentName c(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? d(intent) : callingActivity;
    }

    @androidx.annotation.p0
    static ComponentName d(@NonNull Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f47100c);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f47101d) : componentName;
    }

    @androidx.annotation.p0
    public static String e(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        if (callingPackage == null && intent != null) {
            callingPackage = f(intent);
        }
        return callingPackage;
    }

    @androidx.annotation.p0
    static String f(@NonNull Intent intent) {
        String stringExtra = intent.getStringExtra(f47098a);
        return stringExtra == null ? intent.getStringExtra(f47099b) : stringExtra;
    }

    static void g(@NonNull Intent intent, @NonNull ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(androidx.core.content.f.f47494b), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i10 = 1; i10 < size; i10++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i10)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
